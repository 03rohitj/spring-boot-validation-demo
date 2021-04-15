package com.example.demo.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Person {
    @NotNull
    @Size(min = 6, max = 30, message = "Name should be between 6 and 30 characters ")
    private String name;

    @NotNull
    @Min(value = 18, message = "Age must be equal to or greater than 18")
    private Integer age;

    @NotNull
    @Email(message = "Email format not correct")
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
