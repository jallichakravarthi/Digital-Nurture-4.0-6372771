
import java.util.ArrayList;

public class Order {
    private String orderId;
    private String customerName;
    private ArrayList<OrderProduct> products;
    private double totalPrice;

    public Order(String orderId, String customerName, ArrayList<OrderProduct> products) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.products = products;
        this.totalPrice = calculateTotalPrice();
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", totalPrice=" + totalPrice +
                '}';
    }

    private double calculateTotalPrice() {
        double result = 0.0;
        for (OrderProduct product : products) {
            result += product.getPrice();
        }
        return result;
    }

    private void addProduct(OrderProduct product) {
        products.add(product);
        totalPrice += product.getPrice();
    }
}
