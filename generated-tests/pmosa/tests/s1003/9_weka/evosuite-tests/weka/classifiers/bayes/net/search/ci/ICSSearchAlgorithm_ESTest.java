/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 16 23:41:58 GMT 2018
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
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import weka.classifiers.bayes.BayesNet;
import weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm;
import weka.classifiers.lazy.IBk;
import weka.core.Attribute;
import weka.core.Instances;
import weka.core.ProtectedProperties;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ICSSearchAlgorithm_ESTest extends ICSSearchAlgorithm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ICSSearchAlgorithm.main(stringArray0);
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      int int0 = (-1334);
      iCSSearchAlgorithm0.setMaxCardinality((-1334));
      int[] intArray0 = new int[2];
      intArray0[0] = 200003;
      intArray0[1] = 24;
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.isConditionalIndependent(24, 200003, intArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.net.search.ci.CISearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String string0 = iCSSearchAlgorithm0.getRevision();
      assertEquals("8034", string0);
      
      iCSSearchAlgorithm0.getOptions();
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.setMaxCardinality(0);
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "%$aAf%0gf@BeWro,qeg";
      iCSSearchAlgorithm_SeparationSet0.getRevision();
      stringArray0[1] = ", using indicator values: ";
      stringArray0[2] = "!wd(Pra";
      int[] intArray0 = new int[8];
      intArray0[0] = 1542;
      intArray0[1] = 1542;
      intArray0[2] = (-1152);
      intArray0[3] = 1542;
      intArray0[4] = 0;
      intArray0[5] = 1542;
      intArray0[6] = 1542;
      intArray0[7] = 1542;
      iCSSearchAlgorithm_SeparationSet0.m_set = intArray0;
      stringArray0[3] = "[Vote] warning: no header instances for \"";
      ICSSearchAlgorithm.main(stringArray0);
      iCSSearchAlgorithm_SeparationSet0.contains(1542);
      iCSSearchAlgorithm0.globalInfo();
      iCSSearchAlgorithm0.maxCardinalityTipText();
      iCSSearchAlgorithm0.listOptions();
      boolean[][] booleanArray0 = new boolean[1][4];
      boolean[] booleanArray1 = new boolean[0];
      booleanArray0[0] = booleanArray1;
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.existsSepSet((-3734), 2000, 4768, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4768
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      boolean[][] booleanArray0 = new boolean[0][3];
      String[] stringArray0 = new String[1];
      stringArray0[0] = "$K'@fv[-BtJP";
      iCSSearchAlgorithm0.setOptions(stringArray0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.getRevision();
      boolean[][] booleanArrayArray0 = null;
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.existsSepSet(0, 0, 0, (boolean[][]) null);
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
      iCSSearchAlgorithm0.getRevision();
      int int0 = 364;
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.existsSepSet(364, (-424), 1, (boolean[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      iCSSearchAlgorithm_SeparationSet0.contains(1);
      boolean[][] booleanArray0 = new boolean[3][9];
      boolean[] booleanArray1 = new boolean[0];
      booleanArray0[0] = booleanArray1;
      boolean[] booleanArray2 = new boolean[3];
      booleanArray2[0] = false;
      booleanArray2[1] = false;
      booleanArray2[2] = false;
      booleanArray0[1] = booleanArray2;
      boolean[] booleanArray3 = new boolean[2];
      booleanArray3[0] = false;
      booleanArray3[1] = false;
      booleanArray0[2] = booleanArray3;
      ICSSearchAlgorithm.SeparationSet[][] iCSSearchAlgorithm_SeparationSetArray0 = new ICSSearchAlgorithm.SeparationSet[6][7];
      ICSSearchAlgorithm.SeparationSet[] iCSSearchAlgorithm_SeparationSetArray1 = new ICSSearchAlgorithm.SeparationSet[8];
      iCSSearchAlgorithm_SeparationSetArray1[0] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray1[1] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray1[2] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray1[3] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray1[4] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray1[5] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray1[6] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray1[7] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray0[0] = iCSSearchAlgorithm_SeparationSetArray1;
      ICSSearchAlgorithm.SeparationSet[] iCSSearchAlgorithm_SeparationSetArray2 = new ICSSearchAlgorithm.SeparationSet[6];
      iCSSearchAlgorithm_SeparationSetArray2[0] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray2[1] = iCSSearchAlgorithm_SeparationSet0;
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet1 = iCSSearchAlgorithm0.new SeparationSet();
      iCSSearchAlgorithm_SeparationSetArray2[2] = iCSSearchAlgorithm_SeparationSet1;
      iCSSearchAlgorithm_SeparationSetArray2[3] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray2[4] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray2[5] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray0[1] = iCSSearchAlgorithm_SeparationSetArray2;
      ICSSearchAlgorithm.SeparationSet[] iCSSearchAlgorithm_SeparationSetArray3 = new ICSSearchAlgorithm.SeparationSet[1];
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet2 = iCSSearchAlgorithm0.new SeparationSet();
      iCSSearchAlgorithm_SeparationSetArray3[0] = iCSSearchAlgorithm_SeparationSet2;
      iCSSearchAlgorithm_SeparationSetArray0[2] = iCSSearchAlgorithm_SeparationSetArray3;
      ICSSearchAlgorithm.SeparationSet[] iCSSearchAlgorithm_SeparationSetArray4 = new ICSSearchAlgorithm.SeparationSet[6];
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.existsSepSet(1, 1, 767, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 767
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      int[] intArray0 = new int[9];
      intArray0[0] = 92;
      intArray0[1] = (-1);
      intArray0[2] = 332;
      intArray0[3] = Integer.MAX_VALUE;
      intArray0[4] = (-322);
      intArray0[5] = 839;
      intArray0[6] = (-11);
      intArray0[7] = 10;
      intArray0[8] = (-1);
      iCSSearchAlgorithm_SeparationSet0.m_set = intArray0;
      boolean boolean0 = iCSSearchAlgorithm_SeparationSet0.contains(3046);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("+#ZkLA^<Kg6`PyU:", arrayList0, 1191);
      iCSSearchAlgorithm0.m_instances = instances0;
      boolean[][] booleanArray0 = new boolean[2][3];
      boolean[] booleanArray1 = new boolean[5];
      booleanArray1[3] = true;
      booleanArray1[1] = true;
      booleanArray1[2] = true;
      booleanArray1[3] = false;
      booleanArray1[4] = false;
      iCSSearchAlgorithm0.setMaxCardinality(1191);
      booleanArray0[0] = booleanArray1;
      ICSSearchAlgorithm iCSSearchAlgorithm1 = new ICSSearchAlgorithm();
      BayesNet bayesNet0 = new BayesNet();
      iCSSearchAlgorithm1.search(bayesNet0, iCSSearchAlgorithm0.m_instances);
      assertEquals(1191, iCSSearchAlgorithm0.getMaxCardinality());
      assertEquals(2, iCSSearchAlgorithm1.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("i@", arrayList0, 2373);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.pollLast();
      Properties properties0 = new Properties();
      ProtectedProperties protectedProperties0 = new ProtectedProperties(properties0);
      Attribute attribute0 = new Attribute("@data", linkedList0, protectedProperties0);
      arrayList0.add(attribute0);
      iCSSearchAlgorithm0.setMaxCardinality(1191);
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
  public void test10()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("+#ZkLA^<Kg6`PyU:", arrayList0, 1191);
      iCSSearchAlgorithm0.m_instances = instances0;
      boolean[] booleanArray0 = new boolean[5];
      booleanArray0[3] = true;
      booleanArray0[1] = true;
      iCSSearchAlgorithm0.setMaxCardinality(1191);
      ICSSearchAlgorithm iCSSearchAlgorithm1 = new ICSSearchAlgorithm();
      BayesNet bayesNet0 = new BayesNet();
      boolean[][] booleanArray1 = new boolean[7][4];
      booleanArray1[0] = booleanArray0;
      boolean[] booleanArray2 = new boolean[0];
      booleanArray1[1] = booleanArray2;
      booleanArray1[2] = booleanArray0;
      booleanArray1[3] = booleanArray0;
      booleanArray1[4] = booleanArray0;
      booleanArray1[5] = booleanArray0;
      booleanArray1[6] = booleanArray0;
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.existsSepSet(3376, 1191, 114, booleanArray1);
      assertNull(iCSSearchAlgorithm_SeparationSet0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("   * @param i the row to process\n", arrayList0, 1191);
      iCSSearchAlgorithm0.m_instances = instances0;
      FileSystemHandling.shouldAllThrowIOExceptions();
      boolean[][] booleanArray0 = new boolean[11][5];
      boolean[] booleanArray1 = new boolean[2];
      booleanArray1[0] = true;
      booleanArray0[0] = booleanArray1;
      boolean[] booleanArray2 = new boolean[8];
      booleanArray2[0] = true;
      booleanArray2[1] = true;
      booleanArray2[1] = true;
      booleanArray2[4] = true;
      booleanArray2[5] = true;
      booleanArray2[6] = true;
      iCSSearchAlgorithm0.existsSepSet((-14), 200, 1, booleanArray0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("+#ZkLA^<Kg6`PyU:", arrayList0, 1191);
      iCSSearchAlgorithm0.m_instances = instances0;
      boolean[] booleanArray0 = new boolean[5];
      booleanArray0[1] = false;
      iCSSearchAlgorithm0.setMaxCardinality(1191);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      arrayList0.add((Attribute) null);
      boolean[][] booleanArray1 = new boolean[7][7];
      booleanArray1[0] = booleanArray0;
      booleanArray1[1] = booleanArray0;
      booleanArray1[2] = booleanArray0;
      booleanArray1[3] = booleanArray0;
      booleanArray1[4] = booleanArray0;
      booleanArray1[5] = booleanArray0;
      booleanArray1[6] = booleanArray0;
      iCSSearchAlgorithm0.existsSepSet(0, 1191, 1191, booleanArray1);
      assertEquals(1191, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("   * @param the rw to pocess\n", arrayList0, 1171);
      iCSSearchAlgorithm0.m_instances = instances0;
      arrayList0.add((Attribute) null);
      boolean[] booleanArray0 = new boolean[9];
      arrayList0.add((Attribute) null);
      booleanArray0[0] = true;
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      boolean[][] booleanArray1 = new boolean[6][3];
      booleanArray1[0] = booleanArray0;
      iCSSearchAlgorithm0.listOptions();
      ICSSearchAlgorithm.SeparationSet[][] iCSSearchAlgorithm_SeparationSetArray0 = new ICSSearchAlgorithm.SeparationSet[2][8];
      ICSSearchAlgorithm.SeparationSet[] iCSSearchAlgorithm_SeparationSetArray1 = new ICSSearchAlgorithm.SeparationSet[4];
      iCSSearchAlgorithm_SeparationSetArray1[0] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray1[1] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray1[2] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray1[3] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray0[0] = iCSSearchAlgorithm_SeparationSetArray1;
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet1 = iCSSearchAlgorithm0.new SeparationSet();
      iCSSearchAlgorithm_SeparationSetArray0[1] = iCSSearchAlgorithm_SeparationSetArray1;
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.calcDependencyGraph(booleanArray1, iCSSearchAlgorithm_SeparationSetArray0);
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
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute("", (-2049));
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("   * @param  the row to process\n", arrayList0, 1193);
      iCSSearchAlgorithm0.m_instances = instances0;
      iCSSearchAlgorithm0.setMaxCardinality(1193);
      arrayList0.add((Attribute) null);
      int int0 = 0;
      boolean[][] booleanArray0 = new boolean[10][5];
      boolean[] booleanArray1 = new boolean[1];
      booleanArray1[0] = true;
      booleanArray0[0] = booleanArray1;
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.existsSepSet(0, 0, 236, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("   * @param  the row to process\n", arrayList0, 1196);
      iCSSearchAlgorithm0.m_instances = instances0;
      iCSSearchAlgorithm0.setMaxCardinality(1196);
      arrayList0.clear();
      arrayList0.add((Attribute) null);
      boolean[][] booleanArray0 = new boolean[9][5];
      boolean[] booleanArray1 = new boolean[2];
      booleanArray1[0] = true;
      booleanArray0[0] = booleanArray1;
      iCSSearchAlgorithm0.existsSepSet(0, 0, 1187, booleanArray0);
      iCSSearchAlgorithm0.maxn();
      boolean[][] booleanArray2 = new boolean[6][3];
      booleanArray2[0] = booleanArray1;
      booleanArray2[1] = booleanArray1;
      booleanArray2[2] = booleanArray1;
      boolean[] booleanArray3 = new boolean[7];
      booleanArray3[0] = true;
      booleanArray3[1] = true;
      booleanArray3[2] = true;
      booleanArray3[3] = true;
      booleanArray3[4] = true;
      booleanArray3[5] = true;
      booleanArray3[6] = true;
      booleanArray2[3] = booleanArray3;
      booleanArray2[4] = booleanArray1;
      booleanArray2[5] = booleanArray1;
      iCSSearchAlgorithm0.calcArcDirections(booleanArray2, booleanArray2);
      assertEquals(1196, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("   * @param  the row to pocess\n", arrayList0, 1171);
      iCSSearchAlgorithm0.m_instances = instances0;
      arrayList0.add((Attribute) null);
      boolean[][] booleanArray0 = new boolean[4][5];
      boolean[] booleanArray1 = new boolean[2];
      arrayList0.add((Attribute) null);
      booleanArray1[0] = true;
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      iCSSearchAlgorithm0.calcArcDirections(booleanArray0, booleanArray0);
      ICSSearchAlgorithm.SeparationSet[] iCSSearchAlgorithm_SeparationSetArray0 = new ICSSearchAlgorithm.SeparationSet[4];
      iCSSearchAlgorithm_SeparationSetArray0[0] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray0[1] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray0[2] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray0[3] = iCSSearchAlgorithm_SeparationSet0;
      boolean[] booleanArray2 = new boolean[6];
      booleanArray2[0] = true;
      booleanArray2[1] = false;
      booleanArray2[2] = true;
      booleanArray2[3] = true;
      booleanArray2[4] = true;
      booleanArray2[5] = true;
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.existsSepSet(1, 1187, 1187, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1187
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("   * @param  the row to pocess\n", arrayList0, 1171);
      iCSSearchAlgorithm0.m_instances = instances0;
      arrayList0.add((Attribute) null);
      boolean[][] booleanArray0 = new boolean[4][5];
      boolean[] booleanArray1 = new boolean[2];
      arrayList0.add((Attribute) null);
      booleanArray1[0] = true;
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      boolean[][] booleanArray2 = new boolean[6][3];
      booleanArray2[0] = booleanArray1;
      iCSSearchAlgorithm0.calcArcDirections(booleanArray2, booleanArray0);
      ICSSearchAlgorithm.SeparationSet[] iCSSearchAlgorithm_SeparationSetArray0 = new ICSSearchAlgorithm.SeparationSet[4];
      iCSSearchAlgorithm_SeparationSetArray0[0] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray0[1] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray0[2] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray0[3] = iCSSearchAlgorithm_SeparationSet0;
      boolean[][] booleanArray3 = new boolean[2][6];
      boolean[] booleanArray4 = new boolean[6];
      booleanArray4[0] = true;
      booleanArray4[1] = false;
      booleanArray4[2] = true;
      booleanArray4[3] = true;
      booleanArray4[4] = true;
      booleanArray4[5] = true;
      booleanArray3[0] = booleanArray4;
      booleanArray3[1] = booleanArray1;
      iCSSearchAlgorithm0.calcArcDirections(booleanArray2, booleanArray3);
      iCSSearchAlgorithm0.maxCardinalityTipText();
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.name(1158);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1158, Size: 2
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      int int0 = 1171;
      Instances instances0 = new Instances("   * @param  the row to pocess\n", arrayList0, 1171);
      iCSSearchAlgorithm0.m_instances = instances0;
      arrayList0.add((Attribute) null);
      boolean[][] booleanArray0 = new boolean[4][5];
      arrayList0.add((Attribute) null);
      arrayList0.add((Attribute) null);
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      ICSSearchAlgorithm.SeparationSet[][] iCSSearchAlgorithm_SeparationSetArray0 = new ICSSearchAlgorithm.SeparationSet[2][7];
      ICSSearchAlgorithm.SeparationSet[] iCSSearchAlgorithm_SeparationSetArray1 = new ICSSearchAlgorithm.SeparationSet[5];
      iCSSearchAlgorithm_SeparationSetArray1[0] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray1[1] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray1[2] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray1[3] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray1[4] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray0[0] = iCSSearchAlgorithm_SeparationSetArray1;
      iCSSearchAlgorithm_SeparationSetArray0[1] = iCSSearchAlgorithm_SeparationSetArray1;
      iCSSearchAlgorithm0.calcVeeNodes(booleanArray0, booleanArray0, iCSSearchAlgorithm_SeparationSetArray0);
      int int1 = (-601);
      iCSSearchAlgorithm0.setMaxCardinality((-601));
      iCSSearchAlgorithm0.setMaxCardinality((-601));
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
  public void test19()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("   * @param  the row to pocess\n", arrayList0, 1171);
      iCSSearchAlgorithm0.m_instances = instances0;
      arrayList0.add((Attribute) null);
      boolean[][] booleanArray0 = new boolean[4][5];
      arrayList0.add((Attribute) null);
      arrayList0.add((Attribute) null);
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      ICSSearchAlgorithm.SeparationSet[][] iCSSearchAlgorithm_SeparationSetArray0 = new ICSSearchAlgorithm.SeparationSet[2][7];
      ICSSearchAlgorithm.SeparationSet[] iCSSearchAlgorithm_SeparationSetArray1 = new ICSSearchAlgorithm.SeparationSet[5];
      iCSSearchAlgorithm_SeparationSetArray1[0] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray1[1] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray1[2] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray1[3] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray1[4] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray0[0] = iCSSearchAlgorithm_SeparationSetArray1;
      iCSSearchAlgorithm_SeparationSetArray0[1] = iCSSearchAlgorithm_SeparationSetArray1;
      iCSSearchAlgorithm0.calcVeeNodes(booleanArray0, booleanArray0, iCSSearchAlgorithm_SeparationSetArray0);
      arrayList0.add((Attribute) null);
      int int0 = (-601);
      iCSSearchAlgorithm0.setMaxCardinality((-601));
      iCSSearchAlgorithm0.setMaxCardinality((-601));
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