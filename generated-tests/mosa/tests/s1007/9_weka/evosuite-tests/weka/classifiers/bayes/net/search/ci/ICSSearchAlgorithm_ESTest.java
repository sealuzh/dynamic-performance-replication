/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 22:53:14 GMT 2018
 */

package weka.classifiers.bayes.net.search.ci;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
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
      String string0 = iCSSearchAlgorithm0.globalInfo();
      assertEquals("This Bayes Network learning algorithm uses conditional independence tests to find a skeleton, finds V-nodes and applies a set of rules to find the directions of the remaining arrows.", string0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String string0 = iCSSearchAlgorithm0.getRevision();
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
      assertEquals("8034", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ICSSearchAlgorithm.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      String string0 = iCSSearchAlgorithm_SeparationSet0.getRevision();
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
      assertEquals("8034", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.listOptions();
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String[] stringArray0 = Locale.getISOCountries();
      iCSSearchAlgorithm0.setOptions(stringArray0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String string0 = iCSSearchAlgorithm0.maxCardinalityTipText();
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
      assertEquals("When determining whether an edge exists a search is performed for a set Z that separates the nodes. MaxCardinality determines the maximum size of the set Z. This greatly influences the length of the search. Default value is 2.", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      boolean boolean0 = iCSSearchAlgorithm_SeparationSet0.contains(1);
      assertFalse(boolean0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String[] stringArray0 = iCSSearchAlgorithm0.getOptions();
      iCSSearchAlgorithm0.setOptions(stringArray0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      boolean boolean0 = iCSSearchAlgorithm_SeparationSet0.contains(0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      Attribute attribute0 = new Attribute("");
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("", arrayList0, 4);
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
  public void test11()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("7JhRmlC,{m']S'6k{", arrayList0, 554);
      iCSSearchAlgorithm0.search((BayesNet) null, instances0);
      boolean[][] booleanArray0 = new boolean[0][9];
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.next((-3019), (-3019), (-3019), booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3019
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      Attribute attribute0 = new Attribute("San Mateo");
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      FileSystemHandling.shouldAllThrowIOExceptions();
      Instances instances0 = new Instances("numeric", arrayList0, 1);
      BayesNet bayesNet0 = new BayesNet();
      iCSSearchAlgorithm0.search(bayesNet0, instances0);
      boolean[][] booleanArray0 = new boolean[0][8];
      iCSSearchAlgorithm0.existsSepSet(3, 1, 1, booleanArray0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      Attribute attribute0 = new Attribute("San Mateo");
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      FileSystemHandling.shouldAllThrowIOExceptions();
      Instances instances0 = new Instances("numeric", arrayList0, 3);
      BayesNet bayesNet0 = new BayesNet();
      iCSSearchAlgorithm0.search(bayesNet0, instances0);
      boolean[][] booleanArray0 = new boolean[0][8];
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.existsSepSet(3, 4, 2, booleanArray0);
      assertNull(iCSSearchAlgorithm_SeparationSet0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      Attribute attribute0 = new Attribute("");
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("", arrayList0, 4);
      arrayList0.add(attribute0);
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
  public void test15()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      Attribute attribute0 = new Attribute("} ,");
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      iCSSearchAlgorithm0.setMaxCardinality((-534));
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("} ,", arrayList0, 0);
      arrayList0.add(attribute0);
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
  public void test16()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      int[] intArray0 = new int[1];
      intArray0[0] = (-1);
      iCSSearchAlgorithm_SeparationSet0.m_set = intArray0;
      iCSSearchAlgorithm_SeparationSet0.contains(1483);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      Attribute attribute0 = new Attribute("} ,");
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      iCSSearchAlgorithm0.setMaxCardinality((-534));
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("} ,", arrayList0, 0);
      arrayList0.add(attribute0);
      arrayList0.add(attribute0);
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
  public void test18()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      byte[] byteArray0 = new byte[11];
      byteArray0[0] = (byte) (-16);
      Attribute attribute0 = new Attribute("} ,");
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      iCSSearchAlgorithm0.setMaxCardinality((-534));
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("} ,", arrayList0, 0);
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