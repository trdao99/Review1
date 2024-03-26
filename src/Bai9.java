import java.util.Arrays;
import java.util.Scanner;

public class Bai9 {
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
        System.out.println("nhap delete index: ");

        int DelIndex = sc.nextInt();

        for (int i = DelIndex; i < count-1; i++) {
            integers[i]  = integers[i+1];
            }
        integers[count-1] = null;
        System.out.println(Arrays.toString(integers));
    }
}
