/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 04:21:41 GMT 2018
 */

package weka.classifiers.bayes.net.search.ci;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import weka.classifiers.bayes.BayesNet;
import weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm;
import weka.classifiers.misc.InputMappedClassifier;
import weka.core.Attribute;
import weka.core.Instances;
import weka.core.tokenizers.AlphabeticTokenizer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ICSSearchAlgorithm_ESTest extends ICSSearchAlgorithm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.setMaxCardinality(1);
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.name(532);
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
      int int0 = 0;
      iCSSearchAlgorithm0.setMaxCardinality(0);
      iCSSearchAlgorithm0.listOptions();
      boolean[][] booleanArray0 = new boolean[0][9];
      ICSSearchAlgorithm.SeparationSet[][] iCSSearchAlgorithm_SeparationSetArray0 = new ICSSearchAlgorithm.SeparationSet[7][6];
      ICSSearchAlgorithm.SeparationSet[] iCSSearchAlgorithm_SeparationSetArray1 = new ICSSearchAlgorithm.SeparationSet[3];
      ICSSearchAlgorithm iCSSearchAlgorithm1 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm1.new SeparationSet();
      iCSSearchAlgorithm_SeparationSetArray1[0] = iCSSearchAlgorithm_SeparationSet0;
      int int1 = 2145;
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm1.existsSepSet(0, 0, 2145, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2145
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      int int0 = 695;
      boolean[][] booleanArray0 = new boolean[1][7];
      boolean[] booleanArray1 = new boolean[8];
      booleanArray1[0] = true;
      booleanArray1[1] = true;
      String[] stringArray0 = new String[1];
      stringArray0[0] = "q#\"a";
      ICSSearchAlgorithm.main(stringArray0);
      booleanArray1[2] = false;
      booleanArray1[3] = true;
      booleanArray1[4] = true;
      booleanArray1[5] = true;
      booleanArray1[6] = false;
      booleanArray1[7] = true;
      booleanArray0[0] = booleanArray1;
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.existsSepSet(0, 0, 695, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 695
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.getOptions();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      boolean boolean0 = iCSSearchAlgorithm_SeparationSet0.contains((-1103));
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      boolean boolean0 = iCSSearchAlgorithm_SeparationSet0.contains(0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.setMaxCardinality((-1157));
      BayesNet bayesNet0 = iCSSearchAlgorithm0.m_BayesNet;
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("G.iEX7h9HY", arrayList0, 2);
      iCSSearchAlgorithm0.search((BayesNet) null, instances0);
      System.setCurrentTimeMillis(2);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      BayesNet bayesNet0 = new BayesNet();
      ICSSearchAlgorithm iCSSearchAlgorithm1 = new ICSSearchAlgorithm();
      BayesNet bayesNet1 = iCSSearchAlgorithm0.m_BayesNet;
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("G.iEX7h9HY", arrayList0, 1931);
      iCSSearchAlgorithm1.search((BayesNet) null, instances0);
      iCSSearchAlgorithm0.listOptions();
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      InputMappedClassifier inputMappedClassifier0 = new InputMappedClassifier();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>(2561);
      Attribute attribute0 = new Attribute("161-205", "161-205");
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("161-205", arrayList0, 1404);
      Instances instances1 = inputMappedClassifier0.getModelHeader(instances0);
      iCSSearchAlgorithm0.m_instances = instances1;
      iCSSearchAlgorithm0.next(0, 1240, 0, (boolean[][]) null);
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
  public void test08()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute("N9", (-1));
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("N9", arrayList0, 116);
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
  public void test09()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Locale.getISOLanguages();
      Attribute attribute0 = new Attribute("4", 136);
      attribute0.enumerateValues();
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("relational", arrayList0, 4);
      BayesNet bayesNet0 = iCSSearchAlgorithm0.m_BayesNet;
      iCSSearchAlgorithm0.setMaxCardinality((-5505));
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
  public void test10()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      Attribute attribute0 = new Attribute("When determining whether an edge exists a search is performed for a set Z that separates the nodes. MaxCardinality determines the maximum size of the set Z. This greatly influences the length of the search. Default value is 2.", 1091);
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("`mv7W>v2yvk|mz7+7", arrayList0, 3);
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
  public void test11()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute(", {", ", {");
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("relational", arrayList0, 1);
      arrayList0.add(attribute0);
      String[] stringArray0 = new String[2];
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

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("", arrayList0, 2552);
      BayesNet bayesNet0 = new BayesNet();
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.setMaxCardinality((-131));
      iCSSearchAlgorithm0.search(bayesNet0, instances0);
      boolean[][] booleanArray0 = new boolean[1][4];
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.next((-1112), 2552, (-1112), booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances((String) null, arrayList0, 45);
      BayesNet bayesNet0 = new BayesNet();
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.search(bayesNet0, instances0);
      boolean[][] booleanArray0 = new boolean[1][1];
      iCSSearchAlgorithm0.existsSepSet(45, (-1702), 2, booleanArray0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      iCSSearchAlgorithm0.setOptions(stringArray0);
      iCSSearchAlgorithm0.globalInfo();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      int[] intArray0 = new int[2];
      iCSSearchAlgorithm_SeparationSet0.m_set = intArray0;
      iCSSearchAlgorithm_SeparationSet0.getRevision();
      iCSSearchAlgorithm0.getScoreType();
      iCSSearchAlgorithm_SeparationSet0.getRevision();
      iCSSearchAlgorithm0.getRevision();
      iCSSearchAlgorithm_SeparationSet0.m_set = intArray0;
      iCSSearchAlgorithm_SeparationSet0.getRevision();
      intArray0[0] = (-1);
      intArray0[1] = 554;
      iCSSearchAlgorithm_SeparationSet0.m_set = intArray0;
      iCSSearchAlgorithm_SeparationSet0.getRevision();
      iCSSearchAlgorithm_SeparationSet0.contains((-1));
      iCSSearchAlgorithm_SeparationSet0.contains((-1));
      iCSSearchAlgorithm0.setOptions(stringArray0);
      iCSSearchAlgorithm0.getMaxCardinality();
      iCSSearchAlgorithm0.listOptions();
      iCSSearchAlgorithm_SeparationSet0.contains(18);
      iCSSearchAlgorithm0.maxCardinalityTipText();
      iCSSearchAlgorithm0.getRevision();
      ICSSearchAlgorithm.main(stringArray0);
      iCSSearchAlgorithm0.listOptions();
      iCSSearchAlgorithm_SeparationSet0.getRevision();
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.maxn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}