/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 18:31:20 GMT 2018
 */

package weka.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Vector;
import java.util.function.Consumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import weka.core.Capabilities;
import weka.core.CapabilitiesHandler;
import weka.core.FindWithCapabilities;
import weka.core.Range;
import weka.core.SingleIndex;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FindWithCapabilities_ESTest extends FindWithCapabilities_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities capabilities0 = findWithCapabilities0.getNotCapabilities();
      assertEquals(1, capabilities0.getMinimumNumberInstances());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.setFilename("&N>}pIUS$TA");
      assertEquals("&N>}pIUS$TA", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      FindWithCapabilities findWithCapabilities1 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NOMINAL_ATTRIBUTES;
      String[] stringArray0 = new String[8];
      stringArray0[0] = "|By";
      stringArray0[1] = "-not-unary-atts";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "  - # Instances: ";
      stringArray0[5] = "";
      stringArray0[6] = "";
      stringArray0[7] = "h^^(Q)\"%5wGC>66";
      try { 
        findWithCapabilities1.setOptions(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // A superclass has to be specified!
         //
         verifyException("weka.core.FindWithCapabilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      CapabilitiesHandler capabilitiesHandler0 = findWithCapabilities0.m_Handler;
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
  public void test04()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.getOptions();
      Capabilities capabilities0 = new Capabilities(findWithCapabilities0);
      findWithCapabilities0.setCapabilities(capabilities0);
      assertEquals(1, capabilities0.getMinimumNumberInstances());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      FindWithCapabilities.main(stringArray0);
      findWithCapabilities0.getMatches();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NUMERIC_ATTRIBUTES;
      findWithCapabilities0.enable(capabilities_Capability0);
      findWithCapabilities0.getOptions();
      findWithCapabilities0.enableNot(capabilities_Capability0);
      findWithCapabilities0.getHandler();
      try { 
        findWithCapabilities0.setOptions(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      stringArray0[1] = "x5?OPV#I:4$blGDFH~";
      stringArray0[2] = "64RgXvJt#R{g<N]d";
      stringArray0[3] = "";
      stringArray0[4] = "-no-class";
      FindWithCapabilities.main(stringArray0);
      findWithCapabilities0.getMatches();
      findWithCapabilities0.getOptions();
      findWithCapabilities0.getHandler();
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
  public void test07()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      FindWithCapabilities findWithCapabilities1 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.BINARY_ATTRIBUTES;
      findWithCapabilities1.enable(capabilities_Capability0);
      findWithCapabilities0.m_Handler = (CapabilitiesHandler) findWithCapabilities1;
      findWithCapabilities0.getOptions();
      CapabilitiesHandler capabilitiesHandler0 = findWithCapabilities0.getHandler();
      assertNotSame(capabilitiesHandler0, findWithCapabilities0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-only-multi-instance";
      FindWithCapabilities.main(stringArray0);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities capabilities0 = findWithCapabilities0.getCapabilities();
      findWithCapabilities0.setNotCapabilities(capabilities0);
      capabilities0.enableAllAttributes();
      findWithCapabilities0.m_Capabilities = capabilities0;
      FindWithCapabilities.main((String[]) null);
      findWithCapabilities0.getMatches();
      FindWithCapabilities findWithCapabilities1 = new FindWithCapabilities();
      String[] stringArray1 = findWithCapabilities0.getOptions();
      findWithCapabilities1.getHandler();
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
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NOMINAL_CLASS;
      findWithCapabilities0.enable(capabilities_Capability0);
      Vector<String> vector0 = findWithCapabilities0.find();
      findWithCapabilities0.m_Packages = vector0;
      Vector<String> vector1 = findWithCapabilities0.getMisses();
      findWithCapabilities0.m_Matches = vector1;
      vector1.listIterator();
      findWithCapabilities0.getMatches();
      findWithCapabilities0.find();
      FindWithCapabilities.main((String[]) null);
      findWithCapabilities0.getMatches();
      FindWithCapabilities findWithCapabilities1 = new FindWithCapabilities();
      String[] stringArray0 = findWithCapabilities0.getOptions();
      findWithCapabilities1.getHandler();
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
  public void test10()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NOMINAL_CLASS;
      findWithCapabilities0.enable(capabilities_Capability0);
      Vector<String> vector0 = findWithCapabilities0.find();
      findWithCapabilities0.m_Packages = vector0;
      Vector<String> vector1 = findWithCapabilities0.getMisses();
      findWithCapabilities0.m_Matches = vector1;
      vector1.listIterator();
      findWithCapabilities0.setClassIndex("");
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      vector1.removeAllElements();
      vector1.forEach(consumer0);
      Capabilities.Capability capabilities_Capability1 = Capabilities.Capability.BINARY_ATTRIBUTES;
      vector1.add("");
      findWithCapabilities0.disable(capabilities_Capability1);
      vector0.add("");
      vector1.add(0, "");
      findWithCapabilities0.listOptions();
      findWithCapabilities0.enableNot(capabilities_Capability0);
      findWithCapabilities0.getOptions();
      findWithCapabilities0.getHandler();
      Capabilities.Capability capabilities_Capability2 = Capabilities.Capability.EMPTY_NOMINAL_ATTRIBUTES;
      findWithCapabilities0.handles(capabilities_Capability2);
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
  public void test11()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = findWithCapabilities0.getOptions();
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
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "Usage: Range <rangespec>";
      stringArray0[1] = "wQ79%qi";
      stringArray0[2] = "";
      stringArray0[3] = "String class";
      FindWithCapabilities.main(stringArray0);
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.m_GenericPropertiesCreator = false;
      findWithCapabilities0.setClassIndex("wQ79%qi");
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.UNARY_CLASS;
      findWithCapabilities0.disable(capabilities_Capability0);
      Capabilities.Capability capabilities_Capability1 = Capabilities.Capability.DATE_ATTRIBUTES;
      findWithCapabilities0.enableNot(capabilities_Capability1);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_mosa/projects/9_weka/Capabilities.props");
      FileSystemHandling.setPermissions(evoSuiteFile0, false, false, false);
      String[] stringArray1 = findWithCapabilities0.getOptions();
      findWithCapabilities0.getHandler();
      FindWithCapabilities findWithCapabilities1 = new FindWithCapabilities();
      Capabilities capabilities0 = findWithCapabilities1.m_Capabilities;
      Capabilities capabilities1 = capabilities0.getClassCapabilities();
      Capabilities capabilities2 = capabilities1.getOtherCapabilities();
      Capabilities capabilities3 = capabilities2.getAttributeCapabilities();
      findWithCapabilities0.setCapabilities(capabilities3);
      FindWithCapabilities.main(stringArray1);
      assertNotSame(stringArray1, stringArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[4];
      findWithCapabilities0.getRevision();
      stringArray0[0] = "H &)u<2qfm:&5TQw|";
      stringArray0[1] = "-unary-atts";
      stringArray0[2] = "DEFAULT";
      stringArray0[3] = "\tRetrieves the package list from the GenericPropertiesCreator\n\tfor the given superclass. (overrides -packages <list>).";
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
      String[] stringArray0 = new String[7];
      stringArray0[0] = "not-date-class";
      stringArray0[1] = "-numeric-atts";
      stringArray0[2] = "rt.SBqz!*d";
      stringArray0[3] = "o}|W!4R8<AN`0w";
      stringArray0[4] = "\tRetrieves the package list from the GenericPropertiesCreator\n\tfor the given superclass. (overrides -packages <list>).";
      stringArray0[5] = "-not-no-class";
      stringArray0[6] = "last";
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
  public void test15()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      FindWithCapabilities findWithCapabilities1 = new FindWithCapabilities();
      findWithCapabilities0.m_Handler = (CapabilitiesHandler) findWithCapabilities1;
      findWithCapabilities0.getMatches();
      findWithCapabilities0.getOptions();
      CapabilitiesHandler capabilitiesHandler0 = findWithCapabilities0.getHandler();
      assertNotSame(capabilitiesHandler0, findWithCapabilities0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      FindWithCapabilities findWithCapabilities1 = new FindWithCapabilities();
      Vector<String> vector0 = findWithCapabilities0.getMisses();
      FindWithCapabilities findWithCapabilities2 = new FindWithCapabilities();
      Vector<String> vector1 = findWithCapabilities2.getMisses();
      vector0.listIterator();
      findWithCapabilities2.setClassIndex("V");
      vector0.removeAllElements();
      Consumer<String> consumer0 = (Consumer<String>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      vector1.forEach(consumer0);
      vector1.add("\"position\" is string: ");
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.MISSING_VALUES;
      findWithCapabilities2.disable(capabilities_Capability0);
      vector1.add("");
      vector0.add(0, "z]a>");
      findWithCapabilities2.listOptions();
      FindWithCapabilities findWithCapabilities3 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability1 = Capabilities.Capability.RELATIONAL_CLASS;
      findWithCapabilities3.enableNot(capabilities_Capability1);
      findWithCapabilities3.getOptions();
      findWithCapabilities1.getHandler();
      Capabilities.Capability capabilities_Capability2 = Capabilities.Capability.DATE_CLASS;
      findWithCapabilities3.handles(capabilities_Capability2);
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
  public void test17()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.m_Handler = (CapabilitiesHandler) findWithCapabilities0;
      findWithCapabilities0.getMatches();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.UNARY_ATTRIBUTES;
      findWithCapabilities0.enableNot(capabilities_Capability0);
      // Undeclared exception!
      try { 
        findWithCapabilities0.getOptions();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NOMINAL_CLASS;
      findWithCapabilities0.enable(capabilities_Capability0);
      Vector<String> vector0 = findWithCapabilities0.find();
      Vector<String> vector1 = findWithCapabilities0.getMisses();
      vector0.listIterator();
      findWithCapabilities0.setClassIndex("-not-relational-atts");
      vector0.add("");
      vector1.removeAllElements();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      vector0.forEach(consumer0);
      Capabilities.Capability capabilities_Capability1 = Capabilities.Capability.BINARY_ATTRIBUTES;
      Vector<String> vector2 = findWithCapabilities0.m_Packages;
      vector2.add("PG>WT2;Yr,");
      findWithCapabilities0.disable(capabilities_Capability1);
      vector2.add("p");
      vector0.add((String) null);
      vector1.add(0, "$eKl");
      findWithCapabilities0.listOptions();
      Capabilities.Capability capabilities_Capability2 = Capabilities.Capability.BINARY_ATTRIBUTES;
      findWithCapabilities0.enableNot(capabilities_Capability2);
      findWithCapabilities0.getOptions();
      findWithCapabilities0.getHandler();
      findWithCapabilities0.handles(capabilities_Capability2);
      // Undeclared exception!
      try { 
        findWithCapabilities0.getClassIndex();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No upper limit has been specified for index
         //
         verifyException("weka.core.SingleIndex", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Range range0 = new Range();
      Vector vector0 = range0.m_RangeStrings;
      findWithCapabilities0.m_Packages = vector0;
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.RELATIONAL_ATTRIBUTES;
      findWithCapabilities0.enableNot(capabilities_Capability0);
      findWithCapabilities0.setClassIndex("$");
      Vector<String> vector1 = findWithCapabilities0.m_Matches;
      Consumer<String> consumer0 = (Consumer<String>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = findWithCapabilities0.getOptions();
      findWithCapabilities0.getRevision();
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
  public void test20()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "O!!`hI";
      stringArray0[1] = "M&3\"UE";
      stringArray0[2] = "BINARY_ATTRIBUTES";
      stringArray0[3] = "-not-missing-class-values";
      stringArray0[4] = ",%^c6=@Pm@O}";
      stringArray0[5] = "k%'(n.p";
      stringArray0[6] = "8F5m4uAj kJ3qE1,L";
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
  public void test21()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.STRING_ATTRIBUTES;
      findWithCapabilities0.enableNot(capabilities_Capability0);
      findWithCapabilities0.setClassIndex("$");
      Vector<String> vector0 = findWithCapabilities0.m_Matches;
      Consumer<String> consumer0 = (Consumer<String>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      findWithCapabilities0.getOptions();
      String string0 = findWithCapabilities0.getRevision();
      assertEquals("8034", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-relational-class";
      stringArray0[1] = "YJzDenl b}";
      stringArray0[2] = "last";
      stringArray0[3] = "not-date-atts";
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
  public void test23()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.setFilename("index out of bounds");
      findWithCapabilities0.setFilename("-W <classname>");
      findWithCapabilities0.getOptions();
      assertEquals("-W <classname>", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      SingleIndex singleIndex0 = new SingleIndex();
      findWithCapabilities0.m_Superclass = "{MzODXX[<v=V%b8{|M$";
      findWithCapabilities0.m_ClassIndex = singleIndex0;
      findWithCapabilities0.getOptions();
      Vector<String> vector0 = findWithCapabilities0.getMisses();
      assertEquals("", findWithCapabilities0.getFilename());
      assertEquals("[]", vector0.toString());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.setClassIndex("-missing-att-values");
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-missing-att-values";
      stringArray0[1] = "-missing-att-values";
      stringArray0[2] = "-missing-att-values";
      stringArray0[3] = "-missing-att-values";
      stringArray0[4] = "-missing-att-values";
      stringArray0[5] = "-missing-att-values";
      stringArray0[6] = "-missing-att-values";
      stringArray0[7] = "-missing-att-values";
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
  public void test26()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.m_Filename = null;
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.DATE_CLASS;
      findWithCapabilities0.disableNot(capabilities_Capability0);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "M&3\"UE";
      stringArray0[1] = "class-values";
      stringArray0[2] = "seed";
      findWithCapabilities0.m_Filename = "class-values";
      stringArray0[3] = "SZ[<W9I/`sH$KeB){R";
      stringArray0[4] = "BD3:";
      findWithCapabilities0.enableNot(capabilities_Capability0);
      FindWithCapabilities.main(stringArray0);
      Capabilities.Capability capabilities_Capability1 = Capabilities.Capability.NOMINAL_CLASS;
      findWithCapabilities0.enable(capabilities_Capability1);
      findWithCapabilities0.getHandler();
      findWithCapabilities0.disable(capabilities_Capability1);
      Capabilities.Capability capabilities_Capability2 = Capabilities.Capability.DATE_ATTRIBUTES;
      findWithCapabilities0.disableNot(capabilities_Capability2);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      Capabilities.Capability capabilities_Capability3 = Capabilities.Capability.NUMERIC_ATTRIBUTES;
      findWithCapabilities0.handles(capabilities_Capability3);
      findWithCapabilities0.isEnabled(capabilities_Capability0);
      findWithCapabilities0.handles(capabilities_Capability3);
      System.setCurrentTimeMillis(0L);
      findWithCapabilities0.disableNot(capabilities_Capability2);
      findWithCapabilities0.getOptions();
      findWithCapabilities0.getHandler();
      assertEquals("class-values", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.getMatches();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.UNARY_CLASS;
      findWithCapabilities0.enable(capabilities_Capability0);
      Capabilities.Capability capabilities_Capability1 = Capabilities.Capability.UNARY_ATTRIBUTES;
      findWithCapabilities0.enableNot(capabilities_Capability1);
      findWithCapabilities0.getOptions();
      CapabilitiesHandler capabilitiesHandler0 = findWithCapabilities0.getHandler();
      assertNull(capabilitiesHandler0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[9];
      FileSystemHandling.shouldAllThrowIOExceptions();
      stringArray0[0] = "Header for relation-valued attribute should not contain any instances";
      stringArray0[1] = "-not-string-class";
      stringArray0[2] = "~.-&";
      stringArray0[3] = "nominal-atts";
      stringArray0[4] = " class that matched the criteria:\n";
      stringArray0[5] = ".M8)Xe";
      stringArray0[6] = "6M*=YDAtz+<[}";
      stringArray0[7] = "o}]>^ RzK$<y";
      stringArray0[8] = "class-values";
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
  public void test29()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.ONLY_MULTIINSTANCE;
      findWithCapabilities0.enable(capabilities_Capability0);
      findWithCapabilities0.getOptions();
      findWithCapabilities0.getRevision();
      findWithCapabilities0.disable(capabilities_Capability0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.MISSING_CLASS_VALUES;
      findWithCapabilities0.enableNot(capabilities_Capability0);
      String[] stringArray0 = findWithCapabilities0.getOptions();
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NO_CLASS;
      findWithCapabilities0.disable(capabilities_Capability0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-not-numeric-class";
      stringArray0[1] = "(";
      stringArray0[2] = "\"-MZ!";
      stringArray0[3] = "_N|~\"Ws)Hb|6Z)P50@";
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
  public void test32()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.m_GenericPropertiesCreator = false;
      findWithCapabilities0.setClassIndex("-1");
      assertEquals("", findWithCapabilities0.getFilename());
  }
}