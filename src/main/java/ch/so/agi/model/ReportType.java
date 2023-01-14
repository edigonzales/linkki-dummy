package ch.so.agi.model;

public enum ReportType {
    BUG,
    IMPROVEMENT,
    QUESTION;

    public String getName() {
        String name = name();
        return name.substring(0, 1) + name.substring(1).toLowerCase();
    }
}
