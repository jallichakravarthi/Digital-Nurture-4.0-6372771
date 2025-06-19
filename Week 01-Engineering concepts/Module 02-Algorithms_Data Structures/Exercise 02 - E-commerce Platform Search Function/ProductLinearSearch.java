import java.util.ArrayList;
/**
 * ProductLinearSearch class provides methods to search for products in an array
 * of Product objects using linear search techniques.
 */
public class ProductLinearSearch {
    public static Product searchProductById(Product[] products, int productId) {
        for (Product product : products) {
            if (product.getProductId() == productId) {
                return product;
            }
        }
        return null;
    }

    public static Product searchProductByName(Product[] products, String productName) {
        for (Product product : products) {
            if (product.getProductName().equalsIgnoreCase(productName)) {
                return product;
            }
        }
        return null;
    }

    public static ArrayList<Product> searchProductByCategory(Product[] products, String productCategory) {
        ArrayList<Product> list = new ArrayList<>();
        if (products == null || products.length == 0) {
            return list;
        }
        for (Product product : products) {
            if (product.getProductCategory().equalsIgnoreCase(productCategory)) {
                list.add(product);
            }
        }
        return list;
    }

    public static ArrayList<Product> searchProductByPrice(Product[] products, double min, double max) {
        ArrayList<Product> list = new ArrayList<>();
        if (products == null || products.length == 0) {
            return list;
        }
        for (Product product : products) {
            if (product.getPrice() <= max && product.getPrice() >= min) {
                list.add(product);
            }
        }
        return list;
    }
}
