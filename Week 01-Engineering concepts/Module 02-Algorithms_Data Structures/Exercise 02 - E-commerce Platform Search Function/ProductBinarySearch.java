import java.util.ArrayList;
/**
 * ProductBinarySearch class provides methods to search for products in an array
 * of Product objects using binary search techniques.
 */
public class ProductBinarySearch {
    public static Product searchProductByName(Product[] products, String productName) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = products[mid].getProductName().compareToIgnoreCase(productName);
            if (comparison == 0) {
                return products[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static Product searchProductById(Product[] products, int productId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].getProductId() == productId) {
                return products[mid];
            } else if (products[mid].getProductId() < productId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static ArrayList<Product> searchProductByCategory(Product[] products, String productCategory) {
        ArrayList<Product> list = new ArrayList<>();
        for (Product product : products) {
            if (product.getProductCategory().equalsIgnoreCase(productCategory)) {
                list.add(product);
            }
        }
        return list;
    }

    /**
     * This method uses a hybrid approach combining binary search and linear traversal to efficiently
     * search for products within a given price range.
     *
     * Binary search is used to locate the lower (ceil) and upper (floor) bounds of the price range,
     * thereby reducing the portion of the array that needs to be linearly scanned.
     *
     * This approach achieves O(log n + k) time complexity, where:
     *   - n is the number of products,
     *   - k is the number of products within the specified price range.
     *
     * In the best case, where few products fall within the range, performance is near logarithmic.
     * In the worst case, when most or all products fall within the range, the time complexity becomes O(n).
     *
     * A purely binary search-based method would not suffice for range queries, as binary search
     * only works for exact matches and could miss valid products in the range.
     *
     * Hence, this hybrid strategy balances correctness and performance for typical e-commerce scenarios.
     */
    public static ArrayList<Product> searchProductByPrice(Product[] products, double min, double max) {
        ArrayList<Product> list = new ArrayList<>();
        int ceil = productCeilBinarySearch(products, min);
        int floor = productFloorBinarySearch(products, max);
        if (ceil == -1 || floor == -1 || ceil > floor) {
            return list;
        }
        for (int i = ceil; i <= floor; i++) {
            list.add(products[i]);
        }
        if (list.isEmpty()) {
            return list;
        }
        return list;
    }

    private static int productCeilBinarySearch(Product[] products, double price) {
        int left = 0;
        int right = products.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].getPrice() >= price) {
                result = mid; 
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    private static int productFloorBinarySearch(Product[] products, double price) {
        int left = 0;
        int right = products.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].getPrice() <= price) {
                result = mid; 
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}
