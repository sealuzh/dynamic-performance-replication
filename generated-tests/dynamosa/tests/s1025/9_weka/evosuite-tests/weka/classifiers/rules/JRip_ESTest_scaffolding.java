/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Mar 23 19:36:07 GMT 2019
 */

package weka.classifiers.rules;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class JRip_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "weka.classifiers.rules.JRip"; 
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
    java.lang.System.setProperty("user.home", "/home/ubuntu"); 
    java.lang.System.setProperty("user.dir", "/home/ubuntu/test/projects/9_weka"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(JRip_ESTest_scaffolding.class.getClassLoader() ,
      "weka.core.Environment",
      "weka.classifiers.AbstractClassifier",
      "org.pentaho.packageManagement.PackageConstraint",
      "org.pentaho.packageManagement.Package",
      "weka.core.OptionHandler",
      "weka.core.xml.XMLBasicSerialization",
      "weka.classifiers.rules.JRip",
      "weka.core.WekaException",
      "weka.classifiers.rules.RuleStats",
      "weka.core.logging.Logger$Level",
      "weka.classifiers.Classifier",
      "weka.classifiers.evaluation.output.prediction.AbstractOutput",
      "weka.core.Capabilities$Capability",
      "weka.core.SparseInstance",
      "weka.core.DenseInstance",
      "org.pentaho.packageManagement.PackageManager",
      "weka.core.WekaEnumeration",
      "weka.classifiers.rules.JRip$NominalAntd",
      "weka.filters.supervised.attribute.ClassOrder",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.classifiers.Evaluation",
      "weka.core.WekaPackageManager",
      "org.bounce.net.DefaultAuthenticator",
      "weka.filters.SupervisedFilter",
      "weka.core.TechnicalInformationHandler",
      "weka.core.Option",
      "weka.core.Utils",
      "weka.classifiers.rules.Rule",
      "weka.core.Attribute",
      "weka.core.NoSupportForMissingValuesException",
      "weka.classifiers.UpdateableClassifier",
      "weka.core.TechnicalInformation$Type",
      "weka.core.FastVector",
      "weka.core.Copyable",
      "weka.core.Capabilities",
      "weka.core.BinarySparseInstance",
      "weka.core.UnassignedDatasetException",
      "weka.clusterers.UpdateableClusterer",
      "weka.core.Summarizable",
      "weka.core.RevisionUtils",
      "weka.core.AdditionalMeasureProducer",
      "org.pentaho.packageManagement.PackageManager$1",
      "weka.core.Instance",
      "weka.core.ProtectedProperties",
      "weka.core.Drawable",
      "weka.core.AttributeStats",
      "weka.core.WeightedInstancesHandler",
      "weka.core.CapabilitiesHandler",
      "weka.core.TechnicalInformation$Field",
      "weka.classifiers.rules.JRip$NumericAntd",
      "weka.core.AbstractInstance",
      "weka.core.Instances",
      "org.pentaho.packageManagement.DefaultPackage",
      "weka.core.UnassignedClassException",
      "weka.classifiers.rules.JRip$Antd",
      "weka.core.Version",
      "weka.core.TechnicalInformation",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.classifiers.Sourcable",
      "weka.core.RevisionHandler",
      "weka.classifiers.evaluation.output.prediction.PlainText",
      "weka.core.xml.XMLSerialization",
      "weka.classifiers.xml.XMLClassifier",
      "weka.filters.Filter",
      "weka.classifiers.rules.JRip$RipperRule"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(JRip_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "weka.classifiers.AbstractClassifier",
      "weka.classifiers.rules.JRip",
      "weka.classifiers.rules.Rule",
      "weka.classifiers.rules.JRip$RipperRule",
      "weka.classifiers.rules.JRip$Antd",
      "weka.classifiers.rules.JRip$NumericAntd",
      "weka.classifiers.rules.JRip$NominalAntd",
      "weka.core.TechnicalInformation$Type",
      "weka.core.TechnicalInformation$Field",
      "weka.core.Capabilities$Capability",
      "weka.core.Utils",
      "weka.core.FastVector",
      "weka.core.Attribute",
      "weka.core.ProtectedProperties",
      "weka.core.RevisionUtils",
      "weka.core.AbstractInstance",
      "weka.core.DenseInstance",
      "weka.core.UnassignedDatasetException",
      "weka.core.SparseInstance",
      "weka.core.BinarySparseInstance",
      "weka.attributeSelection.ASEvaluation",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.attributeSelection.PrincipalComponents",
      "weka.core.Instances",
      "weka.core.TechnicalInformation",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.core.neighboursearch.CoverTree",
      "weka.core.NormalizableDistance",
      "weka.core.EuclideanDistance",
      "weka.core.Range",
      "weka.classifiers.CostMatrix",
      "weka.core.Tag",
      "weka.classifiers.lazy.IBk",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.classifiers.rules.ZeroR",
      "weka.classifiers.bayes.BayesNet",
      "weka.classifiers.bayes.net.search.SearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.K2",
      "weka.classifiers.bayes.net.estimate.BayesNetEstimator",
      "weka.classifiers.bayes.net.estimate.SimpleEstimator",
      "weka.core.Capabilities",
      "org.pentaho.packageManagement.PackageManager",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.core.Version",
      "weka.core.Environment",
      "weka.core.WekaPackageManager",
      "weka.classifiers.rules.DecisionTable",
      "weka.attributeSelection.ASSearch",
      "weka.attributeSelection.BestFirst",
      "weka.core.converters.ArffLoader$ArffReader",
      "weka.classifiers.functions.GaussianProcesses",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.classifiers.functions.supportVector.PolyKernel",
      "weka.core.SelectedTag",
      "weka.core.neighboursearch.balltrees.BallNode",
      "weka.core.Option",
      "weka.classifiers.Evaluation",
      "weka.core.WekaEnumeration",
      "weka.core.Attribute$1",
      "weka.core.SerializedObject",
      "weka.filters.Filter",
      "weka.filters.unsupervised.attribute.Remove",
      "weka.filters.supervised.attribute.ClassOrder",
      "weka.classifiers.rules.RuleStats",
      "weka.core.neighboursearch.BallTree",
      "weka.core.neighboursearch.balltrees.BallTreeConstructor",
      "weka.core.neighboursearch.balltrees.TopDownConstructor",
      "weka.core.neighboursearch.balltrees.BallSplitter",
      "weka.core.neighboursearch.balltrees.PointsClosestToFurthestChildren",
      "weka.core.tokenizers.Tokenizer",
      "weka.core.tokenizers.AlphabeticTokenizer",
      "weka.classifiers.trees.m5.M5Base",
      "weka.classifiers.rules.M5Rules",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.core.tokenizers.WordTokenizer",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeap",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeapElement",
      "weka.classifiers.meta.AttributeSelectedClassifier",
      "weka.attributeSelection.CfsSubsetEval",
      "weka.classifiers.trees.J48",
      "weka.core.UnassignedClassException",
      "weka.classifiers.IteratedSingleClassifierEnhancer",
      "weka.classifiers.RandomizableIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.LogitBoost",
      "weka.classifiers.trees.DecisionStump",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "weka.classifiers.meta.MultiClassClassifier",
      "weka.classifiers.functions.Logistic",
      "weka.core.tokenizers.NGramTokenizer",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.core.WekaException",
      "weka.core.neighboursearch.KDTree",
      "weka.core.neighboursearch.kdtrees.KDTreeNodeSplitter",
      "weka.core.neighboursearch.kdtrees.SlidingMidPointOfWidestSide",
      "weka.classifiers.trees.REPTree",
      "weka.filters.SimpleFilter",
      "weka.filters.SimpleStreamFilter",
      "weka.filters.MultiFilter",
      "weka.filters.AllFilter",
      "weka.classifiers.functions.LinearRegression",
      "weka.classifiers.meta.AdditiveRegression",
      "weka.classifiers.meta.FilteredClassifier",
      "weka.filters.supervised.attribute.AttributeSelection",
      "weka.attributeSelection.AttributeSelection",
      "weka.attributeSelection.GreedyStepwise",
      "weka.filters.supervised.attribute.Discretize",
      "weka.core.neighboursearch.balltrees.MiddleOutConstructor",
      "weka.classifiers.rules.PART",
      "weka.classifiers.rules.DecisionTable$DummySubsetEvaluator",
      "weka.core.neighboursearch.balltrees.BottomUpConstructor",
      "weka.classifiers.meta.ClassificationViaRegression",
      "weka.classifiers.trees.M5P",
      "weka.classifiers.bayes.NaiveBayesMultinomial",
      "weka.classifiers.meta.CVParameterSelection",
      "weka.classifiers.MultipleClassifiersCombiner",
      "weka.classifiers.ParallelMultipleClassifiersCombiner",
      "weka.classifiers.RandomizableParallelMultipleClassifiersCombiner",
      "weka.classifiers.meta.Stacking",
      "weka.attributeSelection.WrapperSubsetEval",
      "weka.classifiers.functions.VotedPerceptron",
      "weka.classifiers.misc.SerializedClassifier",
      "weka.core.MinkowskiDistance",
      "weka.attributeSelection.OneRAttributeEval",
      "weka.classifiers.trees.RandomTree",
      "weka.core.NoSupportForMissingValuesException",
      "weka.classifiers.functions.MultilayerPerceptron",
      "weka.filters.unsupervised.attribute.NominalToBinary",
      "weka.classifiers.functions.neural.SigmoidUnit",
      "weka.classifiers.functions.neural.LinearUnit",
      "weka.classifiers.functions.neural.NeuralConnection",
      "weka.classifiers.functions.MultilayerPerceptron$NeuralEnd",
      "weka.classifiers.meta.AdaBoostM1",
      "weka.core.AttributeStats",
      "weka.classifiers.meta.RegressionByDiscretization",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.filters.unsupervised.attribute.Discretize"
    );
  }
}
