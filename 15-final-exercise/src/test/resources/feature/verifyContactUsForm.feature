Feature: Contact Us form

  Scenario: Verify successful contact us form submission
    Given I navigate to http://automationpractice.com/index.php url
    When I click on Contact us link
    And fill out the form with valid data
    And click on send button
    Then the Your message has been successfully sent to our team. success message is displayed