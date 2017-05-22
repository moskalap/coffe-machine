
public class MoneyContainer {
    private double sum;
    private double coin;
    private boolean isCoin = false;

    public void insertCoin(double c) throws CoffeeMachineException {

        if (this.isCoin) throw new CoffeeMachineException("There is a coin inside a machine already");
        else {
            System.out.println("Inserted a coin!");
            this.isCoin = true;
            this.coin = c;

        }
    }

    public void retrieveCoin() throws CoffeeMachineException {
        if (this.isCoin) {
            isCoin = false;
            System.out.println("Returned the coin!");
        } else {
            throw new CoffeeMachineException("There is no coin in coffe machine!");
        }
    }

    public void makeTransaction() throws CoffeeMachineException {
        if(this.isCoin){
            this.sum += this.coin;
            this.isCoin = false;
        }
        else throw new CoffeeMachineException("Can not make a transaction!");
    }
    public double getMoney(){
        double sum = this.sum;
        this.sum = 0;
        return sum;
    }

    public boolean isCoin() {
        return isCoin;
    }
}
