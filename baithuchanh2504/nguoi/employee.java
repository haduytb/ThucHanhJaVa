package nguoi;

import java.util.Scanner;

import nguoi.person;

public class employee extends person {
    public int maphong;
    public String congviec;

    public void nhap() {
        System.out.println("ma phong = ");
        Scanner scanner = new Scanner(System.in);
        maphong = scanner.nextInt();
    }
}