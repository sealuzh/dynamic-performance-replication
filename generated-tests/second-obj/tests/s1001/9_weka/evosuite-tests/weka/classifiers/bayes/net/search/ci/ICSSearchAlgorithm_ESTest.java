/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 16:13:54 GMT 2018
 */

package weka.classifiers.bayes.net.search.ci;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Properties;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import weka.classifiers.AbstractClassifier;
import weka.classifiers.CostMatrix;
import weka.classifiers.bayes.BayesNet;
import weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm;
import weka.classifiers.rules.DecisionTable;
import weka.classifiers.rules.OneR;
import weka.classifiers.trees.RandomTree;
import weka.core.AbstractInstance;
import weka.core.Attribute;
import weka.core.BinarySparseInstance;
import weka.core.Instances;
import weka.core.SparseInstance;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ICSSearchAlgorithm_ESTest extends ICSSearchAlgorithm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String string0 = iCSSearchAlgorithm0.maxCardinalityTipText();
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
      assertEquals("When determining whether an edge exists a search is performed for a set Z that separates the nodes. MaxCardinality determines the maximum size of the set Z. This greatly influences the length of the search. Default value is 2.", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Properties properties0 = new Properties();
      String[] stringArray0 = new String[3];
      ICSSearchAlgorithm.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      boolean boolean0 = iCSSearchAlgorithm_SeparationSet0.contains(789);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "I=:";
      iCSSearchAlgorithm0.setOptions(stringArray0);
      BayesNet bayesNet0 = new BayesNet();
      iCSSearchAlgorithm0.m_BayesNet = bayesNet0;
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      String string0 = iCSSearchAlgorithm_SeparationSet0.getRevision();
      assertEquals("8034", string0);
      
      int[] intArray0 = new int[4];
      iCSSearchAlgorithm_SeparationSet0.m_set = intArray0;
      intArray0[0] = 386;
      intArray0[1] = 0;
      iCSSearchAlgorithm0.scoreTypeTipText();
      intArray0[3] = 0;
      iCSSearchAlgorithm_SeparationSet0.m_set = intArray0;
      iCSSearchAlgorithm0.m_BayesNet.BIFFileTipText();
      boolean boolean0 = iCSSearchAlgorithm_SeparationSet0.contains(386);
      assertTrue(boolean0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      int[] intArray0 = new int[8];
      intArray0[0] = (-1);
      intArray0[1] = 46;
      intArray0[2] = (-130);
      intArray0[1] = 813;
      intArray0[4] = (-2049);
      intArray0[5] = (-130);
      intArray0[6] = (-1);
      intArray0[7] = 663;
      iCSSearchAlgorithm_SeparationSet0.m_set = intArray0;
      iCSSearchAlgorithm_SeparationSet0.contains(79);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "sxa5zVu{[CgII\"QtYP'";
      stringArray0[2] = "$Revision: 8034 $";
      stringArray0[4] = stringArray0[3];
      try { 
        iCSSearchAlgorithm0.setOptions(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String[] stringArray0 = iCSSearchAlgorithm0.getOptions();
      iCSSearchAlgorithm0.setOptions(stringArray0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
      
      iCSSearchAlgorithm0.setMaxCardinality(1);
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      iCSSearchAlgorithm0.listOptions();
      ArrayList<Attribute> arrayList1 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute("X@t]1XfF9xeB");
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("string", arrayList1, 10);
      Locale.getISOLanguages();
      BayesNet bayesNet0 = new BayesNet();
      iCSSearchAlgorithm0.search(bayesNet0, instances0);
      Random.setNextRandom(1);
      iCSSearchAlgorithm0.getRevision();
      assertEquals(1, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      ICSSearchAlgorithm iCSSearchAlgorithm1 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm1.setMaxCardinality((-1798));
      ArrayList<Attribute> arrayList1 = new ArrayList<Attribute>();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Instances instances0 = new Instances((String) null, arrayList1, 3285);
      iCSSearchAlgorithm1.getOptions();
      ArrayList<String> arrayList2 = new ArrayList<String>();
      FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
      Attribute attribute0 = new Attribute("", arrayList2, 2810);
      attribute0.indexOfValue("@relation");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/9_weka/C:\\eclipse\\workspace\\weka\\data\\contact-lenses.arff");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      arrayList1.add(attribute0);
      attribute0.setWeight(1242.797231794);
      Instances instances1 = new Instances(instances0, 2810);
      BayesNet bayesNet0 = new BayesNet();
      String string0 = CostMatrix.FILE_EXTENSION;
      iCSSearchAlgorithm1.globalInfo();
      arrayList1.listIterator();
      arrayList0.add(attribute0);
      attribute0.toString();
      arrayList0.add(attribute0);
      RandomTree randomTree0 = new RandomTree();
      try { 
        iCSSearchAlgorithm1.search(bayesNet0, instances0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.BayesNet", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.setMaxCardinality(1);
      iCSSearchAlgorithm0.listOptions();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute((String) null);
      arrayList0.add(attribute0);
      Instances instances0 = new Instances((String) null, arrayList0, 1);
      Locale.getISOLanguages();
      BayesNet bayesNet0 = new BayesNet();
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
  public void test09()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.setMaxCardinality(3261);
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("cGvs@4_(;", arrayList0, 3263);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "@relation");
      Attribute attribute0 = new Attribute(".arff");
      attribute0.indexOfValue("@data");
      arrayList0.add(attribute0);
      Instances instances1 = new Instances(instances0);
      Attribute attribute1 = new Attribute("relational", 1);
      arrayList0.add(attribute1);
      BayesNet bayesNet0 = new BayesNet();
      OneR oneR0 = new OneR();
      RandomTree randomTree0 = new RandomTree();
      Instances instances2 = new Instances(instances0, 1);
      try { 
        iCSSearchAlgorithm0.search(bayesNet0, instances2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.BayesNet", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.setMaxCardinality(3261);
      int int0 = 1376;
      iCSSearchAlgorithm0.setMaxCardinality(1376);
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("R{V@F#\"U+h%I}1C", arrayList0, 1376);
      String[] stringArray0 = iCSSearchAlgorithm0.getOptions();
      instances0.deleteStringAttributes();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "nt`[uEyUFM{r");
      BayesNet bayesNet0 = new BayesNet();
      bayesNet0.toString();
      AbstractClassifier.makeCopies(bayesNet0, 3261);
      iCSSearchAlgorithm0.listOptions();
      iCSSearchAlgorithm0.search(bayesNet0, instances0);
      boolean[][] booleanArray0 = new boolean[2][3];
      boolean[] booleanArray1 = new boolean[2];
      booleanArray1[0] = false;
      booleanArray1[1] = false;
      booleanArray0[0] = booleanArray1;
      booleanArray0[1] = booleanArray1;
      iCSSearchAlgorithm0.existsSepSet(3247, 3247, 125, booleanArray0);
      iCSSearchAlgorithm0.setOptions(stringArray0);
      iCSSearchAlgorithm0.maxn();
      System.setCurrentTimeMillis(int0);
      ICSSearchAlgorithm iCSSearchAlgorithm1 = new ICSSearchAlgorithm();
      try { 
        iCSSearchAlgorithm1.search(bayesNet0, bayesNet0.m_Instances);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.setMaxCardinality(1);
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances((String) null, arrayList0, 1);
      instances0.spliterator();
      iCSSearchAlgorithm0.getOptions();
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(3246);
      AbstractInstance.s_numericAfterDecimalPoint = 1;
      BinarySparseInstance binarySparseInstance1 = new BinarySparseInstance((SparseInstance) binarySparseInstance0);
      Properties properties0 = new Properties();
      BayesNet bayesNet0 = new BayesNet();
      bayesNet0.measureBayesScore();
      bayesNet0.measureBayesScore();
      arrayList0.trimToSize();
      iCSSearchAlgorithm0.search(bayesNet0, instances0);
      boolean[][] booleanArray0 = new boolean[0][4];
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.next((-1494), (-1494), 1, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1494
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      ICSSearchAlgorithm iCSSearchAlgorithm1 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm1.setMaxCardinality((-1804));
      ArrayList<Attribute> arrayList1 = new ArrayList<Attribute>();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Instances instances0 = new Instances((String) null, arrayList1, 3285);
      iCSSearchAlgorithm1.getOptions();
      ArrayList<String> arrayList2 = new ArrayList<String>();
      Attribute attribute0 = new Attribute("En:]CQ+kQ1y]hq{", arrayList2, (-1804));
      int int0 = DecisionTable.EVAL_ACCURACY;
      attribute0.setWeight(2);
      arrayList1.add(attribute0);
      Instances instances1 = new Instances(instances0, 3285);
      BayesNet bayesNet0 = new BayesNet();
      String string0 = CostMatrix.FILE_EXTENSION;
      iCSSearchAlgorithm1.globalInfo();
      arrayList1.listIterator();
      arrayList1.add(attribute0);
      RandomTree randomTree0 = new RandomTree();
      Instances instances2 = new Instances(instances0, 0);
      BayesNet bayesNet1 = new BayesNet();
      UnaryOperator<Attribute> unaryOperator0 = UnaryOperator.identity();
      Function.identity();
      arrayList0.replaceAll(unaryOperator0);
      bayesNet0.toXMLBIF03();
      arrayList1.parallelStream();
      System.setCurrentTimeMillis(0L);
      BayesNet bayesNet2 = new BayesNet();
      try { 
        iCSSearchAlgorithm1.search(bayesNet0, instances2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.BayesNet", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      ICSSearchAlgorithm iCSSearchAlgorithm1 = new ICSSearchAlgorithm();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      iCSSearchAlgorithm1.setMaxCardinality((-1798));
      ArrayList<Attribute> arrayList1 = new ArrayList<Attribute>();
      FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
      Instances instances0 = new Instances((String) null, arrayList1, 3285);
      Locale.getISOLanguages();
      ArrayList<String> arrayList2 = new ArrayList<String>();
      Attribute attribute0 = new Attribute("En:]CQ+kQ1y]hq{", arrayList2, (-1798));
      int int0 = DecisionTable.EVAL_ACCURACY;
      arrayList1.add(attribute0);
      attribute0.setWeight(2);
      arrayList1.add(attribute0);
      Instances instances1 = new Instances(instances0, 3285);
      BayesNet bayesNet0 = new BayesNet();
      String string0 = CostMatrix.FILE_EXTENSION;
      iCSSearchAlgorithm1.globalInfo();
      arrayList0.listIterator();
      arrayList1.add(attribute0);
      RandomTree randomTree0 = new RandomTree();
      Instances instances2 = new Instances(instances0, 0);
      BayesNet bayesNet1 = new BayesNet();
      UnaryOperator<Attribute> unaryOperator0 = UnaryOperator.identity();
      Function.identity();
      arrayList0.replaceAll(unaryOperator0);
      bayesNet0.toXMLBIF03();
      arrayList1.parallelStream();
      System.setCurrentTimeMillis(0L);
      BayesNet bayesNet2 = new BayesNet();
      try { 
        iCSSearchAlgorithm1.search(bayesNet0, instances2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.BayesNet", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      ICSSearchAlgorithm iCSSearchAlgorithm1 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm1.setMaxCardinality((-1798));
      ArrayList<Attribute> arrayList1 = new ArrayList<Attribute>();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Instances instances0 = new Instances((String) null, arrayList1, 3285);
      iCSSearchAlgorithm1.getOptions();
      FileSystemHandling.shouldAllThrowIOExceptions();
      ArrayList<String> arrayList2 = new ArrayList<String>();
      Attribute attribute0 = new Attribute("En:]CQ+kQ1y]hq{", arrayList2, (-1798));
      int int0 = DecisionTable.EVAL_ACCURACY;
      arrayList1.add(attribute0);
      attribute0.setWeight(2);
      arrayList1.add(attribute0);
      Instances instances1 = new Instances(instances0, 3285);
      BayesNet bayesNet0 = new BayesNet();
      String string0 = CostMatrix.FILE_EXTENSION;
      iCSSearchAlgorithm1.globalInfo();
      arrayList1.listIterator();
      arrayList1.add(attribute0);
      RandomTree randomTree0 = new RandomTree();
      Instances instances2 = new Instances(instances0, 0);
      BayesNet bayesNet1 = new BayesNet();
      UnaryOperator<Attribute> unaryOperator0 = UnaryOperator.identity();
      Function.identity();
      arrayList0.replaceAll(unaryOperator0);
      bayesNet0.toXMLBIF03();
      arrayList1.parallelStream();
      System.setCurrentTimeMillis(0L);
      arrayList1.add(attribute0);
      BayesNet bayesNet2 = new BayesNet();
      try { 
        iCSSearchAlgorithm1.search(bayesNet0, instances2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.BayesNet", e);
      }
  }
}