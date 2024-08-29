package JavaCode;

public class Main {
    public static void main(String[] args) {
        Product item1 = new Item1("Sofa", 2000, ProductType.FURNITURE);
        Product item2 = new Item2("TV", 3000, ProductType.ELECTRONIC);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        System.out.println("Total price after discount : " + shoppingCart.getTotalPrice());
    }
}