/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 10:37:56 GMT 2019
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
      RationalNumber rationalNumber0 = RationalNumber.valueOf(6914);
      assertEquals(6914, rationalNumber0.numerator);
      assertEquals(6914.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2.147483647E9));
      assertEquals((-2.147483647E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(1432, 1432);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.147483647E9);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("2147483647", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1707L, (-2147483648L));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      String string0 = rationalNumber1.toDisplayString();
      assertEquals(7.948838174343109E-7, rationalNumber0.doubleValue(), 0.01);
      assertEquals("-0", string0);
      assertEquals(1707, rationalNumber1.numerator);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(1379, 1379);
      String string0 = rationalNumber0.toString();
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483647L, 0L);
      String string0 = rationalNumber0.toString();
      assertEquals("Invalid rational (1/0)", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1707L, (-2147483648L));
      String string0 = rationalNumber0.toString();
      assertEquals("-1707/-2147483648 (0)", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(3, 3);
      float float0 = rationalNumber0.floatValue();
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(0L, (-2147483666L));
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(0.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1, 2147483647L);
      assertEquals(Integer.MAX_VALUE, rationalNumber0.divisor);
      assertEquals(4.656612875245797E-10, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), (-2147483652L));
      assertEquals(0.9999999981373549, rationalNumber0.doubleValue(), 0.01);
      assertEquals(536870912, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(Integer.MAX_VALUE, (-2147483674L));
      assertEquals((-0.9999999869614841), rationalNumber0.doubleValue(), 0.01);
      assertEquals((-153391691), rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals(0.0F, rationalNumber0.floatValue(), 0.01F);
      assertEquals(1, rationalNumber1.divisor);
      assertEquals(0.0F, rationalNumber1.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2225.73223));
      rationalNumber0.negate();
      assertEquals((-2225.7322F), rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-824), 5110);
      long long0 = rationalNumber0.longValue();
      assertEquals(0L, long0);
      assertEquals((-0.16125244F), rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.147483647E9);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      long long0 = rationalNumber1.longValue();
      assertEquals((-2147483647L), long0);
      assertEquals(1, rationalNumber1.divisor);
      assertEquals((byte) (-1), rationalNumber0.byteValue());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      int int0 = rationalNumber0.intValue();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(0.0, rationalNumber0.doubleValue(), 0.01);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2276.68773);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      int int0 = rationalNumber1.intValue();
      assertEquals((-2276.687729996846), rationalNumber1.doubleValue(), 0.01);
      assertEquals((-2276), int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      float float0 = rationalNumber0.floatValue();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.147483647412667E9);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      float float0 = rationalNumber1.floatValue();
      assertEquals((-2.14748365E9F), float0, 0.01F);
      assertEquals((-2147483647), rationalNumber1.numerator);
      assertEquals(2.147483647E9, rationalNumber0.doubleValue(), 0.01);
      assertEquals(2.14748365E9F, rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483673L), 1);
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(2.147483623E9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483653L, (-109L));
      assertEquals(1073741826, rationalNumber0.numerator);
      assertEquals((-1.9522578654545456E7), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(0L, 1L);
      double double0 = rationalNumber0.doubleValue();
      assertEquals(0.0, double0, 0.01);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(0, 0);
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
        rationalNumber0.intValue();
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
        RationalNumber.factoryMethod(0L, 0L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1707L, (-2147483648L));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      double double0 = rationalNumber1.doubleValue();
      assertEquals((-1707), rationalNumber0.numerator);
      assertEquals((-7.948838174343109E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1707L, (-2147483648L));
      double double0 = rationalNumber0.doubleValue();
      assertEquals(7.948838174343109E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.1474836464801528E9);
      assertEquals(2.147483646E9, rationalNumber0.doubleValue(), 0.01);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.0);
      assertEquals(1.0, rationalNumber0.doubleValue(), 0.01);
      assertEquals(1, rationalNumber0.intValue());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2.1474836700281634E9));
      assertEquals((-2.147483647E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-221L), (-221L));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-324.715575666495));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals((-11111767), rationalNumber0.numerator);
      assertEquals("-324.716", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.3840300400479464E-8);
      String string0 = rationalNumber0.toString();
      assertEquals("1/41945780 (0)", string0);
      assertEquals(2.384030050221977E-8, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      String string0 = rationalNumber0.toString();
      assertEquals("0", string0);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try { 
        RationalNumber.factoryMethod((-2147483690L), 0L);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Invalid value, numerator: -2147483690, divisor: 0
         //
         verifyException("org.apache.commons.imaging.common.RationalNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-1L), (-2147483653L));
      assertEquals((-4.656612883919414E-10), rationalNumber0.doubleValue(), 0.01);
      assertEquals(1, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2235L), 2147483653L);
      assertEquals((-1.0412186364806841E-6), rationalNumber0.doubleValue(), 0.01);
      assertEquals((-559), rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.2538671912136361E7);
      assertEquals(1855723443, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.147483647E9);
      long long0 = rationalNumber0.longValue();
      assertEquals(2147483647L, long0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.147483647412667E9);
      int int0 = rationalNumber0.intValue();
      assertEquals(Integer.MAX_VALUE, int0);
      assertEquals(1, rationalNumber0.divisor);
  }
}
