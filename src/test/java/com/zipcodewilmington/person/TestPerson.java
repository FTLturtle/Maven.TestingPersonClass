package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetFavoriteColor() {
        // Given
        Person person = new Person();
        String expected = "Green";

        // When
        person.setFavoriteColor(expected);
        String actual = person.getFavoriteColor();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetGender() {
        // Given
        Person person = new Person();
        char expected = 'F';

        // When
        person.setGender(expected);

        // Then
        char actual = person.getGender();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAlive() {
        // Given
        Person person = new Person();

        // When
        person.setAlive(true);

        // Then
        Assert.assertTrue(person.isAlive());
    }

    @Test
    public void testSetMarried() {
        // Given
        Person person = new Person();

        // When
        person.setMarried(true);

        // Then
        Assert.assertTrue(person.isMarried());
    }

    @Test
    public void testSetGlasses() {
        // Given
        Person person = new Person();

        // When
        person.setGlasses(true);

        // Then
        Assert.assertTrue(person.hasGlasses());
    }
}
