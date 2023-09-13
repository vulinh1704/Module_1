package khai_niem;

public class Animal {
    protected String name; // = null
    private int age; // = 0

    public Animal() {
    }

    public Animal(String name, int age) {
         //this(name); // Gọi đến constructor có tham số tương ứng (dòng 13) phải đặt ở đầu constructor này
        this.name = name;
        this.age = age;
//        System.out.println("Constructor animal");
    }

    public Animal(String name) {
        System.out.println("Constructor name");
        this.name = name;
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

    public void run() {
        System.out.println(this.name + " đang chạy");
    }

    public static void main(String[] args) {
        Animal a = new Animal("Đề", 22);
    }
}

/*
    this: phân biệt biến toàn cục và cục bộ và đại diện cho đối tượng đang sử dụng lớp
 */
