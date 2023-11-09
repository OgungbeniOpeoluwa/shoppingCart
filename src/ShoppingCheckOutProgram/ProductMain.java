package ShoppingCheckOutProgram;

import java.util.ArrayList;
import java.util.List;

public class ProductMain {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        Product product = new Product();
        String answer = "yes".toLowerCase();
        int count = 0;
        while (answer.equals("yes")) {
            product.setProductName(Shopping_mall.collectInput("what did the user buy: "));
            product.setNumberOfItems(Shopping_mall.numberOfUnit("How many pieces ? "));
            product.setPrice(Shopping_mall.numberOfUnit("How much per unit ? "));
            products.add(product);
            count++;
            answer = Shopping_mall.collectInput("add more item").toLowerCase();
        }
        System.out.println(product.toString());

        }
}
