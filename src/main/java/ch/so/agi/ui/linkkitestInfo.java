package ch.so.agi.ui;

import java.time.Year;

import org.linkki.framework.ui.application.ApplicationInfo;

public class linkkitestInfo implements ApplicationInfo {

    public static final String APPLICATION_NAME = "linkkitest";

    @Override
    public String getApplicationName() {
        return APPLICATION_NAME;
    }

    @Override
    public String getApplicationVersion() {
        return "1.0";
    }

    @Override
    public String getApplicationDescription() {
        return "linkkitest";
    }

    @Override
    public String getCopyright() {
        return "© Faktor Zehn " + Year.now();
    }
}