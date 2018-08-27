/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 01:20:00 GMT 2018
 */

package weka.classifiers.bayes.net.search.ci;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Properties;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import weka.classifiers.bayes.BayesNet;
import weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm;
import weka.classifiers.lazy.LWL;
import weka.classifiers.lazy.kstar.KStarConstants;
import weka.core.Attribute;
import weka.core.Instances;
import weka.core.NormalizableDistance;
import weka.core.ProtectedProperties;
import weka.core.tokenizers.WordTokenizer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ICSSearchAlgorithm_ESTest extends ICSSearchAlgorithm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String string0 = iCSSearchAlgorithm0.getRevision();
      assertEquals("8034", string0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String string0 = iCSSearchAlgorithm0.globalInfo();
      assertEquals("This Bayes Network learning algorithm uses conditional independence tests to find a skeleton, finds V-nodes and applies a set of rules to find the directions of the remaining arrows.", string0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[8];
      ICSSearchAlgorithm.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String string0 = iCSSearchAlgorithm0.maxCardinalityTipText();
      assertEquals("When determining whether an edge exists a search is performed for a set Z that separates the nodes. MaxCardinality determines the maximum size of the set Z. This greatly influences the length of the search. Default value is 2.", string0);
      
      iCSSearchAlgorithm0.getOptions();
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.listOptions();
      String string0 = iCSSearchAlgorithm0.maxCardinalityTipText();
      assertEquals("When determining whether an edge exists a search is performed for a set Z that separates the nodes. MaxCardinality determines the maximum size of the set Z. This greatly influences the length of the search. Default value is 2.", string0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String[] stringArray0 = new String[0];
      iCSSearchAlgorithm0.setOptions(stringArray0);
      ICSSearchAlgorithm.SeparationSet[][] iCSSearchAlgorithm_SeparationSetArray0 = new ICSSearchAlgorithm.SeparationSet[0][3];
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      int[] intArray0 = new int[0];
      boolean boolean0 = iCSSearchAlgorithm_SeparationSet0.contains(0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      int int0 = LWL.CONSTANT;
      String[] stringArray0 = iCSSearchAlgorithm0.getOptions();
      iCSSearchAlgorithm0.setOptions(stringArray0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      int[] intArray0 = new int[7];
      intArray0[1] = (-1);
      intArray0[6] = 0;
      iCSSearchAlgorithm_SeparationSet0.m_set = intArray0;
      boolean boolean0 = iCSSearchAlgorithm_SeparationSet0.contains(594);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.setMaxCardinality(2);
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute(", {", ", {", 903);
      Instances instances0 = new Instances(", {", arrayList0, 2);
      iCSSearchAlgorithm0.search((BayesNet) null, instances0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances(", {", arrayList0, 2);
      iCSSearchAlgorithm0.search((BayesNet) null, instances0);
      int int0 = NormalizableDistance.R_MAX;
      Attribute attribute0 = new Attribute("@data", instances0, 2);
      Attribute attribute1 = attribute0.copy(".bsi");
      arrayList0.add(attribute1);
      boolean[][] booleanArray0 = new boolean[6][5];
      boolean[] booleanArray1 = new boolean[8];
      booleanArray0[4] = booleanArray1;
      booleanArray0[1] = booleanArray1;
      boolean[] booleanArray2 = new boolean[2];
      booleanArray2[0] = true;
      booleanArray0[2] = booleanArray2;
      boolean[] booleanArray3 = new boolean[8];
      booleanArray3[3] = true;
      booleanArray0[3] = booleanArray3;
      boolean[] booleanArray4 = new boolean[9];
      booleanArray4[5] = true;
      booleanArray4[8] = false;
      booleanArray3[6] = false;
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.existsSepSet(2, 1, 2, booleanArray0);
      assertNull(iCSSearchAlgorithm_SeparationSet0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances(", {", arrayList0, 4);
      iCSSearchAlgorithm0.search((BayesNet) null, instances0);
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      boolean boolean0 = iCSSearchAlgorithm_SeparationSet0.contains(4);
      assertFalse(boolean0);
      
      String[] stringArray0 = new String[8];
      stringArray0[0] = ".arff";
      stringArray0[1] = "@relation";
      Attribute attribute0 = new Attribute("@data", instances0, 4751);
      Attribute attribute1 = new Attribute(".arff", instances0, 4);
      arrayList0.add(attribute1);
      stringArray0[3] = ".bsi";
      stringArray0[4] = ".bsi";
      stringArray0[5] = ".bsi";
      stringArray0[6] = "@data";
      stringArray0[3] = "integer";
      boolean[][] booleanArray0 = new boolean[6][5];
      boolean[] booleanArray1 = new boolean[9];
      attribute0.setStringValue(".bsi");
      booleanArray1[1] = true;
      booleanArray0[1] = booleanArray1;
      iCSSearchAlgorithm0.existsSepSet(1, 184, 1, booleanArray0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances(", {", arrayList0, 2);
      iCSSearchAlgorithm0.search((BayesNet) null, instances0);
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "yPhQr?2R");
      Properties properties0 = new Properties();
      ProtectedProperties protectedProperties0 = new ProtectedProperties(properties0);
      Attribute attribute0 = new Attribute("yPhQr?2R", protectedProperties0);
      attribute0.copy("-cardinality <num>");
      FileSystemHandling.shouldAllThrowIOExceptions();
      Attribute attribute1 = new Attribute("@data", instances0, 4751);
      Attribute attribute2 = new Attribute(".arff", instances0, 4);
      arrayList0.add(attribute2);
      boolean[][] booleanArray0 = new boolean[6][5];
      ICSSearchAlgorithm.SeparationSet[][] iCSSearchAlgorithm_SeparationSetArray0 = new ICSSearchAlgorithm.SeparationSet[0][0];
      iCSSearchAlgorithm0.calcVeeNodes(booleanArray0, booleanArray0, iCSSearchAlgorithm_SeparationSetArray0);
      iCSSearchAlgorithm0.getOptions();
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.setMaxCardinality(2);
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute(", {", ", {", 2);
      arrayList0.add(attribute0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Attribute attribute1 = new Attribute("date", "", (-501));
      attribute1.isInRange(0.0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      arrayList0.add(attribute1);
      Instances instances0 = new Instances("string", arrayList0, 2);
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
  public void test14()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      BayesNet bayesNet0 = null;
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances(", {", arrayList0, 18);
      iCSSearchAlgorithm0.search((BayesNet) null, instances0);
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      iCSSearchAlgorithm_SeparationSet0.contains(18);
      arrayList0.add((Attribute) null);
      int int0 = NormalizableDistance.R_MAX;
      Attribute attribute0 = new Attribute("@data");
      Attribute attribute1 = attribute0.copy(".bsi");
      attribute1.copy();
      iCSSearchAlgorithm_SeparationSet0.getRevision();
      attribute1.addStringValue(attribute0, 4751);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "eI y");
      ICSSearchAlgorithm iCSSearchAlgorithm1 = new ICSSearchAlgorithm();
      BayesNet bayesNet1 = iCSSearchAlgorithm1.m_BayesNet;
      try { 
        iCSSearchAlgorithm1.search((BayesNet) null, instances0);
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
      iCSSearchAlgorithm0.setMaxCardinality(2);
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute(", {", ", {", 903);
      arrayList0.add(attribute0);
      Instances instances0 = new Instances(", {", arrayList0, 2);
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
  public void test16()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.setMaxCardinality((-25));
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Properties properties0 = new Properties();
      ProtectedProperties protectedProperties0 = new ProtectedProperties(properties0);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      linkedList0.push("nyJ");
      Attribute attribute0 = new Attribute("nyJ", linkedList0, protectedProperties0);
      iCSSearchAlgorithm0.maxCardinalityTipText();
      arrayList0.add(attribute0);
      Attribute attribute1 = new Attribute("@end", 3);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      int int0 = LWL.TRICUBE;
      arrayList0.add(attribute1);
      BayesNet bayesNet0 = new BayesNet();
      iCSSearchAlgorithm0.m_BayesNet = bayesNet0;
      Instances instances0 = new Instances("real", arrayList0, 0);
      BayesNet bayesNet1 = new BayesNet();
      bayesNet0.listOptions();
      arrayList0.add(attribute1);
      bayesNet0.setUseADTree(false);
      int int1 = KStarConstants.M_DELETE;
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
  public void test17()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.setMaxCardinality((-25));
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Properties properties0 = new Properties();
      ProtectedProperties protectedProperties0 = new ProtectedProperties(properties0);
      Attribute attribute0 = new Attribute("nyJ", linkedList0, protectedProperties0);
      iCSSearchAlgorithm0.maxCardinalityTipText();
      arrayList0.add(attribute0);
      Attribute attribute1 = new Attribute("@end", 3);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      attribute0.addStringValue("string");
      arrayList0.add(attribute1);
      BayesNet bayesNet0 = new BayesNet();
      Instances instances0 = new Instances("real", arrayList0, 0);
      linkedList0.listIterator();
      bayesNet0.getOptions();
      BayesNet bayesNet1 = new BayesNet();
      bayesNet0.listOptions();
      arrayList0.add(attribute1);
      bayesNet1.m_Distributions = null;
      arrayList0.add(attribute1);
      BayesNet bayesNet2 = iCSSearchAlgorithm0.m_BayesNet;
      try { 
        iCSSearchAlgorithm0.search(bayesNet1, instances0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.BayesNet", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances(", {", arrayList0, 2);
      iCSSearchAlgorithm0.search((BayesNet) null, instances0);
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      FileSystemHandling.shouldAllThrowIOExceptions();
      Attribute attribute0 = new Attribute("");
      arrayList0.add(attribute0);
      Properties properties0 = new Properties();
      ProtectedProperties protectedProperties0 = new ProtectedProperties(properties0);
      Attribute attribute1 = new Attribute("yPhQr?2R", protectedProperties0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      Attribute attribute2 = new Attribute("@data", instances0, 4751);
      Attribute attribute3 = new Attribute(".arff", instances0, 4);
      arrayList0.add(attribute3);
      boolean[][] booleanArray0 = new boolean[7][5];
      boolean[] booleanArray1 = new boolean[16];
      booleanArray1[0] = true;
      booleanArray0[1] = booleanArray1;
      booleanArray0[2] = booleanArray1;
      boolean[] booleanArray2 = new boolean[8];
      booleanArray1[1] = true;
      booleanArray0[3] = booleanArray2;
      booleanArray1[14] = false;
      booleanArray2[6] = true;
      iCSSearchAlgorithm0.existsSepSet(2, 1, 2, booleanArray0);
      Random.setNextRandom(3);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, (String) null);
      iCSSearchAlgorithm0.setMaxCardinality((-14));
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Properties properties0 = new Properties();
      ProtectedProperties protectedProperties0 = new ProtectedProperties(properties0);
      linkedList0.push("nyJ");
      Attribute attribute0 = new Attribute("nyJ", linkedList0, protectedProperties0);
      iCSSearchAlgorithm0.scoreTypeTipText();
      arrayList0.add(attribute0);
      Attribute attribute1 = new Attribute("@end", 3);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      BayesNet bayesNet0 = new BayesNet();
      attribute0.enumerateValues();
      WordTokenizer wordTokenizer0 = new WordTokenizer();
      iCSSearchAlgorithm0.m_BayesNet = bayesNet0;
      Instances instances0 = new Instances("real", arrayList0, 0);
      BayesNet bayesNet1 = iCSSearchAlgorithm0.m_BayesNet;
      bayesNet0.m_Distributions = bayesNet0.m_Distributions;
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, true);
      ProtectedProperties protectedProperties1 = new ProtectedProperties(properties0);
      arrayList0.add(attribute1);
      attribute0.addStringValue(attribute1, 0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      bayesNet0.m_Instances = instances0;
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "date");
      ICSSearchAlgorithm iCSSearchAlgorithm1 = new ICSSearchAlgorithm();
      bayesNet1.initStructure();
      iCSSearchAlgorithm1.maxCardinalityTipText();
      iCSSearchAlgorithm0.search(bayesNet1, instances0);
      iCSSearchAlgorithm0.maxCardinalityTipText();
  }
}