package nguoi;

import java.util.Scanner;

public class person {
    private int ID;
    private String name;

    private void nhap() {
        System.out.println(" ID = ");
        Scanner scanner = new Scanner(System.in);
        ID = scanner.nextInt();
        System.out.println(" name = ");
        name = scanner.nextLine();
    }

    private void xuat() {
        System.out.println("ID là : " + ID);
        System.out.println("Tên là : " + name);
    }

}