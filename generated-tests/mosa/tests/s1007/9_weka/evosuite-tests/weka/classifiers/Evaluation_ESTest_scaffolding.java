/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Jul 06 22:41:28 GMT 2018
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
      "weka.core.TestInstances",
      "weka.filters.unsupervised.attribute.NominalToBinary",
      "weka.core.converters.ConverterUtils",
      "weka.core.converters.TextDirectoryLoader",
      "org.pentaho.packageManagement.PackageConstraint",
      "weka.attributeSelection.AttributeEvaluator",
      "org.pentaho.packageManagement.Package",
      "weka.core.xml.XMLBasicSerialization",
      "weka.classifiers.trees.m5.M5Base",
      "weka.classifiers.CostMatrix",
      "weka.classifiers.bayes.net.search.local.K2",
      "weka.filters.UnsupervisedFilter",
      "weka.core.logging.Logger$Level",
      "weka.classifiers.evaluation.output.prediction.AbstractOutput",
      "weka.core.DenseInstance",
      "weka.classifiers.trees.J48",
      "weka.core.ConjugateGradientOptimization",
      "weka.classifiers.functions.LinearRegression",
      "weka.core.converters.IncrementalConverter",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.estimators.UnivariateIntervalEstimator",
      "org.bounce.net.DefaultAuthenticator",
      "weka.classifiers.meta.MultiClassClassifier$RandomCode",
      "weka.core.EnvironmentHandler",
      "weka.classifiers.trees.j48.C45ModelSelection",
      "weka.classifiers.trees.m5.RuleNode",
      "weka.classifiers.functions.Logistic",
      "weka.core.RelationalLocator",
      "weka.core.Utils",
      "weka.core.CustomDisplayStringProvider",
      "weka.filters.unsupervised.instance.RemoveWithValues",
      "weka.classifiers.functions.SMOreg",
      "weka.core.NoSupportForMissingValuesException",
      "weka.classifiers.UpdateableClassifier",
      "weka.classifiers.ParallelMultipleClassifiersCombiner",
      "weka.core.MultiInstanceCapabilitiesHandler",
      "weka.classifiers.meta.MultiClassClassifier$ExhaustiveCode",
      "weka.core.Copyable",
      "weka.core.Capabilities",
      "weka.core.BinarySparseInstance",
      "weka.filters.supervised.attribute.NominalToBinary",
      "weka.core.AttributeLocator",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.core.SerializedObject",
      "weka.classifiers.meta.RegressionByDiscretization",
      "weka.clusterers.UpdateableClusterer",
      "weka.core.Summarizable",
      "weka.classifiers.trees.j48.ModelSelection",
      "weka.core.AdditionalMeasureProducer",
      "org.pentaho.packageManagement.PackageManager$1",
      "weka.classifiers.meta.MultiClassClassifier",
      "weka.core.Drawable",
      "weka.core.Optimization",
      "weka.classifiers.ConditionalDensityEstimator",
      "weka.core.CapabilitiesHandler",
      "weka.classifiers.trees.REPTree",
      "weka.attributeSelection.ASEvaluation",
      "weka.core.AbstractInstance",
      "weka.classifiers.lazy.kstar.KStarConstants",
      "weka.classifiers.functions.supportVector.RegOptimizer",
      "weka.core.SelectedTag",
      "org.pentaho.packageManagement.DefaultPackage",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.classifiers.bayes.BayesNet",
      "weka.classifiers.trees.j48.C45PruneableClassifierTree",
      "weka.classifiers.ParallelIteratedSingleClassifierEnhancer",
      "weka.core.Version",
      "weka.classifiers.evaluation.Prediction",
      "weka.core.converters.AbstractLoader",
      "weka.classifiers.meta.MultiClassClassifier$Code",
      "weka.classifiers.bayes.net.estimate.SimpleEstimator",
      "weka.filters.unsupervised.attribute.RemoveUseless",
      "weka.core.converters.BatchConverter",
      "weka.core.Tag",
      "weka.classifiers.IteratedSingleClassifierEnhancer",
      "weka.classifiers.trees.j48.BinC45ModelSelection",
      "weka.classifiers.evaluation.NominalPrediction",
      "weka.classifiers.AbstractClassifier",
      "weka.estimators.UnivariateDensityEstimator",
      "weka.core.converters.ArffLoader",
      "weka.classifiers.meta.Stacking",
      "weka.core.OptionHandler",
      "weka.core.WekaException",
      "weka.filters.StreamableFilter",
      "weka.core.Range",
      "weka.core.Attribute$1",
      "weka.core.PartitionGenerator",
      "weka.classifiers.Classifier",
      "weka.attributeSelection.InfoGainAttributeEval",
      "weka.core.Capabilities$Capability",
      "weka.core.SparseInstance",
      "org.pentaho.packageManagement.PackageManager",
      "weka.core.WekaEnumeration",
      "weka.classifiers.trees.j48.ClassifierTree",
      "weka.classifiers.misc.SerializedClassifier",
      "weka.filters.unsupervised.attribute.ReplaceMissingValues",
      "weka.classifiers.meta.Bagging",
      "weka.classifiers.trees.j48.PruneableClassifierTree",
      "weka.classifiers.Evaluation",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.core.WekaPackageManager",
      "weka.estimators.UnivariateEqualFrequencyHistogramEstimator",
      "weka.filters.SupervisedFilter",
      "weka.classifiers.evaluation.TwoClassStats",
      "weka.classifiers.evaluation.ThresholdCurve",
      "weka.core.TechnicalInformationHandler",
      "weka.classifiers.bayes.net.search.SearchAlgorithm",
      "weka.core.converters.URLSourcedLoader",
      "weka.core.converters.FileSourcedConverter",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.core.Option",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.filters.unsupervised.attribute.NumericToBinary",
      "weka.filters.Sourcable",
      "weka.classifiers.meta.MultiClassClassifier$StandardCode",
      "weka.core.Attribute",
      "weka.core.FastVector",
      "weka.estimators.UnivariateKernelEstimator",
      "weka.classifiers.MultipleClassifiersCombiner",
      "weka.classifiers.bayes.net.estimate.BayesNetEstimator",
      "weka.core.UnassignedDatasetException",
      "weka.core.BatchPredictor",
      "weka.classifiers.functions.supportVector.RegSMOImproved",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.core.RevisionUtils",
      "weka.core.Instance",
      "weka.classifiers.functions.supportVector.RegSMO",
      "weka.classifiers.functions.supportVector.PolyKernel",
      "weka.core.converters.Loader",
      "weka.classifiers.lazy.KStar",
      "weka.core.ProtectedProperties",
      "weka.estimators.Estimator",
      "weka.classifiers.IntervalEstimator",
      "weka.core.StringLocator",
      "weka.core.Matchable",
      "weka.classifiers.bayes.net.ADNode",
      "weka.core.AttributeStats",
      "weka.core.WeightedInstancesHandler",
      "weka.classifiers.trees.DecisionStump",
      "weka.classifiers.functions.GaussianProcesses",
      "weka.estimators.UnivariateQuantileEstimator",
      "weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm",
      "weka.filters.unsupervised.attribute.Discretize",
      "weka.core.Randomizable",
      "weka.classifiers.rules.M5Rules",
      "weka.core.Instances",
      "weka.classifiers.RandomizableParallelMultipleClassifiersCombiner",
      "weka.core.converters.AbstractFileLoader",
      "weka.filters.unsupervised.attribute.Normalize",
      "weka.core.converters.ConverterUtils$DataSink",
      "weka.core.UnassignedClassException",
      "weka.classifiers.rules.ZeroR",
      "weka.classifiers.bayes.net.ParentSet",
      "weka.filters.unsupervised.attribute.Standardize",
      "weka.core.TechnicalInformation",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.classifiers.Sourcable",
      "weka.classifiers.functions.Logistic$OptEngCG",
      "weka.classifiers.functions.Logistic$OptEng",
      "weka.core.RevisionHandler",
      "weka.classifiers.evaluation.output.prediction.PlainText",
      "weka.experiment.Stats",
      "weka.core.converters.ConverterUtils$DataSource",
      "weka.core.xml.XMLSerialization",
      "weka.classifiers.xml.XMLClassifier",
      "weka.filters.unsupervised.attribute.MakeIndicator",
      "weka.filters.Filter",
      "weka.classifiers.RandomizableParallelIteratedSingleClassifierEnhancer",
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
      "weka.core.TestInstances",
      "weka.core.converters.AbstractLoader",
      "weka.core.converters.AbstractFileLoader",
      "weka.core.converters.ArffLoader",
      "weka.core.AbstractInstance",
      "weka.core.DenseInstance",
      "weka.core.converters.JSONLoader",
      "weka.classifiers.AbstractClassifier",
      "weka.core.Tag",
      "weka.classifiers.lazy.IBk",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.core.NormalizableDistance",
      "weka.core.EuclideanDistance",
      "weka.core.Range",
      "weka.core.converters.SerializedInstancesLoader",
      "weka.core.xml.XMLDocument",
      "weka.core.xml.XMLInstances",
      "weka.core.converters.XRFFLoader",
      "weka.core.Instances",
      "weka.core.UnassignedClassException",
      "weka.filters.Filter",
      "weka.filters.AllFilter",
      "weka.core.neighboursearch.CoverTree",
      "weka.core.converters.C45Loader",
      "weka.core.converters.TextDirectoryLoader",
      "weka.core.Attribute",
      "weka.core.ProtectedProperties",
      "weka.classifiers.evaluation.output.prediction.AbstractOutput",
      "weka.classifiers.evaluation.output.prediction.PlainText",
      "weka.core.converters.LibSVMLoader",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "weka.classifiers.meta.MultiClassClassifier",
      "weka.classifiers.meta.MultiClassClassifierUpdateable",
      "weka.classifiers.rules.ZeroR",
      "weka.classifiers.functions.Logistic",
      "weka.core.converters.MatlabLoader",
      "weka.core.SparseInstance",
      "weka.core.BinarySparseInstance",
      "weka.core.converters.DatabaseLoader",
      "weka.core.Environment",
      "weka.experiment.DatabaseUtils",
      "weka.core.converters.DatabaseConnection",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.core.logging.Logger$Level",
      "weka.core.WekaPackageManager",
      "weka.experiment.InstanceQuery",
      "weka.classifiers.CostMatrix",
      "weka.core.UnassignedDatasetException",
      "weka.core.converters.CSVLoader",
      "weka.clusterers.AbstractClusterer",
      "weka.clusterers.RandomizableClusterer",
      "weka.clusterers.SimpleKMeans",
      "weka.attributeSelection.ASEvaluation",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.attributeSelection.PrincipalComponents",
      "weka.core.converters.SVMLightLoader",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.classifiers.meta.RegressionByDiscretization",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.filters.unsupervised.attribute.Discretize",
      "weka.classifiers.trees.J48",
      "weka.classifiers.MultipleClassifiersCombiner",
      "weka.classifiers.RandomizableMultipleClassifiersCombiner",
      "weka.classifiers.meta.Vote",
      "weka.core.Capabilities",
      "weka.core.Capabilities$Capability",
      "weka.classifiers.functions.SMO",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.classifiers.functions.supportVector.PolyKernel",
      "weka.classifiers.bayes.NaiveBayesMultinomialText",
      "weka.core.tokenizers.Tokenizer",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.core.tokenizers.WordTokenizer",
      "weka.core.stemmers.NullStemmer",
      "weka.classifiers.RandomizableClassifier",
      "weka.classifiers.functions.SGD",
      "weka.classifiers.trees.DecisionStump",
      "weka.filters.SimpleFilter",
      "weka.filters.SimpleStreamFilter",
      "weka.filters.MultiFilter",
      "weka.core.neighboursearch.KDTree",
      "weka.core.neighboursearch.kdtrees.KDTreeNodeSplitter",
      "weka.core.neighboursearch.kdtrees.SlidingMidPointOfWidestSide",
      "weka.classifiers.bayes.NaiveBayes",
      "weka.classifiers.bayes.NaiveBayesUpdateable",
      "weka.classifiers.pmml.consumer.PMMLClassifier",
      "weka.classifiers.pmml.consumer.SupportVectorMachineModel",
      "weka.classifiers.pmml.consumer.NeuralNetwork$MiningFunction",
      "weka.classifiers.pmml.consumer.SupportVectorMachineModel$classificationMethod",
      "weka.classifiers.pmml.consumer.SupportVectorMachineModel$SVM_representation",
      "weka.core.pmml.VectorDictionary",
      "weka.classifiers.pmml.consumer.SupportVectorMachineModel$Kernel",
      "weka.core.SingleIndex",
      "weka.experiment.Stats",
      "weka.classifiers.misc.SerializedClassifier",
      "weka.classifiers.functions.SMOreg",
      "weka.classifiers.functions.supportVector.RegOptimizer",
      "weka.classifiers.functions.supportVector.RegSMO",
      "weka.classifiers.functions.supportVector.RegSMOImproved",
      "weka.classifiers.trees.m5.M5Base",
      "weka.classifiers.rules.M5Rules",
      "weka.classifiers.ParallelMultipleClassifiersCombiner",
      "weka.classifiers.RandomizableParallelMultipleClassifiersCombiner",
      "weka.classifiers.meta.Stacking",
      "weka.core.AttributeStats",
      "weka.classifiers.meta.FilteredClassifier",
      "weka.filters.supervised.attribute.AttributeSelection",
      "weka.attributeSelection.AttributeSelection",
      "weka.attributeSelection.CfsSubsetEval",
      "weka.attributeSelection.ASSearch",
      "weka.attributeSelection.GreedyStepwise",
      "weka.attributeSelection.BestFirst",
      "weka.filters.supervised.attribute.Discretize",
      "weka.classifiers.bayes.BayesNet",
      "weka.classifiers.bayes.net.search.SearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.K2",
      "weka.classifiers.bayes.net.estimate.BayesNetEstimator",
      "weka.classifiers.bayes.net.estimate.SimpleEstimator",
      "weka.estimators.Estimator",
      "weka.estimators.NormalEstimator",
      "weka.classifiers.trees.REPTree",
      "weka.clusterers.FarthestFirst",
      "weka.classifiers.evaluation.output.prediction.XML",
      "weka.classifiers.evaluation.output.prediction.Null",
      "weka.estimators.UnivariateKernelEstimator",
      "weka.core.neighboursearch.BallTree",
      "weka.core.neighboursearch.balltrees.BallTreeConstructor",
      "weka.core.neighboursearch.balltrees.TopDownConstructor",
      "weka.core.neighboursearch.balltrees.BallSplitter",
      "weka.core.neighboursearch.balltrees.PointsClosestToFurthestChildren",
      "weka.core.converters.ConverterUtils$DataSource",
      "weka.classifiers.meta.CVParameterSelection",
      "weka.core.FastVector",
      "weka.classifiers.rules.JRip",
      "weka.classifiers.lazy.LWL",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.core.ClassDiscovery",
      "weka.classifiers.functions.SGDText",
      "weka.classifiers.IteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.AdditiveRegression",
      "weka.classifiers.trees.RandomTree",
      "weka.classifiers.functions.GaussianProcesses",
      "weka.classifiers.trees.RandomForest",
      "weka.attributeSelection.CorrelationAttributeEval",
      "weka.attributeSelection.InfoGainAttributeEval",
      "weka.clusterers.AbstractDensityBasedClusterer",
      "weka.clusterers.RandomizableDensityBasedClusterer",
      "weka.clusterers.EM",
      "weka.clusterers.MakeDensityBasedClusterer",
      "weka.classifiers.functions.LinearRegression",
      "weka.estimators.UnivariateEqualFrequencyHistogramEstimator",
      "weka.classifiers.functions.VotedPerceptron",
      "weka.core.OptionHandlerJavadoc",
      "weka.classifiers.functions.SimpleLogistic",
      "weka.core.SerializedObject",
      "weka.core.matrix.Matrix",
      "weka.classifiers.rules.PART",
      "weka.classifiers.bayes.NaiveBayesMultinomial",
      "weka.classifiers.bayes.NaiveBayesMultinomialUpdateable",
      "weka.classifiers.ParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.RandomizableParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.Bagging",
      "weka.clusterers.Cobweb",
      "weka.classifiers.trees.M5P",
      "weka.attributeSelection.SymmetricalUncertAttributeEval",
      "weka.classifiers.rules.OneR",
      "weka.classifiers.rules.OneR$OneRRule",
      "weka.classifiers.rules.DecisionTable",
      "weka.core.ManhattanDistance",
      "weka.classifiers.trees.j48.ClassifierTree",
      "weka.classifiers.trees.j48.C45PruneableClassifierTree",
      "weka.classifiers.meta.ClassificationViaRegression",
      "weka.estimators.KernelEstimator",
      "weka.core.TechnicalInformationHandlerJavadoc",
      "weka.core.GlobalInfoJavadoc",
      "weka.classifiers.functions.supportVector.Puk",
      "weka.core.WekaException",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.classifiers.functions.supportVector.PrecomputedKernelMatrixKernel",
      "weka.classifiers.functions.SimpleLinearRegression",
      "weka.classifiers.functions.supportVector.NormalizedPolyKernel",
      "weka.gui.GenericPropertiesCreator",
      "weka.core.ClassCache",
      "weka.gui.GenericObjectEditor",
      "weka.core.converters.ConverterUtils",
      "weka.estimators.PoissonEstimator",
      "weka.classifiers.trees.LMT",
      "weka.classifiers.lazy.KStar",
      "weka.attributeSelection.ReliefFAttributeEval",
      "weka.classifiers.meta.RandomCommittee",
      "weka.classifiers.rules.part.MakeDecList",
      "weka.core.TechnicalInformation",
      "weka.core.TechnicalInformation$Type",
      "weka.core.TechnicalInformation$Field",
      "weka.classifiers.RandomizableIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.LogitBoost",
      "weka.classifiers.meta.MultiScheme",
      "weka.gui.LogPanel",
      "weka.classifiers.pmml.consumer.Regression",
      "weka.classifiers.pmml.consumer.Regression$Normalization",
      "weka.classifiers.evaluation.NominalPrediction",
      "weka.classifiers.evaluation.Prediction",
      "weka.classifiers.meta.AdaBoostM1",
      "weka.classifiers.evaluation.output.prediction.HTML",
      "weka.estimators.DiscreteEstimator",
      "weka.classifiers.evaluation.output.prediction.CSV",
      "weka.attributeSelection.WrapperSubsetEval",
      "weka.classifiers.meta.AttributeSelectedClassifier",
      "weka.classifiers.pmml.consumer.RuleSetModel",
      "weka.classifiers.pmml.consumer.TreeModel$MiningFunction",
      "weka.classifiers.meta.RandomSubSpace",
      "weka.gui.WekaTaskMonitor",
      "weka.clusterers.SingleClustererEnhancer",
      "weka.clusterers.FilteredClusterer",
      "weka.classifiers.evaluation.NumericPrediction",
      "weka.core.tokenizers.NGramTokenizer",
      "weka.clusterers.ClusterEvaluation",
      "weka.core.ChebyshevDistance",
      "weka.attributeSelection.GainRatioAttributeEval",
      "weka.filters.unsupervised.attribute.ReplaceMissingValues",
      "weka.core.Queue",
      "weka.core.AttributeLocator",
      "weka.core.StringLocator",
      "weka.core.RelationalLocator",
      "weka.core.Queue$QueueNode",
      "weka.filters.unsupervised.attribute.NominalToBinary",
      "weka.filters.unsupervised.attribute.Normalize",
      "weka.classifiers.functions.supportVector.SMOset",
      "weka.classifiers.functions.MultilayerPerceptron",
      "weka.classifiers.functions.neural.SigmoidUnit",
      "weka.classifiers.functions.neural.LinearUnit",
      "weka.classifiers.functions.supportVector.StringKernel",
      "weka.classifiers.evaluation.ThresholdCurve",
      "weka.clusterers.HierarchicalClusterer",
      "weka.core.converters.ConverterUtils$DataSink",
      "weka.classifiers.evaluation.TwoClassStats"
    );
  }
}