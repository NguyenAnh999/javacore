import java.util.Arrays;
import java.util.Scanner;

public class bai9
{
    //    Bài 9: Nhập số phần tử của mảng (n), khai báo và nhập giá trị các phần
//    tử của mảng 1 chiều số nguyên. Nhập chỉ số phần tử cần xóa (deleteIndex)
//    và thực hiện xóa phần tử trong mảng theo deleteIndex
    public static void main(String[] args) {
        // nhập số phần tử
        System.out.println("mời bạn nhập vào số phần tử muốn thêm vào mảng");
        int num = new Scanner(System.in).nextInt();
        // khởi tạo mảng
        int[] arr = new int[num];
        int[] arrNew = new int[num-1];
        // nhập các phần tử
        for (int i = 0; i < arr.length; i++) {
            System.out.println("mời bạn nhạp vào phầnt tử thứ "+(i+1));
            arr[i]= new Scanner(System.in).nextInt();
        }
        // in ra mảng
        System.out.println(Arrays.toString(arr));
        // nhập vào vị trí muốn xóa
        System.out.println("mời bạn chọn vị trí muốn xóa ");
        int deleteIndex= new Scanner(System.in).nextInt();
        // tạo mảng mới không chứa phần tử đã xóa
        if (deleteIndex<arr.length){
            for (int i = 0,d=0; i < arr.length; i++) {
                if (i==deleteIndex){continue;}
                    arrNew[d]=arr[i];
                    d++;
            }
        }else {
            System.out.println("phần tử nằm ngoài mảng");
        }
        //in ra kết quả
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrNew));

    }
}
