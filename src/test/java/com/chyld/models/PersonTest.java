package com.chyld.models;

import com.chyld.Gender;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class PersonTest {
//    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    Person p;
    @Before
    public void setUp() throws Exception {
        p = new Person("Bob", 44, "M", "1221 street");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void shouldCreateAnInstanceOfPerson() throws Exception {
        assertThat(p, instanceOf(Person.class));
    }
}
