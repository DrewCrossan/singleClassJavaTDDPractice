public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private double firstDouble;
    private double secondDouble;

    public Calculator(int firstNumber, int secondNumber, double firstDouble, double secondDouble){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.firstDouble = firstDouble;
        this.secondDouble = secondDouble;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int addFirstAndSecondNumber() {
        return firstNumber + secondNumber;
    }

    public int subtractFirstAndSecondNumber() {
        return firstNumber - secondNumber;
    }

    public int multiplyFirstAndSecondNumber() {
        return firstNumber * secondNumber;
    }

    public double divideFirstAndSecondNumber() {
        return firstDouble / secondDouble;
    }
}
