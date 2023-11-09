import ShoppingCheckOutProgram.Shopping_mall;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Shopping_mallTest {
    @Test
    public void getPriceOfItem(){
        ArrayList <Integer> unitOfItem = new ArrayList<>();
        ArrayList <Integer> priceOfItem = new ArrayList<>();
        priceOfItem.add(2100);
        unitOfItem.add(2);
        int total = 4200;
        assertEquals(total, Shopping_mall.getTotalOfPrice(unitOfItem,priceOfItem,0));
    }
    @Test
    public void getTotalAllGoods(){
        ArrayList <Integer> unitOfItem = new ArrayList<>();
        ArrayList <Integer> priceOfItem = new ArrayList<>();
        priceOfItem.add(2100);
        unitOfItem.add(2);
        priceOfItem.add(550);
        unitOfItem.add(2);
        double total = 5300;
        assertEquals(total,Shopping_mall.totalOfAllPrice(unitOfItem,priceOfItem,2));
    }
    @Test
    public void testSubTotal(){
        ArrayList <Integer> unitOfItem = new ArrayList<>();
        ArrayList <Integer> priceOfItem = new ArrayList<>();
        priceOfItem.add(2100);
        unitOfItem.add(2);
        priceOfItem.add(550);
        unitOfItem.add(2);
        double total =424.00;
        assertEquals(total,Shopping_mall.discount(unitOfItem,priceOfItem,2,8));
    }

}