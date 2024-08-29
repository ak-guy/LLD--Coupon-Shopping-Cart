package JavaCode;

import java.util.*;

public class TypeCouponDecorator extends Product {
    Product product;
    int percentageDiscount;
    ProductType productType;
    static List<ProductType> eligibleType = new ArrayList<>();
    static {
        eligibleType.add(ProductType.ELECTRONIC);
        eligibleType.add(ProductType.FURNITURE);
    }

    public TypeCouponDecorator(Product product, int percentageDiscount, ProductType productType) {
        this.product = product;
        this.percentageDiscount = percentageDiscount;
        this.productType = productType;
    }

    @Override
    public double getPrice() {
        double productPrice = product.getPrice();
        System.out.println(productPrice);
        if (eligibleType.contains(productType)) {
            return productPrice - ((productPrice * percentageDiscount) / 100);
        }
        return productPrice;
    }
}
