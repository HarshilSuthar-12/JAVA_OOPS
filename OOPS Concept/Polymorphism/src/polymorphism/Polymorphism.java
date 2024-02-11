/*
    Polymorphism and Method Overloading
 */
package polymorphism;

public class Polymorphism {

    public static void main(String[] args) {
        caluclaute c = new caluclaute();
        c.add();
        c.add(1);
        c.add(1,2);
        c.add(1.5, 2.3f);
        c.add(1, 2.4f);
    }
    
}
class caluclaute{
    
    void add(){
        System.out.println("First Method: Nan");
    }
    void add(int a){
        System.out.println("Second Method "+a);
    }
    void add(int a, int b){
        System.out.println("Third Method "+(a+b));
    }
    void add(double a, float b){
        System.out.println("Fourth Method "+(a+b));
    }
    void add(int a, float b){
        System.out.println("Fifth Method "+(a+b));
    }
}

