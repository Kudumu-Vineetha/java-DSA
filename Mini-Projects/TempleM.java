import java.util.*;

abstract class TempleEntity {
    int id;
    String name;
    TempleEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }
    abstract void display();
}

interface Manageable {
    void create();
    void read();
    void update();
    void delete();
}

class SevaBooking extends TempleEntity {
    String sevaType, date;
    double amount;

    SevaBooking(int id, String name, String date, String sevaType, double amount) {
        super(id, name);
        this.date = date;
        this.sevaType = sevaType;
        this.amount = amount;
    }

    @Override
    void display() {
        System.out.println("Seva ID: " + id + ", Name: " + name + ", Date: " + date + ", Seva: " + sevaType + ", Amount: Rs." + amount);
    }
}

class LadooDistribution extends TempleEntity {
    int quantity;
    boolean collected;

    LadooDistribution(int id, String name, int quantity) {
        super(id, name);
        this.quantity = quantity;
        this.collected = false;
    }

    @Override
    void display() {
        System.out.println("Seva ID: " + id + ", Name: " + name + ", Ladoos: " + quantity + ", Collected: " + (collected ? "Yes" : "No"));
    }
}

class SevaBookingManager implements Manageable {
    Scanner sc = new Scanner(System.in);
    List<SevaBooking> sevaList = new ArrayList<>();
    Map<Integer, Integer> loyaltyPoints = new HashMap<>();
    Map<Integer, Double> discountBalance = new HashMap<>();

    public void create() {
        System.out.print("Enter Booking ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Devotee Name: ");
        String name = sc.nextLine();

        double availableDiscount = discountBalance.getOrDefault(id, 0.0);

        System.out.print("Enter Seva Date (yyyy-mm-dd): ");
        String date = sc.nextLine();
        System.out.print("Enter Seva Type (e.g., Archana, Abhishekam): ");
        String seva = sc.nextLine();
        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        if (availableDiscount > 0) {
            System.out.println("Available discount Rs." + availableDiscount + " will be applied.");
            if (availableDiscount >= amount) {
                amount = 0;
                discountBalance.put(id, availableDiscount - amount);
            } else {
                amount = amount - availableDiscount;
                discountBalance.put(id, 0.0);
            }
        }

        sevaList.add(new SevaBooking(id, name, date, seva, amount));

        int earnedPoints = (int) (amount / 100);
        loyaltyPoints.put(id, loyaltyPoints.getOrDefault(id, 0) + earnedPoints);

        System.out.println("Seva booked. Loyalty Points Earned: " + earnedPoints);
    }

    public void read() {
        if (sevaList.isEmpty()) System.out.println("No bookings yet.");
        else {
            for (SevaBooking s : sevaList) {
                s.display();
            }
        }
    }

    public void update() {
        System.out.print("Enter Booking ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();
        for (SevaBooking s : sevaList) {
            if (s.id == id) {
                System.out.print("New name: ");
                s.name = sc.nextLine();
                System.out.print("New date: ");
                s.date = sc.nextLine();
                System.out.print("New seva type: ");
                s.sevaType = sc.nextLine();
                System.out.print("New amount: ");
                s.amount = sc.nextDouble();
                loyaltyPoints.put(id, (int) (s.amount / 100));
                System.out.println("Booking updated. Loyalty Points Updated: " + loyaltyPoints.get(id));
                return;
            }
        }
        System.out.println("Booking ID not found.");
    }

    public void delete() {
        System.out.print("Enter Booking ID to delete: ");
        int id = sc.nextInt();
        sevaList.removeIf(s -> s.id == id);
        loyaltyPoints.remove(id);
        discountBalance.remove(id);
        System.out.println("Booking removed if existed.");
    }

    public String getNameById(int id) {
        for (SevaBooking s : sevaList) {
            if (s.id == id) return s.name;
        }
        return null;
    }

    public void viewLoyaltyPoints() {
        System.out.print("Enter Seva ID: ");
        int id = sc.nextInt();
        if (loyaltyPoints.containsKey(id)) {
            System.out.println("Points for Seva ID " + id + ": " + loyaltyPoints.get(id));
        } else {
            System.out.println("No loyalty points found for this ID.");
        }
    }

    public void redeemPoints() {
        System.out.println("Redeem Options:");
        System.out.println("1. Redeem Points for Free Ladoo (2 points per ladoo)");
        System.out.println("2. Redeem Points for Discount on Next Seva Booking (5 points = Rs.50)");
        System.out.print("Choose option: ");
        int option = sc.nextInt();
        System.out.print("Enter Seva ID: ");
        int id = sc.nextInt();

        if (!loyaltyPoints.containsKey(id)) {
            System.out.println("Invalid Seva ID.");
            return;
        }

        int points = loyaltyPoints.get(id);

        switch (option) {
            case 1:
                if (points >= 2) {
                    int ladoos = points / 2;
                    loyaltyPoints.put(id, points % 2);
                    System.out.println("Redeemed " + ladoos + " ladoos for " + (ladoos * 2) + " points. Remaining points: " + loyaltyPoints.get(id));
                } else {
                    System.out.println("Not enough points to redeem for ladoos. Minimum 2 points needed.");
                }
                break;
            case 2:
                if (points >= 5) {
                    System.out.print("Enter points to redeem (multiples of 5): ");
                    int redeemPoints = sc.nextInt();
                    if (redeemPoints > points || redeemPoints % 5 != 0) {
                        System.out.println("Invalid redeem points amount.");
                    } else {
                        int discountRs = (redeemPoints / 5) * 50;
                        loyaltyPoints.put(id, points - redeemPoints);
                        double currentDiscount = discountBalance.getOrDefault(id, 0.0);
                        discountBalance.put(id, currentDiscount + discountRs);
                        System.out.println("Redeemed " + redeemPoints + " points for Rs." + discountRs + " discount on next booking.");
                        System.out.println("Remaining points: " + loyaltyPoints.get(id));
                    }
                } else {
                    System.out.println("Not enough points to redeem for discount. Minimum 5 points needed.");
                }
                break;
            default:
                System.out.println("Invalid redeem option.");
        }
    }
}

class LadooManager implements Manageable {
    Scanner sc = new Scanner(System.in);
    List<LadooDistribution> ladooList = new ArrayList<>();
    SevaBookingManager sevaRef;

