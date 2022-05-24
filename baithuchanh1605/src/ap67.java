import java.util.TreeSet;
import java.util.Scanner;
import java.util.Set;
public class ap67 {
    public static void main(String[] args){
        int n;
        TreeSet<Integer> treeSet = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        treeSet.add(0);
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);

        System.out.println("Cac phan tu cua treeset la :");
        System.out.println(treeSet);
        do{
            System.out.println("Nhap n = " );
            n = scanner.nextInt();
           

        }while(treeSet.contains(n));
        treeSet.add(n);
        System.out.println("Cac phan tu sau khi them la ");
        System.out.println(treeSet);
    }
    
}
