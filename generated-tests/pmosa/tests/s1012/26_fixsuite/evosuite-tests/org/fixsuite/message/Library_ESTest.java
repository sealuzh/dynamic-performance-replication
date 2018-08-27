/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 23:53:50 GMT 2018
 */

package org.fixsuite.message;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.fixsuite.message.Library;
import org.fixsuite.message.info.DictionaryInfo;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Library_ESTest extends Library_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Library library0 = new Library();
      library0.loadFromDirectory("");
      List<DictionaryInfo> list0 = library0.getDictionaries();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionaries();
      String string0 = "";
      library0.getDictionaries();
      library0.loadFromDirectory("");
      library0.getDictionaries();
      library0.loadFromDirectory("");
      library0.getDictionaries();
      String string1 = "?urC$#Sx\\";
      library0.loadFromDirectory("?urC$#Sx");
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
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_scripts_adaptive/projects/26_fixsuite/FNl@-/#\\$6]6W;3$");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.loadFromDirectory("");
      library0.loadFromDirectory("");
      library0.getDictionary("");
      library0.getDictionary("");
      library0.loadFromDirectory("FNl@-/#$6]6W;3$");
      library0.loadFromDirectory("Loading time: ");
      library0.getDictionaries();
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
}