###### Test Automation Mentoring Program 2021

## Module 05 - Java Collections

### Homework
1.  Create a new IntelliJ project for module 5.
2.  Create an enumeration called *CountryCodes* in the package _com.epam.training.testautomation.collections_.
  * It should contain at least 2 countries with their country codes (e.g. _HUNGARY_ with the value 36 and _NORWAY_ with the value 44).
  * Make the enumeration return the country code (e.g. 36) when you use e.g. _CountryCode.HUNGARY_, instead of the enum constant ordinal (aka the index number within the enumeration starting from 0).
3.  Create a class called *Order* in the package _com.epam.training.testautomation.collections_.
  * Every order has:
    * its own id as int,
    * its own description as String
  * Override its _toString()_ method. You can auto-generate it within IntelliJ.
  * Create a list of orders in the already existing _Test_ class. Add a few orders to this list. Remove at least 1 order from the list. Print out the content of the list of orders.
4.  Create a class called *TelephoneBook* in the package _com.epam.training.testautomation.collections_.
  * Assume that anyone can own multiple telephone numbers, and every telephone number belongs to 1 owner only.
  * Every telephone book has:
    * its own a country code (e.g. 36) as int,
    * its own map of name-number pairs as Map<String, String> (you have to decide whether the name or the telephone number should be the key)
    * a common String called _PRINTED_BY_TEXT_, which stands for the text the printer-office prints onto every one of their printed telephone books. This text is common, no difference there is between any of the books. Something like "This telephone book was printed by Awesome Prints, Co.".
  * Every telephone number has the same structure: + COUNTRY_CODE_HERE TELEPHONE_BASE_NUMBER_HERE without the spaces, e.g. +36301234567, but the map should store only the base number (e.g. 301234567).
  * Implement the _add(String name, String number)_ method which adds the specified entry to the map, if neither of them is null and the entry is not yet existing in there.
  * Implement _remove(String number)_ method which removes the entry from the map, which has the specified number, if it's not null and it already exists in there.
  * Implement _printBook()_ method which prints the common _PRINTED_BY_TEXT_ and then every entry of the map in some readable way, including the + and the country code too (e.g. +36301234567). For example, but it's not required to be the same:
`This telephone book was printed by Awesome Prints, Co.
Lajos Kovacs: +36301111111
Steve Jobs: +36304444444
Pal Toth: +36302222222`
5.  Create a class called *Brainstorming* in the package _com.epam.training.testautomation.collections_. A brainstorming object represents a set of ideas.
  * Every idea should be added to a brainstorming session only once.
  * Implement _addIdea(String idea)_ method which adds the idea to the set if it's not null and if it's not in there yet.
  * Implement _removeIdea(String idea)_ method which removes the idea from the set if it's not null and if it's already existing in there.
  * Implement _getNumberOfIdeas()_ function which returns how many ideas came up during the brainstorming, as int.
  * Override the _toString()_ method which:
    * a) returns ``"No ideas."`` String if there was none, or
    * b) returns the list of ideas in some readable format including the number of ideas as well. For example but it's not required to be the same:
`We have this amount of ideas: 2
Brainstorming ideas:
  Fluorescent plastic skeletons
  Cherry juice as blood`
6.  Create a class called *Pet* in the package _com.epam.training.testautomation.animals_.
  * This class should not be instantiated.
  * Every pet should have its own name as String.
  * Create the _makeSound()_ method, but as different kind of animals make sound in different ways, make it abstract.
7.  Create a class called *Cat* in the package _com.epam.training.testautomation.animals_ which extends the *Pet* class.
  * Implement the _makeSound()_ method to print the ``"CAT_NAME is meowing."`` text and
  * create the _lookingForMice()_ method which prints the ``"CAT_NAME is looking for mice."`` text, where `CAT_NAME` is its own name.
  * Override its _toString()_ method. You can auto-generate it within IntelliJ.
8.  Create a class called *Dog* in the package _com.epam.training.testautomation.animals_ which extends the *Pet* class.
  * Implement the _makeSound()_ method to print the ``"DOG_NAME is barking."`` text, where `DOG_NAME` is its own name.
  * Override its _toString()_ method. You can auto-generate it within IntelliJ.


### Evaluation criteria
  * **0 point:** No homework provided, or less than 5 tasks were implemented.
  * **3 points:** 5-7 tasks were implemented.
  * **5 points:** All 8 tasks were implemented.
