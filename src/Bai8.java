import java.util.Arrays;
import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("số phần tử của mảng");
        int count = Integer.parseInt(sc.nextLine());
        Integer[] integers = new Integer[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Nhap phan tu thu " + (i + 1));
            int num = Integer.parseInt(sc.nextLine());
            integers[i] = num;
        }
        System.out.println(Arrays.toString(integers));
        System.out.println("nhap update index: ");
        int updateIndex = sc.nextInt();
        System.out.println("nhap update number: ");
        int updateNum = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (i == updateIndex) {
                integers[i] = updateNum;
            }
        }
        System.out.println(Arrays.toString(integers));
    }
}
