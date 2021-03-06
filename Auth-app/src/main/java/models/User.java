package models;

public class User {
    private long id;
    private String name; 
    private String role;
    private String officeName;
    private String schema;
    private boolean active;
    private String newPassword;

    public User(){}

    public User(long id, String name, String role, String officeName, String schema) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.officeName = officeName;
        this.schema = schema;
        this.active = true;
    }
    
    public User(long id, String name, String role, String officeName, String schema, boolean active) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.officeName = officeName;
        this.schema = schema;
        this.active = active;
    }
    
    public User(LoginUser loginUser){
        this.id = loginUser.getId();
        this.name = loginUser.getName();
        this.role = loginUser.getRole().getName();
        this.officeName = loginUser.getOffice().getName();
        this.schema = loginUser.getOffice().getSchema();
        this.active = loginUser.isActive();
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }   
}

