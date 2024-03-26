import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("nhap phan tu thu " + (i+1));
            int num = Integer.parseInt(sc.nextLine());
            integers.add(num);
        }
        System.out.println(integers);
    }
}
