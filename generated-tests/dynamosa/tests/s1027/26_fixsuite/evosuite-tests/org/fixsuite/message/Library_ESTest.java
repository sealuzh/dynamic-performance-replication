/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 04 19:01:46 GMT 2019
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
      library0.loadFromDirectory("8W2b/:>B0j]o");
      library0.getDictionaries();
      Library library1 = new Library();
      // Undeclared exception!
      try { 
        library1.getDictionary((String) null);
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
      List<DictionaryInfo> list0 = library0.getDictionaries();
      assertTrue(list0.isEmpty());
      
      library0.getDictionaries();
      library0.loadFromDirectory("*6zSyjF_db1x^FM-");
      library0.loadFromDirectory("Tb");
      library0.getDictionaries();
      library0.loadFromDirectory("*6zSyjF_db1x^FM-");
      library0.loadFromDirectory("*6zSyjF_db1x^FM-");
      library0.loadFromDirectory("Fields.xml");
      library0.getDictionaries();
      library0.loadFromDirectory("w;qDA4:+)LaQzgQ4");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.loadFromDirectory("Tb");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionaries();
      boolean boolean0 = library0.loadFromDirectory("Tb");
      library0.getDictionaries();
      library0.getDictionary("Fields.xml");
      library0.getDictionary("");
      boolean boolean1 = library0.loadFromDirectory("Fh4,jpc)'' =H}");
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Library library0 = new Library();
      boolean boolean0 = library0.loadFromDirectory("org.fixsuite.message.info.DictionaryInfo");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionaries();
      boolean boolean0 = library0.loadFromDirectory("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Library library0 = new Library();
      DictionaryInfo dictionaryInfo0 = library0.getDictionary("org.fixsuite.message.info.ValueInfo");
      assertNull(dictionaryInfo0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionaries();
      String string0 = "Loaded XML file ";
      library0.loadFromDirectory("Loaded XML file ");
      library0.getDictionaries();
      library0.loadFromDirectory("Loaded XML file ");
      String string1 = "Unknown XML file ";
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
  public void test7()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionaries();
      library0.loadFromDirectory("");
      library0.loadFromDirectory("Q(&5RTO");
      library0.loadFromDirectory("P;k5.{d)|d}S");
      String string0 = "";
      library0.loadFromDirectory("");
      library0.loadFromDirectory("(n`J7PSeil[");
      library0.getDictionary("Unloading previous dictionaries");
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
  public void test8()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionaries();
      library0.getDictionaries();
      library0.loadFromDirectory("");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionaries();
      library0.loadFromDirectory("KY~2GeAybjJi;^:cw:`");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.loadFromDirectory("");
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
