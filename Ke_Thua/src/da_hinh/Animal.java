package da_hinh;

public class Animal { // Từ khóa final trước class sẽ không cho phép lớp nào kế thừa
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void go() { // final đặt trước mathod thì không cho phép lớp con ghi đè
        System.out.println("Animal đang đi");
    }
}

class Dog extends Animal {
    private String color;

    public Dog(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void go() { // Ghi đè phương thức
        System.out.println("Chó đang đi");
    }

    public void bark() {
        System.out.println("Sủa");
    }
}

class Main {
    public static void main(String[] args) {
        // Dog dog = new Dog("Lộc", 22, "Trắng");
        // dog.go();
              Animal dog = new Dog("Lộc", 22, "Trắng");
              Animal animal = new Animal("Lộc2", 33);
        //  Kiểu khai báo     Kiểu thực tế
        dog.go(); // Chó đang đi
        System.out.println(animal instanceof Dog);
    }
}

// Ghi đè phương thức là phương thức cùng tên, kiểu dữ liệu trả về, cùng tham số truyền vào và khác nhau về Khối lệnh thực thi bên trong
// Xảy ra trong mối quan hệ kế thừa
// Thể hiện tính đa hình lúc runtime (khi chạy)


// Tất cả các lớp trong Java được kế thừa từ lớp Object.
