package com.example.hateoas.builder;

class User {
    private String firstName;
    private String lastName;
    private Character gender;
    private Integer age;
    private Float salary;


    public User(String firstName, String lastName, Character gender, Integer age, Float salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
    }

    public User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.gender = builder.gender;
        this.age = builder.age;
        this.salary = builder.salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Character getGender() {
        return gender;
    }

    public Integer getAge() {
        return age;
    }

    public Float getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }


    static public class UserBuilder {
        private String firstName;
        private String lastName;
        private Character gender;
        private Integer age;
        private Float salary;

        public UserBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder setGender(Character gender) {
            this.gender = gender;
            return this;
        }

        public UserBuilder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public UserBuilder setSalary(Float salary) {
            this.salary = salary;
            return this;
        }

        public User getUser() {
            return new User(this);
        }

        public User getUser2() {
            return new User(firstName, lastName, gender, age, salary);
        }
    }


}


public class Builder {

    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setFirstName("Ankur")
                .setLastName("Singh")
                .setGender('M')
                .getUser();
        System.out.println(user);

        User user1 = new User.UserBuilder()
                .setFirstName("Situ")
                .setLastName("Singh")
                .setGender('M')
                .getUser2();
        System.out.println(user1);
    }
}

/*
Note:--
Use case of Builder Design pattern is:--
    append() of StringBuilder and StringBuffer class.

It is used to construct a complex object step by step and the final step will return the object.

Difference between Abstract design pattern and Builder design pattern?
In one sentence, abstract factory pattern is the answer to "WHAT" and the builder pattern to "HOW".

One way it to create more constructors, and another is to loose the immutability and introduce setter methods. You choose any of both options,
you loose something, right?
Here, builder pattern will help you to consume additional attributes while retaining the immutability of Use class.
 */