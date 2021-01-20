package com.company;

public class User extends Person{ // is-a

    private String email;

    public User(String name, String surname) {
        super(name, surname);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (Validator.checkEmail(email)) {
            this.email = email;
        } else {
            System.out.println("Incorrect email!");
        }
    }

    @Override
    public String toString() {
        return "User{" + getName() + " " + getSurname() + ", " +
                "email='" + email + '\'' +
                '}';
    }
}
