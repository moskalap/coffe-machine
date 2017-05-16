/**
 * Created by przemek on 16.05.17.
 */
public class CoffeeMachine {
    private int coffeLimit;
    private boolean isCoin = false;
    private boolean coffeeReady;

    CoffeeMachine(int coffeLimit){
        this.coffeLimit=coffeLimit;
    }

    public int getCoffeLimit() {
        return coffeLimit;
    }

    public void setCoffeLimit(int coffeLimit) {
        this.coffeLimit = coffeLimit;
    }
    public void insertCoin() throws CoffeeMachineException{
        if (this.isCoin) throw new CoffeeMachineException("There is a coin inside a machine already");
        else{
            System.out.println("Inserted a coin!");
            this.isCoin = true;

        }
    }
    public void retrieveCoin() throws CoffeeMachineException{
        if (isCoin){
            isCoin = false;
            System.out.println("Returned the coin!");
        }
        else{
            throw new CoffeeMachineException("There is no coin in coffe machine!");
        }
    }
    public void pushButton(){
        //TODO

    }
    public void makeACoffe(){
        //TODO
    }
}
