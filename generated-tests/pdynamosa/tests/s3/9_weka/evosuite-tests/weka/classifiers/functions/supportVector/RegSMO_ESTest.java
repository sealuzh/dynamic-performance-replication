/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 11:30:57 GMT 2019
 */

package weka.classifiers.functions.supportVector;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import weka.classifiers.functions.supportVector.RegSMO;
import weka.core.Attribute;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.SparseInstance;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RegSMO_ESTest extends RegSMO_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-340.29624);
      regSMO0.m_target = doubleArray0;
      regSMO0.m_alphaStar = doubleArray0;
      regSMO0.m_alpha = regSMO0.m_alphaStar;
      regSMO0.optimize();
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[5];
      regSMO0.m_target = doubleArray1;
      doubleArray0[0] = (-340.29624);
      regSMO0.m_alpha = doubleArray0;
      try { 
        regSMO0.optimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.m_nInstances = 0;
      try { 
        regSMO0.optimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[1];
      regSMO0.m_alpha = doubleArray0;
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = 2.147483647E9;
      regSMO0.m_alphaStar = doubleArray1;
      int int0 = regSMO0.secondChoiceHeuristic(10001);
      assertEquals((-1), int0);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[10];
      doubleArray0[0] = (-16.836116108300754);
      regSMO0.m_alphaStar = doubleArray0;
      int int0 = regSMO0.secondChoiceHeuristic(0);
      assertEquals((-1), int0);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.m_alpha = regSMO0.m_alphaStar;
      double[] doubleArray0 = new double[9];
      regSMO0.m_alpha = doubleArray0;
      doubleArray0[0] = 2244.242790747056;
      // Undeclared exception!
      try { 
        regSMO0.secondChoiceHeuristic(59);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.m_alpha = null;
      double[] doubleArray0 = new double[9];
      regSMO0.m_alpha = doubleArray0;
      doubleArray0[0] = (-3123.174267659);
      // Undeclared exception!
      try { 
        regSMO0.secondChoiceHeuristic(39);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(80, 0.0, 0.0, 2.147483647E9, (-1756), 1455.9340501948825, (-2042), 1684.221961086271, 0.0, 80, 342.0848038);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(0, 2.147483647E9, 1.0E-12, 1.0E-12, 0, (-1075.765775929), 0, 0.5208826621566309, 2009.326508, 3428.8, 1.0E-12);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine((-1960), (-1960), 0.0, 0.0, (-1960), (-279.98088), (-279.98088), 0.0, (-279.98088), 1.0E-12, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[1];
      regSMO0.m_target = doubleArray0;
      regSMO0.m_alphaStar = regSMO0.m_target;
      regSMO0.m_alpha = doubleArray0;
      try { 
        regSMO0.examineExample(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.setEpsilon((-43.98006193418217));
      double double0 = regSMO0.getEpsilon();
      assertEquals((-43.98006193418217), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      try { 
        regSMO0.takeStep((-350), (-905), (-905), (-99.0), 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      try { 
        regSMO0.takeStep(1063, 0, 1063, 0.0, 0.001);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      try { 
        regSMO0.takeStep(0, 2312, (-435.0), 2.147483647E9, (-3332.03884089));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.setOptions((String[]) null);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      String[] stringArray0 = new String[0];
      regSMO0.setOptions(stringArray0);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
      
      regSMO0.setEpsilon(0.0);
      double double0 = regSMO0.getEpsilon();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.setEpsilon(2531.393991);
      assertEquals(2531.393991, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      try { 
        regSMO0.init((Instances) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // SVM not initialized in optimizer. Use RegOptimizer.setSVMReg()
         //
         verifyException("weka.classifiers.functions.supportVector.RegOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      RegSMO regSMO0 = new RegSMO();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("Use heuristic that avoids cross-validating the number of Logit-Boost iterations at every node. When fitting the logistic regression functions at a node, LMT has to determine the number of LogitBoost iterations to run. Originally, this number was cross-validated at every node in the tree. To save time, this heuristic cross-validates the number only once and then uses that number at every node in the tree. Usually this does not decrease accuracy but improves runtime considerably.", arrayList0, 109);
      SparseInstance sparseInstance0 = new SparseInstance(109, doubleArray0);
      instances0.add((Instance) sparseInstance0);
      try { 
        regSMO0.init(instances0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // SVM not initialized in optimizer. Use RegOptimizer.setSVMReg()
         //
         verifyException("weka.classifiers.functions.supportVector.RegOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      boolean boolean0 = regSMO0.findOptimalPointOnLine((-3339), 19.0, 19.0, (-3339), (-3339), (-3249.31941), 0.002, 956.19881975, (-3249.31941), (-1592.400512), (-3339));
      assertFalse(boolean0);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      boolean boolean0 = regSMO0.findOptimalPointOnLine(0, 0, 0.0, 0, 0, 0, 763.542064, 1004.4007749245, (-966.0), 0, 763.542064);
      assertFalse(boolean0);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      try { 
        regSMO0.buildClassifier((Instances) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // SVM not initialized in optimizer. Use RegOptimizer.setSVMReg()
         //
         verifyException("weka.classifiers.functions.supportVector.RegOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.m_nInstances = 0;
      // Undeclared exception!
      try { 
        regSMO0.secondChoiceHeuristic((-225));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("Use heuristic that avoids cross-validating the number of Logit-Boost iterations at every node. When fitting the logistic regression functions at a node, LMT has to determine the number of LogitBoost iterations to run. Originally, this number was cross-validated at every node in the tree. To save time, this heuristic cross-validates the number only once and then uses that number at every node in the tree. Usually this does not decrease accuracy but improves runtime considerably.", arrayList0, 109);
      try { 
        regSMO0.init(instances0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // SVM not initialized in optimizer. Use RegOptimizer.setSVMReg()
         //
         verifyException("weka.classifiers.functions.supportVector.RegOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[0];
      regSMO0.m_alpha = doubleArray0;
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(1, (-1313.6271175165), 0.0, (-2520.2671312), 1, 0.0, (-1560.3597927), (-1560.3597927), 2244.242790747056, 1098, 1941.529451053);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      try { 
        regSMO0.examineExample((-273));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[7];
      regSMO0.m_target = doubleArray0;
      try { 
        regSMO0.examineExample(703);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 703
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.m_alpha = regSMO0.m_alpha;
      double[] doubleArray0 = new double[9];
      regSMO0.m_alpha = doubleArray0;
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(0, 1413.476432178, 1413.476432178, 2048.11605545175, 0, 2244.242790747056, 1505.89638, 4180.6312, (-1.0), 1413.476432178, 2048.11605545175);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(2146682162, 2009.326508, 1.0, 2146682162, 2146682162, 1161.6994588, 2009.326508, 2009.326508, 323.631199703, 1145.0471731, 1161.6994588);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.m_nInstances = 115;
      try { 
        regSMO0.optimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.m_C = 103.919460150241;
      double[] doubleArray0 = new double[11];
      doubleArray0[0] = 1.0;
      regSMO0.m_alphaStar = doubleArray0;
      int int0 = regSMO0.secondChoiceHeuristic(0);
      assertEquals(0, int0);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[11];
      doubleArray0[0] = 1.0;
      regSMO0.m_alphaStar = doubleArray0;
      int int0 = regSMO0.secondChoiceHeuristic(0);
      assertEquals((-1), int0);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.m_alpha = null;
      double[] doubleArray0 = new double[9];
      regSMO0.m_C = 0.8378109993673094;
      regSMO0.m_alpha = doubleArray0;
      doubleArray0[0] = 0.8378109993673094;
      // Undeclared exception!
      try { 
        regSMO0.secondChoiceHeuristic((-666));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.m_alpha = null;
      double[] doubleArray0 = new double[9];
      regSMO0.m_alpha = doubleArray0;
      doubleArray0[0] = 0.8378109993673094;
      int int0 = regSMO0.secondChoiceHeuristic((-666));
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[9];
      regSMO0.m_alphaStar = doubleArray0;
      regSMO0.m_alpha = doubleArray0;
      int int0 = regSMO0.secondChoiceHeuristic(69);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      int int0 = regSMO0.takeStep(98, 98, 98, 3032.3632538, 98);
      assertEquals(0, int0);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      try { 
        regSMO0.takeStep((-1908), (-56), 0.0, (-492.068697922), 3501.41876544);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[8];
      regSMO0.m_alpha = doubleArray0;
      regSMO0.m_alphaStar = regSMO0.m_alpha;
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(0, (-1152.456395889), (-659.0), 4746.6, 0, (-659.0), 3713.9430044, (-4.57826535), (-97.70358127319246), 3713.9430044, (-45.0));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[8];
      regSMO0.m_alpha = doubleArray0;
      regSMO0.m_alphaStar = regSMO0.m_alpha;
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(0, 0, 2495.088, (-0.4375), 0, 137.444001527, (-0.4375), 4746.6, 5.7, 2653.21452902, 4746.6);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.m_alpha = null;
      double[] doubleArray0 = new double[9];
      regSMO0.m_alpha = doubleArray0;
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(0, (-408.68729582841), 1456.9340494002352, 3370.735285, (-100), 1456.9340494002352, 3370.735285, 22.900984026632, 3370.735285, 4.94E-321, (-2171.73321316047));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[1];
      regSMO0.m_alpha = doubleArray0;
      regSMO0.m_alphaStar = regSMO0.m_alpha;
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(0, 1.0E-12, 0, 1.0E-12, 0, 0, 1255.04308179, 0, 2878.9155401, 1.0E-12, 1255.04308179);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[1];
      regSMO0.m_alpha = doubleArray0;
      regSMO0.m_alphaStar = regSMO0.m_alpha;
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(0, 4.9E-324, 1.0E-12, 1.0E-12, 0, 2009.326508, 0, 0.5208826621566309, 2009.326508, 2009.326508, 1.0E-12);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[1];
      regSMO0.m_alpha = doubleArray0;
      regSMO0.m_alphaStar = regSMO0.m_alpha;
      boolean boolean0 = regSMO0.findOptimalPointOnLine(0, 2.147483647E9, 1.0E-12, 1.0E-12, 0, 1.0E-12, 0, 0.5208826621566309, 1.0E-12, 1.0E-12, 1.0E-12);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[8];
      regSMO0.m_alpha = doubleArray0;
      regSMO0.m_alphaStar = regSMO0.m_alpha;
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(0, 0, 2022.808813265, (-0.4375), 0, (-97.70358127319246), (-0.4375), 4746.6, 5.7, 2653.21452902, 4746.6);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine((-1960), (-4541.912696716591), 1033.909891817034, 2244.242790747056, (-1960), 0.1, 1455.9340501948825, 0.002, (-8.158502310221941), 1214.3443, (-1626.0));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine((-1960), 5.3, 2048.11605545175, 1.0E-12, (-1960), 1.0, 0.0, 2520.2671312, 1.0E-12, 1035.228023241539, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine((-2042), 0.0, (-249.0), 1653.384, (-2042), 0.0, 0.0, 1.7976931348623157E308, 0.0, 1.0E-12, 2.147483647E9);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(944635154, 365.18966, 944635154, 5.3, (-4396), (-601.73), 838.3807187742059, 944635154, (-1960), 838.3807187742059, 2.009326508E-7);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(77, 0.2146682162, 0.2146682162, 1.7976931348623157E308, 77, 77, 591.4044, 300.0, 77, 631.4912894, 591.4044);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(0, 1.0E75, 1.0E75, 731.4173964, 0, 1.0E75, 47.0, 4.9E-324, 0.5208826621566309, 1.0E75, 1.0E75);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(1, 834.0, 904.0, 834.0, 0, 1505.89638, 834.0, 834.0, 904.0, 1, 5.3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(0, 2.147483647E9, (-0.10318927233966788), (-0.10318927233966788), 0, (-1075.765775929), 0, 0.5208826621566309, (-1292.099227510427), 3428.8, (-0.10318927233966788));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(0, 0.5208826621045427, 2.147483647E9, 5712.448982, (-796), 0, 0, 0, 0, 4.82042507E8, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine((-4939), 0.0, (-1034.318669995), 2022.655291621119, 33, 365.18966, 1238.6, 1554.443832969767, (-206.99500052), 2401.0, (-1486.1989176076374));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(115, 0.0, 115, 1.7976931348623157E308, (-1419), (-1.0E-6), 115, 5.5, (-1419), 2520.2671309479733, (-1.0E-6));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(32, (-54.85054445), 945.0, 945.0, 32, (-54.85054445), 0.289, 5093.344824192518, (-54.85054445), 32, (-1305.91));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      String[] stringArray0 = regSMO0.getOptions();
      regSMO0.setOptions(stringArray0);
      assertEquals(6, stringArray0.length);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.listOptions();
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      String string0 = regSMO0.globalInfo();
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
      assertEquals("Implementation of SMO for support vector regression as described in :\n\nA.J. Smola, B. Schoelkopf (1998). A tutorial on support vector regression.", string0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      try { 
        regSMO0.wrapUp();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      String string0 = regSMO0.getRevision();
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
      assertEquals("8034", string0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      String string0 = regSMO0.epsilonTipText();
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
      assertEquals("The epsilon for round-off error (shouldn't be changed).", string0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double double0 = regSMO0.getEpsilon();
      assertEquals(1.0E-12, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.getTechnicalInformation();
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("\tThe epsilon for round-off error.\n\t(default 1.0e-12)", arrayList0, 2);
      try { 
        regSMO0.buildClassifier(instances0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // SVM not initialized in optimizer. Use RegOptimizer.setSVMReg()
         //
         verifyException("weka.classifiers.functions.supportVector.RegOptimizer", e);
      }
  }
}