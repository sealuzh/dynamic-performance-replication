/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 12:37:32 GMT 2019
 */

package weka.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Enumeration;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import weka.core.Capabilities;
import weka.core.CapabilitiesHandler;
import weka.core.FindWithCapabilities;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FindWithCapabilities_ESTest extends FindWithCapabilities_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities capabilities0 = findWithCapabilities0.getNotCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.BINARY_ATTRIBUTES;
      capabilities0.enableAll();
      boolean boolean0 = findWithCapabilities0.isEnabledNot(capabilities_Capability0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.DATE_CLASS;
      findWithCapabilities0.enable(capabilities_Capability0);
      boolean boolean0 = findWithCapabilities0.isEnabled(capabilities_Capability0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NOMINAL_CLASS;
      findWithCapabilities0.enable(capabilities_Capability0);
      boolean boolean0 = findWithCapabilities0.handles(capabilities_Capability0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities capabilities0 = findWithCapabilities0.getNotCapabilities();
      capabilities0.enableAll();
      Capabilities capabilities1 = findWithCapabilities0.getNotCapabilities();
      assertTrue(capabilities1.hasDependencies());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.setHandler(findWithCapabilities0);
      CapabilitiesHandler capabilitiesHandler0 = findWithCapabilities0.getHandler();
      assertSame(findWithCapabilities0, capabilitiesHandler0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.m_Filename = "e~%C\"]m<h0?";
      findWithCapabilities0.getFilename();
      assertEquals("e~%C\"]m<h0?", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[0];
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
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.ONLY_MULTIINSTANCE;
      boolean boolean0 = findWithCapabilities0.isEnabledNot(capabilities_Capability0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.UNARY_CLASS;
      boolean boolean0 = findWithCapabilities0.isEnabledNot(capabilities_Capability0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.RELATIONAL_ATTRIBUTES;
      boolean boolean0 = findWithCapabilities0.isEnabled(capabilities_Capability0);
      assertFalse(boolean0);
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
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.ONLY_MULTIINSTANCE;
      findWithCapabilities0.enableNot(capabilities_Capability0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.DATE_ATTRIBUTES;
      findWithCapabilities0.enableNot(capabilities_Capability0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.BINARY_CLASS;
      findWithCapabilities0.disableNot(capabilities_Capability0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.MISSING_VALUES;
      findWithCapabilities0.disableNot(capabilities_Capability0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.STRING_CLASS;
      findWithCapabilities0.disable(capabilities_Capability0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Vector<String> vector0 = findWithCapabilities0.find();
      assertEquals(10, vector0.capacity());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.setFilename("");
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities capabilities0 = findWithCapabilities0.getCapabilities();
      assertFalse(capabilities0.hasDependencies());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Enumeration enumeration0 = findWithCapabilities0.listOptions();
      assertNotNull(enumeration0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      CapabilitiesHandler capabilitiesHandler0 = findWithCapabilities0.getHandler();
      assertNull(capabilitiesHandler0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String string0 = findWithCapabilities0.getFilename();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.DATE_CLASS;
      findWithCapabilities0.m_Superclass = "P5b7";
      findWithCapabilities0.enableNot(capabilities_Capability0);
      String[] stringArray0 = findWithCapabilities0.getOptions();
      FindWithCapabilities.main(stringArray0);
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.m_Superclass = "Od5qx)i";
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.UNARY_ATTRIBUTES;
      findWithCapabilities0.enable(capabilities_Capability0);
      String[] stringArray0 = findWithCapabilities0.getOptions();
      FindWithCapabilities.main(stringArray0);
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.m_Superclass = "Od5qx)i";
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NUMERIC_CLASS;
      findWithCapabilities0.enable(capabilities_Capability0);
      String[] stringArray0 = findWithCapabilities0.getOptions();
      FindWithCapabilities.main(stringArray0);
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.m_ClassIndex = null;
      String string0 = findWithCapabilities0.getClassIndex();
      assertEquals("-1", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
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
  public void test27()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.setClassIndex("-1");
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.ONLY_MULTIINSTANCE;
      findWithCapabilities0.enable(capabilities_Capability0);
      String[] stringArray0 = findWithCapabilities0.getOptions();
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities capabilities0 = new Capabilities(findWithCapabilities0);
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NO_CLASS;
      capabilities0.enable(capabilities_Capability0);
      findWithCapabilities0.setNotCapabilities(capabilities0);
      String[] stringArray0 = findWithCapabilities0.getOptions();
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities capabilities0 = findWithCapabilities0.getNotCapabilities();
      findWithCapabilities0.m_Capabilities = capabilities0;
      capabilities0.enableAll();
      String[] stringArray0 = findWithCapabilities0.getOptions();
      assertEquals(36, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-only-multiinstance";
      stringArray0[1] = "-only-multiinstance";
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
      String[] stringArray0 = new String[9];
      stringArray0[0] = "MV<";
      stringArray0[1] = "Tj[Nnn";
      stringArray0[2] = "mL/";
      stringArray0[3] = "[Q:}#iM\",^}";
      stringArray0[4] = "Usage: java weka.core.Environment <string> <string> ...";
      stringArray0[5] = "yi{,Z1!s";
      stringArray0[6] = "-not-missing-att-values";
      stringArray0[7] = "First option split up:";
      stringArray0[8] = "-generic";
      FindWithCapabilities.main(stringArray0);
      assertEquals(9, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "d\"uQ5S[";
      stringArray0[1] = ".|6_zG=TOfbUA]";
      stringArray0[2] = "-not-relational-atts";
      stringArray0[3] = "l;[q2S~8{1Zn8ix5VQ";
      stringArray0[4] = "qV/SW";
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
  public void test34()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-not-date-atts";
      stringArray0[1] = "-not-date-atts";
      stringArray0[2] = "-not-date-atts";
      stringArray0[3] = "-not-date-atts";
      stringArray0[4] = "-not-date-atts";
      stringArray0[5] = "\tMust handle binary classes.";
      stringArray0[6] = "-not-date-atts";
      stringArray0[7] = "-not-date-atts";
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
  public void test35()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-not-string-atts";
      stringArray0[1] = "{Ja|+UeP8j-`W`@qU1q";
      stringArray0[2] = "";
      stringArray0[3] = "-misses";
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
  public void test36()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "second";
      stringArray0[1] = "packages";
      stringArray0[2] = "last";
      stringArray0[3] = ",a+ric2e?,1X";
      stringArray0[4] = "-not-numeric-atts";
      stringArray0[5] = "'grA$KaT^tXE<fyi";
      FindWithCapabilities.main(stringArray0);
      assertEquals(6, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "";
      stringArray0[1] = ". instance";
      stringArray0[2] = "s}5fO";
      stringArray0[3] = "org.pentaho.packageManagement.Package";
      stringArray0[4] = "-not-unary-atts";
      stringArray0[5] = "CA0WcZ%PXE";
      stringArray0[6] = "-ignored <comma-separated list of properties>";
      stringArray0[7] = "8m c-=p";
      stringArray0[8] = "r:l@T4 E\"]";
      FindWithCapabilities.main(stringArray0);
      assertEquals(9, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "Um$K}n";
      stringArray0[1] = "-not-binary-atts";
      stringArray0[2] = "u+E@r}AcSOx.sNvXN[";
      stringArray0[3] = "ff1dRX[[sS'*x";
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
  public void test39()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-missing-att-values";
      stringArray0[1] = "-1";
      stringArray0[2] = "^91A=YBJ_G";
      stringArray0[3] = "relational-nominal-values";
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
  public void test40()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.RELATIONAL_ATTRIBUTES;
      findWithCapabilities0.enable(capabilities_Capability0);
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
  public void test41()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-date-atts";
      stringArray0[1] = ":]&%5|";
      stringArray0[2] = "";
      stringArray0[3] = "string-class";
      stringArray0[4] = ":QyD<TY_aO";
      stringArray0[5] = "qV/SW";
      stringArray0[6] = "Current weight of instance copy: ";
      stringArray0[7] = "e<nw~mE#RO";
      stringArray0[8] = "date-class";
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
  public void test42()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.STRING_ATTRIBUTES;
      findWithCapabilities0.enable(capabilities_Capability0);
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
  public void test43()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "l|zj2XY2>B;,|>8!";
      stringArray0[1] = "weka/core/Capabilities.props";
      stringArray0[2] = "x";
      stringArray0[3] = "@/4p\"$-4";
      stringArray0[4] = "-numeric-atts";
      stringArray0[5] = "rTG";
      stringArray0[6] = "-misses";
      FindWithCapabilities.main(stringArray0);
      assertEquals(7, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.BINARY_ATTRIBUTES;
      findWithCapabilities0.enable(capabilities_Capability0);
      String[] stringArray0 = findWithCapabilities0.getOptions();
      FindWithCapabilities.main(stringArray0);
      assertEquals(6, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-nominal-atts";
      stringArray0[1] = "p5[YBO<ZN H%=`)xB?";
      stringArray0[2] = "rP";
      stringArray0[3] = "<NaiO(+}C2+A";
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
  public void test46()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      stringArray0[1] = "_|9G>c";
      stringArray0[2] = "";
      stringArray0[3] = "Z.I`:,MA";
      stringArray0[4] = "Z.I`:,MA";
      stringArray0[5] = "^Bg_@w-XY{,/)H-";
      stringArray0[6] = "-not-missing-class-values";
      stringArray0[7] = "L9W5qk,:";
      FindWithCapabilities.main(stringArray0);
      assertEquals(8, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-not-relational-class";
      stringArray0[1] = "-not-nominal-atts";
      stringArray0[2] = "-not-relational-class";
      stringArray0[3] = "6]^g3 }c/iG1,";
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
  public void test48()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "weka.core.SingleIndex";
      stringArray0[1] = "Value of position for copy: ";
      stringArray0[2] = "nl&Oq";
      stringArray0[3] = ".Q>Aj.OOEyz=\">";
      stringArray0[4] = "BxToA)XeYP9xH4T";
      stringArray0[5] = "k-p&>Wq8>FS";
      stringArray0[6] = "-not-string-class";
      stringArray0[7] = "Can't set relational value. Headers not compatible.\n";
      FindWithCapabilities.main(stringArray0);
      assertEquals(8, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "\tMust handle nominal classes.";
      stringArray0[1] = "sfs,gQ-WW@";
      stringArray0[2] = "-not-numeric-class";
      FindWithCapabilities.main(stringArray0);
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "weka/core/Capabilities.props";
      stringArray0[1] = "-not-unary-class";
      stringArray0[2] = "weka/core/Capabilities.props";
      stringArray0[3] = "8Hl(1t";
      stringArray0[4] = "-not-unary-class";
      stringArray0[5] = "-not-unary-class";
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
  public void test51()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[8];
      stringArray0[0] = " classes that matched the criteria:\n";
      stringArray0[1] = "gqg\" KOoN[@rPO:";
      stringArray0[2] = "*mdS)fO5eT&R";
      stringArray0[3] = "-not-binary-class";
      stringArray0[4] = "<E-A_}";
      stringArray0[5] = "J;cNsKsh[KOR6<Zi;IC";
      stringArray0[6] = "yIA@O*,EX2*MG^zge";
      stringArray0[7] = "[)MCg00jU8I-{Z";
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
  public void test52()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "not-relational-atts";
      stringArray0[1] = "]ZuW_N90f0c[N5KWYZ>";
      stringArray0[2] = "}@X;-\"C[y-1x8Vtb";
      stringArray0[3] = "|iaSbB<*DMx>{";
      stringArray0[4] = "!r&uxP/";
      stringArray0[5] = "Ib8";
      stringArray0[6] = "0";
      stringArray0[7] = "-not-nominal-class";
      stringArray0[8] = "d";
      FindWithCapabilities.main(stringArray0);
      assertEquals(9, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "=SdpCILg5SN`0/]";
      stringArray0[1] = "-relational-nominal-values <num>";
      stringArray0[2] = "kVd!<";
      stringArray0[3] = "&6)";
      stringArray0[4] = "H<]p}Qo";
      stringArray0[5] = "-missing-class-values";
      stringArray0[6] = "X'av6oib V";
      FindWithCapabilities.main(stringArray0);
      assertEquals(7, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "qh";
      stringArray0[1] = "hW8.#!(9]nxR&VqvpI";
      stringArray0[2] = "-date-class";
      stringArray0[3] = "_@kUA o1Axd#??";
      stringArray0[4] = "t";
      stringArray0[5] = "TB>8'!}!0";
      stringArray0[6] = "C=){\u0005ZE~P+VY7l{";
      stringArray0[7] = "Normalized again (doubles): ";
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
  public void test55()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "C:e7";
      stringArray0[1] = "-string-class";
      stringArray0[2] = "\tThe index of the class attribute, -1 for none.\n\t'first' and 'last' are also valid.\n\tOnly in conjunction with option '-t'.";
      stringArray0[3] = "images.txt";
      stringArray0[4] = "\tThe number of values for nominal attributes (default 2).";
      FindWithCapabilities.main(stringArray0);
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "&(Pz";
      stringArray0[1] = "relational-class";
      stringArray0[2] = "-numeric-class";
      stringArray0[3] = "c";
      stringArray0[4] = "string-class";
      stringArray0[5] = "8F^CrpTQ=cX8";
      stringArray0[6] = "tch";
      stringArray0[7] = "VQEWF*tYE";
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
  public void test57()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "w]{chNCu";
      stringArray0[1] = ";,R+a";
      stringArray0[2] = "2Lm0A.xhHjI";
      stringArray0[3] = "-unary-class";
      stringArray0[4] = "FevV'*zC_u";
      stringArray0[5] = "$Revision:";
      stringArray0[6] = "6]^g3 }c/iG1,";
      stringArray0[7] = "Z?Dh,=jhN";
      stringArray0[8] = "StP1C2SHy.";
      FindWithCapabilities.main(stringArray0);
      assertEquals(9, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NOMINAL_CLASS;
      findWithCapabilities0.enable(capabilities_Capability0);
      String[] stringArray0 = findWithCapabilities0.getOptions();
      FindWithCapabilities.main(stringArray0);
      assertEquals(6, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "MEjNWpgW";
      stringArray0[1] = "FINEST";
      stringArray0[2] = "jX9@<,3";
      stringArray0[3] = "-not-no-class";
      FindWithCapabilities.main(stringArray0);
      assertEquals(4, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "H=`wAbBlP ;:88>";
      stringArray0[1] = "4\"G6gF>'LBc ";
      stringArray0[2] = "-no-class";
      stringArray0[3] = "-&,Q*ZEuO";
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
  public void test61()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "not-relational-class";
      stringArray0[1] = "'-b4^";
      stringArray0[2] = "DFOZu";
      stringArray0[3] = "-binary-class";
      stringArray0[4] = "jzDu%DkJb|U+{-~";
      stringArray0[5] = ")E8e7i'B+1nek(iTt";
      stringArray0[6] = "Att:";
      stringArray0[7] = "f\"*\" rsRX`";
      stringArray0[8] = "-relational-class";
      FindWithCapabilities.main(stringArray0);
      assertEquals(9, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.setClassIndex("fbLIg/pHx}Z5=I;Kda");
      findWithCapabilities0.setFilename("]rxo");
      String[] stringArray0 = findWithCapabilities0.getOptions();
      FindWithCapabilities.main(stringArray0);
      assertEquals("]rxo", findWithCapabilities0.getFilename());
      assertEquals(8, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      FindWithCapabilities findWithCapabilities1 = new FindWithCapabilities();
      findWithCapabilities0.setHandler(findWithCapabilities1);
      String[] stringArray0 = findWithCapabilities0.getOptions();
      FindWithCapabilities.main(stringArray0);
      assertEquals(11, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities capabilities0 = findWithCapabilities0.getNotCapabilities();
      findWithCapabilities0.setCapabilities(capabilities0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String string0 = findWithCapabilities0.getRevision();
      assertEquals("8034", string0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NO_CLASS;
      findWithCapabilities0.enable(capabilities_Capability0);
      String[] stringArray0 = findWithCapabilities0.getOptions();
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.DATE_ATTRIBUTES;
      findWithCapabilities0.disableNot(capabilities_Capability0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.UNARY_ATTRIBUTES;
      findWithCapabilities0.disable(capabilities_Capability0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Vector<String> vector0 = findWithCapabilities0.getMisses();
      assertTrue(vector0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Vector<String> vector0 = findWithCapabilities0.getMatches();
      vector0.add("</bD5>[&:9.[1%");
      Vector<String> vector1 = findWithCapabilities0.getMatches();
      assertEquals("[</bD5>[&:9.[1%]", vector1.toString());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
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
}
