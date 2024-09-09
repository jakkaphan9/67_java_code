package W13;

import java.util.Scanner;

public class W13_02_introArray {
    
    public static void main(String[] args) {
     
        String [] brandCars = new String[3];

        Scanner kb = new Scanner(System.in);
        
        
        brandCars[0] = "Toyota";
        brandCars[1] = "BMW";
        brandCars[2] = "Mazda";


        System.out.println("Ole Brand of cars in the array are:");
        for (int i=0 ; i < brandCars.length ; i++ ) {
            System.err.println(brandCars[i] + " / ");
        }
        
        System.out.println("\n\nPlease enter the brand of the 3rd car:");
        for (int i=0 ; i < brandCars.length ; i++ ) {
            System.out.println("Enter brand" + (i+1) + ": ");
            brandCars[i] = kb.next();
        }

        System.out.println("\nNew Brand of cars in the array:");
        for (String car : brandCars) {
            System.out.println(car + " / ");
    }
   
}
}
