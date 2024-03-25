import java.util.Arrays;
import java.util.Scanner;

public class bai7 {//    Bài 7: Nhập số phần tử của mảng (n), khai báo và nhập giá trị các phần
//    tử của mảng 1 chiều số nguyên. Nhập giá trị (addValue) và chỉ số chèn
//    phần tử vào mảng (addIndex), thực hiện thêm chèn giá trị addValue và chỉ
//    số addIndex của mảng

    public static void main(String[] args) {
        // nhập vào số phần tử trong mảng
        System.out.println("mời bạn nhập vào số phần tử muốn thêm vào mảng");
        int num = new Scanner(System.in).nextInt();
        // khởi tạo mảng
        int[] arr = new int[num];
        // nhập vào các phần tử
        for (int i = 0; i < arr.length; i++) {
            System.out.println("mời bạn nhạp vào phầnt tử thứ " + (i + 1));
            arr[i] = new Scanner(System.in).nextInt();
        }
        //in ra mảng
        System.out.println(Arrays.toString(arr));
        // nhập vị trí muốn chèn
        System.out.println("mời bạn chọn vị trí muốn chèn ");
        int addIndex = new Scanner(System.in).nextInt();
        // kiểm tra xem vị trí nhập vào có nằm trong mảng không nếu không thì nhập lại
        while (addIndex > arr.length) {
            System.out.println("bạn nhập chưa đúng vị trí cần lớn hơn 0 và nhỏ hơn " + arr.length);
            System.out.println("mời bạn chọn vị trí muốn chèn ");
            addIndex = new Scanner(System.in).nextInt();
        }
        // khởi tạo mang chứa phần tử sau khi thêm
        int[] arrNew = new int[num + 1];
        // nhập vào giá trị muốn thêm và tiến hành chuyền vào mảng mới
        System.out.println("mời bạn nhập vào giá trị mới cho phần tử");
        arrNew[addIndex] = new Scanner(System.in).nextInt();
        for (int i = 0, k = 0; i < arrNew.length; i++) {
            if (i == addIndex) {
                continue;
            }
            arrNew[i] = arr[k];
            k++;
        }
// in kết quả
        System.out.println(Arrays.toString(arr));
        System.out.println("mảng sau khi thêm"+Arrays.toString(arrNew));


}
}
