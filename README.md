# StoreInventoryProject
SDEV 2210 Project. In this project, you will work with a store’s inventory – entering items with price and quantity, then allowing the user to purchase items. The Sales Clerk example in the book can be a guide for this exercise. There will be 2 classes and a driver class. One class describes a single item in inventory. One class describe the inventory of a store, multiple items stored in an array.  Create a class named Inventory, which has instance variables for the name, price and quantity of each inventory item. The constructor needs 3 parameters, one for each instance variable. Include separate methods to get the name, the price, and the quantity of an item. Create a method to display an item, with its name, price, and quantity on the same line – return the string with this data, do not print to the screen in this method. Create a method to sell, which needs as a parameter the quantity of this item being purchased, and returns the price of the item, the instance variable for price of a single item (not the cost of this item times the quantity purchased in this sale). In this method, test if there is enough of the item in inventory for the purchase, and if there is, subtract the quantity from the inventory and return the item’s price. If there is not enough quantity, return a value of 0 – this price of zero means the purchase was not completed.  Create a class named Store, which uses an array to hold the inventory for its items. This class needs instance variables for the size of the inventory – for this exercise, initialize that value to 2, but be sure to use the variable in the code, do not hard-code the value of 2 anywhere else, only as the initialization value. The class also needs an instance variable for an array of Inventory items – declare its name and type in the method variables only. In the constructor, allocate the space for the array using the size variable. This allows for future modification of the program, where the user can specify how many items are in inventory. If the size is not known until after the user provides the number, then the array can’t be allocated until after that interaction occurs. That is, you can’t write the combined declaration and allocation of the array in one line of code – you have to declare it with the method variables, and allocate it (using the “new” keyword) in the constructor. The constructor needs to ask the user for the name of each inventory item, price, and quantity, and use that data to construct an item and store the it in the array. If you look at the Sales Clerk example in the book, you will see this same logic.  The Store class also needs methods to find an item in the array, display an item, and sell an item. When trying to find an item in the inventory, return either the index into the array where it exists, or -1 if it is not found. In the method to display, use a For-Each loop to call the method in the Inventory class for displaying the data for an item – note this MUST be a For-Each loop, not a regular For loop. In the method to sell an item, first find the item, and if it is found, call the method in the Inventory class that sells a quantity of an item and returns its price. If the item is not found, print a message that the item can’t be found, and return a value of 0 (a price of 0 means it wasn’t found or the item doesn’t have enough quantity for the sale).  In the driver class, instantiate a Store variable. That will call the constructor in Store that will ask the user about the items and fill the array of inventory items. Then call the method to display the inventory. In a loop, ask the user which item they want to purchase and the quantity. Call the sell method in the Store class, which will need the name of the item and the quantity to purchase, and which returns the price of the item, so call this method in an assignment statement, assigning the results to a cost variable. If the cost is 0, print a message that there is not sufficient quantity for that sale, or print the cost of the purchase (price * quantity). Then ask if the user wants to continue. Be sure to format the cost as a money transaction (dollar sign, 2 decimal places).  Note that when the inventory is displayed after a sale, it will show a smaller quantity of that item in inventory. Note that there are 2 methods named display() and 2 methods named sell(). There is no conflict and they are not overloaded because they are in different classes. The sell() method in the Store class needs to display an error message to the user if the item was not found in the inventory.  Note that there is no method in the Inventory class that uses the keyboard or screen. The Store class asks the user for inventory information and also displays the inventory on the screen.  The driver class works in a loop to ask the user which item and the quantity of the purchase. If the item exists and there is sufficient inventory, the price for a single item is returned by the sell() method. A price of 0 means there was not enough inventory for that quantity of purchase. If the price is not 0, the driver class calculates the purchase cost of (quantity * price) and displays that. The inventory is displayed, and should show a different quantity if the purchase was successful. The user is asked if they want to continue; if yes, repeat the loop; if no, close the program. Notice that this sample session tests all of the possible paths of execution – invalid item name, invalid quantity, valid item name, valid quantity.  Take screenshots of the execution that matches the sample session. Then change the size of the inventory array to 3, add another inventory item, and test all the paths of execution. Take screenshots of that session.     Submission: the specified screenshots, and the root folder for the project     Pay careful attention to the rubric for this assignment. Remember the standards that apply to every project.  Note that you must use correct formatting in the code -- appropriate indentation is most important. You can use Shift-Alt-F to have NetBeans automatically format the code correctly. If the formatting is incorrect, it will be returned to you for changes with a grade of zero.  Note: You need to submit the whole project for these assignments. In File Explorer, go to the location where you created the project. There will be a folder with the name of your project -- that is the root folder of the project.  If you submit the root folder of the project, the instructor can run it on a different machine to grade it. If you don't submit the proper folder, it won't run on another machine, and the assignment will be marked with a zero.
