package CauTrucMangMotChieu;
import static CauTrucMangMotChieu.bai_16.nhapMang;
import static CauTrucMangMotChieu.bai_16.xuatMang;
import java.util.Scanner;
public class Bai_17 {
    public static void main(String[] args) {
       int[] a;
int n;
Scanner sc = new Scanner(System.in);
System.out.print("Cho biet so phan tu:");
n = sc.nextInt();
a = new int[n];
nhapMang(a, sc);
System.out.println("===Mang a=====");
xuatMang(a);
    }
    
}
