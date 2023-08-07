class Student { // Pascal case
    name; // THuộc tính
    age;

    constructor(nameInput, ageInput) { // Hàm tạo
        this.name = nameInput;
        this.age = ageInput;
    }

    study() { // Là 1 method (phương thức của student - không cần từ khóa function)
        return this.name + " Đang học."
    }

    getName() {  // getter: Lấy ra dữ liệu
        return this.name;
    }

    setName(nameInput) { // setter: Sửa dữ liệu
        this.name = nameInput;
    }
}

// Student: là một lớp mô tả cho đối tượng học viên
// Constructor: Hàm tạo, dùng để khởi tạo các đối tượng

let sinhVien = new Student("Dân", 27);
//alert(sinhVien.name + sinhVien.age) // Cách truy xuất thuộc tính (đặc điểm) của đối tượng.
// alert(sinhVien.study()) // Cách truy xuất phương thức của đối tượng

let sinhVien2 = new Student("Hiếu", 18);
alert(sinhVien2.getName());
sinhVien2.setName('Linh');
alert(sinhVien2.getName());