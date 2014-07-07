java-technical-test
===================

Java programming questions.

## Instructions

1. Clone this git repository which contains a number of Java source files and open as a project in your editor of choice.
2. Answer the three questions listed below by providing the missing implementations.  Do NOT use 3rd party libraries.
3. Provide tests in your preferred style to support your solution.  You can use common test libraries such as junit and mockito.
4. Zip up and email the entire source tree to paul@solidstategroup.com

**Note: Please do NOT spend more than 2 hours on this test.**

In addition to a working solution, we will be looking for:

- Good coding style
- Use of comments - especially if you get stuck on a question
- Understanding of object orientation
- Understanding of concurrency issues that might arise

**Note: Please do not push your test answers back onto Github.**

## Question 1: Palindrome

Complete the method stub in the Palindrome class.

## Question 2: Tree Average Value

Complete the method stub in the TreeAverageValue class.

## Question 3: Parallel Multi Search

Review the Search interface.  The search method on this interface represents a generic Search.

Example concrete class: GoogleSearch - usage - search google for "London"

Review the MultiSearch class.  The aim of this class is to provide multiple searches using the same query over a
defined set of searches.  The results of all the searches are to be aggregated.

Example concrete class: SerialMultiSearch - usage - search google and yahoo searches for "London", in serial fashion

As a single search call made to a resource might take a considerable amount of time, ParallelMultiSearch
will execute all the searches in the MultiSearch in parallel to provide a quicker overall implementation.

Complete the method stub in the ParallelMultiSearch class to provide a fast implementation of the search.

Example usage: - search google and yahoo searches for "London", in parallel fashion

Note: Assume each Search is independent to the others.

Note: The order of the results returned by the MultiSearch is not important.

