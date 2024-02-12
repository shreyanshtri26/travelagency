package com.yourcompany;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DestinationTest {

    @Test
    public void testAddAndRemoveActivity() {
        Destination destination = new Destination("Test Destination");
        Activity activity = new Activity("Test Activity", "Test Description", 50.0, 10, destination);
        
        destination.addActivity(activity);
        assertEquals(1, destination.getActivities().size());
        
        destination.removeActivity(activity);
        assertEquals(0, destination.getActivities().size());
    }
}
