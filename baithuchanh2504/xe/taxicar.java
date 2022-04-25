package xe;

public class taxicar implements car {
    public void move(){
        System.out.println("chuyen dong ");
    }
    public void stop(){
        System.out.println("dung");
    }
    public void turnRight(){
        System.out.println("re phai  ");
    }
    public void turnLeft(){
        System.out.println("re trai ");
    }
    public void reverse(){
        System.out.println("quay dau  ");
    }

public static void main(String[] args){
   car ke1 = new taxicar();
   ke1.move();
}
}