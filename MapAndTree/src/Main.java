import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        checkMax();
//        checkTriangle();
        ricePaperRolls();

    }
    public static void checkTriangle(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a");
        int a = input.nextInt();
        System.out.println("Enter number b");
        int b = input.nextInt();
        System.out.println("Enter number c");
        int c = input.nextInt();
        if (a>0&& b>0&& c>0&&a+b>c&&a+c>b&& b+c>a){
            if (a==b|| b==c || c==a){
                System.out.println("là tam giác cân");
            }
            if (a==b&& b==c){
                System.out.println("là tam giác đều");
            }
            if (a*a+b*b==c*c|| a*a+c*c==b*b|| b*b+c*c==a*a){
                System.out.println("là tam giác vuông");

            }
        } else {
            System.out.println("đây không phải là tam giác");
        }


    }

    public static void checkMax() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number a");
        int a = input.nextInt();
        System.out.println("Enter number b");
        int b = input.nextInt();
        System.out.println("Enter number c");
        int c = input.nextInt();
        int max = a;
        if (max < b) {
            max = b;
        }

        if (max < c) {
            max = c;
        }
        System.out.println(max);
    }

    public static void check() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Số này là số chẵn");
        } else {
            System.out.println("Số này là số lẻ");
        }
    }

    public static void ricePaperRolls() {
        int num = 50;
        if (num > 0) {
            if (num <= 9) {
                System.out.println(1);
            } else {
                System.out.println("Số lần phải rán " + num / 9);
            }
        }
    }
}
