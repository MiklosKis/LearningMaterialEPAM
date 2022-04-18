Feature: Search and verify content

  Scenario Outline: Verify search result for <item>
    Given I navigate to http://automationpractice.com/index.php url
    And I type in <item> in the searchbar
    When click the search button
    Then the search result will match the <item> searched term

    Examples:
    | item    |
    | shirt   |
    | blouse  |
    | chiffon |

  Scenario Outline: Compare if search result name and price with product detail name and price
    Given I navigate to http://automationpractice.com/index.php url
    And I type in <item> in the searchbar
    And click the search button
    When click on the see more button for the first product
    Then on the product details page the product name is <name> as expected
    And the product price is <price> on the product detail page as expected

    Examples:
    | item    | name                         | price     |
    | shirt   | Faded Short Sleeve T-shirts  | $16.51    |
    | blouse  | Blouse                       | $27.00    |
    | chiffon | Printed Chiffon Dress        | $16.40    |