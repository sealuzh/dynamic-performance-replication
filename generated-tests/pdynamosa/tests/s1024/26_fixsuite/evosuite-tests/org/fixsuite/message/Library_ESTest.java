/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 04:59:45 GMT 2019
 */

package org.fixsuite.message;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
      library0.getDictionary("]y?~+6w");
      boolean boolean0 = library0.loadFromDirectory("");
      assertFalse(boolean0);
      
      library0.getDictionaries();
      library0.getDictionaries();
      library0.loadFromDirectory("]y?~+6w");
      library0.getDictionaries();
      library0.getDictionary("]y?~+6w");
      boolean boolean1 = library0.loadFromDirectory("FtaHHAnTD8");
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Library library0 = new Library();
      String string0 = "";
      library0.getDictionaries();
      library0.getDictionaries();
      library0.loadFromDirectory("");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionary("");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.loadFromDirectory("F/nr|$N:b");
      library0.loadFromDirectory("Unknown XML file ");
      library0.getDictionaries();
      library0.loadFromDirectory("/_KT}:t3\"!eX}zfn");
      library0.getDictionary("Unknown XML file ");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionary("");
      library0.getDictionary("Unknown XML file ");
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
  public void test2()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionaries();
      String string0 = null;
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
  public void test3()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionaries();
      library0.loadFromDirectory("");
      library0.getDictionaries();
      library0.loadFromDirectory("4Rvd ?#pfS");
      library0.getDictionaries();
      library0.loadFromDirectory("et\"%O%:G:?H~TeUdT");
      library0.getDictionaries();
      library0.loadFromDirectory("#ITB~\"Py BTn?");
      library0.getDictionaries();
      library0.loadFromDirectory("");
      library0.getDictionaries();
      library0.getDictionary(" FIX dictionaries.");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionary(" FIX dictionaries.");
      library0.loadFromDirectory(" FIX dictionaries.");
      boolean boolean0 = library0.loadFromDirectory("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Library library0 = new Library();
      String string0 = null;
      library0.getDictionaries();
      String string1 = "8<s+";
      library0.loadFromDirectory("<T<3");
      library0.loadFromDirectory("");
      library0.loadFromDirectory("8<s+");
      library0.loadFromDirectory("");
      library0.loadFromDirectory("Supplied directory is empty.");
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
  public void test5()  throws Throwable  {
      Library library0 = new Library();
      library0.loadFromDirectory("6g}S'hNgl}\"$`e*");
      library0.getDictionaries();
      library0.loadFromDirectory("6g}S'hNgl}\"$`e*");
      library0.getDictionaries();
      library0.loadFromDirectory("$s>=6}8pZc&B.H");
      library0.getDictionaries();
      DictionaryInfo dictionaryInfo0 = library0.getDictionary("$s>=6}8pZc&B.H");
      assertNull(dictionaryInfo0);
  }
}
