/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 11:46:55 GMT 2019
 */

package weka.filters.unsupervised.attribute;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import weka.core.Attribute;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.ProtectedProperties;
import weka.filters.unsupervised.attribute.Discretize;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Discretize_ESTest extends Discretize_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      ArrayList<Locale.LanguageRange> arrayList1 = new ArrayList<Locale.LanguageRange>();
      Locale locale0 = Locale.ROOT;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) arrayList1, (Collection<String>) set0);
      Properties properties0 = new Properties();
      ProtectedProperties protectedProperties0 = new ProtectedProperties(properties0);
      Attribute attribute0 = new Attribute("", list0, protectedProperties0);
      arrayList0.add(attribute0);
      Attribute attribute1 = new Attribute("Upper bound (", 0);
      arrayList0.add(attribute1);
      Instances instances0 = new Instances("W_oIkQTIOzL", arrayList0, 627);
      discretize0.setInputFormat(instances0);
      discretize0.calculateCutPoints();
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setUseEqualFrequency(false);
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getMakeBinary());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Discretize discretize0 = new Discretize("?");
      discretize0.setUseBinNumbers(false);
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getFindNumBins());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Discretize discretize0 = new Discretize("#$pXLvqtEa");
      discretize0.setMakeBinary(false);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getFindNumBins());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Discretize discretize0 = new Discretize("#$pXLvqtEa");
      discretize0.setInvertSelection(false);
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getUseBinNumbers());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setDesiredWeightOfInstancesPerInterval((-805.1567087));
      assertEquals((-805.1567087), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Discretize discretize0 = new Discretize("   * @param instanceInfo the format of the data to convert\n");
      discretize0.getCutPoints(0);
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getFindNumBins());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Discretize discretize0 = new Discretize("}mcka{z+HpP|8");
      discretize0.getBinRangesString(62);
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.getBinRangesString((-2422));
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getFindNumBins());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      // Undeclared exception!
      try { 
        discretize0.setAttributeIndicesArray((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      // Undeclared exception!
      try { 
        discretize0.findNumBins((-1952257859));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      // Undeclared exception!
      try { 
        discretize0.calculateCutPointsByEqualWidthBinning((-585));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Discretize discretize0 = null;
      try {
        discretize0 = new Discretize((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.getCapabilities();
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getUseBinNumbers());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      String[] stringArray0 = discretize0.getOptions();
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(4, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Discretize discretize0 = new Discretize("}mcka{z+HpP|8");
      discretize0.listOptions();
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      boolean boolean0 = discretize0.getMakeBinary();
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(boolean0);
      assertEquals(10, discretize0.getBins());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Discretize discretize0 = new Discretize("GW^)jaMv7j!");
      discretize0.getAttributeIndices();
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      double double0 = discretize0.getDesiredWeightOfInstancesPerInterval();
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getFindNumBins());
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      boolean boolean0 = discretize0.getUseBinNumbers();
      assertEquals(10, discretize0.getBins());
      assertFalse(boolean0);
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getFindNumBins());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Discretize discretize0 = new Discretize("#$pXLvqtEa");
      discretize0.setDesiredWeightOfInstancesPerInterval(209.864957839);
      assertEquals(209.864957839, discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Discretize discretize0 = new Discretize("=:1=");
      discretize0.setBins(1030);
      assertEquals(1030, discretize0.getBins());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute("Upper bound (", 0);
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("W_oIkQTIOzL", arrayList0, 627);
      discretize0.setInputFormat(instances0);
      discretize0.batchFinished();
      // Undeclared exception!
      try { 
        discretize0.convertInstance((Instance) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute("Upper bound (", 0);
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("W_oIkQTIOzL", arrayList0, 627);
      discretize0.setInputFormat(instances0);
      discretize0.batchFinished();
      // Undeclared exception!
      try { 
        discretize0.convertInstance((Instance) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setOutputFormat();
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute("Upper bound (", 0);
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("W_oIkQTIOzL", arrayList0, 627);
      discretize0.setInputFormat(instances0);
      discretize0.setFindNumBins(true);
      discretize0.batchFinished();
      assertTrue(discretize0.getFindNumBins());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      ArrayList<Locale.LanguageRange> arrayList1 = new ArrayList<Locale.LanguageRange>();
      Locale locale0 = Locale.ROOT;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) arrayList1, (Collection<String>) set0);
      Properties properties0 = new Properties();
      ProtectedProperties protectedProperties0 = new ProtectedProperties(properties0);
      Attribute attribute0 = new Attribute("", list0, protectedProperties0);
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("W_oIkQTIOzL", arrayList0, 627);
      discretize0.setInputFormat(instances0);
      discretize0.calculateCutPoints();
      // Undeclared exception!
      try { 
        discretize0.calculateCutPointsByEqualWidthBinning(2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Discretize discretize0 = new Discretize("?");
      double[][] doubleArray0 = new double[3][0];
      double[] doubleArray1 = new double[2];
      doubleArray0[0] = doubleArray1;
      discretize0.m_CutPoints = doubleArray0;
      String string0 = discretize0.getBinRangesString(0);
      assertNotNull(string0);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals("(-inf-0],(0-0],(0-inf)", string0);
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals(10, discretize0.getBins());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Discretize discretize0 = new Discretize("?");
      double[][] doubleArray0 = new double[3][0];
      discretize0.m_CutPoints = doubleArray0;
      // Undeclared exception!
      try { 
        discretize0.getBinRangesString(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.getCutPoints((-2422));
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Discretize discretize0 = new Discretize("pVMl|2+c>");
      double[][] doubleArray0 = new double[2][1];
      discretize0.m_CutPoints = doubleArray0;
      // Undeclared exception!
      try { 
        discretize0.getCutPoints((-1582));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1582
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute("Upper bound (", 0);
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("W_oIkQTIOzL", arrayList0, 627);
      discretize0.setInputFormat(instances0);
      discretize0.calculateCutPoints();
      // Undeclared exception!
      try { 
        discretize0.batchFinished();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // No output instance format defined
         //
         verifyException("weka.filters.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      // Undeclared exception!
      try { 
        discretize0.batchFinished();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No input instance format defined
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      // Undeclared exception!
      try { 
        discretize0.input((Instance) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No input instance format defined
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setMakeBinary(true);
      try { 
        discretize0.setInputFormat((Instances) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      assertFalse(discretize0.getMakeBinary());
      
      discretize0.m_MakeBinary = true;
      discretize0.getCapabilities();
      assertTrue(discretize0.getMakeBinary());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setInvertSelection(true);
      String[] stringArray0 = discretize0.getOptions();
      assertEquals(7, stringArray0.length);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(10, discretize0.getBins());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      assertFalse(discretize0.getUseEqualFrequency());
      
      discretize0.setUseEqualFrequency(true);
      discretize0.getOptions();
      assertTrue(discretize0.getUseEqualFrequency());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      assertFalse(discretize0.getUseBinNumbers());
      
      discretize0.setUseBinNumbers(true);
      discretize0.getOptions();
      assertTrue(discretize0.getUseBinNumbers());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      assertFalse(discretize0.getMakeBinary());
      
      discretize0.m_MakeBinary = true;
      discretize0.getOptions();
      assertTrue(discretize0.getMakeBinary());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setIgnoreClass(true);
      String[] stringArray0 = discretize0.getOptions();
      assertEquals(7, stringArray0.length);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(10, discretize0.getBins());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      assertFalse(discretize0.getMakeBinary());
      
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute("Upper bound (", 0);
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("W_oIkQTIOzL", arrayList0, 627);
      boolean boolean0 = discretize0.setInputFormat(instances0);
      assertFalse(boolean0);
      
      String[] stringArray0 = new String[1];
      stringArray0[0] = "integer";
      discretize0.setOptions(stringArray0);
      assertFalse(discretize0.getFindNumBins());
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Discretize discretize0 = new Discretize("?");
      String[] stringArray0 = discretize0.getOptions();
      discretize0.setOptions(stringArray0);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(6, stringArray0.length);
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      String string0 = discretize0.invertSelectionTipText();
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals("Set attribute selection mode. If false, only selected (numeric) attributes in the range will be discretized; if true, only non-selected attributes will be discretized.", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Discretize discretize0 = new Discretize("#$pXLvqtEa");
      String string0 = discretize0.useEqualFrequencyTipText();
      assertEquals(10, discretize0.getBins());
      assertEquals("If set to true, equal-frequency binning will be used instead of equal-width binning.", string0);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      String string0 = discretize0.useBinNumbersTipText();
      assertEquals("Use bin numbers (eg BXofY) rather than ranges for for discretized attributes", string0);
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      String string0 = discretize0.globalInfo();
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals("An instance filter that discretizes a range of numeric attributes in the dataset into nominal attributes. Discretization is by simple binning. Skips the class attribute if set.", string0);
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseBinNumbers());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.binsTipText();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertEquals("Number of bins.", string0);
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getMakeBinary());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      String string0 = discretize0.makeBinaryTipText();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals("Make resulting attributes binary.", string0);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Discretize discretize0 = new Discretize("GW^)jaMv7j!");
      String string0 = discretize0.getRevision();
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals("8964", string0);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Discretize discretize0 = new Discretize("?");
      int[] intArray0 = new int[5];
      discretize0.setAttributeIndicesArray(intArray0);
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getFindNumBins());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      String string0 = discretize0.desiredWeightOfInstancesPerIntervalTipText();
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertEquals("Sets the desired weight of instances per interval for equal-frequency binning.", string0);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getFindNumBins());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      String string0 = discretize0.attributeIndicesTipText();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
      assertEquals("Specify range of attributes to act on. This is a comma separated list of attribute indices, with \"first\" and \"last\" valid values. Specify an inclusive range with \"-\". E.g: \"first-3,5,6-10,last\".", string0);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Discretize discretize0 = new Discretize("M");
      String string0 = discretize0.findNumBinsTipText();
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals("Optimize number of equal-width bins using leave-one-out. Doesn't work for equal-frequency binning", string0);
      assertFalse(discretize0.getUseBinNumbers());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "#$pXLvqtEa";
      stringArray0[1] = "#$pXLvqtEa";
      stringArray0[2] = "If set to true, equal-frequency binning will be used instead of equal-width binning.";
      stringArray0[3] = "If set to true, equal-frequency binning will be used instead of equal-width binning.";
      Discretize.main(stringArray0);
      assertEquals(4, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Discretize discretize0 = new Discretize("   * @param instanceInfo the format of the data to convert\n");
      discretize0.getInvertSelection();
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }
}
