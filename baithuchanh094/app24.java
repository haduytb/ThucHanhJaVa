import java.util.ArrayList;
import java.util.Scanner;
public class app24 {
    public static void main(String[] args){
        ArrayList<Integer> arrListInteger = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int number = 0;
        System.out.println("nhap so phan tu cua mang  " );
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            System.out.println("nhap phan tu thu " +i + ":");
            number = sc.nextInt();
        }


    }
}