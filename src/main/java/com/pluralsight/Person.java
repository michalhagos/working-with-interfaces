package com.pluralsight;

// Person now implements Comparable<Person>
public class Person implements Comparable<Person>{

    // the first name of the person
    private String firstName;
    // the last name of the person
    private String lastName;
    // the age of the person
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // returns the first name of the person
    public String getFirstName() {
        return firstName;
    }

    // returns the last name of the person
    public String getLastName() {
        return lastName;
    }

    // returns the age of the person
    public int getAge() {
        return age;
    }
    // updates the first name of the person
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // updates the last name of the person
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // updates the age of the person
    public void setAge(int age) {
        this.age = age;
    }
// to string method to make the information of the person readable
    @Override
    public String toString() {
        return firstName + " " + lastName + " age " + age;
    }

    // this method tells Java how to compare one Person to another
// we want to sort by last name

    @Override
    public int compareTo(Person otherPerson) {
        return this.lastName.compareTo(otherPerson.lastName);
    }
}
