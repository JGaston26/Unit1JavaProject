import java.util.Scanner;
public class Unit1Project {
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        Menu menu = new Menu();

        System.out.println("Welcome to the Krusty Krab, home of the Krabby Patty!");
        System.out.print("How many people are in your group: ");
        int numPpl = scan.nextInt();


        System.out.print("What is the tip percentage: ");
        int tipPercent = scan.nextInt();
        double price = 0;
        String cost = "";
        double totalPrice = 0.0;
        while (!cost.equals("End"))
        {
            menu.printMenu();
            System.out.print("Enter item on menu(type End to end): ");
            cost = scan.nextLine();
            switch (cost) {
                case "Krabby Patty" -> {
                    price += 1.25;
                    System.out.println(cost);
                }
                case "Krabby Patty w/sea cheese", "Kelp Rings" -> price += 1.50;
                case "Double Krabby Patty", "Golden Loaf", "Footlong", "Medium Coral Bits", "Medium Seafoam Soda", "Kelp Shake" -> price += 2.00;
                case "Double Krabby Patty w/sea cheese" -> price += 2.25;
                case "Triple Krabby Patty", "Large Coral Bits", "Large Seafoam Soda" -> price += 3.00;
                case "Triple Krabby Patty w/sea cheese" -> price += 3.25;
                case "Krabby Meal" -> price += 3.50;
                case "Double Krabby Meal" -> price += 3.75;
                case "Triple Krabby Meal" -> price += 4.00;
                case "Salty Sea Dog" -> price += 1.25;
                case "Golden Loaf w/sauce" -> price += 2.50;
                case "Small Coral Bits", "Small Seafoam Soda" -> price += 1.00;
                case "Kelp Rings w/ salty sauce" -> cost += 2.00;
            }
            totalPrice += price;
            System.out.println(totalPrice);

        }
        totalPrice = totalPrice/2;
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