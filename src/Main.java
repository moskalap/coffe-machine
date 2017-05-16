/**
 * Created by przemek on 16.05.17.
 */
public class Main {
    public static void main(String[] args){
        CoffeeMachine coffeeMachine = new CoffeeMachine(20);
        try {

            coffeeMachine.insertCoin();
            coffeeMachine.insertCoin();


        } catch (CoffeeMachineException e) {
            System.out.println(e.toString());
        }
    }
}
