public class Main {
    public static void main(String[] args) {

        Coffee myCoffee = new RegularCoffee();
        System.out.println("Cost of regular coffee: $" + myCoffee.cost());

        Coffee coffeeWithMilk = new MilkDecorator(myCoffee);
        System.out.println("Cost of coffee with milk: $" + coffeeWithMilk.cost());

        Coffee coffeeWithSugar = new SugarDecorator(myCoffee);
        System.out.println("Cost of coffee with sugar: $" + coffeeWithSugar.cost());

        Coffee coffeeWithMilkAndSugar = new SugarDecorator(new MilkDecorator(myCoffee));
        System.out.println("Cost of coffee with milk and sugar: $" + coffeeWithMilkAndSugar.cost());
    }
}