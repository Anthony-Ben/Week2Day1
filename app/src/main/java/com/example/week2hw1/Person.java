package com.example.week2hw1;

import android.os.Parcel;
import android.os.Parcelable;

public class Person implements Parcelable {
    private String firstName;
    private String lastName;
    private String age;
    private String city;
    private String state;
    private String zip;

    public Person(String firstName, String lastName, String age, String city, String state, String zip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    protected Person(Parcel in) {
        firstName = in.readString();
        lastName = in.readString();
        age = in.readString();
        city = in.readString();
        state = in.readString();
        zip = in.readString();
    }

    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(firstName);
        parcel.writeString(lastName);
        parcel.writeString(age);
        parcel.writeString(city);
        parcel.writeString(state);
        parcel.writeString(zip);
    }

    @Override
    public String toString() {
        return "FirstName = " + firstName + '\n' +
                "LastName = " + lastName + '\n' +
                "Age = " + age + '\n' +
                "City =" + city + '\n' +
                "State =" + state + '\n' +
                "Zip =" + zip + '\n';
    }
}
