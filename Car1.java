class Car{
    void start(){
        System.out.println("car started ");
    }
    void gear(){
        System.out.println("car gear changed");
    }
    void acceralate(){
        System.out.println("car acceralted ");
    }
}
class Luxurycar extends Car{
    @Override
    void start(){
        System.out.println(" luxury car started");
    }
    @Override
    void gear(){
        System.out.println("luxury car gear changed");
    }
    @Override
    void acceralate(){
        System.out.println("luxury car acceralated");
    }
    void openroof(){
        System.out.println("automatic roof opened");
    }
}

public class Car1 {
    public static void main(String args[]){
        Car ob=new Luxurycar();
        ob.start();
        ob.gear();
        ob.acceralate();

    }

    
}
