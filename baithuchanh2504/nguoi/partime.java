package nguoi;

import java.util.Scanner;

public class partime extends employee {
    public int songaylamviec;
    public float luong;

    public void nhapsongaylv() {
        System.out.println("so ngay lv = ");
        Scanner scanner = new Scanner(System.in);
        songaylamviec = scanner.nextInt();
    }

    public void tienluong() {
        luong = songaylamviec * 2000;
        System.out.println("luong = " + luong);
    }
}