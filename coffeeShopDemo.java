public class coffeeShopDemo {

    public static void main(String[] args) {
        
        // 1. Start with the base coffee component
        Coffee customerOrder = new blackCoffee();
        System.out.println("Base Order: " + customerOrder.getDescription() + " (₱ " + customerOrder.getCost() + ")");

        // 2. Add the first decorator (Milk)
        customerOrder = new milk(customerOrder);
        System.out.println("After Milk: " + customerOrder.getDescription() + " (₱ " + customerOrder.getCost() + ")");

        // 3. Add the second decorator (Caramel Syrup)
        customerOrder = new caramelSyrup(customerOrder);
        System.out.println("After caramel Syrup: " + customerOrder.getDescription() + " (₱ " + customerOrder.getCost() + ")");
        
        // --- Final Receipt ---
        System.out.println("\n--- Final Brewtiful Order ---");
        System.out.println("Ingredients: " + customerOrder.getDescription());
        System.out.println("Total Cost: ₱ " + customerOrder.getCost());
        System.out.println("-----------------------------");

        // 1. Start with the base coffee component
        Coffee customerOrder1 = new Espresso();
        System.out.println("Base Order: " + customerOrder1.getDescription() + " (₱ " + customerOrder1.getCost() + ")");

        // 2. Add the first decorator (Milk)
        customerOrder1 = new milk(customerOrder1);
        System.out.println("After Milk: " + customerOrder1.getDescription() + " (₱ " + customerOrder1.getCost() + ")");

        // 3. Add the second decorator (Whipped Cream)
        customerOrder1 = new WhippedCream(customerOrder1);
        System.out.println("After Whipped Cream: " + customerOrder1.getDescription() + " (₱ " + customerOrder1.getCost() + ")");
        
        // --- Final Receipt ---
        System.out.println("\n--- Final Brewtiful Order ---");
        System.out.println("Ingredients: " + customerOrder1.getDescription());
        System.out.println("Total Cost: ₱ " + customerOrder1.getCost());
        System.out.println("-----------------------------");
    }
}