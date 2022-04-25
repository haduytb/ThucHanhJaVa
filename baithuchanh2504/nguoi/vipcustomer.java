package nguoi;

import java.util.Scanner;

import nguoi.person;

public class vipcustomer extends person {
    public String hovaten;
    public float sotiendamua;

    private void nhap() {
        System.out.println(" ho ten = ");
        Scanner scanner = new Scanner(System.in);
        hovaten = scanner.nextLine();
        System.out.println(" so tien da mua = ");
        sotiendamua = scanner.nextFloat();
    }
}