/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 19:30:30 GMT 2019
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
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1045);
      assertEquals(1045.0, rationalNumber0.doubleValue(), 0.01);
      assertEquals(1045, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.147483647E9);
      assertEquals(2.147483647E9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-1956), (-1956));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(30235L, (-2147483651L));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals(357913942, rationalNumber0.divisor);
      assertEquals((-1.4078803334238374E-5), rationalNumber0.doubleValue(), 0.01);
      assertEquals("-0", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-1057), (-1057));
      String string0 = rationalNumber0.toString();
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-2147483647), (-1682));
      String string0 = rationalNumber0.toString();
      assertEquals("-2147483647/-1682 (1,276,744.142)", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), 2147483651L);
      assertEquals((-0.9999999990686774), rationalNumber0.doubleValue(), 0.01);
      assertEquals((-1073741824), rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-1057), 2147483647L);
      assertEquals((-1057), rationalNumber0.numerator);
      assertEquals((-4.92204E-7F), rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483647L, (-2147483651L));
      assertEquals((-0.9999999972060323), rationalNumber0.doubleValue(), 0.01);
      assertEquals((-357913941), rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-1.0));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals(1, rationalNumber1.numerator);
      assertEquals(1L, rationalNumber1.longValue());
      assertEquals((-1.0), rationalNumber0.doubleValue(), 0.01);
      assertEquals((-1.0F), rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals(0.0F, rationalNumber1.floatValue(), 0.01F);
      assertEquals(0.0, rationalNumber0.doubleValue(), 0.01);
      assertEquals(1, rationalNumber1.divisor);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-262L), (-2147483661L));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      RationalNumber rationalNumber2 = rationalNumber1.negate();
      assertEquals(131, rationalNumber2.numerator);
      assertEquals((-1.2200326E-7F), rationalNumber1.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      long long0 = rationalNumber0.longValue();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2147483647));
      long long0 = rationalNumber0.longValue();
      assertEquals((-2147483647L), long0);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      int int0 = rationalNumber0.intValue();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(0, int0);
      assertEquals(0.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-1696), 1148L);
      int int0 = rationalNumber0.intValue();
      assertEquals((-1), int0);
      assertEquals((-287), rationalNumber0.divisor);
      assertEquals(424, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-1956), (-1956));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      float float0 = rationalNumber1.floatValue();
      assertEquals((-1.0F), float0, 0.01F);
      assertEquals(1.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-4156L), 26L);
      assertEquals((-13), rationalNumber0.divisor);
      assertEquals((-159.84616F), rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(0L, (-2147483661L));
      assertEquals(0, rationalNumber0.numerator);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-262L), (-6L));
      assertEquals(3, rationalNumber0.divisor);
      assertEquals(43.666668F, rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(0, (-970));
      double double0 = rationalNumber0.doubleValue();
      assertEquals(-0.0, double0, 0.01);
      assertEquals((-970), rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-1956), (-1956));
      double double0 = rationalNumber0.doubleValue();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), 0);
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
  public void test23()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(801L, 0L);
      // Undeclared exception!
      try { 
        rationalNumber0.longValue();
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
  public void test25()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2533.128155359459);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals((-2533.1282F), rationalNumber1.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.0E-8);
      assertEquals(1.0E-8, rationalNumber0.doubleValue(), 0.01);
      assertEquals(100000000, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      float float0 = rationalNumber0.floatValue();
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2.1474836477486405E9));
      double double0 = rationalNumber0.doubleValue();
      assertEquals((-2.147483647E9), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483649L), 1L);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals("2147483647", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483651L), (-1642L));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals(821, rationalNumber0.divisor);
      assertEquals("1,307,846.317", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.147483653643331E9);
      String string0 = rationalNumber0.toString();
      assertEquals("2,147,483,647", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(801L, 0L);
      String string0 = rationalNumber0.toString();
      assertEquals("Invalid rational (1/0)", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483651L), (-1642L));
      String string0 = rationalNumber0.toString();
      assertEquals("1073741826/821 (1,307,846.317)", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-1L), (-2147483661L));
      assertEquals((-4.656612901266649E-10), rationalNumber0.doubleValue(), 0.01);
      assertEquals(1, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        RationalNumber.factoryMethod((-2147483651L), 0L);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Invalid value, numerator: -2147483651, divisor: 0
         //
         verifyException("org.apache.commons.imaging.common.RationalNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-262L), (-2147483648L));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals(1073741824, rationalNumber0.divisor);
      assertEquals((-1.2200325727462769E-7), rationalNumber1.doubleValue(), 0.01);
      assertEquals(131, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-2147483647), (-1682));
      long long0 = rationalNumber0.longValue();
      assertEquals(1276744L, long0);
      assertEquals((-2147483647), rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-2147483647), (-1682));
      int int0 = rationalNumber0.intValue();
      assertEquals(1276744, int0);
      assertEquals(1276744.1420927467, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-2147483647), (-1682));
      float float0 = rationalNumber0.floatValue();
      assertEquals(1276744.1F, float0, 0.01F);
      assertEquals((-2147483647), rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.1474836138019607E9);
      assertEquals(2147483614, rationalNumber0.numerator);
      assertEquals(2.147483614E9, rationalNumber0.doubleValue(), 0.01);
  }
}
