/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 04:20:12 GMT 2018
 */

package weka.classifiers.bayes.net.search.ci;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import weka.classifiers.bayes.BayesNet;
import weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm;
import weka.core.Attribute;
import weka.core.Instances;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ICSSearchAlgorithm_ESTest extends ICSSearchAlgorithm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String[] stringArray0 = new String[1];
      int int0 = 740;
      String[] stringArray1 = new String[1];
      stringArray1[0] = "   * only checks the data against its capabilities.\n";
      ICSSearchAlgorithm.main(stringArray1);
      BayesNet bayesNet0 = new BayesNet();
      try { 
        iCSSearchAlgorithm0.search(bayesNet0, (Instances) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.getRevision();
      boolean[][] booleanArray0 = new boolean[7][1];
      boolean[] booleanArray1 = new boolean[9];
      booleanArray1[0] = true;
      booleanArray1[1] = false;
      booleanArray1[2] = false;
      booleanArray1[3] = true;
      booleanArray1[4] = false;
      booleanArray1[5] = true;
      booleanArray1[6] = true;
      booleanArray1[7] = false;
      booleanArray1[8] = false;
      booleanArray0[0] = booleanArray1;
      boolean[] booleanArray2 = new boolean[0];
      booleanArray0[1] = booleanArray2;
      boolean[] booleanArray3 = new boolean[2];
      booleanArray3[0] = false;
      booleanArray3[1] = false;
      booleanArray0[2] = booleanArray3;
      boolean[] booleanArray4 = new boolean[1];
      booleanArray4[0] = true;
      booleanArray0[3] = booleanArray4;
      boolean[] booleanArray5 = new boolean[5];
      booleanArray5[0] = false;
      booleanArray5[1] = true;
      booleanArray5[2] = false;
      booleanArray5[3] = false;
      booleanArray5[4] = false;
      booleanArray0[4] = booleanArray5;
      boolean[] booleanArray6 = new boolean[0];
      booleanArray0[5] = booleanArray6;
      boolean[] booleanArray7 = new boolean[7];
      booleanArray7[0] = false;
      booleanArray7[1] = true;
      booleanArray7[2] = true;
      booleanArray7[3] = false;
      booleanArray7[4] = true;
      booleanArray7[5] = false;
      booleanArray7[6] = false;
      booleanArray0[6] = booleanArray7;
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.calcArcDirections(booleanArray0, booleanArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.listOptions();
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.calcScoreWithExtraParent((-1286), (-3144));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      BayesNet bayesNet0 = new BayesNet();
      iCSSearchAlgorithm0.m_BayesNet = bayesNet0;
      iCSSearchAlgorithm0.listOptions();
      boolean boolean0 = false;
      iCSSearchAlgorithm0.setMarkovBlanketClassifier(false);
      int int0 = 0;
      iCSSearchAlgorithm0.setMaxCardinality(0);
      iCSSearchAlgorithm0.getRevision();
      try { 
        iCSSearchAlgorithm0.search(bayesNet0, (Instances) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.getOptions();
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      BayesNet bayesNet0 = new BayesNet();
      iCSSearchAlgorithm0.m_BayesNet = bayesNet0;
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      iCSSearchAlgorithm_SeparationSet0.getRevision();
      boolean[][] booleanArray0 = new boolean[4][6];
      boolean[] booleanArray1 = new boolean[8];
      booleanArray1[0] = false;
      booleanArray1[1] = false;
      booleanArray1[2] = true;
      booleanArray1[3] = true;
      booleanArray1[4] = true;
      booleanArray1[5] = true;
      booleanArray1[6] = false;
      booleanArray1[7] = true;
      booleanArray0[0] = booleanArray1;
      boolean[] booleanArray2 = new boolean[9];
      booleanArray2[0] = true;
      booleanArray2[1] = true;
      booleanArray2[2] = false;
      booleanArray2[3] = true;
      booleanArray2[4] = true;
      booleanArray2[5] = true;
      booleanArray2[6] = true;
      booleanArray2[7] = true;
      booleanArray2[8] = true;
      booleanArray0[1] = booleanArray2;
      boolean[] booleanArray3 = new boolean[8];
      booleanArray3[0] = true;
      booleanArray3[1] = true;
      booleanArray3[2] = true;
      booleanArray3[3] = false;
      booleanArray3[4] = true;
      booleanArray3[5] = true;
      booleanArray3[6] = true;
      booleanArray3[7] = true;
      booleanArray0[2] = booleanArray3;
      boolean[] booleanArray4 = new boolean[2];
      booleanArray4[0] = false;
      booleanArray4[1] = true;
      booleanArray0[3] = booleanArray4;
      ICSSearchAlgorithm.SeparationSet[][] iCSSearchAlgorithm_SeparationSetArray0 = new ICSSearchAlgorithm.SeparationSet[2][4];
      ICSSearchAlgorithm.SeparationSet[] iCSSearchAlgorithm_SeparationSetArray1 = new ICSSearchAlgorithm.SeparationSet[3];
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.existsSepSet(32, 798, (-1440), booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1440
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.globalInfo();
      boolean[][] booleanArray0 = new boolean[7][4];
      boolean[] booleanArray1 = new boolean[8];
      booleanArray1[0] = false;
      booleanArray1[1] = true;
      booleanArray1[2] = true;
      booleanArray1[3] = false;
      booleanArray1[4] = false;
      booleanArray1[5] = false;
      booleanArray1[6] = false;
      booleanArray1[7] = false;
      booleanArray0[0] = booleanArray1;
      boolean[] booleanArray2 = new boolean[0];
      booleanArray0[1] = booleanArray2;
      boolean[] booleanArray3 = new boolean[4];
      booleanArray3[0] = false;
      booleanArray3[1] = false;
      booleanArray3[2] = false;
      booleanArray3[3] = false;
      booleanArray0[2] = booleanArray3;
      boolean[] booleanArray4 = new boolean[7];
      booleanArray4[0] = true;
      booleanArray4[1] = false;
      booleanArray4[2] = false;
      booleanArray4[3] = false;
      booleanArray4[4] = true;
      booleanArray4[5] = false;
      booleanArray4[6] = false;
      booleanArray0[3] = booleanArray4;
      boolean[] booleanArray5 = new boolean[2];
      booleanArray5[0] = false;
      booleanArray5[1] = false;
      booleanArray0[4] = booleanArray5;
      boolean[] booleanArray6 = new boolean[9];
      booleanArray6[0] = false;
      booleanArray6[1] = false;
      booleanArray6[2] = false;
      booleanArray6[3] = false;
      booleanArray6[4] = true;
      booleanArray6[5] = false;
      booleanArray6[6] = false;
      booleanArray6[7] = true;
      booleanArray6[8] = false;
      booleanArray0[5] = booleanArray6;
      boolean[] booleanArray7 = new boolean[3];
      booleanArray7[0] = false;
      booleanArray7[1] = false;
      booleanArray7[2] = false;
      booleanArray0[6] = booleanArray7;
      ICSSearchAlgorithm.SeparationSet[][] iCSSearchAlgorithm_SeparationSetArray0 = new ICSSearchAlgorithm.SeparationSet[9][3];
      ICSSearchAlgorithm.SeparationSet[] iCSSearchAlgorithm_SeparationSetArray1 = new ICSSearchAlgorithm.SeparationSet[4];
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      iCSSearchAlgorithm_SeparationSetArray1[0] = iCSSearchAlgorithm_SeparationSet0;
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.existsSepSet(10, 0, 10, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 10
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.getRevision();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "\"Kr";
      stringArray0[1] = "8034";
      stringArray0[2] = "8034";
      stringArray0[3] = "8034";
      stringArray0[4] = "8034";
      iCSSearchAlgorithm0.setOptions(stringArray0);
      boolean[][] booleanArray0 = new boolean[3][3];
      boolean[] booleanArray1 = new boolean[0];
      booleanArray0[0] = booleanArray1;
      boolean[] booleanArray2 = new boolean[8];
      booleanArray2[0] = true;
      booleanArray2[1] = true;
      booleanArray2[2] = true;
      booleanArray2[3] = true;
      booleanArray2[4] = true;
      booleanArray2[5] = true;
      booleanArray2[6] = false;
      booleanArray2[7] = true;
      booleanArray0[1] = booleanArray2;
      boolean[] booleanArray3 = new boolean[2];
      booleanArray3[0] = true;
      booleanArray3[1] = true;
      booleanArray0[2] = booleanArray3;
      ICSSearchAlgorithm.SeparationSet[][] iCSSearchAlgorithm_SeparationSetArray0 = new ICSSearchAlgorithm.SeparationSet[4][1];
      ICSSearchAlgorithm.SeparationSet[] iCSSearchAlgorithm_SeparationSetArray1 = new ICSSearchAlgorithm.SeparationSet[9];
      int int0 = 0;
      int int1 = 20;
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.existsSepSet(0, 0, 20, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 20
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.setOptions((String[]) null);
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.calcArcDirections((boolean[][]) null, (boolean[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      boolean boolean0 = iCSSearchAlgorithm_SeparationSet0.contains(0);
      assertTrue(boolean0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.setMaxCardinality(1075);
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      iCSSearchAlgorithm_SeparationSet0.contains(2);
      iCSSearchAlgorithm0.setMaxCardinality(0);
      assertEquals(0, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      int[] intArray0 = new int[5];
      intArray0[0] = (-1);
      intArray0[1] = 711;
      intArray0[2] = (-2001);
      intArray0[3] = (-1194);
      intArray0[4] = 1;
      iCSSearchAlgorithm_SeparationSet0.m_set = intArray0;
      boolean boolean0 = iCSSearchAlgorithm_SeparationSet0.contains(1012);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      Instances instances0 = new Instances((String) null, arrayList0, 1274);
      BayesNet bayesNet0 = iCSSearchAlgorithm0.m_BayesNet;
      iCSSearchAlgorithm0.search((BayesNet) null, instances0);
      boolean[][] booleanArray0 = new boolean[6][3];
      boolean[] booleanArray1 = new boolean[6];
      booleanArray1[0] = false;
      booleanArray1[1] = false;
      booleanArray1[2] = false;
      booleanArray1[3] = false;
      booleanArray1[4] = false;
      booleanArray1[5] = false;
      booleanArray0[0] = booleanArray1;
      boolean[] booleanArray2 = new boolean[9];
      booleanArray2[0] = false;
      booleanArray2[1] = false;
      booleanArray2[2] = false;
      booleanArray2[3] = false;
      booleanArray2[4] = true;
      booleanArray2[5] = false;
      booleanArray2[6] = false;
      booleanArray2[7] = false;
      booleanArray2[8] = false;
      booleanArray0[1] = booleanArray2;
      boolean[] booleanArray3 = new boolean[1];
      booleanArray3[0] = true;
      booleanArray0[2] = booleanArray3;
      boolean[] booleanArray4 = new boolean[1];
      booleanArray4[0] = true;
      booleanArray0[3] = booleanArray4;
      boolean[] booleanArray5 = new boolean[7];
      booleanArray5[0] = false;
      booleanArray5[1] = false;
      booleanArray5[2] = true;
      booleanArray5[3] = false;
      booleanArray5[4] = false;
      booleanArray5[5] = true;
      booleanArray5[6] = false;
      booleanArray0[4] = booleanArray5;
      boolean[] booleanArray6 = new boolean[0];
      booleanArray0[5] = booleanArray6;
      ICSSearchAlgorithm.SeparationSet[][] iCSSearchAlgorithm_SeparationSetArray0 = new ICSSearchAlgorithm.SeparationSet[6][7];
      ICSSearchAlgorithm.SeparationSet[] iCSSearchAlgorithm_SeparationSetArray1 = new ICSSearchAlgorithm.SeparationSet[2];
      iCSSearchAlgorithm0.existsSepSet(2, (-3875), 2, booleanArray0);
      iCSSearchAlgorithm_SeparationSetArray1[0] = null;
      boolean[][] booleanArray7 = new boolean[3][0];
      booleanArray7[0] = booleanArray6;
      booleanArray7[1] = booleanArray2;
      booleanArray7[2] = booleanArray6;
      iCSSearchAlgorithm0.existsSepSet((-3365), 47, 1, booleanArray7);
      iCSSearchAlgorithm_SeparationSetArray1[1] = null;
      iCSSearchAlgorithm_SeparationSetArray0[0] = iCSSearchAlgorithm_SeparationSetArray1;
      ICSSearchAlgorithm.SeparationSet[] iCSSearchAlgorithm_SeparationSetArray2 = new ICSSearchAlgorithm.SeparationSet[2];
      iCSSearchAlgorithm_SeparationSetArray2[0] = null;
      iCSSearchAlgorithm_SeparationSetArray2[1] = null;
      iCSSearchAlgorithm_SeparationSetArray0[1] = iCSSearchAlgorithm_SeparationSetArray2;
      ICSSearchAlgorithm.SeparationSet[] iCSSearchAlgorithm_SeparationSetArray3 = new ICSSearchAlgorithm.SeparationSet[4];
      iCSSearchAlgorithm_SeparationSetArray3[0] = null;
      iCSSearchAlgorithm_SeparationSetArray3[1] = null;
      iCSSearchAlgorithm_SeparationSetArray3[2] = null;
      iCSSearchAlgorithm_SeparationSetArray3[3] = null;
      iCSSearchAlgorithm_SeparationSetArray0[2] = iCSSearchAlgorithm_SeparationSetArray3;
      ICSSearchAlgorithm.SeparationSet[] iCSSearchAlgorithm_SeparationSetArray4 = new ICSSearchAlgorithm.SeparationSet[1];
      iCSSearchAlgorithm_SeparationSetArray4[0] = null;
      iCSSearchAlgorithm_SeparationSetArray0[3] = iCSSearchAlgorithm_SeparationSetArray4;
      ICSSearchAlgorithm.SeparationSet[] iCSSearchAlgorithm_SeparationSetArray5 = new ICSSearchAlgorithm.SeparationSet[8];
      iCSSearchAlgorithm_SeparationSetArray5[0] = null;
      iCSSearchAlgorithm_SeparationSetArray5[1] = null;
      iCSSearchAlgorithm_SeparationSetArray5[2] = null;
      iCSSearchAlgorithm_SeparationSetArray5[3] = null;
      iCSSearchAlgorithm_SeparationSetArray5[4] = null;
      iCSSearchAlgorithm_SeparationSetArray5[5] = null;
      iCSSearchAlgorithm_SeparationSetArray5[6] = null;
      iCSSearchAlgorithm_SeparationSetArray5[7] = null;
      iCSSearchAlgorithm_SeparationSetArray0[4] = iCSSearchAlgorithm_SeparationSetArray5;
      ICSSearchAlgorithm.SeparationSet[] iCSSearchAlgorithm_SeparationSetArray6 = new ICSSearchAlgorithm.SeparationSet[0];
      iCSSearchAlgorithm_SeparationSetArray0[5] = iCSSearchAlgorithm_SeparationSetArray6;
      iCSSearchAlgorithm0.calcDependencyGraph(booleanArray0, iCSSearchAlgorithm_SeparationSetArray0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("", arrayList0, 1049);
      Attribute attribute0 = new Attribute("Knw", "", 1049);
      arrayList0.add(attribute0);
      BayesNet bayesNet0 = iCSSearchAlgorithm0.m_BayesNet;
      try { 
        iCSSearchAlgorithm0.search((BayesNet) null, instances0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("\tSets random number seed for cross-validation or percentage split\n", arrayList0, 40);
      Attribute attribute0 = new Attribute("+T8.y_W", 2320);
      Attribute attribute1 = attribute0.copy("@data");
      instances0.insertAttributeAt(attribute1, 0);
      BayesNet bayesNet0 = iCSSearchAlgorithm0.m_BayesNet;
      try { 
        iCSSearchAlgorithm0.search((BayesNet) null, instances0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("Number of xval folds to use wheQ estimating subset aEcuracy.", arrayList0, 1049);
      Attribute attribute0 = new Attribute("Number of xval folds to use wheQ estimating subset aEcuracy.");
      arrayList0.add(attribute0);
      arrayList0.add(attribute0);
      BayesNet bayesNet0 = iCSSearchAlgorithm0.m_BayesNet;
      try { 
        iCSSearchAlgorithm0.search((BayesNet) null, instances0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.net.search.ci.CISearchAlgorithm", e);
      }
  }
}