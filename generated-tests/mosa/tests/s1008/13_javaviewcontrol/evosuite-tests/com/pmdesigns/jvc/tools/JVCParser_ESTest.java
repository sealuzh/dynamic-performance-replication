/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 23:17:56 GMT 2018
 */

package com.pmdesigns.jvc.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.pmdesigns.jvc.tools.JVCParser;
import com.pmdesigns.jvc.tools.JVCParserTokenManager;
import com.pmdesigns.jvc.tools.SimpleCharStream;
import com.pmdesigns.jvc.tools.Token;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Reader;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JVCParser_ESTest extends JVCParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JVCParser jVCParser0 = new JVCParser((JVCParserTokenManager) null);
      jVCParser0.disable_tracing();
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JVCParser jVCParser0 = new JVCParser((JVCParserTokenManager) null);
      jVCParser0.enable_tracing();
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JVCParser jVCParser0 = new JVCParser((JVCParserTokenManager) null);
      // Undeclared exception!
      try { 
        jVCParser0.generateParseException();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pmdesigns.jvc.tools.ParseException", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_mosa/projects/13_javaviewcontrol/l:o>nt9,X-0G");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "QN\t");
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      JVCParser jVCParser0 = new JVCParser("l:o>nt9,X-0G", linkedHashSet0);
      jVCParser0.getToken(3207);
      jVCParser0.parse();
      Token token0 = jVCParser0.getNextToken();
      assertEquals(1, token0.beginLine);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JVCParser jVCParser0 = new JVCParser((Reader) null);
      jVCParser0.ReInit((Reader) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager((SimpleCharStream) null);
      JVCParser jVCParser0 = new JVCParser(jVCParserTokenManager0);
      jVCParser0.getToken((-2036));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[11];
      JVCParser.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JVCParser jVCParser0 = new JVCParser((JVCParserTokenManager) null);
      // Undeclared exception!
      try { 
        jVCParser0.ReInit((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      JVCParser jVCParser0 = new JVCParser(sequenceInputStream0);
      jVCParser0.parse();
      jVCParser0.ReInit((InputStream) sequenceInputStream0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager((SimpleCharStream) null);
      JVCParser jVCParser0 = new JVCParser(jVCParserTokenManager0);
      // Undeclared exception!
      try { 
        jVCParser0.getToken(100);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JVCParser jVCParser0 = new JVCParser((JVCParserTokenManager) null);
      // Undeclared exception!
      try { 
        jVCParser0.getNextToken();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      try { 
        JVCParser.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[2];
      // Undeclared exception!
      try { 
        JVCParser.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_mosa/projects/13_javaviewcontrol/l:o>nt9,X-0G");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "l:o>nt9,X-0G");
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      JVCParser jVCParser0 = new JVCParser("l:o>nt9,X-0G", linkedHashSet0, true);
      jVCParser0.parse();
      jVCParser0.getToken(100);
      jVCParser0.parse();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JVCParser jVCParser0 = new JVCParser((JVCParserTokenManager) null);
      // Undeclared exception!
      try { 
        jVCParser0.parse();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      String[] stringArray0 = new String[0];
      JVCParser.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JVCParser jVCParser0 = new JVCParser((JVCParserTokenManager) null);
      jVCParser0.ReInit((JVCParserTokenManager) null);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "<b;iGw`ziz)[bWs";
      String string0 = "-debug";
      stringArray0[1] = "-debug";
      try { 
        JVCParser.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_mosa/projects/13_javaviewcontrol/l:o>nt9,X-0G");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "l:o>nt9,X-0G");
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      JVCParser jVCParser0 = new JVCParser("l:o>nt9,X-0G", linkedHashSet0, true);
      jVCParser0.parse();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_mosa/projects/13_javaviewcontrol/l:o>nt9,X-0G");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "[[==");
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      JVCParser jVCParser0 = new JVCParser("l:o>nt9,X-0G", linkedHashSet0);
      try { 
        jVCParser0.parse();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unbalanced tag at end of l:o>nt9,X-0G
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_mosa/projects/13_javaviewcontrol/l:o>nt9,X-0G");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "l:o>nt9,X-0G");
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      JVCParser jVCParser0 = new JVCParser("l:o>nt9,X-0G", linkedHashSet0, true);
      jVCParser0.getToken(196);
      jVCParser0.parse();
      jVCParser0.getToken(4246);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_mosa/projects/13_javaviewcontrol/l:o>nt9,X-0G");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "[[!&==");
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      boolean boolean0 = SimpleCharStream.staticFlag;
      JVCParser jVCParser0 = new JVCParser("l:o>nt9,X-0G", linkedHashSet0, false);
      try { 
        jVCParser0.parse();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unbalanced tag at end of l:o>nt9,X-0G
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_mosa/projects/13_javaviewcontrol/l:o>nt9,X-0G");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "\"Mzn*o}JC\"zVV}j|");
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      JVCParser jVCParser0 = new JVCParser("l:o>nt9,X-0G", linkedHashSet0);
      jVCParser0.parse();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_mosa/projects/13_javaviewcontrol/l:o>nt9,X-0G");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "[[=Q=");
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("[[=Q=");
      JVCParser jVCParser0 = new JVCParser("l:o>nt9,X-0G", linkedHashSet0, true);
      try { 
        jVCParser0.parse();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unbalanced tag at end of l:o>nt9,X-0G
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_mosa/projects/13_javaviewcontrol/l:o>nt9,X-0G");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "QN\t");
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      JVCParser jVCParser0 = new JVCParser("l:o>nt9,X-0G", linkedHashSet0);
      jVCParser0.parse();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_mosa/projects/13_javaviewcontrol/l:o>nt9,X-0G");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "#[[q=");
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      JVCParser jVCParser0 = new JVCParser("l:o>nt9,X-0G", linkedHashSet0, true);
      try { 
        jVCParser0.parse();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unbalanced tag at end of l:o>nt9,X-0G
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_mosa/projects/13_javaviewcontrol/l:o>nt9,X-0G");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "[[+");
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("[[+");
      JVCParser jVCParser0 = new JVCParser("l:o>nt9,X-0G", linkedHashSet0);
      try { 
        jVCParser0.parse();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unbalanced tag at end of l:o>nt9,X-0G
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_mosa/projects/13_javaviewcontrol/l:o>nt9,X-0G");
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte)13;
      byteArray0[2] = (byte)5;
      byteArray0[3] = (byte)59;
      byteArray0[4] = (byte) (-90);
      byteArray0[5] = (byte) (-37);
      byteArray0[6] = (byte)78;
      byteArray0[7] = (byte) (-113);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      JVCParser jVCParser0 = new JVCParser("l:o>nt9,X-0G", linkedHashSet0);
      jVCParser0.parse();
      jVCParser0.enable_tracing();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_mosa/projects/13_javaviewcontrol/l:o>nt9,X-0G");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "#[[q=");
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      JVCParser jVCParser0 = new JVCParser("l:o>nt9,X-0G", linkedHashSet0);
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "#[[q=");
      try { 
        jVCParser0.parse();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Nested tag in l:o>nt9,X-0G, line: 1
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }
}