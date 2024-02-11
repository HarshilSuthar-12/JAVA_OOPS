/*
    Abstraction
 */
package abstraction;

public class Abstraction {

    public static void main(String[] args) {
        car.a = 10;
        car m = new MyCar();
        m.color();
    }
}

abstract class car {
    static int a;
    abstract void color();
}
class MyCar extends car{
    void color(){
        System.out.println("Color is : Pink");
    }
    
    static void add(){
        System.out.println("Color is : Pink");
    }
}
