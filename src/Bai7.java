import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Bai7 {
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
        System.out.println("nhap so muon them: ");
        int addNum = sc.nextInt();
        System.out.println("nhap index: ");
        int addIndex = sc.nextInt();
         while (addIndex < 0){
             System.out.println("nhap index: ");
              addIndex = sc.nextInt();
         }
        if (addIndex > count) {
            int minus = addIndex - count;
            Integer[] integersNew = new Integer[addIndex+1];
            for (int i = 0; i < count; i++) {
                integersNew[i] = integers[i];
            }
            for (int i = count; i <= addIndex; i++) {
                if (i == addIndex) {
                    integersNew[addIndex] = addNum;
                }else{
                integersNew[i] = 0;}
            }
            System.out.println(Arrays.toString(integersNew));
        }
        else if(addIndex < count) {
            Integer[] integersNew = new Integer[count + 1];
            for (int i = 0; i < addIndex; i++) {
                integersNew[i] = integers[i];
            }
            for (int i = addIndex; i <= count; i++) {
                if (i == addIndex) {
                    integersNew[addIndex] = addNum;
                    continue;
                }
                integersNew[i] = integers[i - 1];
            }
            System.out.println(Arrays.toString(integersNew));
        }



    }
}
