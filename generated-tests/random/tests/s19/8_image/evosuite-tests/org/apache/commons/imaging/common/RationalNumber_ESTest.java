/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 03:29:41 GMT 2019
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
      RationalNumber rationalNumber0 = RationalNumber.valueOf(7);
      assertEquals(7.0, rationalNumber0.doubleValue(), 0.01);
      assertEquals((byte)7, rationalNumber0.byteValue());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), (-2147483648L));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      String string0 = rationalNumber1.toDisplayString();
      assertEquals(1, rationalNumber0.numerator);
      assertEquals(1, rationalNumber0.divisor);
      assertEquals("-1", string0);
      assertEquals(1, rationalNumber1.divisor);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(948L, (-56L));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("-16.929", string0);
      assertEquals(14, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), (-2147483648L));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      String string0 = rationalNumber1.toString();
      assertEquals("-1", string0);
      assertEquals(1, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(948L, (-56L));
      String string0 = rationalNumber0.toString();
      assertEquals("-237/14 (-16.929)", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483655L, (-1L));
      assertEquals(2147483641, rationalNumber0.numerator);
      assertEquals(2.147483641E9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1, 2147483647L);
      assertEquals(Integer.MAX_VALUE, rationalNumber0.divisor);
      assertEquals(4.656612875245797E-10, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(Integer.MAX_VALUE, (-1L));
      assertEquals((-2.147483647E9), rationalNumber0.doubleValue(), 0.01);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), (-2147483648L));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      RationalNumber rationalNumber2 = rationalNumber1.negate();
      assertEquals((-1), rationalNumber1.numerator);
      assertEquals(1, rationalNumber1.divisor);
      assertEquals(1.0, rationalNumber2.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), (-2147483648L));
      long long0 = rationalNumber0.longValue();
      assertEquals(1L, long0);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(759, 759);
      int int0 = rationalNumber0.intValue();
      assertEquals(1, int0);
      assertEquals(759, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-684L), (-684L));
      float float0 = rationalNumber0.floatValue();
      assertEquals(1, rationalNumber0.numerator);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-872), (-872));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      float float0 = rationalNumber1.floatValue();
      assertEquals((-1.0F), float0, 0.01F);
      assertEquals(1.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(948L, (-56L));
      int int0 = rationalNumber0.intValue();
      assertEquals((-237), rationalNumber0.numerator);
      assertEquals((-16), int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      double double0 = rationalNumber0.doubleValue();
      assertEquals(0.0, double0, 0.01);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1, (-259L));
      double double0 = rationalNumber0.doubleValue();
      assertEquals(1, rationalNumber0.numerator);
      assertEquals((-0.003861003861003861), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(1696, 0);
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
  public void test17()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(1058, 0);
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
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-872), (-872));
      double double0 = rationalNumber0.doubleValue();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1584.99178538187);
      assertEquals(1584.990099009901, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.5641025558797992E-5);
      assertEquals(39000, rationalNumber0.divisor);
      assertEquals(2.564102564102564E-5, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-31.60641289541));
      assertEquals((-31.606413F), rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2.147483647E9));
      long long0 = rationalNumber0.longValue();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals((-2147483647L), long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.147483647E9);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals((-2.147483647E9), rationalNumber1.doubleValue(), 0.01);
      assertEquals((byte) (-1), rationalNumber0.byteValue());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-872), (-872));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-1L), (-872));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals(872, rationalNumber0.divisor);
      assertEquals("0.001", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-1L), (-872));
      String string0 = rationalNumber0.toString();
      assertEquals("1/872 (0.001)", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(1696, 0);
      String string0 = rationalNumber0.toString();
      assertEquals("Invalid rational (1696/0)", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-872), (-872));
      String string0 = rationalNumber0.toString();
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        RationalNumber.factoryMethod((-2147483661L), 0L);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Invalid value, numerator: -2147483661, divisor: 0
         //
         verifyException("org.apache.commons.imaging.common.RationalNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(0L, (-2147483661L));
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(0.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-872), (-2147483661L));
      assertEquals(436, rationalNumber0.numerator);
      assertEquals(4.0605664E-7F, rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(759, 4294967275L);
      assertEquals(1.7648562879364095E-7, rationalNumber0.doubleValue(), 0.01);
      assertEquals(379, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.1474836373589165E9);
      assertEquals(2.147483637E9, rationalNumber0.doubleValue(), 0.01);
      assertEquals(2147483637, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals(1, rationalNumber1.divisor);
      assertEquals(0.0F, rationalNumber1.floatValue(), 0.01F);
      assertEquals(0.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      long long0 = rationalNumber0.longValue();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      int int0 = rationalNumber0.intValue();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(0.0F, rationalNumber0.floatValue(), 0.01F);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      float float0 = rationalNumber0.floatValue();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1);
      assertEquals(1.0, rationalNumber0.doubleValue(), 0.01);
      assertEquals(1.0F, rationalNumber0.floatValue(), 0.01F);
  }
}
