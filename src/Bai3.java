import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input row:");
        int row = sc.nextInt();
        System.out.println("input col:");
        int col = sc.nextInt();
        List<Integer>[][] lists = new List[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("input list[%d][%d] ",i,j);
                lists[i][j]   = Collections.singletonList(sc.nextInt());

            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf(lists[i][j].toString());
            }
            System.out.println();
        }

    }
}
