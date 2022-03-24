public class Main {
    public static void main(String[] args) {

        /**
         * Here we create 4 instance of the Calculator class with its constructor.
         * Print the result to the console, which come from the calculate() method.
         */

        Calculator calculatorSum = new Calculator(3,3,"sum");
        System.out.println(calculatorSum.calculate() + "");

        Calculator calculatorDiv = new Calculator(4,2,"div");
        System.out.println(calculatorDiv.calculate() + "");

        Calculator calculatorSub = new Calculator(11,6,"sub");
        System.out.println(calculatorSub.calculate() + "");

        Calculator calculatorMulti = new Calculator(3,12,"multi");
        System.out.println(calculatorMulti.calculate() + "");
    }
}
