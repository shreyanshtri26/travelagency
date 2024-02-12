package com.yourcompany;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class TravelPackageTest {

    @Test
    public void testAddAndRemovePassenger() {
        Destination destination = new Destination("Test Destination");
        new Activity("Test Activity", "Test Description", 50.0, 10, destination);
        List<Destination> itinerary = new ArrayList<>();
        itinerary.add(destination);

        TravelPackage travelPackage = new TravelPackage("Test Package", 5, itinerary, new ArrayList<>());

        Passenger passenger = new Passenger("Test Passenger", 1, PassengerType.STANDARD, 100.0);
        travelPackage.addPassenger(passenger);
        assertEquals(1, travelPackage.getPassengers().size());

        travelPackage.removePassenger(passenger);
        assertEquals(0, travelPackage.getPassengers().size());
    }
}
