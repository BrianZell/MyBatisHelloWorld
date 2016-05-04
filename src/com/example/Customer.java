package com.example;

/**
 * Created by bzell on 5/3/2016.
 */
public class Customer {
    private int customerId;
    private String firstName;
    private String middleName;
    private String lastName;

    public String toString() {
        return String.format("Customer [Id = %d, First = %s, Middle = %s, Last = %s]",customerId,firstName,middleName,lastName);
    }
}
