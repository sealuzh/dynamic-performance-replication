/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 07:34:43 GMT 2018
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import javax.swing.JApplet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;
import umd.cs.shop.JSJshop;
import umd.cs.shop.JSJshopNode;
import umd.cs.shop.JSJshopVars;
import umd.cs.shop.JSListLogicalAtoms;
import umd.cs.shop.JSOperator;
import umd.cs.shop.JSPairPlanTSListNodes;
import umd.cs.shop.JSPlan;
import umd.cs.shop.JSPlanningDomain;
import umd.cs.shop.JSPlanningProblem;
import umd.cs.shop.JSTaskAtom;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSJshop_ESTest extends JSJshop_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[6];
      JSJshop.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      String string0 = "The resulting state :";
      String string1 = "Cl2Ni?G6'<Y4A>-Nk";
      // Undeclared exception!
      jSJshop0.getBufferedReader("The resulting state :", "Cl2Ni?G6'<Y4A>-Nk");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      StringReader stringReader0 = new StringReader("10PE[jT,b3VLx+4~e");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      // Undeclared exception!
      try { 
        jSJshop0.processToken(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSOperator jSOperator0 = new JSOperator();
      jSOperator0.head();
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("one", (JSTaskAtom) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSPlan jSPlan0 = jSJshop0.sol();
      assertNull(jSPlan0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JSListLogicalAtoms jSListLogicalAtoms0 = jSJshop0.getAddList();
      assertNull(jSListLogicalAtoms0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.dom();
      JSJshopNode jSJshopNode0 = jSJshop0.getTree();
      assertNull(jSJshopNode0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.getBufferedReader("one", (String) null, (JApplet) null);
      JSOperator jSOperator0 = new JSOperator();
      jSOperator0.head();
      JApplet jApplet0 = JSJshop.applet;
      JSPlanningDomain jSPlanningDomain0 = jSJshop0.dom();
      assertNull(jSPlanningDomain0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.getDeleteList();
      JSPairPlanTSListNodes jSPairPlanTSListNodes0 = jSJshop0.getSolution();
      assertNull(jSPairPlanTSListNodes0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.dom();
      JSJshopNode jSJshopNode0 = jSJshop0.tree();
      assertNull(jSJshopNode0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      String string0 = "10PE[jT,b3VLx\\+4~e";
      StringReader stringReader0 = new StringReader("10PE[jT,b3VLx+4~e");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSJshopVars.leftPar = (-4);
      streamTokenizer0.whitespaceChars((-271), (-271));
      // Undeclared exception!
      try { 
        jSJshop0.processToken(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[2];
      // Undeclared exception!
      try { 
        JSJshop.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JApplet jApplet0 = JSJshop.applet;
      JSJshopVars.percent = 1054;
      JSJshopVars.plus = (-1471);
      String[] stringArray0 = new String[4];
      stringArray0[0] = null;
      stringArray0[1] = "one";
      stringArray0[2] = "one";
      stringArray0[3] = null;
      JSJshop.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.getTree();
      JSPlanningProblem jSPlanningProblem0 = jSJshop0.prob();
      assertNull(jSPlanningProblem0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      String[] stringArray0 = new String[3];
      String string0 = "all";
      stringArray0[0] = "all";
      stringArray0[2] = "all";
      // Undeclared exception!
      try { 
        JSJshop.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JApplet jApplet0 = JSJshop.applet;
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/19_shop/one/one");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "one");
      BufferedReader bufferedReader0 = jSJshop0.getBufferedReader("one", "one", (JApplet) null);
      assertNotNull(bufferedReader0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/19_shop/BXdcPt&|nKK)");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "8a` Awax+9WJp\"=weN");
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("BXdcPt&|nKK)", "BXdcPt&|nKK)");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Charset charset0 = Charset.defaultCharset();
      CharsetDecoder charsetDecoder0 = charset0.newDecoder();
      InputStreamReader inputStreamReader0 = new InputStreamReader(pipedInputStream0, charsetDecoder0);
      BufferedReader bufferedReader0 = new BufferedReader(inputStreamReader0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(bufferedReader0);
      JSJshopVars.leftPar = (-4);
      jSJshop0.getDeleteList();
      String string0 = "KwX-i1;<SRv";
      StringReader stringReader0 = new StringReader("KwX-i1;<SRv");
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      // Undeclared exception!
      try { 
        jSJshop0.processToken(streamTokenizer1);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      FileSystemHandling.shouldAllThrowIOExceptions();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/19_shop/one/one");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "gp%{a5&<lKw{");
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      FileSystemHandling.setPermissions(evoSuiteFile0, false, true, true);
      jSJshop0.getDeleteList();
      JSJshopVars.flagExit = false;
      jSJshop0.getBufferedReader("gp%{a5&<lKw{", "XY)n7R1C+E^`-e1-Dwy", (JApplet) null);
      JSJshopVars.rightPar = 4;
      JSJshop jSJshop1 = new JSJshop("snB0\"w=", "");
      jSJshop1.getBufferedReader("=9g4 ", " Expecting 'first'", (JApplet) null);
      String[] stringArray0 = new String[1];
      jSJshop0.getTree();
      JSJshop.main(stringArray0);
      // Undeclared exception!
      try { 
        jSJshop0.getAppletURL("snB0\"w=", (JApplet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Charset.defaultCharset();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/19_shop/#7I8WmPCEOPdp");
      byte[] byteArray0 = new byte[12];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("#7I8WmPCEOPdp", "' ");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Charset charset0 = Charset.defaultCharset();
      CharsetDecoder charsetDecoder0 = charset0.newDecoder();
      InputStreamReader inputStreamReader0 = new InputStreamReader(pipedInputStream0, charsetDecoder0);
      BufferedReader bufferedReader0 = new BufferedReader(inputStreamReader0);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(bufferedReader0);
      JSJshopVars.leftPar = (-4);
      jSJshop0.getDeleteList();
      streamTokenizer0.ttype = (int) (byte) (-38);
      streamTokenizer0.eolIsSignificant(false);
      SystemInUtil.addInputLine((String) null);
      jSJshop0.parserFile("Error 2 in Util.getBufferedReader : ");
      StringReader stringReader0 = new StringReader("Error 2 in Util.getBufferedReader : ");
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      streamTokenizer1.nval = (double) (byte) (-38);
      StreamTokenizer streamTokenizer2 = new StreamTokenizer(bufferedReader0);
      // Undeclared exception!
      try { 
        jSJshop0.processToken(streamTokenizer1);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/19_shop/#7I8WmPCEOPdp");
      byte[] byteArray0 = new byte[12];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      JSJshop jSJshop1 = new JSJshop("#7I8WmPCEOPdp", "#7I8WmPCEOPdp");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream("#7I8WmPCEOPdp");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "8Vq`#DvI#=");
      JSPairPlanTSListNodes jSPairPlanTSListNodes0 = new JSPairPlanTSListNodes();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/19_shop/#7I8WmPCEOPdp");
      byte[] byteArray0 = new byte[12];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JSJshop jSJshop1 = new JSJshop();
      JSJshopVars.flagExit = false;
      JSJshop jSJshop2 = new JSJshop("#7I8WmPCEOPdp", "kk;");
      System.setCurrentTimeMillis(0L);
      jSJshop0.dom();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "#7I8WmPCEOPdp";
      JSJshop.main(stringArray0);
      SystemInUtil.addInputLine("kk;");
      jSJshop0.parserFile("#7I8WmPCEOPdp");
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      pipedInputStream0.close();
      StringReader stringReader0 = new StringReader("WZK/Q:X2~zXq9Z5EO");
      FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
      SystemInUtil.addInputLine("Error");
      jSJshop2.parserFile("%%%");
      PipedInputStream pipedInputStream1 = null;
      try {
        pipedInputStream1 = new PipedInputStream((-1841588069));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Pipe Size <= 0
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }
}