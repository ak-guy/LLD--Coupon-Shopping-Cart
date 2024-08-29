package JavaCode;

import java.util.*;

public class ShoppingCart {
    List<Product> productList;

    public ShoppingCart() {
        this.productList = new ArrayList<>();
    }

    public void addItem(Product product) {
        Product eligibleProduct = new PercentageCouponDecorator(
                                  new TypeCouponDecorator(product, 10, product.getProductType()), 
                                  20);
        
        productList.add(eligibleProduct);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Product p: productList) {
            totalPrice += p.getPrice();
        }

        return totalPrice;
    }
}
