/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 17:05:16 GMT 2018
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.FileDialog;
import java.awt.ScrollPane;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.StreamTokenizer;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.text.AttributeSet;
import javax.swing.text.StyleConstants;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileReader;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import umd.cs.shop.JSJshop;
import umd.cs.shop.JSJshopNode;
import umd.cs.shop.JSJshopVars;
import umd.cs.shop.JSListLogicalAtoms;
import umd.cs.shop.JSMethod;
import umd.cs.shop.JSOperator;
import umd.cs.shop.JSPairPlanTSListNodes;
import umd.cs.shop.JSPlan;
import umd.cs.shop.JSPlanningProblem;
import umd.cs.shop.JSSubstitution;
import umd.cs.shop.JSTaskAtom;
import umd.cs.shop.JSTasks;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSJshop_ESTest extends JSJshop_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.getDeleteList();
      JSPlanningProblem jSPlanningProblem0 = jSJshop0.prob();
      assertNull(jSPlanningProblem0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.getDeleteList();
      String[] stringArray0 = new String[4];
      JSJshop.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.sol();
      JSListLogicalAtoms jSListLogicalAtoms0 = jSJshop0.getAddList();
      assertNull(jSListLogicalAtoms0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSTaskAtom jSTaskAtom0 = new JSTaskAtom();
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("ZohuTpDpz|0PsxaJl", jSTaskAtom0);
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
      jSJshop0.tree();
      JSPlanningProblem jSPlanningProblem0 = jSJshop0.prob();
      assertNull(jSPlanningProblem0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.dom();
      JSListLogicalAtoms jSListLogicalAtoms0 = jSJshop0.getAddList();
      assertNull(jSListLogicalAtoms0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.getDeleteList();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "umd.cs.shop.5KJSTerm";
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
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[1];
      JSJshop.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.getTree();
      JSPairPlanTSListNodes jSPairPlanTSListNodes0 = jSJshop0.getSolution();
      assertNull(jSPairPlanTSListNodes0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.getTree();
      JApplet jApplet0 = JSJshop.applet;
      // Undeclared exception!
      try { 
        jSJshop0.getAppletURL("all", (JApplet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[3];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/19_shop/*y ");
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)76;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("*y ", "mll");
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
      JApplet jApplet0 = JSJshop.applet;
      String[] stringArray0 = new String[3];
      stringArray0[2] = "all";
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
      JSJshop jSJshop0 = new JSJshop();
      JApplet jApplet0 = JSJshop.applet;
      BufferedReader bufferedReader0 = jSJshop0.getBufferedReader("Util.getBufferedReader() error: cannot get URL", (String) null, (JApplet) null);
      assertNull(bufferedReader0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/)P!g");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, ")P!g");
      BufferedReader bufferedReader0 = jSJshop0.getBufferedReader("", ")P!g", (JApplet) null);
      assertNotNull(bufferedReader0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[3];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/19_shop/*y ");
      byte[] byteArray0 = new byte[4];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      JSJshop jSJshop0 = new JSJshop("*y ", "*y ");
      assertFalse(JSJshop.corbaToHicap);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[3];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/19_shop/*y ");
      byte[] byteArray0 = new byte[1];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("*y ", "mll");
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
      jSJshop0.parserFile("oy2~>^,i?vB&");
      jSJshop0.tree();
      jSJshop0.getAddList();
      JSJshop jSJshop1 = new JSJshop("oy2~>^,i?vB&", "oy2~>^,i?vB&");
      // Undeclared exception!
      try { 
        jSJshop1.testParser();
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
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/19_shop/farp.shp");
      JApplet jApplet0 = JSJshop.applet;
      FileSystemHandling.appendStringToFile(evoSuiteFile0, ":ll");
      JSPlan jSPlan0 = new JSPlan();
      JSJshop jSJshop0 = new JSJshop();
      System.setCurrentTimeMillis((-1908L));
      jSJshop0.testParser();
      JSJshopNode jSJshopNode0 = jSJshop0.getTree();
      assertNull(jSJshopNode0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String[] stringArray0 = new String[8];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/19_shop/farp.shp");
      JSJshop.main(stringArray0);
      String string0 = "3lz~\\uk=]";
      FileSystemHandling.appendLineToFile(evoSuiteFile0, string0);
      JApplet jApplet0 = JSJshop.applet;
      JSJshop jSJshop0 = new JSJshop();
      FileSystemHandling.setPermissions(evoSuiteFile0, false, false, true);
      jSJshop0.testParser();
      jSJshop0.getDeleteList();
      jSJshop0.getBufferedReader("_X,[uD}LU\"C<MG", "_X,[uD}LU\"C<MG", (JApplet) null);
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
  public void test19()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/19_shop/farp.shp");
      JApplet jApplet0 = JSJshop.applet;
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "B[ey9pVP$C-o1;0");
      JSPlan jSPlan0 = new JSPlan();
      JSJshop jSJshop0 = new JSJshop();
      System.setCurrentTimeMillis((-1908L));
      jSJshop0.testParser();
      JSJshopNode jSJshopNode0 = jSJshop0.getTree();
      assertNull(jSJshopNode0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[3];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/19_shop/*y ");
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)40;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("*y ", "mll");
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
      JApplet jApplet0 = JSJshop.applet;
      String string0 = "********* tree FINAL SOLUTION*******";
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "********* tree FINAL SOLUTION*******");
      JSPlan jSPlan0 = new JSPlan();
      System.setCurrentTimeMillis(543L);
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.testParser();
      System.setCurrentTimeMillis((-1907L));
      JSJshop jSJshop1 = null;
      try {
        jSJshop1 = new JSJshop("mn/\"l", "********* tree FINAL SOLUTION*******");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/19_shop/farp.shp");
      JApplet jApplet0 = JSJshop.applet;
      FileSystemHandling.appendStringToFile(evoSuiteFile0, ":ll");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "rMRLGyj<]B+");
      JSPlan jSPlan0 = new JSPlan();
      System.setCurrentTimeMillis(12L);
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.testParser();
      System.setCurrentTimeMillis(12L);
      String[] stringArray0 = new String[0];
      JSJshop.main(stringArray0);
      JSMethod jSMethod0 = new JSMethod();
      jSMethod0.head();
      JSListLogicalAtoms jSListLogicalAtoms0 = jSJshop0.getAddList();
      assertNull(jSListLogicalAtoms0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/19_shop/farp.shp");
      JApplet jApplet0 = JSJshop.applet;
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "_X(,[uD}LU\"C<MG");
      System.setCurrentTimeMillis(1L);
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.testParser();
      JSJshopVars.allPlans = true;
      jSJshop0.getDeleteList();
      System.setCurrentTimeMillis(0L);
      JSTasks jSTasks0 = new JSTasks();
      jSJshop0.testParser();
      assertFalse(JSJshop.corbaToHicap);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String[] stringArray0 = new String[3];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/19_shop/farp.shp");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "]-7p");
      stringArray0[2] = "]-7p";
      JSJshop jSJshop0 = new JSJshop();
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte)31;
      byteArray0[3] = (byte)62;
      byteArray0[4] = (byte)62;
      jSJshop0.parserFile("]-7p");
      byteArray0[5] = (byte) (-82);
      byteArray0[6] = (byte)8;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      jSJshop0.testParser();
      jSJshop0.dom();
      JSOperator jSOperator0 = new JSOperator();
      // Undeclared exception!
      try { 
        jSOperator0.standarizerOp();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSOperator", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String[] stringArray0 = new String[8];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/19_shop/farp.shp");
      JSJshop.main(stringArray0);
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "_X,[uD}LU\"C<MG");
      JSJshop jSJshop0 = new JSJshop();
      JSJshopVars.verticalL = (-2925);
      FileSystemHandling.setPermissions(evoSuiteFile0, false, false, true);
      jSJshop0.testParser();
      jSJshop0.getDeleteList();
      jSJshop0.dom();
      JSJshop.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/19_shop/farp.shp");
      JApplet jApplet0 = JSJshop.applet;
      FileSystemHandling.appendStringToFile(evoSuiteFile0, ")  ");
      JSPlan jSPlan0 = new JSPlan();
      JSJshop jSJshop0 = new JSJshop();
      System.setCurrentTimeMillis((-1908L));
      jSJshop0.testParser();
      jSJshop0.getTree();
      jSJshop0.testParser();
      assertFalse(JSJshop.corbaToHicap);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/19_shop/farp.shp");
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.getDeleteList();
      JApplet jApplet0 = JSJshop.applet;
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "|dtn");
      String string0 = ")T JXBvx4";
      jSJshop0.testParser();
      String string1 = "- ";
      JSJshop jSJshop1 = null;
      try {
        jSJshop1 = new JSJshop("- ", ")T JXBvx4");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/19_shop/farp.shp");
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.getDeleteList();
      JApplet jApplet0 = JSJshop.applet;
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "!-D&@_x4i~H`B");
      FileSystemHandling.setPermissions(evoSuiteFile0, true, false, false);
      jSJshop0.testParser();
      JSJshop jSJshop1 = null;
      try {
        jSJshop1 = new JSJshop("!-D&@_x4i~H`B", "!-D&@_x4i~H`B");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/19_shop/farp.shp");
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.getAddList();
      JApplet jApplet0 = JSJshop.applet;
      String string0 = "pp(!e";
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "pp(!e");
      String string1 = "ze<o/";
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "ze<o/");
      jSJshop0.testParser();
      JSJshop jSJshop1 = null;
      try {
        jSJshop1 = new JSJshop("pp(!e", "");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/19_shop/farp.shp");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "e9?;wskq j@,_{83@<");
      JApplet jApplet0 = JSJshop.applet;
      System.setCurrentTimeMillis(1L);
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.testParser();
      jSJshop0.getDeleteList();
      System.setCurrentTimeMillis(0L);
      JSTasks jSTasks0 = new JSTasks();
      JSJshop jSJshop1 = null;
      try {
        jSJshop1 = new JSJshop("e9?;wskq j@,_{83@<", "Nzq+ZfCV&#%o8=z=");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/19_shop/farp.shp");
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.getAddList();
      JApplet jApplet0 = JSJshop.applet;
      JApplet jApplet1 = JSJshop.applet;
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "Jf+K?C'E/");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "U9i:S|ZVox'@p#~Z");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "@HH6Txp+r('JM<S*");
      JSJshop jSJshop1 = new JSJshop();
      jSJshop1.testParser();
      JSJshop jSJshop2 = null;
      try {
        jSJshop2 = new JSJshop("U9i:S|ZVox'@p#~Z", "umd.cs.shop.JSJshopVars");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String[] stringArray0 = new String[6];
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "DIUHXwUWx3-On;cqE?");
      stringArray0[0] = "*y ";
      stringArray0[2] = "mll";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/19_shop/*y ");
      byte[] byteArray0 = new byte[20];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.getAddList();
      JSJshop jSJshop1 = new JSJshop();
      jSJshop1.getBufferedReader((String) null, "mll", (JApplet) null);
      JSJshopVars.rightPar = 85;
      JSJshopVars.flagExit = false;
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, (String) null);
      System.setCurrentTimeMillis(85);
      jSJshop0.getDeleteList();
      JSJshop jSJshop2 = new JSJshop("*y ", "mll");
      // Undeclared exception!
      jSJshop1.getBufferedReader("", "% ");
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = "one";
      String[] stringArray0 = new String[3];
      stringArray0[2] = "one";
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
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[2] = (byte)40;
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/19_shop/*y ");
      byte[] byteArray1 = new byte[6];
      byteArray1[2] = (byte)40;
      byteArray1[3] = (byte) (-107);
      byteArray1[4] = (byte)40;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray1);
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("*y ", "v#31tk@(I/#tj89");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }
}