Feature: Sign in validation

  Scenario: Verify validation message with empty email and password field
    Given I navigate to http://automationpractice.com/index.php url
    When I click on sign in link
    And on Sign in page I click on Sign in button
    Then the An email address required. validation message is displayed

  Scenario: Verify validation message with invalid email address
    Given I navigate to http://automationpractice.com/index.php?controller=authentication&back=my-account url
    When add email address test.com to email field
    And on Sign in page I click on Sign in button
    Then the Invalid email address. validation message is displayed

  Scenario: Verify validation message with incorrect password
    Given I navigate to http://automationpractice.com/index.php?controller=authentication&back=my-account url
    When add email address test@test.com to email field
    And add invalid password a01 to password field
    And on Sign in page I click on Sign in button
    Then the Invalid password. validation message is displayed