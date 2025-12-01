public class blackCoffee implements Coffee {
    private final double BASE_COST = 100.00;
    @Override
    public double getCost() {
        return BASE_COST;
    }
    @Override
    public String getDescription() {
        return "Black Coffee";
    }
}