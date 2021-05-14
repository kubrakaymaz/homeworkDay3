public class Main {
    public static void main(String[] args) {
        Student student1=new Student();
        student1.setStudentId(25635);
        student1.setFullName("Kübra KAYMAZ");
        student1.setEmail("kbkaymaz123@gmail.com");
        student1.setPassword("5693852");
        String[] courses={"C#-Angular","React&Java"};
        student1.setCourses(courses);
        System.out.println(student1.getFullName());

        StudentManager studentManager=new StudentManager();
        studentManager.loginToCourse(courses[0]);
        studentManager.deleteCourse(courses[1]);
        studentManager.addHomeworkLink();

        System.out.println("------------");

        UserManager userManager=new UserManager();
        userManager.addComment();

        System.out.println("------------");

        Instructor instructor=new Instructor();
        instructor.setFullName("Engin DEMİROĞ");
        instructor.setEmail("engindemirog@gmail.com");
        System.out.println(instructor.getFullName());
        InstructorManager instructorManager=new InstructorManager();
        instructorManager.addLecture();
        instructorManager.addHomework();
    }
}
