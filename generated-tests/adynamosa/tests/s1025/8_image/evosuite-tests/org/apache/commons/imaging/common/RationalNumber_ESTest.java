/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 16:06:26 GMT 2019
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
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-1));
      assertEquals((-1.0), rationalNumber0.doubleValue(), 0.01);
      assertEquals((-1.0F), rationalNumber0.floatValue(), 0.01F);
      assertEquals((-1), rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2147483648L));
      assertEquals((-2147483647L), rationalNumber0.longValue());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.14748365E9F);
      assertEquals(2.147483647E9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-3127), (-3127));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("1", string0);
      assertEquals(1.0F, rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-1103L), (-1103L));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      String string0 = rationalNumber1.toDisplayString();
      assertEquals("-1", string0);
      assertEquals(1, rationalNumber0.numerator);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-2172), 1073741829);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals((-2.022832622645271E-6), rationalNumber0.doubleValue(), 0.01);
      assertEquals("-0", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(2541, 2541);
      String string0 = rationalNumber0.toString();
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483658L, (-4599L));
      String string0 = rationalNumber0.toString();
      assertEquals("1073741829/-2300 (-466,844.273)", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-667L), (-2147483660L));
      assertEquals(3.1106174E-7F, rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(0L, 2147483658L);
      assertEquals(0.0F, rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(Integer.MIN_VALUE, 2147483658L);
      assertEquals(1073741829, rationalNumber0.divisor);
      assertEquals((-0.9999999953433871), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483647L, 2147483658L);
      assertEquals(357913943, rationalNumber0.divisor);
      assertEquals(0.9999999944120646, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1, (-2147483648L));
      assertEquals((-4.6566128730773926E-10), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(Integer.MAX_VALUE, Integer.MAX_VALUE);
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(1.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1088L, 334L);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      RationalNumber rationalNumber2 = rationalNumber1.negate();
      assertEquals(167, rationalNumber2.divisor);
      assertEquals((-3.257485F), rationalNumber1.floatValue(), 0.01F);
      assertEquals(544, rationalNumber2.numerator);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(0L, 1976L);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals(0.0, rationalNumber1.doubleValue(), 0.01);
      assertEquals(0.0F, rationalNumber0.floatValue(), 0.01F);
      assertEquals(1, rationalNumber1.divisor);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2020.351141);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals((-2020.3512F), rationalNumber1.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(0L, 1976L);
      long long0 = rationalNumber0.longValue();
      assertEquals(0.0, rationalNumber0.doubleValue(), 0.01);
      assertEquals(0L, long0);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-1103L), (-1103L));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      long long0 = rationalNumber1.longValue();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(1, rationalNumber0.numerator);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.0E-8);
      int int0 = rationalNumber0.intValue();
      assertEquals(100000000, rationalNumber0.divisor);
      assertEquals(1.0E-8, rationalNumber0.doubleValue(), 0.01);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-1103L), (-1103L));
      int int0 = rationalNumber0.intValue();
      assertEquals(1, int0);
      assertEquals(1, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1088L, 334L);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      float float0 = rationalNumber1.floatValue();
      assertEquals((-3.257485F), float0, 0.01F);
      assertEquals(167, rationalNumber0.divisor);
      assertEquals(544, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(0L, 1976L);
      float float0 = rationalNumber0.floatValue();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-4294.1365909272));
      double double0 = rationalNumber0.doubleValue();
      assertEquals((-4294.136590929029), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483647), 0L);
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
  public void test25()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(0, 0);
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
  public void test26()  throws Throwable  {
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
  public void test27()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1474L, 923L);
      double double0 = rationalNumber0.doubleValue();
      assertEquals(1.5969664138678223, double0, 0.01);
      assertEquals(1474, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(785.02856);
      assertEquals(1814201, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(Float.NaN);
      assertEquals(Double.POSITIVE_INFINITY, rationalNumber0.doubleValue(), 0.01);
      assertEquals(1, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      double double0 = rationalNumber0.doubleValue();
      assertEquals(0.0, double0, 0.01);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(Integer.MAX_VALUE);
      assertEquals(2.147483647E9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1474L, 923L);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals(923, rationalNumber0.divisor);
      assertEquals("1.597", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(9);
      String string0 = rationalNumber0.toString();
      assertEquals("9", string0);
      assertEquals(9.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-1404L), 0L);
      String string0 = rationalNumber0.toString();
      assertEquals("Invalid rational (1/0)", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        RationalNumber.factoryMethod(2147483658L, 0L);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Invalid value, numerator: 2147483658, divisor: 0
         //
         verifyException("org.apache.commons.imaging.common.RationalNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483658L, 1);
      assertEquals((-2147483638), rationalNumber0.numerator);
      assertEquals((-2.147483638E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1, (-2147483667L));
      assertEquals(2147483629, rationalNumber0.divisor);
      assertEquals(4.656612914277075E-10, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483660L), 415L);
      assertEquals((-5187158.599033817), rationalNumber0.doubleValue(), 0.01);
      assertEquals(207, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2.1474836466632063E9));
      assertEquals((-2.147483647E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1474L, 923L);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      String string0 = rationalNumber1.toString();
      assertEquals("-1474/923 (-1.597)", string0);
      assertEquals(1.5969664138678223, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1652L, 1652L);
      long long0 = rationalNumber0.longValue();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2.147483647E9));
      int int0 = rationalNumber0.intValue();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals((-2147483647), int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1474L, 923L);
      float float0 = rationalNumber0.floatValue();
      assertEquals(1.5969664F, float0, 0.01F);
      assertEquals(1474, rationalNumber0.numerator);
  }
}