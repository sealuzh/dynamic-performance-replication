/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 12:13:14 GMT 2018
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
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2147483647L);
      double double0 = rationalNumber0.doubleValue();
      assertEquals(2.147483647E9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      long long0 = rationalNumber0.longValue();
      assertEquals(0.0, rationalNumber0.doubleValue(), 0.01);
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-17));
      assertEquals((-17.0), rationalNumber0.doubleValue(), 0.01);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2.1474836464771314E9));
      long long0 = rationalNumber0.longValue();
      assertEquals((-2.147483646E9), rationalNumber0.doubleValue(), 0.01);
      assertEquals((-2147483646L), long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.015);
      assertEquals(0.015F, rationalNumber0.floatValue(), 0.01F);
      
      RationalNumber rationalNumber1 = RationalNumber.valueOf(200);
      rationalNumber1.toDisplayString();
      String string0 = rationalNumber1.toDisplayString();
      assertEquals("200", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2629.5));
      assertEquals(2, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-719.2));
      float float0 = rationalNumber0.floatValue();
      assertEquals((-719.2F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2.147483647E9));
      long long0 = rationalNumber0.longValue();
      assertEquals((-2147483647L), long0);
      
      int int0 = rationalNumber0.intValue();
      assertEquals((-2147483647), int0);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-2147483647), 2130);
      String string0 = rationalNumber0.toString();
      assertEquals("-2147483647/2130 (-1,008,208.285)", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(3.034451623307177E-8);
      String string0 = rationalNumber0.toString();
      assertEquals("1/32954884 (0)", string0);
      assertEquals(3.0344515853856445E-8, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2630.006082207985));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("-2,630.01", string0);
      
      double double0 = rationalNumber0.doubleValue();
      assertEquals((-2630.009900990099), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2248, 0L);
      String string0 = rationalNumber0.toString();
      assertEquals("Invalid rational (1/0)", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.0E-8);
      float float0 = rationalNumber0.floatValue();
      assertEquals(1.0E-8F, float0, 0.01F);
      
      String string0 = rationalNumber0.toString();
      assertEquals("1/100000000 (0)", string0);
      assertEquals(1.0E-8, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        RationalNumber.factoryMethod((-2147483664L), 0L);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Invalid value, numerator: -2147483664, divisor: 0
         //
         verifyException("org.apache.commons.imaging.common.RationalNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483665L, 2147483665L);
      double double0 = rationalNumber0.doubleValue();
      assertEquals(1, rationalNumber0.numerator);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483687L, 2147483687L);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      rationalNumber1.toDisplayString();
      RationalNumber rationalNumber2 = rationalNumber0.negate();
      String string0 = rationalNumber2.toDisplayString();
      RationalNumber rationalNumber3 = RationalNumber.factoryMethod((-1), 2147483687L);
      assertEquals(0L, rationalNumber3.longValue());
      assertEquals(1, rationalNumber3.numerator);
      assertEquals((short)0, rationalNumber3.shortValue());
      
      rationalNumber0.intValue();
      int int0 = rationalNumber0.intValue();
      assertEquals(1, int0);
      
      RationalNumber rationalNumber4 = RationalNumber.factoryMethod(1, 0L);
      RationalNumber rationalNumber5 = rationalNumber4.negate();
      float float0 = rationalNumber1.floatValue();
      assertEquals((-1.0F), float0, 0.01F);
      
      long long0 = rationalNumber2.longValue();
      assertEquals((-1L), long0);
      
      String string1 = rationalNumber2.toString();
      assertTrue(string1.equals((Object)string0));
      assertEquals(1, rationalNumber2.divisor);
      
      float float1 = rationalNumber5.floatValue();
      assertEquals(Float.NEGATIVE_INFINITY, float1, 0.01F);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-28L), (-2147483668L));
      RationalNumber rationalNumber1 = RationalNumber.factoryMethod(1L, (-2147483668L));
      assertEquals(1, rationalNumber1.numerator);
      
      String string0 = rationalNumber0.toString();
      assertEquals("7/536870917 (0)", string0);
  }
}
