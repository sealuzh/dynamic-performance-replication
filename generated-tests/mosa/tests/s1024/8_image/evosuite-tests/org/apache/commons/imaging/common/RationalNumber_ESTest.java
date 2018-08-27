/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 15:09:52 GMT 2018
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
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-4617.9816931988));
      assertEquals((-4617.981693192856), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1448.0601249595716);
      assertEquals(14137411, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.0);
      float float0 = rationalNumber0.floatValue();
      assertEquals(1.0F, float0, 0.01F);
      assertEquals(1.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(475.705867937862);
      int int0 = rationalNumber0.intValue();
      assertEquals(8087, rationalNumber0.numerator);
      assertEquals(475, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(36.01110324288605);
      assertEquals(35687, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-51.5));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("-51.5", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2147483675L);
      assertEquals(2.147483647E9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(0.0F, rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.8008449842454866E-8);
      assertEquals(1.8008449852806134E-8, rationalNumber0.doubleValue(), 0.01);
      assertEquals(55529488, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(0, 0);
      String string0 = rationalNumber0.toString();
      assertEquals("Invalid rational (0/0)", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2422.66257913804));
      String string0 = rationalNumber0.toString();
      assertEquals("-30227561/12477 (-2,422.663)", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2147483648L));
      assertEquals((-2.147483647E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        RationalNumber.factoryMethod(2147483675L, 0L);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Invalid value, numerator: 2147483675, divisor: 0
         //
         verifyException("org.apache.commons.imaging.common.RationalNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483675L, 2147483675L);
      RationalNumber rationalNumber1 = new RationalNumber(1, 1);
      RationalNumber rationalNumber2 = rationalNumber0.negate();
      assertEquals((-1.0), rationalNumber2.doubleValue(), 0.01);
      
      RationalNumber rationalNumber3 = RationalNumber.factoryMethod((-178L), 148L);
      assertEquals((-1.2027028F), rationalNumber3.floatValue(), 0.01F);
      
      RationalNumber rationalNumber4 = RationalNumber.factoryMethod(1, 2147483675L);
      assertEquals((-2147483621), rationalNumber4.divisor);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483668L), (-2147483668L));
      RationalNumber rationalNumber1 = RationalNumber.factoryMethod((-13L), 1);
      assertEquals((-13.0), rationalNumber1.doubleValue(), 0.01);
      
      RationalNumber rationalNumber2 = RationalNumber.factoryMethod(1508L, 1508L);
      RationalNumber rationalNumber3 = RationalNumber.valueOf((-13));
      rationalNumber3.toString();
      RationalNumber rationalNumber4 = RationalNumber.valueOf(1);
      String string0 = rationalNumber4.toDisplayString();
      String string1 = rationalNumber0.toString();
      assertTrue(string1.equals((Object)string0));
      
      RationalNumber.valueOf(444L);
      RationalNumber rationalNumber5 = RationalNumber.valueOf(1);
      RationalNumber rationalNumber6 = rationalNumber3.negate();
      assertEquals(13L, rationalNumber6.longValue());
      
      rationalNumber5.doubleValue();
      RationalNumber rationalNumber7 = new RationalNumber(75, 1);
      rationalNumber4.negate();
      RationalNumber rationalNumber8 = new RationalNumber(1, 1);
      rationalNumber2.longValue();
      RationalNumber rationalNumber9 = RationalNumber.valueOf(1508L);
      assertEquals(1508L, rationalNumber9.longValue());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-1226L), (-2147483672L));
      assertEquals(5.709007318589755E-7, rationalNumber0.doubleValue(), 0.01);
      assertEquals(1073741836, rationalNumber0.divisor);
      
      RationalNumber rationalNumber1 = RationalNumber.valueOf((-1226L));
      assertEquals((-1226), rationalNumber1.intValue());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.1474836382086062E9);
      assertEquals(2.147483638E9, rationalNumber0.doubleValue(), 0.01);
  }
}