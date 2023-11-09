package ShoppingCheckOutProgram;

import java.util.ArrayList;

import static ShoppingCheckOutProgram.Shopping_mall.*;

public class  checkOutSystem {
    public static void main(String[] args) {
        final double tax = 0.175;

        ArrayList<String> products = new ArrayList<>();
        ArrayList<Integer> numberOfItems = new ArrayList<>();
        ArrayList<Integer> priceOfItem = new ArrayList<>();

        String name = collectInput("What is the customer name: ");
        int count = display(products,numberOfItems,priceOfItem);

        String cashierName = collectInput("Kindly Enter your name: ");
        double discount = numberOfUnit("How much discount will he get? ");



        displayInformation(returnDates(),name,cashierName);
        displays();
        displayPrices(products,numberOfItems,priceOfItem,count);

        double discounts = discount(numberOfItems,priceOfItem,count,discount);
        double result = totalOfAllPrice(numberOfItems,priceOfItem,count);
        double vat = tax * result;

        displaySubtotal_discount_vat(result,discounts,vat);
        double totalTotal = (result + vat) - discounts;
        displays(totalTotal);


        double amount = numberOfUnit("How much did the customer give to you: ");
        while (amount < totalTotal) {
            amount = numberOfUnit("How much did the customer give to you: ");
        }
        double finalResult = amount - totalTotal;

        displayInformation(returnDates(),name,cashierName);
        displayPrices(products,numberOfItems,priceOfItem,count);
        displaySubtotal_discount_vat(result,discounts,vat);
        display(totalTotal,amount,finalResult);



    }

}