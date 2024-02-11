/*
    Interface
 */
package pkginterface;

public class Interface {

    public static void main(String[] args) {
        AUDI a = new AUDI();
        a.DisplayYourColor();
    }
    
}

interface car{
    int a= 10;
    void DisplayYourColor();
}
class AUDI implements car{

    @Override
    public void DisplayYourColor() {
        System.out.println("Color is: Red "+a);
    }
    
}
