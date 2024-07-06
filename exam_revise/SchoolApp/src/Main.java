import com.example.model.Student;
import com.example.model.Teacher;
import com.example.service.SchoolService;

public class Main {
    public static void main(String[] args) {

        //オブジェクト作成
        Student s1 = new Student("koba" , 22 , "透視能力");
        Student s2 = new Student("tera" , 22 , "超能力");
        Teacher t1 = new Teacher("miwa" , 22 , "すり抜け");
        Teacher t2 = new Teacher("saka" , 9 , "愛嬌");

        SchoolService schoolService = new SchoolService();


        //リストに追加するメソッド
        schoolService.addStudent(s1);
        schoolService.addStudent(s2);
        schoolService.addTeacher(t1);
        schoolService.addTeacher(t2);

        //「SchoolService」クラスの各リストの内容を表示するメソッド
        schoolService.start();
    }
}