class SugarDecorator implements Coffee {
    private final Coffee coffee;

    public SugarDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return coffee.cost() + 1.0; // Add the cost of sugar to the base cost
    }
}