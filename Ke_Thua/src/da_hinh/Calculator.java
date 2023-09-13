package da_hinh;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1, 2)); // GỌi hàm dòng 5
        System.out.println(calculator.add(5.4, 4.3)); // Gọi dòng số 9

    }
}
// Nạp chồng: là các phương thức cùng tên, khác tham số truyền vào (kiểu dữ liệu hoặc số lượng tham số)
// Xảy ra trong cùng 1 class
// Thể hiện tính chất đa hình lúc compile time (biên dịch)