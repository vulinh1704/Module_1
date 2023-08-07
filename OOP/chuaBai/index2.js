class Rectangle{
    width;
    height;
    S;
    P;

    constructor(widthInput, heightInput) {
        this.width = widthInput;
        this.height = heightInput;
    }
    getWidth() {
        return this.width;
    }

    getInfo() {
        return `Chieu dai: ${this.width} và Chiều rộng: ${this.height}`;
    }

    calS() {
        this.S = this.width * this.height
        return this.S;
    }

    calP() {
        this.P = (this.height + this.width) * 2
        return this.P;
    }
}

function main() {
    let r = new Rectangle(5, 4);
    let html = r.getInfo();
    html += ` và Dien tich: ${r.calS()} va Chu Vi: ${r.calP()}`;
    document.getElementById("result").innerHTML = html;
}

main();