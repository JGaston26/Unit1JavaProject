public class Menu {

    //private String menuItems;
    public Menu()
    {
        //this.menuItems = menuItems;
    }

    public String printMenu()
    {
        System.out.println("Krabby Patty…………...1.25         Krabby Meal…………….. 3.50");
        System.out.println(" 	w/sea cheese…. 1.50			Double Krabby Meal…… 3.75");
        System.out.println("Double Krabby Patty….. 2.00     Triple Krabby Meal…...... 4.00");
        System.out.println("    w/sea cheese…. 2.25         Salty Sea Dog………….. 1.25");
        System.out.println("Triple Krabby Patty……. 3.00     Footlong…………………. 2.00");
        System.out.println("    w/sea cheese…. 3.25         Sailors Surprise……….... 3.00");
        System.out.println("                                Golden Loaf…………...… 2.00");
        System.out.println("Coral Bits                          w/sauce ……...…...2.50");
        System.out.println("Small…………………….1.00");
        System.out.println("Medium………………….2.00              Kelp Shake………………...2.00");
        System.out.println("Large…………………….3.00");
        System.out.println("Seafoam Soda");
        System.out.println("                                Small………………….........1.00");
        System.out.println("Kelp Rings………………1.50            Medium……………...……..1.25");
        System.out.println("  w/Salty sauce…….0.50          Large……………………….1.50");
        return null;
    }

    public double giveCost(double cost,String item)
    {
        cost = 0.00;
        if(item.equals("Krabby Patty"))
        {
            cost += 1.25;
            System.out.println(cost);
        }else if(item.equals("Krabby Patty w/sea cheese")){
            cost += 1.50;
        } else if (item.equals("Double Krabby Patty")) {
            cost += 2.00;
        } else if (item.equals("Double Krabby Patty w/sea cheese")) {
            cost += 2.25;
        }else if(item.equals("Tripple Krabby Patty")){
            cost += 3.00;
        }else if (item.equals("Tripple Krabby Patty w/sea cheese")) {
            cost += 3.25;
        } else if (item.equals("Krabby Meal")) {
            cost += 3.50;
        } else if (item.equals("Double Krabby Meal")) {
            cost += 3.75;
        } else if (item.equals("Triple Krabby Meal")) {
            cost += 4.00;
        } else if (item.equals("Salty Sea Dog")) {
            cost += 1.25;
        } else if (item.equals("Footlong")) {
            cost += 2.00;
        } else if (item.equals("Golden Loaf")) {
            cost += 2.00;
        } else if (item.equals("Golden Loaf w/sauce")) {
            cost += 2.50;
        } else if (item.equals("Small Coral Bits")) {
            cost += 1.00;
        }else if (item.equals("Medium Coral Bits")) {
            cost += 2.00;
        }else if (item.equals("Large Coral Bits")) {
            cost += 3.00;
        } else if (item.equals("Small Seafoam Soda")) {
            cost += 1.00;
        }else if (item.equals("Medium Seafoam Soda")) {
            cost += 2.00;
        }else if (item.equals("Large Seafoam Soda")) {
            cost += 3.00;
        }else if (item.equals("Kelp Shake")) {
            cost += 2.00;
        } else if (item.equals("Kelp Rings")) {
            cost += 1.50;
        } else if (item.equals("Kelp Rings w/ salty sauce")) {
            cost += 2.00;
        }
        return cost;
    }
}
