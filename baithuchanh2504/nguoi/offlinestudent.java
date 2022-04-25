package nguoi;

import java.util.Scanner;

public class offlinestudent extends student {
    public int chieucao;

    public void nhap() {
        System.out.println(" chieucao = ");
        Scanner scanner = new Scanner(System.in);
        chieucao = scanner.nextInt();
    }

    public void xuat() {
        System.out.println("sinh vien co chieu cao la : " + chieucao);
    }
}