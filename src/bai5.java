import java.util.Scanner;

public class bai5
{
    //    Bài 5: Nhập số phần tử của mảng số thực 2 chiều (row*col), khai báo và
//    nhập giá trị các phần tử mảng 2 chiều số thực (row*col), in ra gia tri các
//    phần tử có giá trị chẵn và tính tổng các phần tử đó
    public static void main(String[] args) {
        // nhập vào số hàng và cột
        System.out.println("Mời bạn nhập váo số dòng");
        int row = new Scanner(System.in).nextInt();
        System.out.println("mời bạn nhập váo số cột");
        int col = new Scanner(System.in).nextInt();
        // nhập vào các phần tử
        float[][] arr = new float[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("mời bạn nhập vào phần tử hàng thứ %d cột thứ %d \n",(i+1),(j+1));
                arr[i][j]= new Scanner(System.in).nextFloat();
            }
        }
        System.out.println("các phần tử chia hết cho 2 là");
        float sum=0;
        // tìm các phần tử theo điều kiên và tính tổng
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
               if (arr[i][j]%2==0){
                    System.out.print(arr[i][j]+"__");
                    sum+=arr[i][j];
                }
            }
        }
        // in kết quả
        System.out.println("\n tổng cửa chúng là\n "+sum);


    }
}
