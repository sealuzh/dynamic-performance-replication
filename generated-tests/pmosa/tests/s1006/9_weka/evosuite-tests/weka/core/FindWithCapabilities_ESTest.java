/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 06:08:39 GMT 2018
 */

package weka.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashSet;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import weka.core.Capabilities;
import weka.core.CapabilitiesHandler;
import weka.core.ClassDiscovery;
import weka.core.FindWithCapabilities;
import weka.core.Instances;
import weka.core.SingleIndex;
import weka.core.TestInstances;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FindWithCapabilities_ESTest extends FindWithCapabilities_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.getHandler();
      findWithCapabilities0.m_Handler = null;
      Vector<String> vector0 = new Vector<String>();
      findWithCapabilities0.m_Matches = vector0;
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.EMPTY_NOMINAL_CLASS;
      findWithCapabilities0.disable(capabilities_Capability0);
      findWithCapabilities0.setFilename("");
      findWithCapabilities0.isEnabled(capabilities_Capability0);
      findWithCapabilities0.find();
      Capabilities.Capability capabilities_Capability1 = Capabilities.Capability.RELATIONAL_CLASS;
      findWithCapabilities0.enable(capabilities_Capability1);
      findWithCapabilities0.handles(capabilities_Capability1);
      TestInstances testInstances0 = new TestInstances();
      Instances instances0 = testInstances0.m_Data;
      try { 
        Capabilities.forInstances((Instances) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Capabilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.setFilename("s`>sR*");
      assertEquals("s`>sR*", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      SingleIndex singleIndex0 = new SingleIndex("");
      Vector<String> vector0 = findWithCapabilities0.getMatches();
      vector0.addElement("");
      int int0 = (-309);
      vector0.add("");
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      FindWithCapabilities.main(stringArray0);
      // Undeclared exception!
      try { 
        vector0.setSize((-309));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -309
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.setFilename("xmrwbx8D|6@&");
      findWithCapabilities0.setClassIndex("+LyB{");
      assertEquals("xmrwbx8D|6@&", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities capabilities0 = findWithCapabilities0.getCapabilities();
      Capabilities capabilities1 = capabilities0.getOtherCapabilities();
      findWithCapabilities0.m_Filename = "weka/core/Capabilities.props";
      capabilities0.enableAllAttributeDependencies();
      CapabilitiesHandler capabilitiesHandler0 = findWithCapabilities0.m_Handler;
      SingleIndex singleIndex0 = findWithCapabilities0.m_ClassIndex;
      findWithCapabilities0.m_ClassIndex = singleIndex0;
      findWithCapabilities0.m_Handler = null;
      findWithCapabilities0.setNotCapabilities(capabilities1);
      Vector<String> vector0 = findWithCapabilities0.getMisses();
      findWithCapabilities0.m_Packages = vector0;
      findWithCapabilities0.find();
      // Undeclared exception!
      try { 
        ClassDiscovery.clearClassCache();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.instrumentation.InstrumentingClassLoader cannot be cast to java.net.URLClassLoader
         //
         verifyException("weka.core.ClassCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.find();
      Capabilities capabilities0 = findWithCapabilities0.getNotCapabilities();
      Capabilities capabilities1 = capabilities0.getAttributeCapabilities();
      HashSet<Capabilities.Capability> hashSet0 = capabilities1.m_Dependencies;
      capabilities1.m_Capabilities = hashSet0;
      capabilities0.or(capabilities1);
      findWithCapabilities0.getOptions();
      findWithCapabilities0.getMatches();
      capabilities0.m_MissingValuesTest = false;
      findWithCapabilities0.setCapabilities(capabilities0);
      findWithCapabilities0.m_GenericPropertiesCreator = false;
      capabilities0.getClassCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.EMPTY_NOMINAL_ATTRIBUTES;
      capabilities0.m_MinimumNumberInstancesTest = false;
      findWithCapabilities0.enable(capabilities_Capability0);
      findWithCapabilities0.getHandler();
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
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NOMINAL_CLASS;
      findWithCapabilities0.disable(capabilities_Capability0);
      Capabilities.Capability capabilities_Capability1 = Capabilities.Capability.NOMINAL_ATTRIBUTES;
      findWithCapabilities0.enableNot(capabilities_Capability1);
      findWithCapabilities0.m_Superclass = "";
      findWithCapabilities0.getRevision();
      findWithCapabilities0.m_Superclass = "";
      findWithCapabilities0.getMisses();
      findWithCapabilities0.enableNot(capabilities_Capability0);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
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
  public void test08()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Vector<String> vector0 = findWithCapabilities0.m_Misses;
      findWithCapabilities0.m_Matches = vector0;
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NOMINAL_CLASS;
      findWithCapabilities0.enable(capabilities_Capability0);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "only-multiinstance";
      stringArray0[1] = "";
      FindWithCapabilities findWithCapabilities1 = new FindWithCapabilities();
      findWithCapabilities0.m_Handler = (CapabilitiesHandler) findWithCapabilities1;
      stringArray0[2] = "jKYVa3eL29&=OF_cH";
      stringArray0[3] = "\tMust handle numeric classes.";
      Capabilities capabilities0 = findWithCapabilities0.m_Capabilities;
      vector0.add((String) null);
      capabilities0.m_Test = true;
      findWithCapabilities0.setCapabilities(capabilities0);
      stringArray0[4] = "7w$";
      FindWithCapabilities.main(stringArray0);
      findWithCapabilities0.setNotCapabilities(capabilities0);
      String[] stringArray1 = findWithCapabilities0.getOptions();
      findWithCapabilities0.handles(capabilities_Capability0);
      findWithCapabilities0.getMisses();
      try { 
        findWithCapabilities0.setOptions(stringArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // A superclass has to be specified!
         //
         verifyException("weka.core.FindWithCapabilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      FindWithCapabilities findWithCapabilities1 = new FindWithCapabilities();
      findWithCapabilities0.m_GenericPropertiesCreator = false;
      findWithCapabilities0.setHandler(findWithCapabilities1);
      String[] stringArray0 = findWithCapabilities0.getOptions();
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.find();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-W";
      stringArray0[1] = "weka.core.ProtectedProperties";
      FindWithCapabilities.main(stringArray0);
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.DATE_ATTRIBUTES;
      boolean boolean0 = findWithCapabilities0.isEnabledNot(capabilities_Capability0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.m_Superclass = "<--BWhk)xLE[J";
      findWithCapabilities0.find();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-W";
      stringArray0[1] = "weka.core.ProtectedProperties";
      FindWithCapabilities.main(stringArray0);
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.DATE_ATTRIBUTES;
      boolean boolean0 = findWithCapabilities0.isEnabledNot(capabilities_Capability0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      FindWithCapabilities findWithCapabilities1 = new FindWithCapabilities();
      findWithCapabilities0.setHandler(findWithCapabilities1);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "\tDoesn't need a class.";
      stringArray0[1] = "-no-class";
      stringArray0[2] = "kXapCeV+`>T1TylG6";
      stringArray0[3] = "num-instances";
      stringArray0[4] = "not-unary-class";
      stringArray0[5] = "'T6HhPN;7v0";
      stringArray0[6] = "";
      stringArray0[7] = "weka.core.ProtectedProperties";
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
  public void test13()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "num-instances";
      stringArray0[1] = "-superclass";
      stringArray0[2] = "D~y";
      stringArray0[3] = "hK?]TQp95>_";
      stringArray0[4] = "i96xtZovQ77";
      stringArray0[5] = "/fZ!0C1#JuVX@(pw";
      stringArray0[6] = "\tDoesn't need a class.";
      stringArray0[7] = "80+3F*5$K";
      FindWithCapabilities.main(stringArray0);
      findWithCapabilities0.find();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.MISSING_CLASS_VALUES;
      boolean boolean0 = findWithCapabilities0.isEnabledNot(capabilities_Capability0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      CapabilitiesHandler capabilitiesHandler0 = findWithCapabilities0.m_Handler;
      String[] stringArray0 = new String[6];
      stringArray0[0] = "XN:eSpvHA";
      stringArray0[1] = "i.8s,Q";
      stringArray0[2] = "$R8~";
      stringArray0[3] = "-superclass";
      stringArray0[4] = "XN:eSpvHA";
      stringArray0[5] = "i.8s,Q";
      findWithCapabilities0.setOptions(stringArray0);
      String[] stringArray1 = findWithCapabilities0.getOptions();
      findWithCapabilities0.find();
      FindWithCapabilities.main(stringArray1);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      CapabilitiesHandler capabilitiesHandler0 = findWithCapabilities0.m_Handler;
      String[] stringArray0 = new String[8];
      stringArray0[0] = "i.8s,Q";
      stringArray0[1] = "i.8s,Q";
      stringArray0[2] = "i.8s,Q";
      findWithCapabilities0.m_Superclass = "i.8s,Q";
      stringArray0[3] = "binary-class";
      stringArray0[4] = "i.8s,Q";
      findWithCapabilities0.m_GenericPropertiesCreator = false;
      stringArray0[5] = "oWEwv{3.JXIl";
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.BINARY_CLASS;
      findWithCapabilities0.enableNot(capabilities_Capability0);
      stringArray0[6] = "-superclass";
      stringArray0[7] = "-superclass";
      findWithCapabilities0.setOptions(stringArray0);
      String[] stringArray1 = findWithCapabilities0.getOptions();
      findWithCapabilities0.find();
      FindWithCapabilities.main(stringArray1);
      assertEquals("", findWithCapabilities0.getFilename());
  }
}