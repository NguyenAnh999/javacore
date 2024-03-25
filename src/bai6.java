import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class bai6
{
    //    Bài 6: Nhập số phần tử của mảng (n), khai báo và nhập giá trị các phần
//    tử của mảng 1 chiều số nguyên. Nhập vào một giá trị (findNumber), in ra
//    chỉ số các phần tử và tổng các phần tử có giá trị bằng giá trị findNumber

    public static void main(String[] args) {
        // nhập số phần tử
        System.out.println("mời bạn nhập vào số phần tử muốn thêm vào mảng");
        int num = new Scanner(System.in).nextInt();
        // khởi tạo mảng
        int[] arr = new int[num];
        // nhập các phần tử
        for (int i = 0; i < arr.length; i++) {
            System.out.println("mời bạn nhạp vào phầnt tử thứ "+(i+1));
            arr[i]= new Scanner(System.in).nextInt();
        }
        // nhập số cần tìm vị trí
        System.out.println("mời bạn nhập vào số muốn check");
        int sum = 0;
        // tìm số nhâp và tính tổng
        int findNumber = new Scanner(System.in).nextInt();
        System.out.print("chỉ số của phần tử là : ");
        for (int i = 0; i < arr.length; i++) {
            if (findNumber==arr[i]){
                System.out.print(i +" và ");
                sum+=arr[i];
            }
        }
        // in kết quả
        System.out.println("tổng chủa chúng là :"+sum);
    }

}
