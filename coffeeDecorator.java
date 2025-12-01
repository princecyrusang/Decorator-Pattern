public abstract class coffeeDecorator implements Coffee {
    protected Coffee wrappedCoffee;

    public coffeeDecorator(Coffee coffee) {
        this.wrappedCoffee = coffee;
    }
    public double getCost() {
        return wrappedCoffee.getCost();
    }
    @Override
    public String getDescription() {
        return wrappedCoffee.getDescription();
    }
}