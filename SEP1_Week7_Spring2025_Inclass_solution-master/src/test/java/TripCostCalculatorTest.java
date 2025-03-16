import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TripCostCalculatorTest {
    @Test
    void testCalculateTripCost() {
        // Test case 1: Normal values
        assertEquals(18.00, TripCostCalculator.calculateTripCost(200, 1.80, 5.0), 0.01);

        // Test case 2: Zero kilometers (should return 0)
        assertEquals(0.00, TripCostCalculator.calculateTripCost(0, 1.80, 5.0), 0.01);

        // Test case 3: Zero fuel price (should return 0)
        assertEquals(0.00, TripCostCalculator.calculateTripCost(200, 0.00, 5.0), 0.01);

        // Test case 4: High fuel price
        assertEquals(50.00, TripCostCalculator.calculateTripCost(200, 5.00, 5.0), 0.01);

        // Test case 5: Different fuel consumption rate
        assertEquals(36.00, TripCostCalculator.calculateTripCost(200, 1.80, 10.0), 0.01);

        // Test case 6: Zero fuel consumption
        assertEquals(0.00, TripCostCalculator.calculateTripCost(200, 1.80, 0.0), 0.01);

        // Test case 7: High kilometers
        assertEquals(3600.00, TripCostCalculator.calculateTripCost(40000, 1.80, 5.0), 0.01);

        // Test case 8: Negative fuel price
        assertEquals(-36.00, TripCostCalculator.calculateTripCost(200, -3.60, 5.0), 0.01);

        // Test case 9: Negative kilometers
        assertEquals(-270.00, TripCostCalculator.calculateTripCost(-3000, 1.80, 5.0), 0.01);


    }

}
