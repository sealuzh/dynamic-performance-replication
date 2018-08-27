/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 08:26:52 GMT 2018
 */

package weka.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.junit.runner.RunWith;
import weka.core.Attribute;
import weka.core.Capabilities;
import weka.core.CapabilitiesHandler;
import weka.core.FindWithCapabilities;
import weka.core.Instances;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FindWithCapabilities_ESTest extends FindWithCapabilities_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      // Undeclared exception!
      try { 
        findWithCapabilities0.getClassIndex();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No index set
         //
         verifyException("weka.core.SingleIndex", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.getMatches();
      findWithCapabilities0.find();
      Enumeration enumeration0 = findWithCapabilities0.listOptions();
      assertNotNull(enumeration0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      // Undeclared exception!
      try { 
        findWithCapabilities0.setHandler((CapabilitiesHandler) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.FindWithCapabilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      try { 
        findWithCapabilities0.setOptions((String[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // A superclass has to be specified!
         //
         verifyException("weka.core.FindWithCapabilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.m_ClassIndex = null;
      Capabilities capabilities0 = findWithCapabilities0.getNotCapabilities();
      Vector<String> vector0 = findWithCapabilities0.m_Matches;
      findWithCapabilities0.m_Packages = vector0;
      Capabilities capabilities1 = capabilities0.getAttributeCapabilities();
      Capabilities capabilities2 = capabilities1.getOtherCapabilities();
      findWithCapabilities0.setCapabilities(capabilities2);
      Vector<String> vector1 = findWithCapabilities0.getMatches();
      assertSame(vector1, vector0);
      
      findWithCapabilities0.find();
      findWithCapabilities0.setClassIndex("#V8vA_|vnu9");
      Capabilities capabilities3 = findWithCapabilities0.getCapabilities();
      assertNotSame(capabilities3, capabilities0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Vector<String> vector0 = findWithCapabilities0.m_Packages;
      vector0.add((String) null);
      findWithCapabilities0.m_Misses = vector0;
      findWithCapabilities0.getRevision();
      findWithCapabilities0.getMatches();
      Capabilities capabilities0 = findWithCapabilities0.getNotCapabilities();
      assertEquals(1, capabilities0.getMinimumNumberInstances());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.getMatches();
      findWithCapabilities0.getOptions();
      Enumeration enumeration0 = findWithCapabilities0.listOptions();
      assertNotNull(enumeration0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.DATE_ATTRIBUTES;
      boolean boolean0 = findWithCapabilities0.handles(capabilities_Capability0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("\"`hM7-S_E2ej]Se&J", arrayList0, 241);
      Capabilities capabilities0 = Capabilities.forInstances(instances0);
      Capabilities capabilities1 = capabilities0.getAttributeCapabilities();
      findWithCapabilities0.setNotCapabilities(capabilities1);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      FindWithCapabilities findWithCapabilities1 = new FindWithCapabilities();
      findWithCapabilities0.m_Handler = (CapabilitiesHandler) findWithCapabilities1;
      findWithCapabilities0.getOptions();
      Vector<String> vector0 = findWithCapabilities1.find();
      assertEquals("[]", vector0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.getHandler();
      FindWithCapabilities findWithCapabilities1 = new FindWithCapabilities();
      findWithCapabilities1.m_Handler = (CapabilitiesHandler) findWithCapabilities0;
      String[] stringArray0 = findWithCapabilities1.getOptions();
      FindWithCapabilities.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      FindWithCapabilities findWithCapabilities1 = new FindWithCapabilities();
      findWithCapabilities0.m_Handler = (CapabilitiesHandler) findWithCapabilities1;
      String[] stringArray0 = findWithCapabilities0.getOptions();
      FindWithCapabilities.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      FindWithCapabilities findWithCapabilities1 = new FindWithCapabilities();
      findWithCapabilities0.m_Handler = (CapabilitiesHandler) findWithCapabilities1;
      String[] stringArray0 = findWithCapabilities0.getOptions();
      String[] stringArray1 = new String[4];
      stringArray1[0] = "\tThe minimum number of instances (default 1).";
      stringArray1[1] = "";
      stringArray1[2] = "-no-class";
      stringArray1[3] = "-not-string-class";
      FindWithCapabilities.main(stringArray1);
      assertFalse(stringArray1.equals((Object)stringArray0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.m_Superclass = "!Xk(MZN(m_y f<";
      String[] stringArray0 = findWithCapabilities0.getOptions();
      FindWithCapabilities.main(stringArray0);
      Vector<String> vector0 = findWithCapabilities0.getMisses();
      assertEquals("[]", vector0.toString());
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.m_Superclass = "!Xk(MiZN(m_ f";
      String[] stringArray0 = findWithCapabilities0.getOptions();
      findWithCapabilities0.setOptions(stringArray0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.BINARY_ATTRIBUTES;
      findWithCapabilities0.enableNot(capabilities_Capability0);
      Vector<String> vector0 = findWithCapabilities0.m_Matches;
      findWithCapabilities0.m_Packages = vector0;
      findWithCapabilities0.m_Superclass = "!Xk(MZN(m_y f<";
      String[] stringArray0 = findWithCapabilities0.getOptions();
      FindWithCapabilities.main(stringArray0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.BINARY_ATTRIBUTES;
      findWithCapabilities0.enable(capabilities_Capability0);
      findWithCapabilities0.m_Superclass = "\tMust handle binary attributes.";
      String[] stringArray0 = findWithCapabilities0.getOptions();
      FindWithCapabilities.main(stringArray0);
      Random.setNextRandom((-2021588212));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.RELATIONAL_ATTRIBUTES;
      findWithCapabilities0.enable(capabilities_Capability0);
      findWithCapabilities0.m_Superclass = "!Xk(MiZN(m_y f<";
      String[] stringArray0 = findWithCapabilities0.getOptions();
      FindWithCapabilities.main(stringArray0);
      assertEquals("", findWithCapabilities0.getFilename());
  }
}