/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Jul 07 04:10:05 GMT 2018
 */

package weka.classifiers;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Evaluation_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "weka.classifiers.Evaluation"; 
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
    java.lang.System.setProperty("file.encoding", "ANSI_X3.4-1968"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.timezone", "Europe/Luxembourg"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Evaluation_ESTest_scaffolding.class.getClassLoader() ,
      "weka.core.Environment",
      "weka.filters.unsupervised.attribute.NominalToBinary",
      "weka.clusterers.AbstractClusterer",
      "weka.core.converters.TextDirectoryLoader",
      "org.pentaho.packageManagement.PackageConstraint",
      "weka.core.xml.XMLBasicSerialization",
      "weka.classifiers.evaluation.output.prediction.XML",
      "weka.filters.UnsupervisedFilter",
      "weka.core.neighboursearch.CoverTree$DistanceNode",
      "weka.classifiers.evaluation.output.prediction.AbstractOutput",
      "weka.core.DenseInstance",
      "weka.classifiers.trees.J48",
      "weka.core.converters.DatabaseConverter",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.estimators.UnivariateIntervalEstimator",
      "org.bounce.net.DefaultAuthenticator",
      "weka.core.neighboursearch.CoverTree$MyHeap",
      "weka.estimators.IncrementalEstimator",
      "weka.clusterers.NumberOfClustersRequestable",
      "weka.core.stemmers.NullStemmer",
      "weka.classifiers.functions.SGDText",
      "weka.core.CustomDisplayStringProvider",
      "weka.core.NormalizableDistance",
      "weka.classifiers.rules.Rule",
      "weka.clusterers.SimpleKMeans",
      "weka.core.TechnicalInformation$Type",
      "weka.core.Copyable",
      "weka.core.BinarySparseInstance",
      "weka.filters.supervised.attribute.NominalToBinary",
      "weka.core.SerializedObject",
      "weka.clusterers.UpdateableClusterer",
      "weka.core.AdditionalMeasureProducer",
      "weka.classifiers.lazy.kstar.KStarConstants",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.core.Version",
      "weka.classifiers.bayes.net.estimate.SimpleEstimator",
      "weka.core.neighboursearch.CoverTree",
      "weka.classifiers.AbstractClassifier",
      "weka.core.converters.ArffLoader",
      "weka.core.WekaException",
      "weka.filters.StreamableFilter",
      "weka.core.Attribute$1",
      "weka.core.PartitionGenerator",
      "weka.core.neighboursearch.NearestNeighbourSearch$NeighborList",
      "weka.core.SparseInstance",
      "weka.core.tokenizers.WordTokenizer",
      "weka.classifiers.trees.j48.ClassifierTree",
      "weka.classifiers.misc.SerializedClassifier",
      "weka.filters.unsupervised.attribute.ReplaceMissingValues",
      "weka.classifiers.trees.j48.PruneableClassifierTree",
      "weka.classifiers.Evaluation",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.classifiers.bayes.net.search.SearchAlgorithm",
      "weka.core.converters.URLSourcedLoader",
      "weka.core.converters.FileSourcedConverter",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.clusterers.Clusterer",
      "weka.core.neighboursearch.PerformanceStats",
      "weka.core.Stopwords",
      "weka.estimators.UnivariateKernelEstimator",
      "weka.core.UnassignedDatasetException",
      "weka.classifiers.meta.CVParameterSelection",
      "weka.classifiers.RandomizableClassifier",
      "weka.core.RevisionUtils",
      "weka.core.converters.Loader",
      "weka.core.ProtectedProperties",
      "weka.estimators.Estimator",
      "weka.clusterers.RandomizableDensityBasedClusterer",
      "weka.core.converters.C45Loader",
      "weka.core.StringLocator",
      "weka.core.AttributeStats",
      "weka.clusterers.DensityBasedClusterer",
      "weka.classifiers.trees.DecisionStump",
      "weka.estimators.UnivariateQuantileEstimator",
      "weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm",
      "weka.core.neighboursearch.covertrees.Stack",
      "weka.core.Randomizable",
      "weka.classifiers.trees.LMT",
      "weka.core.EuclideanDistance",
      "weka.core.Instances",
      "weka.core.converters.AbstractFileLoader",
      "weka.classifiers.bayes.NaiveBayesMultinomial",
      "weka.classifiers.bayes.net.BIFReader",
      "weka.classifiers.bayes.net.ParentSet",
      "weka.core.xml.XMLInstances",
      "weka.core.TechnicalInformation",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.core.RevisionHandler",
      "weka.experiment.Stats",
      "weka.classifiers.xml.XMLClassifier",
      "weka.filters.Filter",
      "weka.filters.supervised.attribute.Discretize",
      "weka.classifiers.rules.JRip$RipperRule",
      "weka.clusterers.EM",
      "weka.core.TestInstances",
      "weka.core.DistanceFunction",
      "weka.attributeSelection.AttributeEvaluator",
      "org.pentaho.packageManagement.Package",
      "weka.classifiers.trees.m5.M5Base",
      "weka.classifiers.rules.RuleStats",
      "weka.classifiers.CostMatrix",
      "weka.classifiers.bayes.net.search.local.K2",
      "weka.core.logging.Logger$Level",
      "weka.core.stemmers.Stemmer",
      "weka.core.converters.IncrementalConverter",
      "weka.filters.supervised.attribute.ClassOrder",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "weka.core.EnvironmentHandler",
      "weka.classifiers.trees.j48.C45ModelSelection",
      "weka.classifiers.trees.m5.RuleNode",
      "weka.core.RelationalLocator",
      "weka.core.Utils",
      "weka.core.converters.XRFFLoader",
      "weka.core.tokenizers.Tokenizer",
      "weka.clusterers.AbstractDensityBasedClusterer",
      "weka.core.NoSupportForMissingValuesException",
      "weka.classifiers.UpdateableClassifier",
      "weka.classifiers.bayes.NaiveBayesMultinomialText",
      "weka.core.MultiInstanceCapabilitiesHandler",
      "weka.core.Capabilities",
      "weka.core.AttributeLocator",
      "weka.core.converters.SVMLightLoader",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.classifiers.meta.RegressionByDiscretization",
      "weka.core.Summarizable",
      "weka.classifiers.trees.j48.ModelSelection",
      "org.pentaho.packageManagement.PackageManager$1",
      "weka.core.Drawable",
      "weka.core.ListOptions",
      "weka.classifiers.ConditionalDensityEstimator",
      "weka.core.CapabilitiesHandler",
      "weka.classifiers.functions.supportVector.StringKernel",
      "weka.attributeSelection.ASEvaluation",
      "weka.core.AbstractInstance",
      "weka.core.scripting.JythonObject",
      "weka.core.SelectedTag",
      "org.pentaho.packageManagement.DefaultPackage",
      "weka.estimators.DiscreteEstimator",
      "weka.classifiers.trees.j48.C45PruneableClassifierTree",
      "weka.classifiers.bayes.BayesNet",
      "weka.classifiers.meta.AdditiveRegression",
      "weka.clusterers.RandomizableClusterer",
      "weka.core.converters.AbstractLoader",
      "weka.classifiers.trees.lmt.ResidualModelSelection",
      "weka.filters.AllFilter",
      "weka.filters.unsupervised.attribute.RemoveUseless",
      "weka.core.converters.BatchConverter",
      "weka.core.Tag",
      "weka.classifiers.IteratedSingleClassifierEnhancer",
      "weka.classifiers.trees.j48.BinC45ModelSelection",
      "weka.estimators.UnivariateDensityEstimator",
      "weka.core.OptionHandler",
      "weka.core.converters.MatlabLoader",
      "weka.classifiers.rules.JRip",
      "weka.core.Range",
      "weka.core.scripting.JythonSerializableObject",
      "weka.classifiers.Classifier",
      "weka.attributeSelection.InfoGainAttributeEval",
      "weka.core.Capabilities$Capability",
      "org.pentaho.packageManagement.PackageManager",
      "weka.core.WekaEnumeration",
      "weka.classifiers.trees.M5P",
      "weka.core.WekaPackageManager",
      "weka.estimators.UnivariateEqualFrequencyHistogramEstimator",
      "weka.filters.SupervisedFilter",
      "weka.core.TechnicalInformationHandler",
      "weka.classifiers.functions.SimpleLogistic",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.core.Option",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.filters.unsupervised.attribute.NumericToBinary",
      "weka.filters.Sourcable",
      "weka.core.Attribute",
      "weka.core.FastVector",
      "weka.core.xml.XMLDocument",
      "weka.classifiers.bayes.net.estimate.BayesNetEstimator",
      "weka.core.BatchPredictor",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.core.Instance",
      "weka.core.converters.SerializedInstancesLoader",
      "weka.classifiers.lazy.KStar",
      "weka.classifiers.functions.supportVector.PolyKernel",
      "weka.classifiers.IntervalEstimator",
      "weka.core.Matchable",
      "weka.classifiers.bayes.net.ADNode",
      "weka.core.WeightedInstancesHandler",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.classifiers.functions.GaussianProcesses",
      "weka.core.TechnicalInformation$Field",
      "weka.filters.unsupervised.attribute.Discretize",
      "weka.core.converters.DatabaseLoader",
      "weka.classifiers.functions.SGD",
      "weka.core.neighboursearch.CoverTree$CoverTreeNode",
      "weka.filters.unsupervised.attribute.Normalize",
      "weka.core.UnassignedClassException",
      "weka.classifiers.rules.ZeroR",
      "weka.filters.unsupervised.attribute.Standardize",
      "weka.classifiers.Sourcable",
      "weka.classifiers.evaluation.output.prediction.PlainText",
      "weka.core.xml.XMLSerialization",
      "weka.core.neighboursearch.TreePerformanceStats",
      "weka.classifiers.lazy.IBk"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Evaluation_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "weka.classifiers.Evaluation",
      "weka.core.pmml.PMMLFactory$ModelType",
      "weka.core.pmml.PMMLFactory$1",
      "weka.core.xml.KOML",
      "weka.core.Version",
      "weka.core.Utils",
      "weka.core.converters.AbstractLoader",
      "weka.core.converters.DatabaseLoader",
      "weka.core.Environment",
      "weka.experiment.DatabaseUtils",
      "weka.core.converters.DatabaseConnection",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.core.logging.Logger$Level",
      "weka.core.WekaPackageManager",
      "weka.classifiers.AbstractClassifier",
      "weka.classifiers.bayes.NaiveBayes",
      "weka.core.AbstractInstance",
      "weka.core.SparseInstance",
      "weka.core.converters.AbstractFileLoader",
      "weka.core.converters.SVMLightLoader",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "weka.core.Tag",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.classifiers.rules.ZeroR",
      "weka.classifiers.CostMatrix",
      "weka.core.Instances",
      "weka.clusterers.AbstractClusterer",
      "weka.clusterers.RandomizableClusterer",
      "weka.clusterers.SimpleKMeans",
      "weka.core.NormalizableDistance",
      "weka.core.EuclideanDistance",
      "weka.core.Range",
      "weka.attributeSelection.ASEvaluation",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.attributeSelection.PrincipalComponents",
      "weka.core.converters.ArffLoader",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.classifiers.lazy.IBk",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.core.TestInstances",
      "weka.core.Attribute",
      "weka.core.ProtectedProperties",
      "weka.core.DenseInstance",
      "weka.core.converters.SerializedInstancesLoader",
      "weka.core.converters.JSONLoader",
      "weka.core.converters.TextDirectoryLoader",
      "weka.classifiers.IteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.AdditiveRegression",
      "weka.classifiers.trees.DecisionStump",
      "weka.classifiers.evaluation.output.prediction.AbstractOutput",
      "weka.classifiers.evaluation.output.prediction.Null",
      "weka.core.xml.XMLDocument",
      "weka.core.xml.XMLInstances",
      "weka.core.converters.XRFFLoader",
      "weka.core.converters.CSVLoader",
      "weka.experiment.InstanceQuery",
      "weka.filters.Filter",
      "weka.filters.AllFilter",
      "weka.core.SerializedObject",
      "weka.core.converters.LibSVMLoader",
      "weka.core.converters.MatlabLoader",
      "weka.core.converters.C45Loader",
      "weka.core.Capabilities",
      "weka.core.BinarySparseInstance",
      "weka.core.UnassignedDatasetException",
      "weka.core.neighboursearch.CoverTree",
      "weka.classifiers.meta.RegressionByDiscretization",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.filters.unsupervised.attribute.Discretize",
      "weka.classifiers.trees.J48",
      "weka.core.Capabilities$Capability",
      "weka.classifiers.bayes.NaiveBayesMultinomialText",
      "weka.core.tokenizers.Tokenizer",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.core.tokenizers.WordTokenizer",
      "weka.core.stemmers.NullStemmer",
      "weka.classifiers.misc.SerializedClassifier",
      "weka.filters.SimpleFilter",
      "weka.filters.SimpleStreamFilter",
      "weka.filters.MultiFilter",
      "weka.core.neighboursearch.KDTree",
      "weka.core.neighboursearch.kdtrees.KDTreeNodeSplitter",
      "weka.core.neighboursearch.kdtrees.SlidingMidPointOfWidestSide",
      "weka.core.neighboursearch.BallTree",
      "weka.core.neighboursearch.balltrees.BallTreeConstructor",
      "weka.core.neighboursearch.balltrees.TopDownConstructor",
      "weka.core.neighboursearch.balltrees.BallSplitter",
      "weka.core.neighboursearch.balltrees.PointsClosestToFurthestChildren",
      "weka.classifiers.evaluation.output.prediction.XML",
      "weka.classifiers.bayes.BayesNet",
      "weka.classifiers.bayes.net.search.SearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.K2",
      "weka.classifiers.bayes.net.estimate.BayesNetEstimator",
      "weka.classifiers.bayes.net.estimate.SimpleEstimator",
      "weka.classifiers.evaluation.output.prediction.CSV",
      "weka.classifiers.functions.LinearRegression",
      "weka.classifiers.RandomizableIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.LogitBoost",
      "weka.core.TechnicalInformationHandlerJavadoc",
      "weka.classifiers.evaluation.output.prediction.HTML",
      "weka.classifiers.functions.SMO",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.classifiers.functions.supportVector.PolyKernel",
      "weka.core.AttributeStats",
      "weka.classifiers.MultipleClassifiersCombiner",
      "weka.classifiers.ParallelMultipleClassifiersCombiner",
      "weka.classifiers.RandomizableParallelMultipleClassifiersCombiner",
      "weka.classifiers.meta.Stacking",
      "weka.classifiers.functions.SimpleLogistic",
      "weka.estimators.UnivariateKernelEstimator",
      "weka.estimators.UnivariateEqualFrequencyHistogramEstimator",
      "weka.core.TechnicalInformation",
      "weka.core.TechnicalInformation$Type",
      "weka.core.TechnicalInformation$Field",
      "weka.classifiers.RandomizableMultipleClassifiersCombiner",
      "weka.classifiers.meta.Vote",
      "weka.classifiers.trees.m5.M5Base",
      "weka.classifiers.rules.M5Rules",
      "weka.classifiers.trees.RandomForest",
      "weka.classifiers.trees.RandomTree",
      "weka.classifiers.trees.LMT",
      "weka.classifiers.meta.AttributeSelectedClassifier",
      "weka.attributeSelection.CfsSubsetEval",
      "weka.attributeSelection.ASSearch",
      "weka.attributeSelection.BestFirst",
      "weka.experiment.Stats",
      "weka.classifiers.functions.SimpleLinearRegression",
      "weka.estimators.Estimator",
      "weka.estimators.KernelEstimator",
      "weka.attributeSelection.WrapperSubsetEval",
      "weka.classifiers.meta.MultiClassClassifier",
      "weka.classifiers.meta.MultiClassClassifierUpdateable",
      "weka.classifiers.functions.Logistic",
      "weka.attributeSelection.OneRAttributeEval",
      "weka.classifiers.functions.supportVector.RBFKernel",
      "weka.classifiers.rules.OneR",
      "weka.classifiers.rules.OneR$OneRRule",
      "weka.core.converters.ConverterUtils$DataSource",
      "weka.core.UnassignedClassException",
      "weka.classifiers.rules.PART",
      "weka.classifiers.trees.M5P",
      "weka.core.GlobalInfoJavadoc",
      "weka.attributeSelection.CorrelationAttributeEval",
      "weka.classifiers.functions.supportVector.StringKernel",
      "weka.classifiers.rules.JRip",
      "weka.classifiers.RandomizableClassifier",
      "weka.classifiers.functions.SGD",
      "weka.classifiers.functions.GaussianProcesses",
      "weka.core.WekaException",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.classifiers.ParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.RandomizableParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.Bagging",
      "weka.classifiers.trees.REPTree",
      "weka.clusterers.AbstractDensityBasedClusterer",
      "weka.clusterers.RandomizableDensityBasedClusterer",
      "weka.clusterers.EM",
      "weka.clusterers.FarthestFirst",
      "weka.clusterers.SingleClustererEnhancer",
      "weka.clusterers.FilteredClusterer",
      "weka.classifiers.meta.ClassificationViaRegression",
      "weka.classifiers.functions.supportVector.Puk",
      "weka.estimators.DiscreteEstimator",
      "weka.classifiers.lazy.KStar",
      "weka.attributeSelection.InfoGainAttributeEval",
      "weka.classifiers.meta.CVParameterSelection",
      "weka.core.FastVector",
      "weka.classifiers.functions.MultilayerPerceptron",
      "weka.filters.unsupervised.attribute.NominalToBinary",
      "weka.classifiers.functions.neural.SigmoidUnit",
      "weka.classifiers.functions.neural.LinearUnit",
      "weka.classifiers.rules.DecisionTable",
      "weka.gui.WekaTaskMonitor",
      "weka.gui.LogPanel",
      "weka.core.ChebyshevDistance",
      "weka.classifiers.bayes.NaiveBayesMultinomial",
      "weka.classifiers.functions.SMOreg",
      "weka.classifiers.functions.supportVector.RegOptimizer",
      "weka.classifiers.functions.supportVector.RegSMO",
      "weka.classifiers.functions.supportVector.RegSMOImproved",
      "weka.classifiers.meta.FilteredClassifier",
      "weka.filters.supervised.attribute.AttributeSelection",
      "weka.attributeSelection.AttributeSelection",
      "weka.attributeSelection.GreedyStepwise",
      "weka.filters.supervised.attribute.Discretize",
      "weka.classifiers.pmml.consumer.PMMLClassifier",
      "weka.classifiers.pmml.consumer.RuleSetModel",
      "weka.classifiers.pmml.consumer.TreeModel$MiningFunction",
      "weka.core.ManhattanDistance",
      "weka.classifiers.bayes.NaiveBayesMultinomialUpdateable",
      "weka.core.tokenizers.NGramTokenizer",
      "weka.estimators.PoissonEstimator",
      "weka.classifiers.evaluation.output.prediction.PlainText",
      "weka.classifiers.functions.VotedPerceptron",
      "weka.classifiers.functions.supportVector.PrecomputedKernelMatrixKernel",
      "weka.core.SingleIndex",
      "weka.classifiers.lazy.LWL",
      "weka.classifiers.functions.SGDText",
      "weka.classifiers.meta.AdaBoostM1",
      "weka.classifiers.rules.part.MakeDecList",
      "weka.classifiers.trees.j48.ClassifierTree",
      "weka.classifiers.trees.j48.C45PruneableClassifierTree"
    );
  }
}