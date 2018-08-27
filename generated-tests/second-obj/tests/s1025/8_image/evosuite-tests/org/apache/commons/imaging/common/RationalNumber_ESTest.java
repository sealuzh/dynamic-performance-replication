/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 10:43:36 GMT 2018
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
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      float float0 = rationalNumber0.floatValue();
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      long long0 = rationalNumber0.longValue();
      assertEquals(0L, long0);
      assertEquals(0.0F, rationalNumber0.floatValue(), 0.01F);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-3127), (-3127));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      String string0 = rationalNumber1.toDisplayString();
      assertEquals("-1", string0);
      assertEquals((-1.0), rationalNumber1.doubleValue(), 0.01);
      assertEquals(1.0F, rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.8954710867546964E-7);
      assertEquals(1.8954712075080374E-7, rationalNumber0.doubleValue(), 0.01);
      assertEquals(1.8954712E-7F, rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-194L));
      assertEquals((-194.0), rationalNumber0.doubleValue(), 0.01);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.0);
      assertEquals(1.0, rationalNumber0.doubleValue(), 0.01);
      assertEquals(1.0F, rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-28L), (-28L));
      String string0 = rationalNumber0.toString();
      assertEquals("1", string0);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(21, Integer.MAX_VALUE);
      String string0 = rationalNumber0.toString();
      assertEquals("21/2147483647 (0)", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2147483648L));
      long long0 = rationalNumber0.longValue();
      assertEquals((-2147483647L), long0);
      
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("-2147483647", string0);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.147483610331467E9);
      assertEquals(2.14748361E9, rationalNumber0.doubleValue(), 0.01);
      assertEquals(2147483610, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(3.715600869327318E-4);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals((-3.7156304E-4F), rationalNumber1.floatValue(), 0.01F);
      
      double double0 = rationalNumber0.doubleValue();
      assertEquals(3.715630418627694E-4, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(621.5);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("621.5", string0);
      
      long long0 = rationalNumber0.longValue();
      assertEquals(2, rationalNumber0.divisor);
      assertEquals(621L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2194.8);
      assertEquals(10974, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.0100412062286068E-8);
      int int0 = rationalNumber0.intValue();
      assertEquals(1.010041203418844E-8, rationalNumber0.doubleValue(), 0.01);
      assertEquals(0, int0);
      assertEquals(99005862, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(0, 0);
      String string0 = rationalNumber0.toString();
      assertEquals("Invalid rational (0/0)", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2147483662L);
      assertEquals(2.147483647E9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-994.0053209));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("-994.01", string0);
      assertEquals((-994.009900990099), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        RationalNumber.factoryMethod(2147483662L, 0L);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Invalid value, numerator: 2147483662, divisor: 0
         //
         verifyException("org.apache.commons.imaging.common.RationalNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), 2147483667L);
      assertEquals((-0.9999999916180969), rationalNumber0.doubleValue(), 0.01);
      assertEquals(1073741824, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483667L, 2147483667L);
      assertEquals(1.0, rationalNumber0.doubleValue(), 0.01);
      assertEquals(1, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-1L), 2147483662L);
      assertEquals(2147483634, rationalNumber0.divisor);
      assertEquals(4.656612903435053E-10, rationalNumber0.doubleValue(), 0.01);
      
      RationalNumber rationalNumber1 = RationalNumber.valueOf(0L);
      String string0 = rationalNumber1.toDisplayString();
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483706L), (-2147483648L));
      assertEquals(1073741824, rationalNumber0.divisor);
      assertEquals(1.0000000270083547, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-535L), (-2147483675L));
      assertEquals(2.4959444674260705E-7, rationalNumber0.doubleValue(), 0.01);
      assertEquals(536870919, rationalNumber0.divisor);
      
      RationalNumber rationalNumber1 = new RationalNumber(134, 536870919);
      assertEquals(2.4959445E-7F, rationalNumber1.floatValue(), 0.01F);
  }
}