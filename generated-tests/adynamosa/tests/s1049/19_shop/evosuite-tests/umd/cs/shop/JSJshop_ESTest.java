/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 09:15:46 GMT 2019
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedReader;
import java.io.PipedReader;
import java.io.StreamTokenizer;
import javax.swing.JApplet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import umd.cs.shop.JSJshop;
import umd.cs.shop.JSJshopNode;
import umd.cs.shop.JSListLogicalAtoms;
import umd.cs.shop.JSPairPlanTSListNodes;
import umd.cs.shop.JSPlan;
import umd.cs.shop.JSPlanningDomain;
import umd.cs.shop.JSPlanningProblem;
import umd.cs.shop.JSTaskAtom;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSJshop_ESTest extends JSJshop_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "umd.cs.shop.JSTState";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("umd.cs.shop.JSTState");
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)101;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
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
  public void test01()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSTaskAtom jSTaskAtom0 = new JSTaskAtom();
      jSTaskAtom0.add((Object) null);
      // Undeclared exception!
      try { 
        jSJshop0.setFile("[", jSTaskAtom0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      // Undeclared exception!
      try { 
        jSJshop0.setFile("", (JSTaskAtom) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      boolean boolean0 = jSJshop0.parserFile("<");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      boolean boolean0 = jSJshop0.parserFile("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        JSJshop.main((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      BufferedReader bufferedReader0 = jSJshop0.getBufferedReader("`};+0", "", (JApplet) null);
      assertNull(bufferedReader0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      BufferedReader bufferedReader0 = jSJshop0.getBufferedReader("", "Can not open file : ", (JApplet) null);
      assertNull(bufferedReader0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      // Undeclared exception!
      try { 
        jSJshop0.getAppletURL("qvr26z0k;efr&=/8q'c", (JApplet) null);
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
  public void test10()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSTaskAtom jSTaskAtom0 = new JSTaskAtom();
      // Undeclared exception!
      try { 
        jSJshop0.setFile("[", jSTaskAtom0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      // Undeclared exception!
      try { 
        jSJshop0.processToken((StreamTokenizer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      // Undeclared exception!
      try { 
        jSJshop0.parserFile((String) null);
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
      String[] stringArray0 = new String[4];
      stringArray0[0] = "one";
      stringArray0[2] = "one";
      stringArray0[3] = "one";
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
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      PipedReader pipedReader0 = new PipedReader(1694);
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
  public void test16()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("umd.cs.shop.JSTState");
      byte[] byteArray0 = new byte[1];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      JSJshop jSJshop0 = new JSJshop("umd.cs.shop.JSTState", "umd.cs.shop.JSTState");
      assertFalse(JSJshop.corbaToHicap);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      BufferedReader bufferedReader0 = jSJshop0.getBufferedReader((String) null, (String) null, (JApplet) null);
      assertNull(bufferedReader0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("wRN");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "~[");
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("wRN", (JSTaskAtom) null);
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
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "][[|lr`Brqa{gM");
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.testParser();
      assertFalse(JSJshop.corbaToHicap);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      JSJshop jSJshop0 = new JSJshop();
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "d,AxP2&)u8j2w>Qi>");
      jSJshop0.testParser();
      assertFalse(JSJshop.corbaToHicap);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "p%e<");
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.testParser();
      assertFalse(JSJshop.corbaToHicap);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte)33;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.testParser();
      assertFalse(JSJshop.corbaToHicap);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      JSJshop jSJshop0 = new JSJshop();
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "[number-of-plans] can be 'one' or 'all'. The default value is 'one'");
      jSJshop0.testParser();
      assertFalse(JSJshop.corbaToHicap);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "usage :");
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.testParser();
      assertFalse(JSJshop.corbaToHicap);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      JSJshop jSJshop0 = new JSJshop();
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "umd.cs.Reshop.SJ(hop");
      jSJshop0.testParser();
      assertFalse(JSJshop.corbaToHicap);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      JSJshop jSJshop0 = new JSJshop();
      FileSystemHandling.appendStringToFile(evoSuiteFile0, ".Y9h*{O[m+1hO; O,)");
      jSJshop0.testParser();
      assertFalse(JSJshop.corbaToHicap);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSListLogicalAtoms jSListLogicalAtoms0 = jSJshop0.getDeleteList();
      assertNull(jSListLogicalAtoms0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSListLogicalAtoms jSListLogicalAtoms0 = jSJshop0.getAddList();
      assertNull(jSListLogicalAtoms0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "umd.cs.shop.JSTState";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("umd.cs.shop.JSTState");
      byte[] byteArray0 = new byte[1];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      stringArray0[1] = "umd.cs.shop.JSTState";
      JSJshop.main(stringArray0);
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("0}~y)^bjS#{e63)Ud", "one");
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
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("2Hs2`JSjnr");
      byte[] byteArray0 = new byte[1];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("2Hs2`JSjnr", "umd.cs.shop.JSTState");
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
      JSJshop.main(stringArray0);
      assertEquals(6, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String[] stringArray0 = new String[4];
      JSJshop.main(stringArray0);
      assertEquals(4, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String[] stringArray0 = new String[0];
      JSJshop.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSPlanningDomain jSPlanningDomain0 = jSJshop0.dom();
      assertNull(jSPlanningDomain0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSPlanningProblem jSPlanningProblem0 = jSJshop0.prob();
      assertNull(jSPlanningProblem0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSJshopNode jSJshopNode0 = jSJshop0.tree();
      assertNull(jSJshopNode0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSPlan jSPlan0 = jSJshop0.sol();
      assertNull(jSPlan0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSPairPlanTSListNodes jSPairPlanTSListNodes0 = jSJshop0.getSolution();
      assertNull(jSPairPlanTSListNodes0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
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
  public void test41()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSJshopNode jSJshopNode0 = jSJshop0.getTree();
      assertNull(jSJshopNode0);
  }
}