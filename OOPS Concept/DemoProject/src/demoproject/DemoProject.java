//CLASS OBJECT AND ACESS MODIFIER
//PRIVATE , PUBLIC, PROTECTED(DEFAULT)

package demoproject;

import java.util.Scanner;

public class DemoProject {

    
    
    public static void main(String[] args) {
        car c = new car();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        System.out.println("");
        System.out.print("Enter Name: ");
        
        
        String name = sc.next();
        c.getData(id, name);
    }
    
}

class car {
    private int car_id;
    private String car_name;
    
    void getData(int id, String name){
        System.out.println("Entered ID is: "+id+" and Name is: "+name);
    }
}

