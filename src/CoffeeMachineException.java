/**
 * Created by przemek on 16.05.17.
 */
public class CoffeeMachineException extends Exception {
    public CoffeeMachineException() { super(); }
    public CoffeeMachineException(String message) { super(message); }
    public CoffeeMachineException(String message, Throwable cause) { super(message, cause); }
    public CoffeeMachineException(Throwable cause) { super(cause); }
}
