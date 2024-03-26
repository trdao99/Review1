import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("số phần tử của mảng");
        int count = Integer.parseInt(sc.nextLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            System.out.println("nhap phan tu thu " + (i+1));
            int num = Integer.parseInt(sc.nextLine());
            list.add(num);
        }
        System.out.printf("mảng gồm %d phần tử : ",count);
        System.out.println(list);
        System.out.println("giá trị trung bình cộng của các phần tử trong mảng : " + list.stream().mapToInt(Integer::intValue).average().toString());
    }
}
