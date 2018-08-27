/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 08:50:34 GMT 2018
 */

package weka.classifiers.bayes.net.search.ci;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import weka.attributeSelection.WrapperSubsetEval;
import weka.classifiers.bayes.BayesNet;
import weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm;
import weka.core.Attribute;
import weka.core.Instances;
import weka.core.SelectedTag;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ICSSearchAlgorithm_ESTest extends ICSSearchAlgorithm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      int int0 = 0;
      iCSSearchAlgorithm0.getOptions();
      iCSSearchAlgorithm0.setMaxCardinality(0);
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.name(0);
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
      boolean[][] booleanArray0 = new boolean[1][8];
      boolean[] booleanArray1 = new boolean[3];
      boolean boolean0 = true;
      booleanArray1[0] = true;
      booleanArray1[1] = false;
      booleanArray1[2] = false;
      iCSSearchAlgorithm0.getRevision();
      booleanArray0[0] = booleanArray1;
      ICSSearchAlgorithm.SeparationSet[][] iCSSearchAlgorithm_SeparationSetArray0 = new ICSSearchAlgorithm.SeparationSet[2][9];
      ICSSearchAlgorithm.SeparationSet[] iCSSearchAlgorithm_SeparationSetArray1 = new ICSSearchAlgorithm.SeparationSet[0];
      iCSSearchAlgorithm_SeparationSetArray0[0] = iCSSearchAlgorithm_SeparationSetArray1;
      ICSSearchAlgorithm.SeparationSet[] iCSSearchAlgorithm_SeparationSetArray2 = new ICSSearchAlgorithm.SeparationSet[2];
      ICSSearchAlgorithm iCSSearchAlgorithm1 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm1.new SeparationSet();
      iCSSearchAlgorithm_SeparationSetArray2[0] = iCSSearchAlgorithm_SeparationSet0;
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet1 = iCSSearchAlgorithm1.new SeparationSet();
      iCSSearchAlgorithm_SeparationSetArray2[1] = iCSSearchAlgorithm_SeparationSet1;
      iCSSearchAlgorithm_SeparationSetArray0[1] = iCSSearchAlgorithm_SeparationSetArray2;
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.calcDependencyGraph(booleanArray0, iCSSearchAlgorithm_SeparationSetArray0);
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
      iCSSearchAlgorithm0.getScoreType();
      iCSSearchAlgorithm0.listOptions();
      String[] stringArray0 = new String[2];
      String string0 = "";
      stringArray0[0] = string0;
      String string1 = "$Revision: 8034 $";
      stringArray0[1] = string1;
      iCSSearchAlgorithm0.setOptions(stringArray0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.listOptions();
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.setOptions((String[]) null);
      boolean[][] booleanArray0 = new boolean[6][8];
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.existsSepSet(0, 0, 0, booleanArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.net.search.ci.CISearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      iCSSearchAlgorithm_SeparationSet0.getRevision();
      iCSSearchAlgorithm_SeparationSet0.getRevision();
      boolean[][] booleanArray0 = new boolean[3][6];
      boolean[] booleanArray1 = new boolean[8];
      booleanArray1[0] = false;
      booleanArray1[1] = false;
      booleanArray1[2] = true;
      booleanArray1[3] = false;
      booleanArray1[4] = true;
      booleanArray1[5] = true;
      booleanArray1[6] = true;
      booleanArray1[7] = true;
      booleanArray0[0] = booleanArray1;
      boolean[] booleanArray2 = new boolean[8];
      booleanArray2[0] = true;
      booleanArray2[1] = true;
      booleanArray2[2] = true;
      booleanArray2[3] = true;
      booleanArray2[4] = true;
      booleanArray2[5] = true;
      booleanArray2[6] = true;
      booleanArray2[7] = true;
      booleanArray0[1] = booleanArray2;
      boolean[] booleanArray3 = new boolean[9];
      booleanArray3[0] = true;
      booleanArray3[1] = false;
      booleanArray3[2] = true;
      booleanArray3[3] = true;
      booleanArray3[4] = true;
      booleanArray3[5] = true;
      booleanArray3[6] = true;
      booleanArray3[7] = true;
      booleanArray3[8] = true;
      booleanArray0[2] = booleanArray3;
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.next(0, 0, (-920), booleanArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String[] stringArray0 = new String[0];
      WrapperSubsetEval wrapperSubsetEval0 = new WrapperSubsetEval();
      SelectedTag selectedTag0 = wrapperSubsetEval0.getEvaluationMeasure();
      iCSSearchAlgorithm0.setScoreType(selectedTag0);
      ICSSearchAlgorithm.main(stringArray0);
      iCSSearchAlgorithm0.getRevision();
      boolean[][] booleanArray0 = new boolean[9][9];
      boolean[] booleanArray1 = new boolean[4];
      booleanArray1[0] = true;
      booleanArray1[1] = true;
      booleanArray1[2] = true;
      booleanArray1[3] = true;
      booleanArray0[0] = booleanArray1;
      boolean[] booleanArray2 = new boolean[3];
      booleanArray2[0] = true;
      booleanArray2[1] = true;
      booleanArray2[2] = true;
      booleanArray0[1] = booleanArray2;
      boolean[] booleanArray3 = new boolean[0];
      booleanArray0[2] = booleanArray3;
      boolean[] booleanArray4 = new boolean[9];
      booleanArray4[0] = true;
      booleanArray4[1] = true;
      booleanArray4[2] = true;
      booleanArray4[3] = true;
      booleanArray4[4] = true;
      booleanArray4[5] = true;
      booleanArray4[6] = true;
      booleanArray4[7] = true;
      booleanArray4[8] = true;
      booleanArray0[3] = booleanArray4;
      boolean[] booleanArray5 = new boolean[9];
      booleanArray5[0] = true;
      booleanArray5[1] = true;
      booleanArray5[2] = true;
      booleanArray5[3] = true;
      booleanArray5[4] = true;
      booleanArray5[5] = true;
      booleanArray5[6] = true;
      booleanArray5[7] = true;
      booleanArray5[8] = true;
      booleanArray0[4] = booleanArray5;
      boolean[] booleanArray6 = new boolean[4];
      booleanArray6[0] = true;
      booleanArray6[1] = true;
      booleanArray6[2] = true;
      booleanArray6[3] = false;
      booleanArray0[5] = booleanArray6;
      boolean[] booleanArray7 = new boolean[0];
      booleanArray0[6] = booleanArray7;
      boolean[] booleanArray8 = new boolean[3];
      booleanArray8[0] = true;
      booleanArray8[1] = true;
      booleanArray8[2] = true;
      booleanArray0[7] = booleanArray8;
      boolean[] booleanArray9 = new boolean[8];
      booleanArray9[0] = true;
      booleanArray9[1] = true;
      booleanArray9[2] = true;
      booleanArray9[3] = true;
      booleanArray9[4] = true;
      booleanArray9[5] = true;
      booleanArray9[6] = true;
      booleanArray9[7] = true;
      booleanArray0[8] = booleanArray9;
      ICSSearchAlgorithm.SeparationSet[][] iCSSearchAlgorithm_SeparationSetArray0 = new ICSSearchAlgorithm.SeparationSet[9][1];
      ICSSearchAlgorithm.SeparationSet[] iCSSearchAlgorithm_SeparationSetArray1 = new ICSSearchAlgorithm.SeparationSet[1];
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      iCSSearchAlgorithm_SeparationSetArray1[0] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray0[0] = iCSSearchAlgorithm_SeparationSetArray1;
      ICSSearchAlgorithm.SeparationSet[] iCSSearchAlgorithm_SeparationSetArray2 = new ICSSearchAlgorithm.SeparationSet[8];
      iCSSearchAlgorithm_SeparationSetArray2[0] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray2[1] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray2[2] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray2[3] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray2[4] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray2[5] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray2[6] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray2[7] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray0[1] = iCSSearchAlgorithm_SeparationSetArray2;
      ICSSearchAlgorithm.SeparationSet[] iCSSearchAlgorithm_SeparationSetArray3 = new ICSSearchAlgorithm.SeparationSet[6];
      iCSSearchAlgorithm_SeparationSetArray3[0] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray3[1] = iCSSearchAlgorithm_SeparationSet0;
      int int0 = 107;
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.existsSepSet(107, 5, 7, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      boolean boolean0 = iCSSearchAlgorithm_SeparationSet0.contains(0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.getRevision();
      iCSSearchAlgorithm0.setMaxCardinality(917);
      iCSSearchAlgorithm0.globalInfo();
      iCSSearchAlgorithm0.setMaxCardinality(26);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "8034";
      stringArray0[1] = "This Bayes Network learning algorithm uses conditional independence tests to find a skeleton, finds V-nodes and applies a set of rules to find the directions of the remaining arrows.";
      stringArray0[2] = ", {";
      stringArray0[3] = "This Bayes Network learning algorithm uses conditional independence tests to find a skeleton, finds V-nodes and applies a set of rules to find the directions of the remaining arrows.";
      stringArray0[4] = "This Bayes Network learning algorithm uses conditional independence tests to find a skeleton, finds V-nodes and applies a set of rules to find the directions of the remaining arrows.";
      stringArray0[5] = "8034";
      stringArray0[6] = "This Bayes Network learning algorithm uses conditional independence tests to find a skeleton, finds V-nodes and applies a set of rules to find the directions of the remaining arrows.";
      stringArray0[7] = "This Bayes Network learning algorithm uses conditional independence tests to find a skeleton, finds V-nodes and applies a set of rules to find the directions of the remaining arrows.";
      iCSSearchAlgorithm0.setOptions(stringArray0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.getRevision();
      iCSSearchAlgorithm0.setMaxCardinality(0);
      Attribute attribute0 = new Attribute("8034", 0);
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      FileSystemHandling.shouldAllThrowIOExceptions();
      Instances instances0 = new Instances("", arrayList0, 0);
      ArrayList<Attribute> arrayList1 = new ArrayList<Attribute>();
      arrayList1.add(attribute0);
      arrayList1.add(attribute0);
      BayesNet bayesNet0 = iCSSearchAlgorithm0.m_BayesNet;
      iCSSearchAlgorithm0.search((BayesNet) null, instances0);
      assertEquals(0, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      boolean boolean0 = iCSSearchAlgorithm_SeparationSet0.contains(122);
      assertFalse(boolean0);
      
      String string0 = iCSSearchAlgorithm0.maxCardinalityTipText();
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
      assertEquals("When determining whether an edge exists a search is performed for a set Z that separates the nodes. MaxCardinality determines the maximum size of the set Z. This greatly influences the length of the search. Default value is 2.", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      BayesNet bayesNet0 = new BayesNet();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute("X from A*X=B\n");
      arrayList0.add(attribute0);
      iCSSearchAlgorithm0.getOptions();
      Instances instances0 = new Instances("X from A*X=B\n", arrayList0, 33);
      try { 
        iCSSearchAlgorithm0.search(bayesNet0, instances0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.BayesNet", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.getRevision();
      iCSSearchAlgorithm0.setMaxCardinality(0);
      Attribute attribute0 = new Attribute("8034", 0);
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("", arrayList0, 0);
      ArrayList<Attribute> arrayList1 = new ArrayList<Attribute>();
      arrayList1.add(attribute0);
      arrayList1.add(attribute0);
      arrayList1.add(attribute0);
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
  public void test13()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      int[] intArray0 = new int[5];
      intArray0[0] = (-57);
      intArray0[1] = (-1);
      intArray0[2] = (-1677);
      intArray0[3] = (-4013);
      intArray0[4] = 0;
      iCSSearchAlgorithm_SeparationSet0.m_set = intArray0;
      iCSSearchAlgorithm_SeparationSet0.contains(5269);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "DG w}1";
      stringArray0[3] = "This Bayes Network learning algorithm uses conditional independence tests to find a skeleton, finds V-nodes and applies a set of rules to find the directions of the remaining arrows.";
      stringArray0[4] = "r1!of'GD+8QB=;eh%";
      stringArray0[5] = "NmvbxHk\"30&DJED";
      ICSSearchAlgorithm.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("X from A*X=B\n", arrayList0, 1);
      BayesNet bayesNet0 = new BayesNet();
      iCSSearchAlgorithm0.search(bayesNet0, instances0);
      boolean[][] booleanArray0 = new boolean[0][3];
      ICSSearchAlgorithm.SeparationSet[][] iCSSearchAlgorithm_SeparationSetArray0 = new ICSSearchAlgorithm.SeparationSet[4][7];
      ICSSearchAlgorithm.SeparationSet[] iCSSearchAlgorithm_SeparationSetArray1 = new ICSSearchAlgorithm.SeparationSet[3];
      int int0 = (-561);
      iCSSearchAlgorithm0.existsSepSet((-561), (-561), 1, booleanArray0);
      iCSSearchAlgorithm_SeparationSetArray1[0] = null;
      int int1 = 111;
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.existsSepSet(111, 22, 22, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 22
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute("");
      ArrayList<Attribute> arrayList1 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("string", arrayList1, 3);
      iCSSearchAlgorithm0.m_instances = instances0;
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.next((-1445), 0, 0, (boolean[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("X wromA*X=B", arrayList0, 1);
      BayesNet bayesNet0 = iCSSearchAlgorithm0.m_BayesNet;
      iCSSearchAlgorithm0.search((BayesNet) null, instances0);
      boolean[][] booleanArray0 = new boolean[18][3];
      iCSSearchAlgorithm0.existsSepSet(1, 1, 1, booleanArray0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances((String) null, arrayList0, 20);
      arrayList0.add((Attribute) null);
      arrayList0.add((Attribute) null);
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
  public void test18()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.setMaxCardinality((-1));
      Attribute attribute0 = new Attribute((String) null, (-1));
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("integer", arrayList0, 0);
      arrayList0.add(attribute0);
      BayesNet bayesNet0 = new BayesNet();
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
  public void test19()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.setMaxCardinality((-1));
      Attribute attribute0 = new Attribute((String) null, (String) null, (-1));
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("integer", arrayList0, 0);
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
  public void test20()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.setMaxCardinality((-1));
      Attribute attribute0 = new Attribute((String) null, (-1));
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("integer", arrayList0, 0);
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
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.getRevision();
      iCSSearchAlgorithm0.setMaxCardinality((-1));
      Attribute attribute0 = new Attribute((String) null, (-1));
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("integer", arrayList0, 0);
      arrayList0.add(attribute0);
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
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }
}