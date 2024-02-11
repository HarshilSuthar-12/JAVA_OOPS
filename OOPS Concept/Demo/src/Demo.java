import java.util.Scanner;

public class Demo {
    
    public static void main(String[] args) {
//        varDemo a = new varDemo();
//        a.Display();
//        Add abc= new Add();
//        System.out.print("Enter First Value:");
//        Scanner sc = new Scanner(System.in);
//        int a=sc.nextInt();
//        
//        System.out.print("Enter Second Value:");
//        int b=sc.nextInt();
//        
//        System.out.print("Enter Third Value:");
//        int c=sc.nextInt();
//        
//        System.out.println(abc.getData(a, b));
//        System.out.println(abc.getData(a, b,c));

            
        
    }
   
}
//OVERLOADING
//class Add{
//    
//    int getData(int a, int b){
//        return a+b;
//    }
//    int getData(int a, int b, int c){
//        return a+b+c;
//    }  
//}


//class varDemo{
//    private int a;
//    void Display() {
//       System.out.print("Enter Value:");
//        Scanner sc = new Scanner(System.in);
//        a=sc.nextInt();
//        
//        System.out.println("Entered Value is: "+a); 
//    }
//        
//}


class car {
    String color;
    void printColor(String myColor){
        System.out.println("My Color is:"+myColor);
    }
}

class BMW extends car{
    void printColor(String myColor){
        System.out.println("My Color is:"+myColor);
    }
}