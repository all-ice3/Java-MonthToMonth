package edu.pasadena.cs.cs03b;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TestMonthConversion {

   @Test
   public void testMonthConversion()
   {
     PrintStream originalOut = System.out;
     ByteArrayOutputStream bos = new ByteArrayOutputStream();
     System.setOut(new PrintStream(bos));

     // action
     MonthConversion.main(new String[]{"1"});

     // assertion
     assertEquals("January\n", bos.toString());

     MonthConversion.main(new String[]{"2"});
     // assertion
     assertEquals("February\n", bos.toString());

     // undo the binding in System
     System.setOut(originalOut);
   }
}
