/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Mar 23 08:09:38 GMT 2019
 */

package weka.classifiers.bayes.net.search.ci;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ICSSearchAlgorithm_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm"; 
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
    java.lang.System.setProperty("user.dir", "/home/apaniche/performance/Dataset/gordon_scripts/projects/9_weka"); 
    java.lang.System.setProperty("user.home", "/home/apaniche"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ICSSearchAlgorithm_ESTest_scaffolding.class.getClassLoader() ,
      "weka.core.Environment",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison",
      "weka.filters.unsupervised.attribute.NominalToBinary",
      "weka.core.neighboursearch.balltrees.MiddleOutConstructor$TempNode",
      "weka.core.matrix.CholeskyDecomposition",
      "org.pentaho.packageManagement.PackageConstraint",
      "weka.core.neighboursearch.balltrees.BottomUpConstructor$TempNode",
      "weka.core.converters.TextDirectoryLoader",
      "weka.core.converters.Saver",
      "weka.core.xml.XMLBasicSerialization",
      "weka.filters.UnsupervisedFilter",
      "weka.core.neighboursearch.BallTree",
      "weka.core.converters.XRFFSaver",
      "weka.core.neighboursearch.CoverTree$DistanceNode",
      "weka.core.ClassCache",
      "weka.classifiers.evaluation.output.prediction.AbstractOutput",
      "weka.core.DenseInstance",
      "weka.classifiers.trees.J48",
      "weka.core.converters.DatabaseConverter",
      "weka.classifiers.rules.DecisionTable$DummySubsetEvaluator",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.core.Optimization$DynamicIntArray",
      "weka.gui.GenericPropertiesCreator",
      "org.bounce.net.DefaultAuthenticator",
      "weka.classifiers.trees.j48.BinC45Split",
      "weka.filters.SimpleStreamFilter",
      "weka.core.neighboursearch.CoverTree$MyHeap",
      "weka.gui.PropertyText",
      "weka.estimators.IncrementalEstimator",
      "weka.core.neighboursearch.KDTree",
      "weka.core.stemmers.NullStemmer",
      "weka.classifiers.functions.SGDText",
      "weka.core.CustomDisplayStringProvider",
      "weka.core.NormalizableDistance",
      "weka.classifiers.functions.SMOreg",
      "weka.classifiers.trees.j48.InfoGainSplitCrit",
      "weka.core.TechnicalInformation$Type",
      "weka.core.Copyable",
      "weka.gui.PropertyValueSelector",
      "weka.core.BinarySparseInstance",
      "weka.filters.supervised.attribute.NominalToBinary",
      "weka.classifiers.RandomizableMultipleClassifiersCombiner",
      "weka.gui.PropertySheetPanel$CapabilitiesHelpDialog",
      "weka.core.SerializedObject",
      "weka.core.AdditionalMeasureProducer",
      "weka.core.neighboursearch.balltrees.BallNode",
      "weka.core.converters.AbstractSaver",
      "weka.attributeSelection.GreedyStepwise",
      "weka.classifiers.meta.MultiClassClassifier",
      "weka.core.Optimization",
      "weka.classifiers.lazy.kstar.KStarConstants",
      "weka.classifiers.functions.supportVector.RegOptimizer",
      "weka.classifiers.meta.FilteredClassifier",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.core.Version",
      "weka.attributeSelection.AttributeSelection",
      "weka.classifiers.meta.MultiClassClassifier$Code",
      "weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm$SeparationSet",
      "weka.classifiers.bayes.net.estimate.SimpleEstimator",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison$1",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison$2",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison$3",
      "weka.classifiers.trees.j48.EntropyBasedSplitCrit",
      "weka.core.neighboursearch.CoverTree",
      "weka.classifiers.AbstractClassifier",
      "weka.core.converters.ArffLoader",
      "weka.filters.unsupervised.attribute.Center",
      "weka.core.WekaException",
      "weka.core.ClassDiscovery",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison$4",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison$5",
      "weka.filters.StreamableFilter",
      "weka.gui.GenericObjectEditor$1",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeapElement",
      "weka.core.Attribute$1",
      "weka.core.PartitionGenerator",
      "weka.core.neighboursearch.NearestNeighbourSearch$NeighborList",
      "weka.core.converters.SerializedInstancesSaver",
      "weka.core.SparseInstance",
      "weka.classifiers.trees.j48.ClassifierSplitModel",
      "weka.attributeSelection.AttributeTransformer",
      "weka.core.tokenizers.WordTokenizer",
      "weka.classifiers.trees.j48.ClassifierTree",
      "weka.classifiers.misc.SerializedClassifier",
      "weka.filters.unsupervised.attribute.ReplaceMissingValues",
      "weka.attributeSelection.PrincipalComponents",
      "weka.classifiers.trees.j48.C45Split",
      "weka.core.neighboursearch.CoverTree$MyHeapElement",
      "weka.core.neighboursearch.kdtrees.KDTreeNode",
      "weka.classifiers.trees.j48.PruneableClassifierTree",
      "weka.classifiers.Evaluation",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.core.converters.CSVLoader",
      "weka.gui.CustomPanelSupplier",
      "weka.classifiers.functions.SMO",
      "weka.classifiers.bayes.net.search.SearchAlgorithm",
      "weka.core.converters.URLSourcedLoader",
      "weka.core.converters.FileSourcedConverter",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.core.neighboursearch.PerformanceStats",
      "weka.core.converters.CSVSaver",
      "weka.core.neighboursearch.balltrees.BottomUpConstructor",
      "weka.estimators.KernelEstimator",
      "weka.core.converters.ArffSaver",
      "weka.core.tokenizers.AlphabeticTokenizer",
      "weka.core.neighboursearch.balltrees.PointsClosestToFurthestChildren",
      "weka.core.matrix.EigenvalueDecomposition",
      "weka.core.UnassignedDatasetException",
      "weka.core.tokenizers.NGramTokenizer",
      "weka.core.neighboursearch.balltrees.BallTreeConstructor",
      "weka.classifiers.RandomizableClassifier",
      "weka.attributeSelection.RankedOutputSearch",
      "weka.core.RevisionUtils",
      "weka.classifiers.functions.supportVector.RegSMO",
      "weka.core.converters.Loader",
      "weka.core.ProtectedProperties",
      "weka.estimators.Estimator",
      "weka.classifiers.meta.Vote",
      "weka.core.StringLocator",
      "weka.core.AttributeStats",
      "weka.filters.MultiFilter",
      "weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm",
      "weka.core.neighboursearch.covertrees.Stack",
      "weka.filters.unsupervised.attribute.Remove",
      "weka.core.Randomizable",
      "weka.classifiers.trees.j48.NoSplit",
      "weka.core.EuclideanDistance",
      "weka.core.Instances",
      "weka.core.converters.AbstractFileLoader",
      "weka.core.converters.ConverterUtils$DataSink",
      "weka.classifiers.bayes.net.BIFReader",
      "org.pentaho.packageManagement.VersionRangePackageConstraint",
      "weka.classifiers.bayes.net.ParentSet",
      "weka.core.xml.XMLInstances",
      "weka.attributeSelection.Ranker",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.core.TechnicalInformation",
      "weka.classifiers.functions.Logistic$OptEngCG",
      "weka.core.RevisionHandler",
      "weka.experiment.Stats",
      "weka.core.converters.ConverterUtils$DataSource",
      "weka.classifiers.xml.XMLClassifier",
      "weka.filters.Filter",
      "weka.filters.supervised.attribute.Discretize",
      "weka.core.converters.ConverterUtils",
      "weka.core.DistanceFunction",
      "weka.classifiers.meta.MultiClassClassifierUpdateable",
      "weka.attributeSelection.AttributeEvaluator",
      "org.pentaho.packageManagement.Package",
      "weka.core.converters.AbstractFileSaver",
      "weka.attributeSelection.SubsetEvaluator",
      "weka.classifiers.CostMatrix",
      "weka.classifiers.bayes.net.search.local.K2",
      "weka.core.neighboursearch.NearestNeighbourSearch$NeighborNode",
      "weka.core.logging.Logger$Level",
      "weka.core.neighboursearch.kdtrees.KDTreeNodeSplitter",
      "weka.attributeSelection.CfsSubsetEval",
      "weka.core.RevisionUtils$Type",
      "weka.core.ConjugateGradientOptimization",
      "weka.classifiers.functions.LinearRegression",
      "weka.core.stemmers.Stemmer",
      "weka.gui.PropertyPanel",
      "weka.core.converters.IncrementalConverter",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "weka.filters.SimpleFilter",
      "weka.classifiers.meta.MultiClassClassifier$RandomCode",
      "weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm",
      "org.pentaho.packageManagement.VersionPackageConstraint",
      "weka.estimators.Estimator$Builder",
      "weka.core.EnvironmentHandler",
      "weka.classifiers.trees.j48.C45ModelSelection",
      "weka.classifiers.functions.Logistic",
      "weka.core.RelationalLocator",
      "weka.core.Utils",
      "weka.core.neighboursearch.balltrees.MiddleOutConstructor",
      "weka.core.converters.XRFFLoader",
      "weka.core.tokenizers.Tokenizer",
      "weka.filters.unsupervised.instance.RemoveWithValues",
      "weka.gui.GenericObjectEditor$JTreePopupMenu",
      "weka.core.NoSupportForMissingValuesException",
      "weka.classifiers.UpdateableClassifier",
      "weka.core.neighboursearch.balltrees.MiddleOutConstructor$ListNode",
      "weka.classifiers.meta.MultiClassClassifier$ExhaustiveCode",
      "weka.core.Capabilities",
      "weka.core.neighboursearch.balltrees.TopDownConstructor",
      "weka.core.AttributeLocator",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.core.neighboursearch.balltrees.MiddleOutConstructor$MyIdxList",
      "weka.classifiers.meta.RegressionByDiscretization",
      "weka.core.Summarizable",
      "weka.classifiers.trees.j48.ModelSelection",
      "weka.attributeSelection.BestFirst",
      "org.pentaho.packageManagement.PackageManager$1",
      "weka.core.Drawable",
      "weka.core.matrix.Matrix",
      "weka.classifiers.ConditionalDensityEstimator",
      "weka.gui.PropertySheetPanel",
      "weka.core.CapabilitiesHandler",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeap",
      "weka.attributeSelection.ASEvaluation",
      "weka.classifiers.functions.supportVector.StringKernel",
      "weka.core.AbstractInstance",
      "weka.core.SelectedTag",
      "org.pentaho.packageManagement.DefaultPackage",
      "weka.estimators.DiscreteEstimator",
      "weka.core.neighboursearch.balltrees.BallSplitter",
      "weka.core.matrix.LUDecomposition",
      "weka.classifiers.bayes.BayesNet",
      "weka.classifiers.trees.j48.C45PruneableClassifierTree",
      "weka.classifiers.meta.AdditiveRegression",
      "weka.core.converters.AbstractLoader",
      "weka.filters.AllFilter",
      "weka.filters.unsupervised.attribute.RemoveUseless",
      "weka.core.converters.BatchConverter",
      "weka.core.matrix.SingularValueDecomposition",
      "weka.core.converters.ArffLoader$ArffReader",
      "weka.core.Tag",
      "weka.classifiers.IteratedSingleClassifierEnhancer",
      "weka.classifiers.trees.j48.BinC45ModelSelection",
      "weka.estimators.UnivariateDensityEstimator",
      "weka.core.OptionHandler",
      "weka.classifiers.trees.j48.Distribution",
      "weka.core.neighboursearch.kdtrees.SlidingMidPointOfWidestSide",
      "weka.filters.supervised.attribute.AttributeSelection",
      "weka.core.Range",
      "weka.classifiers.bayes.net.VaryNode",
      "weka.attributeSelection.WrapperSubsetEval",
      "weka.classifiers.Classifier",
      "weka.core.Capabilities$Capability",
      "org.pentaho.packageManagement.PackageManager",
      "weka.core.WekaEnumeration",
      "weka.gui.GenericObjectEditor",
      "weka.core.matrix.QRDecomposition",
      "weka.classifiers.bayes.net.search.ci.CISearchAlgorithm",
      "weka.attributeSelection.ASSearch",
      "weka.core.WekaPackageManager",
      "weka.filters.SupervisedFilter",
      "weka.core.TechnicalInformationHandler",
      "weka.attributeSelection.StartSetHandler",
      "weka.core.Option",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.filters.Sourcable",
      "weka.classifiers.meta.MultiClassClassifier$StandardCode",
      "weka.core.Attribute",
      "weka.classifiers.rules.DecisionTable",
      "weka.core.matrix.LinearRegression",
      "weka.core.FastVector",
      "weka.classifiers.MultipleClassifiersCombiner",
      "weka.core.xml.XMLDocument",
      "weka.classifiers.bayes.net.estimate.BayesNetEstimator",
      "weka.classifiers.functions.supportVector.RegSMOImproved",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.core.Instance",
      "weka.core.converters.SerializedInstancesLoader",
      "weka.classifiers.functions.supportVector.PolyKernel",
      "weka.classifiers.lazy.KStar",
      "weka.classifiers.IntervalEstimator",
      "weka.classifiers.bayes.net.ADNode",
      "weka.core.Matchable",
      "weka.core.WeightedInstancesHandler",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.classifiers.functions.GaussianProcesses",
      "weka.classifiers.trees.j48.SplitCriterion",
      "weka.core.TechnicalInformation$Field",
      "weka.filters.unsupervised.attribute.Discretize",
      "weka.classifiers.functions.SGD",
      "weka.core.neighboursearch.CoverTree$CoverTreeNode",
      "weka.classifiers.trees.j48.GainRatioSplitCrit",
      "weka.filters.unsupervised.attribute.Normalize",
      "weka.core.UnassignedClassException",
      "weka.classifiers.rules.ZeroR",
      "weka.filters.unsupervised.attribute.Standardize",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.classifiers.Sourcable",
      "weka.classifiers.functions.Logistic$OptEng",
      "weka.classifiers.evaluation.output.prediction.PlainText",
      "weka.core.xml.XMLSerialization",
      "weka.core.neighboursearch.TreePerformanceStats",
      "weka.filters.unsupervised.attribute.MakeIndicator",
      "weka.gui.GenericObjectEditor$GOEPanel",
      "weka.classifiers.lazy.IBk"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ICSSearchAlgorithm_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "weka.classifiers.bayes.net.search.SearchAlgorithm",
      "weka.core.Tag",
      "weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm",
      "weka.classifiers.bayes.net.search.ci.CISearchAlgorithm",
      "weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm",
      "weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm$SeparationSet",
      "weka.core.RevisionUtils",
      "weka.classifiers.AbstractClassifier",
      "weka.classifiers.functions.SMOreg",
      "weka.classifiers.functions.supportVector.RegOptimizer",
      "weka.classifiers.functions.supportVector.RegSMO",
      "weka.classifiers.functions.supportVector.RegSMOImproved",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.classifiers.functions.supportVector.PolyKernel",
      "weka.core.SelectedTag",
      "weka.core.Utils",
      "weka.classifiers.bayes.BayesNet",
      "weka.classifiers.bayes.net.search.local.K2",
      "weka.classifiers.bayes.net.estimate.BayesNetEstimator",
      "weka.classifiers.bayes.net.estimate.SimpleEstimator",
      "weka.core.Instances",
      "weka.core.Option",
      "weka.classifiers.CostMatrix",
      "weka.core.AbstractInstance",
      "weka.core.SparseInstance",
      "weka.core.BinarySparseInstance",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.classifiers.rules.ZeroR",
      "weka.core.Attribute",
      "weka.core.ProtectedProperties",
      "weka.classifiers.Evaluation",
      "weka.classifiers.lazy.IBk",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.core.NormalizableDistance",
      "weka.core.EuclideanDistance",
      "weka.core.Range",
      "weka.attributeSelection.ASEvaluation",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.attributeSelection.PrincipalComponents",
      "weka.filters.Filter",
      "weka.filters.AllFilter",
      "weka.core.neighboursearch.CoverTree",
      "weka.classifiers.RandomizableClassifier",
      "weka.classifiers.functions.SGDText",
      "weka.core.tokenizers.Tokenizer",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.core.tokenizers.WordTokenizer",
      "weka.core.stemmers.NullStemmer",
      "weka.core.UnassignedDatasetException",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "weka.classifiers.meta.MultiClassClassifier",
      "weka.classifiers.meta.MultiClassClassifierUpdateable",
      "weka.classifiers.functions.Logistic",
      "weka.classifiers.meta.RegressionByDiscretization",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.filters.unsupervised.attribute.Discretize",
      "weka.classifiers.trees.J48",
      "weka.core.TechnicalInformation",
      "weka.core.TechnicalInformation$Type",
      "weka.core.TechnicalInformation$Field",
      "weka.classifiers.functions.SMO",
      "weka.core.converters.ArffLoader$ArffReader",
      "weka.filters.SimpleFilter",
      "weka.filters.SimpleStreamFilter",
      "weka.filters.MultiFilter",
      "weka.core.SerializedObject",
      "weka.attributeSelection.WrapperSubsetEval",
      "weka.classifiers.functions.SGD",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.attributeSelection.ASSearch",
      "weka.attributeSelection.BestFirst",
      "weka.core.neighboursearch.balltrees.BallTreeConstructor",
      "weka.core.neighboursearch.balltrees.MiddleOutConstructor",
      "weka.core.neighboursearch.balltrees.BallNode",
      "weka.classifiers.lazy.KStar",
      "weka.core.WekaEnumeration",
      "weka.core.tokenizers.AlphabeticTokenizer",
      "weka.core.tokenizers.NGramTokenizer",
      "weka.core.Version",
      "weka.core.Environment",
      "weka.classifiers.rules.DecisionTable",
      "weka.core.DenseInstance",
      "weka.core.Capabilities",
      "org.pentaho.packageManagement.PackageManager",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.core.WekaPackageManager",
      "weka.core.Capabilities$Capability",
      "weka.classifiers.functions.GaussianProcesses",
      "weka.classifiers.IteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.AdditiveRegression",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeap",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeapElement",
      "weka.core.WekaException",
      "weka.classifiers.functions.LinearRegression",
      "weka.core.neighboursearch.KDTree",
      "weka.core.neighboursearch.kdtrees.KDTreeNodeSplitter",
      "weka.core.neighboursearch.kdtrees.SlidingMidPointOfWidestSide",
      "weka.classifiers.meta.FilteredClassifier",
      "weka.filters.supervised.attribute.AttributeSelection",
      "weka.attributeSelection.AttributeSelection",
      "weka.attributeSelection.CfsSubsetEval",
      "weka.attributeSelection.GreedyStepwise",
      "weka.filters.supervised.attribute.Discretize",
      "weka.core.converters.ConverterUtils$DataSource",
      "weka.core.converters.AbstractLoader",
      "weka.core.converters.AbstractFileLoader",
      "weka.core.converters.ArffLoader",
      "weka.estimators.Estimator",
      "weka.classifiers.functions.supportVector.StringKernel",
      "weka.core.AttributeStats",
      "weka.core.Attribute$1",
      "weka.classifiers.bayes.net.BIFReader",
      "weka.core.neighboursearch.BallTree",
      "weka.core.neighboursearch.balltrees.TopDownConstructor",
      "weka.core.neighboursearch.balltrees.BallSplitter",
      "weka.core.neighboursearch.balltrees.PointsClosestToFurthestChildren",
      "weka.core.UnassignedClassException",
      "weka.classifiers.MultipleClassifiersCombiner",
      "weka.classifiers.RandomizableMultipleClassifiersCombiner",
      "weka.classifiers.meta.Vote",
      "weka.core.neighboursearch.balltrees.BottomUpConstructor",
      "weka.estimators.DiscreteEstimator",
      "weka.classifiers.bayes.net.ParentSet",
      "weka.estimators.KernelEstimator",
      "weka.experiment.Stats",
      "weka.classifiers.misc.SerializedClassifier"
    );
  }
}
