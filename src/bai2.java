import java.util.Arrays;
import java.util.Scanner;

public class bai2 {
  /**  Bài 2: Nhập vào số phần tử (n) của mảng 1 chiều, khai báo và nhập giá
    trị các phần tử của mảng một chiều số thực gồm n phần tử. In ra giá trị
    trung bình cộng của các phần tử trong mảng */
  public static void main(String[] args) {
      // nhập số phần tử
      System.out.println("mời bạn nhập vào số phần tử muốn thêm vào mảng");
      int num = new Scanner(System.in).nextInt();
      // khởi tạo mảng với độ dài bằng số đã nhập
      int[] arr = new int[num];
      // khởi tạo biến tính tổng
      int sum = 0;
      // nhập vào phần tử đồng thời tích lũy chúng vào biến tổng;
      for (int i = 0; i < arr.length; i++) {
          System.out.println("mời bạn nhạp vào phầnt tử thứ "+i+1);
          arr[i]= new Scanner(System.in).nextInt();
          sum+=arr[i];
      }
      // in kết quả
      System.out.println(Arrays.toString(arr));
      System.out.println("trung bình cộng của các số là "+ (sum/num));
  }
}
