package org.howard.edu.lspfinal.question1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class ShoppingCartTest {

    private ShoppingCart cart = new ShoppingCart();

    // Test for adding valid item [3 pts.]
    @Test
    @DisplayName("Test for adding valid item")
    public void testAddValidItem() {
        cart.addItem("Laptop", 569.00);
        assertEquals(569.00, cart.getTotalCost(), 0.001);
    }

    // Test for adding item with 0 price (expect exception) [3 pts.]
    @Test
    @DisplayName("Test for adding item with 0 price")
    public void testAddItemWithZeroPrice() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            cart.addItem("Laptop", 0.00);
        });
        assertEquals("Price cannot be negative.", exception.getMessage());
    }

    // Test for adding item with negative price (expect exception) [3 pts.]
    @Test
    @DisplayName("Test for adding item with negative price")
    public void testAddItemWithNegativePrice() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            cart.addItem("Laptop", -10.00);
        });
        assertEquals("Price cannot be negative.", exception.getMessage());
    }

    // Test for applying "SAVE10" [3 pts.]
    @Test
    @DisplayName("Test for applying SAVE10 discount")
    public void testApplySave10Discount() {
        cart.addItem("Laptop", 100.00);
        cart.applyDiscountCode("SAVE10");
        assertEquals(90.00, cart.getTotalCost(), 0.001);
    }

    // Test for applying "SAVE20" [3 pts.]
    @Test
    @DisplayName("Test for applying SAVE20 discount")
    public void testApplySave20Discount() {
        cart.addItem("Laptop", 100.00);
        cart.applyDiscountCode("SAVE20");
        assertEquals(80.00, cart.getTotalCost(), 0.001);
    }

    // Test for applying invalid code (expect exception) [3 pts.]
    @Test
    @DisplayName("Test for applying invalid code")
    public void testApplyInvalidDiscountCode() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            cart.applyDiscountCode("SAVE50");
        });
        assertEquals("Invalid discount code.", exception.getMessage());
    }

    // Test total cost without discount [4 pts.]
    @Test
    @DisplayName("Test total cost without discount")
    public void testTotalCostWithoutDiscount() {
        cart.addItem("Laptop", 100.00);
        cart.addItem("Phone", 200.00);
        assertEquals(300.00, cart.getTotalCost(), 0.001);
    }

    // Test total cost with discount [5 pts.]
    @Test
    @DisplayName("Test total cost with discount")
    public void testTotalCostWithDiscount() {
        cart.addItem("Laptop", 100.00);
        cart.addItem("Phone", 200.00);
        cart.applyDiscountCode("SAVE10");
        assertEquals(270.00, cart.getTotalCost(), 0.001); // 300 - 10% = 270
    }

    // Test total cost with empty cart [3 pts.]
    @Test
    @DisplayName("Test total cost with empty cart")
    public void testTotalCostWithEmptyCart() {
        assertEquals(0.00, cart.getTotalCost(), 0.001);
    }
}
