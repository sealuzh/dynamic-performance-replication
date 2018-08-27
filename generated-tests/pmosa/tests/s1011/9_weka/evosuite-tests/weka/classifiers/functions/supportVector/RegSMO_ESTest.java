/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 21:27:57 GMT 2018
 */

package weka.classifiers.functions.supportVector;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import weka.attributeSelection.PrincipalComponents;
import weka.classifiers.bayes.BayesNet;
import weka.classifiers.functions.supportVector.Kernel;
import weka.classifiers.functions.supportVector.RegSMO;
import weka.classifiers.functions.supportVector.SMOset;
import weka.classifiers.lazy.kstar.KStarConstants;
import weka.core.Attribute;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.neighboursearch.KDTree;
import weka.core.tokenizers.WordTokenizer;
import weka.filters.AllFilter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RegSMO_ESTest extends RegSMO_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(2521, 1.5962214466999998E-7, 2521, 1.5962214466999998E-7, 2521, 2521, 2521, 2521, 1.5962214466999998E-7, 1860.844, (-275.000948231362));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "\"XOt6,P0#EUE ";
      stringArray0[1] = "+v!Z|#Y";
      String string0 = "";
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(578, 1.0E-12, 578, 1.0E-12, 578, 1.0E-12, 0.0, 0.0, 578, 1.0E-12, 0.0);
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
      String[] stringArray0 = new String[7];
      stringArray0[0] = "weka.classifiers.functions.SGD";
      stringArray0[1] = "everything";
      stringArray0[2] = "Controls";
      stringArray0[3] = "";
      regSMO0.globalInfo();
      stringArray0[4] = "";
      stringArray0[5] = "eiiHqw40s}H.d";
      stringArray0[6] = "26]t!(g";
      try { 
        Kernel.forName("", stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Can't find class called: 
         //
         verifyException("weka.core.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.toString();
      double double0 = regSMO0.getEpsilon();
      assertEquals(1.0E-12, double0, 0.01);
      
      boolean boolean0 = regSMO0.findOptimalPointOnLine((-4787), 0.0, 0.0, 1.0E-12, (-4787), (-4787), 2277.905547, 0.0, 1.0E-12, 0.0, (-4787));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      WordTokenizer wordTokenizer0 = new WordTokenizer();
      RegSMO regSMO0 = new RegSMO();
      regSMO0.getOptions();
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "{1Ws}/q7U";
      stringArray0[1] = "RN+!21/>|BbkW5";
      stringArray0[2] = "Hvc+';m4mx";
      regSMO0.getRevision();
      stringArray0[3] = "n {Rus";
      stringArray0[4] = "U=ypts[di/L@FW";
      stringArray0[5] = "L%Z_xPx)`AgITWi_";
      regSMO0.setOptions(stringArray0);
      int int0 = 0;
      // Undeclared exception!
      try { 
        regSMO0.secondChoiceHeuristic(0);
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
      String[] stringArray0 = new String[1];
      stringArray0[0] = ".MH$-7*4nd^BR";
      regSMO0.setOptions(stringArray0);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double double0 = (-706.65903);
      regSMO0.listOptions();
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
  public void test08()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.getScore();
      regSMO0.m_eps = (-706.65903);
      regSMO0.epsilonTipText();
      regSMO0.epsilonTipText();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine((-836), 0.0, (-1495.7013999448359), 2.0, (-836), 0.0, 778.44471428, (-1889.35453528), (-836), 4256.3208436, (-836));
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
        regSMO0.findOptimalPointOnLine(0, 0, 0, 0, 0, 0, 0, 0, 0, 1860.844, (-275.000948231362));
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
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(3, 1145.11926, 1145.11926, 1145.11926, (-2141483644), (-2141483644), 3, 3, 3, 1145.11926, (-1640.628761));
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
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(0, 0, 0, 0, 0, 0, 0, 0, 0, 1860.844, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[13];
      regSMO0.m_alpha = doubleArray0;
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine((-16), 0.28877392170369437, 0.28877392170369437, 0.28877392170369437, (-16), (-16), (-16), (-16), 0.28877392170369437, 0.28877392170369437, 0.28877392170369437);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -16
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      int int0 = (-5054);
      int int1 = (-387);
      double double0 = (-1138.26948694);
      double double1 = 670.259320756189;
      double double2 = 0.0;
      try { 
        regSMO0.takeStep((-5054), (-387), (-1138.26948694), 670.259320756189, 0.0);
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
      String[] stringArray0 = new String[6];
      stringArray0[0] = "\"XOt6,P0#EUE ";
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine((-100), (-100), 578, (-836.0), (-1), 1834.2180161661, 1.0E-12, (-1749.6252197129497), (-100), 1834.2180161661, (-100));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "\"XOt6,P0#EUE ";
      RegSMO regSMO1 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO1.findOptimalPointOnLine(578, 3.4, 923.8475372, 1.0E-12, 59, 778.44471428, 778.44471428, 923.8475372, 679.72, 1.0E-12, 923.8475372);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(0, 1.5962214466999998E-7, 0, 1.5962214466999998E-7, 0, 0, 0, 0, 1.5962214466999998E-7, 1860.844, (-275.000948231362));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine((-2789), 100.0, (-2.146667637E9), 100.0, 3, (-2.146667637E9), 100.0, (-2.146667637E9), 3, 100.0, (-2.146667637E9));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "Couldn't compress nominal attribute value - storing uncompressed.";
      regSMO0.getScore();
      regSMO0.epsilonTipText();
      regSMO0.epsilonTipText();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine((-836), (-836), 0.0, (-836), (-100), 0.0, 4256.3208436, 578.0, (-1495.7013999448359), 1416.7, (-100));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.getScore();
      regSMO0.epsilonTipText();
      regSMO0.epsilonTipText();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(2935, 0.0, 1937.970036640758, 133.21029403, 969, (-1536.2427274929678), 4274.111112264715, 2.0, Double.POSITIVE_INFINITY, 679.719999999999, (-1495.7013999448359));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.getScore();
      regSMO0.epsilonTipText();
      regSMO0.epsilonTipText();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(2, 1083.2825, 1937.380696916012, 2.0, 2, (-836), 778.44471428, 778.44471428, (-0.002), 2176.42405491094, 1.0E-5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      int int0 = 3155;
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(3155, 3155, 3155, 3155, 3155, (-4336.89), 3155, 2848.578036017, (-433.389425706), 3155, 3155);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.m_alpha1 = 0.0;
      RegSMO regSMO1 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO1.findOptimalPointOnLine(59, 1596.2214467, 1.0E-12, 2848.578036017, 59, 1419.524968307, 3.4, 1596.2214467, 3.399999999999, 1.0E-12, (-836.0));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(1196, 1196, 1196, 1.7976931348623157E308, 1196, 1196, 3, 1196, 3, 2410.0, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      RegSMO regSMO0 = new RegSMO();
      int int0 = KStarConstants.ROOT_FINDER_MAX_ITER;
      regSMO0.takeStep(40, 40, 1972.2486794435226, 40, 1972.2486794435226);
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(40, 0, 40, 1972.2486794435226, 0, 1223.0, 351.0, 923.847537200001, 351.0, 1223.0, 40);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.getTechnicalInformation();
      RegSMO regSMO1 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(2617, 3.399999999999, 2.0, 1.47965729E-7, (-777), (-84.0584405), (-99.0), 59, 2042.6051792239114, 2193.0482, 2193.0482);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine((-2294), 1.5962214466999998E-7, (-2294), 1.5962214466999998E-7, (-2294), (-2294), (-2294), (-2294), 1.5962214466999998E-7, 1888.3321874547455, 1888.3321874547455);
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
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(4286229, 4286229, 4286229, 1147.205256551657, 70, 4286229, 4286229, 4286229, 70, 2306.455662056, (-2.0));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.getScore();
      regSMO0.epsilonTipText();
      regSMO0.epsilonTipText();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine((-848), 0.0, 0.0, 1937.380696916012, (-1208), (-0.002), (-1524.0), 1937.380696916012, 1546.18, 1000.0, 1546.18);
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
      regSMO0.m_alpha1 = 0.0;
      RegSMO regSMO1 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO1.findOptimalPointOnLine(59, 1596.2214467, 1.0E-12, 2848.578036017, 59, 1419.524968307, 1.0E-12, 1596.2214467, 3.399999999999, 1.0E-12, (-836.0));
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
      regSMO0.getScore();
      regSMO0.epsilonTipText();
      regSMO0.epsilonTipText();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine((-848), 0.0, 0.0, 2907.5, (-1208), 0.0, (-1524.0), 2907.5, 1546.18, 1000.0, (-99.0));
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
      double[] doubleArray0 = new double[2];
      regSMO0.m_alpha = null;
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(0, 1.0E-12, 1.0E-12, 1.0E-12, 0, 0, 0, 0, 1.0E-12, 1.0E-12, 1.0E-12);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.getScore();
      RegSMO regSMO1 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(59, 1.0E-12, 1.5962214466999998E-7, 679.72, (-2678), 0.2, 1.0E-12, 2283.0, 59, 923.8475372, 55.600000000001);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(1, 1, 1, 1, 1, 1, 1, 1300.08154657339, 1300.08154657339, 1, 1300.08154657339);
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
      regSMO0.getScore();
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = 0.0;
      doubleArray0[6] = 0.0;
      regSMO0.m_error = doubleArray0;
      regSMO0.m_alpha1 = 0.0;
      FileSystemHandling.shouldAllThrowIOExceptions();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "0g6RJvvO^";
      RegSMO regSMO1 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO1.findOptimalPointOnLine(59, 1596.2214467, 4256.3208436, 903.5972, 59, 1.0E-12, (-836.0), 5.0, 1.0E-12, 2.0, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(0, (-64.832025330612), 0, 0, 0, 0, 0, 0, 0, 1608.998575674253, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double double0 = regSMO0.m_alpha2;
      regSMO0.epsilonTipText();
      double double1 = 1479.65729;
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine((-836), 1.0E-12, 9.999999999E-13, (-1889.4), (-836), 0.0, 0.0, (-1889.4), 1222.871, 1479.65729, 9.999999999E-13);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double double0 = KStarConstants.INITIAL_STEP;
      regSMO0.takeStep((-1847649399), (-1847649399), 555.00662, 90.0058381, 0.05);
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine((-1847649399), (-1178.7256), 90.0058381, 90.0058381, (-1847649399), 0.05, 4.5, 679.72, 35.3, 0.05, 679.72);
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
      int int0 = 3155;
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(3155, 3155, 478.851183950625, 3155, 3155, (-4336.89), 478.851183950625, 2848.578036017, (-433.389425706), 3155, 3155);
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
      RegSMO regSMO1 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO1.findOptimalPointOnLine(3155, 3155, 478.851183950625, 3155, 3155, (-4336.89), 478.851183950625, 2848.578036017, (-433.389425706), 3155, 3155);
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
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 1.5;
      regSMO0.m_alpha = doubleArray0;
      // Undeclared exception!
      try { 
        regSMO0.secondChoiceHeuristic(1);
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
      doubleArray0[0] = 1.0E-12;
      regSMO0.m_alpha = doubleArray0;
      int int0 = regSMO0.secondChoiceHeuristic((-403));
      assertEquals(0, int0);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[13];
      regSMO0.m_alpha = doubleArray0;
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(3, 0.28877392170369437, 0.28877392170369437, 0.28877392170369437, 3, 3, 3, 3, 0.28877392170369437, 0.28877392170369437, 0.28877392170369437);
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
      double[] doubleArray0 = new double[5];
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (-1.0);
      doubleArray1[1] = (-2394.2372141);
      doubleArray1[2] = (-1560.0);
      doubleArray1[3] = (-1966.63480890048);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "Gx;}14LV@");
      doubleArray1[4] = (-1637.273353603349);
      doubleArray1[5] = 93.83893875649964;
      doubleArray1[6] = 1769.682826446;
      doubleArray1[7] = 928.2212765079994;
      regSMO0.m_alphaStar = doubleArray1;
      doubleArray0[0] = 1.2;
      regSMO0.m_alpha = doubleArray0;
      int int0 = regSMO0.secondChoiceHeuristic(24);
      assertEquals((-1), int0);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[2];
      regSMO0.m_alphaStar = doubleArray0;
      double[] doubleArray1 = new double[3];
      regSMO0.m_eps = 198.02;
      doubleArray1[0] = 198.02;
      regSMO0.m_alpha = doubleArray1;
      regSMO0.secondChoiceHeuristic(837);
      regSMO0.m_target = regSMO0.m_alpha;
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
  public void test46()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 27.342919385430573;
      doubleArray1[1] = (-2394.2372141);
      doubleArray1[2] = (-1560.0);
      doubleArray1[3] = (-1966.63480890048);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "Gx;}14LV@");
      doubleArray1[4] = (-2126.653099446);
      doubleArray1[5] = 93.83893875649964;
      doubleArray1[6] = 1769.682826446;
      doubleArray1[2] = 928.2212765079994;
      regSMO0.m_alphaStar = doubleArray1;
      doubleArray0[0] = 1.2;
      regSMO0.m_alpha = doubleArray0;
      int int0 = regSMO0.secondChoiceHeuristic(24);
      assertEquals((-1), int0);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[2];
      regSMO0.m_alphaStar = doubleArray0;
      double[] doubleArray1 = new double[3];
      regSMO0.m_eps = 198.02;
      doubleArray0[0] = 198.02;
      regSMO0.m_alpha = doubleArray1;
      regSMO0.secondChoiceHeuristic(841);
      regSMO0.m_target = regSMO0.m_alpha;
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
  public void test48()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[13];
      regSMO0.m_alpha = doubleArray0;
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(3, 125.3058381, 0.1, 3, 19, 19, 2333.3253, (-1989.0), 19, 1441.3494, 1441.3494);
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
      double[] doubleArray0 = new double[13];
      regSMO0.m_alpha = doubleArray0;
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(3, (-51.01008901832546), (-51.01008901832546), (-51.01008901832546), 3, 1.0E-12, 1562.269, 3, 3, 1.0E-12, (-51.01008901832546));
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
      double[] doubleArray0 = new double[13];
      regSMO0.getTechnicalInformation();
      regSMO0.m_alpha = doubleArray0;
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(3, (-51.01008901832546), 3, (-51.01008901832546), 3, 3, 0.05, 3, (-51.01008901832546), 2787.3789365679913, 3);
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
      double[] doubleArray0 = new double[13];
      regSMO0.getTechnicalInformation();
      regSMO0.m_alpha = doubleArray0;
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(3, 3, (-248.021), (-1381.2047), 3, (-1119.19397335989), (-1381.2047), 3444.982675335, 2443.6038945921, 3790.0, (-0.5));
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
      double[] doubleArray0 = new double[13];
      regSMO0.m_alpha = doubleArray0;
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(3, 2787.3789365679913, 0.05, 2787.3789365679913, 3, 1.0E-12, 1562.269, 3, 3, 1.0E-12, (-51.01008901832546));
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
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, false);
      RegSMO regSMO0 = new RegSMO();
      int[] intArray0 = new int[0];
      regSMO0.setEpsilonParameter((-2901.4618352722));
      double[] doubleArray0 = new double[0];
      regSMO0.m_alpha2 = 1.7976931348623157E308;
      regSMO0.m_alphaStar = doubleArray0;
      regSMO0.m_target = doubleArray0;
      regSMO0.m_sparseIndices = intArray0;
      regSMO0.getRevision();
      BayesNet bayesNet0 = new BayesNet();
      bayesNet0.measureEntropyScore();
      regSMO0.m_classIndex = 1;
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("+l;@=?Us", arrayList0, 2398);
      bayesNet0.m_Instances = instances0;
      Instances instances1 = bayesNet0.m_Instances;
      regSMO0.m_data = instances1;
      regSMO0.getRevision();
      regSMO0.optimize();
      regSMO0.epsilonTipText();
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
  public void test54()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[13];
      regSMO0.m_alpha = doubleArray0;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "A tutorial on support vector regression");
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(2, 1.0, (-1084.824589944259), 1.0, 2, 573.1775023822, (-0.002), 1000.0, 0.0, 1.0, (-1926.3));
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
      double[] doubleArray0 = new double[2];
      regSMO0.m_alpha = doubleArray0;
      regSMO0.m_alphaStar = regSMO0.m_alpha;
      regSMO0.m_target = doubleArray0;
      regSMO0.optimize();
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }
}