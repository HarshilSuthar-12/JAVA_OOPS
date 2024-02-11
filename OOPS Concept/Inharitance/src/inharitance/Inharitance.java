/*
    Inharitance with Method Overriding, Super Keyword, This Keyword
 */
package inharitance;

public class Inharitance {

    public static void main(String[] args) {
        BMW b = new BMW();
        //Enter Color Of Your Car
        b.display();
    }
    
}

class car {
    int no_wheel=4;
    int car_id = 10;
    String car_name="AMiruddin"; 
    int milage= 10;
    
    void displayColor(){
        System.out.println("Your Milage is: "+milage);
    }
}

class BMW extends car {
    int no_wheel=6;
    int car_id = 10;
    String car_name="Amir"; 
    int milage= 100;
    
    void display(){
       System.out.println("Your car's Name is:"+car_name);
       System.out.println("Your Car's wheel are:"+no_wheel);
    }
}
