package com.yourcompany;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ActivityTest {

    @Test
    public void testActivityCreation() {
        Destination destination = new Destination("Test Destination");
        Activity activity = new Activity("Test Activity", "Test Description", 100.0, 10, destination);

        assertEquals("Test Activity", activity.getName());
        assertEquals("Test Description", activity.getDescription());
        assertEquals(100.0, activity.getCost());
        assertEquals(10, activity.getCapacity());
        assertEquals(destination, activity.getDestination());
    }

    // Add more test methods as needed
}
