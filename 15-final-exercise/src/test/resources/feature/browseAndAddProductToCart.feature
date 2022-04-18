Feature: Browse and add product to cart

  Scenario: Adding casual dress to cart
    Given I navigate to http://automationpractice.com/index.php url
    And I click on Casual Dresses in menu
    When click on add to cart button for the first product
    Then the expected product Printed Dress is added to the cart

  Scenario: Proceed with checkout
    Given I navigate to http://automationpractice.com/index.php?id_category=9&controller=category url
    And click on add to cart button for the first product
    And the expected product Printed Dress is added to the cart
    When click on proceed to checkout button
    Then the expected product Printed Dress and quantity is 1 is in the cart