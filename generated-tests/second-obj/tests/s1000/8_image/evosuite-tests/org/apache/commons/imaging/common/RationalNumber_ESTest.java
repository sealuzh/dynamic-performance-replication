/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 15:01:44 GMT 2018
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
  public void test0()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(0, 0);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      String string0 = rationalNumber1.toString();
      assertEquals(0, rationalNumber0.numerator);
      assertEquals("Invalid rational (0/0)", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2147483676L));
      assertEquals((-2.147483647E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(2140228635, 2140228635);
      rationalNumber0.toDisplayString();
      String string0 = rationalNumber0.toDisplayString();
      RationalNumber rationalNumber1 = RationalNumber.valueOf(1221.6);
      rationalNumber0.longValue();
      String string1 = rationalNumber0.toString();
      assertTrue(string1.equals((Object)string0));
      
      int int0 = rationalNumber0.intValue();
      assertEquals(1, int0);
      
      String string2 = rationalNumber1.toString();
      assertEquals("6108/5 (1,221.6)", string2);
      assertEquals(1221L, rationalNumber1.longValue());
      assertEquals(1221.6F, rationalNumber1.floatValue(), 0.01F);
      
      float float0 = rationalNumber0.floatValue();
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      String string0 = rationalNumber0.toString();
      assertEquals("0", string0);
      
      String string1 = rationalNumber0.toDisplayString();
      assertTrue(string1.equals((Object)string0));
      
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals(0.0F, rationalNumber1.floatValue(), 0.01F);
      
      RationalNumber rationalNumber2 = RationalNumber.valueOf(3702.3);
      assertEquals(3702.3F, rationalNumber2.floatValue(), 0.01F);
      
      float float0 = rationalNumber0.floatValue();
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483666L), (-2147483666L));
      assertEquals(1.0, rationalNumber0.doubleValue(), 0.01);
      assertEquals(1, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.3184717317926697E-8);
      assertEquals(1.3184717309376808E-8, rationalNumber0.doubleValue(), 0.01);
      assertEquals(75845388, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.147483647E9);
      assertEquals(2.147483647E9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1410L, 1410L);
      rationalNumber0.toString();
      rationalNumber0.longValue();
      RationalNumber rationalNumber1 = RationalNumber.factoryMethod(1, 2147483685L);
      rationalNumber0.toDisplayString();
      rationalNumber1.toString();
      RationalNumber rationalNumber2 = new RationalNumber((-2147483611), 1);
      rationalNumber0.negate();
      rationalNumber2.toDisplayString();
      rationalNumber2.negate();
      rationalNumber2.toDisplayString();
      rationalNumber2.longValue();
      RationalNumber rationalNumber3 = RationalNumber.factoryMethod(1410L, 1);
      rationalNumber3.toDisplayString();
      // Undeclared exception!
      try { 
        RationalNumber.factoryMethod(2147483685L, 0L);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Invalid value, numerator: 2147483685, divisor: 0
         //
         verifyException("org.apache.commons.imaging.common.RationalNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(4362L, 4362L);
      RationalNumber.factoryMethod(1, 4362L);
      RationalNumber rationalNumber1 = RationalNumber.valueOf(4362);
      rationalNumber0.toString();
      RationalNumber rationalNumber2 = RationalNumber.valueOf(1);
      RationalNumber rationalNumber3 = RationalNumber.valueOf(1221.624);
      RationalNumber rationalNumber4 = new RationalNumber(125, 1);
      RationalNumber rationalNumber5 = rationalNumber1.negate();
      RationalNumber.valueOf(1);
      String string0 = rationalNumber3.toDisplayString();
      assertEquals("1,221.624", string0);
      assertEquals(1221.624F, rationalNumber3.floatValue(), 0.01F);
      
      rationalNumber1.toDisplayString();
      String string1 = rationalNumber5.toDisplayString();
      assertEquals("-4362", string1);
      
      RationalNumber rationalNumber6 = rationalNumber5.negate();
      RationalNumber rationalNumber7 = rationalNumber6.negate();
      RationalNumber.valueOf((-121.775910774));
      rationalNumber6.toString();
      rationalNumber0.toDisplayString();
      RationalNumber rationalNumber8 = RationalNumber.valueOf((-628.44381));
      rationalNumber5.negate();
      RationalNumber rationalNumber9 = new RationalNumber(12084, 1);
      rationalNumber4.toString();
      rationalNumber0.floatValue();
      RationalNumber rationalNumber10 = RationalNumber.valueOf((-1027.1451355530035));
      RationalNumber.factoryMethod(1, 4362);
      rationalNumber8.longValue();
      String string2 = rationalNumber7.toString();
      assertEquals("-4,362", string2);
      
      rationalNumber9.intValue();
      RationalNumber rationalNumber11 = RationalNumber.valueOf((-2.14748364548671E9));
      assertEquals((byte)3, rationalNumber11.byteValue());
      
      rationalNumber10.floatValue();
      rationalNumber7.negate();
      long long0 = rationalNumber2.longValue();
      assertEquals(1L, long0);
  }
}