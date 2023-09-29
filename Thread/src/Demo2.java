import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
//        String str1 = new String("abc");
//        String str2 = new String("abc");
//        String str3 = "abc";
//        String str4 = "abc";
//        System.out.println(str4 == str3); // true
//        System.out.println(str1.equals(str2)); // false
//        System.out.println(str1 == str3);

        String a = "Xin chào C07";
        System.out.println(Arrays.toString(a.split("")));
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println(a.substring(0, 3));
        System.out.println(a);
        System.out.println(a.indexOf('X'));
        System.out.println(a.contains("Xi"));

//        StringBuilder a = new StringBuilder("abc");
//        a.append("d");
//        System.out.println(a);
    }
}


class Demo3 {
    private static final String DATE_REGEX = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    private static Scanner input = new Scanner(System.in);
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static void main(String[] args) {
        boolean checkRegex;
        do {
            System.out.println("Nhập ngày: ");
            String date = input.nextLine();
            checkRegex = date.matches(DATE_REGEX);
            if(!checkRegex) {
                System.out.println(ANSI_YELLOW + "Nhập theo định dạng dd/mm/yy");
            }
        } while (!checkRegex);
    }
}
