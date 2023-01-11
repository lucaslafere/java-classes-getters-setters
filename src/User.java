public class User {
    String name;
    String email;
    String college;
    Subjects subjects = new Subjects();

    public String getName() {
        return this.name;
    }
    public String getEmail() {
        return this.email;
    }
    public String getCollege() {
        return this.college;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setCollege(String college) {
        this.college = college;
    }
}
