/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 13:38:44 GMT 2019
 */

package org.fixsuite.message;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
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
      library0.getDictionaries();
      library0.loadFromDirectory("Supplied directory is empty.");
      library0.loadFromDirectory("Supplied directory is empty.");
      String string0 = null;
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
      library0.loadFromDirectory("org.fixsuite.message.info.FieldInfo");
      library0.getDictionaries();
      library0.loadFromDirectory("nlCAU-KX");
      library0.loadFromDirectory("dmL_18:<eYyr\"5I_w");
      library0.getDictionaries();
      library0.loadFromDirectory("");
      library0.getDictionaries();
      library0.loadFromDirectory("");
      library0.getDictionaries();
      library0.loadFromDirectory("");
      library0.getDictionary("");
      library0.getDictionaries();
      library0.loadFromDirectory("nlCAU-KX");
      library0.loadFromDirectory("EZ6ZF^K>Xd>/");
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
      library0.getDictionary(":.^:");
      library0.loadFromDirectory(":.^:");
      library0.loadFromDirectory(":.^:");
      library0.loadFromDirectory(":.^:");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionary(":.^:");
      library0.getDictionary(":.^:");
      library0.loadFromDirectory("&Z~fPwmJH3");
      List<DictionaryInfo> list0 = library0.getDictionaries();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Library library0 = new Library();
      DictionaryInfo dictionaryInfo0 = library0.getDictionary("//8/[ATox");
      assertNull(dictionaryInfo0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionary("(P2JQP=#ga3");
      library0.getDictionaries();
      DictionaryInfo dictionaryInfo0 = library0.getDictionary("Fields.xml");
      assertNull(dictionaryInfo0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Library library0 = new Library();
      String string0 = "m%1Is2Mob5vW'1";
      library0.loadFromDirectory(".");
      FileSystemHandling.shouldAllThrowIOExceptions();
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
  public void test6()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          Library library0 = new Library();
          library0.loadFromDirectory("|9_;)AA&d@A");
          library0.getDictionaries();
          library0.loadFromDirectory("nlCAU-KX");
          library0.loadFromDirectory("dmL_18:<eYyr\"5I_w");
          library0.getDictionaries();
          library0.loadFromDirectory("");
          library0.getDictionaries();
          library0.loadFromDirectory("");
          library0.getDictionaries();
          library0.loadFromDirectory("/");
          library0.getDictionary("/");
          library0.getDictionaries();
          FileSystemHandling.shouldAllThrowIOExceptions();
          library0.loadFromDirectory("EZ6ZF^K>Xd>/");
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
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Library library0 = new Library();
      String string0 = null;
      EvoSuiteFile evoSuiteFile0 = null;
      String string1 = "m' ";
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "m' ");
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
  public void test8()  throws Throwable  {
      Library library0 = new Library();
      library0.loadFromDirectory("y{Le");
      library0.loadFromDirectory("");
      library0.getDictionaries();
      library0.getDictionary("Enums.xml");
      library0.loadFromDirectory("Enums.xml");
      System.setCurrentTimeMillis(1L);
      System.setCurrentTimeMillis(1L);
      library0.getDictionaries();
      library0.getDictionary("y{Le");
      library0.loadFromDirectory("Enums.xml");
      DictionaryInfo dictionaryInfo0 = library0.getDictionary("");
      assertNull(dictionaryInfo0);
  }
}
