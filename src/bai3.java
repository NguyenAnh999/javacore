import java.util.Arrays;
import java.util.Scanner;

public class bai3 {
    //    Bài 3: Nhập vào số dòng và cột của mảng 2 chiều (row * col), khai báo và
//    nhập giá trị các phần tử mảng số nguyên 2 chiều. In giá trị các phần tử
//    mảng theo ma trận

    public static void main(String[] args) {
        // nhập vào số hàng và cột
        System.out.println("Mời bạn nhập váo số dòng");
        int row = new Scanner(System.in).nextInt();
        System.out.println("mời bạn nhập váo số cột");
        int col = new Scanner(System.in).nextInt();
        //khởi tạo mảng với số hành cột đã tạo
        int[][] arr = new int[row][col];
// nhập các phàn tử
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("mời bạn nhập vào phần tử hàng thứ %d cột thứ %d", i + 1, j + 1);
                arr[i][j] = new Scanner(System.in).nextInt();
            }
        }
        // in ra các phần tử theo ma trận
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }

}
