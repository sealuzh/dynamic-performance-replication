/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 21:06:42 GMT 2019
 */

package org.fixsuite.message;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
  public void test00()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionaries();
      DictionaryInfo dictionaryInfo0 = library0.getDictionary("");
      assertNull(dictionaryInfo0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Library library0 = new Library();
      library0.loadFromDirectory("");
      library0.getDictionary("org.fixsuite.message.parsers.fpl.MainParser");
      boolean boolean0 = library0.loadFromDirectory("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionaries();
      String string0 = "i-`>g";
      library0.loadFromDirectory("i-`>g");
      library0.getDictionaries();
      library0.loadFromDirectory("i-`>g");
      library0.loadFromDirectory("i-`>g");
      library0.loadFromDirectory("i-`>g");
      String string1 = "";
      library0.loadFromDirectory("yVn?");
      library0.getDictionary("");
      library0.loadFromDirectory("");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.loadFromDirectory("yVn?");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.loadFromDirectory("Enums.xml");
      String string2 = null;
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
  public void test03()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionaries();
      library0.loadFromDirectory("");
      library0.loadFromDirectory("");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.loadFromDirectory("");
      library0.getDictionaries();
      library0.loadFromDirectory("");
      boolean boolean0 = library0.loadFromDirectory("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
      Library library0 = new Library();
      String string0 = "A;T8g1.h.&5N7lt";
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
  public void test06()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionary("pp`D");
      library0.loadFromDirectory("pp`D");
      library0.loadFromDirectory("Unable to load dictionary from ");
      String string0 = "MoC+.n\\{O`hhzsA";
      library0.loadFromDirectory("MoC+.n{O`hhzsA");
      String string1 = "";
      library0.loadFromDirectory("");
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
  public void test07()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionaries();
      library0.loadFromDirectory("WJ\"P2.5`MGp<NU(-Q0R");
      library0.loadFromDirectory("");
      library0.getDictionaries();
      library0.loadFromDirectory("WJ\"P2.5`MGp<NU(-Q0R");
      boolean boolean0 = library0.loadFromDirectory("");
      library0.loadFromDirectory("WJ\"P2.5`MGp<NU(-Q0R");
      library0.getDictionary("3|fk#n.5a&a~MEo(");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Loaded ");
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)1;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      boolean boolean1 = library0.loadFromDirectory("");
      boolean boolean2 = library0.loadFromDirectory("");
      assertFalse(boolean2 == boolean0);
      
      library0.getDictionary(".(S.'D");
      library0.loadFromDirectory("oM");
      library0.getDictionary("u{=Y-/");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionary(".(S.'D");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionaries();
      boolean boolean3 = library0.loadFromDirectory("Loaded ");
      assertFalse(boolean3 == boolean1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionaries();
      boolean boolean0 = library0.loadFromDirectory("Unloading previous dictionaries");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionary("pp`D");
      library0.loadFromDirectory("pp`D");
      String string0 = "MoC+.n\\{O`hhzsA";
      library0.loadFromDirectory("MoC+.n{O`hhzsA");
      library0.loadFromDirectory("MoC+.n{O`hhzsA");
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
  public void test10()  throws Throwable  {
      Library library0 = new Library();
      library0.loadFromDirectory("");
      boolean boolean0 = library0.loadFromDirectory("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Library library0 = new Library();
      boolean boolean0 = library0.loadFromDirectory("~KGCN0");
      assertFalse(boolean0);
  }
}
