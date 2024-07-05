import com.example.model.Student;
import com.example.model.Teacher;
import com.example.service.SchoolService;

public class Main {
    public static void main(String[] args) {

        Student stu1 = new Student("小林", 22, "S1234");
        Student stu2 = new Student("寺本", 22, "S5678");
        Teacher tea1 = new Teacher("三輪", 22, "T9876");

        SchoolService schoolService = new SchoolService();

        schoolService.addStudent(stu1);
        schoolService.addStudent(stu2);
        schoolService.addTeacher(tea1);

        schoolService.displayAll();
    }
}