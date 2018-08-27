/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 19:22:08 GMT 2018
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
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2118L);
      assertEquals(2118, rationalNumber0.numerator);
      assertEquals(2118.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      String string0 = rationalNumber1.toString();
      assertEquals("0", string0);
      assertEquals(1, rationalNumber1.divisor);
      assertEquals(0.0F, rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2388));
      assertEquals((-2388.0), rationalNumber0.doubleValue(), 0.01);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.1474836399528546E9);
      String string0 = rationalNumber0.toString();
      assertEquals("2,147,483,640", string0);
      assertEquals(2.14748364E9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.401224380970234E-8);
      String string0 = rationalNumber0.toString();
      assertEquals(1.401224373042472E-8, rationalNumber0.doubleValue(), 0.01);
      assertEquals("1/71366158 (0)", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2309.3333333333335);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("2,309.333", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1501.5);
      assertEquals(3003, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2309.75);
      int int0 = rationalNumber0.intValue();
      assertEquals(2309, int0);
      assertEquals(9239, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-1133.0028));
      assertEquals((-1133.0), rationalNumber0.doubleValue(), 0.01);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2.147483647E9));
      assertEquals((-2.147483647E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(0, 0);
      String string0 = rationalNumber0.toString();
      assertEquals("Invalid rational (0/0)", string0);
      
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals(Float.NaN, rationalNumber1.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483682L), (-2147483682L));
      RationalNumber rationalNumber1 = RationalNumber.factoryMethod(1, (-2147483682L));
      assertEquals(2147483614, rationalNumber1.divisor);
      assertEquals(1, rationalNumber1.numerator);
      
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("1", string0);
      
      String string1 = rationalNumber0.toString();
      assertEquals("1", string1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483671L, 2147483671L);
      int int0 = rationalNumber0.intValue();
      assertEquals(1, int0);
      assertEquals(1, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0L);
      assertEquals(0, rationalNumber0.numerator);
      
      RationalNumber rationalNumber1 = RationalNumber.valueOf(1.0000001038537297E8);
      String string0 = rationalNumber1.toString();
      assertEquals("1300000135/13 (100,000,010.385)", string0);
      
      RationalNumber rationalNumber2 = rationalNumber1.negate();
      assertEquals((short)7926, rationalNumber2.shortValue());
      
      RationalNumber.valueOf(2.147483647E9);
      RationalNumber rationalNumber3 = new RationalNumber(505, 0);
      rationalNumber3.negate();
      RationalNumber rationalNumber4 = RationalNumber.valueOf(Integer.MAX_VALUE);
      assertEquals(2.14748365E9F, rationalNumber4.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(806L, 806L);
      RationalNumber rationalNumber1 = RationalNumber.factoryMethod(806L, 2147483671L);
      RationalNumber rationalNumber2 = new RationalNumber(1, (-106));
      String string0 = rationalNumber1.toString();
      assertEquals("403/1073741835 (0)", string0);
      
      rationalNumber2.floatValue();
      rationalNumber0.doubleValue();
      assertEquals(1L, rationalNumber0.longValue());
      assertEquals(1.0F, rationalNumber0.floatValue(), 0.01F);
      assertEquals(1, rationalNumber0.divisor);
      
      long long0 = rationalNumber1.longValue();
      assertEquals(3.753229937250233E-7, rationalNumber1.doubleValue(), 0.01);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      long long0 = 0L;
      // Undeclared exception!
      try { 
        RationalNumber.factoryMethod(2147483671L, 0L);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Invalid value, numerator: 2147483671, divisor: 0
         //
         verifyException("org.apache.commons.imaging.common.RationalNumber", e);
      }
  }
}