//CONSTRUCTOR AND PARAMETERIZED CONSTRUCTOR

package constructordemo;

import java.util.Scanner;

public class ConstructorDemo {

    public static void main(String[] args) {
        int a;      //DECLARATION
        
        a=  10;     //DEFINATION & INITIALIZATION
        
        int b = 10;         //DECLARATION WITH VALUE
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        System.out.println("");
        System.out.print("Enter Name: ");
        String name = sc.next();
        
        
        car c = new car(id, name);
        c.DisplayData();
        
    }
    
}

class car {
    private int car_id;
    private String car_name;
    
   
    
    public car()
    {    }
    
    public car(int car_id, String car_name)
    {
        this.car_id = car_id;
        this.car_name = car_name;
    }
    
    void DisplayData(){
        System.out.println("Entered ID is: "+car_id+" and Name is: "+car_name);
    }
}
