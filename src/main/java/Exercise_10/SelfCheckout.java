/*
UCF cop 3330 summer 2021 assignment 1 solution
copyright 2021 Matthew McKee
*/

package Exercise_10;

import java.util.Scanner;
public class SelfCheckout {
    public static void main(String[] args){
        //constant to calculate tax at %5.5
        final double TAX= 1.055;
        Scanner input = new Scanner(System.in);

        //user "checkout"
        System.out.print("What is the price of item 1?");
        String price1Str= input.next();
        double Price1 = Double.parseDouble(price1Str);
        System.out.print("What is the quantity of item 1?");
        String quantity1Str= input.next();
        int quantity1 = Integer.parseInt(quantity1Str);

        System.out.print("What is the price of item 2?");
        String price2Str= input.next();
        double Price2 = Double.parseDouble(price2Str);
        System.out.print("What is the quantity of item 2?");
        String quantity2Str= input.next();
        int quantity2 = Integer.parseInt(quantity2Str);

        System.out.print("What is the price of item 3?");
        String price3Str= input.next();
        double Price3 = Double.parseDouble(price3Str);
        System.out.print("What is the quantity of item 3?");
        String quantity3Str= input.next();
        int quantity3 = Integer.parseInt(quantity3Str);

        //math for the subtotal and tax and such
        double subtotal = Price1*quantity1+Price2*quantity2+Price3*quantity3;
        double total = subtotal*TAX;
        double taxTotal = total - subtotal;
        taxTotal = Math.round(taxTotal *100.0)/100.0;
        total = Math.round(total*100.0)/100.0;


        //printout with all the math but separate from the calculations
        System.out.print("subtotal: $"+ subtotal +"\ntax: $"+ taxTotal +"\ntotal: $"+ total);

    }
}
