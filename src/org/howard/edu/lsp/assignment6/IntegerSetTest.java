package org.howard.edu.lsp.assignment6;

import java.util.ArrayList;
import org.howard.edu.lsp.assignment5.IntegerSet;
import org.junit.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class IntegerSetTest {
    IntegerSet set1;
    IntegerSet set2;

    @BeforeEach
    public void setUp() {
        set1 = new IntegerSet();
        set2 = new IntegerSet();
    }
    @Test
    @DisplayName("Test case for add method")
    public void testAdd() {
        set1.add(1);
        set1.add(4);
        set1.add(6);

        assertTrue(set1.contains(1));
        assertTrue(set1.contains(4));
        assertTrue(set1.contains(6));
        assertEquals(3, set1.length());
    };



	@Test
    @DisplayName("Test case for equal method")
    public void testEquals() {
        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(3);
        set2.add(2);
        set2.add(1);

        assertTrue(set1.equals(set2));
    }
    @Test
    @DisplayName("Test case for contains method")
    public void testContains() {
        set1.add(1);
        set1.add(4);
        set1.add(6);

        assertTrue(set1.contains(1));
        assertFalse(set1.contains(5));
    }
    @Test
    @DisplayName("Test case for largest method")
    public void testLargest() throws IntegerSetException {
        set1.add(1);
        set1.add(4);
        set1.add(6);

        assertEquals(6, set1.largest());
    };  

    @Test
    @DisplayName("Test case for smallest method")
    public void testSmallest() throws IntegerSetException {
        set1.add(1);
        set1.add(4);
        set1.add(6);

        assertEquals(1, set1.largest());
    };  

	// Adds an item to the set or does nothing it already there	
 	public void add(int item) {…}; // adds item to s or does nothing if it is in set

    @Test
    @DisplayName("Test case for remove method")
    public void testRemove() {
        set1.add(1);
        set1.add(4);
        set1.remove(1);

        assertFalse(set1.contains(1));
    };  

    @Test
    @DisplayName("Test case for union method")
    public void testUnion() {
        set1.add(1);
        set1.add(4);
        set1.add(6);
        set2.add(1);
        set2.add(4);
        set2.add(6);
        set2.add(7);
        
        set1.union(set2);

        assertTrue(set1.contains(1));
        assertTrue(set1.contains(4));
        assertTrue(set1.contains(6));
        assertTrue(set1.contains(7));

        assertTrue(4, set1.length())
    };  

    @Test
    @DisplayName("Test case for intersection method")
    public void testIntersection() {
        set1.add(1);
        set1.add(4);
        set1.add(6);
   
        set2.add(4);
        set2.add(6);
        set2.add(7);
        
        set1.intersect(set2);

        assertEquals("[4,6]", set1.toString());
        assertTrue(set1.contains(4));
        assertTrue(set1.contains(6));
    };
    @Test
    @DisplayName("Test case for diff method")
    public void testDiff() {
        set1.add(1);
        set1.add(4);
        set1.add(6);

        set2.add(4);
        set2.add(6);
        set2.add(7);

        set1.diff(set2);
        
        assertEquals("[1,7", set1.toString());

    }

   
    @Test
    @DisplayName("Test case for Complement method")
    public void testComplement() {
        set1.add(1);
        set1.add(4);
        set1.add(6);

        set2.add(4);
        set2.add(6);
        set2.add(7);

        set1.diff(set2);
        
        assertEquals("[1,7", set1.toString());

    }

    @Test
    @DisplayName("Test case for isEmpty method")
    public void testIsEmpty() {
        assertTrue(set1.isEmpty());
        set1.add(1);
        assertFalse(set1.isEmpty());
    }

    @Test
    @DisplayName("Test case for toString method")
    public void testToString() {
        set1.add(5);
        set1.add(10);
        String str = set1.toString();
        assertTrue(str.contains("5") && str.contains("10"));
    }

