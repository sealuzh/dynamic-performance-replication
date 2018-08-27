/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 10:59:10 GMT 2018
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
      library0.loadFromDirectory("");
      List<DictionaryInfo> list0 = library0.getDictionaries();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Library library0 = new Library();
      library0.loadFromDirectory("org.fixsuite.message.parsers.fpl.MainParser");
      library0.getDictionaries();
      List<DictionaryInfo> list0 = library0.getDictionaries();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Library library0 = new Library();
      DictionaryInfo dictionaryInfo0 = library0.getDictionary(";\"F6GK</|8nca-");
      assertNull(dictionaryInfo0);
  }
}
