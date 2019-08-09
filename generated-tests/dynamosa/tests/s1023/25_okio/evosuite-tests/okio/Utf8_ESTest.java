/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 04 10:54:31 GMT 2019
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import okio.Utf8;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Utf8_ESTest extends Utf8_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utf8.size("", 0, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endIndex > string.length: 1 > 0
         //
         verifyException("okio.Utf8", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utf8.size("?[;Gb,Qj~%xLM8HG>E", (-2014), 128);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // beginIndex < 0: -2014
         //
         verifyException("okio.Utf8", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utf8.size((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Utf8", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      long long0 = Utf8.size("endIndex < beginIndex: ", 0, 15);
      assertEquals(15L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      long long0 = Utf8.size("", 0, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      long long0 = Utf8.size("a}ysCWxZ?j%XFw@");
      assertEquals(15L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utf8.size("", 108, 108);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endIndex > string.length: 108 > 0
         //
         verifyException("okio.Utf8", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utf8.size("", 1361, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endIndex < beginIndex: 0 < 1361
         //
         verifyException("okio.Utf8", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utf8.size("", (-5213), (-5213));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // beginIndex < 0: -5213
         //
         verifyException("okio.Utf8", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utf8.size((String) null, 1769, 1769);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // string == null
         //
         verifyException("okio.Utf8", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      long long0 = Utf8.size("");
      assertEquals(0L, long0);
  }
}