import java.util.Scanner;

public class App2{
public static void main(String[] args)throws Exception {
    Scanner sc =new Scanner(System.in);
    double a,b,c;
    do{System.out.print(" so nguyen a: ");
    a = sc.nextDouble();}
    while(a<=0);
    do{System.out.print(" so nguyen b: ");
    b = sc.nextDouble();}
    while(b<=0);
    do{System.out.print(" so nguyen c: ");
    c = sc.nextDouble();}
    while(c<=0);
    if(a==b&&b==c){
        System.out.print("tam giac deu");
    }else if((a==b&&a*a+b*b==c*c)||(a==c&&a*a+c*c==b*b)||(b==c&&b*b+c*c==a*a)){
        System.out.print("tam giac vuong can");
    }else if((a*a+b*b==c*c)||(a*a+c*c==b*b)||(b*b+c*c==a*a)){
        System.out.print("tam giac vuong");
    }else if((a==b)||(b==c)||(c==a)){
        System.out.print("tam giac can");
    }else{
        System.out.print("tam giac thuong");
    }
}
}
