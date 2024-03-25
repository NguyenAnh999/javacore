import java.util.Arrays;
import java.util.Scanner;

public class bai8 {
    //    Bài 8: Nhập số phần tử của mảng (n), khai báo và nhập giá trị các phần
//    tử của mảng 1 chiều số nguyên. Nhập giá trị (updateValue) và chỉ số  phần
//    tử cần cập nhật (updateIndex), thực hiện cập nhật giá trị updateValue vào
//    phần tử có chỉ số updateIndex
    public static void main(String[] args) {
        // nhập sô phần tử muốn thêm vào mảng
        System.out.println("mời bạn nhập vào số phần tử muốn thêm vào mảng");
        int num = new Scanner(System.in).nextInt();
        // khởi tạo mảng
        int[] arr = new int[num];
        // nhập các phần tử của mảng
        for (int i = 0; i < arr.length; i++) {
            System.out.println("mời bạn nhạp vào phầnt tử thứ "+(i+1));
            arr[i]= new Scanner(System.in).nextInt();
        }
        // in mảng
        System.out.println(Arrays.toString(arr));
        // nhập vào vị trí muốn sửa
        System.out.println("mời bạn chọn vị trí muốn sửa ");
        int updateIndex= new Scanner(System.in).nextInt();
        // nhập vào giá trị mới
        if (updateIndex<arr.length){
            System.out.println("mời bạn nhập vào giá trị mới cho phần tử");
            arr[updateIndex]= new Scanner(System.in).nextInt();
        }else {
            System.out.println("phần tử nằm ngoài mảng");
        }
        // in ra kết quả
        System.out.println(Arrays.toString(arr));
    }

}
