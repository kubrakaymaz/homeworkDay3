public class User {
    private String fullName;
    private String email;
    private String password;
    private String[] courses;

    public User(){

    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String[] getCourses(){
        return courses;
    }
    public void setCourses(String[] courses){
        this.courses=courses;
    }
    public String getFullName(){
        return fullName;
    }
    public void setFullName(String fullName){
        this.fullName=fullName;
    }

    public User(String email,String password,String[] courses,String fullName){
        this();
        this.email=email;
        this.password=password;
        this.courses=courses;
        this.fullName=fullName;
    }

}
