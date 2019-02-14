package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;

    private String favoriteColor = "none";
    private char gender = 0;
    private boolean isAlive = false;
    private boolean isMarried = false;
    private boolean hasGlasses = false;


    public Person() {
        this("", Integer.MAX_VALUE);
    }

    public Person(int age) {
        this("", age);
    }

    public Person(String name) {
        this(name, Integer.MAX_VALUE);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public boolean hasGlasses() {
        return hasGlasses;
    }

    public void setGlasses(boolean hasGlasses) {
        this.hasGlasses = hasGlasses;
    }
}
