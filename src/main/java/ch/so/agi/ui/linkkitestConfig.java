package ch.so.agi.ui;

import org.linkki.framework.ui.application.ApplicationConfig;
import org.linkki.framework.ui.application.menu.ApplicationMenuItemDefinition;
import org.linkki.util.Sequence;

public class linkkitestConfig implements ApplicationConfig {

    @Override
    public linkkitestInfo getApplicationInfo() {
        return new linkkitestInfo();
    }

    @Override
    public Sequence<ApplicationMenuItemDefinition> getMenuItemDefinitions() {
        return Sequence.empty();
    }

}