    LadooManager(SevaBookingManager sevaManager) {
        this.sevaRef = sevaManager;
    }

    public void create() {
        System.out.print("Enter Seva ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        String name = sevaRef.getNameById(id);
        if (name == null) {
            System.out.println("Invalid Seva ID.");
            return;
        }
        System.out.print("Enter Ladoo Quantity: ");
        int qty = sc.nextInt();
        ladooList.add(new LadooDistribution(id, name, qty));
        System.out.println("Ladoo record added.");
    }

    public void read() {
        if (ladooList.isEmpty()) System.out.println("No ladoo records.");
        else {
            for (LadooDistribution l : ladooList) {
                l.display();
            }
        }
    }

    public void update() {
        System.out.print("Enter Seva ID to update ladoos: ");
        int id = sc.nextInt();
        for (LadooDistribution l : ladooList) {
            if (l.id == id) {
                System.out.print("New quantity: ");
                l.quantity = sc.nextInt();
                System.out.print("Has the devotee collected them? (true/false): ");
                l.collected = sc.nextBoolean();
                System.out.println("Ladoo record updated.");
                return;
            }
        }
        System.out.println("Ladoo record not found.");
    }

    public void delete() {
        System.out.print("Enter Seva ID to delete ladoo record: ");
        int id = sc.nextInt();
        ladooList.removeIf(l -> l.id == id);
        System.out.println("Ladoo record removed if existed.");
    }

    public void collectLadoo() {
        System.out.print("Enter Seva ID to collect ladoos: ");
        int id = sc.nextInt();
        for (LadooDistribution l : ladooList) {
            if (l.id == id) {
                if (l.collected) {
                    System.out.println("Ladoos already collected for this seva!");
                } else {
                    System.out.print("Enter quantity to collect: ");
                    l.quantity = sc.nextInt();
                    l.collected = true;
                    System.out.println("Ladoos collected successfully.");
                }
                return;
            }
        }
        String name = sevaRef.getNameById(id);
        if (name == null) {
            System.out.println("Invalid Seva ID.");
        } else {
            System.out.print("Enter quantity to collect: ");
            int qty = sc.nextInt();
            LadooDistribution l = new LadooDistribution(id, name, qty);
            l.collected = true;
            ladooList.add(l);
            System.out.println("Ladoos collected and record created.");
        }
    }
}

public class TempleM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SevaBookingManager sevaManager = new SevaBookingManager();
        LadooManager ladooManager = new LadooManager(sevaManager);

        while (true) {
            System.out.println("\n--- Temple Management System ---");
            System.out.println("1. Seva Booking");
            System.out.println("2. Ladoo Distribution");
            System.out.println("3. Loyalty Program");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    while (true) {
                        System.out.println("\n-- Seva Booking --");
                        System.out.println("1. Book Seva");
                        System.out.println("2. View Bookings");
                        System.out.println("3. Update Booking");
                        System.out.println("4. Cancel Booking");
                        System.out.println("0. Back");
                        System.out.print("Choose: ");
                        int ch = sc.nextInt();
                        if (ch == 0) break;
                        switch (ch) {
                            case 1:
                                sevaManager.create();
                                break;
                            case 2:
                                sevaManager.read();
                                break;
                            case 3:
                                sevaManager.update();
                                break;
                            case 4:
                                sevaManager.delete();
                                break;
                            default:
                                System.out.println("Invalid choice.");
                        }
                    }
                    break;
                case 2:
                    while (true) {
                        System.out.println("\n-- Ladoo Distribution --");
                        System.out.println("1. Record Ladoo");
                        System.out.println("2. View Records");
                        System.out.println("3. Update Record");
                        System.out.println("4. Delete Record");
                        System.out.println("5. Collect Ladoo");
                        System.out.println("0. Back");
                        System.out.print("Choose: ");
                        int ch = sc.nextInt();
                        if (ch == 0) break;
                        switch (ch) {
                            case 1:
                                ladooManager.create();
                                break;
                            case 2:
                                ladooManager.read();
                                break;
                            case 3:
                                ladooManager.update();
                                break;
                            case 4:
                                ladooManager.delete();
                                break;
                            case 5:
                                ladooManager.collectLadoo();
                                break;
                            default:
                                System.out.println("Invalid choice.");
                        }
                    }
                    break;
                case 3:
                    while (true) {
                        System.out.println("\n-- Loyalty Program --");
                        System.out.println("1. View Loyalty Points");
                        System.out.println("2. Redeem Points");
                        System.out.println("0. Back");
                        System.out.print("Choose: ");
                        int ch = sc.nextInt();
                        if (ch == 0) break;
                        switch (ch) {
                            case 1:
                                sevaManager.viewLoyaltyPoints();
                                break;
                            case 2:
                                sevaManager.redeemPoints();
                                break;
                            default:
                                System.out.println("Invalid choice.");
                        }
                    }
                    break;
                case 0:
                    System.out.println("Thank you. Visit again!");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
