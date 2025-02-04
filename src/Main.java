//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int cardBal = 5000;
        double intRate = 0.17;
        double firstInt = 0.00;
        double firstMonth = 0.00;
        double secondInt = 0.00;
        double secondMonth = 0.00;
            firstInt = cardBal * intRate;
            firstMonth = cardBal + firstInt;
            System.out.println("Your balance after the first month is " + firstMonth);
            secondInt = firstMonth * intRate;
            secondMonth = firstMonth + secondInt;
            System.out.println("Your balance after the second month is " + secondMonth);
    }
}