import java.util.concurrent.TimeUnit;


/**
 * Created by przemek on 16.05.17.
 */
public class CoffeeMachine {
    private int coffeLimit;
    private boolean isCoin = false;
    private boolean coffeeReady;

    CoffeeMachine(int coffeLimit) {
        this.coffeLimit = coffeLimit;
    }

    public int getCoffeLimit() {
        return coffeLimit;
    }

    public void setCoffeLimit(int coffeLimit) {
        this.coffeLimit = coffeLimit;
    }

    public void insertCoin() throws CoffeeMachineException {
        if (coffeLimit == 0) throw new CoffeeMachineException("Maximum coffee limit exceeded");
        if (this.isCoin) throw new CoffeeMachineException("There is a coin inside a machine already");
        else {
            System.out.println("Inserted a coin!");
            this.isCoin = true;

        }
    }

    public void retrieveCoin() throws CoffeeMachineException {
        if (isCoin) {
            isCoin = false;
            System.out.println("Returned the coin!");
        } else {
            throw new CoffeeMachineException("There is no coin in coffe machine!");
        }
    }

    public void pushButton() throws CoffeeMachineException {
        if (!isCoin) throw new CoffeeMachineException("There is no coin!");
        if (coffeeReady) throw new CoffeeMachineException("There is coffee to take");

        System.out.print("Preparing Coffee");
        for (int i = 0; i < 5; i++) {
            System.out.print(" . ");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Coffee is ready!");
        this.coffeLimit--;
        this.coffeeReady=true;
        this.isCoin=false;

    }

    public void getCoffe() throws CoffeeMachineException {
       if(!coffeeReady) throw new CoffeeMachineException("You have to first insert coin and make a coffe!");
       this.coffeeReady = false;
       System.out.println("Enjoy your coffee!");
    }

    public void supplyCoffee(int l){
        this.coffeLimit += l;
    }
}
