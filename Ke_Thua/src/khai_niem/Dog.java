package khai_niem;

public class Dog extends Animal{ // Sử dụng extends để kế thừa
    private String color;
    private String name;


    public Dog(String name, int age, String color) {
        super(name, age); // Lộc
        this.name = "Lộc 2"; // Lộc 2
        // Gọi đến constructor có tham số tương ứng của cha (dòng 8 của lớp khai_niem.Animal), và BẮT BUỘC là dòng lệnh đầu tiên
        // Sử dụng để khởi tạo dữ liệu (name, age) của lớp cha (khai_niem.Animal) cho lớp con (khai_niem.Dog) sử dụng
        // Nếu lớp cha có constructor không tham số thì nó sẽ tự động sử dụng supper();
        // Không thể sử dụng chung this() với super() vì cả 2 đều phải đặt dòng đầu tiên;
        this.color = color;
        // System.out.println("Constructor dog");

    }

    public Dog(String name, String color) {
        super(name);
        this.color = color;
    }

    public void bark() {
        System.out.println(this.getName() + " gâu gâu");
    }

    public String getColor() {
        return this.color;
    }

    public String getName2() {
        return this.name;
    }

    public String getName() {
        return super.name;
        //super. sử dụng để Phân biệt thuộc tính hoặc phương của lớp cha với lớp con
    }

    public void setColor(String color) {
        this.color = color;
    }
}

/*
 Lớp con kế thừa tất cả thuộc tính và phương thức của lớp cha (trừ private)
 Lớp con có thể khai báo thêm các thuộc tính và phương mới.
 Java chỉ cho phép đơn kế thừa
 */
