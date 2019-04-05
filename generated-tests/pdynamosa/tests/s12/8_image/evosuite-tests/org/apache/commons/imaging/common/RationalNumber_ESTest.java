/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 21:37:14 GMT 2019
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
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2.147483647E9));
      assertEquals((-2.147483647E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.14748365E9F);
      assertEquals(2.147483647E9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-1798), (-1798));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), (-2147483649L));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      String string0 = rationalNumber1.toDisplayString();
      assertEquals("-1", string0);
      assertEquals(1073741825, rationalNumber0.divisor);
      assertEquals((-1073741824), rationalNumber1.numerator);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(0L, (-1L));
      String string0 = rationalNumber0.toString();
      assertEquals(0.0, rationalNumber0.doubleValue(), 0.01);
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(309, 0);
      String string0 = rationalNumber0.toString();
      assertEquals("Invalid rational (309/0)", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-1351.560838));
      String string0 = rationalNumber0.toString();
      assertEquals("-25870226/19141 (-1,351.561)", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(4294967295L, 4294967295L);
      assertEquals(1.0, rationalNumber0.doubleValue(), 0.01);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1, (-2147483648L));
      assertEquals((-4.6566128730773926E-10), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1, Integer.MAX_VALUE);
      assertEquals(Integer.MAX_VALUE, rationalNumber0.divisor);
      assertEquals(4.656613E-10F, rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(0L, (-1L));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals(1, rationalNumber1.divisor);
      assertEquals(0.0F, rationalNumber1.floatValue(), 0.01F);
      assertEquals(0.0F, rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483660L), 2147483647L);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals(1.000000006519258, rationalNumber1.doubleValue(), 0.01);
      assertEquals(153391690, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.0);
      long long0 = rationalNumber0.longValue();
      assertEquals(1.0, rationalNumber0.doubleValue(), 0.01);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-1351.560838));
      long long0 = rationalNumber0.longValue();
      assertEquals((-1351L), long0);
      assertEquals((-1351.5608F), rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(0L, (-1L));
      int int0 = rationalNumber0.intValue();
      assertEquals(0, int0);
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(0.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-5786L), 1);
      int int0 = rationalNumber0.intValue();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals((-5786), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(0, (-172));
      float float0 = rationalNumber0.floatValue();
      assertEquals(-0.0F, float0, 0.01F);
      assertEquals((-172), rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-1871), (-3456L));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      float float0 = rationalNumber1.floatValue();
      assertEquals(1871, rationalNumber0.numerator);
      assertEquals(3456, rationalNumber0.divisor);
      assertEquals((-0.5413773F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(583L, 583L);
      double double0 = rationalNumber0.doubleValue();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-1351.560838));
      double double0 = rationalNumber0.doubleValue();
      assertEquals((-1351.5608379917455), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(309, 0);
      // Undeclared exception!
      try { 
        rationalNumber0.toDisplayString();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.imaging.common.RationalNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-172), 0L);
      // Undeclared exception!
      try { 
        rationalNumber0.longValue();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483647L, 0L);
      // Undeclared exception!
      try { 
        rationalNumber0.intValue();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        RationalNumber.factoryMethod(0L, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.imaging.common.RationalNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(0L, 2147483656L);
      double double0 = rationalNumber0.doubleValue();
      assertEquals(0.0, double0, 0.01);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(783.0319032009685);
      assertEquals(41356613, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0);
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(0.0F, rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-1073741824));
      assertEquals((-1.073741824E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2147483660L));
      assertEquals((-2.147483647E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2147483647L);
      assertEquals(2.147483647E9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.147483646870801E9);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("2147483647", string0);
      assertEquals(2.147483647E9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), (-2147483649L));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals(0.9999999990686774, rationalNumber0.doubleValue(), 0.01);
      assertEquals("1", string0);
      assertEquals(1073741824, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-1163), (-1163));
      String string0 = rationalNumber0.toString();
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483660L), 2147483647L);
      String string0 = rationalNumber0.toString();
      assertEquals("153391690/-153391689 (-1)", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        RationalNumber.factoryMethod(2147483656L, 0L);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Invalid value, numerator: 2147483656, divisor: 0
         //
         verifyException("org.apache.commons.imaging.common.RationalNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483656L, 1);
      assertEquals(1, rationalNumber0.divisor);
      assertEquals((-2.14748364E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(4.135662336589025E7);
      assertEquals(1695621558, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1L, 2147483656L);
      assertEquals((-4.656612890424627E-10), rationalNumber0.doubleValue(), 0.01);
      assertEquals((-2147483640), rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483649L), (-2147483649L));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals(1, rationalNumber0.numerator);
      assertEquals((-1.0F), rationalNumber1.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.0E-8);
      long long0 = rationalNumber0.longValue();
      assertEquals(0L, long0);
      assertEquals(1.0E-8, rationalNumber0.doubleValue(), 0.01);
      assertEquals(100000000, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(1, 1);
      int int0 = rationalNumber0.intValue();
      assertEquals(1, int0);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(1, 1);
      float float0 = rationalNumber0.floatValue();
      assertEquals(1.0F, float0, 0.01F);
  }
}
