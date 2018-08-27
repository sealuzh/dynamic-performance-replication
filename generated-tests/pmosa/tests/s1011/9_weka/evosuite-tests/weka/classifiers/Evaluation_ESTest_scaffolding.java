/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Jul 17 20:44:52 GMT 2018
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
    java.lang.System.setProperty("sun.jnu.encoding", "ANSI_X3.4-1968"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Evaluation_ESTest_scaffolding.class.getClassLoader() ,
      "weka.core.Environment",
      "weka.core.TestInstances",
      "weka.filters.unsupervised.attribute.NominalToBinary",
      "weka.clusterers.AbstractClusterer",
      "weka.core.converters.ConverterUtils",
      "weka.core.DistanceFunction",
      "weka.core.converters.TextDirectoryLoader",
      "org.pentaho.packageManagement.PackageConstraint",
      "weka.clusterers.FilteredClusterer",
      "org.pentaho.packageManagement.Package",
      "weka.core.xml.XMLBasicSerialization",
      "weka.attributeSelection.SubsetEvaluator",
      "weka.classifiers.CostMatrix",
      "weka.filters.UnsupervisedFilter",
      "weka.core.logging.Logger$Level",
      "weka.classifiers.evaluation.output.prediction.AbstractOutput",
      "weka.core.neighboursearch.kdtrees.KDTreeNodeSplitter",
      "weka.attributeSelection.CfsSubsetEval",
      "weka.core.DenseInstance",
      "weka.classifiers.trees.J48",
      "weka.core.stemmers.Stemmer",
      "weka.classifiers.rules.DecisionTable$DummySubsetEvaluator",
      "weka.core.converters.IncrementalConverter",
      "weka.clusterers.SingleClustererEnhancer",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.estimators.UnivariateIntervalEstimator",
      "org.bounce.net.DefaultAuthenticator",
      "weka.classifiers.bayes.NaiveBayes",
      "weka.estimators.IncrementalEstimator",
      "weka.core.neighboursearch.KDTree",
      "weka.core.stemmers.NullStemmer",
      "weka.core.EnvironmentHandler",
      "weka.classifiers.trees.j48.C45ModelSelection",
      "weka.classifiers.functions.SGDText",
      "weka.core.RelationalLocator",
      "weka.core.Utils",
      "weka.classifiers.meta.AdaBoostM1",
      "weka.core.converters.XRFFLoader",
      "weka.core.CustomDisplayStringProvider",
      "weka.core.tokenizers.Tokenizer",
      "weka.core.NormalizableDistance",
      "weka.classifiers.functions.SMOreg",
      "weka.core.NoSupportForMissingValuesException",
      "weka.classifiers.ParallelMultipleClassifiersCombiner",
      "weka.classifiers.UpdateableClassifier",
      "weka.core.TechnicalInformation$Type",
      "weka.core.MultiInstanceCapabilitiesHandler",
      "weka.core.Copyable",
      "weka.core.Capabilities",
      "weka.core.AttributeLocator",
      "weka.core.BinarySparseInstance",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.core.SerializedObject",
      "weka.classifiers.meta.RegressionByDiscretization",
      "weka.clusterers.UpdateableClusterer",
      "weka.core.Summarizable",
      "weka.attributeSelection.BestFirst",
      "weka.classifiers.trees.j48.ModelSelection",
      "weka.core.AdditionalMeasureProducer",
      "org.pentaho.packageManagement.PackageManager$1",
      "weka.classifiers.RandomizableIteratedSingleClassifierEnhancer",
      "weka.attributeSelection.GreedyStepwise",
      "weka.core.Drawable",
      "weka.classifiers.ConditionalDensityEstimator",
      "weka.core.CapabilitiesHandler",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeap",
      "weka.attributeSelection.ASEvaluation",
      "weka.core.AbstractInstance",
      "weka.classifiers.lazy.kstar.KStarConstants",
      "weka.core.scripting.JythonObject",
      "weka.core.SelectedTag",
      "weka.classifiers.functions.supportVector.RegOptimizer",
      "weka.classifiers.meta.FilteredClassifier",
      "org.pentaho.packageManagement.DefaultPackage",
      "weka.estimators.DiscreteEstimator",
      "weka.classifiers.bayes.BayesNet",
      "weka.classifiers.trees.j48.C45PruneableClassifierTree",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.classifiers.meta.AdditiveRegression",
      "weka.core.Version",
      "weka.attributeSelection.AttributeSelection",
      "weka.core.converters.AbstractLoader",
      "weka.filters.AllFilter",
      "weka.core.converters.BatchConverter",
      "weka.core.Tag",
      "weka.classifiers.IteratedSingleClassifierEnhancer",
      "weka.classifiers.trees.j48.BinC45ModelSelection",
      "weka.classifiers.AbstractClassifier",
      "weka.estimators.UnivariateDensityEstimator",
      "weka.classifiers.meta.Stacking",
      "weka.core.OptionHandler",
      "weka.core.converters.MatlabLoader",
      "weka.core.WekaException",
      "weka.core.neighboursearch.kdtrees.SlidingMidPointOfWidestSide",
      "weka.filters.supervised.attribute.AttributeSelection",
      "weka.filters.StreamableFilter",
      "weka.core.Range",
      "weka.core.Attribute$1",
      "weka.core.PartitionGenerator",
      "weka.core.scripting.JythonSerializableObject",
      "weka.classifiers.Classifier",
      "weka.core.Capabilities$Capability",
      "weka.core.SparseInstance",
      "org.pentaho.packageManagement.PackageManager",
      "weka.core.WekaEnumeration",
      "weka.core.tokenizers.WordTokenizer",
      "weka.classifiers.trees.j48.ClassifierTree",
      "weka.filters.unsupervised.attribute.ReplaceMissingValues",
      "weka.core.neighboursearch.kdtrees.KDTreeNode",
      "weka.classifiers.functions.VotedPerceptron",
      "weka.classifiers.trees.j48.PruneableClassifierTree",
      "weka.classifiers.Evaluation",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.attributeSelection.ASSearch",
      "weka.core.WekaPackageManager",
      "weka.estimators.UnivariateEqualFrequencyHistogramEstimator",
      "weka.filters.SupervisedFilter",
      "weka.core.TechnicalInformationHandler",
      "weka.classifiers.functions.SimpleLogistic",
      "weka.core.converters.URLSourcedLoader",
      "weka.core.converters.FileSourcedConverter",
      "weka.classifiers.lazy.LWL",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.attributeSelection.StartSetHandler",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.clusterers.Clusterer",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.core.Option",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.core.neighboursearch.PerformanceStats",
      "weka.filters.Sourcable",
      "weka.core.Attribute",
      "weka.classifiers.rules.DecisionTable",
      "weka.core.FastVector",
      "weka.classifiers.MultipleClassifiersCombiner",
      "weka.estimators.UnivariateKernelEstimator",
      "weka.core.xml.XMLDocument",
      "weka.core.UnassignedDatasetException",
      "weka.core.BatchPredictor",
      "weka.classifiers.functions.supportVector.RegSMOImproved",
      "weka.classifiers.RandomizableClassifier",
      "weka.attributeSelection.RankedOutputSearch",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.core.RevisionUtils",
      "weka.core.Instance",
      "weka.core.converters.Loader",
      "weka.classifiers.functions.supportVector.RegSMO",
      "weka.classifiers.functions.supportVector.PolyKernel",
      "weka.classifiers.lazy.KStar",
      "weka.estimators.Estimator",
      "weka.core.ProtectedProperties",
      "weka.classifiers.IntervalEstimator",
      "weka.core.StringLocator",
      "weka.core.Matchable",
      "weka.core.AttributeStats",
      "weka.core.WeightedInstancesHandler",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.classifiers.trees.DecisionStump",
      "weka.classifiers.functions.GaussianProcesses",
      "weka.estimators.UnivariateQuantileEstimator",
      "weka.core.TechnicalInformation$Field",
      "weka.filters.unsupervised.attribute.Discretize",
      "weka.filters.unsupervised.attribute.Remove",
      "weka.core.Randomizable",
      "weka.core.EuclideanDistance",
      "weka.core.Instances",
      "weka.classifiers.RandomizableParallelMultipleClassifiersCombiner",
      "weka.core.converters.AbstractFileLoader",
      "weka.filters.unsupervised.attribute.Normalize",
      "weka.core.converters.ConverterUtils$DataSink",
      "weka.core.UnassignedClassException",
      "weka.classifiers.rules.ZeroR",
      "weka.core.xml.XMLInstances",
      "weka.filters.unsupervised.attribute.Standardize",
      "weka.attributeSelection.Ranker",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.core.TechnicalInformation",
      "weka.classifiers.Sourcable",
      "weka.core.RevisionHandler",
      "weka.classifiers.evaluation.output.prediction.PlainText",
      "weka.experiment.Stats",
      "weka.core.converters.ConverterUtils$DataSource",
      "weka.core.xml.XMLSerialization",
      "weka.core.neighboursearch.TreePerformanceStats",
      "weka.classifiers.xml.XMLClassifier",
      "weka.filters.Filter",
      "weka.classifiers.lazy.IBk",
      "weka.filters.supervised.attribute.Discretize"
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
      "weka.core.Instances",
      "weka.core.AbstractInstance",
      "weka.core.SparseInstance",
      "weka.core.BinarySparseInstance",
      "weka.core.UnassignedDatasetException",
      "weka.classifiers.AbstractClassifier",
      "weka.classifiers.MultipleClassifiersCombiner",
      "weka.classifiers.RandomizableMultipleClassifiersCombiner",
      "weka.core.Tag",
      "weka.classifiers.meta.Vote",
      "weka.classifiers.rules.ZeroR",
      "weka.core.Environment",
      "weka.attributeSelection.ASEvaluation",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.attributeSelection.PrincipalComponents",
      "weka.core.SerializedObject",
      "weka.core.converters.AbstractLoader",
      "weka.core.converters.AbstractFileLoader",
      "weka.core.converters.C45Loader",
      "weka.core.converters.SVMLightLoader",
      "weka.core.converters.LibSVMLoader",
      "weka.core.converters.DatabaseLoader",
      "weka.experiment.DatabaseUtils",
      "weka.core.converters.DatabaseConnection",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.core.logging.Logger$Level",
      "weka.core.WekaPackageManager",
      "weka.classifiers.bayes.BayesNet",
      "weka.classifiers.bayes.net.search.SearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.K2",
      "weka.classifiers.bayes.net.estimate.BayesNetEstimator",
      "weka.classifiers.bayes.net.estimate.SimpleEstimator",
      "weka.core.Capabilities",
      "weka.clusterers.AbstractClusterer",
      "weka.clusterers.RandomizableClusterer",
      "weka.clusterers.SimpleKMeans",
      "weka.core.NormalizableDistance",
      "weka.core.EuclideanDistance",
      "weka.core.Range",
      "weka.classifiers.CostMatrix",
      "weka.core.converters.ArffLoader",
      "weka.core.converters.TextDirectoryLoader",
      "weka.core.Attribute",
      "weka.core.ProtectedProperties",
      "weka.core.TechnicalInformation",
      "weka.core.TechnicalInformation$Type",
      "weka.core.TechnicalInformation$Field",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.classifiers.IteratedSingleClassifierEnhancer",
      "weka.classifiers.RandomizableIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.AdaBoostM1",
      "weka.classifiers.trees.DecisionStump",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "weka.classifiers.meta.CVParameterSelection",
      "weka.core.FastVector",
      "weka.core.TestInstances",
      "weka.core.Capabilities$Capability",
      "weka.core.converters.SerializedInstancesLoader",
      "weka.core.converters.MatlabLoader",
      "weka.core.converters.CSVLoader",
      "weka.core.DenseInstance",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.experiment.InstanceQuery",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.core.xml.XMLDocument",
      "weka.core.xml.XMLInstances",
      "weka.core.converters.XRFFLoader",
      "weka.classifiers.trees.REPTree",
      "weka.estimators.UnivariateKernelEstimator",
      "weka.core.converters.JSONLoader",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.core.neighboursearch.CoverTree",
      "weka.filters.Filter",
      "weka.filters.AllFilter",
      "weka.estimators.Estimator",
      "weka.estimators.PoissonEstimator",
      "weka.classifiers.ParallelMultipleClassifiersCombiner",
      "weka.classifiers.RandomizableParallelMultipleClassifiersCombiner",
      "weka.classifiers.meta.Stacking",
      "weka.classifiers.functions.SMOreg",
      "weka.classifiers.functions.supportVector.RegOptimizer",
      "weka.classifiers.functions.supportVector.RegSMO",
      "weka.classifiers.functions.supportVector.RegSMOImproved",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.classifiers.functions.supportVector.PolyKernel",
      "weka.classifiers.functions.GaussianProcesses",
      "weka.core.WekaException",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.core.AttributeStats",
      "weka.classifiers.meta.AdditiveRegression",
      "weka.classifiers.meta.FilteredClassifier",
      "weka.filters.supervised.attribute.AttributeSelection",
      "weka.attributeSelection.AttributeSelection",
      "weka.attributeSelection.CfsSubsetEval",
      "weka.attributeSelection.ASSearch",
      "weka.attributeSelection.GreedyStepwise",
      "weka.attributeSelection.BestFirst",
      "weka.classifiers.trees.J48",
      "weka.filters.supervised.attribute.Discretize",
      "weka.classifiers.evaluation.output.prediction.AbstractOutput",
      "weka.classifiers.evaluation.output.prediction.PlainText",
      "weka.classifiers.functions.Logistic",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.classifiers.bayes.NaiveBayesMultinomial",
      "weka.classifiers.bayes.NaiveBayesMultinomialUpdateable",
      "weka.classifiers.rules.OneR",
      "weka.classifiers.rules.OneR$OneRRule",
      "weka.classifiers.evaluation.output.prediction.Null",
      "weka.classifiers.misc.SerializedClassifier",
      "weka.classifiers.lazy.IBk",
      "weka.classifiers.meta.RegressionByDiscretization",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.filters.unsupervised.attribute.Discretize",
      "weka.classifiers.RandomizableClassifier",
      "weka.classifiers.functions.SGD",
      "weka.classifiers.meta.LogitBoost",
      "weka.core.converters.ConverterUtils$DataSource",
      "weka.classifiers.lazy.KStar",
      "weka.classifiers.functions.supportVector.NormalizedPolyKernel",
      "weka.classifiers.trees.j48.ClassifierTree",
      "weka.classifiers.trees.j48.C45PruneableClassifierTree",
      "weka.classifiers.ParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.RandomizableParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.Bagging",
      "weka.classifiers.bayes.NaiveBayes",
      "weka.classifiers.functions.VotedPerceptron",
      "weka.core.SingleIndex",
      "weka.estimators.DiscreteEstimator",
      "weka.classifiers.rules.DecisionTable",
      "weka.classifiers.meta.ClassificationViaRegression",
      "weka.classifiers.trees.m5.M5Base",
      "weka.classifiers.trees.M5P",
      "weka.classifiers.functions.LinearRegression",
      "weka.classifiers.evaluation.output.prediction.XML",
      "weka.core.GlobalInfoJavadoc",
      "weka.estimators.UnivariateEqualFrequencyHistogramEstimator",
      "weka.filters.SimpleFilter",
      "weka.filters.SimpleStreamFilter",
      "weka.filters.MultiFilter",
      "weka.core.UnassignedClassException",
      "weka.classifiers.functions.SimpleLogistic",
      "weka.classifiers.evaluation.output.prediction.CSV",
      "weka.classifiers.lazy.LWL",
      "weka.classifiers.rules.M5Rules",
      "weka.classifiers.bayes.NaiveBayesUpdateable",
      "weka.core.neighboursearch.KDTree",
      "weka.core.neighboursearch.kdtrees.KDTreeNodeSplitter",
      "weka.core.neighboursearch.kdtrees.SlidingMidPointOfWidestSide",
      "weka.classifiers.evaluation.output.prediction.HTML",
      "weka.classifiers.functions.SGDText",
      "weka.core.tokenizers.Tokenizer",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.core.tokenizers.WordTokenizer",
      "weka.core.stemmers.NullStemmer",
      "weka.classifiers.rules.JRip",
      "weka.core.neighboursearch.BallTree",
      "weka.core.neighboursearch.balltrees.BallTreeConstructor",
      "weka.core.neighboursearch.balltrees.TopDownConstructor",
      "weka.core.neighboursearch.balltrees.BallSplitter",
      "weka.core.neighboursearch.balltrees.PointsClosestToFurthestChildren",
      "weka.core.OptionHandlerJavadoc",
      "weka.classifiers.meta.MultiScheme",
      "weka.attributeSelection.CorrelationAttributeEval",
      "weka.classifiers.bayes.NaiveBayesMultinomialText",
      "weka.classifiers.trees.RandomTree",
      "weka.classifiers.meta.RandomCommittee",
      "weka.classifiers.trees.LMT",
      "weka.classifiers.functions.supportVector.PrecomputedKernelMatrixKernel",
      "weka.core.tokenizers.NGramTokenizer",
      "weka.classifiers.functions.supportVector.Puk",
      "weka.classifiers.functions.SimpleLinearRegression",
      "weka.attributeSelection.WrapperSubsetEval",
      "weka.classifiers.functions.MultilayerPerceptron",
      "weka.filters.unsupervised.attribute.NominalToBinary",
      "weka.classifiers.functions.neural.SigmoidUnit",
      "weka.classifiers.functions.neural.LinearUnit",
      "weka.classifiers.functions.neural.NeuralConnection",
      "weka.classifiers.functions.MultilayerPerceptron$NeuralEnd",
      "weka.classifiers.meta.MultiClassClassifier",
      "weka.classifiers.meta.MultiClassClassifierUpdateable",
      "weka.classifiers.functions.supportVector.RBFKernel",
      "weka.clusterers.HierarchicalClusterer",
      "weka.estimators.KernelEstimator",
      "weka.attributeSelection.GainRatioAttributeEval",
      "weka.attributeSelection.OneRAttributeEval",
      "weka.classifiers.functions.supportVector.StringKernel",
      "weka.experiment.Stats",
      "weka.clusterers.AbstractDensityBasedClusterer",
      "weka.clusterers.MakeDensityBasedClusterer",
      "weka.core.matrix.Matrix",
      "weka.attributeSelection.SymmetricalUncertAttributeEval",
      "weka.gui.WekaTaskMonitor",
      "weka.gui.LogPanel",
      "weka.core.ChebyshevDistance",
      "weka.clusterers.RandomizableDensityBasedClusterer",
      "weka.clusterers.EM",
      "weka.classifiers.meta.RandomSubSpace",
      "weka.gui.GenericPropertiesCreator",
      "weka.core.ClassDiscovery",
      "weka.core.ClassCache",
      "weka.gui.GenericObjectEditor",
      "weka.core.converters.ConverterUtils",
      "weka.classifiers.trees.RandomForest",
      "weka.classifiers.functions.SMO",
      "weka.attributeSelection.InfoGainAttributeEval",
      "weka.clusterers.SingleClustererEnhancer",
      "weka.clusterers.FilteredClusterer",
      "weka.clusterers.Cobweb",
      "weka.classifiers.meta.AttributeSelectedClassifier",
      "weka.attributeSelection.ReliefFAttributeEval",
      "weka.classifiers.rules.PART",
      "weka.classifiers.bayes.net.BIFReader"
    );
  }
}