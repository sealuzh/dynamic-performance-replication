/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 04:07:41 GMT 2018
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Point;
import java.awt.color.ICC_Profile;
import java.awt.datatransfer.DataFlavor;
import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.LineNumberReader;
import java.io.Reader;
import java.io.StreamTokenizer;
import javax.swing.JApplet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;
import umd.cs.shop.JSJshop;
import umd.cs.shop.JSJshopNode;
import umd.cs.shop.JSJshopVars;
import umd.cs.shop.JSPairPlanTSListNodes;
import umd.cs.shop.JSPlan;
import umd.cs.shop.JSPlanningDomain;
import umd.cs.shop.JSPlanningProblem;
import umd.cs.shop.JSTaskAtom;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSJshop_ESTest extends JSJshop_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSTaskAtom jSTaskAtom0 = new JSTaskAtom();
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop(":%cw*a2\"]>}&}@", jSTaskAtom0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSPlanningDomain jSPlanningDomain0 = jSJshop0.dom();
      assertNull(jSPlanningDomain0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/19_shop/j[FG(-</}!PM`H>s*`");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "1]VeX,}qWan^");
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("j[FG(-</}!PM`H>s*`", "1]VeX,}qWan^");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.sol();
      JSPlanningProblem jSPlanningProblem0 = jSJshop0.prob();
      assertNull(jSPlanningProblem0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSJshopVars.whiteSpace = 1387;
      JSJshopVars.flagLevel = 1707;
      jSJshop0.getAddList();
      // Undeclared exception!
      try { 
        jSJshop0.getBufferedReader("5Dj@", "5Dj@");
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSPairPlanTSListNodes jSPairPlanTSListNodes0 = jSJshop0.getSolution();
      assertNull(jSPairPlanTSListNodes0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.sol();
      JSJshopNode jSJshopNode0 = jSJshop0.tree();
      assertNull(jSJshopNode0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[8];
      JSJshop.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.getAddList();
      JSJshopNode jSJshopNode0 = jSJshop0.tree();
      assertNull(jSJshopNode0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
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
  public void test10()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSJshopVars.leftBrac = 424;
      String[] stringArray0 = new String[4];
      JSJshop.main(stringArray0);
      JSPlan jSPlan0 = jSJshop0.sol();
      assertNull(jSPlan0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.getBufferedReader("IY", "IY", (JApplet) null);
      JSJshopNode jSJshopNode0 = jSJshop0.getTree();
      assertNull(jSJshopNode0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NetworkHandling.createRemoteTextFile((EvoSuiteURL) null, "j7o");
      JSJshop jSJshop0 = new JSJshop();
      JApplet jApplet0 = JSJshop.applet;
      // Undeclared exception!
      try { 
        jSJshop0.getAppletURL((String) null, (JApplet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      String[] stringArray0 = new String[4];
      JSJshop.main(stringArray0);
      BufferedReader bufferedReader0 = jSJshop0.getBufferedReader("X:c*KS", (String) null, (JApplet) null);
      assertNull(bufferedReader0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      char[] charArray0 = new char[9];
      charArray0[0] = ')';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      char[] charArray1 = new char[26];
      charArray1[0] = ')';
      String[] stringArray0 = new String[4];
      stringArray0[0] = "all";
      stringArray0[1] = "all";
      stringArray0[2] = "all";
      JSJshop.main(stringArray0);
      jSJshop0.tree();
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
  public void test15()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/19_shop/farp.shp");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "~yv%$0C");
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.testParser();
      assertFalse(JSJshop.corbaToHicap);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/19_shop/farp.shp");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "r$ulm>>$/UT/O<(>>6$");
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.getAddList();
      jSJshop0.testParser();
      assertFalse(JSJshop.corbaToHicap);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/19_shop/farp.shp");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "p^as{.|");
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.getAddList();
      JSPlanningDomain jSPlanningDomain0 = new JSPlanningDomain();
      jSJshop0.testParser();
      jSJshop0.getTree();
      FileSystemHandling.shouldAllThrowIOExceptions();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "p^as{.|";
      JSJshop.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      int int0 = ICC_Profile.icSigCrdInfoTag;
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/19_shop/H6}){3/H6}){3");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "filegencodng");
      jSJshop0.getBufferedReader("H6}){3", "H6}){3", (JApplet) null);
      JSJshop jSJshop1 = null;
      try {
        jSJshop1 = new JSJshop("filegencodng", "H6}){3");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/19_shop/farp.shp");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "one");
      JSJshop jSJshop0 = new JSJshop();
      JSPlanningDomain jSPlanningDomain0 = new JSPlanningDomain();
      jSJshop0.testParser();
      jSJshop0.getTree();
      FileSystemHandling.createFolder(evoSuiteFile0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "one";
      stringArray0[2] = "one";
      JSJshop.main(stringArray0);
      jSJshop0.parserFile("one");
      JSPlan jSPlan0 = new JSPlan();
      assertEquals(0, jSPlan0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/19_shop/farp.shp");
      JSJshop jSJshop0 = new JSJshop();
      FileSystemHandling.appendLineToFile(evoSuiteFile0, " ListLogicalAtoms: unexpected Atom");
      jSJshop0.testParser();
      JApplet jApplet0 = JSJshop.applet;
      DataFlavor dataFlavor0 = DataFlavor.allHtmlFlavor;
      Point point0 = new Point();
      JSJshop jSJshop1 = null;
      try {
        jSJshop1 = new JSJshop(" ListLogicalAtoms: unexpected Atom", " ListLogicalAtoms: unexpected Atom");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/19_shop/farp.shp");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "=,}f/leyt'h)`c0t.ds");
      JSJshop jSJshop0 = new JSJshop();
      JSPlanningDomain jSPlanningDomain0 = new JSPlanningDomain();
      jSJshop0.testParser();
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "?l9l");
      DataFlavor dataFlavor0 = DataFlavor.allHtmlFlavor;
      jSJshop0.testParser();
      JApplet jApplet0 = JSJshop.applet;
      jSJshop0.getBufferedReader("wPyguQA+T2", "=,}f/leyt'h)`c0t.ds", (JApplet) null);
      LineNumberReader lineNumberReader0 = null;
      try {
        lineNumberReader0 = new LineNumberReader((Reader) null, 551);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/19_shop/farp.shp");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "V");
      JSJshop jSJshop0 = new JSJshop();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)91;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      byteArray0[0] = (byte)91;
      JSPlan jSPlan0 = new JSPlan();
      jSJshop0.testParser();
      JSJshop jSJshop1 = null;
      try {
        jSJshop1 = new JSJshop("V", "V");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/19_shop/farp.shp");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "h(H>md]C:&X:!f");
      JSJshop jSJshop0 = new JSJshop();
      JSPlanningDomain jSPlanningDomain0 = new JSPlanningDomain();
      jSJshop0.testParser();
      jSJshop0.getTree();
      FileSystemHandling.createFolder(evoSuiteFile0);
      jSJshop0.parserFile("h(H>md]C:&X:!f");
      jSJshop0.sol();
      BufferedReader bufferedReader0 = jSJshop0.getBufferedReader("h(H>md]C:&X:!f", (String) null, (JApplet) null);
      assertNull(bufferedReader0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/19_shop/farp.shp");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "Y^{o-hP:,");
      JSJshop jSJshop0 = new JSJshop();
      JSPlan jSPlan0 = new JSPlan();
      JSPlanningDomain jSPlanningDomain0 = new JSPlanningDomain();
      jSJshop0.testParser();
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "Y^{o-hP:,");
      JSPairPlanTSListNodes jSPairPlanTSListNodes0 = new JSPairPlanTSListNodes();
      JSPlan jSPlan1 = new JSPlan();
      assertTrue(jSPlan1.equals((Object)jSPlan0));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/19_shop/farp.shp");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "ZA'm!JO=QS/7*^y6+X*");
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.testParser();
      JApplet jApplet0 = JSJshop.applet;
      FileSystemHandling.appendStringToFile(evoSuiteFile0, ".#[[eA5Lnj2OS^*A2");
      JSJshop jSJshop1 = null;
      try {
        jSJshop1 = new JSJshop(".#[[eA5Lnj2OS^*A2", "ZA'm!JO=QS/7*^y6+X*");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSJshopVars.colon = (-1894);
      JSJshopVars.flagExit = false;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JSTaskAtom jSTaskAtom0 = new JSTaskAtom();
      JSJshop jSJshop1 = new JSJshop("$$T{", "$$T{");
      assertFalse(JSJshop.corbaToHicap);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/19_shop/j[FG(-</}!PM`H>s*`");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, " ");
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("j[FG(-</}!PM`H>s*`", " ");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }
}