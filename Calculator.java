public class Calculator{

    public static int divide(int number1, int number2){
        return number1/number2;
    }
    public static int add(int firstNumber, int secondNumber){
        return firstNumber+secondNumber;
    }

    public static void main(String[] args) {
        int firstNumber = 2;
        int secondNumber = 5;
int number1 = 10, number2 = 20;
        divide(number1, number2);
        int addedNumber  = add(firstNumber, secondNumber);
        System.out.println("The added number is: " + addedNumber);
    }
}