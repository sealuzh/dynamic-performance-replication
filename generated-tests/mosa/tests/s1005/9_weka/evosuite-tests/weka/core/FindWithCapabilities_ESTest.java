/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 20:17:38 GMT 2018
 */

package weka.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Enumeration;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import weka.core.Capabilities;
import weka.core.CapabilitiesHandler;
import weka.core.FindWithCapabilities;
import weka.core.GlobalInfoJavadoc;
import weka.core.SingleIndex;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FindWithCapabilities_ESTest extends FindWithCapabilities_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FindWithCapabilities.main((String[]) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Vector<String> vector0 = findWithCapabilities0.getMisses();
      assertEquals(0, vector0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.BINARY_CLASS;
      findWithCapabilities0.enable(capabilities_Capability0);
      String[] stringArray0 = findWithCapabilities0.getOptions();
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.STRING_CLASS;
      findWithCapabilities0.enable(capabilities_Capability0);
      SingleIndex singleIndex0 = new SingleIndex();
      findWithCapabilities0.m_ClassIndex = singleIndex0;
      FindWithCapabilities findWithCapabilities1 = new FindWithCapabilities();
      CapabilitiesHandler capabilitiesHandler0 = findWithCapabilities1.m_Handler;
      findWithCapabilities0.m_Handler = null;
      Capabilities.Capability capabilities_Capability1 = Capabilities.Capability.NUMERIC_CLASS;
      findWithCapabilities0.isEnabledNot(capabilities_Capability1);
      Capabilities.Capability capabilities_Capability2 = Capabilities.Capability.MISSING_CLASS_VALUES;
      findWithCapabilities0.enable(capabilities_Capability2);
      String[] stringArray0 = new String[3];
      findWithCapabilities1.m_Superclass = "-relational-atts";
      stringArray0[0] = " Options:\n\n";
      stringArray0[1] = "(6(-TQ$km=pO";
      stringArray0[2] = "t-(]VeySV`4T*daz^";
      SingleIndex.main(stringArray0);
      Capabilities capabilities0 = findWithCapabilities1.m_NotCapabilities;
      findWithCapabilities0.setCapabilities(capabilities0);
      Capabilities.Capability capabilities_Capability3 = Capabilities.Capability.NOMINAL_CLASS;
      findWithCapabilities0.enable(capabilities_Capability3);
      Capabilities.Capability capabilities_Capability4 = Capabilities.Capability.NUMERIC_CLASS;
      findWithCapabilities1.disable(capabilities_Capability4);
      findWithCapabilities1.m_NotCapabilities = capabilities0;
      findWithCapabilities0.getMatches();
      findWithCapabilities0.find();
      findWithCapabilities1.enable(capabilities_Capability3);
      findWithCapabilities0.getOptions();
      findWithCapabilities0.setFilename("weka/core/Capabilities.props");
      // Undeclared exception!
      try { 
        findWithCapabilities1.getClassIndex();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No index set
         //
         verifyException("weka.core.SingleIndex", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NOMINAL_ATTRIBUTES;
      boolean boolean0 = findWithCapabilities0.handles(capabilities_Capability0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "Q'q{UtSKJ2";
      stringArray0[1] = "-not-date-class";
      stringArray0[2] = "|jEZC";
      stringArray0[3] = "X;5b,a.hu!1d$";
      FindWithCapabilities.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.m_Superclass = "-date";
      findWithCapabilities0.getOptions();
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.setFilename("8034");
      findWithCapabilities0.getOptions();
      assertEquals("8034", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-unary-class";
      stringArray0[1] = "-unary-class";
      stringArray0[2] = "-unary-class";
      stringArray0[3] = "-unary-class";
      stringArray0[4] = "(9?~^[aGnw+Z4fl";
      stringArray0[5] = "we1PN";
      FindWithCapabilities.main(stringArray0);
      findWithCapabilities0.getMatches();
      Enumeration enumeration0 = findWithCapabilities0.listOptions();
      assertNotNull(enumeration0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.setClassIndex("-1");
      String string0 = GlobalInfoJavadoc.GLOBALINFO_ENDTAG;
      String[] stringArray0 = new String[5];
      stringArray0[0] = "<!-- globalinfo-end -->";
      stringArray0[1] = "<!-- globalinfo-end -->";
      stringArray0[2] = "-1";
      stringArray0[3] = "-1";
      stringArray0[4] = "-1";
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
  public void test11()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.getRevision();
      findWithCapabilities0.setHandler(findWithCapabilities0);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "QJZLpFV&Kyo";
      stringArray0[1] = "4lw`c";
      stringArray0[2] = " Options:\n\n";
      stringArray0[3] = "-W <classname>";
      stringArray0[4] = "-string-class";
      stringArray0[5] = "";
      stringArray0[6] = "";
      FindWithCapabilities.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-unary-atts";
      stringArray0[1] = "-unary-atts";
      FindWithCapabilities.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[5];
      stringArray0[0] = " appears to be missing.";
      stringArray0[1] = "";
      stringArray0[2] = "}zewBwnhLjL,K?aUF";
      stringArray0[3] = "$Revision:";
      stringArray0[4] = "-not-relational-atts";
      FindWithCapabilities.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NOMINAL_CLASS;
      findWithCapabilities0.enableNot(capabilities_Capability0);
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
  public void test15()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "C";
      stringArray0[1] = "-WD=ggghq{Oqa";
      stringArray0[2] = "-not-string-class";
      stringArray0[3] = "\nFound ";
      FindWithCapabilities.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "OnR9^eXZ)&e`";
      stringArray0[1] = " because it is not compatible with Weka ";
      stringArray0[2] = ") on numeric range is";
      stringArray0[3] = "";
      stringArray0[4] = " appears to be missing.";
      stringArray0[5] = "-not-missing-class-values";
      stringArray0[6] = "-not-string-class";
      stringArray0[7] = "9Kgwt52zoJ4";
      FindWithCapabilities.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-not-string-atts";
      stringArray0[1] = "vwz[(c";
      FindWithCapabilities.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities capabilities0 = findWithCapabilities0.getNotCapabilities();
      findWithCapabilities0.setNotCapabilities(capabilities0);
      findWithCapabilities0.setHandler(findWithCapabilities0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "vCJMJen'";
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      stringArray0[1] = "}CIOZ.S";
      stringArray0[2] = "::M;+ap";
      stringArray0[3] = "-not-missing-att-values";
      FindWithCapabilities.main(stringArray0);
      findWithCapabilities0.setCapabilities(capabilities0);
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.RELATIONAL_CLASS;
      findWithCapabilities0.disableNot(capabilities_Capability0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-class-type <num>";
      stringArray0[1] = "^alS^589|!t5B15Bt";
      stringArray0[2] = "-not-nominal-atts";
      stringArray0[3] = "l>C%a1q[mJb%+#O";
      stringArray0[4] = "UxlH$hT2}z";
      stringArray0[5] = "???";
      stringArray0[6] = "\tComma-separated list of packages to search in.";
      FindWithCapabilities.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.STRING_CLASS;
      findWithCapabilities0.enableNot(capabilities_Capability0);
      String[] stringArray0 = findWithCapabilities0.getOptions();
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-not-binary-atts";
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
  public void test22()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Vector<String> vector0 = findWithCapabilities0.getMatches();
      findWithCapabilities0.m_Misses = vector0;
      findWithCapabilities0.setHandler(findWithCapabilities0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "dHs~3";
      stringArray0[1] = "-relational-class";
      FindWithCapabilities.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "}pkBRX[7Y5) *&&2";
      stringArray0[1] = "_3S%xZ`\"+z_X";
      stringArray0[2] = "-no-class";
      stringArray0[3] = "_3S%xZ`\"+z_X";
      stringArray0[4] = "Qea)";
      stringArray0[5] = "A zeropoint attribute must be regular";
      stringArray0[6] = "Xfq9l3F";
      FindWithCapabilities.main(stringArray0);
      // Undeclared exception!
      try { 
        findWithCapabilities0.setNotCapabilities((Capabilities) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.FindWithCapabilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      FindWithCapabilities findWithCapabilities1 = new FindWithCapabilities();
      findWithCapabilities1.setHandler(findWithCapabilities0);
      String[] stringArray0 = findWithCapabilities1.getOptions();
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = findWithCapabilities0.getOptions();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.ONLY_MULTIINSTANCE;
      findWithCapabilities0.enable(capabilities_Capability0);
      String[] stringArray1 = findWithCapabilities0.getOptions();
      assertNotSame(stringArray1, stringArray0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      FindWithCapabilities findWithCapabilities1 = new FindWithCapabilities();
      findWithCapabilities1.setHandler(findWithCapabilities0);
      FindWithCapabilities findWithCapabilities2 = new FindWithCapabilities();
      findWithCapabilities2.getNotCapabilities();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-not-relational-class";
      stringArray0[1] = "weka/core/Capabilities.props";
      stringArray0[2] = "weka/core/Capabilities.props";
      stringArray0[3] = "weka/core/Capabilities.props";
      stringArray0[4] = "weka/core/Capabilities.props";
      stringArray0[5] = "weka/core/Capabilities.props";
      stringArray0[6] = "weka/core/Capabilities.props";
      stringArray0[7] = "?L";
      FindWithCapabilities.main(stringArray0);
      findWithCapabilities1.listOptions();
      findWithCapabilities2.setFilename("?L");
      assertEquals("?L", findWithCapabilities2.getFilename());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[5];
      stringArray0[0] = " classes that matched the criteria:\n";
      stringArray0[1] = ".w30le>mll~";
      stringArray0[2] = " because it is not compatible with Weka ";
      stringArray0[3] = "-string-atts";
      stringArray0[4] = "\tComma-separated list of packages to search in.";
      FindWithCapabilities.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.MISSING_CLASS_VALUES;
      findWithCapabilities0.enableNot(capabilities_Capability0);
      findWithCapabilities0.find();
      String[] stringArray0 = findWithCapabilities0.getOptions();
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "BDN7dbaoG";
      stringArray0[1] = "^";
      stringArray0[2] = "ZwZ#TCMSD";
      stringArray0[3] = "-binary-class";
      stringArray0[4] = "not-numeric-atts";
      FindWithCapabilities.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "aPF/@q:cK&j4~58Bu~>";
      stringArray0[2] = "-nominal-atts";
      stringArray0[3] = ")x.:&b2v_";
      stringArray0[4] = "";
      stringArray0[5] = "vwz[(c";
      stringArray0[6] = "-WD=ggghq{Oqa";
      findWithCapabilities0.m_Filename = "-nominal-atts";
      FindWithCapabilities.main(stringArray0);
      Enumeration enumeration0 = findWithCapabilities0.listOptions();
      assertNotNull(enumeration0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      FindWithCapabilities findWithCapabilities1 = new FindWithCapabilities();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "'QHg9y]8;5S)";
      stringArray0[1] = "\tMust handle unray classes.";
      stringArray0[2] = "<4s^YxP[,%1.#txa";
      stringArray0[3] = "x@1S?ZDw.|y$F*";
      stringArray0[4] = "-missing-att-values";
      stringArray0[5] = "\\";
      stringArray0[6] = "y";
      stringArray0[7] = "<!-- technical-bibtex-end -->";
      stringArray0[8] = "jU-P_k)U";
      FindWithCapabilities.main(stringArray0);
      Vector<String> vector0 = findWithCapabilities1.find();
      assertEquals(10, vector0.capacity());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.find();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NUMERIC_ATTRIBUTES;
      findWithCapabilities0.enableNot(capabilities_Capability0);
      String[] stringArray0 = findWithCapabilities0.getOptions();
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "}J,E'V";
      stringArray0[1] = "cp[#cp7PW:7";
      stringArray0[2] = "-only-multiinstance";
      stringArray0[3] = "F'DuofGyb1&mn{(";
      stringArray0[4] = "cp[#cp7PW:7";
      stringArray0[5] = "t|X~5}d`DoD;N2t";
      stringArray0[6] = "|jEZC";
      stringArray0[7] = "cp[#cp7PW:7";
      FindWithCapabilities.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-binary-atts";
      stringArray0[1] = "\nUsage:\n\tweka.core.Instances help\n\t\tPrints this help\n\tweka.core.Instances <filename>\n\t\tOutputs dataset statistics\n\tweka.core.Instances merge <filename1> <filename2>\n\t\tMerges the datasets (must have same number of rows).\n\t\tGenerated dataset gets output on stdout.\n\tweka.core.Instances append <filename1> <filename2>\n\t\tAppends the second dataset to the first (must have same number of attributes).\n\t\tGenerated dataset gets output on stdout.\n\tweka.core.Instances headers <filename1> <filename2>\n\t\tCompares the structure of the two datasets and outputs whether they\n\t\tdiffer or not.\n\tweka.core.Instances randomize <seed> <filename>\n\t\tRandomizes the dataset and outputs it on stdout.\n";
      stringArray0[2] = ")dpE@gi]TZt(9Jz0";
      stringArray0[3] = "";
      FindWithCapabilities.main(stringArray0);
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
  public void test35()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-not-numeric-atts";
      FindWithCapabilities.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "(u\"N}bjxk";
      stringArray0[1] = "r%e_-w5<Rq";
      stringArray0[2] = "-not-date-atts";
      stringArray0[3] = "-not-date-atts";
      stringArray0[4] = "<]*.tNg";
      stringArray0[5] = "(u\"N}bjxk";
      stringArray0[6] = "- not allowed: ";
      FindWithCapabilities.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-not-no-class";
      stringArray0[1] = "D;:~G{1IPv";
      stringArray0[2] = "e%(lL%y0~58";
      stringArray0[3] = "'`fG>Fdz~d}\"[j~";
      stringArray0[4] = "8]8ptNMF)e";
      stringArray0[5] = "8034";
      stringArray0[6] = "qg+DMF`sYXc&PEYG>";
      stringArray0[7] = "dHs~3";
      stringArray0[8] = "-YLd`.$|Xd,g!";
      FindWithCapabilities.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NUMERIC_CLASS;
      findWithCapabilities0.enableNot(capabilities_Capability0);
      findWithCapabilities0.getOptions();
      Random.setNextRandom((-211));
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "j*j@l,K-JR0-6=tbO";
      stringArray0[1] = "-c";
      stringArray0[2] = "{)sOx<D&vA;zb2#x!c";
      stringArray0[3] = "CN'cnZ4";
      stringArray0[4] = "(yAy`mY\"4(Qz.d.#";
      stringArray0[5] = "Jl!A:X73`|d(7|%?Sd";
      FindWithCapabilities.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NOMINAL_CLASS;
      String[] stringArray0 = new String[6];
      stringArray0[0] = "%m";
      stringArray0[1] = "qd}#2z'}5o";
      stringArray0[2] = "ln+mGaz";
      stringArray0[3] = "1gb=qrKiE";
      stringArray0[4] = "-not-string-class";
      stringArray0[5] = "-relational-atts";
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
  public void test41()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "94D&8h:u";
      stringArray0[1] = "c";
      stringArray0[2] = "-numeric-class";
      stringArray0[3] = "}-z7~W~v52g(#6D-";
      FindWithCapabilities.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-nominal-class";
      stringArray0[1] = "not-unary-atts";
      stringArray0[2] = "6!A";
      stringArray0[3] = "{\u0002!TPxsC!.w5cE*9x";
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
}