package JavaCode;

public abstract class Product {
    String name;
    double originalPrice;
    ProductType productType;

    public Product() {
        
    }

    Product(String name, double originalPrice, ProductType productType) {
        this.name = name;
        this.originalPrice = originalPrice;
        this.productType = productType;
    }

    public abstract double getPrice();

    public ProductType getProductType() {
        return productType;
    }
}
