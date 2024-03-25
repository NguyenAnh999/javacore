import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bai1 {
/**  Bài 1: Khai báo mảng số nguyên gồm 5 phần tử, nhập giá trị các phần
    tử từ bàn phím và in ra giá trị các phần tử của mảng*/

public static void main(String[] args) {
    //khởi tạo mảng
    int[] arr = new int[5];
// nhập phần tử
    for (int i = 0; i < arr.length; i++) {
        System.out.println("mời bạn nhập các phần tử thứ: "+(i+1));
        arr[i]= new Scanner(System.in).nextInt();
    }
    // in các phần tử
    System.out.println(Arrays.toString(arr));
}

}
