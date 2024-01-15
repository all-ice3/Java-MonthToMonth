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

     MonthConversion.main(new String[]{"3"});
     // assertion
     assertEquals("March\n", bos.toString());

     MonthConversion.main(new String[]{"4"});
     // assertion
     assertEquals("April\n", bos.toString());

     MonthConversion.main(new String[]{"5"});
     // assertion
     assertEquals("May\n", bos.toString());

     MonthConversion.main(new String[]{"6"});
     // assertion
     assertEquals("June\n", bos.toString());
      
     MonthConversion.main(new String[]{"7"});
     // assertion
     assertEquals("July\n", bos.toString());

     MonthConversion.main(new String[]{"8"});
     // assertion
     assertEquals("August\n", bos.toString());
      
     MonthConversion.main(new String[]{"9"});
     // assertion
     assertEquals("September\n", bos.toString());

     MonthConversion.main(new String[]{"10"});
     // assertion
     assertEquals("October\n", bos.toString());

     MonthConversion.main(new String[]{"11"});
     // assertion
     assertEquals("November\n", bos.toString());

     MonthConversion.main(new String[]{"12"});
     // assertion
     assertEquals("December\n", bos.toString());

     MonthConversion.main(new String[]{"13"});
     // assertion
     assertEquals("No Such Month\n", bos.toString());

     // undo the binding in System
     System.setOut(originalOut);
   }
}
