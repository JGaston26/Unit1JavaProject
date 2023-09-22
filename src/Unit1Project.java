import java.util.Scanner;
public class Unit1Project {
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group: ");
        int numPpl = scan.nextInt();

        System.out.print("What is the tip percentage: ");
        int tipPercent = scan.nextInt();
        double cost = 0;
        double totalPrice = 0.0;
        while (cost != -1)
        {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            cost = scan.nextDouble();
            totalPrice += cost;

        }
        totalPrice ++;
        System.out.println("-----------------------");
        System.out.println("Total bill before tip: $" + String.format("%.2f",totalPrice));
        System.out.println("Total percentage: " + tipPercent + "%");

        double realPercent = (double) tipPercent/100;
        double tipAmount = totalPrice * realPercent;
        double totalAndTip = totalPrice + tipAmount;
        double perPersonNoTip = totalPrice/numPpl;
        double tipPerPerson = tipAmount/numPpl;
        double perPerson = totalAndTip/numPpl;

        System.out.println("Total tip: $" + String.format("%.2f", tipAmount));
        System.out.println("Total bill with tip: $" + String.format("%.2f", totalAndTip));
        System.out.println("Per person cost before tip: $" + String.format("%.2f", perPersonNoTip));
        System.out.println("Tip per person: $" + String.format("%.2f", tipPerPerson));
        System.out.println("Total cost per person: " + String.format("%.2f", perPerson));

    }

}