public class caramelSyrup extends coffeeDecorator {
    private final double ADDITION_COST = 40.00;

    public caramelSyrup(Coffee coffee) {
        super(coffee);
    }
    @Override
    public double getCost() {
        return super.getCost() + ADDITION_COST;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + ", Caramel Syrup";
    }
}