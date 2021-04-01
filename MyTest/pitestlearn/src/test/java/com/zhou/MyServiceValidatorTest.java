package com.zhou;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyServiceValidatorTest {

    private MyServiceValidator myServiceValidator;

    @Before
    public void init(){
        myServiceValidator = new MyServiceValidator();
    }

    @Test
    public void fiftyReturnsTrue() {
        assertEquals(myServiceValidator.isValid(50), true);
    }

    @Test
    public void twoHundredReturnsFalse() {
        assertEquals(myServiceValidator.isValid(200), false);
    }

    @Test
    public void minusTenReturnsFalse() {
        assertEquals(myServiceValidator.isValid(-10), false);
    }


}