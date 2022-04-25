package nguoi;

import java.util.Scanner;

import nguoi.person;

public class customer extends person {
    public int solanmuahang;

    private void nhap() {
        System.out.println("so lan mua = ");
        Scanner scanner = new Scanner(System.in);
        solanmuahang = scanner.nextInt();
    }

}