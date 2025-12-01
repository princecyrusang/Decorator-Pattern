public class WhippedCream extends coffeeDecorator {
    private final double ADDITION_COST = 30.00;

    public WhippedCream(Coffee coffee) {
        super(coffee);
    }
    @Override
    public double getCost() {
        return super.getCost() + ADDITION_COST;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + ", Whipped Cream";
    }
}