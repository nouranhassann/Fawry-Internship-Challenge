# Fawry-Internship-Challenge
Developer Info:
• Name: Nouran Hassan
• Track: Full Stack Development – Java
• Submission Date: July 4, 2025
 Challenge Summary:
Design and implement a basic E-Commerce System with the following features:
- Define multiple types of products:
  - Some are expirable (e.g., Cheese, Biscuits).
  - Some require shipping and have weights.
  - Others do not expire and do not need shipping (e.g., Mobile Scratch Card).
- Allow customers to:
  - Add products to cart with limited quantity.
  - Perform a checkout process that includes:
    - Subtotal, shipping cost, total amount paid.
    - Remaining customer balance.
    - Shipment details (if applicable).
  - Error handling for:
    - Empty cart.
    - Expired products.
    - Out-of-stock.
    - Insufficient balance.
What did I use :
- OOP Principles (Inheritance, Polymorphism, Encapsulation)
- Interfaces
- Lists
- Basic Error Handling
- Simple Business Logic to count balance,
 Test Scenario:
cart.add(cheese, 2);
cart.add(biscuits, 1);
checkout(customer, cart);
 Console Output:
** Shipment notice **
2x Cheese
1x Biscuits
400g
700g
Total package weight 1.10kg

** Checkout receipt **
2x Cheese
200.00
1x Biscuits
150.00
-----------------------------
Subtotal: 350.00
Shipping: 30.00
Amount Paid: 380.00
Remaining Balance: 620.00

Project Structure:
/src
  ├── Main.java
  ├── Product.java
  ├── Cheese.java
  ├── Biscuits.java
  ├── TV.java
  ├── MobileScratchCard.java
  ├── Shippable.java
  ├── Customer.java
  ├── Cart.java
  ├── CartItem.java
  ├── ECommerceSystem.java
  └── ShippingService.java
 How to Run:
• Compile and run Main.java.
• Output will be printed to console as described.

Thank you for reviewing my submission!

Best regards,
Nouran Hassan
