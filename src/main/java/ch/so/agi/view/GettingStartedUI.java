package ch.so.agi.view;

import org.linkki.core.binding.BindingContext;
import org.linkki.core.ui.creation.VaadinUiCreator;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

import ch.so.agi.model.Report;

@Route("")
public class GettingStartedUI extends Div {
    private static final long serialVersionUID = 1L;

    public GettingStartedUI() {
        UI.getCurrent().getPage().setTitle("linkki :: Getting Started");
        Component section = VaadinUiCreator.createComponent(new ReportSectionPmo(new Report()),
                                                            new BindingContext("report-context"));

        add(section);
    }

}
