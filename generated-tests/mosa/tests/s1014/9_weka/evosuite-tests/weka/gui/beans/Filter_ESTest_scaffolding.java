/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Jul 07 05:44:20 GMT 2018
 */

package weka.gui.beans;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
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
    java.lang.System.setProperty("sun.jnu.encoding", "ANSI_X3.4-1968"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Filter_ESTest_scaffolding.class.getClassLoader() ,
      "weka.core.Environment",
      "weka.gui.beans.InstanceEvent",
      "weka.gui.beans.TestSetProducer",
      "weka.core.converters.TextDirectoryLoader",
      "weka.core.converters.Saver",
      "org.pentaho.packageManagement.Package",
      "weka.core.converters.AbstractFileSaver",
      "weka.gui.beans.TextEvent",
      "weka.gui.beans.LogWriter",
      "weka.gui.beans.TestSetListener",
      "weka.filters.UnsupervisedFilter",
      "weka.core.logging.Logger$Level",
      "weka.core.logging.OutputLogger",
      "weka.gui.beans.Filter$1",
      "weka.gui.beans.DataSourceListener",
      "weka.gui.beans.Filter$2",
      "weka.gui.SysErrLog",
      "weka.core.converters.DatabaseConverter",
      "weka.gui.beans.SubstringReplacer",
      "weka.core.converters.IncrementalConverter",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.gui.beans.Saver",
      "weka.gui.beans.WekaWrapper",
      "weka.gui.beans.KnowledgeFlowApp$BeanLayout",
      "org.bounce.net.DefaultAuthenticator",
      "weka.filters.SimpleFilter",
      "weka.filters.SimpleStreamFilter",
      "weka.gui.beans.TestSetEvent",
      "weka.filters.unsupervised.attribute.Add",
      "weka.associations.Apriori",
      "weka.gui.beans.ConnectionNotificationConsumer",
      "weka.gui.beans.BatchAssociationRulesListener",
      "weka.core.EnvironmentHandler",
      "weka.core.RelationalLocator",
      "weka.core.Utils",
      "weka.core.CustomDisplayStringProvider",
      "weka.gui.beans.KnowledgeFlowApp$MainKFPerspective",
      "weka.gui.beans.GraphEvent",
      "weka.core.NoSupportForMissingValuesException",
      "weka.classifiers.UpdateableClassifier",
      "weka.gui.visualize.VisualizePanel",
      "weka.core.TechnicalInformation$Type",
      "weka.gui.beans.BeanVisual",
      "weka.gui.beans.KFStep",
      "weka.core.Copyable",
      "weka.core.Capabilities",
      "weka.core.AttributeLocator",
      "weka.gui.beans.AbstractDataSink",
      "weka.gui.beans.KnowledgeFlowApp$20",
      "weka.gui.beans.KnowledgeFlowApp$KFPerspective",
      "weka.gui.beans.GraphListener",
      "weka.gui.beans.Appender",
      "weka.clusterers.UpdateableClusterer",
      "weka.gui.beans.BeanCustomizer$ModifyListener",
      "org.pentaho.packageManagement.PackageManager$1",
      "weka.core.AdditionalMeasureProducer",
      "weka.core.converters.AbstractSaver",
      "weka.core.logging.Logger",
      "weka.associations.AssociationRules",
      "weka.gui.beans.InstanceListener",
      "weka.gui.beans.Classifier",
      "weka.core.Drawable",
      "weka.gui.beans.BatchAssociationRulesEvent",
      "weka.core.ListOptions",
      "weka.gui.beans.Associator$1",
      "weka.core.SingleIndex",
      "weka.gui.beans.ImageListener",
      "weka.core.CapabilitiesHandler",
      "weka.gui.TaskLogger",
      "weka.gui.beans.BatchClassifierListener",
      "weka.gui.beans.ThresholdDataEvent",
      "weka.associations.Associator",
      "weka.core.AbstractInstance",
      "weka.gui.beans.KnowledgeFlowApp$34",
      "weka.gui.beans.SubstringLabeler",
      "weka.core.SelectedTag",
      "weka.gui.beans.StructureProducer",
      "org.pentaho.packageManagement.DefaultPackage",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.gui.beans.ConfigurationEvent",
      "weka.core.Queue",
      "weka.core.Version",
      "weka.core.converters.AbstractLoader",
      "weka.gui.beans.DataSource",
      "weka.filters.AllFilter",
      "weka.gui.beans.HeadlessEventCollector",
      "weka.gui.Logger",
      "weka.core.converters.BatchConverter",
      "weka.gui.beans.Saver$SaveBatchThread",
      "weka.core.Tag",
      "weka.gui.beans.ThresholdDataListener",
      "weka.gui.ResultHistoryPanel",
      "weka.gui.beans.BeanCommon",
      "weka.gui.beans.ConfigurationListener",
      "weka.gui.visualize.PrintableHandler",
      "weka.classifiers.AbstractClassifier",
      "weka.core.OptionHandler",
      "weka.core.WekaException",
      "weka.filters.StreamableFilter",
      "weka.core.Range",
      "weka.gui.beans.Visible",
      "weka.core.Attribute$1",
      "weka.classifiers.Classifier",
      "weka.gui.beans.ConfigurationProducer",
      "weka.core.Capabilities$Capability",
      "weka.core.logging.ConsoleLogger",
      "org.pentaho.packageManagement.PackageManager",
      "weka.core.WekaEnumeration",
      "weka.associations.CARuleMiner",
      "weka.core.logging.OutputLogger$OutputPrintStream",
      "weka.gui.beans.OffscreenChartRenderer",
      "weka.gui.LogPanel",
      "weka.gui.LogPanel$4",
      "weka.core.WekaPackageManager",
      "weka.gui.LogPanel$1",
      "weka.gui.beans.FlowByExpression$BracketNode",
      "weka.filters.SupervisedFilter",
      "weka.gui.beans.UserRequestAcceptor",
      "weka.gui.beans.ScatterPlotMatrix",
      "weka.gui.WekaTaskMonitor",
      "weka.gui.beans.KnowledgeFlowApp",
      "weka.core.TechnicalInformationHandler",
      "weka.gui.beans.KnowledgeFlowApp$InvisibleNode",
      "weka.core.converters.FileSourcedConverter",
      "weka.gui.ExtensionFileFilter",
      "weka.gui.beans.DataVisualizer",
      "weka.filters.Sourcable",
      "weka.core.converters.ArffSaver",
      "weka.gui.beans.TextViewer",
      "weka.core.Attribute",
      "weka.gui.beans.TrainingSetListener",
      "weka.core.FastVector",
      "weka.core.Memory",
      "weka.core.UnassignedDatasetException",
      "weka.gui.visualize.PrintablePanel",
      "weka.gui.beans.ClassAssigner",
      "weka.gui.beans.FlowByExpression",
      "weka.gui.beans.AbstractTrainingSetProducer",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.gui.beans.IncrementalClassifierListener",
      "weka.core.Instance",
      "weka.gui.beans.EventConstraints",
      "weka.gui.beans.FlowByExpression$ExpressionNode",
      "weka.core.converters.Loader",
      "weka.gui.beans.ImageEvent",
      "weka.core.ProtectedProperties",
      "weka.gui.beans.BatchClassifierEvent",
      "weka.gui.beans.TrainingSetEvent",
      "weka.core.StringLocator",
      "weka.core.AttributeStats",
      "weka.gui.beans.IncrementalClassifierEvent",
      "weka.filters.MultiFilter",
      "weka.core.WeightedInstancesHandler",
      "weka.gui.beans.Filter",
      "weka.gui.beans.DataSink",
      "weka.core.TechnicalInformation$Field",
      "weka.gui.beans.Associator",
      "weka.associations.AssociationRulesProducer",
      "weka.filters.unsupervised.attribute.Remove",
      "weka.core.Tee",
      "weka.core.Instances",
      "weka.gui.visualize.MatrixPanel",
      "weka.core.logging.FileLogger",
      "weka.gui.beans.DataSetEvent",
      "weka.gui.beans.DataFormatListener",
      "weka.core.UnassignedClassException",
      "weka.classifiers.rules.ZeroR",
      "weka.gui.beans.TrainingSetMaker",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.core.TechnicalInformation",
      "weka.gui.beans.TrainingSetProducer",
      "weka.classifiers.Sourcable",
      "weka.core.RevisionHandler",
      "weka.gui.AttributeSelectionPanel",
      "weka.associations.AbstractAssociator",
      "weka.filters.Filter",
      "weka.gui.beans.TextListener"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("weka.gui.beans.ConfigurationListener", false, Filter_ESTest_scaffolding.class.getClassLoader()));
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
      "weka.core.Tag",
      "weka.filters.unsupervised.attribute.Add",
      "weka.core.SingleIndex",
      "weka.core.FastVector",
      "weka.gui.beans.FlowByExpression",
      "weka.core.Version",
      "weka.core.Environment",
      "weka.gui.beans.TextViewer",
      "weka.gui.beans.DataVisualizer",
      "weka.gui.beans.ScatterPlotMatrix",
      "weka.classifiers.AbstractClassifier",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.classifiers.meta.FilteredClassifier",
      "weka.classifiers.rules.ZeroR",
      "weka.filters.supervised.attribute.AttributeSelection",
      "weka.attributeSelection.AttributeSelection",
      "weka.attributeSelection.ASEvaluation",
      "weka.attributeSelection.CfsSubsetEval",
      "weka.attributeSelection.ASSearch",
      "weka.attributeSelection.GreedyStepwise",
      "weka.core.Range",
      "weka.attributeSelection.BestFirst",
      "weka.classifiers.trees.J48",
      "weka.filters.supervised.attribute.Discretize",
      "weka.classifiers.meta.ClassificationViaRegression",
      "weka.classifiers.trees.m5.M5Base",
      "weka.classifiers.trees.M5P",
      "weka.core.SerializedObject",
      "weka.core.converters.AbstractLoader",
      "weka.core.converters.AbstractFileLoader",
      "weka.core.converters.JSONLoader",
      "weka.classifiers.CostMatrix",
      "weka.gui.beans.Sorter",
      "weka.core.converters.SVMLightLoader",
      "weka.gui.beans.AbstractDataSink",
      "weka.gui.beans.Saver",
      "weka.core.converters.AbstractSaver",
      "weka.core.converters.AbstractFileSaver",
      "weka.core.converters.ArffSaver",
      "weka.core.AbstractInstance",
      "weka.filters.supervised.attribute.ClassOrder",
      "weka.core.Utils",
      "weka.filters.supervised.instance.Resample",
      "weka.core.converters.ArffLoader",
      "weka.gui.beans.AbstractTestSetProducer",
      "weka.gui.beans.TestSetMaker",
      "weka.gui.beans.ClassAssigner",
      "weka.gui.beans.PredictionAppender",
      "weka.gui.beans.SubstringLabeler",
      "weka.gui.beans.AbstractTrainAndTestSetProducer",
      "weka.gui.beans.CrossValidationFoldMaker",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.core.neighboursearch.CoverTree",
      "weka.core.NormalizableDistance",
      "weka.core.EuclideanDistance",
      "weka.core.SparseInstance",
      "weka.core.BinarySparseInstance",
      "weka.gui.beans.AbstractTrainingSetProducer",
      "weka.gui.beans.TrainingSetMaker",
      "weka.core.ChebyshevDistance",
      "weka.core.TechnicalInformation",
      "weka.core.TechnicalInformation$Type",
      "weka.core.TechnicalInformation$Field",
      "weka.gui.beans.Classifier",
      "weka.gui.beans.IncrementalClassifierEvent",
      "weka.gui.ExtensionFileFilter",
      "weka.gui.beans.AbstractDataSource",
      "weka.gui.beans.Loader",
      "weka.gui.beans.AttributeSummarizer",
      "weka.core.converters.LibSVMLoader",
      "weka.gui.beans.Appender",
      "weka.filters.supervised.instance.SpreadSubsample",
      "weka.filters.SimpleFilter",
      "weka.filters.SimpleStreamFilter",
      "weka.filters.MultiFilter",
      "weka.gui.beans.CostBenefitAnalysis",
      "weka.core.MinkowskiDistance",
      "weka.gui.explorer.AbstractPlotInstances",
      "weka.gui.explorer.ClassifierErrorsPlotInstances",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.core.logging.Logger$Level",
      "weka.core.WekaPackageManager",
      "weka.gui.explorer.ExplorerDefaults",
      "weka.gui.beans.ModelPerformanceChart",
      "weka.gui.beans.SubstringReplacer",
      "weka.gui.beans.DataSetEvent",
      "weka.gui.beans.StripChart",
      "weka.gui.beans.StripChart$ScalePanel",
      "weka.gui.beans.StripChart$LegendPanel",
      "weka.gui.beans.ChartEvent",
      "weka.core.converters.MatlabLoader",
      "weka.gui.beans.MetaBean",
      "weka.gui.beans.InstanceStreamToBatchMaker",
      "weka.core.converters.SerializedInstancesLoader",
      "weka.gui.beans.TrainTestSplitMaker",
      "weka.core.GlobalInfoJavadoc",
      "weka.gui.beans.Associator",
      "weka.associations.AbstractAssociator",
      "weka.associations.Apriori",
      "weka.filters.supervised.attribute.NominalToBinary",
      "weka.core.converters.CSVLoader",
      "weka.gui.beans.Sorter$InstanceHolder",
      "weka.gui.beans.Clusterer",
      "weka.clusterers.AbstractClusterer",
      "weka.clusterers.AbstractDensityBasedClusterer",
      "weka.clusterers.RandomizableDensityBasedClusterer",
      "weka.clusterers.EM",
      "weka.core.tokenizers.Tokenizer",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.core.tokenizers.WordTokenizer",
      "weka.gui.beans.TrainingSetEvent",
      "weka.clusterers.SingleClustererEnhancer",
      "weka.clusterers.FilteredClusterer",
      "weka.clusterers.RandomizableClusterer",
      "weka.clusterers.SimpleKMeans",
      "weka.core.converters.SerializedInstancesSaver",
      "weka.core.Capabilities",
      "weka.core.Capabilities$Capability",
      "weka.core.TestInstances",
      "weka.gui.beans.ClassValuePicker",
      "weka.gui.beans.AbstractEvaluator",
      "weka.gui.beans.ClustererPerformanceEvaluator",
      "weka.gui.WekaTaskMonitor",
      "weka.gui.LogPanel",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.attributeSelection.PrincipalComponents",
      "weka.core.xml.XMLDocument",
      "weka.core.xml.XMLInstances",
      "weka.core.converters.XRFFLoader",
      "weka.classifiers.bayes.BayesNet",
      "weka.classifiers.bayes.net.search.SearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.K2",
      "weka.classifiers.bayes.net.estimate.BayesNetEstimator",
      "weka.classifiers.bayes.net.estimate.SimpleEstimator",
      "weka.gui.beans.GraphViewer",
      "weka.classifiers.trees.DecisionStump",
      "weka.core.tokenizers.AlphabeticTokenizer",
      "weka.filters.supervised.instance.StratifiedRemoveFolds",
      "weka.core.Instances",
      "weka.core.ClassDiscovery",
      "weka.core.ClassCache",
      "weka.gui.beans.ImageSaver",
      "weka.core.TechnicalInformationHandlerJavadoc",
      "weka.core.tokenizers.NGramTokenizer",
      "weka.core.UnassignedDatasetException",
      "weka.gui.beans.TestSetEvent",
      "weka.core.neighboursearch.KDTree",
      "weka.core.neighboursearch.kdtrees.KDTreeNodeSplitter",
      "weka.core.neighboursearch.kdtrees.SlidingMidPointOfWidestSide",
      "weka.core.converters.C45Loader",
      "weka.core.xml.KOML",
      "com.thoughtworks.xstream.XStream",
      "weka.core.xml.XStream",
      "weka.gui.beans.SerializedModelSaver",
      "weka.core.AllJavadoc",
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
      "weka.classifiers.lazy.IBk",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.core.converters.DatabaseLoader",
      "weka.experiment.DatabaseUtils",
      "weka.core.converters.DatabaseConnection",
      "weka.experiment.InstanceQuery",
      "weka.gui.beans.IncrementalClassifierEvaluator",
      "weka.classifiers.Evaluation",
      "weka.core.converters.TextDirectoryLoader",
      "weka.core.Attribute",
      "weka.core.ProtectedProperties",
      "weka.attributeSelection.CorrelationAttributeEval",
      "weka.core.ManhattanDistance",
      "weka.core.DenseInstance",
      "weka.associations.SingleAssociatorEnhancer",
      "weka.associations.FilteredAssociator",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.filters.unsupervised.attribute.ReplaceMissingValues",
      "weka.gui.beans.ClassifierPerformanceEvaluator",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.classifiers.rules.DecisionTable",
      "weka.core.logging.Logger",
      "weka.core.OptionHandlerJavadoc",
      "weka.gui.beans.BeanInstance",
      "weka.clusterers.Cobweb",
      "weka.classifiers.bayes.NaiveBayesMultinomialText",
      "weka.core.stemmers.NullStemmer",
      "weka.classifiers.rules.JRip",
      "weka.core.converters.SVMLightSaver",
      "weka.core.Queue",
      "weka.core.AttributeLocator",
      "weka.core.StringLocator",
      "weka.core.RelationalLocator",
      "weka.core.Queue$QueueNode",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.classifiers.misc.SerializedClassifier",
      "weka.classifiers.functions.Logistic",
      "weka.core.converters.ConverterUtils$DataSource",
      "weka.core.converters.CSVSaver",
      "weka.estimators.Estimator",
      "weka.estimators.KernelEstimator",
      "weka.estimators.NormalEstimator",
      "weka.attributeSelection.WrapperSubsetEval",
      "weka.core.converters.DatabaseSaver",
      "weka.classifiers.IteratedSingleClassifierEnhancer",
      "weka.classifiers.RandomizableIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.LogitBoost",
      "weka.classifiers.functions.LinearRegression",
      "weka.classifiers.meta.MultiClassClassifier",
      "weka.classifiers.lazy.KStar",
      "weka.attributeSelection.OneRAttributeEval",
      "weka.associations.AssociationRules",
      "weka.classifiers.MultipleClassifiersCombiner",
      "weka.classifiers.ParallelMultipleClassifiersCombiner",
      "weka.classifiers.RandomizableParallelMultipleClassifiersCombiner",
      "weka.classifiers.meta.Stacking",
      "weka.classifiers.meta.AdaBoostM1",
      "weka.core.neighboursearch.BallTree",
      "weka.core.neighboursearch.balltrees.BallTreeConstructor",
      "weka.core.neighboursearch.balltrees.TopDownConstructor",
      "weka.core.neighboursearch.balltrees.BallSplitter",
      "weka.core.neighboursearch.balltrees.PointsClosestToFurthestChildren",
      "weka.gui.visualize.VisualizeUtils",
      "weka.gui.visualize.PrintableComponent",
      "weka.gui.GenericObjectEditor",
      "weka.classifiers.functions.SimpleLinearRegression",
      "weka.classifiers.meta.CVParameterSelection",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.classifiers.functions.supportVector.PrecomputedKernelMatrixKernel",
      "weka.classifiers.rules.PART",
      "weka.classifiers.rules.part.MakeDecList",
      "weka.attributeSelection.ReliefFAttributeEval",
      "weka.core.AttributeStats",
      "weka.classifiers.lazy.LWL",
      "weka.classifiers.ParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.RandomizableParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.RandomCommittee",
      "weka.classifiers.trees.RandomTree",
      "weka.gui.beans.BatchClassifierEvent",
      "weka.clusterers.ClusterEvaluation",
      "weka.estimators.PoissonEstimator",
      "weka.attributeSelection.InfoGainAttributeEval",
      "weka.classifiers.trees.j48.ClassifierTree",
      "weka.classifiers.trees.j48.C45PruneableClassifierTree",
      "weka.classifiers.RandomizableMultipleClassifiersCombiner",
      "weka.classifiers.meta.MultiScheme",
      "weka.classifiers.rules.M5Rules",
      "weka.classifiers.meta.RegressionByDiscretization",
      "weka.filters.unsupervised.attribute.Discretize",
      "weka.classifiers.RandomizableClassifier",
      "weka.classifiers.functions.SGD"
    );
  }
}