package ShoppingCheckOutProgram;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Shopping_mall {
   static MultiThreading thread = new MultiThreading();

    public static int getTotalOfPrice(ArrayList <Integer>unitOfItem,ArrayList <Integer> price,int count){
        return unitOfItem.get(count) * price.get(count);
    }
    public static int totalOfAllPrice(ArrayList <Integer>unitOfItem,ArrayList <Integer> price,int count){
        int total = 0;
        for (int number = 0; number < count; number++) {
            total += getTotalOfPrice(unitOfItem, price, number);
        }
        return total;
    }

    public static  void displayPrices(ArrayList <String> product,ArrayList <Integer>unitOfItem,ArrayList <Integer> price,int count){
        for (int number = 0; number < count; number++) {
            int total = getTotalOfPrice(unitOfItem,price, number);
            System.out.println(product.get(number) + " \t\t " + unitOfItem.get(number) + " \t\t"
                    + price.get(number) + " \t\t" + total + "\t\t" + "\n");
        }
    }

    public static double discount(ArrayList<Integer> unitOfItem, ArrayList<Integer> priceOfItem, int count,double discount) {
        int total = totalOfAllPrice(unitOfItem,priceOfItem,count);
        return  total * discount /100;
    }

    public static  void displaySubtotal_discount_vat(double subtotal,double discount,double vat){
        thread.run();
        System.out.printf("""
                               subtotal: %.2f
                               Discount: %.2f
                               Vat @ 17.50: %.2f
                """, subtotal, discount, vat);
        thread.run();
    }

    public static void displayInformation(String dates,String name,String cashierName){
        System.out.printf("""
                SEMICOLON STORES
                MAIN BRANCH
                LOCATION : 312,HERBERT MACAULAY,SABO YABA,LAGOS.
                TEL :03293828343
                DATE: %s 
                Casheir's: %s
                Customer Name: %s
                    """,dates, cashierName, name);
        thread.run();
    }

    public  static  void displays(){
        System.out.println("ITEM  QTY  PRICE  TOTAL(NGN)");
        thread.run();
    }
    public static String collectInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
    public static String collectInput(String input){
        System.out.println(input);
        return collectInput();
    }
    public static int numberOfUnit(String input){
        System.out.println(input);
        return Integer.parseInt(collectInput());

    }
    public static void  displays(double total){
        System.out.printf("""
                               Bill Total :%.2f
                                           """,total);
        thread.run();
        System.out.printf("""
                               THIS IS NOT A RECEIPT KINDLY PAY %.2f
                                                           """,total);
        thread.run();
    }
    public static void display(double total,double amount,double finalResult){
        thread.run();
        System.out.printf("""
                                    Bill Total :%.2f
                                    Amount paid : %.2f
                                    Balance : %.2f
                                           """, total, amount, finalResult);
        thread.run();
        System.out.println("THANK YOU FOR YOUR PATRONAGE ");
        thread.run();
    }

    public  static int display( ArrayList<String> products,ArrayList<Integer> numberOfItems,ArrayList<Integer> priceOfItem){
        int count = 0;
        String answer = "yes".toLowerCase();
        while (answer.equals("yes")) {
            products.add(Shopping_mall.collectInput("what did the user buy: "));
            numberOfItems.add(Shopping_mall.numberOfUnit("How many pieces ? "));
            priceOfItem.add(Shopping_mall.numberOfUnit("How much per unit ? "));

            count++;
            answer = Shopping_mall.collectInput("add more item").toLowerCase();
        }
        return count;

    }
    public static String returnDates(){
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter dates = DateTimeFormatter.ofPattern("dd-MM-yy  HH:mm:ss ");
        return  date.format(dates);
    }
}
