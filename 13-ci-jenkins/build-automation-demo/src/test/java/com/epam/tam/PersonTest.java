package com.epam.tam;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class PersonTest {

    private static final String JSON = "src/test/resources/example.json";
    private static Person person;

    @BeforeAll
    public static void init() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        person = mapper.readValue(readJsonTestData(), Person.class);
    }

    @Test
    public void hungarianMobileNumberFormatTest() {
        System.out.println(person.toString());
        assertTrue(person.getPhoneNumbers().get("mobile").matches("\\+36(30|70|20)[0-9]{7}"), "Invalid mobile number format!");
    }

    @Test
    public void csongradRegionHomeNumberFormatTest() {
        assertTrue(person.getPhoneNumbers().get("home").matches("\\+36(62|63)[0-9]{6}"), "Invalid home number format!");
    }

    @Test
    public void locationTest() {
        String expectedCity="SZEGED";
        assertTrue(person.getCity().equalsIgnoreCase(expectedCity), "Expected city [" + expectedCity + "] but found [" + person.getCity() + "]");
    }

    private static File readJsonTestData() {
        return FileUtils.getFile(JSON);
    }
}
