/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 03:13:29 GMT 2019
 */

package org.freehep.math.minuit;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.freehep.math.minuit.FCNBase;
import org.freehep.math.minuit.MinimumParameters;
import org.freehep.math.minuit.MnAlgebraicVector;
import org.freehep.math.minuit.MnFcn;
import org.freehep.math.minuit.MnLineSearch;
import org.freehep.math.minuit.MnMachinePrecision;
import org.freehep.math.minuit.MnParabolaPoint;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MnLineSearch_ESTest extends MnLineSearch_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(0);
      // Undeclared exception!
      try { 
        MnLineSearch.search((MnFcn) null, (MinimumParameters) null, mnAlgebraicVector0, 0.0, (MnMachinePrecision) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnLineSearch", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1196.270865546818);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(0);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 0.0);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 0.0, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 2149.982335686064);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      // Undeclared exception!
      try { 
        MnLineSearch.search(mnFcn0, (MinimumParameters) null, (MnAlgebraicVector) null, 235.445098552, mnMachinePrecision0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnLineSearch", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(5153);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 5153);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 5153);
      // Undeclared exception!
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 5153, mnMachinePrecision0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(27);
      MinimumParameters minimumParameters0 = new MinimumParameters(77);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      // Undeclared exception!
      try { 
        MnLineSearch.search((MnFcn) null, minimumParameters0, mnAlgebraicVector0, 27, mnMachinePrecision0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Incompatible vectors
         //
         verifyException("org.freehep.math.minuit.MnUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(117);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      mnMachinePrecision0.setPrecision(0.0);
      MinimumParameters minimumParameters0 = new MinimumParameters(114);
      // Undeclared exception!
      try { 
        MnLineSearch.search((MnFcn) null, minimumParameters0, mnAlgebraicVector0, 114, mnMachinePrecision0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MinimumParameters minimumParameters0 = new MinimumParameters(67);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(67);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-691.57), (double)67, (-691.57), (-2279.97321)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 67);
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 67, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(4.126201038, 2550.12744811, 1703.46, 1703.46, 1703.46).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 3699.21459846);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(100);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 100);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 100, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-858.85288932), (-858.85288932), (-858.85288932), (-858.85288932), (-858.85288932)).when(fCNBase0).valueOf(any(double[].class));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(106);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 106);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      mnMachinePrecision0.setPrecision((-858.85288932));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-858.85288932));
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, (-1258.03902), mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-858.85288932), (-858.85288932), (-858.85288932), (-858.85288932), (-858.85288932)).when(fCNBase0).valueOf(any(double[].class));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(100);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 100);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      mnMachinePrecision0.setPrecision((-858.85288932));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-858.85288932));
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 100, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-858.85288932)).when(fCNBase0).valueOf(any(double[].class));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(100);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 100);
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-858.85288932));
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, (-1953.1234), mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-858.85288932), (-858.85288932), (-858.85288932), (-858.85288932), (-858.85288932)).when(fCNBase0).valueOf(any(double[].class));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(100);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 100);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-858.85288932));
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 100, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MinimumParameters minimumParameters0 = new MinimumParameters(67);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(67);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)67).when(fCNBase0).valueOf(any(double[].class));
      mnMachinePrecision0.setPrecision(67);
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 67);
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 67, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MinimumParameters minimumParameters0 = new MinimumParameters(67);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(67);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 67);
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 67, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-0.01790736851406131), 0.4218750000000001, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 3699.21459846);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(100);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 100);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 100, mnMachinePrecision0);
      MnParabolaPoint mnParabolaPoint1 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 629.331612, mnMachinePrecision0);
      assertFalse(mnParabolaPoint1.equals((Object)mnParabolaPoint0));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-858.85288932), (-858.85288932), (-858.85288932), (-840.6182184774368), (-840.6182184774368)).when(fCNBase0).valueOf(any(double[].class));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(100);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 100);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      mnMachinePrecision0.setPrecision(0.0);
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-858.85288932));
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, (-858.85288932), mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }
}
