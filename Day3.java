/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

/**
 *
 * @author macstudent
 */
public class Day3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        arithmetic operation1 = new arithmetic() ;
        operation1.num1 = 20;
        System.out.println("num 1: " + operation1.num1);
        operation1.addition();
        //23+45
        int sum = operation1.addition(23, 45);
        System.out.println(" sum = " +sum);
        
        float fsum = operation1.addition(123.45f, 12.12f);
        System.out.println(" float sum = " + fsum);
        
    }
    
}
