import java.util.Scanner;

public class app10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String chuoi;
        char kitu;
        int dem = 0;
        System.out.print("nhap chuoi ");
        chuoi = sc.nextLine();
        System.out.print("nhap kitu ");
        kitu = sc.next().charAt(0);
        for(int i=0;i<chuoi.length();i++){
            if(kitu==chuoi.charAt(i)){
                dem+=1;
            }     
        }System.out.print("so ki tu la :" + dem);



    }
    
}
