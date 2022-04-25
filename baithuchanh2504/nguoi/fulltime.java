package nguoi;

import java.util.Scanner;

public class fulltime extends employee {
    public String phuongtien;

    public void nhap() {
        System.out.println("phuongtien = ");
        Scanner scanner = new Scanner(System.in);
        phuongtien = scanner.nextLine();
    }
}
