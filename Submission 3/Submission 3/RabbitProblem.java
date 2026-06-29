import java.util.Scanner;

public class RabbitProblem {

    public static int calculateRabbitPairs(int numMonths) {
        if (numMonths <= 2) {
            return 1;
        }
        return calculateRabbitPairs(numMonths - 1) + calculateRabbitPairs(numMonths - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of months: ");
        int targetMonth = scanner.nextInt();

        int result = calculateRabbitPairs(targetMonth);
        System.out.println("Number of rabbit pairs: " + result);
        
        scanner.close();
    }
}
