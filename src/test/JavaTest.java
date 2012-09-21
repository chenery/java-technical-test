import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

/**
 *      JAVA TEST:
 *
 *      1. Fill in the method stubs.
 *      2. Write tests to prove you implementation
 *
 *      Using IDEA:
 *
 *      Basic Code Completion, to complete methods, keywords etc.: Ctrl+Space
 *
 *      Quick JavaDoc Popup to show the JavaDoc of the method or class at the text cursor: Ctrl+Q (Ctrl+J on Mac OS X)
 */
public class JavaTest {

    // Question 1
    public boolean isPalindrome(String s) {
        /*
          Definition: A palindrome is a string that reads the same forward and backward.
          For example, "abcba" is a palindrome, "abab" is not.
          Please implement this method to
          return true if the parameter is a palindrome and false otherwise.
         */
        return false;
    }

    // Question 2: Please do not change this interface
    public interface Node {
        int getValue();
        List<Node> getChildren();
    }

    public double getAverage(Node root) {
        /*
          Please implement this method to
          return the average of all node values (Node.getValue()) in the tree.

          HINT: You will need to create an implementation of the Node interface to test this.
          HINT: You can create additional classes and/or methods to help you complete this.

         */
        return -1;
    }

    // Question 3
    public class WriteOnceMap<K, V> extends HashMap<K, V> {

        public V put(K key, V value) {
            /*
             WriteOnceMap is a map that does not allow changing value for a particular key.
             It means that put() method should throw IllegalArgumentException if the key is already
             associated with some value in the map.

             Please implement this method to conform to the above description of WriteOnceMap.
            */
            return null;
        }


        public void putAll(Map<? extends K, ? extends V> m) {
            /*
             Please implement this method to conform to the description of WriteOnceMap above.
             It should either
             (1) copy all of the mappings from the specified map to this map or
             (2) throw IllegalArgumentException and leave this map intact
             if the parameter already contains some keys from this map.
            */

        }
    }

    JavaTest javaTest;

    @Before
    public void init() {
        javaTest = new JavaTest();
    }

    /**
     *  Complete tests as below for each of the questions
     */

    @Test
    public void testIsPalindrome() {

        final String aPalindrome = "abcba";
        final String notAPalindrome = "abab";

        assertTrue("Should be a palindrone", javaTest.isPalindrome(aPalindrome));
        assertFalse("Should not be a palindrone", javaTest.isPalindrome(notAPalindrome));
    }
}
