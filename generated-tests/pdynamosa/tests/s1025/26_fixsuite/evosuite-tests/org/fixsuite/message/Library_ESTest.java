/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 05:12:32 GMT 2019
 */

package org.fixsuite.message;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
      Library library1 = new Library();
      assertFalse(library1.equals((Object)library0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionaries();
      library0.loadFromDirectory("");
      library0.getDictionaries();
      library0.getDictionary("");
      library0.loadFromDirectory("");
      library0.loadFromDirectory("");
      library0.getDictionaries();
      List<DictionaryInfo> list0 = library0.getDictionaries();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Library library0 = new Library();
      library0.loadFromDirectory("p[ ^#[hCt g/]d~n$");
      library0.loadFromDirectory("p[ ^#[hCt g/]d~n$");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.loadFromDirectory("org.fixsuite.message.parsers.fpl.MainParser");
      String string0 = "_zp(I";
      library0.loadFromDirectory("_zp(I");
      library0.loadFromDirectory("org.fixsuite.message.parsers.fpl.MainParser");
      String string1 = null;
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
  public void test3()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionaries();
      library0.loadFromDirectory("*");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.loadFromDirectory("*");
      library0.getDictionaries();
      library0.loadFromDirectory("*");
      library0.getDictionaries();
      library0.getDictionaries();
      DictionaryInfo dictionaryInfo0 = library0.getDictionary("*");
      assertNull(dictionaryInfo0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Library library0 = new Library();
      library0.loadFromDirectory("MsgContents.xml");
      String string0 = "";
      library0.loadFromDirectory("");
      library0.getDictionaries();
      library0.loadFromDirectory("");
      library0.loadFromDirectory("");
      library0.getDictionaries();
      library0.loadFromDirectory("tr?DA");
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