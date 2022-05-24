import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
public class app58 {
  
   
    public static void main(String[] args){
        
       
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap n : " );
        n = sc.nextInt();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        String name;
        for (int i = 1; i <=n; i++){     
        System.out.println("name = ");
        name = sc.nextLine();
        linkedHashSet.add(name);

        } System.out.println(linkedHashSet);
        /*linkedHashSet.add("java");
        linkedHashSet.add("C++");
        linkedHashSet.add("JavaSCRIP");
        linkedHashSet.add("PHP");*/
        //
       // }


    }
    
}

