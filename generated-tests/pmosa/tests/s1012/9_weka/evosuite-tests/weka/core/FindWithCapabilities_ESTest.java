/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 22:42:31 GMT 2018
 */

package weka.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.junit.runner.RunWith;
import weka.core.Capabilities;
import weka.core.CapabilitiesHandler;
import weka.core.ClassDiscovery;
import weka.core.FindWithCapabilities;
import weka.core.Range;
import weka.core.SingleIndex;
import weka.core.TestInstances;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FindWithCapabilities_ESTest extends FindWithCapabilities_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      stringArray0[1] = "SdX&+*e";
      Capabilities capabilities0 = findWithCapabilities0.m_NotCapabilities;
      Capabilities capabilities1 = capabilities0.getClassCapabilities();
      capabilities0.enableAllAttributes();
      capabilities1.getAttributeCapabilities();
      capabilities0.m_MinimumNumberInstancesTest = false;
      Capabilities capabilities2 = capabilities1.getAttributeCapabilities();
      findWithCapabilities0.setNotCapabilities(capabilities2);
      stringArray0[2] = "Words: ";
      stringArray0[3] = "A(SXt4W4z{%zKh!IK";
      stringArray0[4] = "";
      stringArray0[5] = "7.AIm^!OgPMk<A^";
      stringArray0[6] = "-c";
      SingleIndex singleIndex0 = new SingleIndex();
      findWithCapabilities0.m_ClassIndex = singleIndex0;
      stringArray0[7] = "";
      FindWithCapabilities.main(stringArray0);
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.DATE_CLASS;
      findWithCapabilities0.enable(capabilities_Capability0);
      findWithCapabilities0.getMisses();
      Vector<String> vector0 = findWithCapabilities0.getMatches();
      assertEquals(10, vector0.capacity());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.EMPTY_NOMINAL_CLASS;
      findWithCapabilities0.enable(capabilities_Capability0);
      Capabilities.Capability capabilities_Capability1 = Capabilities.Capability.EMPTY_NOMINAL_CLASS;
      findWithCapabilities0.isEnabledNot(capabilities_Capability1);
      findWithCapabilities0.setClassIndex("ucSLO)5(6");
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.setFilename("last");
      findWithCapabilities0.getRevision();
      findWithCapabilities0.getFilename();
      assertEquals("last", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.getRevision();
      findWithCapabilities0.find();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NUMERIC_ATTRIBUTES;
      findWithCapabilities0.enable(capabilities_Capability0);
      findWithCapabilities0.getFilename();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "8034";
      stringArray0[1] = "";
      stringArray0[2] = "8034";
      stringArray0[3] = "8034";
      stringArray0[4] = "8034";
      stringArray0[5] = "";
      stringArray0[6] = "";
      stringArray0[7] = "";
      stringArray0[8] = "";
      FindWithCapabilities.main(stringArray0);
      findWithCapabilities0.setClassIndex("8034");
      ClassDiscovery.m_Cache = null;
      findWithCapabilities0.getRevision();
      Capabilities.Capability capabilities_Capability1 = Capabilities.Capability.STRING_ATTRIBUTES;
      findWithCapabilities0.enableNot(capabilities_Capability1);
      findWithCapabilities0.getOptions();
      findWithCapabilities0.listOptions();
      findWithCapabilities0.getOptions();
      findWithCapabilities0.getCapabilities();
      try { 
        Capabilities.main(stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // No file provided with option '-file'!
         //
         verifyException("weka.core.Capabilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.getOptions();
      Random.setNextRandom(0);
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.BINARY_CLASS;
      findWithCapabilities0.enable(capabilities_Capability0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NO_CLASS;
      Vector<String> vector0 = findWithCapabilities0.m_Misses;
      findWithCapabilities0.m_Matches = vector0;
      findWithCapabilities0.enable(capabilities_Capability0);
      String[] stringArray0 = findWithCapabilities0.getOptions();
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.getMatches();
      findWithCapabilities0.find();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.STRING_CLASS;
      findWithCapabilities0.enable(capabilities_Capability0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.MISSING_CLASS_VALUES;
      findWithCapabilities0.enable(capabilities_Capability0);
      Range range0 = new Range();
      Vector vector0 = range0.m_RangeStrings;
      findWithCapabilities0.m_Packages = vector0;
      findWithCapabilities0.m_GenericPropertiesCreator = false;
      findWithCapabilities0.getHandler();
      findWithCapabilities0.getMatches();
      findWithCapabilities0.disableNot(capabilities_Capability0);
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
  public void test08()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.find();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.MISSING_CLASS_VALUES;
      findWithCapabilities0.disable(capabilities_Capability0);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "81-106";
      stringArray0[1] = "";
      stringArray0[2] = "u z";
      FindWithCapabilities.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NOMINAL_ATTRIBUTES;
      boolean boolean0 = findWithCapabilities0.handles(capabilities_Capability0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-no-class";
      stringArray0[1] = "Lg";
      stringArray0[2] = "t";
      stringArray0[3] = "HyW_4H|DY";
      stringArray0[4] = "RdVCe";
      stringArray0[5] = "Attributes differ at position ";
      stringArray0[6] = "z{~f/iRq!_G)DE_?";
      stringArray0[7] = "\tThe number of relational attributes (default 0).";
      stringArray0[8] = "dG;H)-q&A&{5Lxt";
      FindWithCapabilities.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      FindWithCapabilities findWithCapabilities1 = new FindWithCapabilities();
      Capabilities capabilities0 = findWithCapabilities1.getNotCapabilities();
      findWithCapabilities1.m_NotCapabilities = capabilities0;
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.BINARY_ATTRIBUTES;
      findWithCapabilities0.enableNot(capabilities_Capability0);
      findWithCapabilities0.setHandler(findWithCapabilities1);
      String[] stringArray0 = findWithCapabilities0.getOptions();
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      FindWithCapabilities findWithCapabilities1 = new FindWithCapabilities();
      findWithCapabilities1.listOptions();
      findWithCapabilities1.setHandler(findWithCapabilities0);
      String[] stringArray0 = findWithCapabilities1.getOptions();
      try { 
        findWithCapabilities0.setOptions(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // A superclass has to be specified!
         //
         verifyException("weka.core.FindWithCapabilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      FindWithCapabilities findWithCapabilities1 = new FindWithCapabilities();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "weka/core/Capabilities.props";
      stringArray0[1] = "4sRjo$^A[|IM*L's";
      stringArray0[2] = "[?&&\"%+$X.CJfrg";
      stringArray0[3] = ">S8Q$1/x>[";
      stringArray0[4] = "@Y43";
      stringArray0[5] = "-superclass";
      stringArray0[6] = "*?=4;h&$]/";
      stringArray0[7] = "uXQiB~4";
      stringArray0[8] = "Z~WFM&{psu%dR*9";
      FindWithCapabilities.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-superclass";
      stringArray0[1] = "-superclass";
      FindWithCapabilities.main(stringArray0);
      findWithCapabilities0.getMatches();
      Capabilities capabilities0 = findWithCapabilities0.getCapabilities();
      findWithCapabilities0.setNotCapabilities(capabilities0);
      assertEquals("", findWithCapabilities0.getFilename());
  }
}