/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 20:42:58 GMT 2019
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
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.0);
      assertEquals(1.0F, rationalNumber0.floatValue(), 0.01F);
      assertEquals(1.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2.147483647E9));
      assertEquals((-2.147483647E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2147483670L);
      assertEquals(2.147483647E9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(335, 335);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("0", string0);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1, (-876L));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      String string0 = rationalNumber1.toDisplayString();
      assertEquals((-876), rationalNumber1.divisor);
      assertEquals("0.001", string0);
      assertEquals((-0.001141552511415525), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(335, 335);
      String string0 = rationalNumber0.toString();
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1434.7119031859606);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      String string0 = rationalNumber1.toString();
      assertEquals("-19441781/13551 (-1,434.712)", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1, 0L);
      String string0 = rationalNumber0.toString();
      assertEquals("Invalid rational (1/0)", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(2146, (-807));
      String string0 = rationalNumber0.toString();
      assertEquals("2146/-807 (-2.659)", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1, 2147483670L);
      assertEquals((-4.656612920782288E-10), rationalNumber0.doubleValue(), 0.01);
      assertEquals((-2147483626), rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), (-2147483663L));
      assertEquals(0.9999999925494194, rationalNumber0.doubleValue(), 0.01);
      assertEquals(134217729, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(Integer.MAX_VALUE, 2147483648L);
      assertEquals(0.9999999990686774, rationalNumber0.doubleValue(), 0.01);
      assertEquals(1073741823, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(134217729, (-2147483648L));
      assertEquals(0.06250000046566129, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), 193);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals((-1.1126858279792747E7), rationalNumber0.doubleValue(), 0.01);
      assertEquals((-1.1126858279792747E7), rationalNumber1.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals(0.0, rationalNumber0.doubleValue(), 0.01);
      assertEquals(0.0F, rationalNumber1.floatValue(), 0.01F);
      assertEquals(1, rationalNumber1.divisor);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.121343219663562E-5);
      long long0 = rationalNumber0.longValue();
      assertEquals(89179, rationalNumber0.divisor);
      assertEquals(1.1213402258379215E-5, rationalNumber0.doubleValue(), 0.01);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(335, 335);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      long long0 = rationalNumber1.longValue();
      assertEquals((-1.0F), rationalNumber1.floatValue(), 0.01F);
      assertEquals(1L, rationalNumber0.longValue());
      assertEquals((-1L), long0);
      assertEquals(1.0F, rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(0L, 2146);
      int int0 = rationalNumber0.intValue();
      assertEquals(0, int0);
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(0.0F, rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1880L, (-1L));
      int int0 = rationalNumber0.intValue();
      assertEquals((-1880), int0);
      assertEquals((-1880), rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1434.7119031859606);
      float float0 = rationalNumber0.floatValue();
      assertEquals(1434.7118F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(193L, (-2899L));
      float float0 = rationalNumber0.floatValue();
      assertEquals((-2899), rationalNumber0.divisor);
      assertEquals((-0.06657468F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483681L), 2114L);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals((byte) (-31), rationalNumber0.byteValue());
      assertEquals(1015839.0170293283, rationalNumber1.doubleValue(), 0.01);
      assertEquals((-1073741841), rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483663L), 1L);
      assertEquals(2147483633, rationalNumber0.numerator);
      assertEquals(2.147483633E9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(0L, 1L);
      double double0 = rationalNumber0.doubleValue();
      assertEquals(0.0, double0, 0.01);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2671.157));
      double double0 = rationalNumber0.doubleValue();
      assertEquals((-2671.157), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
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
  public void test27()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(0, 0);
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
  public void test28()  throws Throwable  {
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
  public void test29()  throws Throwable  {
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
  public void test30()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-806L), (-806L));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals((-1.0), rationalNumber1.doubleValue(), 0.01);
      assertEquals(1, rationalNumber0.numerator);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-806L), (-806L));
      double double0 = rationalNumber0.doubleValue();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.1474836469857724E9);
      assertEquals(2.147483647E9, rationalNumber0.doubleValue(), 0.01);
      assertEquals(Integer.MAX_VALUE, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(9.981126710561515);
      assertEquals(25911, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2147483663L));
      assertEquals((-2.147483647E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.147483647E9);
      assertEquals(2.147483647E9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483647L, 2147483647L);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals(1, rationalNumber0.numerator);
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(462.8071691063466);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("462.807", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(193L);
      String string0 = rationalNumber0.toString();
      assertEquals(193.0, rationalNumber0.doubleValue(), 0.01);
      assertEquals("193", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(0L, (-2147483663L));
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(0.0F, rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      // Undeclared exception!
      try { 
        RationalNumber.factoryMethod(2147483648L, 0L);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Invalid value, numerator: 2147483648, divisor: 0
         //
         verifyException("org.apache.commons.imaging.common.RationalNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2899L), (-2899L));
      long long0 = rationalNumber0.longValue();
      assertEquals(1L, long0);
      assertEquals(1, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-924L), (-924L));
      int int0 = rationalNumber0.intValue();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      float float0 = rationalNumber0.floatValue();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(0.0F, float0, 0.01F);
  }
}