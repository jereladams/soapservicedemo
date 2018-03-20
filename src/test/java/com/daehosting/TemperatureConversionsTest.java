package com.daehosting;

import junit.framework.TestCase;

import java.math.BigDecimal;

public class TemperatureConversionsTest extends TestCase {

    public void testGetTemperatureConversionsSoap() {
    }

    public void testGetTemperatureConversionsSoap1() {
    }

    public void testGetTemperatureConversionsSoap12() {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal result = service.celsiusToFahrenheit(BigDecimal.valueOf(0));
        assertEquals(BigDecimal.valueOf(32),result);

        }

        public void testGetTemperatureConversionsSoap121 () {
        }

   }
