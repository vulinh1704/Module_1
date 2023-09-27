import java.util.HashMap;
import java.util.Map;

class Student {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class StudentManager {
    Map<Integer, Student> studentMap = new HashMap<>();

    public void add(Student newStudent) {
        studentMap.put(newStudent.getId(), newStudent);
    }
    public void delete(int id) {
        studentMap.remove(id);
    }

    public void display() {
        for (Integer key: studentMap.keySet()) {
            System.out.println(studentMap.get(key));
        }
    }
}

class Main2 {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Linh", 45);
        Student student2 = new Student(2, "Dân", 5);
        Student student3 = new Student(3, "Đề", 5);

        StudentManager studentManager = new StudentManager();
        studentManager.add(student1);
        studentManager.add(student2);
        studentManager.add(student3);
         //studentManager.delete(3);

        Student student4 = new Student(3, "Mai", 5);
        studentManager.add(student4);
        studentManager.display();
    }
}



public class Demo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Dân");
        map.put(655, "Linh");
        map.put(1, "Hiếu");
        map.remove(1);
//        System.out.println(map.get(655));
//        System.out.println(map.keySet());
        for (Integer key : map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}
