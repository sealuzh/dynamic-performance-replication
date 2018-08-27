/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 16 16:03:44 GMT 2018
 */

package org.fixsuite.message;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.fixsuite.message.Library;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Library_ESTest extends Library_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Library library0 = new Library();
      library0.loadFromDirectory("?KmNe4v{'zL");
      // Undeclared exception!
      try { 
        library0.loadFromDirectory((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionaries();
      library0.getDictionary("qkf]");
      library0.getDictionaries();
      String string0 = null;
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
  public void test2()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionaries();
      library0.loadFromDirectory("Supplied path is not a directory.");
      library0.loadFromDirectory("");
      library0.getDictionaries();
      library0.loadFromDirectory("kaPYJSW'=)c~");
      library0.loadFromDirectory("kaPYJSW'=)c~");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionary("");
      library0.loadFromDirectory("MsgType.xml");
      library0.getDictionary("");
      boolean boolean0 = library0.loadFromDirectory("");
      assertFalse(boolean0);
  }
}
