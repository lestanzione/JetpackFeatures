package com.stanzione.jetpackfeatures;

import android.arch.lifecycle.ViewModel;

public class User extends ViewModel{

    private String firstName;
    private String lastName;
    private int age;

    public User(){
        this.firstName = "Leandro";
        this.lastName = "Stanzione";
    }

    public User(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 1;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
