import java.util.ArrayList;

public class OrderTest {
    public static void main(String[] args) {
        Order[] orders = {
                new Order("O001", "Alice", new ArrayList<OrderProduct>() {
                    {
                        add(new OrderProduct("P001", "Laptop", 55000.0));
                        add(new OrderProduct("P002", "Mouse", 750.0));
                    }
                }),

                new Order("O002", "Bob", new ArrayList<OrderProduct>() {
                    {
                        add(new OrderProduct("P003", "Smartphone", 25000.0));
                    }
                }),

                new Order("O003", "Charlie", new ArrayList<OrderProduct>() {
                    {
                        add(new OrderProduct("P004", "Headphones", 1500.0));
                        add(new OrderProduct("P005", "Power Bank", 1200.0));
                    }
                }),

                new Order("O004", "Diana", new ArrayList<OrderProduct>() {
                    {
                        add(new OrderProduct("P006", "Monitor", 10000.0));
                        add(new OrderProduct("P007", "Keyboard", 2000.0));
                        add(new OrderProduct("P008", "Webcam", 1800.0));
                    }
                }),

                new Order("O005", "Ethan", new ArrayList<OrderProduct>() {
                    {
                        add(new OrderProduct("P009", "Smartwatch", 4500.0));
                        add(new OrderProduct("P010", "Wireless Charger", 1500.0));
                    }
                })
        };

        Order[] bubbleOrders = orders.clone();

        System.out.println("\n=== Order Sorting Test ===\n");

        System.out.println("Orders before sorting:");
        for (Order order : orders) {
            System.out.print(order + " ");
        }
        System.out.println();

        bubbleSortOrders(bubbleOrders);

        System.out.println("\nOrders sorted by total price using Bubble Sort:");
        for (Order order : bubbleOrders) {
            System.out.print(order + " ");
        }
        System.out.println();

        Order[] quickOrders = orders.clone();
        quickSortOrders(quickOrders, 0, quickOrders.length - 1);

        System.out.println("\nOrders sorted by total price using Quick Sort:");
        for (Order order : quickOrders) {
            System.out.print(order + " ");
        }

    }

    public static void bubbleSortOrders(Order[] orders) {
        boolean swapped;
        for (int i = 0; i < orders.length - 1; i++) {
            swapped = false;
            for (int j = i; j < orders.length - i - 1; j++) {
                if (orders[j].getTotalPrice() > orders[j + 1].getTotalPrice()) {
                    swap(orders, j, j + 1);
                    swapped = true;
                }
            }
        }
    }

    public static void swap(Order[] orders, int i, int j) {
        Order temp = orders[i];
        orders[i] = orders[j];
        orders[j] = temp;
    }

    public static void quickSortOrders(Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);
            quickSortOrders(orders, low, pi - 1);
            quickSortOrders(orders, pi + 1, high);
        }
    }

    public static int partition(Order[] orders, int low, int high) {
        double pivot = orders[high].getTotalPrice();
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (orders[j].getTotalPrice() <= pivot) {
                i++;
                swap(orders, i, j);
            }
        }
        swap(orders, i + 1, high);
        return i + 1;
    }
}
