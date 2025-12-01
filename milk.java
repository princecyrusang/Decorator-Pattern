public class milk extends coffeeDecorator {
    private final double ADDITION_COST = 25.00;

    public milk(Coffee coffee) {
        super(coffee);
    }
    @Override
    public double getCost() {
        return super.getCost() + ADDITION_COST;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }
}