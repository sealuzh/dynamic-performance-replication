/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 05:25:05 GMT 2018
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.PopupMenu;
import java.io.BufferedReader;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.Reader;
import java.io.StreamTokenizer;
import javax.swing.JApplet;
import javax.swing.JWindow;
import javax.swing.TransferHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import umd.cs.shop.JSJshop;
import umd.cs.shop.JSJshopVars;
import umd.cs.shop.JSListLogicalAtoms;
import umd.cs.shop.JSPlanningProblem;
import umd.cs.shop.JSTaskAtom;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSJshop_ESTest extends JSJshop_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSJshopVars.leftPar = (-211);
      jSJshop0.tree();
      JSListLogicalAtoms jSListLogicalAtoms0 = jSJshop0.getDeleteList();
      assertNull(jSListLogicalAtoms0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[0];
      JSJshop.main(stringArray0);
      JSJshop jSJshop0 = new JSJshop();
      JApplet jApplet0 = JSJshop.applet;
      jSJshop0.getBufferedReader("Expacting domain definition, operators,methods,axioms", "Xh\"", (JApplet) null);
      StreamTokenizer streamTokenizer0 = null;
      try {
        streamTokenizer0 = new StreamTokenizer((Reader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StreamTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JApplet jApplet0 = JSJshop.applet;
      jSJshop0.getBufferedReader("Expacting domain definition, operators,methods,axioms", "Xh\"", (JApplet) null);
      JApplet jApplet1 = JSJshop.applet;
      jSJshop0.dom();
      JSListLogicalAtoms jSListLogicalAtoms0 = jSJshop0.getDeleteList();
      assertNull(jSListLogicalAtoms0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[2] = "";
      JSJshop.main(stringArray0);
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop((String) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSJshopVars.flagLevel = 0;
      int int0 = (-1);
      JSJshopVars.greaterT = (-1);
      jSJshop0.getBufferedReader("umd.cs.shop.JSListAxioms", "-8]}4TX^nH!seFb", (JApplet) null);
      jSJshop0.parserFile("tN%");
      // Undeclared exception!
      jSJshop0.getBufferedReader("tN%", "tN%");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.getTree();
      String string0 = ")";
      jSJshop0.parserFile(")");
      String string1 = "*;]1;=+?+";
      JApplet jApplet0 = null;
      try {
        jApplet0 = new JApplet();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.applet.Applet", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_scripts_adaptive/projects/19_shop/Expecting method definition");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      JSJshopVars.whiteSpace = 1095;
      JSJshopVars.greaterT = 1647;
      boolean boolean0 = jSJshop0.parserFile("Expecting method definition");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_scripts_adaptive/projects/19_shop/Expecting Term");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      String string0 = "Expecting Term";
      JSTaskAtom jSTaskAtom0 = null;
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("Expecting Term", (JSTaskAtom) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSJshopVars.leftPar = (-211);
      jSJshop0.tree();
      JApplet jApplet0 = JSJshop.applet;
      // Undeclared exception!
      try { 
        jSJshop0.getAppletURL("[)2!", (JApplet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSJshopVars.greaterT = 1647;
      jSJshop0.sol();
      jSJshop0.getSolution();
      jSJshop0.parserFile("");
      boolean boolean0 = jSJshop0.parserFile("( ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JApplet jApplet0 = JSJshop.applet;
      JSJshopVars.whiteSpace = 1414;
      jSJshop0.getAddList();
      jSJshop0.getDeleteList();
      // Undeclared exception!
      try { 
        jSJshop0.testParser();
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      String[] stringArray0 = new String[3];
      stringArray0[1] = "^Yd";
      JSJshop.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSJshopVars.allPlans = false;
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "sWOc`|.";
      stringArray0[2] = "";
      stringArray0[3] = "";
      JSJshop.main(stringArray0);
      JApplet jApplet0 = JSJshop.applet;
      FileDialog fileDialog0 = null;
      try {
        fileDialog0 = new FileDialog((Frame) null, "q>!Lc8+$Q", 10);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSJshopVars.allPlans = false;
      String string0 = "";
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "";
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
  public void test14()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      PipedWriter pipedWriter0 = new PipedWriter();
      PipedReader pipedReader0 = new PipedReader(pipedWriter0, 1621);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(pipedReader0);
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
  public void test15()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_scripts_adaptive/projects/19_shop/:\\t");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "&MD[!~");
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop(":\t", ":\t");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSJshopVars.flagExit = false;
      JSJshop jSJshop1 = new JSJshop("one", "<- domain");
      JSPlanningProblem jSPlanningProblem0 = jSJshop1.prob();
      assertNull(jSPlanningProblem0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_scripts_adaptive/projects/19_shop/?.439hm=/?.439hm=");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "<- domain");
      BufferedReader bufferedReader0 = jSJshop0.getBufferedReader("?.439hm=", "?.439hm=", (JApplet) null);
      assertNotNull(bufferedReader0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_scripts_adaptive/projects/19_shop/a&^6U/a&^6U");
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)85;
      byteArray0[1] = (byte) (-114);
      byteArray0[2] = (byte) (-10);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      BufferedReader bufferedReader0 = jSJshop0.getBufferedReader("a&^6U", "a&^6U", (JApplet) null);
      assertNotNull(bufferedReader0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_scripts_adaptive/projects/19_shop/` ");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      EvoSuiteFile evoSuiteFile1 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_scripts_adaptive/projects/19_shop/` ");
      FileSystemHandling.createFolder(evoSuiteFile1);
      JSJshop jSJshop0 = new JSJshop("` ", "` ");
      System.setCurrentTimeMillis(0L);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_scripts_adaptive/projects/19_shop/` ");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      FileSystemHandling.createFolder(evoSuiteFile0);
      JSJshop jSJshop0 = new JSJshop("` ", "` ");
      System.setCurrentTimeMillis(0L);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_scripts_adaptive/projects/19_shop/` ");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      FileSystemHandling.createFolder(evoSuiteFile0);
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("` ", "List of tasks");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }
}