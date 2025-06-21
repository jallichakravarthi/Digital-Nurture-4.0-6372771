import java.util.*;

public class ProductSearchTest {
    public static void main(String[] args) {
        // Original unsorted product list
        Product[] products = new Product[] {
            new Product("Laptop", "Electronics", 65000.00),
            new Product("Smartphone", "Electronics", 25000.00),
            new Product("Washing Machine", "Home Appliances", 30000.00),
            new Product("Refrigerator", "Home Appliances", 40000.00),
            new Product("Sneakers", "Footwear", 3500.00),
            new Product("T-shirt", "Clothing", 800.00),
            new Product("Notebook", "Stationery", 50.00),
            new Product("Pen", "Stationery", 20.00),
            new Product("Blender", "Kitchen Appliances", 2500.00),
            new Product("Microwave", "Kitchen Appliances", 5000.00),
            new Product("Headphones", "Electronics", 1500.00),
            new Product("Smartwatch", "Electronics", 5000.00),
            new Product("Desk Lamp", "Furniture", 1200.00),
            new Product("Chair", "Furniture", 3000.00),
            new Product("Book", "Books", 400.00)
        };

        System.out.println("=== LINEAR SEARCH TESTS ===");

        System.out.println("\nSearch by ID (Linear):");
        Product p1 = ProductLinearSearch.searchProductById(products, 1003);
        System.out.println(p1 != null ? p1 : "Product not found.");

        System.out.println("\nSearch by Name (Linear):");
        Product p2 = ProductLinearSearch.searchProductByName(products, "T-shirt");
        System.out.println(p2 != null ? p2 : "Product not found.");

        System.out.println("\nSearch by Category (Linear):");
        ArrayList<Product> categoryResults = ProductLinearSearch.searchProductByCategory(products, "Electronics");
        categoryResults.forEach(System.out::println);

        System.out.println("\nSearch by Price Range (Linear): ₹1000 - ₹5000");
        ArrayList<Product> priceResults = ProductLinearSearch.searchProductByPrice(products, 1000, 5000);
        priceResults.forEach(System.out::println);

        System.out.println("\n=== BINARY SEARCH TESTS ===");

        // Clone & sort by name for binary name search
        Product[] nameSorted = products.clone();
        Arrays.sort(nameSorted, Comparator.comparing(Product::getProductName));
        System.out.println("\nSearch by Name (Binary):");
        Product b1 = ProductBinarySearch.searchProductByName(nameSorted, "Microwave");
        System.out.println(b1 != null ? b1 : "Product not found.");

        // Clone & sort by ID for binary ID search
        Product[] idSorted = products.clone();
        Arrays.sort(idSorted, Comparator.comparingInt(Product::getProductId));
        System.out.println("\nSearch by ID (Binary):");
        Product b2 = ProductBinarySearch.searchProductById(idSorted, 1008);
        System.out.println(b2 != null ? b2 : "Product not found.");

        // Clone & sort by price for binary price range search (hybrid approach)
        Product[] priceSorted = products.clone();
        Arrays.sort(priceSorted, Comparator.comparingDouble(Product::getPrice));
        System.out.println("\nSearch by Price Range (Binary - hybrid): ₹2000 - ₹6000");
        ArrayList<Product> bPrice = ProductBinarySearch.searchProductByPrice(priceSorted, 2000, 6000);
        bPrice.forEach(System.out::println);

        // Clone & sort by category for binary category search (hybrid approach)
        Product[] categorySorted = products.clone();
        Arrays.sort(categorySorted, Comparator.comparing(Product::getProductCategory));
        System.out.println("\nSearch by Category (Binary - first occurrence + linear):");
        ArrayList<Product> bCat = ProductBinarySearch.searchProductByCategory(categorySorted, "Furniture");
        bCat.forEach(System.out::println);
    }
}
