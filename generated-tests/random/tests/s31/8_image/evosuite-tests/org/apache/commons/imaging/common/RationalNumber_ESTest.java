/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 16:00:41 GMT 2019
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
      RationalNumber rationalNumber0 = new RationalNumber(2469, 2469);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("1", string0);
      assertEquals(1.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-637L), (-1766L));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("0.361", string0);
      assertEquals(637, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(2469, 2469);
      String string0 = rationalNumber0.toString();
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(223.4819488);
      String string0 = rationalNumber0.toString();
      assertEquals("2426567/10858 (223.482)", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(223.4819488);
      float float0 = rationalNumber0.floatValue();
      assertEquals(223.48195F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1457L, (-2147483648L));
      assertEquals(6.784684956073761E-7, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1, 2147483647L);
      assertEquals(4.656613E-10F, rationalNumber0.floatValue(), 0.01F);
      assertEquals(Integer.MAX_VALUE, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), 623L);
      assertEquals(3447004.250401284, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(Integer.MAX_VALUE, 1);
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(2.147483647E9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-637L), (-1766L));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals(637, rationalNumber0.numerator);
      assertEquals(0.36070216F, rationalNumber0.floatValue(), 0.01F);
      assertEquals((-0.36070216F), rationalNumber1.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-1.0));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals(1, rationalNumber1.numerator);
      assertEquals(1, rationalNumber1.divisor);
      assertEquals((-1.0), rationalNumber0.doubleValue(), 0.01);
      assertEquals((-1), rationalNumber0.intValue());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-203L), (-203L));
      long long0 = rationalNumber0.longValue();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(934L, 934L);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      long long0 = rationalNumber1.longValue();
      assertEquals(1.0F, rationalNumber0.floatValue(), 0.01F);
      assertEquals((-1L), long0);
      assertEquals(1, rationalNumber1.divisor);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.0E-8);
      int int0 = rationalNumber0.intValue();
      assertEquals(100000000, rationalNumber0.divisor);
      assertEquals(1.0E-8, rationalNumber0.doubleValue(), 0.01);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(2469, 2469);
      int int0 = rationalNumber0.intValue();
      assertEquals(1, int0);
      assertEquals(1.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(0, 1);
      float float0 = rationalNumber0.floatValue();
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(0L, (-2826L));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals(1, rationalNumber1.divisor);
      assertEquals(0.0F, rationalNumber1.floatValue(), 0.01F);
      assertEquals(0.0F, rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-1412L), 80L);
      assertEquals((-17.65), rationalNumber0.doubleValue(), 0.01);
      assertEquals((-353), rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-203L), (-203L));
      double double0 = rationalNumber0.doubleValue();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1, 0);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      double double0 = rationalNumber1.doubleValue();
      assertEquals(1, rationalNumber0.numerator);
      assertEquals(Double.POSITIVE_INFINITY, rationalNumber0.doubleValue(), 0.01);
      assertEquals((-1), rationalNumber1.numerator);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-1L), 0L);
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
      // Undeclared exception!
      try { 
        RationalNumber.factoryMethod(0L, 0L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(0, 1);
      double double0 = rationalNumber0.doubleValue();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2022.999115));
      assertEquals((-2023.0), rationalNumber0.doubleValue(), 0.01);
      assertEquals((-2023L), rationalNumber0.longValue());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(0.0F, rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2.147483647E9));
      assertEquals((-2.147483647E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.147483647E9);
      assertEquals(2.147483647E9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2821.0));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("-2821", string0);
      assertEquals((-2821.0), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-2579), (-169));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("15.26", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-2579), (-169));
      String string0 = rationalNumber0.toString();
      assertEquals("-2579/-169 (15.26)", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-1L), 0L);
      String string0 = rationalNumber0.toString();
      assertEquals("Invalid rational (1/0)", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2821.0));
      String string0 = rationalNumber0.toString();
      assertEquals((-2821.0), rationalNumber0.doubleValue(), 0.01);
      assertEquals("-2,821", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        RationalNumber.factoryMethod(2147483665L, 0L);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Invalid value, numerator: 2147483665, divisor: 0
         //
         verifyException("org.apache.commons.imaging.common.RationalNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1, (-2147483673L));
      assertEquals(4.656612927287502E-10, rationalNumber0.doubleValue(), 0.01);
      assertEquals(2147483623, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1457L, (-2147483668L));
      assertEquals((-536870917), rationalNumber0.divisor);
      assertEquals((-6.7800283E-7F), rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-1073741833), 2147483661L);
      assertEquals((-0.5000000018626451), rationalNumber0.doubleValue(), 0.01);
      assertEquals(1073741830, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483666L), 623L);
      assertEquals((-3452546.08681672), rationalNumber0.doubleValue(), 0.01);
      assertEquals((-1073741833), rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2.1474836459162335E9));
      assertEquals((-2.147483646E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-637L), (-1766L));
      long long0 = rationalNumber0.longValue();
      assertEquals(637, rationalNumber0.numerator);
      assertEquals(0L, long0);
      assertEquals(0.3607021517553794, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2821.0));
      int int0 = rationalNumber0.intValue();
      assertEquals((-2821.0), rationalNumber0.doubleValue(), 0.01);
      assertEquals((-2821), int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2821.0));
      float float0 = rationalNumber0.floatValue();
      assertEquals((-2821.0F), float0, 0.01F);
      assertEquals((-2821.0), rationalNumber0.doubleValue(), 0.01);
  }
}
