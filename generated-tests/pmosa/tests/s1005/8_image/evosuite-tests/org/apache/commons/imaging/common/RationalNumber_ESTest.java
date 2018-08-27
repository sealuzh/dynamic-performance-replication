/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 02:55:10 GMT 2018
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
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2118L, 2118L);
      rationalNumber0.negate();
      RationalNumber rationalNumber1 = RationalNumber.valueOf(2.147483647E9);
      RationalNumber rationalNumber2 = RationalNumber.factoryMethod(1, 2147483647L);
      RationalNumber.factoryMethod(0L, 1);
      RationalNumber rationalNumber3 = RationalNumber.valueOf(1);
      assertEquals(1.0, rationalNumber3.doubleValue(), 0.01);
      
      RationalNumber rationalNumber4 = RationalNumber.factoryMethod(0L, 1);
      assertEquals(0, rationalNumber4.numerator);
      
      RationalNumber rationalNumber5 = rationalNumber0.negate();
      rationalNumber5.doubleValue();
      long long0 = rationalNumber5.longValue();
      assertEquals(1, rationalNumber5.divisor);
      assertEquals((-1L), long0);
      
      rationalNumber0.negate();
      rationalNumber1.longValue();
      assertEquals(2.14748365E9F, rationalNumber1.floatValue(), 0.01F);
      
      String string0 = rationalNumber2.toDisplayString();
      assertEquals(0L, rationalNumber2.longValue());
      assertEquals(1, rationalNumber2.numerator);
      assertEquals(4.656612875245797E-10, rationalNumber2.doubleValue(), 0.01);
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0L);
      String string0 = rationalNumber0.toString();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2147483657L));
      double double0 = rationalNumber0.doubleValue();
      assertEquals((-2.147483647E9), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-2147483645), (-2147483645));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("1", string0);
      
      long long0 = rationalNumber0.longValue();
      assertEquals(1L, long0);
      assertEquals(1.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(1610612736, 1201);
      String string0 = rationalNumber0.toString();
      assertEquals("1610612736/1201 (1,341,059.73)", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.8000000000029104E-4);
      String string0 = rationalNumber0.toString();
      assertEquals("2/11111 (0)", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-2615), 1);
      RationalNumber rationalNumber1 = RationalNumber.valueOf((-4412.3013573));
      rationalNumber0.longValue();
      RationalNumber rationalNumber2 = RationalNumber.factoryMethod((-2615), 1);
      RationalNumber rationalNumber3 = RationalNumber.valueOf((-2615));
      rationalNumber3.negate();
      RationalNumber.valueOf(0.0);
      rationalNumber1.toDisplayString();
      RationalNumber rationalNumber4 = RationalNumber.valueOf(1);
      RationalNumber rationalNumber5 = RationalNumber.factoryMethod(1, 0L);
      RationalNumber.factoryMethod(0L, (-2615));
      rationalNumber2.toDisplayString();
      rationalNumber0.longValue();
      rationalNumber4.toString();
      // Undeclared exception!
      try { 
        rationalNumber5.intValue();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(240.5);
      assertEquals(481, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(551.06097719535);
      int int0 = rationalNumber0.intValue();
      assertEquals(551, int0);
      assertEquals(3687149, rationalNumber0.numerator);
      
      RationalNumber rationalNumber1 = RationalNumber.factoryMethod(1L, 6691);
      assertEquals(1.4945448E-4F, rationalNumber1.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-4222L), (-4222L));
      rationalNumber0.toDisplayString();
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      rationalNumber1.toDisplayString();
      rationalNumber1.toDisplayString();
      rationalNumber1.toString();
      rationalNumber0.longValue();
      rationalNumber1.toString();
      rationalNumber0.toString();
      rationalNumber0.longValue();
      RationalNumber rationalNumber2 = rationalNumber1.negate();
      rationalNumber2.negate();
      String string0 = rationalNumber1.toString();
      assertEquals("-1", string0);
      
      RationalNumber rationalNumber3 = RationalNumber.factoryMethod(1370L, 1L);
      int int0 = rationalNumber2.intValue();
      assertEquals(1, int0);
      
      rationalNumber2.negate();
      rationalNumber0.toDisplayString();
      rationalNumber2.doubleValue();
      rationalNumber1.toDisplayString();
      RationalNumber rationalNumber4 = RationalNumber.factoryMethod(1, 1);
      RationalNumber rationalNumber5 = RationalNumber.valueOf(1);
      String string1 = rationalNumber5.toString();
      assertEquals("1", string1);
      
      float float0 = rationalNumber1.floatValue();
      assertEquals((-1.0F), float0, 0.01F);
      
      rationalNumber4.toDisplayString();
      float float1 = rationalNumber2.floatValue();
      assertEquals(1.0F, float1, 0.01F);
      assertEquals((-1.0), rationalNumber1.doubleValue(), 0.01);
      
      String string2 = rationalNumber3.toDisplayString();
      assertEquals("1370", string2);
      assertEquals(1370L, rationalNumber3.longValue());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.3541242141479337E-8);
      assertEquals(1.3541242E-8F, rationalNumber0.floatValue(), 0.01F);
      assertEquals(1.3541242134620286E-8, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2.147483647E9));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("-2147483647", string0);
      
      RationalNumber rationalNumber1 = RationalNumber.factoryMethod((-2147483647), 0L);
      String string1 = rationalNumber0.toString();
      assertEquals("-2,147,483,647", string1);
      assertEquals(1, rationalNumber0.divisor);
      
      RationalNumber rationalNumber2 = rationalNumber1.negate();
      RationalNumber rationalNumber3 = RationalNumber.valueOf((-2190.47957238));
      assertEquals((-2190.4795F), rationalNumber3.floatValue(), 0.01F);
      
      RationalNumber rationalNumber4 = RationalNumber.valueOf((-1));
      String string2 = rationalNumber1.toString();
      assertEquals("Invalid rational (1/0)", string2);
      
      rationalNumber2.doubleValue();
      rationalNumber1.negate();
      RationalNumber.factoryMethod((-1), 0L);
      rationalNumber4.floatValue();
      RationalNumber.valueOf(1435.53925);
      RationalNumber rationalNumber5 = RationalNumber.valueOf(1.0E-8);
      assertEquals((short)0, rationalNumber5.shortValue());
      
      rationalNumber4.negate();
      rationalNumber4.negate();
      int int0 = rationalNumber4.intValue();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        RationalNumber.factoryMethod((-2147483657L), 0L);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Invalid value, numerator: -2147483657, divisor: 0
         //
         verifyException("org.apache.commons.imaging.common.RationalNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      long long0 = 2147483652L;
      // Undeclared exception!
      try { 
        RationalNumber.factoryMethod(2147483652L, 0L);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Invalid value, numerator: 2147483652, divisor: 0
         //
         verifyException("org.apache.commons.imaging.common.RationalNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-1L), (-1L));
      RationalNumber rationalNumber1 = RationalNumber.factoryMethod((-1570L), (-2147483657L));
      assertEquals(7.310882E-7F, rationalNumber1.floatValue(), 0.01F);
      assertEquals(1073741829, rationalNumber1.divisor);
      
      float float0 = rationalNumber0.floatValue();
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483657L), (-2147483657L));
      assertEquals(1.0, rationalNumber0.doubleValue(), 0.01);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483657L), (-1L));
      float float0 = rationalNumber0.floatValue();
      assertEquals((-2147483639), rationalNumber0.numerator);
      assertEquals((-2.14748365E9F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-1L), (-1L));
      assertEquals(1.0F, rationalNumber0.floatValue(), 0.01F);
      
      RationalNumber rationalNumber1 = RationalNumber.factoryMethod(1, (-2147483657L));
      float float0 = rationalNumber1.floatValue();
      assertEquals(2147483639, rationalNumber1.divisor);
      assertEquals(4.656613E-10F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483652L, 2147483652L);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals((-1.0), rationalNumber1.doubleValue(), 0.01);
      
      RationalNumber rationalNumber2 = RationalNumber.factoryMethod(2147483652L, 935L);
      assertEquals(1073741826, rationalNumber2.numerator);
      assertEquals(2299233.0321199144, rationalNumber2.doubleValue(), 0.01);
      
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483659L, 2147483659L);
      assertEquals((short)1, rationalNumber0.shortValue());
      
      RationalNumber rationalNumber1 = RationalNumber.factoryMethod(344L, 1L);
      assertEquals(344, rationalNumber1.numerator);
      
      RationalNumber rationalNumber2 = RationalNumber.factoryMethod((-1L), 2147483659L);
      assertEquals(4.65661289692984E-10, rationalNumber2.doubleValue(), 0.01);
      assertEquals(1, rationalNumber2.numerator);
  }
}