// Đối tượng: Các thực thể ngoài thực tế. Ví dụ: 1 cái ô tô, con người, cái quạt
// OOP (object oriented programing): Lập trình hướng đối tượng: là một phương pháp lập trình
// So sánh với lập trình hướng cấu trúc


// Class => constructor, thuộc tính(đặc điểm), phương thức (hành động).
// Đối tượng

// Class: Là một cái khung để tạo ra các đối tượng (mô tả chung của đối tượng)
// Thuộc tính: Các đặc điểm của đối tượng.
// Phương thức: hành động mà đối tượng có thể thực hiện được. (học, chơi, code,...)

// constructor: một phương thức để thực hiện tạo ra các đối tượng
// đối tượng: chính là các thực thể tạo ra từ class ( khởi tạo bằng từ khóa new)

class Student {
    name;
    age;

    constructor(nameInput, ageInput) {
        this.name = nameInput;
        this.age = ageInput;
    }

    play() { // phương thức trong class thì không cần từ khóa function
        alert(this.name + " đang chơi!!!!")
    }

    //getter
    getName() {
        return this.name;
    }

    //setter
    setName(nameInput) {
        this.name = nameInput;
    }

}

let sinhVien1 = new Student("Dân", 20);
// sinhVien1.play();
sinhVien1.setName("Linh");
alert(sinhVien1.getName());

let sinhVien2 = new Student("Hiếu", 18);
sinhVien2.play();