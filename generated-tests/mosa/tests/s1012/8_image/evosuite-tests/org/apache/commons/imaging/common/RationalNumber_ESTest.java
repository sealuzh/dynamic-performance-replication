/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 03:27:52 GMT 2018
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
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-467.4541));
      assertEquals((-467.4541F), rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(0.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.0E-8);
      String string0 = rationalNumber0.toString();
      assertEquals("1/100000000 (0)", string0);
      assertEquals(1.0E-8, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-695.0));
      String string0 = rationalNumber0.toString();
      assertEquals("-695", string0);
      assertEquals((-695.0), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-758L), (-758L));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1755.0);
      int int0 = rationalNumber0.intValue();
      assertEquals(1755, int0);
      assertEquals(1755.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483651L), (-2147483651L));
      long long0 = rationalNumber0.longValue();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(857.851732925384);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("857.852", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(8L, 8L);
      float float0 = rationalNumber0.floatValue();
      assertEquals(1.0F, float0, 0.01F);
      assertEquals(1, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.147483647E9);
      assertEquals(2.147483647E9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(0, 0);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      String string0 = rationalNumber1.toString();
      assertEquals("Invalid rational (0/0)", string0);
      assertEquals(0, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-3211.8001032));
      assertEquals((-3211.8), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2.147483647E9));
      assertEquals((-2.147483647E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(9L, (-2147483651L));
      String string0 = rationalNumber0.toString();
      assertEquals("-2/536870913 (-0)", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483698L), (-1L));
      float float0 = rationalNumber0.floatValue();
      assertEquals((-2147483598), rationalNumber0.numerator);
      assertEquals((-2.14748365E9F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RationalNumber.factoryMethod(0L, (-2147483651L));
      // Undeclared exception!
      try { 
        RationalNumber.factoryMethod((-2147483651L), 0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Invalid value, numerator: -2147483651, divisor: 0
         //
         verifyException("org.apache.commons.imaging.common.RationalNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483662L, 2147483662L);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-1966L), 2147483686L);
      String string0 = rationalNumber0.toString();
      assertEquals("983/-1073741843 (-0)", string0);
      
      long long0 = rationalNumber0.longValue();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2.1474836097935026E9));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("-2147483610", string0);
      
      int int0 = rationalNumber0.intValue();
      assertEquals((-2147483610), int0);
      
      String string1 = rationalNumber0.toString();
      assertEquals("-2,147,483,610", string1);
      assertEquals((-2.14748361E9), rationalNumber0.doubleValue(), 0.01);
  }
}
