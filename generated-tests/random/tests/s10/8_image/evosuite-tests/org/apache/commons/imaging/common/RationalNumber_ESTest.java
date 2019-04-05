/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 19:04:05 GMT 2019
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
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1);
      assertEquals(1.0, rationalNumber0.doubleValue(), 0.01);
      assertEquals(1L, rationalNumber0.longValue());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1702L, 1702L);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      String string0 = rationalNumber1.toDisplayString();
      assertEquals("-1", string0);
      assertEquals(1, rationalNumber0.numerator);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-307), (-1884L));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals(0.16295116772823778, rationalNumber0.doubleValue(), 0.01);
      assertEquals(307, rationalNumber0.numerator);
      assertEquals("0.163", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1346L, 894L);
      String string0 = rationalNumber0.toString();
      assertEquals("673/447 (1.506)", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483647L, 2147483647L);
      assertEquals(1.0F, rationalNumber0.floatValue(), 0.01F);
      assertEquals(1, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1346L, 1346L);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      RationalNumber rationalNumber2 = rationalNumber1.negate();
      assertEquals(1, rationalNumber1.divisor);
      assertEquals((short)1, rationalNumber2.shortValue());
      assertEquals((-1), rationalNumber1.numerator);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(269L, (-780L));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals(269, rationalNumber0.numerator);
      assertEquals(0.34487179487179487, rationalNumber1.doubleValue(), 0.01);
      assertEquals((-780), rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), 307L);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals(6995060.74267101, rationalNumber0.doubleValue(), 0.01);
      assertEquals(6995060.74267101, rationalNumber1.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(3, 100);
      long long0 = rationalNumber0.longValue();
      assertEquals(0L, long0);
      assertEquals(0.03, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1702L, 1702L);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      long long0 = rationalNumber1.longValue();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals((-1L), long0);
      assertEquals(1, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-307), (-1884L));
      int int0 = rationalNumber0.intValue();
      assertEquals(307, rationalNumber0.numerator);
      assertEquals(0, int0);
      assertEquals(0.16295116772823778, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1346L, 1346L);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      int int0 = rationalNumber1.intValue();
      assertEquals(1, rationalNumber1.divisor);
      assertEquals((-1), int0);
      assertEquals((short)1, rationalNumber0.shortValue());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(0L, 1L);
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(0.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(3303L, 1);
      assertEquals(3303.0F, rationalNumber0.floatValue(), 0.01F);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1346L, 1346L);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      double double0 = rationalNumber1.doubleValue();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(1, rationalNumber0.numerator);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-1L), 0);
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
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        RationalNumber.factoryMethod(0, 0L);
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
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), 307L);
      double double0 = rationalNumber0.doubleValue();
      assertEquals(6995060.74267101, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(709.242541);
      assertEquals(7178953, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-16992476));
      assertEquals((-1.6992476E7), rationalNumber0.doubleValue(), 0.01);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.0E-8);
      assertEquals(100000000, rationalNumber0.divisor);
      assertEquals(1.0E-8, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(0.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2.147483647E9));
      assertEquals((-2.147483647E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.147483647E9);
      assertEquals(2.147483647E9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483664L, 2147483664L);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals(1, rationalNumber0.numerator);
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), 307L);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("6,995,060.743", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2233263, (-1L));
      String string0 = rationalNumber0.toString();
      assertEquals("-2,233,263", string0);
      assertEquals((-2233263), rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2583L, 0L);
      String string0 = rationalNumber0.toString();
      assertEquals("Invalid rational (1/0)", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), 307L);
      String string0 = rationalNumber0.toString();
      assertEquals("-2147483648/-307 (6,995,060.743)", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483678L, 1);
      assertEquals((-2.147483618E9), rationalNumber0.doubleValue(), 0.01);
      assertEquals((-2147483618), rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-1L), 2147483664L);
      assertEquals(2147483632, rationalNumber0.divisor);
      assertEquals(4.656612907771862E-10, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(6995060.74267101);
      assertEquals(1196155387, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), 307L);
      long long0 = rationalNumber0.longValue();
      assertEquals(Integer.MIN_VALUE, rationalNumber0.numerator);
      assertEquals(6995060L, long0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), 307L);
      int int0 = rationalNumber0.intValue();
      assertEquals(6995060, int0);
      assertEquals(6995060.74267101, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), 307L);
      float float0 = rationalNumber0.floatValue();
      assertEquals(6995060.5F, float0, 0.01F);
      assertEquals(Integer.MIN_VALUE, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-1948.867188));
      float float0 = rationalNumber0.floatValue();
      assertEquals((-1948.8672F), float0, 0.01F);
  }
}
