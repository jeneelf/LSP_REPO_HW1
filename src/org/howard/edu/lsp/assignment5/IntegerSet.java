package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.List;
/** This class reps. the set of integers as well operations
 * that can be performed on the set(ie. add, remove, union, intersect, etc.)
 */
public class IntegerSet {
    private List<Integer> set = new ArrayList<>();

	// Store the set elements in an ArrayList.
    public IntegerSet() {
    }

    /**Constructor intialize set with a given list of ints. */
    public IntegerSet(ArrayList<Integer> set) {
        for (int num: set) {
            add(num);
        }

    }
    
	// Clears the internal representation of the set. 
    public void clear() {
        set.clear();
    }

    // Returns the length of the set. 5 pts.
    public int length() {
        return set.size();
    } // returns the length
    /**Returns true if the 2 sets are equal*/
    public boolean equals(Object o) {
        if (o instanceof IntegerSet) {
            IntegerSet intSet = (IntegerSet) o;
            return set.containsAll(intSet.set) && intSet.set.containsAll(set);
        }
        return false;
    }
    /*
    * Returns true if the 2 sets are equal, false otherwise;
    * Two sets are equal if they contain all of the same values in ANY order.  This overrides
    * the equal method from the Object class. 10 pts.
    */

    public boolean contains(int value) {
        return set.contains(value);
    }
    /**Returns the largest item in the set*/
    public int largest() {
        int largest = set.get(0);
        for (int num: set) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }
    /**Returns the smallest item in the set*/
    public int smallest() {
        int smallest = set.get(0);
        for (int num: set) {
            if (num < smallest) {
                smallest = num;
            }
        }
        return smallest;
    }
    /**Adds an item */
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }
    /**Removes an item*/
    public void remove(int item) {
        set.remove(item);
    }

    /**Returns the union of two set*/
    public void union(IntegerSet intSetb) {
        for (Integer num: intSetb.set) {
            add(num);
        }
    }

    /**interects two sets*/
    public void intersect(IntegerSet intSetb) {
        List<Integer> temp = new ArrayList<>(set);
        for (Integer num: temp) {
            if (!intSetb.set.contains(num)) {
                set.remove(num);
            }
        }
    }
    /**finds the difference between two sets*/
    public void diff(IntegerSet intSetb) {
        for (Integer num: intSetb.set) {
                set.remove(num);
        }
    }
    /**finds the complement of two sets
     * @param intSetb used to compare with set
    */
    public void complement(IntegerSet intSetb) {
        /**finds the difference between set and intSetb*/
        for (Integer num: intSetb.set) {
                set.remove(num);
        }
    }

    /**checks if set is empty
     * @return boolean value based on if set is empty or not
    */
    public boolean isEmpty() {
        return set.isEmpty();
    }
    // /**returns string representation of set*/
    public String toString() {
        return set.toString();
    }

}
