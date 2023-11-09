package ShoppingCheckOutProgram;

public class Product {
    private String productName;
    private double price;
    private int numberOfItems;
    public void setProductName(String productName){
        this.productName = productName;
    }
    public  void setNumberOfItems(int numberOfItems){
        this.numberOfItems = numberOfItems;
    }
    public  void setPrice(double price){
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }
    public String toString(){
        return String.format("%s   %s   %s",getProductName(),getNumberOfItems(),getPrice());
    }
}
