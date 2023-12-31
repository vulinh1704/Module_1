import netscape.javascript.JSUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//
        System.out.println(kangaroo(0, 2, 5, 3));
    }

    public static String timeConversion(String s) {
        // Write your code here
        String[] chars = s.split("");
        String time = chars[chars.length - 2] + chars[chars.length - 1];
        int hour = Integer.parseInt(chars[0] + chars[1]);
        if (time.equals("AM")) {
            if (hour == 12) {
                return "00" + s.substring(2, s.length() - 2);
            }
            return s.substring(0, s.length() - 2);
        } else {
            if (hour == 12) {
                return s.substring(0, s.length() - 2);
            }
            hour = hour + 12;
            return hour + s.substring(2, s.length() - 2);
        }
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        for (int j = 0; j < grades.size(); j++) {
            int grade = grades.get(j);
            if (grade > 37) {
                for (int i = 0; i < 2; i++) {
                    grade++;
                    if (grade % 5 == 0) {
                        grades.set(j, grade);
                        break;
                    }
                }
            }
        }
        return grades;
    }

    public static int maximumToys(List<Integer> prices, int k) {
        // Write your code here
//        int maxCount = 0;
//        for (int j = 0; j < prices.size(); j++) {
//            int count = 0;
//            int sum = prices.get(j);
//            for (int i = 0; i < prices.size(); i++) {
//                if(i == j) continue;
//                sum += prices.get(i);
//                if (sum > k) {
//                    sum -= prices.get(i);
//                    continue;
//                }
//                count++;
//            }
//            if(maxCount < count) maxCount = count;
//        }
//        return maxCount;

        prices.sort((o1, o2) -> o1 - o2);
        int count = 0;
        int sum = 0;
        for (Integer price : prices) {
            sum += price;
            if (sum > k) break;
            count++;
        }
        return count;
    }

    public static List<Integer> largestPermutation(int k, List<Integer> arr) {
        // Write your code here
        int index = 0;
        int maxValue = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 1) {
                index = i;
            }
            if (maxValue < arr.get(i)) {
                maxValue = arr.get(i);
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            for (int j = index; j > 0; j--) {
                arr.set(j, arr.get(index - 1));
            }
            arr.set(index + 1, 1);
            System.out.println(arr);
        }
        return arr;
    }

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        double a = 0;
        double b = 0;
        double c = 0;
        for (Integer element : arr) {
            if (element > 0) a++;
            else if (element < 0) b++;
            else c++;
        }
        System.out.println(a / arr.size());
        System.out.println(b / arr.size());
        System.out.println(c / arr.size());
    }

    public static void staircase(int n) {
        // Write your code here

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }

    public static int hurdleRace(int k, List<Integer> height) {
        // Write your code here
        int max = 0;
        for (int i = 0; i < height.size(); i++) {
            if (max < height.get(i)) max = height.get(i);
        }
        if (max > k) return max - k;
        return 0;
    }

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
        // s - t
        for (int i = 0; i < apples.size(); i++) {
            apples.set(i, apples.get(i) + a);
        }
        for (int i = 0; i < oranges.size(); i++) {
            oranges.set(i, oranges.get(i) + a);
        }

        int countApples = 0;
        int countOranges = 0;
        for (Integer element : apples) {
            if (element >= s && element <= t) {
                countApples++;
            }
        }
        for (Integer element : oranges) {
            if (element >= s && element <= t) {
                countOranges++;
            }
        }
        System.out.println(countApples);
        System.out.println(countOranges);
    }

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        int s1 = x1;
        int s2 = x2;
        while (true) {
            if (s1 == s2) return "YES";
            else {
                s1 += v1;
                s2 += v2;
            }
            if (x2 > x1 && v2 > v1 || (x1 > x2 && v1 > v2)) {
                return "NO";
            }
        }
    }
}
