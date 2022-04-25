package nguoi;

import java.util.Scanner;

public class onelinestuent extends student {
    public String classname;

    public void nhap() {
        System.out.println("lop  = ");
        Scanner scanner = new Scanner(System.in);
        classname = scanner.nextLine();
    }
}