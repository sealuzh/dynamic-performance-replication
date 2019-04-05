/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 13:03:47 GMT 2019
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
      RationalNumber rationalNumber0 = new RationalNumber(3607, 3607);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals(1.0, rationalNumber0.doubleValue(), 0.01);
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(166L, 1155L);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      String string0 = rationalNumber1.toDisplayString();
      assertEquals("-0.144", string0);
      assertEquals(166, rationalNumber0.numerator);
      assertEquals(1155, rationalNumber0.divisor);
      assertEquals(1155, rationalNumber1.divisor);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(100, 100);
      String string0 = rationalNumber0.toString();
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-585L), 691L);
      int int0 = rationalNumber0.intValue();
      assertEquals((-0.8465991F), rationalNumber0.floatValue(), 0.01F);
      assertEquals(585, rationalNumber0.numerator);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(0L, (-2147483648L));
      assertEquals(0.0, rationalNumber0.doubleValue(), 0.01);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(0L, (-1894L));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals(0.0F, rationalNumber1.floatValue(), 0.01F);
      assertEquals(1, rationalNumber1.divisor);
      assertEquals(0.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-13L), (-5835L));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      String string0 = rationalNumber1.toString();
      assertEquals(0.0022279348F, rationalNumber0.floatValue(), 0.01F);
      assertEquals("-13/5835 (-0.002)", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-633L), (-633L));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      RationalNumber rationalNumber2 = rationalNumber1.negate();
      assertEquals((-1), rationalNumber1.numerator);
      assertEquals(1.0, rationalNumber2.doubleValue(), 0.01);
      assertEquals(1, rationalNumber1.divisor);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-13L), (-5835L));
      long long0 = rationalNumber0.longValue();
      assertEquals(0L, long0);
      assertEquals(0.0022279348757497856, rationalNumber0.doubleValue(), 0.01);
      assertEquals(5835, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-633L), (-633L));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      long long0 = rationalNumber1.longValue();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals((-1L), long0);
      assertEquals(1, rationalNumber1.divisor);
      assertEquals(1, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-633L), (-633L));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      int int0 = rationalNumber1.intValue();
      assertEquals(1, rationalNumber0.numerator);
      assertEquals(1, rationalNumber0.divisor);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1, 0L);
      float float0 = rationalNumber0.floatValue();
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
      assertEquals(1, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-3324.860921));
      float float0 = rationalNumber0.floatValue();
      assertEquals((-3324.8608F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2555L), 16409);
      double double0 = rationalNumber0.doubleValue();
      assertEquals(2555, rationalNumber0.numerator);
      assertEquals((-0.1557072338350905), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(12617L, 0L);
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
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        RationalNumber.factoryMethod(0L, 0L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.imaging.common.RationalNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(0, (-2147483646));
      double double0 = rationalNumber0.doubleValue();
      assertEquals(-0.0, double0, 0.01);
      assertEquals((-2147483646), rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.147483645839814E9);
      double double0 = rationalNumber0.doubleValue();
      assertEquals(2.147483646E9, double0, 0.01);
      assertEquals(2147483646, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(248.039995287);
      assertEquals(6201, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.2950385644217022E-4);
      assertEquals(7722, rationalNumber0.divisor);
      assertEquals(1.295001295001295E-4, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(0.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2147483646));
      assertEquals((-2.147483646E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2147483648L));
      assertEquals((-2.147483647E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(Integer.MAX_VALUE);
      assertEquals(2.147483647E9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.147483645839814E9);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals(2.147483646E9, rationalNumber0.doubleValue(), 0.01);
      assertEquals("2147483646", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1447.83902214021);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("1,447.839", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), 2147483646);
      String string0 = rationalNumber0.toString();
      assertEquals("1073741824/-1073741823 (-1)", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(95L, 0L);
      String string0 = rationalNumber0.toString();
      assertEquals("Invalid rational (1/0)", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.147483645839814E9);
      String string0 = rationalNumber0.toString();
      assertEquals("2,147,483,646", string0);
      assertEquals(2.147483646E9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1, 4294967293L);
      assertEquals((-3), rationalNumber0.divisor);
      assertEquals((-0.33333334F), rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(4294967291L, (-1L));
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(5.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.0);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals((-1.0), rationalNumber1.doubleValue(), 0.01);
      assertEquals((-1.0F), rationalNumber1.floatValue(), 0.01F);
      assertEquals(1.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.0);
      long long0 = rationalNumber0.longValue();
      assertEquals(1L, long0);
      assertEquals(1.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.0);
      int int0 = rationalNumber0.intValue();
      assertEquals(1, int0);
      assertEquals(1.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(0L, (-1894L));
      float float0 = rationalNumber0.floatValue();
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(1, rationalNumber0.divisor);
  }
}
