/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 21:35:52 GMT 2018
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
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.147483647E9);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("2147483647", string0);
      
      String string1 = rationalNumber0.toString();
      assertEquals("2,147,483,647", string1);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      rationalNumber0.toDisplayString();
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      RationalNumber.factoryMethod(0, 2406L);
      rationalNumber1.toDisplayString();
      rationalNumber1.toDisplayString();
      rationalNumber1.negate();
      long long0 = 0L;
      RationalNumber.factoryMethod((-4150L), 0L);
      rationalNumber0.toString();
      rationalNumber1.negate();
      // Undeclared exception!
      try { 
        RationalNumber.factoryMethod(0, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.imaging.common.RationalNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2.147483647E9));
      float float0 = rationalNumber0.floatValue();
      assertEquals((-2147483647), rationalNumber0.numerator);
      assertEquals((-2.14748365E9F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.2448479421655065E-4);
      float float0 = rationalNumber0.floatValue();
      assertEquals(2.2449209E-4F, float0, 0.01F);
      assertEquals(8909, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.1474836467630076E9);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals(2.147483647E9, rationalNumber0.doubleValue(), 0.01);
      assertEquals("2147483647", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-37.1));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("-37.1", string0);
      
      RationalNumber rationalNumber1 = RationalNumber.factoryMethod((-371), (-371));
      RationalNumber rationalNumber2 = rationalNumber0.negate();
      rationalNumber0.negate();
      int int0 = rationalNumber0.intValue();
      assertEquals((-37), int0);
      
      long long0 = rationalNumber1.longValue();
      assertEquals(1L, long0);
      assertEquals(1, rationalNumber1.divisor);
      assertEquals((byte)1, rationalNumber1.byteValue());
      
      RationalNumber.factoryMethod((-3722L), 0L);
      rationalNumber0.toDisplayString();
      String string1 = rationalNumber2.toString();
      assertEquals(37L, rationalNumber2.longValue());
      assertEquals("371/10 (37.1)", string1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.6295082900796842E-6);
      assertEquals(1.6295084424832405E-6, rationalNumber0.doubleValue(), 0.01);
      assertEquals(613682, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(740L);
      long long0 = rationalNumber0.longValue();
      assertEquals(740.0, rationalNumber0.doubleValue(), 0.01);
      assertEquals(740L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(37.5);
      assertEquals(75, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.0E-8);
      RationalNumber rationalNumber1 = RationalNumber.factoryMethod(100000000, (-244L));
      RationalNumber rationalNumber2 = RationalNumber.valueOf(1391.6036520598);
      RationalNumber rationalNumber3 = rationalNumber2.negate();
      rationalNumber0.longValue();
      String string0 = rationalNumber3.toString();
      assertEquals("-18366385/13198 (-1,391.604)", string0);
      
      rationalNumber0.doubleValue();
      RationalNumber.factoryMethod(0L, 18366385);
      String string1 = rationalNumber2.toDisplayString();
      assertEquals("1,391.604", string1);
      
      RationalNumber rationalNumber4 = RationalNumber.valueOf(1);
      rationalNumber3.toString();
      RationalNumber rationalNumber5 = RationalNumber.factoryMethod(1L, 1);
      RationalNumber rationalNumber6 = RationalNumber.valueOf(1.0E-8);
      RationalNumber rationalNumber7 = RationalNumber.valueOf(0L);
      String string2 = rationalNumber7.toDisplayString();
      assertEquals("0", string2);
      
      RationalNumber rationalNumber8 = RationalNumber.factoryMethod(1, (-798L));
      String string3 = rationalNumber4.toString();
      double double0 = rationalNumber0.doubleValue();
      assertEquals(1.0E-8, double0, 0.01);
      
      rationalNumber2.doubleValue();
      rationalNumber1.toString();
      RationalNumber.valueOf(1391.6036520684952);
      String string4 = rationalNumber5.toDisplayString();
      assertTrue(string4.equals((Object)string3));
      
      RationalNumber rationalNumber9 = RationalNumber.valueOf(17070802);
      assertEquals(17070802L, rationalNumber9.longValue());
      assertEquals((short)31442, rationalNumber9.shortValue());
      
      RationalNumber rationalNumber10 = RationalNumber.factoryMethod(1, (-18366385));
      RationalNumber rationalNumber11 = RationalNumber.factoryMethod(17070802, (-1028L));
      assertEquals((-16605L), rationalNumber11.longValue());
      
      rationalNumber8.intValue();
      rationalNumber6.negate();
      RationalNumber rationalNumber12 = RationalNumber.factoryMethod((-691L), 1866L);
      String string5 = rationalNumber12.toString();
      assertEquals("691/-1866 (-0.37)", string5);
      
      rationalNumber10.negate();
      assertEquals((-5.44473E-8F), rationalNumber10.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2222.5006));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("-2,222.5", string0);
      
      rationalNumber0.toString();
      String string1 = rationalNumber0.toString();
      assertEquals("-4445/2 (-2,222.5)", string1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        RationalNumber.factoryMethod((-2147483660L), 0L);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Invalid value, numerator: -2147483660, divisor: 0
         //
         verifyException("org.apache.commons.imaging.common.RationalNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        RationalNumber.factoryMethod(2147483674L, 0L);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Invalid value, numerator: 2147483674, divisor: 0
         //
         verifyException("org.apache.commons.imaging.common.RationalNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483660L), 2147483665L);
      assertEquals(536870916, rationalNumber0.divisor);
      assertEquals((-0.9999999981373549), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1444L, 2147483663L);
      assertEquals(6.724148944887293E-7, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483690L, 2147483690L);
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(1, rationalNumber0.numerator);
      
      RationalNumber rationalNumber1 = RationalNumber.factoryMethod(1, 2147483690L);
      assertEquals((-4.656612964150377E-10), rationalNumber1.doubleValue(), 0.01);
      assertEquals(1, rationalNumber1.numerator);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RationalNumber.factoryMethod(2147483663L, 1L);
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483663L, 687L);
      String string0 = rationalNumber0.toString();
      assertEquals("1073741831/343 (3,130,442.656)", string0);
  }
}