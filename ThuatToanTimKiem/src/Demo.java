import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(5);
        arr.add(9);
        arr.add(11);
        arr.add(14);
        System.out.println(binarySearch(arr, 1));
    }

    //    1 5 9 11 14 17      // K = 1
    //  l=0 m=0 r=1
    public static int binarySearch(ArrayList<Integer> arr, int K) {
        int left = 0;
        int right = arr.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if(arr.get(mid) == K) {
                return mid;
            }
            if(arr.get(mid) < K){
                left = mid + 1;
            }
            if(arr.get(mid) > K) {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int linearSearch(ArrayList<Integer> arr, int K) {
        for (int i = 0; i < arr.size(); i++) {
            if (K == arr.get(i)) {
                return i;
            }
        }
        return -1;
    }

    public static int sentinelSearch(ArrayList<Integer> arr, int K) {
        int n = arr.size(); // 5
        arr.add(K); // [1, 5, 9 , 11, 14, 15]
        int i = 0;
        while (arr.get(i) != K) { // 15 != 15 | i = 5
            i++;
        }
        if (i == n) { // i == n
            return -1;
        } else {
            return i; // 2
        }
    }

    public void demo() {
        int a = 17;
        if(a < 10) { // (O1)
            System.out.println(a);
        } else { // (O1)
            System.out.println("haha");
        }

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) { // O(n)
            System.out.println(a); // O1
            for (int j = 0; j < n; j++) { // O(n)
                System.out.println(a);
            }
        }
        // O(n^2) + O(2) => O(n^2)
        // O(n) + O(2) => O(n)
    }
}
