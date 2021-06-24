package lambda;

public class CalculatorImpl {

    public static void main(String[] args) {

        /*Calculator calculator = () -> System.out.println("Switch On");

        calculator.switchOn();*/


        /*Calculator calculator = input -> System.out.println("Sum: " + input);

        calculator.sum(6);*/

        Calculator calculator = (i1, i2) -> {
            if (i2 < i1) {
                throw new RuntimeException("message");
            } else {
                return i1 + i2;
            }
        };

        System.out.println("Sum: " + calculator.subtract(66,10));

    }
}
