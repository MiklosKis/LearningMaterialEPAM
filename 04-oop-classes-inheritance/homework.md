###### Test Automation Mentoring Program 2021

## Module 04 - OOP, Classes, Inheritance

### Homework

#### Create an application with the details below:

1. Create "Product" class
    * All products have "name" and "price"

2. Create "Book" class
    * It should be the child class of the Product class
    * All books also have "title" and "author"

3. Create "Clothes" class
    * It should be the child class of the Product class
    * All clothes also have "size" and "colour"

4. Create "OrderItem" class
    * It represents the product and the quantity of the ordered item 
    * So all orderItems have "product" and "quantity"

5. Create "Order" class
    * It contains an array, which type is OrderItem. This array represents the ordered items. Assume that elements of the array will not refer to the same product - no need to verify/validate
    * Create a method "add" with "product" and "quantity" parameters to add an "OrderItem" to the array of OrderItem. You don't have to check that item has already been added to the array.
    * Create a method "add" with one parameter "product". Same function as before, reuse the previous "add" method with quantity=1.
    * Create a method "modify" to update the quantity of the "OrderItem" in the array, based on the provided product name. Assume that a Product is added at most once to the array - no need to validate.
    * Create a method "remove" delete an OrderItem from the array, based on the provided product name. Assume that a Product is added at most once to the array - no need to validate.
    * Create a method "placeOrder" to print the name, quantity and the price of each "OrderItem" from the array, and the total price of the order to the console.

6. Create "Booking" class
    * All bookings have "description" and "fee" of the accommodation.
    * Create a method "printPaymentInstructions" to print a message to the console: "In order to complete your reservation you need to transfer a deposit of _amount_  HUF to the following account xxx".
 The _amount_ is calculated as 10% of the total accommodation fee + 1000. e.g. total accommodation cost is 120.000 HUF. The application calculates the deposit = 120.000 HUF * 10% + 1000 HUF=13.000 HUF. Accordingly, printPaymentInstructions displays the following message: "In order to complete your reservation you need to transfer a deposit of: 13000 HUF to the following account xxx"

7. "Order" class
    * Create a method "printPaymentInstructions" to print a message to the console: "Please transfer _amount_ HUF to the following account: xxx". Replace amount with the total price of the order.

8. Create "PaymentItem" class
    * It should be the parent class of the Booking and Order class
    * "Make" the "printPaymentInstructions" method common here.

#### Here is an example of [Main](Main.java) class which should be executed without any failures if You implemented the above.

* ***BONUS:*** *Print out all details of the ordered items. E.g.: In case of books - Title and Author (and all the above details). You can override the toString method for Product, derived classes, OrderItem and Order class as well.*
* ***BONUS:*** *Create your own main function, try playing around with it using the implemented methods. Try out different use cases. Prepare your application for negative scenarios as well and test it from main. E.g.: When you try to remove or update an item that has not been ordered, then print out a proper message to the console.*

### Evaluation Criteria
- **0 point:** Only 1-4 steps completed or no homework provided
- **3 points:** At least steps 1-5 completed
- **5 points:** All mandatory steps completed (1-8)
