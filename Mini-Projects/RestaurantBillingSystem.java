class FoodItem {
    String itemId, itemName;
    double unitPrice;
    int quantity;

    FoodItem(String id, String name, double price, int qty) {
        itemId = id;
        itemName = name;
        unitPrice = price;
        quantity = qty;
    }

    double calculateBill() {
        return 0.0;
    }

    void displayDetails() {
    }
}

class DineIn extends FoodItem {
    double serviceCharge;

    DineIn(String id, String name, double price, int qty, double service) {
        super(id, name, price, qty);
        serviceCharge = service;
    }

    @Override
    double calculateBill() {
        double subtotal = unitPrice * quantity + serviceCharge;
        double gst = subtotal * 0.05;
        double total = subtotal + gst;
        double discount = (total > 1000) ? total * 0.10 : 0;
        return total - discount;
    }

    @Override
    void displayDetails() {
        double subtotal = unitPrice * quantity + serviceCharge;
        double gst = subtotal * 0.05;
        double total = subtotal + gst;
        double discount = (total > 1000) ? total * 0.10 : 0;
        double finalTotal = total - discount;

        System.out.println("\nFood Item Record");
        System.out.println("ID: " + itemId);
        System.out.println("Name: " + itemName);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Service Charge: " + serviceCharge);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("GST: " + gst);
        System.out.println("Discount: " + discount);
        System.out.println("Total Bill: " + finalTotal);
    }
}

class Takeaway extends FoodItem {
    double packingCharge;

    Takeaway(String id, String name, double price, int qty, double packing) {
        super(id, name, price, qty);
        packingCharge = packing;
    }

    @Override
    double calculateBill() {
        double subtotal = unitPrice * quantity + packingCharge;
        double gst = subtotal * 0.05;
        double total = subtotal + gst;
        double discount = (total > 1000) ? total * 0.10 : 0;
        return total - discount;
    }

    @Override
    void displayDetails() {
        double subtotal = unitPrice * quantity + packingCharge;
        double gst = subtotal * 0.05;
        double total = subtotal + gst;
        double discount = (total > 1000) ? total * 0.10 : 0;
        double finalTotal = total - discount;

        System.out.println("\nFood Item Record");
        System.out.println("ID: " + itemId);
        System.out.println("Name: " + itemName);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Packing Charge: " + packingCharge);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("GST: " + gst);
        System.out.println("Discount: " + discount);
        System.out.println("Total Bill: " + finalTotal);
    }
}

class Delivery extends FoodItem {
    double deliveryFee;

    Delivery(String id, String name, double price, int qty, double delivery) {
        super(id, name, price, qty);
        deliveryFee = delivery;
    }

    @Override
    double calculateBill() {
        double subtotal = unitPrice * quantity + deliveryFee;
        double gst = subtotal * 0.05;
        double total = subtotal + gst;
        double discount = (total > 1000) ? total * 0.10 : 0;
        return total - discount;
    }

    @Override
    void displayDetails() {
        double subtotal = unitPrice * quantity + deliveryFee;
        double gst = subtotal * 0.05;
        double total = subtotal + gst;
        double discount = (total > 1000) ? total * 0.10 : 0;
        double finalTotal = total - discount;

        System.out.println("\nFood Item Record");
        System.out.println("ID: " + itemId);
        System.out.println("Name: " + itemName);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Delivery Fee: " + deliveryFee);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("GST: " + gst);
        System.out.println("Discount: " + discount);
        System.out.println("Total Bill: " + finalTotal);
    }
}

public class RestaurantBillingSystem {
    public static void main(String[] args) {
        FoodItem[] orders = new FoodItem[3];

        orders[0] = new DineIn("F101", "Paneer Butter Masala", 250.0, 4, 50.0);
        orders[1] = new Takeaway("F102", "Veg Biryani", 180.0, 2, 20.0);
        orders[2] = new Delivery("F103", "Chicken Pizza", 300.0, 4, 40.0);

        for (FoodItem order : orders) {
            order.displayDetails();
        }
    }
}
