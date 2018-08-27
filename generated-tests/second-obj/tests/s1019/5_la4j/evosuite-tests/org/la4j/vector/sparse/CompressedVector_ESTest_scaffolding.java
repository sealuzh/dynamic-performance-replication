/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Jul 07 06:28:37 GMT 2018
 */

package org.la4j.vector.sparse;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class CompressedVector_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.la4j.vector.sparse.CompressedVector"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "ANSI_X3.4-1968"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.timezone", "Europe/Luxembourg"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(CompressedVector_ESTest_scaffolding.class.getClassLoader() ,
      "org.la4j.matrix.dense.Basic2DMatrix",
      "org.la4j.operation.ooplace.OoPlaceVectorsAddition",
      "org.la4j.matrix.dense.Basic1DMatrix",
      "org.la4j.matrix.functor.MatrixProcedure",
      "org.la4j.operation.VectorMatrixOperation",
      "org.la4j.matrix.SparseMatrix$2",
      "org.la4j.matrix.SparseMatrix$1",
      "org.la4j.iterator.JoinFunction",
      "org.la4j.matrix.functor.MatrixPredicate",
      "org.la4j.vector.SparseVector",
      "org.la4j.matrix.SparseMatrix$4",
      "org.la4j.matrix.SparseMatrix$3",
      "org.la4j.iterator.RowMajorMatrixIterator",
      "org.la4j.matrix.functor.MatrixAccumulator",
      "org.la4j.matrix.functor.MatrixFunction",
      "org.la4j.operation.SymmetricMatrixMatrixOperation",
      "org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct",
      "org.la4j.Vector$1",
      "org.la4j.operation.ooplace.OoPlaceMatricesSubtraction",
      "org.la4j.LinearAlgebra$DecompositorFactory",
      "org.la4j.matrix.functor.AdvancedMatrixPredicate",
      "org.la4j.LinearAlgebra",
      "org.la4j.vector.functor.VectorProcedure",
      "org.la4j.iterator.ColumnMajorMatrixIterator",
      "org.la4j.Vectors",
      "org.la4j.Vectors$1",
      "org.la4j.Vectors$2",
      "org.la4j.Vectors$3",
      "org.la4j.operation.SimpleMatrixMatrixOperation",
      "org.la4j.Vectors$4",
      "org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication",
      "org.la4j.inversion.MatrixInverter",
      "org.la4j.matrix.DenseMatrix",
      "org.la4j.operation.ooplace.OoPlaceKroneckerProduct",
      "org.la4j.Vectors$5",
      "org.la4j.Vectors$6",
      "org.la4j.Vectors$7",
      "org.la4j.Vectors$8",
      "org.la4j.vector.VectorFactory",
      "org.la4j.Vector",
      "org.la4j.iterator.CursorIterator$IteratorState",
      "org.la4j.linear.LinearSystemSolver",
      "org.la4j.iterator.JoinFunction$5",
      "org.la4j.matrix.SparseMatrix",
      "org.la4j.operation.ooplace.OoPlaceOuterProduct",
      "org.la4j.iterator.JoinFunction$3",
      "org.la4j.iterator.JoinFunction$4",
      "org.la4j.Matrix",
      "org.la4j.decomposition.MatrixDecompositor",
      "org.la4j.iterator.JoinFunction$1",
      "org.la4j.iterator.CursorIterator",
      "org.la4j.iterator.JoinFunction$2",
      "org.la4j.operation.SymmetricVectorVectorOperation",
      "org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication",
      "org.la4j.Vectors$17",
      "org.la4j.Vectors$19",
      "org.la4j.operation.VectorMatrixOperation$2",
      "org.la4j.operation.VectorMatrixOperation$1",
      "org.la4j.vector.functor.VectorFunction",
      "org.la4j.vector.sparse.CompressedVector$1",
      "org.la4j.Matrix$4",
      "org.la4j.vector.functor.VectorAccumulator",
      "org.la4j.operation.ooplace.OoPlaceMatricesMultiplication",
      "org.la4j.Matrix$2",
      "org.la4j.vector.sparse.CompressedVector$2",
      "org.la4j.Matrix$3",
      "org.la4j.matrix.ColumnMajorSparseMatrix",
      "org.la4j.Matrix$1",
      "org.la4j.operation.VectorVectorOperation$2",
      "org.la4j.operation.VectorVectorOperation$1",
      "org.la4j.LinearAlgebra$SolverFactory$2",
      "org.la4j.LinearAlgebra$SolverFactory$1",
      "org.la4j.operation.MatrixMatrixOperation$3",
      "org.la4j.LinearAlgebra$SolverFactory$6",
      "org.la4j.LinearAlgebra$SolverFactory$5",
      "org.la4j.LinearAlgebra$SolverFactory",
      "org.la4j.LinearAlgebra$SolverFactory$4",
      "org.la4j.operation.MatrixMatrixOperation$2",
      "org.la4j.LinearAlgebra$SolverFactory$3",
      "org.la4j.operation.MatrixMatrixOperation$1",
      "org.la4j.operation.CommonMatrixMatrixOperation",
      "org.la4j.LinearAlgebra$SolverFactory$8",
      "org.la4j.iterator.MatrixIterator",
      "org.la4j.LinearAlgebra$SolverFactory$7",
      "org.la4j.operation.VectorOperation",
      "org.la4j.vector.sparse.CompressedVector",
      "org.la4j.operation.MatrixVectorOperation",
      "org.la4j.iterator.CursorToVectorIterator",
      "org.la4j.iterator.VectorIterator",
      "org.la4j.vector.DenseVector",
      "org.la4j.operation.ooplace.OoPlaceMatricesAddition",
      "org.la4j.LinearAlgebra$InverterFactory$1",
      "org.la4j.LinearAlgebra$InverterFactory$2",
      "org.la4j.LinearAlgebra$InverterFactory$3",
      "org.la4j.LinearAlgebra$InverterFactory",
      "org.la4j.operation.VectorVectorOperation",
      "org.la4j.matrix.sparse.CCSMatrix$5",
      "org.la4j.matrix.sparse.CCSMatrix$4",
      "org.la4j.matrix.sparse.CCSMatrix$3",
      "org.la4j.matrix.sparse.CCSMatrix$2",
      "org.la4j.matrix.MatrixFactory",
      "org.la4j.matrix.RowMajorSparseMatrix",
      "org.la4j.LinearAlgebra$DecompositorFactory$5",
      "org.la4j.LinearAlgebra$DecompositorFactory$4",
      "org.la4j.LinearAlgebra$DecompositorFactory$3",
      "org.la4j.LinearAlgebra$DecompositorFactory$2",
      "org.la4j.LinearAlgebra$DecompositorFactory$1",
      "org.la4j.operation.ooplace.OoPlaceVectorHadamardProduct",
      "org.la4j.matrix.sparse.CRSMatrix",
      "org.la4j.operation.ooplace.OoPlaceInnerProduct",
      "org.la4j.vector.functor.VectorPredicate",
      "org.la4j.matrix.sparse.CCSMatrix",
      "org.la4j.operation.MatrixVectorOperation$3",
      "org.la4j.operation.MatrixVectorOperation$2",
      "org.la4j.operation.inplace.InPlaceCopyMatrixToMatrix",
      "org.la4j.operation.MatrixVectorOperation$1",
      "org.la4j.operation.ooplace.OoPlaceVectorsSubtraction",
      "org.la4j.iterator.CursorIterator$1",
      "org.la4j.iterator.CursorIterator$2",
      "org.la4j.LinearAlgebra$DecompositorFactory$7",
      "org.la4j.LinearAlgebra$DecompositorFactory$6",
      "org.la4j.Vectors$20",
      "org.la4j.Vectors$24",
      "org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication",
      "org.la4j.operation.MatrixOperation",
      "org.la4j.Vectors$21",
      "org.la4j.operation.MatrixMatrixOperation",
      "org.la4j.vector.dense.BasicVector"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.la4j.vector.VectorFactory", false, CompressedVector_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.la4j.vector.functor.VectorFunction", false, CompressedVector_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.la4j.vector.functor.VectorProcedure", false, CompressedVector_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(CompressedVector_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.la4j.Vector",
      "org.la4j.vector.sparse.CompressedVector",
      "org.la4j.iterator.CursorIterator$IteratorState",
      "org.la4j.iterator.CursorIterator",
      "org.la4j.LinearAlgebra$SolverFactory$1",
      "org.la4j.LinearAlgebra$SolverFactory$2",
      "org.la4j.LinearAlgebra$SolverFactory$3",
      "org.la4j.LinearAlgebra$SolverFactory$4",
      "org.la4j.LinearAlgebra$SolverFactory$5",
      "org.la4j.LinearAlgebra$SolverFactory$6",
      "org.la4j.LinearAlgebra$SolverFactory$7",
      "org.la4j.LinearAlgebra$SolverFactory$8",
      "org.la4j.LinearAlgebra$SolverFactory",
      "org.la4j.LinearAlgebra$InverterFactory$1",
      "org.la4j.LinearAlgebra$InverterFactory$2",
      "org.la4j.LinearAlgebra$InverterFactory$3",
      "org.la4j.LinearAlgebra$InverterFactory",
      "org.la4j.LinearAlgebra$DecompositorFactory$1",
      "org.la4j.LinearAlgebra$DecompositorFactory$2",
      "org.la4j.LinearAlgebra$DecompositorFactory$3",
      "org.la4j.LinearAlgebra$DecompositorFactory$4",
      "org.la4j.LinearAlgebra$DecompositorFactory$5",
      "org.la4j.LinearAlgebra$DecompositorFactory$6",
      "org.la4j.LinearAlgebra$DecompositorFactory$7",
      "org.la4j.LinearAlgebra$DecompositorFactory",
      "org.la4j.LinearAlgebra",
      "org.la4j.Vectors",
      "org.la4j.Matrix",
      "org.la4j.matrix.sparse.CCSMatrix",
      "org.la4j.vector.dense.BasicVector",
      "org.la4j.matrix.sparse.CRSMatrix",
      "org.la4j.matrix.dense.Basic2DMatrix",
      "org.la4j.Matrices",
      "org.la4j.iterator.JoinFunction",
      "org.la4j.matrix.dense.Basic1DMatrix"
    );
  }
}