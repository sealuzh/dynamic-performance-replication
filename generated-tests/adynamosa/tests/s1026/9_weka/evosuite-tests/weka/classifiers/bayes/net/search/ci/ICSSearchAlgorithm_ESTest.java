/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 17:18:23 GMT 2019
 */

package weka.classifiers.bayes.net.search.ci;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import weka.classifiers.bayes.BayesNet;
import weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm;
import weka.core.Attribute;
import weka.core.BinarySparseInstance;
import weka.core.Instance;
import weka.core.Instances;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ICSSearchAlgorithm_ESTest extends ICSSearchAlgorithm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("X ", arrayList0, 3373);
      iCSSearchAlgorithm0.m_instances = instances0;
      Attribute attribute0 = new Attribute("@data", instances0, 3373);
      arrayList0.add(attribute0);
      arrayList0.add(attribute0);
      arrayList0.add(attribute0);
      boolean[][] booleanArray0 = new boolean[7][8];
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      ICSSearchAlgorithm.SeparationSet[][] iCSSearchAlgorithm_SeparationSetArray0 = new ICSSearchAlgorithm.SeparationSet[1][1];
      ICSSearchAlgorithm.SeparationSet[] iCSSearchAlgorithm_SeparationSetArray1 = new ICSSearchAlgorithm.SeparationSet[5];
      iCSSearchAlgorithm_SeparationSetArray1[1] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray1[2] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray0[0] = iCSSearchAlgorithm_SeparationSetArray1;
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.calcVeeNodes(booleanArray0, booleanArray0, iCSSearchAlgorithm_SeparationSetArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      boolean[][] booleanArray0 = new boolean[6][8];
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("]9n[", arrayList0, 0);
      iCSSearchAlgorithm0.m_instances = instances0;
      iCSSearchAlgorithm0.setMaxCardinality(4928);
      iCSSearchAlgorithm0.existsSepSet(3411, (-43), 3411, booleanArray0);
      assertEquals(4928, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      boolean[][] booleanArray0 = new boolean[6][8];
      iCSSearchAlgorithm0.setMaxCardinality(4928);
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.existsSepSet(3411, (-43), 3411, booleanArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("", arrayList0, 3373);
      Attribute attribute0 = new Attribute(".bsi");
      arrayList0.add(attribute0);
      arrayList0.add(attribute0);
      BayesNet bayesNet0 = new BayesNet();
      arrayList0.add(attribute0);
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
  public void test04()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      int[] intArray0 = new int[6];
      intArray0[0] = (-1827);
      iCSSearchAlgorithm_SeparationSet0.m_set = intArray0;
      boolean boolean0 = iCSSearchAlgorithm_SeparationSet0.contains(3346);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      iCSSearchAlgorithm0.setMaxCardinality((-2006));
      boolean boolean0 = iCSSearchAlgorithm_SeparationSet0.contains((-2006));
      assertEquals((-2006), iCSSearchAlgorithm0.getMaxCardinality());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("]9n[", arrayList0, 100);
      iCSSearchAlgorithm0.m_instances = instances0;
      boolean[][] booleanArray0 = new boolean[9][9];
      int int0 = iCSSearchAlgorithm0.next((-1), 2554, (-1), booleanArray0);
      assertEquals(0, int0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("X ", arrayList0, 3373);
      iCSSearchAlgorithm0.m_instances = instances0;
      boolean[][] booleanArray0 = new boolean[7][8];
      int int0 = iCSSearchAlgorithm0.next(3, 0, 3, booleanArray0);
      assertEquals(4, int0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("]9n[", arrayList0, 100);
      iCSSearchAlgorithm0.m_instances = instances0;
      Attribute attribute0 = new Attribute((String) null, iCSSearchAlgorithm0.m_instances, 0);
      arrayList0.add(attribute0);
      iCSSearchAlgorithm0.name(0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("]9n[", arrayList0, 100);
      iCSSearchAlgorithm0.m_instances = instances0;
      Attribute attribute0 = new Attribute("@?\\DC(VYJg", iCSSearchAlgorithm0.m_instances);
      arrayList0.add(attribute0);
      arrayList0.add(attribute0);
      iCSSearchAlgorithm0.name(1);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("", arrayList0, 3373);
      iCSSearchAlgorithm0.m_instances = instances0;
      Attribute attribute0 = new Attribute("", ". ");
      arrayList0.add(attribute0);
      iCSSearchAlgorithm0.name(0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("", arrayList0, 100);
      iCSSearchAlgorithm0.m_instances = instances0;
      iCSSearchAlgorithm0.maxn();
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("X ", arrayList0, 3373);
      iCSSearchAlgorithm0.m_instances = instances0;
      Attribute attribute0 = new Attribute(".bsi", iCSSearchAlgorithm0.m_instances);
      arrayList0.add(attribute0);
      iCSSearchAlgorithm0.maxn();
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.setMaxCardinality((-750));
      int int0 = iCSSearchAlgorithm0.getMaxCardinality();
      assertEquals((-750), int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.setOptions((String[]) null);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String[] stringArray0 = new String[0];
      iCSSearchAlgorithm0.setOptions(stringArray0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
      
      iCSSearchAlgorithm0.setMaxCardinality(0);
      assertEquals(0, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      BayesNet bayesNet0 = new BayesNet();
      try { 
        iCSSearchAlgorithm0.search(bayesNet0, (Instances) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("Ec'.^[zI/VG(9h@y6n{", arrayList0, 100);
      iCSSearchAlgorithm0.m_instances = instances0;
      BayesNet bayesNet0 = new BayesNet();
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(2);
      instances0.add((Instance) binarySparseInstance0);
      iCSSearchAlgorithm0.search(bayesNet0, iCSSearchAlgorithm0.m_instances);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("", arrayList0, 3373);
      BayesNet bayesNet0 = new BayesNet();
      bayesNet0.setUseADTree(true);
      iCSSearchAlgorithm0.search(bayesNet0, instances0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("", arrayList0, 3373);
      Attribute attribute0 = new Attribute(".bsi");
      arrayList0.add(attribute0);
      BayesNet bayesNet0 = new BayesNet();
      bayesNet0.m_Instances = instances0;
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
  public void test21()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("]9n[", arrayList0, 100);
      BayesNet bayesNet0 = new BayesNet();
      bayesNet0.setDebug(true);
      iCSSearchAlgorithm0.search(bayesNet0, instances0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.next(5702, 5702, 1217, (boolean[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      boolean[][] booleanArray0 = new boolean[0][1];
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.next(1723, 1247, 1247, booleanArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      boolean[][] booleanArray0 = new boolean[2][9];
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.next(0, 4903, 0, booleanArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      boolean[][] booleanArray0 = new boolean[8][2];
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.next(2, (-1883), 10, booleanArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
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
  public void test27()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.name((-1002));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String[] stringArray0 = new String[3];
      ICSSearchAlgorithm.main(stringArray0);
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ICSSearchAlgorithm.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      boolean[][] booleanArray0 = new boolean[0][7];
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.existsSepSet(0, 0, (-916), booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -916
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      boolean[][] booleanArray0 = new boolean[0][1];
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.existsSepSet(4, 1, 0, booleanArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.net.search.ci.CISearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet[][] iCSSearchAlgorithm_SeparationSetArray0 = new ICSSearchAlgorithm.SeparationSet[7][2];
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.calcVeeNodes((boolean[][]) null, (boolean[][]) null, iCSSearchAlgorithm_SeparationSetArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      boolean[][] booleanArray0 = new boolean[0][9];
      ICSSearchAlgorithm.SeparationSet[][] iCSSearchAlgorithm_SeparationSetArray0 = new ICSSearchAlgorithm.SeparationSet[0][0];
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.calcVeeNodes(booleanArray0, booleanArray0, iCSSearchAlgorithm_SeparationSetArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      boolean[][] booleanArray0 = new boolean[0][0];
      ICSSearchAlgorithm.SeparationSet[][] iCSSearchAlgorithm_SeparationSetArray0 = new ICSSearchAlgorithm.SeparationSet[5][1];
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.calcDependencyGraph(booleanArray0, iCSSearchAlgorithm_SeparationSetArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.calcArcDirections((boolean[][]) null, (boolean[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      boolean[][] booleanArray0 = new boolean[0][3];
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.calcArcDirections(booleanArray0, booleanArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      boolean[][] booleanArray0 = new boolean[6][8];
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("]9n[", arrayList0, 0);
      iCSSearchAlgorithm0.m_instances = instances0;
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.next((-228), 0, (-228), booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("]9n[", arrayList0, 0);
      iCSSearchAlgorithm0.m_instances = instances0;
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.name(3384);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3384, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
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

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.existsSepSet((-1146), 4892, 1744, (boolean[][]) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1744
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("c", arrayList0, 3373);
      iCSSearchAlgorithm0.m_instances = instances0;
      Attribute attribute0 = new Attribute((String) null, iCSSearchAlgorithm0.m_instances, 0);
      arrayList0.add(attribute0);
      arrayList0.add(attribute0);
      boolean[][] booleanArray0 = new boolean[7][8];
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.calcVeeNodes(booleanArray0, booleanArray0, (ICSSearchAlgorithm.SeparationSet[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      boolean[][] booleanArray0 = new boolean[7][6];
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.calcDependencyGraph(booleanArray0, (ICSSearchAlgorithm.SeparationSet[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      boolean[][] booleanArray0 = new boolean[3][5];
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.calcArcDirections(booleanArray0, booleanArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("", arrayList0, 3373);
      iCSSearchAlgorithm0.m_instances = instances0;
      Attribute attribute0 = new Attribute(".bsi");
      arrayList0.add(attribute0);
      arrayList0.add(attribute0);
      arrayList0.add(attribute0);
      arrayList0.add(attribute0);
      boolean[][] booleanArray0 = new boolean[7][8];
      boolean[][] booleanArray1 = new boolean[3][5];
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.calcArcDirections(booleanArray1, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      boolean boolean0 = iCSSearchAlgorithm_SeparationSet0.contains((-2336));
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      boolean boolean0 = iCSSearchAlgorithm_SeparationSet0.contains(0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      int int0 = iCSSearchAlgorithm0.getMaxCardinality();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String[] stringArray0 = iCSSearchAlgorithm0.getOptions();
      iCSSearchAlgorithm0.setOptions(stringArray0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.listOptions();
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("", arrayList0, 3380);
      iCSSearchAlgorithm0.m_instances = instances0;
      Attribute attribute0 = new Attribute(".bsi");
      arrayList0.add(attribute0);
      arrayList0.add(attribute0);
      arrayList0.add(attribute0);
      arrayList0.add(attribute0);
      boolean[][] booleanArray0 = new boolean[7][8];
      boolean[] booleanArray1 = new boolean[6];
      booleanArray1[0] = true;
      booleanArray1[2] = true;
      boolean[][] booleanArray2 = new boolean[7][6];
      booleanArray2[0] = booleanArray1;
      booleanArray2[3] = booleanArray1;
      iCSSearchAlgorithm0.calcArcDirections(booleanArray2, booleanArray0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("c", arrayList0, 3373);
      ArrayList<String> arrayList1 = new ArrayList<String>();
      Attribute attribute0 = new Attribute("-cardinality <num>", arrayList1, 4896);
      arrayList0.add(attribute0);
      arrayList0.add(attribute0);
      BayesNet bayesNet0 = new BayesNet();
      arrayList0.add(attribute0);
      iCSSearchAlgorithm0.setMaxCardinality((-1601));
      arrayList0.add(attribute0);
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
  public void test52()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("", arrayList0, 3373);
      iCSSearchAlgorithm0.m_instances = instances0;
      Attribute attribute0 = new Attribute(".bsi");
      arrayList0.add(attribute0);
      arrayList0.add(attribute0);
      arrayList0.add(attribute0);
      boolean[][] booleanArray0 = new boolean[7][8];
      boolean[] booleanArray1 = new boolean[4];
      booleanArray1[0] = true;
      booleanArray1[2] = true;
      boolean[][] booleanArray2 = new boolean[3][5];
      booleanArray0[1] = booleanArray1;
      booleanArray2[2] = booleanArray1;
      iCSSearchAlgorithm0.calcArcDirections(booleanArray2, booleanArray0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      boolean[][] booleanArray0 = new boolean[5][8];
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("]9n[", arrayList0, 0);
      iCSSearchAlgorithm0.m_instances = instances0;
      iCSSearchAlgorithm0.setMaxCardinality(4928);
      arrayList0.add((Attribute) null);
      iCSSearchAlgorithm0.existsSepSet(0, 3384, 3384, booleanArray0);
      assertEquals(4928, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("", arrayList0, 3380);
      iCSSearchAlgorithm0.m_instances = instances0;
      Attribute attribute0 = new Attribute(".bsi");
      arrayList0.add(attribute0);
      arrayList0.add(attribute0);
      boolean[] booleanArray0 = new boolean[6];
      boolean[][] booleanArray1 = new boolean[7][6];
      booleanArray1[0] = booleanArray0;
      booleanArray1[1] = booleanArray0;
      iCSSearchAlgorithm0.calcDependencyGraph(booleanArray1, (ICSSearchAlgorithm.SeparationSet[][]) null);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("]9n[", arrayList0, 0);
      iCSSearchAlgorithm0.search((BayesNet) null, instances0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      int[] intArray0 = new int[6];
      intArray0[0] = (-1);
      iCSSearchAlgorithm_SeparationSet0.m_set = intArray0;
      boolean boolean0 = iCSSearchAlgorithm_SeparationSet0.contains(0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ICSSearchAlgorithm.main((String[]) null);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String string0 = iCSSearchAlgorithm0.globalInfo();
      assertEquals("This Bayes Network learning algorithm uses conditional independence tests to find a skeleton, finds V-nodes and applies a set of rules to find the directions of the remaining arrows.", string0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String string0 = iCSSearchAlgorithm0.getRevision();
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
      assertEquals("8034", string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String string0 = iCSSearchAlgorithm0.maxCardinalityTipText();
      assertEquals("When determining whether an edge exists a search is performed for a set Z that separates the nodes. MaxCardinality determines the maximum size of the set Z. This greatly influences the length of the search. Default value is 2.", string0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      String string0 = iCSSearchAlgorithm_SeparationSet0.getRevision();
      assertEquals("8034", string0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }
}