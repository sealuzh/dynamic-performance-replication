/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Mar 24 01:18:23 GMT 2019
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
      "weka.core.Attribute$1",
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
      "weka.core.SerializedObject",
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
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.classifiers.rules.ZeroR",
      "weka.core.AbstractInstance",
      "weka.core.DenseInstance",
      "weka.core.UnassignedDatasetException",
      "weka.core.ProtectedProperties",
      "weka.core.Attribute",
      "weka.classifiers.CostMatrix",
      "weka.core.RevisionUtils",
      "weka.classifiers.bayes.BayesNet",
      "weka.classifiers.bayes.net.search.SearchAlgorithm",
      "weka.core.Tag",
      "weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.K2",
      "weka.classifiers.bayes.net.estimate.BayesNetEstimator",
      "weka.classifiers.bayes.net.estimate.SimpleEstimator",
      "weka.core.TechnicalInformation",
      "weka.core.SparseInstance",
      "weka.classifiers.rules.DecisionTable",
      "weka.attributeSelection.ASSearch",
      "weka.attributeSelection.BestFirst",
      "weka.core.Range",
      "weka.core.BinarySparseInstance",
      "weka.core.Capabilities",
      "org.pentaho.packageManagement.PackageManager",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.core.Version",
      "weka.core.Environment",
      "weka.core.WekaPackageManager",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.core.WekaEnumeration",
      "weka.core.Attribute$1",
      "weka.filters.Filter",
      "weka.filters.supervised.attribute.ClassOrder",
      "weka.core.Instances",
      "weka.core.converters.ArffLoader$ArffReader",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.core.neighboursearch.BallTree",
      "weka.core.NormalizableDistance",
      "weka.core.EuclideanDistance",
      "weka.core.neighboursearch.balltrees.BallTreeConstructor",
      "weka.core.neighboursearch.balltrees.TopDownConstructor",
      "weka.core.neighboursearch.balltrees.BallSplitter",
      "weka.core.neighboursearch.balltrees.PointsClosestToFurthestChildren",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeap",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeapElement",
      "weka.core.SerializedObject",
      "weka.attributeSelection.ASEvaluation",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.attributeSelection.PrincipalComponents",
      "weka.core.neighboursearch.balltrees.BallNode",
      "weka.core.Option",
      "weka.classifiers.lazy.IBk",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.classifiers.rules.RuleStats",
      "weka.classifiers.Evaluation",
      "weka.core.neighboursearch.CoverTree",
      "weka.core.neighboursearch.balltrees.BottomUpConstructor",
      "weka.core.neighboursearch.KDTree",
      "weka.core.neighboursearch.kdtrees.KDTreeNodeSplitter",
      "weka.core.neighboursearch.kdtrees.SlidingMidPointOfWidestSide",
      "weka.classifiers.functions.LinearRegression",
      "weka.core.SelectedTag",
      "weka.core.tokenizers.Tokenizer",
      "weka.core.tokenizers.AlphabeticTokenizer",
      "weka.attributeSelection.CorrelationAttributeEval",
      "weka.attributeSelection.WrapperSubsetEval",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.core.tokenizers.WordTokenizer",
      "weka.classifiers.lazy.LWL",
      "weka.classifiers.trees.DecisionStump",
      "weka.filters.SimpleFilter",
      "weka.filters.SimpleStreamFilter",
      "weka.filters.MultiFilter",
      "weka.filters.AllFilter",
      "weka.core.WekaException",
      "weka.filters.unsupervised.attribute.Remove",
      "weka.core.UnassignedClassException",
      "weka.core.tokenizers.NGramTokenizer",
      "weka.classifiers.bayes.NaiveBayes",
      "weka.classifiers.bayes.NaiveBayesUpdateable",
      "weka.attributeSelection.AttributeSelection",
      "weka.classifiers.misc.SerializedClassifier",
      "weka.classifiers.functions.Logistic",
      "weka.classifiers.rules.PART",
      "weka.classifiers.meta.RegressionByDiscretization",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.filters.unsupervised.attribute.Discretize",
      "weka.classifiers.trees.J48",
      "weka.core.neighboursearch.balltrees.MiddleOutConstructor",
      "weka.classifiers.rules.DecisionTable$DummySubsetEvaluator",
      "weka.classifiers.meta.FilteredClassifier",
      "weka.filters.supervised.attribute.AttributeSelection",
      "weka.attributeSelection.CfsSubsetEval",
      "weka.attributeSelection.GreedyStepwise",
      "weka.filters.supervised.attribute.Discretize",
      "weka.classifiers.RandomizableClassifier",
      "weka.classifiers.functions.SGDText",
      "weka.core.stemmers.NullStemmer",
      "weka.classifiers.bayes.NaiveBayesMultinomialText",
      "weka.classifiers.MultipleClassifiersCombiner",
      "weka.classifiers.RandomizableMultipleClassifiersCombiner",
      "weka.classifiers.meta.Vote",
      "weka.classifiers.functions.SMOreg",
      "weka.classifiers.functions.supportVector.RegOptimizer",
      "weka.classifiers.functions.supportVector.RegSMO",
      "weka.classifiers.functions.supportVector.RegSMOImproved",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.classifiers.functions.supportVector.PolyKernel",
      "weka.classifiers.trees.m5.M5Base",
      "weka.classifiers.rules.M5Rules",
      "weka.classifiers.meta.MultiClassClassifier",
      "weka.classifiers.meta.MultiClassClassifierUpdateable",
      "weka.classifiers.meta.ClassificationViaRegression",
      "weka.classifiers.trees.M5P",
      "weka.classifiers.rules.OneR",
      "weka.classifiers.IteratedSingleClassifierEnhancer",
      "weka.classifiers.ParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.RandomizableParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.RandomCommittee",
      "weka.classifiers.trees.RandomTree",
      "weka.classifiers.meta.RandomSubSpace",
      "weka.classifiers.trees.REPTree",
      "weka.core.AttributeStats",
      "weka.classifiers.meta.Bagging",
      "weka.classifiers.functions.GaussianProcesses",
      "weka.classifiers.meta.AdditiveRegression",
      "weka.classifiers.meta.AttributeSelectedClassifier"
    );
  }
}
