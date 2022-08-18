package com.jap.pizzaorder;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PizzaOrderTest {
    PizzaOrder pizzaOrder;

    @BeforeEach
    void setUp() {
        pizzaOrder = new PizzaOrder();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void displayCustomerDetails() {

    }

    @Test
    void displayOrderDetails() {


    }

    @Test
        // This is a test case for the method calculatePriceOfPizza.
    void givenNoOfPizzaCalculateTotalPriceSuccess() {
        int noOfPizza = 5;
        float priceOfPizza = 12.99f;
        float ExpectedResult = 64.95f;
        float actualResult = pizzaOrder.calculatePriceOfPizza(5, 12.99f);
        Assertions.assertEquals(ExpectedResult, actualResult);
    }

    @Test
    void calculatePriceOfPizza() {
    }

    @Test
        // This is a test case for the method calculatePriceOfGarlicBread.
    void givenNoOfGarlicBreadPriceOfGarlicBreadCalculateTotalPriceSuccess() {
        int noOfGarlicBread = 3;
        float priceOfGarlicBread = 5.99f;
        float ExpectedResult = 17.97f;
        float actualResult = pizzaOrder.calculatePriceOfGarlicBread(3, 5.99f);
        Assertions.assertEquals(ExpectedResult, actualResult);
    }

    // This is a test case for the method calculatePriceOfBeverage.
    // This is a test case for the method calculatePriceOfBeverage.
    @Test
    void givenNoOfBeveragesAndPriceOfBeverageCalculateTotalPriceSuccess() {
        int noOfBeverages = 3;
        float priceOfBeverage = 1.99f;
        float ExpectedResult = 5.9700003f;
        float actualResult = pizzaOrder.calculatePriceOfBeverage(3, 1.99f);
        Assertions.assertEquals(ExpectedResult, actualResult);

    }

    /**
     * The above function is used to calculate the total price of the pizza.
     */
    @Test
    void givenNoOfPizzaAndPriceOfPizzaCalculateTotalPriceFailure() {
        int noOfPizza = 5;
        float priceOfPizza = 12.99f;
        float UnExpectedResult = 64.85f;
        float actualResult = pizzaOrder.calculatePriceOfPizza(5, 12.99f);
        Assertions.assertNotEquals(UnExpectedResult, actualResult);
    }

    /**
     * This function tests the calculatePriceOfGarlicBread() function of the PizzaOrder class
     */
    @Test
    void calculateDiscountAndReturnBillAmount() {
        int noOfGarlicBread = 3;
        float priceOfGarlicBread = 5.99f;
        float UnExpectedResult = 17.907f;
        float actualResult = pizzaOrder.calculatePriceOfGarlicBread(3, 5.99f);
        Assertions.assertNotEquals(UnExpectedResult, actualResult);
    }

    @Test
        // This is a test case for the method calculatePriceOfBeverage.
    void getPriceOfPizzaBasedOnSize() {
        int noOfBeverages = 3;
        float priceOfBeverage = 1.99f;
        float UnExpectedResult = 5.970003f;
        float actualResult = pizzaOrder.calculatePriceOfBeverage(3, 1.99f);
        Assertions.assertNotEquals(UnExpectedResult, actualResult);
    }

    @Test
    void givenSizeOfPizzaReturnPrice() {


    }

    @Test
        // This is a test case for the method calculateTotalBill.
    void givenPriceOfItemsCalculateTotalBillAmount() {
        float totalPizzaPrice = 64.95f;
        float totalGarlicBreadPrice = 17.97f;
        float totalBeveragePrice = 5.9700003f;
        float expectedBill = 88.890003f;
        float actualResult = pizzaOrder.calculateTotalBill(64.95f, 17.97f, 5.9700003f);
        Assertions.assertEquals(expectedBill, actualResult);

    }

    @Test
        // This is a test case for the method calculateDiscountAndReturnBillAmount.
    void givenTotalBillLessThan50AmountCalculateDiscount() {
        float totalBill = 88.89f;
        float expected = 80.001f;
        float actualResult = pizzaOrder.calculateDiscountAndReturnBillAmount(88.890003f);
        Assertions.assertEquals(expected, actualResult);
    }

    @Test
        // This is a test case for the method calculateDiscountAndReturnBillAmount.
    void givenTotalBillAmountGreaterThan50CalculateDiscount() {
        float totalBill = 88.890003f;
        float expectedBillAmount = 80.001f;
        float actualResult = pizzaOrder.calculateDiscountAndReturnBillAmount(88.890003f);
        Assertions.assertEquals(expectedBillAmount, actualResult);
    }

    @Test
        // This is a test case for the method getPriceOfPizzaBasedOnSize.
    void givenSizeofPizzaReturnPrice() {
        int size1 = 1;
        float expectedPrice = 9.99f;
        int size2 = 2;
        float expected = 11.99f;
        int size3 = 3;
        float expectedResult = 13.99f;
        int size4 = 0;
        float expectedR = 0;
        int size5 = 6;
        float actualResult1 = pizzaOrder.getPriceOfPizzaBasedOnSize(1);
        float actualResult2 = pizzaOrder.getPriceOfPizzaBasedOnSize(2);
        float actualResult3 = pizzaOrder.getPriceOfPizzaBasedOnSize(3);
        float actualResult4 = pizzaOrder.getPriceOfPizzaBasedOnSize(0);
        Assertions.assertEquals(expectedPrice, actualResult1);
        Assertions.assertEquals(expected, actualResult2);
        Assertions.assertEquals(expectedResult, actualResult3);
        Assertions.assertEquals(expectedR, actualResult4);
        
    }
}