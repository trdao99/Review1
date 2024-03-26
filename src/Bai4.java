import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bai4 {
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
        Collections.sort(list);
        System.out.println("max: "+ list.get(list.size()-1));
        System.out.println("min: "+ list.get(0));
    }
}
