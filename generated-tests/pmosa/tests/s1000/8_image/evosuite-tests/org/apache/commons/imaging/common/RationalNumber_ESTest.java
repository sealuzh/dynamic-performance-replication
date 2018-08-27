/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 16 14:36:12 GMT 2018
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
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.9250838431617012E-4);
      String string0 = rationalNumber0.toString();
      assertEquals("2/10389 (0)", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-1100), 0);
      RationalNumber.factoryMethod((-1100), 0);
      RationalNumber.factoryMethod(0, 568L);
      RationalNumber rationalNumber1 = RationalNumber.valueOf((-2856.87));
      rationalNumber1.negate();
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
  public void test02()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(751.5);
      String string0 = rationalNumber0.toString();
      assertEquals("1503/2 (751.5)", string0);
      
      int int0 = rationalNumber0.intValue();
      assertEquals(751, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      String string0 = rationalNumber0.toString();
      assertEquals("0", string0);
      
      int int0 = rationalNumber0.intValue();
      assertEquals(0, int0);
      
      float float0 = rationalNumber0.floatValue();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.857142856100836E-4);
      assertEquals(3500, rationalNumber0.divisor);
      assertEquals(2.8571428571428574E-4, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.0);
      String string0 = rationalNumber0.toString();
      assertEquals("1", string0);
      
      int int0 = rationalNumber0.intValue();
      assertEquals(1, int0);
      
      float float0 = rationalNumber0.floatValue();
      assertEquals(1.0F, float0, 0.01F);
      assertEquals(1.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2147483647L);
      String string0 = rationalNumber0.toString();
      assertEquals("2,147,483,647", string0);
      
      int int0 = rationalNumber0.intValue();
      assertEquals(Integer.MAX_VALUE, int0);
      
      float float0 = rationalNumber0.floatValue();
      assertEquals(2.14748365E9F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(0, 0);
      rationalNumber0.toString();
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
  public void test08()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-1.0));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals(1, rationalNumber1.numerator);
      
      RationalNumber rationalNumber2 = RationalNumber.valueOf(0.0);
      assertEquals(0, rationalNumber2.numerator);
      
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("-1", string0);
      
      RationalNumber rationalNumber3 = RationalNumber.valueOf(1);
      rationalNumber3.toDisplayString();
      String string1 = rationalNumber3.toString();
      String string2 = rationalNumber3.toDisplayString();
      assertTrue(string2.equals((Object)string1));
      
      RationalNumber.factoryMethod(0L, (-1));
      rationalNumber0.intValue();
      String string3 = rationalNumber0.toString();
      assertEquals("-1", string3);
      
      RationalNumber rationalNumber4 = RationalNumber.factoryMethod(0L, (-1));
      RationalNumber rationalNumber5 = RationalNumber.factoryMethod(1, 1);
      rationalNumber4.toDisplayString();
      assertEquals(0.0, rationalNumber4.doubleValue(), 0.01);
      
      rationalNumber0.doubleValue();
      RationalNumber.factoryMethod(1, 0);
      RationalNumber.factoryMethod(0L, 2356L);
      rationalNumber0.intValue();
      assertEquals((-1L), rationalNumber0.longValue());
      
      rationalNumber5.longValue();
      assertEquals((byte)1, rationalNumber5.byteValue());
      
      RationalNumber rationalNumber6 = RationalNumber.factoryMethod((-2024L), 0L);
      assertEquals(1, rationalNumber6.numerator);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2122.346149446362);
      RationalNumber rationalNumber1 = RationalNumber.valueOf(0.0);
      rationalNumber0.toString();
      RationalNumber rationalNumber2 = RationalNumber.valueOf(674.30017);
      RationalNumber.valueOf(1.0E-8);
      RationalNumber rationalNumber3 = RationalNumber.valueOf(1.0E-8);
      String string0 = rationalNumber3.toDisplayString();
      assertEquals(100000000, rationalNumber3.divisor);
      
      RationalNumber.factoryMethod(7536653, 11177);
      String string1 = rationalNumber0.toString();
      assertEquals("55181/26 (2,122.346)", string1);
      
      String string2 = rationalNumber1.toString();
      assertTrue(string2.equals((Object)string0));
      assertEquals((short)0, rationalNumber1.shortValue());
      
      int int0 = rationalNumber0.intValue();
      assertEquals(2122, int0);
      
      double double0 = rationalNumber2.doubleValue();
      assertEquals(674.3001699919478, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483664L, 2147483664L);
      String string0 = rationalNumber0.toString();
      assertEquals("1", string0);
      
      int int0 = rationalNumber0.intValue();
      assertEquals(1, int0);
      
      float float0 = rationalNumber0.floatValue();
      assertEquals(1.0F, float0, 0.01F);
      assertEquals(1, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), 13L);
      rationalNumber0.toString();
      RationalNumber rationalNumber1 = RationalNumber.valueOf((-732.0879));
      RationalNumber rationalNumber2 = RationalNumber.factoryMethod(1L, 2147483658L);
      RationalNumber rationalNumber3 = new RationalNumber((-2147483645), Integer.MIN_VALUE);
      String string0 = rationalNumber3.toString();
      assertEquals("-2147483645/-2147483648 (1)", string0);
      
      RationalNumber rationalNumber4 = RationalNumber.factoryMethod(1, 1566L);
      RationalNumber rationalNumber5 = rationalNumber3.negate();
      String string1 = rationalNumber1.toString();
      assertEquals("-7320879/10000 (-732.088)", string1);
      
      rationalNumber2.toDisplayString();
      String string2 = rationalNumber4.toDisplayString();
      assertEquals("0.001", string2);
      
      RationalNumber rationalNumber6 = RationalNumber.factoryMethod(41L, 1);
      rationalNumber6.negate();
      RationalNumber rationalNumber7 = RationalNumber.valueOf((-2147483648L));
      String string3 = rationalNumber7.toDisplayString();
      assertEquals((-2.14748365E9F), rationalNumber7.floatValue(), 0.01F);
      assertEquals("-2147483647", string3);
      
      float float0 = rationalNumber0.floatValue();
      assertEquals(1.65191056E8F, float0, 0.01F);
      
      float float1 = rationalNumber5.floatValue();
      assertEquals((-1.0F), float1, 0.01F);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), 13L);
      String string0 = rationalNumber0.toString();
      assertEquals("-2147483648/-13 (165,191,049.846)", string0);
      
      RationalNumber rationalNumber1 = RationalNumber.valueOf((-732.0879));
      assertEquals((-732.0879), rationalNumber1.doubleValue(), 0.01);
      
      RationalNumber rationalNumber2 = RationalNumber.factoryMethod(1L, 2147483658L);
      assertEquals((-2147483638), rationalNumber2.divisor);
      
      RationalNumber rationalNumber3 = new RationalNumber((-2147483645), Integer.MIN_VALUE);
      rationalNumber3.toString();
      RationalNumber.factoryMethod(1, 1566L);
      rationalNumber3.negate();
      RationalNumber rationalNumber4 = RationalNumber.factoryMethod(2147483658L, (-2147483638));
      assertEquals((-1073741819), rationalNumber4.divisor);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-1), (-1));
      long long0 = rationalNumber0.longValue();
      assertEquals(1L, long0);
      
      RationalNumber rationalNumber1 = RationalNumber.factoryMethod((-2147483654L), (-1));
      String string0 = rationalNumber1.toDisplayString();
      assertEquals("-2147483642", string0);
      assertEquals(1, rationalNumber1.divisor);
      assertEquals((-2147483642L), rationalNumber1.longValue());
      
      RationalNumber rationalNumber2 = RationalNumber.valueOf(1L);
      assertEquals(1L, rationalNumber2.longValue());
      
      String string1 = rationalNumber0.toString();
      assertEquals("1", string1);
  }
}