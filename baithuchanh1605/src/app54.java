import java.util.HashSet;
import java.util.Scanner;
public class app54 {
    public static void main(String[] args){
        String name ;
        HashSet<String> hs = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        hs.add("BMW");
        hs.add("inova");
        hs.add("honda");
        hs.add("lexus");
        hs.add("kia");
        System.out.println("Cac phan tu trong hashset la : " );
        System.out.println(hs);
        System.out.println("Nhap phan tu can xoa : ");
        name = scanner.nextLine();
        if(hs.contains(name)){
            hs.remove(name);
            System.out.println("xoa thanh cong");
            System.out.println("ca phan tu sau khi xoa  la : ");
            System.out.println(hs);
        }else{System.out.println("xoa khong thanh cong");

        }

        
    }
    
}
