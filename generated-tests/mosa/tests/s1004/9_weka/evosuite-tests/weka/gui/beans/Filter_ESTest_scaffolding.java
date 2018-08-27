/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Jul 06 19:57:11 GMT 2018
 */

package weka.gui.beans;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Filter_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "weka.gui.beans.Filter"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Filter_ESTest_scaffolding.class.getClassLoader() ,
      "weka.core.Environment",
      "weka.gui.beans.InstanceEvent",
      "weka.associations.SingleAssociatorEnhancer",
      "weka.gui.beans.TestSetProducer",
      "weka.core.converters.TextDirectoryLoader",
      "org.pentaho.packageManagement.PackageConstraint",
      "org.pentaho.packageManagement.Package",
      "weka.gui.beans.TextEvent",
      "weka.attributeSelection.SubsetEvaluator",
      "weka.gui.beans.LogWriter",
      "weka.gui.beans.TestSetListener",
      "weka.filters.UnsupervisedFilter",
      "weka.core.logging.Logger$Level",
      "weka.gui.beans.Filter$1",
      "weka.gui.beans.DataSourceListener",
      "weka.attributeSelection.CfsSubsetEval",
      "weka.gui.beans.Filter$2",
      "weka.core.DenseInstance",
      "weka.gui.SysErrLog",
      "weka.core.converters.IncrementalConverter",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.gui.beans.WekaWrapper",
      "weka.gui.beans.KnowledgeFlowApp$BeanLayout",
      "org.bounce.net.DefaultAuthenticator",
      "weka.filters.SimpleFilter",
      "weka.filters.SimpleStreamFilter",
      "weka.gui.beans.TestSetEvent",
      "weka.filters.unsupervised.attribute.Add",
      "weka.associations.Apriori",
      "weka.gui.explorer.ClassifierErrorsPlotInstances",
      "weka.gui.beans.ConnectionNotificationConsumer",
      "weka.gui.beans.BatchAssociationRulesListener",
      "weka.core.EnvironmentHandler",
      "weka.core.RelationalLocator",
      "weka.core.Utils",
      "weka.core.CustomDisplayStringProvider",
      "weka.gui.beans.KnowledgeFlowApp$MainKFPerspective",
      "weka.gui.beans.GraphEvent",
      "weka.core.NoSupportForMissingValuesException",
      "weka.associations.FilteredAssociator",
      "weka.classifiers.UpdateableClassifier",
      "weka.gui.beans.VisualizableErrorEvent",
      "weka.gui.visualize.VisualizePanel",
      "weka.core.TechnicalInformation$Type",
      "weka.gui.beans.BeanVisual",
      "weka.gui.beans.KFStep",
      "weka.core.Copyable",
      "weka.core.Capabilities",
      "weka.core.AttributeLocator",
      "weka.gui.beans.KnowledgeFlowApp$20",
      "weka.gui.beans.KnowledgeFlowApp$KFPerspective",
      "weka.gui.beans.GraphListener",
      "weka.clusterers.UpdateableClusterer",
      "weka.attributeSelection.BestFirst",
      "weka.core.Summarizable",
      "weka.gui.beans.BeanCustomizer$ModifyListener",
      "org.pentaho.packageManagement.PackageManager$1",
      "weka.attributeSelection.GreedyStepwise",
      "weka.associations.AssociationRules",
      "weka.gui.beans.InstanceListener",
      "weka.gui.beans.BatchAssociationRulesEvent",
      "weka.gui.explorer.AbstractPlotInstances",
      "weka.gui.beans.Associator$1",
      "weka.core.SingleIndex",
      "weka.gui.beans.ImageListener",
      "weka.core.CapabilitiesHandler",
      "weka.gui.beans.BatchClassifierListener",
      "weka.gui.beans.ThresholdDataEvent",
      "weka.associations.Associator",
      "weka.attributeSelection.ASEvaluation",
      "weka.core.AbstractInstance",
      "weka.gui.beans.KnowledgeFlowApp$34",
      "weka.filters.unsupervised.attribute.SwapValues",
      "weka.gui.beans.SubstringLabeler",
      "weka.core.SelectedTag",
      "weka.gui.beans.StructureProducer",
      "org.pentaho.packageManagement.DefaultPackage",
      "weka.core.Queue",
      "weka.core.Version",
      "weka.attributeSelection.AttributeSelection",
      "weka.gui.beans.ClassifierPerformanceEvaluator",
      "weka.core.converters.AbstractLoader",
      "weka.gui.beans.DataSource",
      "weka.filters.AllFilter",
      "weka.gui.beans.HeadlessEventCollector",
      "weka.gui.Logger",
      "weka.core.converters.BatchConverter",
      "weka.core.Tag",
      "weka.gui.beans.ThresholdDataListener",
      "weka.gui.beans.BeanCommon",
      "weka.gui.beans.ConfigurationListener",
      "weka.gui.beans.VisualizableErrorListener",
      "weka.gui.visualize.PrintableHandler",
      "weka.core.OptionHandler",
      "weka.core.WekaException",
      "weka.filters.supervised.attribute.AttributeSelection",
      "weka.filters.StreamableFilter",
      "weka.gui.beans.ClassValuePicker",
      "weka.core.Range",
      "weka.gui.beans.Visible",
      "weka.core.Attribute$1",
      "weka.classifiers.Classifier",
      "weka.gui.beans.ConfigurationProducer",
      "weka.core.Capabilities$Capability",
      "weka.core.SparseInstance",
      "org.pentaho.packageManagement.PackageManager",
      "weka.associations.CARuleMiner",
      "weka.core.WekaEnumeration",
      "weka.gui.beans.OffscreenChartRenderer",
      "weka.filters.unsupervised.attribute.ReplaceMissingValues",
      "weka.classifiers.Evaluation",
      "weka.attributeSelection.ASSearch",
      "weka.core.WekaPackageManager",
      "weka.filters.SupervisedFilter",
      "weka.gui.beans.UserRequestAcceptor",
      "weka.gui.beans.ScatterPlotMatrix",
      "weka.gui.beans.KnowledgeFlowApp",
      "weka.core.TechnicalInformationHandler",
      "weka.gui.beans.KnowledgeFlowApp$InvisibleNode",
      "weka.attributeSelection.StartSetHandler",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.associations.FilteredAssociationRules",
      "weka.gui.ExtensionFileFilter",
      "weka.gui.beans.DataVisualizer",
      "weka.filters.Sourcable",
      "weka.gui.beans.AbstractEvaluator",
      "weka.core.Attribute",
      "weka.gui.beans.TrainingSetListener",
      "weka.core.FastVector",
      "weka.core.Memory",
      "weka.gui.visualize.PrintablePanel",
      "weka.gui.beans.ClassAssigner",
      "weka.attributeSelection.RankedOutputSearch",
      "weka.core.Instance",
      "weka.gui.beans.EventConstraints",
      "weka.core.converters.Loader",
      "weka.core.ProtectedProperties",
      "weka.gui.beans.ImageEvent",
      "weka.gui.beans.BatchClassifierEvent",
      "weka.gui.beans.TrainingSetEvent",
      "weka.core.StringLocator",
      "weka.core.AttributeStats",
      "weka.filters.MultiFilter",
      "weka.core.WeightedInstancesHandler",
      "weka.gui.beans.Filter",
      "weka.core.TechnicalInformation$Field",
      "weka.gui.beans.Associator",
      "weka.associations.AssociationRulesProducer",
      "weka.filters.unsupervised.attribute.Remove",
      "weka.core.Instances",
      "weka.gui.visualize.MatrixPanel",
      "weka.gui.beans.DataSetEvent",
      "weka.gui.beans.DataFormatListener",
      "weka.core.UnassignedClassException",
      "weka.attributeSelection.Ranker",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.core.TechnicalInformation",
      "weka.gui.beans.TrainingSetProducer",
      "weka.core.RevisionHandler",
      "weka.associations.AbstractAssociator",
      "weka.gui.AttributeSelectionPanel",
      "weka.filters.Filter",
      "weka.gui.beans.TextListener",
      "weka.filters.supervised.attribute.Discretize"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Filter_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "weka.gui.beans.Filter",
      "weka.gui.beans.BeanVisual",
      "weka.filters.Filter",
      "weka.filters.AllFilter",
      "weka.gui.beans.InstanceEvent",
      "weka.core.Memory",
      "weka.gui.beans.KnowledgeFlowApp",
      "weka.core.Instances",
      "weka.gui.beans.Associator",
      "weka.associations.AbstractAssociator",
      "weka.core.Tag",
      "weka.associations.Apriori",
      "weka.core.TechnicalInformation",
      "weka.core.TechnicalInformation$Type",
      "weka.core.TechnicalInformation$Field",
      "weka.filters.supervised.attribute.AttributeSelection",
      "weka.attributeSelection.AttributeSelection",
      "weka.attributeSelection.ASEvaluation",
      "weka.attributeSelection.CfsSubsetEval",
      "weka.attributeSelection.ASSearch",
      "weka.attributeSelection.GreedyStepwise",
      "weka.core.Range",
      "weka.attributeSelection.BestFirst",
      "weka.core.NormalizableDistance",
      "weka.core.EuclideanDistance",
      "weka.classifiers.AbstractClassifier",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.classifiers.rules.ZeroR",
      "weka.classifiers.CostMatrix",
      "weka.classifiers.lazy.IBk",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.core.converters.AbstractLoader",
      "weka.core.converters.DatabaseLoader",
      "weka.core.Version",
      "weka.core.Environment",
      "weka.experiment.DatabaseUtils",
      "weka.core.converters.DatabaseConnection",
      "weka.core.Utils",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.core.logging.Logger$Level",
      "weka.core.WekaPackageManager",
      "weka.gui.beans.Appender",
      "weka.gui.beans.TextViewer",
      "weka.core.converters.TextDirectoryLoader",
      "weka.gui.beans.AbstractDataSink",
      "weka.gui.beans.Saver",
      "weka.core.converters.AbstractSaver",
      "weka.core.converters.AbstractFileSaver",
      "weka.core.converters.ArffSaver",
      "weka.core.AbstractInstance",
      "weka.gui.beans.SubstringLabeler",
      "weka.core.xml.KOML",
      "com.thoughtworks.xstream.XStream",
      "weka.core.xml.XStream",
      "weka.gui.beans.SerializedModelSaver",
      "weka.gui.beans.Sorter",
      "weka.gui.beans.PredictionAppender",
      "weka.gui.beans.TrainingSetEvent",
      "weka.gui.beans.AbstractTrainAndTestSetProducer",
      "weka.gui.beans.TrainTestSplitMaker",
      "weka.gui.ExtensionFileFilter",
      "weka.core.ClassDiscovery",
      "weka.core.ClassCache",
      "weka.gui.beans.InstanceStreamToBatchMaker",
      "weka.gui.explorer.AbstractPlotInstances",
      "weka.gui.explorer.ClassifierErrorsPlotInstances",
      "weka.core.FastVector",
      "weka.gui.explorer.ExplorerDefaults",
      "weka.gui.beans.TestSetEvent",
      "weka.filters.supervised.instance.StratifiedRemoveFolds",
      "weka.gui.beans.DataVisualizer",
      "weka.gui.beans.AttributeSummarizer",
      "weka.gui.beans.DataSetEvent",
      "weka.clusterers.AbstractClusterer",
      "weka.clusterers.RandomizableClusterer",
      "weka.clusterers.SimpleKMeans",
      "weka.core.converters.AbstractFileLoader",
      "weka.core.converters.JSONLoader",
      "weka.gui.beans.ScatterPlotMatrix",
      "weka.core.Capabilities",
      "weka.core.TestInstances",
      "weka.core.Capabilities$Capability",
      "weka.gui.beans.StripChart",
      "weka.gui.beans.StripChart$ScalePanel",
      "weka.gui.beans.StripChart$LegendPanel",
      "weka.gui.beans.ChartEvent",
      "weka.gui.beans.FlowByExpression",
      "weka.gui.beans.Clusterer",
      "weka.clusterers.AbstractDensityBasedClusterer",
      "weka.clusterers.RandomizableDensityBasedClusterer",
      "weka.clusterers.EM",
      "weka.filters.unsupervised.attribute.Add",
      "weka.core.SingleIndex",
      "weka.gui.beans.ClassAssigner",
      "weka.gui.beans.SubstringReplacer",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.attributeSelection.PrincipalComponents",
      "weka.core.converters.SVMLightLoader",
      "weka.gui.beans.ClassValuePicker",
      "weka.associations.SingleAssociatorEnhancer",
      "weka.associations.FilteredAssociator",
      "weka.filters.SimpleFilter",
      "weka.filters.SimpleStreamFilter",
      "weka.filters.MultiFilter",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.filters.unsupervised.attribute.ReplaceMissingValues",
      "weka.core.SerializedObject",
      "weka.gui.beans.Classifier",
      "weka.gui.beans.IncrementalClassifierEvent",
      "weka.gui.WekaTaskMonitor",
      "weka.gui.LogPanel",
      "weka.gui.beans.AbstractTrainingSetProducer",
      "weka.gui.beans.TrainingSetMaker",
      "weka.gui.beans.CrossValidationFoldMaker",
      "weka.core.TechnicalInformationHandlerJavadoc",
      "weka.gui.beans.AbstractDataSource",
      "weka.gui.beans.Loader",
      "weka.core.converters.ArffLoader",
      "weka.core.ManhattanDistance",
      "weka.gui.beans.FlowByExpression$ExpressionClause$ExpressionType$1",
      "weka.gui.beans.FlowByExpression$ExpressionClause$ExpressionType$2",
      "weka.gui.beans.FlowByExpression$ExpressionClause$ExpressionType$3",
      "weka.gui.beans.FlowByExpression$ExpressionClause$ExpressionType$4",
      "weka.gui.beans.FlowByExpression$ExpressionClause$ExpressionType$5",
      "weka.gui.beans.FlowByExpression$ExpressionClause$ExpressionType$6",
      "weka.gui.beans.FlowByExpression$ExpressionClause$ExpressionType$7",
      "weka.gui.beans.FlowByExpression$ExpressionClause$ExpressionType$8",
      "weka.gui.beans.FlowByExpression$ExpressionClause$ExpressionType$9",
      "weka.gui.beans.FlowByExpression$ExpressionClause$ExpressionType$10",
      "weka.gui.beans.FlowByExpression$ExpressionClause$ExpressionType$11",
      "weka.gui.beans.FlowByExpression$ExpressionClause$ExpressionType",
      "weka.core.SparseInstance",
      "weka.core.BinarySparseInstance",
      "weka.core.tokenizers.Tokenizer",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.core.tokenizers.WordTokenizer",
      "weka.gui.beans.AbstractEvaluator",
      "weka.gui.beans.ClustererPerformanceEvaluator",
      "weka.gui.beans.ClassifierPerformanceEvaluator",
      "weka.gui.beans.MetaBean",
      "weka.filters.supervised.instance.Resample",
      "weka.gui.beans.AbstractTestSetProducer",
      "weka.gui.beans.TestSetMaker",
      "weka.gui.beans.ModelPerformanceChart",
      "weka.core.Attribute",
      "weka.core.ProtectedProperties",
      "weka.core.DenseInstance",
      "weka.classifiers.IteratedSingleClassifierEnhancer",
      "weka.classifiers.RandomizableIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.AdaBoostM1",
      "weka.classifiers.trees.DecisionStump",
      "weka.core.xml.XMLDocument",
      "weka.core.xml.XMLInstances",
      "weka.core.converters.XRFFLoader",
      "weka.filters.supervised.attribute.ClassOrder",
      "weka.core.converters.LibSVMLoader",
      "weka.core.converters.MatlabLoader",
      "weka.core.neighboursearch.BallTree",
      "weka.core.neighboursearch.balltrees.BallTreeConstructor",
      "weka.core.neighboursearch.balltrees.TopDownConstructor",
      "weka.core.neighboursearch.balltrees.BallSplitter",
      "weka.core.neighboursearch.balltrees.PointsClosestToFurthestChildren",
      "weka.gui.beans.CostBenefitAnalysis",
      "weka.filters.supervised.instance.SpreadSubsample",
      "weka.core.neighboursearch.CoverTree",
      "weka.gui.beans.GraphViewer",
      "weka.core.Queue",
      "weka.core.AttributeLocator",
      "weka.core.StringLocator",
      "weka.core.RelationalLocator",
      "weka.core.Queue$QueueNode",
      "weka.filters.supervised.attribute.NominalToBinary",
      "weka.core.converters.SerializedInstancesLoader",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.core.UnassignedDatasetException",
      "weka.classifiers.rules.DecisionTable",
      "weka.core.MinkowskiDistance",
      "weka.core.converters.C45Loader",
      "weka.filters.supervised.attribute.Discretize",
      "weka.core.OptionHandlerJavadoc",
      "weka.experiment.InstanceQuery",
      "weka.core.converters.CSVLoader",
      "weka.core.tokenizers.AlphabeticTokenizer",
      "weka.core.converters.CSVSaver",
      "weka.core.GlobalInfoJavadoc",
      "weka.core.tokenizers.NGramTokenizer",
      "weka.classifiers.meta.FilteredClassifier",
      "weka.classifiers.trees.J48",
      "weka.gui.beans.ImageSaver",
      "weka.core.ChebyshevDistance",
      "weka.gui.beans.IncrementalClassifierEvaluator",
      "weka.clusterers.SingleClustererEnhancer",
      "weka.clusterers.FilteredClusterer",
      "weka.classifiers.bayes.BayesNet",
      "weka.classifiers.bayes.net.search.SearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.K2",
      "weka.classifiers.bayes.net.estimate.BayesNetEstimator",
      "weka.classifiers.bayes.net.estimate.SimpleEstimator",
      "weka.classifiers.bayes.NaiveBayesMultinomial",
      "weka.core.converters.DatabaseSaver",
      "weka.classifiers.MultipleClassifiersCombiner",
      "weka.classifiers.RandomizableMultipleClassifiersCombiner",
      "weka.classifiers.meta.MultiScheme",
      "weka.gui.beans.BatchClassifierEvent",
      "weka.gui.beans.FlowByExpression$ExpressionNode",
      "weka.gui.beans.FlowByExpression$BracketNode",
      "weka.gui.visualize.MatrixPanel",
      "weka.gui.visualize.ClassPanel",
      "weka.gui.visualize.MatrixPanel$Plot",
      "weka.gui.visualize.MatrixPanel$Plot$1",
      "weka.gui.visualize.MatrixPanel$Plot$2",
      "weka.core.AllJavadoc",
      "weka.classifiers.meta.AdditiveRegression",
      "weka.classifiers.meta.RegressionByDiscretization",
      "weka.filters.unsupervised.attribute.Discretize",
      "weka.classifiers.trees.j48.ClassifierTree",
      "weka.classifiers.trees.j48.C45PruneableClassifierTree",
      "weka.gui.AttributeSelectionPanel",
      "weka.gui.beans.Sorter$InstanceHolder",
      "weka.core.neighboursearch.KDTree",
      "weka.core.neighboursearch.kdtrees.KDTreeNodeSplitter",
      "weka.core.neighboursearch.kdtrees.SlidingMidPointOfWidestSide",
      "weka.classifiers.bayes.NaiveBayesMultinomialText",
      "weka.core.stemmers.NullStemmer",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.classifiers.functions.supportVector.PrecomputedKernelMatrixKernel",
      "weka.classifiers.meta.CVParameterSelection",
      "weka.core.AttributeStats",
      "weka.classifiers.meta.AttributeSelectedClassifier",
      "weka.attributeSelection.CorrelationAttributeEval",
      "weka.attributeSelection.InfoGainAttributeEval",
      "weka.classifiers.functions.LinearRegression",
      "weka.classifiers.functions.GaussianProcesses",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.classifiers.functions.supportVector.PolyKernel",
      "weka.core.converters.SVMLightSaver",
      "weka.estimators.Estimator",
      "weka.estimators.NormalEstimator",
      "weka.classifiers.misc.SerializedClassifier",
      "weka.core.converters.LibSVMSaver",
      "weka.classifiers.ParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.RandomizableParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.Bagging",
      "weka.classifiers.trees.REPTree",
      "weka.classifiers.rules.JRip",
      "weka.gui.beans.CostBenefitAnalysis$AnalysisPanel",
      "weka.gui.visualize.PrintablePanel",
      "weka.gui.visualize.VisualizePanel",
      "weka.gui.visualize.VisualizeUtils",
      "weka.gui.visualize.PrintableComponent",
      "weka.gui.GenericObjectEditor",
      "weka.clusterers.MakeDensityBasedClusterer"
    );
  }
}
