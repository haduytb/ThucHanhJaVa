import java.util.HashSet;
import java.util.Scanner;
public class app52{
public static void main(String[] args){
    int n;
    HashSet<Integer> hs = new HashSet<>();
    Scanner sc = new Scanner(System.in);
    hs.add(0);
    hs.add(3);
    hs.add(1);
    hs.add(4);
    hs.add(2);
    hs.add(8);
    System.out.println("Cac phan tu trong hashset la : ");
    System.out.println(hs);
    System.out.println("Nhap phan tu can them ");
    n = sc.nextInt();
    if(!hs.contains(n)){
        hs.add(n);
        System.out.println("Them thanh cong ");
        System.out.println("Cac phan tu trong hashset sau khi them la : ");
        System.out.println(hs);

    }else {
        System.out.println("Phan tu " + n + " da ton tai ");
    }


}
}