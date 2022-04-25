package dongvat;

public class tiger extends animal {
    void eat() {
        System.out.println("an thit ");
    }

    void Sleep() {
        System.out.println("ngu dem ");
    }

    void Walk() {
        System.out.println("4 chan ");
    }

    void Run() {
        System.out.println(" nhanh ");
    }

    void Roar() {
        System.out.println("co gam");
    }

public static void main(String[] args){
    animal anm = new tiger();
    anm.eat();
    anm.Sleep();
}
}