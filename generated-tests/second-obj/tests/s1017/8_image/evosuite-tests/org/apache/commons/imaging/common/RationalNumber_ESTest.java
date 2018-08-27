/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 04:34:20 GMT 2018
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
      String string0 = rationalNumber0.toString();
      assertEquals("0", string0);
      
      int int0 = rationalNumber0.intValue();
      assertEquals(0, int0);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2.147483647E9));
      float float0 = rationalNumber0.floatValue();
      assertEquals((-2.14748365E9F), float0, 0.01F);
      assertEquals((-2147483647), rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2205.5));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("-2,205.5", string0);
      
      String string1 = rationalNumber0.toString();
      assertEquals("-4411/2 (-2,205.5)", string1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.1960783922404516E-5);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("0", string0);
      
      double double0 = rationalNumber0.doubleValue();
      assertEquals(83607, rationalNumber0.divisor);
      assertEquals(1.1960720992261413E-5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.599999999999909);
      rationalNumber0.toString();
      rationalNumber0.intValue();
      String string0 = rationalNumber0.toString();
      assertEquals("3/5 (0.6)", string0);
      
      int int0 = rationalNumber0.intValue();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1L, 1L);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("1", string0);
      
      RationalNumber rationalNumber1 = new RationalNumber(1, 1);
      RationalNumber rationalNumber2 = RationalNumber.valueOf((-2147483671L));
      RationalNumber rationalNumber3 = RationalNumber.valueOf(2.16439805740265E-4);
      assertEquals(2.1643460067816175E-4, rationalNumber3.doubleValue(), 0.01);
      
      rationalNumber1.longValue();
      long long0 = rationalNumber2.longValue();
      assertEquals((-2147483647L), long0);
      
      double double0 = rationalNumber0.doubleValue();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-1.0));
      int int0 = rationalNumber0.intValue();
      assertEquals((-1), int0);
      
      float float0 = rationalNumber0.floatValue();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals((-1.0), rationalNumber0.doubleValue(), 0.01);
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-1L), 0L);
      rationalNumber0.toString();
      rationalNumber0.doubleValue();
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
  public void test08()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2147483691L);
      rationalNumber0.toString();
      String string0 = rationalNumber0.toString();
      assertEquals("2,147,483,647", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2147483671L));
      RationalNumber rationalNumber1 = RationalNumber.valueOf((-782.00463));
      RationalNumber rationalNumber2 = RationalNumber.factoryMethod((-2147483647), 42L);
      assertEquals((-51130563L), rationalNumber2.longValue());
      assertEquals((-5.113056302380952E7), rationalNumber2.doubleValue(), 0.01);
      assertEquals((-42), rationalNumber2.divisor);
      
      RationalNumber rationalNumber3 = RationalNumber.valueOf((-2147483647));
      rationalNumber1.longValue();
      rationalNumber3.toString();
      long long0 = rationalNumber3.longValue();
      assertEquals((-2147483647L), long0);
      
      String string0 = rationalNumber1.toDisplayString();
      assertEquals("-782", string0);
      
      String string1 = rationalNumber3.toString();
      assertEquals("-2,147,483,647", string1);
      
      String string2 = rationalNumber0.toDisplayString();
      assertEquals("-2147483647", string2);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(406565L, 2147483672L);
      rationalNumber0.toString();
      String string0 = rationalNumber0.toString();
      assertEquals("101641/536870918 (0)", string0);
      
      RationalNumber rationalNumber1 = RationalNumber.factoryMethod(2147483672L, 536870918);
      assertEquals(4, rationalNumber1.numerator);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-541L), (-2147483671L));
      String string0 = rationalNumber0.toString();
      assertEquals("271/1073741836 (0)", string0);
      
      long long0 = rationalNumber0.longValue();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), (-2147483648L));
      rationalNumber0.toDisplayString();
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      RationalNumber rationalNumber2 = RationalNumber.factoryMethod((-2147483671L), 1);
      rationalNumber1.toDisplayString();
      RationalNumber.factoryMethod(1, (-2147483648L));
      RationalNumber rationalNumber3 = RationalNumber.valueOf(1);
      rationalNumber3.toDisplayString();
      RationalNumber.factoryMethod(1, (-2368L));
      rationalNumber2.toDisplayString();
      rationalNumber1.toDisplayString();
      String string0 = rationalNumber1.toString();
      rationalNumber0.floatValue();
      RationalNumber.factoryMethod(1, (-1L));
      long long0 = rationalNumber3.longValue();
      assertEquals(1L, long0);
      
      rationalNumber0.toDisplayString();
      RationalNumber rationalNumber4 = rationalNumber1.negate();
      rationalNumber4.toDisplayString();
      rationalNumber2.toDisplayString();
      float float0 = rationalNumber4.floatValue();
      assertEquals(1.0F, float0, 0.01F);
      
      rationalNumber1.floatValue();
      rationalNumber0.negate();
      RationalNumber rationalNumber5 = RationalNumber.factoryMethod((-1), (-2147483671L));
      assertEquals((-4.656612922950694E-10), rationalNumber5.doubleValue(), 0.01);
      
      RationalNumber rationalNumber6 = RationalNumber.factoryMethod(1, 2003L);
      assertEquals(2003, rationalNumber6.divisor);
      
      String string1 = rationalNumber1.toDisplayString();
      assertEquals(1.0F, rationalNumber0.floatValue(), 0.01F);
      assertTrue(string1.equals((Object)string0));
      assertEquals(1, rationalNumber1.divisor);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(406565L, 2147483691L);
      assertEquals(1.8932111191028418E-4, rationalNumber0.doubleValue(), 0.01);
      
      RationalNumber rationalNumber1 = RationalNumber.valueOf(1073741845);
      RationalNumber rationalNumber2 = rationalNumber1.negate();
      rationalNumber1.toDisplayString();
      rationalNumber2.negate();
      RationalNumber rationalNumber3 = RationalNumber.factoryMethod(1073741845, 1);
      RationalNumber rationalNumber4 = RationalNumber.valueOf(1);
      RationalNumber rationalNumber5 = RationalNumber.factoryMethod(203282, 1);
      rationalNumber5.toString();
      RationalNumber rationalNumber6 = RationalNumber.valueOf((-2.147483644732304E9));
      assertEquals((-2147483645L), rationalNumber6.longValue());
      
      RationalNumber rationalNumber7 = new RationalNumber(1, 30246249);
      RationalNumber.valueOf(1.2187585232692477E-8);
      String string0 = rationalNumber3.toString();
      assertEquals("1,073,741,845", string0);
      
      rationalNumber1.longValue();
      String string1 = rationalNumber4.toDisplayString();
      assertEquals("1", string1);
      
      rationalNumber7.longValue();
      RationalNumber.valueOf(1073741845L);
      rationalNumber7.longValue();
      assertEquals(3.306195E-8F, rationalNumber7.floatValue(), 0.01F);
      
      rationalNumber3.longValue();
      float float0 = rationalNumber2.floatValue();
      assertEquals((-1.07374182E9F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        RationalNumber.factoryMethod((-2147483670L), 0L);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Invalid value, numerator: -2147483670, divisor: 0
         //
         verifyException("org.apache.commons.imaging.common.RationalNumber", e);
      }
  }
}
