/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 18:43:50 GMT 2018
 */

package org.fixsuite.message;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.fixsuite.message.Library;
import org.fixsuite.message.info.DictionaryInfo;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Library_ESTest extends Library_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Library library0 = new Library();
      DictionaryInfo dictionaryInfo0 = library0.getDictionary("");
      assertNull(dictionaryInfo0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Library library0 = new Library();
      boolean boolean0 = library0.loadFromDirectory("]8KR^~FnW?");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Library library0 = new Library();
      List<DictionaryInfo> list0 = library0.getDictionaries();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Library library0 = new Library();
      boolean boolean0 = library0.loadFromDirectory("");
      assertFalse(boolean0);
  }
}
