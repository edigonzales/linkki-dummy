package ch.so.agi.view;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.linkki.framework.ui.component.Headline;
import ch.so.agi.ui.linkkitestLayout;

//@PageTitle("linkkitest")
//@Route(value = "", layout = linkkitestLayout.class)
public class linkkitestView extends VerticalLayout {

    private static final long serialVersionUID = 1L;

    public linkkitestView() {
        add(new Headline("linkkitest"));
        setSizeFull();
        linkkitestPage page = new linkkitestPage();
        page.init();
        add(page);
    }
}