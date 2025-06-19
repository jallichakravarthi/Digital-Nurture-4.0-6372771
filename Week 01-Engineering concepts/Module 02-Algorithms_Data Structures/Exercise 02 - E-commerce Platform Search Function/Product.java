public class Product {
    private final int productId;
    @SuppressWarnings("FieldMayBeFinal")
    private String productName;
    @SuppressWarnings("FieldMayBeFinal")
    private String productCategory;
    @SuppressWarnings("FieldMayBeFinal")
    private double price;
    private static int idCounter = 0;

    public Product(String productName, String productCategory, double price) {
        this.productId = 1000 + idCounter;
        this.productName = productName;
        this.productCategory = productCategory;
        this.price = price;
        idCounter++;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public double getPrice() {
        return price;
    }

    public int getProductCount() {
        return idCounter;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productCategory='" + productCategory + '\'' +
                ", price=" + price +
                '}';
    }
}
