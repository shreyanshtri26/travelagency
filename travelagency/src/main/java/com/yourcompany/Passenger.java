package com.yourcompany;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Passenger {
    private String name;
    private int passengerNumber;
    private PassengerType passengerType;
    private double balance;
    private List<Activity> activities;

    public Passenger(String name, int passengerNumber, PassengerType passengerType, double balance) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.passengerType = passengerType;
        this.balance = balance;
        this.activities = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public PassengerType getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(PassengerType passengerType) {
        this.passengerType = passengerType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

    public boolean signUpForActivity(Activity activity) {
        if (activity.isAvailable()) {
            if (passengerType == PassengerType.PREMIUM) {
                activities.add(activity);
                return true;
            } else if (passengerType == PassengerType.GOLD) {
                double discountedCost = activity.getCost() * 0.9;
                if (balance >= discountedCost) {
                    balance -= discountedCost;
                    activities.add(activity);
                    return true;
                }
            } else {
                if (balance >= activity.getCost()) {
                    balance -= activity.getCost();
                    activities.add(activity);
                    return true;
                }
            }
        }
        return false;
    }

    public void printDetails() {
        System.out.println("Passenger: " + name);
        System.out.println("Passenger Number: " + passengerNumber);
        if (passengerType != PassengerType.PREMIUM) {
            System.out.println("Balance: $" + balance);
        }
        System.out.println("Activities:");
        for (Activity activity : activities) {
            System.out.println("- " + activity.getName() + " at " + activity.getDestination().getName() + ", Cost: $" + activity.getCost());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passenger passenger = (Passenger) o;
        return passengerNumber == passenger.passengerNumber && Double.compare(passenger.balance, balance) == 0 && Objects.equals(name, passenger.name) && passengerType == passenger.passengerType && Objects.equals(activities, passenger.activities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, passengerNumber, passengerType, balance, activities);
    }
}
