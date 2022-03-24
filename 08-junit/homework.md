###### Test Automation Mentoring Program 2021

## Module 08 - Junit

### Homework
_Precondition:_
[Set up Maven](https://www.tutorialspoint.com/maven/maven_environment_setup.htm)

Firstly get familiar with the [BankAccount](BankAccount) application. It has sample Main class and JavaDocs to describe how it is working.
Create some unit tests in the expected way:
* Use assertions to validate
* Use annotations to dedicate test methods @Test 
* Prepare the starting states (if you need a new instance of the BankAccount) e.g @Before
* Report about the final states to the console (with the getAccountDetails) e.g. @After
* Use both constructors of the BankAccount

1. Convert BankAccount project into a Maven project.
   * Add a pom.xml file with required dependencies (junit-jupiter).
2. Write unit tests to cover debit and credit methods of BankAccount, you can use the getAccountDetails to validate.
3. Write unit test to cover AccountFrozenException.
4. Collect your test methods in separate classes according to what are you testing
   * (e.g. one test class for the test methods of the credit, one test class for the debit and another where you has test methods of the AccountFrozenException)
5. Add build plugin (maven-surefire-plugin) to pom.xml file.
6. Run the tests from command line using maven, save the output and push it to you git repository.

#### Evaluation Criteria
* 0 point: No homework provided
* 3 points: Tasks #1 - #4 are implemented
* 5 points: All the tasks are implemented
