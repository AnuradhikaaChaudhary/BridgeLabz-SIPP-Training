package Inheritance;
import java.time.LocalDate;


class Order {
 protected int orderId;
 protected LocalDate orderDate;

 Order(int orderId, LocalDate orderDate) {
     this.orderId = orderId;
     this.orderDate = orderDate;
 }

 String getOrderStatus() {
     return "Order Placed on " + orderDate;
 }
}


class ShippedOrder extends Order {
 protected String trackingNumber;

 ShippedOrder(int orderId, LocalDate orderDate, String trackingNumber) {
     super(orderId, orderDate);
     this.trackingNumber = trackingNumber;
 }

 @Override
 String getOrderStatus() {
     return "Order Shipped. Tracking Number: " + trackingNumber;
 }
}


class DeliveredOrder extends ShippedOrder {
 private LocalDate deliveryDate;

 DeliveredOrder(int orderId, LocalDate orderDate, String trackingNumber, LocalDate deliveryDate) {
     super(orderId, orderDate, trackingNumber);
     this.deliveryDate = deliveryDate;
 }

 @Override
 String getOrderStatus() {
     return "Order Delivered on " + deliveryDate;
 }
}


public class OnlineRetailOrder {
 public static void main(String[] args) {
     Order order = new Order(101, LocalDate.of(2025, 7, 8));
     ShippedOrder shippedOrder = new ShippedOrder(102, LocalDate.of(2025, 7, 6), "TRK123456");
     DeliveredOrder deliveredOrder = new DeliveredOrder(103, LocalDate.of(2025, 7, 4), "TRK654321", LocalDate.of(2025, 7, 8));

     System.out.println("Order Status: " + order.getOrderStatus());
     System.out.println("Shipped Order Status: " + shippedOrder.getOrderStatus());
     System.out.println("Delivered Order Status: " + deliveredOrder.getOrderStatus());
 }
}
