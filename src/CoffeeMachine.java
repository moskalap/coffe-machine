public class CoffeeMachine {
    private int coffeeLimit;
    private MoneyContainer moneyContainer;
    private CoffeeMaker coffeeMaker;
    private boolean coffeeReady;

    CoffeeMachine(int coffeeLimit) {
        this.moneyContainer = new MoneyContainer();
        this.coffeeMaker = new CoffeeMaker();
        this.coffeeLimit = coffeeLimit;

    }

    public int getCoffeeLimit() {
        return coffeeLimit;
    }

    public void setCoffeeLimit(int coffeeLimit) {
        this.coffeeLimit = coffeeLimit;
    }

    public void insertCoin(double c) {
        if (coffeeLimit == 0) {
            System.out.println("Coffee limit exceeded!");
            return;
        }

        try {
            this.moneyContainer.insertCoin(c);
        } catch (CoffeeMachineException e) {
            System.out.println(e.toString());
        }

    }

    public void retrieveCoin() {
        try {
            this.moneyContainer.retrieveCoin();
        } catch (CoffeeMachineException e) {
            System.out.println(e.toString());
        }

    }

    public void pushButton() {
        try {
            if (!this.moneyContainer.isCoin()) {
                System.out.println("There is no coin!");
                return;
            }
            if (coffeeReady) {
                System.out.println("There is already coffee to take");
                return;
            }

            this.coffeeMaker.makeCoffee();

            this.moneyContainer.makeTransaction();
        } catch (CoffeeMachineException e) {
            System.out.println(e.toString());
        }
        this.coffeeLimit--;
        this.coffeeReady = true;


    }

    public void getCoffee() {
        if (!coffeeReady) {
            System.out.println("You have to first make a coffee");
            return;
        }
        this.coffeeReady = false;
        System.out.println("Enjoy your coffee!");
    }

    public void supplyCoffee(int l) {
        this.coffeeLimit += l;
    }
}