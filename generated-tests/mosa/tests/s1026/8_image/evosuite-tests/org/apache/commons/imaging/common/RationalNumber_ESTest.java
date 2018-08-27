/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 17:07:33 GMT 2018
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
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1104.3227);
      assertEquals(11043227, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1738.9777777777779);
      float float0 = rationalNumber0.floatValue();
      assertEquals(1738.9778F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2.1474836377095065E9));
      assertEquals((-2.147483638E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-1.0));
      String string0 = rationalNumber0.toString();
      assertEquals((-1.0), rationalNumber0.doubleValue(), 0.01);
      assertEquals(1, rationalNumber0.divisor);
      assertEquals("-1", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-1.0));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("-1", string0);
      assertEquals((-1.0), rationalNumber0.doubleValue(), 0.01);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      long long0 = rationalNumber0.longValue();
      assertEquals(0L, long0);
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(0.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(469.0);
      assertEquals(469, rationalNumber0.numerator);
      assertEquals(469.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2.1474836371103342E9));
      int int0 = rationalNumber0.intValue();
      assertEquals((-2147483637), int0);
      assertEquals((-2.147483637E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.0E-8);
      String string0 = rationalNumber0.toString();
      assertEquals("1/100000000 (0)", string0);
      assertEquals(1.0E-8, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1573.62);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("1,573.62", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2212.1818);
      assertEquals(24334, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.147483647E9);
      assertEquals(2.147483647E9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2147483648L));
      assertEquals((-2.147483647E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(0, 0);
      String string0 = rationalNumber0.toString();
      assertEquals("Invalid rational (0/0)", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(9L, 2147483667L);
      assertEquals(4, rationalNumber0.numerator);
      assertEquals(3.725290267236892E-9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483678L), (-2147483678L));
      RationalNumber rationalNumber1 = RationalNumber.factoryMethod(1, (-2147483678L));
      assertEquals(1, rationalNumber1.numerator);
      assertEquals(2147483618, rationalNumber1.divisor);
      
      RationalNumber rationalNumber2 = new RationalNumber(1, 1);
      String string0 = rationalNumber0.toString();
      assertEquals("1", string0);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        RationalNumber.factoryMethod((-2147483669L), 0L);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Invalid value, numerator: -2147483669, divisor: 0
         //
         verifyException("org.apache.commons.imaging.common.RationalNumber", e);
      }
  }
}