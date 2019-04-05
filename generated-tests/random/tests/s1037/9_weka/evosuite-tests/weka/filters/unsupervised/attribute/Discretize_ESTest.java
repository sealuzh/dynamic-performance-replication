/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 16:04:56 GMT 2019
 */

package weka.filters.unsupervised.attribute;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.Properties;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import weka.core.Attribute;
import weka.core.BinarySparseInstance;
import weka.core.Instances;
import weka.core.ProtectedProperties;
import weka.core.SparseInstance;
import weka.filters.unsupervised.attribute.Discretize;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Discretize_ESTest extends Discretize_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      assertFalse(discretize0.getMakeBinary());
      
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Properties properties0 = new Properties();
      ProtectedProperties protectedProperties0 = new ProtectedProperties(properties0);
      Attribute attribute0 = new Attribute("Set attribute selection mode. If false, only selected (numeric) attributes in the range will be discretized; if true, only non-selected attributes will be discretized.", protectedProperties0);
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("-Y", arrayList0, 113);
      boolean boolean0 = discretize0.setInputFormat(instances0);
      assertFalse(boolean0);
      
      String[] stringArray0 = new String[9];
      stringArray0[0] = "weka/core/Capabilities.props";
      stringArray0[1] = "numeric";
      stringArray0[2] = ".arff";
      stringArray0[3] = "relational";
      arrayList0.add(attribute0);
      stringArray0[4] = "weka/core/Capabilities.props";
      stringArray0[5] = "@end";
      stringArray0[6] = "@attribute";
      stringArray0[7] = "-M <num>";
      stringArray0[8] = ".bsi";
      discretize0.setOptions(stringArray0);
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      assertFalse(discretize0.getMakeBinary());
      
      discretize0.setMakeBinary(true);
      boolean boolean0 = discretize0.getMakeBinary();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setAttributeIndices("");
      String string0 = discretize0.getAttributeIndices();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      assertFalse(discretize0.getUseEqualFrequency());
      
      discretize0.setUseEqualFrequency(true);
      assertTrue(discretize0.getUseEqualFrequency());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Discretize discretize0 = new Discretize(".4*cI&");
      discretize0.setUseBinNumbers(false);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseBinNumbers());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Discretize discretize0 = new Discretize("]");
      discretize0.setInvertSelection(false);
      assertFalse(discretize0.getFindNumBins());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getUseBinNumbers());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Discretize discretize0 = new Discretize("org.pentaho.packageManager.manager");
      discretize0.setFindNumBins(false);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      
      discretize0.setDesiredWeightOfInstancesPerInterval(0.0);
      assertEquals(0.0, discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Discretize discretize0 = new Discretize("]");
      discretize0.setDesiredWeightOfInstancesPerInterval((-810.0244189884938));
      assertEquals((-810.0244189884938), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setBins((-2049870752));
      assertEquals((-2049870752), discretize0.getBins());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Discretize discretize0 = new Discretize("a/UJ)hBa");
      int[] intArray0 = new int[0];
      discretize0.setAttributeIndicesArray(intArray0);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getFindNumBins());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Discretize discretize0 = new Discretize("If set to true, equal-frequency binning will be used instead of equal-width binning.");
      discretize0.setAttributeIndices("If set to true, equal-frequency binning will be used instead of equal-width binning.");
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getFindNumBins());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.getCutPoints(0);
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getMakeBinary());
      assertEquals(10, discretize0.getBins());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.getBinRangesString(0);
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getUseBinNumbers());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Discretize discretize0 = new Discretize(",d,)0f{:*<{^^%<|");
      discretize0.getBinRangesString((-2134546997));
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      // Undeclared exception!
      try { 
        discretize0.findNumBins((-1343));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      // Undeclared exception!
      try { 
        discretize0.calculateCutPointsByEqualFrequencyBinning(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Instances", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Discretize discretize0 = new Discretize("If set to true, equal-frequency binning will be used instead of equal-width binning.");
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("", arrayList0, 1);
      try { 
        discretize0.setInputFormat(instances0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // weka.filters.unsupervised.attribute.Discretize: No attributes!
         //
         verifyException("weka.core.Capabilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      // Undeclared exception!
      try { 
        discretize0.findNumBins(944);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Discretize discretize0 = new Discretize("Fb%1");
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(1645);
      // Undeclared exception!
      try { 
        discretize0.convertInstance(binarySparseInstance0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Discretize discretize0 = new Discretize("weka.experiment.Stats");
      // Undeclared exception!
      try { 
        discretize0.calculateCutPointsByEqualWidthBinning(91);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Discretize discretize0 = new Discretize(" 3`x;x?{)");
      // Undeclared exception!
      try { 
        discretize0.calculateCutPoints();
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
  public void test24()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.getCapabilities();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Discretize discretize0 = new Discretize("A8~MN0");
      discretize0.listOptions();
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Discretize discretize0 = new Discretize("org.pentaho.packageManager.manager");
      boolean boolean0 = discretize0.getUseEqualFrequency();
      assertFalse(boolean0);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getFindNumBins());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      boolean boolean0 = discretize0.getMakeBinary();
      assertFalse(discretize0.getFindNumBins());
      assertEquals(10, discretize0.getBins());
      assertFalse(boolean0);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getUseBinNumbers());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Discretize discretize0 = new Discretize("A8~MN0");
      discretize0.getAttributeIndices();
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      boolean boolean0 = discretize0.getFindNumBins();
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(boolean0);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setDesiredWeightOfInstancesPerInterval(1.0E-6);
      assertEquals(1.0E-6, discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setBins(68);
      assertEquals(68, discretize0.getBins());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.getInvertSelection();
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getUseBinNumbers());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      assertFalse(discretize0.getUseBinNumbers());
      
      discretize0.setUseBinNumbers(true);
      assertTrue(discretize0.getUseBinNumbers());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Discretize discretize0 = new Discretize("A8~MN0");
      discretize0.setUseEqualFrequency(false);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setOutputFormat();
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getUseBinNumbers());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Properties properties0 = new Properties();
      ProtectedProperties protectedProperties0 = new ProtectedProperties(properties0);
      Attribute attribute0 = new Attribute("Set attribute selection mode. If false, only selected (numeric) attributes in the range will be discretized; if true, only non-selected attributes will be discretized.", protectedProperties0);
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("-Y", arrayList0, 113);
      discretize0.setInputFormat(instances0);
      // Undeclared exception!
      try { 
        discretize0.calculateCutPointsByEqualFrequencyBinning(52);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      double[][] doubleArray0 = new double[8][0];
      double[] doubleArray1 = new double[5];
      doubleArray0[0] = doubleArray1;
      doubleArray0[2] = doubleArray0[0];
      discretize0.m_CutPoints = doubleArray0;
      String string0 = discretize0.getBinRangesString(2);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals("(-inf-0],(0-0],(0-0],(0-0],(0-0],(0-inf)", string0);
      assertNotNull(string0);
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      double[][] doubleArray0 = new double[8][0];
      discretize0.m_CutPoints = doubleArray0;
      // Undeclared exception!
      try { 
        discretize0.getBinRangesString(2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.getCutPoints(113);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      double[][] doubleArray0 = new double[2][1];
      discretize0.m_CutPoints = doubleArray0;
      // Undeclared exception!
      try { 
        discretize0.getCutPoints((-2049870752));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2049870752
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Discretize discretize0 = new Discretize();
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
  public void test42()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Properties properties0 = new Properties();
      ProtectedProperties protectedProperties0 = new ProtectedProperties(properties0);
      Attribute attribute0 = new Attribute("Set attribute selection mode. If false, only selected (numeric) attributes in the range will be discretized; if true, only non-selected attributes will be discretized.", protectedProperties0);
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("-Y", arrayList0, 113);
      discretize0.setInputFormat(instances0);
      discretize0.batchFinished();
      // Undeclared exception!
      try { 
        discretize0.calculateCutPointsByEqualFrequencyBinning(52);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 52
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Properties properties0 = new Properties();
      ProtectedProperties protectedProperties0 = new ProtectedProperties(properties0);
      Attribute attribute0 = new Attribute("Set attribute selection mode. If false, only selected (numeric) attributes in the range will be discretized; if true, only non-selected attributes will be discretized.", protectedProperties0);
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("-Y", arrayList0, 113);
      discretize0.setInputFormat(instances0);
      discretize0.calculateCutPoints();
      SparseInstance sparseInstance0 = new SparseInstance(1);
      // Undeclared exception!
      try { 
        discretize0.input(sparseInstance0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      double[] doubleArray0 = new double[5];
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(0.0, doubleArray0);
      // Undeclared exception!
      try { 
        discretize0.input(binarySparseInstance0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No input instance format defined
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Properties properties0 = new Properties();
      ProtectedProperties protectedProperties0 = new ProtectedProperties(properties0);
      Attribute attribute0 = new Attribute("Set attribute selection mode. If false, only selected (numeric) attributes in the range will be discretized; if true, only non-selected attributes will be discretized.", protectedProperties0);
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("-Y", arrayList0, 113);
      discretize0.setInputFormat(instances0);
      SparseInstance sparseInstance0 = new SparseInstance(1);
      // Undeclared exception!
      try { 
        discretize0.input(sparseInstance0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Instance has no dataset assigned!!
         //
         verifyException("weka.core.RelationalLocator", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Discretize discretize0 = new Discretize("org.pentaho.packageManager.manager");
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
  public void test47()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      assertFalse(discretize0.getMakeBinary());
      
      discretize0.setMakeBinary(true);
      discretize0.getCapabilities();
      assertTrue(discretize0.getMakeBinary());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      discretize0.setInvertSelection(true);
      String[] stringArray0 = discretize0.getOptions();
      assertEquals(5, stringArray0.length);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(10, discretize0.getBins());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Discretize discretize0 = new Discretize("Rr+*+");
      assertFalse(discretize0.getFindNumBins());
      
      discretize0.setFindNumBins(true);
      discretize0.getOptions();
      assertTrue(discretize0.getFindNumBins());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      assertFalse(discretize0.getMakeBinary());
      
      discretize0.m_MakeBinary = true;
      discretize0.getOptions();
      assertTrue(discretize0.getMakeBinary());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setIgnoreClass(true);
      String[] stringArray0 = discretize0.getOptions();
      assertEquals(7, stringArray0.length);
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "=LjW \"Acx";
      discretize0.setOptions(stringArray0);
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.invertSelectionTipText();
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
      assertEquals("Set attribute selection mode. If false, only selected (numeric) attributes in the range will be discretized; if true, only non-selected attributes will be discretized.", string0);
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.useEqualFrequencyTipText();
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(10, discretize0.getBins());
      assertEquals("If set to true, equal-frequency binning will be used instead of equal-width binning.", string0);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.useBinNumbersTipText();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals("Use bin numbers (eg BXofY) rather than ranges for for discretized attributes", string0);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.globalInfo();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertEquals("An instance filter that discretizes a range of numeric attributes in the dataset into nominal attributes. Discretization is by simple binning. Skips the class attribute if set.", string0);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getUseEqualFrequency());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.binsTipText();
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals("Number of bins.", string0);
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseBinNumbers());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.makeBinaryTipText();
      assertFalse(discretize0.getFindNumBins());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertEquals("Make resulting attributes binary.", string0);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.getRevision();
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals("8964", string0);
      assertFalse(discretize0.getUseEqualFrequency());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Discretize discretize0 = new Discretize("]");
      int[] intArray0 = new int[9];
      discretize0.setAttributeIndicesArray(intArray0);
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Discretize discretize0 = new Discretize("]");
      String string0 = discretize0.desiredWeightOfInstancesPerIntervalTipText();
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getMakeBinary());
      assertEquals("Sets the desired weight of instances per interval for equal-frequency binning.", string0);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.attributeIndicesTipText();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
      assertEquals(10, discretize0.getBins());
      assertEquals("Specify range of attributes to act on. This is a comma separated list of attribute indices, with \"first\" and \"last\" valid values. Specify an inclusive range with \"-\". E.g: \"first-3,5,6-10,last\".", string0);
      assertFalse(discretize0.getMakeBinary());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.findNumBinsTipText();
      assertEquals(10, discretize0.getBins());
      assertEquals("Optimize number of equal-width bins using leave-one-out. Doesn't work for equal-frequency binning", string0);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getUseBinNumbers());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Discretize discretize0 = new Discretize("A8~MN0");
      String[] stringArray0 = discretize0.getOptions();
      Discretize.main(stringArray0);
      assertEquals(10, discretize0.getBins());
      assertEquals(6, stringArray0.length);
  }
}