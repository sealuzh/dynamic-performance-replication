/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 09:13:23 GMT 2018
 */

package org.apache.commons.imaging.common;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.imaging.common.RationalNumber;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RationalNumber_ESTest extends RationalNumber_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(7.724907063675346E-4);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals(2, rationalNumber0.numerator);
      assertEquals("0.001", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2111L), 1846L);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      RationalNumber rationalNumber2 = RationalNumber.valueOf(1846L);
      rationalNumber2.toDisplayString();
      RationalNumber rationalNumber3 = rationalNumber0.negate();
      String string0 = rationalNumber3.toString();
      assertEquals("-2111/-1846 (1.144)", string0);
      
      String string1 = rationalNumber2.toString();
      assertEquals("1,846", string1);
      
      rationalNumber3.toDisplayString();
      String string2 = rationalNumber2.toDisplayString();
      assertEquals("1846", string2);
      
      RationalNumber rationalNumber4 = RationalNumber.valueOf((-2.147483647E9));
      rationalNumber0.doubleValue();
      RationalNumber rationalNumber5 = RationalNumber.valueOf((-593.7971));
      String string3 = rationalNumber5.toDisplayString();
      assertEquals("-593.797", string3);
      assertEquals((-3438679), rationalNumber5.numerator);
      
      String string4 = rationalNumber0.toDisplayString();
      assertEquals("-1.144", string4);
      
      rationalNumber1.intValue();
      int int0 = rationalNumber2.intValue();
      assertEquals(1846, int0);
      
      RationalNumber rationalNumber6 = rationalNumber3.negate();
      rationalNumber6.negate();
      rationalNumber4.negate();
      long long0 = rationalNumber1.longValue();
      assertEquals(1L, long0);
      
      rationalNumber4.toDisplayString();
      assertEquals((-2147483647L), rationalNumber4.longValue());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2648.5);
      float float0 = rationalNumber0.floatValue();
      assertEquals(2648.5F, float0, 0.01F);
      assertEquals(2, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.010987080007908E-5);
      rationalNumber0.toDisplayString();
      RationalNumber rationalNumber1 = RationalNumber.valueOf((-1.0));
      String string0 = rationalNumber1.toString();
      assertEquals("-1", string0);
      
      String string1 = rationalNumber0.toString();
      assertEquals("1/98913 (0)", string1);
      
      RationalNumber rationalNumber2 = RationalNumber.factoryMethod(2147483647L, 2913L);
      assertEquals((byte) (-74), rationalNumber2.byteValue());
      
      rationalNumber1.intValue();
      RationalNumber.factoryMethod((-3252L), (-2015L));
      RationalNumber rationalNumber3 = RationalNumber.factoryMethod((-3252L), 1316L);
      String string2 = rationalNumber0.toDisplayString();
      assertEquals("0", string2);
      
      rationalNumber1.floatValue();
      assertEquals(1, rationalNumber1.divisor);
      
      float float0 = rationalNumber3.floatValue();
      assertEquals((-2.4711246F), float0, 0.01F);
      
      RationalNumber rationalNumber4 = RationalNumber.factoryMethod(3252, 1);
      assertEquals(3252.0, rationalNumber4.doubleValue(), 0.01);
      assertEquals(1, rationalNumber4.divisor);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.2319014786044136E-7);
      String string0 = rationalNumber0.toString();
      assertEquals(1.2319015188360206E-7, rationalNumber0.doubleValue(), 0.01);
      assertEquals("1/8117532 (0)", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        RationalNumber.factoryMethod((-2147483655L), 0L);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Invalid value, numerator: -2147483655, divisor: 0
         //
         verifyException("org.apache.commons.imaging.common.RationalNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483661L, (-1168L));
      rationalNumber0.longValue();
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals((-1838599.0239726028), rationalNumber0.doubleValue(), 0.01);
      assertEquals(1838599L, rationalNumber1.longValue());
      assertEquals(536870915, rationalNumber1.numerator);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483661L, 2147483661L);
      long long0 = rationalNumber0.longValue();
      assertEquals(1L, long0);
      
      double double0 = rationalNumber0.doubleValue();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), (-2147483648L));
      RationalNumber rationalNumber1 = RationalNumber.factoryMethod((-2147483653L), 74L);
      RationalNumber rationalNumber2 = rationalNumber0.negate();
      assertEquals(1, rationalNumber0.numerator);
      assertEquals(1, rationalNumber2.divisor);
      
      RationalNumber rationalNumber3 = RationalNumber.valueOf((-2147483648L));
      assertEquals(1, rationalNumber3.divisor);
      
      RationalNumber rationalNumber4 = rationalNumber1.negate();
      assertEquals(2.902004937837838E7, rationalNumber4.doubleValue(), 0.01);
      
      RationalNumber rationalNumber5 = RationalNumber.valueOf(1073741827);
      assertEquals(1.073741827E9, rationalNumber5.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2047L, 2147483661L);
      RationalNumber rationalNumber1 = RationalNumber.valueOf(0.0);
      assertEquals(0, rationalNumber1.numerator);
      assertEquals(0L, rationalNumber1.longValue());
      
      long long0 = rationalNumber0.longValue();
      assertEquals(0L, long0);
      
      RationalNumber rationalNumber2 = rationalNumber0.negate();
      assertEquals((-9.527429885077682E-7), rationalNumber2.doubleValue(), 0.01);
      assertEquals(1073741830, rationalNumber2.divisor);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-1284L), (-1284L));
      RationalNumber rationalNumber1 = RationalNumber.factoryMethod((-1L), (-2147483653L));
      assertEquals((-4.656612883919414E-10), rationalNumber1.doubleValue(), 0.01);
      assertEquals((-2147483643), rationalNumber1.divisor);
      
      RationalNumber rationalNumber2 = rationalNumber0.negate();
      RationalNumber rationalNumber3 = RationalNumber.valueOf(2.1350842871470377E-8);
      assertEquals(2.1350843074335224E-8, rationalNumber3.doubleValue(), 0.01);
      
      RationalNumber rationalNumber4 = rationalNumber2.negate();
      assertEquals(1, rationalNumber2.divisor);
      assertEquals(1, rationalNumber4.numerator);
      
      RationalNumber rationalNumber5 = RationalNumber.valueOf((-2147483653L));
      assertEquals((-2147483647), rationalNumber5.numerator);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), (-2147483648L));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      RationalNumber rationalNumber2 = RationalNumber.factoryMethod((-2147483653L), (-1));
      assertEquals((-2147483643), rationalNumber2.numerator);
      
      RationalNumber rationalNumber3 = RationalNumber.factoryMethod(9620L, (-4724L));
      assertEquals((-2.036409822184589), rationalNumber3.doubleValue(), 0.01);
      assertEquals((-1181), rationalNumber3.divisor);
      
      rationalNumber1.negate();
      rationalNumber0.negate();
      RationalNumber rationalNumber4 = RationalNumber.valueOf((-2147483653L));
      assertEquals((-2147483647), rationalNumber4.numerator);
      
      RationalNumber rationalNumber5 = rationalNumber0.negate();
      RationalNumber rationalNumber6 = rationalNumber5.negate();
      assertEquals(1, rationalNumber6.numerator);
      assertEquals(1, rationalNumber5.divisor);
      assertEquals((-1), rationalNumber5.numerator);
  }
}