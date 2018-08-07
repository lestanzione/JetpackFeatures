package com.stanzione.jetpackfeatures;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class User extends ViewModel{

    private MutableLiveData<String> firstName = new MutableLiveData<>();
    private MutableLiveData<String> lastName = new MutableLiveData<>();
    private MutableLiveData<Integer> age = new MutableLiveData<>();

    public User(){
        this.firstName.setValue("Leandro");
        this.lastName.setValue("Stanzione");
        this.age.setValue(1);
    }

    public User(String firstName, String lastName){
        this.firstName.setValue(firstName);
        this.lastName.setValue(lastName);
        this.age.setValue(1);
    }

    public MutableLiveData<String> getFirstName() {
        if (firstName == null) {
            firstName = new MutableLiveData<String>();
        }
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName.setValue(firstName);
    }

    public MutableLiveData<String> getLastName() {
        if (lastName == null) {
            lastName = new MutableLiveData<String>();
        }
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName.setValue(lastName);
    }

    public MutableLiveData<Integer> getAge() {
        if (age == null) {
            age = new MutableLiveData<Integer>();
        }
        return age;
    }

    public void setAge(int age) {
        this.age.setValue(age);
    }

}
