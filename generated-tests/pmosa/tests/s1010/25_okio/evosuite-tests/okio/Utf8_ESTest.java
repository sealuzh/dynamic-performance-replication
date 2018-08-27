/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 18:39:36 GMT 2018
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
  public void test0()  throws Throwable  {
      String string0 = "z +-wnl]P4Oh";
      Utf8.size("z +-wnl]P4Oh");
      Utf8.size("z +-wnl]P4Oh");
      Utf8.size("z +-wnl]P4Oh");
      Utf8.size("z +-wnl]P4Oh");
      Utf8.size("z +-wnl]P4Oh");
      // Undeclared exception!
      try { 
        Utf8.size("endIndex > string.length: ", (-808), (-1881));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // beginIndex < 0: -808
         //
         verifyException("okio.Utf8", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      long long0 = Utf8.size("e");
      assertEquals(1L, long0);
  }
}
