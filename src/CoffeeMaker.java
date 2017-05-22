import java.util.concurrent.TimeUnit;


public class CoffeeMaker {

    CoffeeMaker(){

    }

    public void makeCoffee(){

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
    }
}
