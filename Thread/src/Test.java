import netscape.javascript.JSUtil;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // 1 12 5 111 200 1000 10
        List<Integer> prices = new ArrayList<>();
//        prices.add(1);
//        prices.add(12);
//        prices.add(5);
//        prices.add(111);
//        prices.add(200);
//        prices.add(1000);
//        prices.add(10);

//        prices.add(3);
//        prices.add(7);
//        prices.add(2);
//        prices.add(9);
//        prices.add(4);
//        System.out.println(maximumToys(prices, 15));

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
//        System.out.println(arrayList);
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
        for (Integer price: prices) {
            sum += price;
            if(sum > k) break;
            count++;
        }
        return count;
    }

    public static List<Integer> largestPermutation(int k, List<Integer> arr) {
        // Write your code here
        int index = 0;
        int maxValue = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == 1) {
                index = i;
            }
            if(maxValue < arr.get(i)) {
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
}
