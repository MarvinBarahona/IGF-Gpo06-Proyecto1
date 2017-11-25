package models;

public class User {
    private long id;
    private String name; 
    private String role;
    private String officeName;
    private String schema;

    public User(){}

    public User(long id, String name, String role, String officeName, String schema) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.officeName = officeName;
        this.schema = schema;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }
    
}
