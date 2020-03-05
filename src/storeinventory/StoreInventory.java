package storeinventory;

/******************************************************************************
 * StoreInventory.java 
 * Programmer: @author jcboyd
 * Version: 1.0
 * Course: SDEV 2210
 *
 * This program keeps track of a store inventory and allows the user to 
 * purchase items from inventory
 *****************************************************************************/

import java.util.Scanner;

public class StoreInventory 
{
    public static void main(String[] args) 
    {
        Scanner stdIn = new Scanner(System.in);
        String name;
        int quantity;
        double cost;
        String keepSelling;
        System.out.println("Ch 9 Inventory by JC Boyd\n");
        Store store = new Store(); //instantiate and fill inventory
        store.display();
        do
        { //loop to sell items from inventory
            System.out.print("Which item? ");
            name = stdIn.nextLine();
            System.out.print("How many? ");
            quantity = stdIn.nextInt();
            stdIn.nextLine(); //flush newline
            //sell
            cost = store.sell(name, quantity); 
            if (cost == 0)
            {
                System.out.println("We don't have that quantity to sell");
            }
            else
            {
                System.out.printf("Cost: $%7.2f\n", (cost * quantity));
            }
            store.display(); //display inventory after each transaction
            System.out.print("Continue? "); //user exit if desired
            keepSelling = stdIn.nextLine();
        } while(keepSelling.equalsIgnoreCase("y")); //end do-while

    } //end main
    
} //end class StoreInventory
