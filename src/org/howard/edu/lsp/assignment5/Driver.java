package org.howard.edu.lsp.assignment5;

public class Driver {
   public static void main(String[] args) {
        IntegerSet set1 = new IntegerSet(); 
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(6);
        System.out.println("Set 1: " + set1.toString());
        System.out.println("Smallest value in set 1: " + set1.smallest());
        System.out.println("Largest value in set 1: " + set1.largest());

        IntegerSet set2 = new IntegerSet(); 
        set2.add(7);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(10);
        set2.add(6);
        System.out.println("Set 1: " + set1.toString());
        System.out.println("Smallest value in set 1: " + set1.smallest());
        System.out.println("Largest value in set 1: " + set1.largest());
   
        set1.union(set2); 
        System.out.println("Union of set 1 and set 2: " + set1.toString());
    } 
}
