import java.util.HashSet;
import java.util.Scanner;
public class App {
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
        do{
            System.out.println("nhap phan tu can xoa");
            name = scanner.nextLine();
        }
        while(!hs.contains(name));
        hs.remove(name);
        System.out.println("Cac phan tu cua day sau khi xoa la : ");
        System.out.println(hs);

        
    }
    
}
