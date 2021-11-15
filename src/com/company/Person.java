package com.company;

public class Person implements Comparable{
    String firstName;
    String lastName;
    public Person (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Object other) {
        Person otherPerson = (Person) other;
        if (this.firstName.compareTo(otherPerson.firstName) <= 0) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

}
