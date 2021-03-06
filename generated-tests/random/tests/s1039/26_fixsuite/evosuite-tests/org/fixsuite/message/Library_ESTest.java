/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 16:17:52 GMT 2019
 */

package org.fixsuite.message;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.fixsuite.message.Library;
import org.fixsuite.message.info.DictionaryInfo;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Library_ESTest extends Library_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Library library0 = new Library();
      library0.loadFromDirectory("");
      library0.getDictionary("R");
      library0.getDictionaries();
      library0.loadFromDirectory("");
      library0.getDictionaries();
      library0.getDictionary("");
      library0.loadFromDirectory("org.fixsuite.message.info.ComponentInfo");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionaries();
      library0.loadFromDirectory("HfE9k%'H");
      library0.getDictionary("p!gPMi6");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionary("org.fixsuite.message.info.ComponentInfo");
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
  public void test2()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionaries();
      library0.getDictionary("Gjx%R$r");
      library0.getDictionaries();
      List<DictionaryInfo> list0 = library0.getDictionaries();
      library0.loadFromDirectory("Gjx%R$r");
      library0.loadFromDirectory(" $");
      library0.loadFromDirectory("Fields.xml");
      library0.loadFromDirectory("");
      library0.getDictionary("Path name does not point to a file.");
      library0.loadFromDirectory("");
      System.setCurrentTimeMillis(2033L);
      library0.loadFromDirectory("org.fixsuite.message.info.DictionaryInfo");
      List<DictionaryInfo> list1 = library0.getDictionaries();
      assertNotSame(list1, list0);
  }
}
