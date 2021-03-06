/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 03 11:27:52 GMT 2019
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
        Utf8.size("8m", 0, 1652);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endIndex > string.length: 1652 > 2
         //
         verifyException("okio.Utf8", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utf8.size("~$0Nq\"oip)cV-gZ ", (-3368), 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // beginIndex < 0: -3368
         //
         verifyException("okio.Utf8", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      long long0 = Utf8.size("7!8hhYrLZj UKa@ABbI", 0, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      long long0 = Utf8.size("");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      long long0 = Utf8.size("7qDgh]w_aL7f0W", 0, 1);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      long long0 = Utf8.size("RE6HK5T3l@");
      assertEquals(10L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utf8.size("", 207, 207);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endIndex > string.length: 207 > 0
         //
         verifyException("okio.Utf8", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utf8.size("beginIndex < 0: ", (-1), (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // beginIndex < 0: -1
         //
         verifyException("okio.Utf8", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utf8.size((String) null, (-1), (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // string == null
         //
         verifyException("okio.Utf8", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utf8.size("", 128, (-7));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endIndex < beginIndex: -7 < 128
         //
         verifyException("okio.Utf8", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
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
}
