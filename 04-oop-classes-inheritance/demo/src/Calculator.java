/**
 * This is a simple calculator class, which has 3 fields:
 * first and second number of the operation, and the short name of the operation as operator like:
 * sum, div, sub, multi
 */
public class Calculator {

    private int firstNumber;
    private int secondNumber;

    private String operator;

    /**
     * A public constructor of the Calculator class which initialize the three fields of the class above,
     * We usually use this with *new* keyword to create a new object/instance of the class
     * @param firstNumber
     * @param secondNumber
     * @param operator
     */
    public Calculator(int firstNumber, int secondNumber, String operator) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operator = operator;
    }

    /**
     * A public method of the Calculator class.
     * This decides which operation should be executed on the basis of the operator field.
     * And call that method which do that operation and save the result of the operation to its own *result* local field.
     * In the end it return with this *result* field.
     * @return
     */
    public int calculate(){

        int result = 0;

        if(operator == "sum"){
            result = sum();
        } else if(operator == "div") {
            result = div();
        } else if(operator == "sub"){
            result = sub();
        } else if(operator == "multi") {
            result = multi();
        }

        return result;
    }

    /**
     * These four privet methods do the exact operation on the two number fields of the class.
     * And return with the result of the operation. Because of it is a simple one line operation
     * no need to use a local field to store the result like the *calculate()* method above.
     * These return with the operation directly.
     * @return
     */

    private int sum(){
        return firstNumber + secondNumber;
    }

    private  int div(){
        return firstNumber / secondNumber;
    }

    private int sub(){
        return firstNumber - secondNumber;
    }

    private int multi(){
        return firstNumber * secondNumber;
    }
}
