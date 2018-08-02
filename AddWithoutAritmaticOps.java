/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addwithoutaritmaticops;

import java.util.Scanner;

/**
 *
 * @author sam
 */
public class AddWithoutAritmaticOps {

    /**
     * @param args the command line arguments
     */
    public static int add(int x, int y){
        if(y==0){
            return x;
        }
        else{
            int sum = x ^ y;
            int carry = (x & y) << 1;
            return add(sum, carry);
        }    
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers for me to Add.");
        try{
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.println("The sum is: " + add(x,y) );
        }catch(Exception e){
           System.out.println("ERROR: Must enter an integer.");
        }
        
        
    }
    
}
