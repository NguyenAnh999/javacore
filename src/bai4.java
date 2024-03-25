import java.util.Arrays;
import java.util.Scanner;

public class bai4
{
  //  Bài 4: Nhập số phần tử và giá trị các phần tử của mảng một chiều số
//    nguyên. Tìm giá trị lớn nhất và nhỏ nhất trong mảng

    public static void main(String[] args) {
        // nhập số phần tử mảng
        System.out.println("mời bạn nhập vào số phần tử muốn thêm vào mảng");
        int num = new Scanner(System.in).nextInt();
        // khởi tạo mảng
        int[] arr = new int[num];
        // khởi tạo biến max và min bằng phần tử đầu tiên của mảng
       int  max=arr[0];
       int min = arr[0];
       // tìm max và min
        for (int i = 0; i < arr.length; i++) {
            System.out.println("mời bạn nhạp vào phầnt tử thứ "+i+1);
            arr[i]= new Scanner(System.in).nextInt();
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        //in kết qua
        System.out.println(Arrays.toString(arr));
        System.out.println("số lớn nhất là "+max);
        System.out.println("số nhỏ nhất là "+min);
    }
}
