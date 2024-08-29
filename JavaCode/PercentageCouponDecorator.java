package JavaCode;

public class PercentageCouponDecorator extends CouponDecorator {
    Product product;
    int percentageDiscount;

    public PercentageCouponDecorator(Product product, int percentageDiscount) {
        this.product = product;
        this.percentageDiscount = percentageDiscount;
    }

    @Override
    public double getPrice() {
       double productPrice = product.getPrice();
       System.out.println(productPrice);
       return productPrice - ((productPrice * percentageDiscount) / 100);
    }
}
