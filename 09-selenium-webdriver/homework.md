###### Test Automation Mentoring Program 2021

## Module 09 - Selenium WebDriver

### Homework
_Preconditions:_
* Download and extract the base project for the homework: [selenium-webdriver-hw.zip](selenium-webdriver-hw.zip)
  * It is a Maven project with required dependencies set in pom.xml (`selenium-java`, `junit-jupiter`)
* Download latest version of chromedriver from: https://chromedriver.chromium.org/downloads
  * Add `chromedriver.exe` to your system PATH.

_Tasks:_
1. Open the base project in your IDE, create a new junit test class and implement the test cases below.
2. Test Case 1: **Single Input Field**
    * Open page: https://demo.seleniumeasy.com/basic-first-form-demo.html
    * Enter any preferred text into the single input field
    * Click on the "Show Message" button
    * Verify that the message shown is equal to the one you have entered
3. Test Case 2: **Two Input Fields - Error Check**
    * Open page: https://demo.seleniumeasy.com/basic-first-form-demo.html
    * Enter non-numeric strings to both input fields (OR a number and a non-numeric string)
    * Click on the "Get Total" button
    * Verify that the string "NaN" is displayed as total value (NaN = Not a Number)
4. Test Case 3: **Multiple Checkbox Demo**
   * Open page: https://demo.seleniumeasy.com/basic-checkbox-demo.html
   * Click on all 4 checkboxes in the multiple checkbox form
   * Verify that all 4 checkboxes are checked
   * Verify that button text is changed to "Uncheck All"
   * Click on Option 1 to uncheck it
   * Verify that Option 1 is unchecked
   * Verify that button text is changed to "Check All"
5. Test Case 4: **Group Radio Buttons Demo**
   * Open page: https://demo.seleniumeasy.com/basic-radiobutton-demo.html
   * Click on one of the radio buttons in both groups "Sex" and "Age Group"
   * Verify that clicked radio buttons are selected
   * Click on the "Get values" button
   * Verify that message shows the selected option values
6. Test Case 5: **Select List Demo**
   * Open page: https://demo.seleniumeasy.com/basic-select-dropdown-demo.html
   * Select a day from the dropdown
   * Verify that the selected day is selected
   * Verify that the message shows the selected day item
7. Test Case 6: **JQuery UI Progress bar - Download Dialog**
   * Open page: https://demo.seleniumeasy.com/jquery-download-progress-bar-demo.html
   * Click on Start Download button
   * Verify that the download has completed ("Complete!" message is displayed)
8. Use explicit wait where you need to wait for any element to be displayed or change state.
9. Use before/after methods for starting/closing the browser.
10. Set up a selenium server and run tests against it.
    * _NOTE:_ Use RemoteWebDriver with Chrome browser capabilities

#### Evaluation Criteria
* **0 point:** No homework provided.
* **3 points:** Tasks 1-7 are completed.
* **5 points:** All the tasks are completed.
