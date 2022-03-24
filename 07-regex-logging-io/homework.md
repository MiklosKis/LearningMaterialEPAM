###### Test Automation Mentoring Program 2021

## Module 07 - IO, logging, regex

##### Homework
1. Create a new IntelliJ project for module 8
2. Create a _FileHandler_ class that has its own logger instance
3. Implement _readFromFile(String path)_ method in _FileHandler_ that is able to provide the content of the file (specified by _path_ parameter) as a String object
  * It's up to you whether classes of _java.io_ or _java.nio_ package are used
  * Catch exceptions thrown by the chosen solution and create meaningful log messages with the proper log level
  * Don't forget to close your reader instance (both _close() in 'finally' block_ and _try-with-resources_ solutions are accepted)
4. Create a _Main_ class that has its own logger instance
5. Create a new _FileHandler_ object instance in the _main(String[] args)_ method of the _Main_ class
6. Use the _readFromFile(String path)_ of the previously created _FileHandler_ instance to read the content of the provided [_input.txt_](https://gitbud.epam.com/Kornel_Kala/tam-sze-2020/blob/master/08-regex-logging-io/input.txt)  
  * Value of the _path_ parameter should be the absolute path of the downloaded [_input.txt_](https://gitbud.epam.com/Kornel_Kala/tam-sze-2020/blob/master/08-regex-logging-io/input.txt) (e.g. _C:\Downloads\input.txt_)
  * For further usage, store the extracted file content in a String variable
7. Construct a regular expression that matches only alphabet characters (a-z and A-Z) and apply it on the String variable that stores the content of the [_input.txt_](https://gitbud.epam.com/Kornel_Kala/tam-sze-2020/blob/master/08-regex-logging-io/input.txt)
   (be careful, there are more than one alphabet characters in the input)
8. Define an empty String variable then append all the matching characters to its value
9. Display the value of this String variable, use the logger of the _Main_ class and INFO log level instead of System.out.print(ln)
10. Extend _FileHandler_ class with _writeToFile(String path, String content)_ method that writes the provided String content to the file specified by its path
  * It's up to you whether classes of _java.io_ or _java.nio_ package are used
  * Catch exceptions thrown by the chosen solution and create meaningful log messages with the proper log level
  * Don't forget to close your writer instance (both _close() in 'finally' block_ and _try-with-resources_ solutions are accepted)
11. Go back to the _Main_ class and use the implemented _writeToFile(String path, String content)_ method to write the value of the recently created String variable (that contains all the matching characters) to an output file


##### Evaluation Criteria
* 0 point: No homework provided
* 3 points: Tasks #1 - #9 are implemented (read from file + logging + regex)
* 5 points: All the tasks are implemented (read from file + logging + regex + write to file)
