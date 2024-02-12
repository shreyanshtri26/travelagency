package com.yourcompany;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PassengerTest {

    @Test
    public void testSignUpForActivity() {
        Passenger passenger = new Passenger("Test Passenger", 1, PassengerType.STANDARD, 100.0);
        Destination destination = new Destination("Test Destination");
        Activity activity = new Activity("Test Activity", "Test Description", 50.0, 10, destination);

        assertTrue(passenger.signUpForActivity(activity));
        assertEquals(1, passenger.getActivities().size());

        // Test insufficient balance
        Passenger goldPassenger = new Passenger("Gold Passenger", 2, PassengerType.GOLD, 40.0);
        assertFalse(goldPassenger.signUpForActivity(activity));
    }
}
