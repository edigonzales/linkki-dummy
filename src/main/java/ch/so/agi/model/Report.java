package ch.so.agi.model;

public class Report {
    private Integer id;
    private String description;
    private ReportType type;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public ReportType getType() {
        return type;
    }
    public void setType(ReportType type) {
        this.type = type;
    }
    
    public void save() {
        System.out.println("SAVE");
    }
}
