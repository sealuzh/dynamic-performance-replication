/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 22:33:08 GMT 2018
 */

package org.fixsuite.message;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.fixsuite.message.Library;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Library_ESTest extends Library_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionaries();
      // Undeclared exception!
      try { 
        library0.getDictionary((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Library library0 = new Library();
      boolean boolean0 = library0.loadFromDirectory("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Library library0 = new Library();
      FileSystemHandling.shouldAllThrowIOExceptions();
      boolean boolean0 = library0.loadFromDirectory("oi}xZ");
      assertFalse(boolean0);
  }
}