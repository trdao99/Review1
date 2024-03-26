import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input row:");
        int row = sc.nextInt();
        System.out.println("input col:");
        int col = sc.nextInt();
        Double[][] lists = new Double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("input list[%d][%d]", i, j);
                lists[i][j] = sc.nextDouble();
            }
        }
        double sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (lists[i][j] % 2 == 0) {
                    lists[i][j] = lists[i][j];
                    System.out.printf("%5.1f", lists[i][j] );
                    sum += lists[i][j];
                }
            }
        }
        System.out.println("\ntổng các phần tử = " + sum);
    }
}
