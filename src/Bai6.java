import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> integers = new ArrayList<>();
        System.out.println("số phần tử của mảng");
        int count = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < count; i++) {
            System.out.println("Nhap phan tu thu " + (i + 1));
            int num = Integer.parseInt(sc.nextLine());
            integers.add(num);
        }

        System.out.print("FindNumber: ");
        int findNumber = sc.nextInt();

        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) == findNumber) {
                System.out.printf("index = %2d, value = %2d\n", i, integers.get(i));
            }
            for (int j = i + 1; j < integers.size(); j++) {
                if (integers.get(i) + integers.get(j) == findNumber) {
                    System.out.printf("index = %d, value = %d", i, integers.get(i));
                    System.out.printf(" + index = %d, value = %d    = %d\n", j, integers.get(j),5);
                }
            }
        }
    }
}