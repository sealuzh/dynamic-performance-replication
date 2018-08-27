/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 20:35:49 GMT 2018
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.CharArrayReader;
import java.io.FileDescriptor;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.function.UnaryOperator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFileReader;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import umd.cs.shop.JSJshopVars;
import umd.cs.shop.JSPredicateForm;
import umd.cs.shop.JSSubstitution;
import umd.cs.shop.JSTerm;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSPredicateForm_ESTest extends JSPredicateForm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("(");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm((StreamTokenizer) null);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSPredicateForm0.toStr();
      // Undeclared exception!
      try { 
        jSPredicateForm0.standarizerPredicateForm();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.add((Object) jSSubstitution0);
      JSTerm jSTerm1 = new JSTerm();
      JSSubstitution jSSubstitution1 = jSTerm1.matches((JSPredicateForm) jSTerm0, jSSubstitution0);
      assertTrue(jSSubstitution1.fail());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm((String) null);
      assertEquals(0, jSPredicateForm0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm("(gxp6])}@");
      JSJshopVars.interrogation = (-2216);
      JSJshopVars.plus = 32;
      JSPredicateForm jSPredicateForm1 = jSPredicateForm0.standarizerPredicateForm();
      assertNotSame(jSPredicateForm1, jSPredicateForm0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      JSPredicateForm jSPredicateForm1 = null;
      jSPredicateForm0.equals((JSPredicateForm) null);
      // Undeclared exception!
      try { 
        jSPredicateForm0.matches((JSPredicateForm) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm("(gxp6])}@");
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      StringReader stringReader0 = new StringReader("(gxp6])}@");
      FileSystemHandling.shouldAllThrowIOExceptions();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSPredicateForm0.applySubstitutionPF(jSSubstitution0);
      JSPredicateForm jSPredicateForm1 = null;
      try {
        jSPredicateForm1 = new JSPredicateForm("39999.0");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm("(gxp6])}@");
      jSPredicateForm0.iterator();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      int int0 = 943;
      JSPredicateForm jSPredicateForm1 = jSPredicateForm0.clonePF();
      // Undeclared exception!
      try { 
        jSPredicateForm0.matches(jSPredicateForm1, (JSSubstitution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm("(gxp6])}@");
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      jSPredicateForm0.toStr();
      jSPredicateForm0.toStr();
      jSPredicateForm0.print();
      StringBuffer stringBuffer0 = jSPredicateForm0.toStr();
      assertEquals(7, stringBuffer0.length());
      
      JSPredicateForm jSPredicateForm1 = new JSPredicateForm("(gxp6])}@");
      JSSubstitution jSSubstitution0 = jSPredicateForm0.matches(jSPredicateForm1);
      assertFalse(jSSubstitution0.fail());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm("(gxp6])}@");
      jSPredicateForm0.iterator();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JSPredicateForm jSPredicateForm1 = jSPredicateForm0.clonePF();
      boolean boolean0 = jSPredicateForm1.equals(jSPredicateForm0);
      assertTrue(boolean0);
      
      jSPredicateForm0.print();
      assertNotSame(jSPredicateForm0, jSPredicateForm1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSPredicateForm0.print();
      assertTrue(jSPredicateForm0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = "(g pH6n)}@";
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm("(g pH6n)}@");
      jSPredicateForm0.add((Object) "(g pH6n)}@");
      System.setCurrentTimeMillis(0L);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      // Undeclared exception!
      try { 
        jSPredicateForm0.standarizerPredicateForm();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSJshopVars.colon = 0;
      char[] charArray0 = new char[4];
      charArray0[2] = '9';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0, 0, 2859);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      streamTokenizer0.slashStarComments(true);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.add((Object) jSTerm0);
      jSSubstitution0.add((Object) fileSystemHandling0);
      JSPredicateForm jSPredicateForm0 = jSTerm0.applySubstitutionPF(jSSubstitution0);
      jSTerm0.matches(jSPredicateForm0);
      jSTerm0.equals(jSPredicateForm0);
      JSPredicateForm jSPredicateForm1 = null;
      try {
        jSPredicateForm1 = new JSPredicateForm(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSJshopVars.colon = 2849;
      char[] charArray0 = new char[4];
      charArray0[1] = '0';
      charArray0[2] = 's';
      charArray0[3] = '.';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0, 0, 2849);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSPredicateForm jSPredicateForm0 = jSTerm0.standarizerPredicateForm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSPredicateForm jSPredicateForm1 = jSPredicateForm0.applySubstitutionPF(jSSubstitution0);
      jSPredicateForm1.applySubstitutionPF(jSSubstitution0);
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSPredicateForm jSPredicateForm2 = jSTerm1.applySubstitutionPF(jSSubstitution0);
      jSPredicateForm2.containsAll(jSSubstitution1);
      jSTerm0.matches(jSPredicateForm2);
      System.setCurrentTimeMillis(0);
      jSPredicateForm2.print();
      assertEquals(1, jSPredicateForm2.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = 2859;
      JSJshopVars.colon = 2859;
      char[] charArray0 = new char[4];
      charArray0[1] = '3';
      charArray0[2] = 'd';
      charArray0[3] = 'n';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0, 0, 2859);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSPredicateForm jSPredicateForm0 = jSTerm0.standarizerPredicateForm();
      JSPredicateForm jSPredicateForm1 = new JSPredicateForm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.matches(jSPredicateForm0, jSSubstitution0);
      jSTerm0.print();
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSTerm1.equals(jSPredicateForm1);
      jSTerm1.equals(jSPredicateForm0);
      jSTerm0.toStr();
      JSTerm jSTerm2 = null;
      try {
        jSTerm2 = new JSTerm(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSJshopVars.colon = 0;
      char[] charArray0 = new char[4];
      charArray0[2] = '9';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0, 0, 2859);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      streamTokenizer0.slashStarComments(true);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.add((Object) jSTerm0);
      jSSubstitution0.add((Object) fileSystemHandling0);
      jSTerm0.matches((JSPredicateForm) jSTerm0);
      jSTerm0.equals((JSPredicateForm) jSTerm0);
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm("(g pH6n)}@");
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/19_shop/(g pH6n)}@");
      jSPredicateForm0.toStr();
      FileSystemHandling.setPermissions(evoSuiteFile0, true, true, false);
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      JSPredicateForm jSPredicateForm1 = jSPredicateForm0.clonePF();
      FileSystemHandling.shouldAllThrowIOExceptions();
      StringBuffer stringBuffer0 = jSPredicateForm0.toStr();
      assertTrue(jSPredicateForm0.equals((Object)jSPredicateForm1));
      assertNotSame(jSPredicateForm0, jSPredicateForm1);
      assertEquals(8, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm("(g pH6n)}@");
      jSPredicateForm0.add((Object) "(g pH6n)}@");
      System.setCurrentTimeMillis(0L);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      // Undeclared exception!
      try { 
        jSPredicateForm0.print();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("(g pH6nD}@");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)73;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("(g:pH6nD}@");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }
}