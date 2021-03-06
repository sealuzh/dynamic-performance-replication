/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 04 11:31:15 GMT 2019
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
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2.147483647E9));
      assertEquals((-2.147483647E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2147483663L);
      assertEquals(2.147483647E9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("0", string0);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-1), (-394));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals((-394), rationalNumber0.divisor);
      assertEquals("0.003", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(1635, 1635);
      String string0 = rationalNumber0.toString();
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      String string0 = rationalNumber0.toString();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-4766.4));
      String string0 = rationalNumber0.toString();
      assertEquals("-23832/5 (-4,766.4)", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1L, 0);
      String string0 = rationalNumber0.toString();
      assertEquals("Invalid rational (1/0)", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-1), (-1));
      String string0 = rationalNumber0.toString();
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), (-2147483651L));
      assertEquals(0.9999999981373549, rationalNumber0.doubleValue(), 0.01);
      assertEquals(536870912, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1, (-2147483648L));
      assertEquals((-4.6566128730773926E-10), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2833L), 2147483647L);
      assertEquals((-1.3192184E-6F), rationalNumber0.floatValue(), 0.01F);
      assertEquals(Integer.MAX_VALUE, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483647L, 2147483677L);
      assertEquals(357913946, rationalNumber0.divisor);
      assertEquals(0.9999999860301616, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-1.0));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals((-1.0), rationalNumber0.doubleValue(), 0.01);
      assertEquals(1, rationalNumber1.divisor);
      assertEquals((-1.0F), rationalNumber0.floatValue(), 0.01F);
      assertEquals(1, rationalNumber1.numerator);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.1474836100000222E9);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals((-2.14748361E9), rationalNumber1.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-1), (-394));
      long long0 = rationalNumber0.longValue();
      assertEquals(0.002538071F, rationalNumber0.floatValue(), 0.01F);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-4766.4));
      long long0 = rationalNumber0.longValue();
      assertEquals((-4766.4), rationalNumber0.doubleValue(), 0.01);
      assertEquals((-4766L), long0);
      assertEquals(5, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-1), (-394));
      int int0 = rationalNumber0.intValue();
      assertEquals(0, int0);
      assertEquals(0.002538071F, rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), 1L);
      int int0 = rationalNumber0.intValue();
      assertEquals((-2.147483648E9), rationalNumber0.doubleValue(), 0.01);
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      float float0 = rationalNumber0.floatValue();
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(3465, 3465);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      float float0 = rationalNumber1.floatValue();
      assertEquals((-1.0F), float0, 0.01F);
      assertEquals(1.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483610, (-1528L));
      assertEquals(1073741805, rationalNumber0.numerator);
      assertEquals((-1405421.2107329844), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483677L, 1);
      assertEquals((-2.147483619E9), rationalNumber0.doubleValue(), 0.01);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(0L, 2147483649L);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(1, rationalNumber1.divisor);
      assertEquals(0, rationalNumber0.numerator);
      assertEquals(0.0, rationalNumber1.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-394), (-1));
      assertEquals(394, rationalNumber0.numerator);
      assertEquals(394.0F, rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.0);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      double double0 = rationalNumber1.doubleValue();
      assertEquals((-1.0), double0, 0.01);
      assertEquals(1.0F, rationalNumber0.floatValue(), 0.01F);
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
      RationalNumber rationalNumber0 = new RationalNumber((-2876), 0);
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
         // / by zero
         //
         verifyException("org.apache.commons.imaging.common.RationalNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-1), (-394));
      double double0 = rationalNumber0.doubleValue();
      assertEquals(0.0025380710659898475, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.3692328541696537);
      assertEquals(8162, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2833L));
      assertEquals((-2833.0), rationalNumber0.doubleValue(), 0.01);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.31538263765624547);
      assertEquals(1224, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      double double0 = rationalNumber0.doubleValue();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2147483656L));
      assertEquals((-2.147483647E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2147483647L);
      assertEquals(2.147483647E9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(4994, 4994);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("1", string0);
      assertEquals(1.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-373L), 363629L);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("-0.001", string0);
      assertEquals(373, rationalNumber0.numerator);
      assertEquals((-363629), rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(801.6387899814358);
      String string0 = rationalNumber0.toString();
      assertEquals("22286360/27801 (801.639)", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1, (-2147483656L));
      assertEquals(4.656612890424627E-10, rationalNumber0.doubleValue(), 0.01);
      assertEquals(1, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        RationalNumber.factoryMethod((-2147483651L), 0L);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Invalid value, numerator: -2147483651, divisor: 0
         //
         verifyException("org.apache.commons.imaging.common.RationalNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(4994, 4994);
      long long0 = rationalNumber0.longValue();
      assertEquals(1L, long0);
      assertEquals(1.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1572.28507);
      int int0 = rationalNumber0.intValue();
      assertEquals(1572, int0);
      assertEquals(16733830, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(1, 1);
      float float0 = rationalNumber0.floatValue();
      assertEquals(1.0F, float0, 0.01F);
  }
}
