package ch.so.agi.view;

import static java.util.Objects.requireNonNull;

import org.linkki.core.pmo.ModelObject;
import org.linkki.core.ui.element.annotation.UIButton;
import org.linkki.core.ui.element.annotation.UIComboBox;
import org.linkki.core.ui.element.annotation.UITextArea;
import org.linkki.core.ui.layout.annotation.UISection;
import org.linkki.core.defaults.ui.aspects.types.AvailableValuesType;
import org.linkki.core.defaults.ui.aspects.types.EnabledType;
import org.linkki.core.defaults.ui.aspects.types.RequiredType;

import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;

import ch.so.agi.model.Report;

@UISection
public class ReportSectionPmo {

    private final Report report;

    public ReportSectionPmo(Report report) {
        this.report = requireNonNull(report, "report must not be null");
    }

    
    @ModelObject
    public Report getReport() {
        return report;
    }
    
    @UITextArea(position = 10, label = "Description", modelAttribute = "description", required = RequiredType.REQUIRED, height = "8em", width = "50em")
    public void description() {
        // Use description from report (model object) directly
    }

    @UIComboBox(position = 20, label = "Type", modelAttribute = "type", required = RequiredType.REQUIRED, content = AvailableValuesType.ENUM_VALUES_EXCL_NULL)
    public void type() {
        // - bind value to the property "type" from report
        // - use enum constants from ReportType as available values
    }
    
    @UIButton(position = 30, caption = "Send", icon = VaadinIcon.PAPERPLANE, showIcon = true, enabled = EnabledType.DYNAMIC)
    public void send() {
        report.save();

        Notification notification = new Notification(
                new Span(String.format("Report with id %d filed!", report.getId())),
                new Span("Thank you for reporting!"));
        notification.setPosition(Position.TOP_CENTER);
        notification.setDuration(3000);
        notification.open();
    }

    /**
     * Enable button only if description and type is present.
     *
     * @return {@code true} if button is enabled otherwise {@code false}
     */
    public boolean isSendEnabled() {
        String description = report.getDescription();
        return description != null && !description.isEmpty()
                && report.getType() != null;
    }

}
