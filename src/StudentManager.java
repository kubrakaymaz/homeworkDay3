public class StudentManager extends UserManager{

    public void addHomeworkLink(){
        System.out.println("Github linki sisteme yüklendi.");

    }
    public void loginToCourse(String message){
        System.out.println(message + " kursuna kayıt olundu." );
    }
    public void deleteCourse(String message){
        System.out.println(message + " kursu listeden silindi.");
    }
}
