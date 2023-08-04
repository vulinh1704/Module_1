class Student {
    name;
    age;
    point;

    constructor(nameInput, ageInput, pointInput) {
        this.name = nameInput;
        this.age = ageInput;
        this.point = pointInput;
    }

    getName() {
        return this.name;
    }
    setName(nameInput) {
        this.name = nameInput;
    }

    getAvgPoint() {
        let sum = 0;
        for (let i = 0; i < this.point.length; i++) {
            sum += this.point[i];
        }

        let avg = sum/this.point.length;
        return avg;
    }

    getInfo() {
        return this.getName() + ' - ' + this.getAvgPoint();
    }
}

function main() {
    let sinhVien1 = new Student("Lộc", 20, [8,9,6])
    let sinhVien2 = new Student("Đề", 21, [10,9,6])

    // console.log(sinhVien1.getInfo())
    // console.log(sinhVien2.getInfo())
    if(sinhVien1.getAvgPoint() > sinhVien2.getAvgPoint()) {
        console.log(sinhVien1.getInfo())
    } else {
        console.log(sinhVien2.getInfo())
    }
}

main()


