import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print length array: ");
        int len1 = scanner.nextInt();
        int[] array1 = new int[len1];
        System.out.print("Print the number array: ");
        for (int i = 0; i < len1; i++) {
            array1[i] = scanner.nextInt();
            }
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 != 0) {
                arr.add(array1[i]);
                }
            }
        System.out.println("no even numbers: " + arr);
        }
    }


