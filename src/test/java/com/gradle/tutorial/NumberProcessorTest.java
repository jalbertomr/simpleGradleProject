package com.gradle.tutorial;

import org.junit.Assert;
import org.junit.Test;

public class NumberProcessorTest {
    @Test
    public void NumberNormalNumbers() {
        NumberProcessor np = new NumberProcessor();
        Assert.assertEquals("1", np.convert(1));
        Assert.assertEquals("2", np.convert(2));
    }

    @Test
    public void NumberTres() {
        NumberProcessor np = new NumberProcessor();
        Assert.assertEquals("tres", np.convert(3));
    }

    @Test
    public void NumberCinco() {
        NumberProcessor np = new NumberProcessor();
        Assert.assertEquals("cinco", np.convert(5));
    }

    @Test
    public void NumberTresYCinco(){
        NumberProcessor np = new NumberProcessor();
        Assert.assertEquals("tresYcinco", np.convert(15));
    }

}