package POJO;

public class User {
    private Integer id;
    private String username;
    private String password;
    private Integer sex;
    private String name;
    private String grade;
    private String createdate;


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getName() {
        return name;
    }
    public Integer getSex() {
        return sex;
    }
    public void setSex(Integer sex) {
        this.sex = sex;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    public String getCreatedate() {
        return createdate;
    }
    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }
    @Override
    public String toString(){
        return "ID:"+this.getId()+"\tName:"+this.getName()+"\tUsername:"+this.getUsername()+"\tPassword:"+this.getPassword();
    }
}
