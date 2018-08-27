/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Jul 06 19:05:42 GMT 2018
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
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Filter_ESTest_scaffolding.class.getClassLoader() ,
      "weka.core.Environment",
      "weka.gui.beans.InstanceEvent",
      "weka.clusterers.AbstractClusterer",
      "weka.gui.beans.TestSetProducer",
      "weka.core.converters.TextDirectoryLoader",
      "weka.gui.beans.AbstractDataSource",
      "org.pentaho.packageManagement.PackageConstraint",
      "weka.core.converters.Saver",
      "weka.gui.beans.LogWriter",
      "weka.gui.beans.FlowByExpression$ExpressionClause$ExpressionType$4",
      "weka.filters.UnsupervisedFilter",
      "weka.gui.beans.FlowByExpression$ExpressionClause$ExpressionType$5",
      "weka.gui.beans.FlowByExpression$ExpressionClause$ExpressionType$6",
      "weka.gui.beans.FlowByExpression$ExpressionClause$ExpressionType$7",
      "weka.gui.beans.FlowByExpression$ExpressionClause$ExpressionType$8",
      "weka.gui.beans.DataSourceListener",
      "weka.gui.beans.FlowByExpression$ExpressionClause$ExpressionType$9",
      "weka.gui.SysErrLog",
      "weka.core.converters.DatabaseConverter",
      "weka.gui.beans.SubstringReplacer",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.gui.beans.FlowByExpression$1",
      "weka.gui.beans.KnowledgeFlowApp$BeanLayout",
      "org.bounce.net.DefaultAuthenticator",
      "weka.filters.SimpleStreamFilter",
      "weka.gui.beans.TestSetEvent",
      "weka.filters.unsupervised.attribute.Add",
      "weka.associations.Apriori",
      "weka.gui.beans.FlowByExpression$ExpressionClause$ExpressionType$1",
      "weka.gui.beans.ConnectionNotificationConsumer",
      "weka.gui.beans.BatchAssociationRulesListener",
      "weka.gui.beans.FlowByExpression$ExpressionClause$ExpressionType$2",
      "weka.gui.beans.FlowByExpression$ExpressionClause$ExpressionType$3",
      "weka.clusterers.NumberOfClustersRequestable",
      "weka.core.CustomDisplayStringProvider",
      "weka.gui.beans.GraphEvent",
      "weka.gui.beans.KnowledgeFlowApp$MainKFPerspective",
      "weka.core.NormalizableDistance",
      "weka.clusterers.SimpleKMeans",
      "weka.core.TechnicalInformation$Type",
      "weka.core.Copyable",
      "weka.gui.beans.AbstractDataSink",
      "weka.core.BinarySparseInstance",
      "weka.gui.beans.BatchClustererEvent",
      "weka.gui.beans.KnowledgeFlowApp$20",
      "weka.gui.beans.KnowledgeFlowApp$KFPerspective",
      "weka.core.SerializedObject",
      "weka.clusterers.UpdateableClusterer",
      "weka.gui.beans.BeanCustomizer$ModifyListener",
      "weka.core.AdditionalMeasureProducer",
      "weka.core.converters.AbstractSaver",
      "weka.attributeSelection.GreedyStepwise",
      "weka.gui.beans.InstanceStreamToBatchMaker",
      "weka.associations.AssociationRules",
      "weka.gui.beans.Classifier",
      "weka.gui.beans.Sorter$InstanceHolder",
      "weka.core.Check",
      "weka.gui.beans.FlowByExpression$ExpressionClause$ExpressionType",
      "weka.gui.beans.ThresholdDataEvent",
      "weka.gui.beans.KnowledgeFlowApp$34",
      "weka.gui.beans.MetaBean",
      "weka.gui.beans.FlowByExpression$ExpressionClause$ExpressionType$11",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.gui.beans.FlowByExpression$ExpressionClause$ExpressionType$10",
      "weka.core.Version",
      "weka.attributeSelection.AttributeSelection",
      "weka.gui.beans.ClassifierPerformanceEvaluator",
      "weka.gui.Logger",
      "weka.gui.beans.Saver$SaveBatchThread",
      "weka.gui.beans.Startable",
      "weka.gui.beans.ThresholdDataListener",
      "weka.gui.beans.BeanCommon",
      "weka.gui.beans.VisualizableErrorListener",
      "weka.classifiers.AbstractClassifier",
      "weka.core.converters.ArffLoader",
      "weka.gui.beans.Sorter$1",
      "weka.core.WekaException",
      "weka.filters.StreamableFilter",
      "weka.gui.beans.Visible",
      "weka.core.Attribute$1",
      "weka.gui.beans.ConfigurationProducer",
      "weka.core.SparseInstance",
      "weka.core.logging.ConsoleLogger",
      "weka.associations.CARuleMiner",
      "weka.filters.unsupervised.attribute.ReplaceMissingValues",
      "weka.gui.LogPanel",
      "weka.gui.LogPanel$4",
      "weka.classifiers.Evaluation",
      "weka.gui.LogPanel$1",
      "weka.filters.supervised.instance.SpreadSubsample",
      "weka.gui.beans.FlowByExpression$ExpressionClause",
      "weka.gui.beans.UserRequestAcceptor",
      "weka.core.converters.FileSourcedConverter",
      "weka.core.converters.URLSourcedLoader",
      "weka.clusterers.Clusterer",
      "weka.core.neighboursearch.PerformanceStats",
      "weka.gui.beans.DataVisualizer",
      "weka.core.converters.ArffSaver",
      "weka.gui.beans.TextViewer",
      "weka.gui.beans.TrainingSetListener",
      "weka.core.Memory",
      "weka.core.UnassignedDatasetException",
      "weka.gui.beans.ClassAssigner",
      "weka.attributeSelection.RankedOutputSearch",
      "weka.gui.beans.IncrementalClassifierListener",
      "weka.gui.beans.PredictionAppender",
      "weka.gui.beans.EventConstraints",
      "weka.core.converters.Loader",
      "weka.gui.beans.ImageEvent",
      "weka.core.ProtectedProperties",
      "weka.core.converters.C45Loader",
      "weka.gui.beans.AbstractTrainAndTestSetProducer",
      "weka.core.StringLocator",
      "weka.core.AttributeStats",
      "weka.filters.MultiFilter",
      "weka.core.GlobalInfoJavadoc",
      "weka.gui.beans.BatchClustererListener",
      "weka.gui.beans.DataSink",
      "weka.associations.AssociationRulesProducer",
      "weka.filters.unsupervised.attribute.Remove",
      "weka.core.Randomizable",
      "weka.core.EuclideanDistance",
      "weka.core.Tee",
      "weka.core.Instances",
      "weka.core.logging.FileLogger",
      "weka.gui.beans.DataSetEvent",
      "weka.gui.beans.DataFormatListener",
      "weka.core.converters.AbstractFileLoader",
      "weka.gui.beans.Loader$LoadThread",
      "weka.gui.beans.Loader",
      "weka.attributeSelection.Ranker",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.core.TechnicalInformation",
      "weka.gui.beans.Loader$1",
      "weka.core.RevisionHandler",
      "weka.filters.Filter",
      "weka.gui.beans.TextListener",
      "weka.filters.supervised.attribute.Discretize",
      "weka.core.CheckOptionHandler",
      "weka.core.DistanceFunction",
      "weka.clusterers.FilteredClusterer",
      "org.pentaho.packageManagement.Package",
      "weka.core.converters.AbstractFileSaver",
      "weka.gui.beans.TextEvent",
      "weka.attributeSelection.SubsetEvaluator",
      "weka.gui.beans.TestSetListener",
      "weka.core.logging.Logger$Level",
      "weka.core.logging.OutputLogger",
      "weka.gui.beans.Filter$1",
      "weka.attributeSelection.CfsSubsetEval",
      "weka.gui.beans.Filter$2",
      "weka.gui.beans.TestSetMaker",
      "weka.core.MinkowskiDistance",
      "weka.core.converters.IncrementalConverter",
      "weka.clusterers.SingleClustererEnhancer",
      "weka.gui.beans.Saver",
      "weka.gui.beans.WekaWrapper",
      "weka.filters.SimpleFilter",
      "weka.core.ChebyshevDistance",
      "weka.gui.explorer.ClassifierErrorsPlotInstances",
      "weka.gui.beans.Sorter",
      "weka.core.EnvironmentHandler",
      "weka.core.RelationalLocator",
      "weka.core.Utils",
      "weka.gui.beans.AbstractTestSetProducer",
      "weka.core.NoSupportForMissingValuesException",
      "weka.classifiers.UpdateableClassifier",
      "weka.gui.beans.VisualizableErrorEvent",
      "weka.gui.visualize.VisualizePanel",
      "weka.gui.beans.BeanVisual",
      "weka.gui.beans.KFStep",
      "weka.core.Capabilities",
      "weka.core.AttributeLocator",
      "weka.gui.AttributeVisualizationPanel",
      "weka.core.converters.SVMLightLoader",
      "weka.gui.beans.GraphListener",
      "weka.gui.beans.Appender",
      "weka.attributeSelection.BestFirst",
      "weka.core.Summarizable",
      "org.pentaho.packageManagement.PackageManager$1",
      "weka.core.logging.Logger",
      "weka.gui.beans.InstanceListener",
      "weka.core.Drawable",
      "weka.gui.beans.BatchAssociationRulesEvent",
      "weka.gui.explorer.AbstractPlotInstances",
      "weka.gui.beans.Associator$1",
      "weka.core.SingleIndex",
      "weka.gui.beans.ImageListener",
      "weka.core.CapabilitiesHandler",
      "weka.gui.TaskLogger",
      "weka.gui.beans.BatchClassifierListener",
      "weka.gui.beans.CrossValidationFoldMaker",
      "weka.associations.Associator",
      "weka.attributeSelection.ASEvaluation",
      "weka.core.AbstractInstance",
      "weka.core.scripting.JythonObject",
      "weka.gui.beans.SubstringLabeler",
      "weka.core.SelectedTag",
      "weka.gui.beans.StructureProducer",
      "org.pentaho.packageManagement.DefaultPackage",
      "weka.gui.beans.ConfigurationEvent",
      "weka.core.Queue",
      "weka.clusterers.RandomizableClusterer",
      "weka.gui.beans.BeanInstance",
      "weka.core.converters.AbstractLoader",
      "weka.gui.beans.DataSource",
      "weka.filters.AllFilter",
      "weka.gui.beans.HeadlessEventCollector",
      "weka.core.converters.BatchConverter",
      "weka.gui.beans.CrossValidationFoldMaker$1",
      "weka.core.Tag",
      "weka.gui.ResultHistoryPanel",
      "weka.gui.beans.ConfigurationListener",
      "weka.gui.visualize.PrintableHandler",
      "weka.core.OptionHandler",
      "weka.filters.supervised.attribute.AttributeSelection",
      "weka.core.Range",
      "weka.gui.beans.ImageSaver",
      "weka.core.scripting.JythonSerializableObject",
      "weka.classifiers.Classifier",
      "weka.core.Capabilities$Capability",
      "org.pentaho.packageManagement.PackageManager",
      "weka.core.WekaEnumeration",
      "weka.core.logging.OutputLogger$OutputPrintStream",
      "weka.gui.beans.OffscreenChartRenderer",
      "weka.attributeSelection.ASSearch",
      "weka.core.WekaPackageManager",
      "weka.gui.beans.FlowByExpression$BracketNode",
      "weka.filters.SupervisedFilter",
      "weka.gui.WekaTaskMonitor",
      "weka.gui.beans.Sorter$SortComparator",
      "weka.gui.beans.ScatterPlotMatrix",
      "weka.gui.beans.KnowledgeFlowApp",
      "weka.gui.beans.AttributeSummarizer",
      "weka.core.TechnicalInformationHandler",
      "weka.gui.beans.KnowledgeFlowApp$InvisibleNode",
      "weka.attributeSelection.StartSetHandler",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.gui.ExtensionFileFilter",
      "weka.filters.Sourcable",
      "weka.gui.beans.AbstractEvaluator",
      "weka.core.Attribute",
      "weka.core.FastVector",
      "weka.gui.visualize.PrintablePanel",
      "weka.gui.beans.FlowByExpression",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.core.Instance",
      "weka.gui.beans.FlowByExpression$ExpressionNode",
      "weka.gui.beans.BatchClassifierEvent",
      "weka.gui.beans.TrainingSetEvent",
      "weka.gui.beans.IncrementalClassifierEvent",
      "weka.core.WeightedInstancesHandler",
      "weka.gui.beans.Filter",
      "weka.core.TechnicalInformation$Field",
      "weka.gui.beans.Associator",
      "weka.core.Javadoc",
      "weka.gui.visualize.MatrixPanel",
      "weka.core.UnassignedClassException",
      "weka.classifiers.rules.ZeroR",
      "weka.gui.beans.TrainingSetProducer",
      "weka.classifiers.Sourcable",
      "weka.gui.beans.ModelPerformanceChart",
      "weka.gui.AttributeSelectionPanel",
      "weka.associations.AbstractAssociator"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.awt.event.MouseWheelListener", false, Filter_ESTest_scaffolding.class.getClassLoader()));
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
      "weka.gui.beans.ImageSaver",
      "weka.core.Version",
      "weka.core.Environment",
      "weka.core.converters.AbstractLoader",
      "weka.core.converters.AbstractFileLoader",
      "weka.core.converters.LibSVMLoader",
      "weka.gui.beans.DataVisualizer",
      "weka.gui.beans.GraphViewer",
      "weka.gui.beans.SubstringLabeler",
      "weka.gui.beans.TrainingSetEvent",
      "weka.gui.beans.Sorter",
      "weka.core.converters.SerializedInstancesLoader",
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
      "weka.core.Tag",
      "weka.attributeSelection.BestFirst",
      "weka.classifiers.trees.J48",
      "weka.filters.supervised.attribute.Discretize",
      "weka.core.SerializedObject",
      "weka.core.TechnicalInformation",
      "weka.core.TechnicalInformation$Type",
      "weka.core.TechnicalInformation$Field",
      "weka.gui.beans.TextViewer",
      "weka.gui.beans.StripChart",
      "weka.gui.beans.StripChart$ScalePanel",
      "weka.gui.beans.StripChart$LegendPanel",
      "weka.gui.beans.ChartEvent",
      "weka.filters.SimpleFilter",
      "weka.filters.SimpleStreamFilter",
      "weka.filters.MultiFilter",
      "weka.gui.beans.ClassAssigner",
      "weka.core.converters.AbstractSaver",
      "weka.core.converters.AbstractFileSaver",
      "weka.core.converters.ArffSaver",
      "weka.core.AbstractInstance",
      "weka.core.NormalizableDistance",
      "weka.core.ManhattanDistance",
      "weka.core.EuclideanDistance",
      "weka.gui.beans.Associator",
      "weka.associations.AbstractAssociator",
      "weka.associations.Apriori",
      "weka.gui.beans.AttributeSummarizer",
      "weka.gui.beans.MetaBean",
      "weka.gui.beans.Classifier",
      "weka.gui.beans.IncrementalClassifierEvent",
      "weka.gui.ExtensionFileFilter",
      "weka.classifiers.CostMatrix",
      "weka.gui.beans.AbstractTrainingSetProducer",
      "weka.gui.beans.TrainingSetMaker",
      "weka.gui.beans.AbstractDataSink",
      "weka.gui.beans.Saver",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.core.neighboursearch.CoverTree",
      "weka.core.SparseInstance",
      "weka.filters.supervised.instance.Resample",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.classifiers.functions.supportVector.RBFKernel",
      "weka.core.Capabilities",
      "weka.core.Utils",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.core.logging.Logger$Level",
      "weka.core.WekaPackageManager",
      "weka.core.Capabilities$Capability",
      "weka.core.TestInstances",
      "weka.core.Attribute",
      "weka.core.ProtectedProperties",
      "weka.core.Instances",
      "weka.core.DenseInstance",
      "weka.core.Queue",
      "weka.core.AttributeLocator",
      "weka.core.StringLocator",
      "weka.core.RelationalLocator",
      "weka.core.MinkowskiDistance",
      "weka.core.converters.DatabaseLoader",
      "weka.experiment.DatabaseUtils",
      "weka.core.converters.DatabaseConnection",
      "weka.gui.beans.Appender",
      "weka.core.converters.JSONLoader",
      "weka.gui.beans.PredictionAppender",
      "weka.gui.beans.AbstractTrainAndTestSetProducer",
      "weka.gui.beans.CrossValidationFoldMaker",
      "weka.gui.beans.Clusterer",
      "weka.clusterers.AbstractClusterer",
      "weka.clusterers.AbstractDensityBasedClusterer",
      "weka.clusterers.RandomizableDensityBasedClusterer",
      "weka.clusterers.EM",
      "weka.core.converters.MatlabLoader",
      "weka.gui.beans.FlowByExpression",
      "weka.gui.beans.CostBenefitAnalysis",
      "weka.gui.beans.TestSetEvent",
      "weka.core.xml.XMLDocument",
      "weka.core.xml.XMLInstances",
      "weka.core.converters.XRFFLoader",
      "weka.core.converters.CSVLoader",
      "weka.classifiers.lazy.IBk",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.gui.beans.SubstringReplacer",
      "weka.gui.beans.InstanceStreamToBatchMaker",
      "weka.gui.beans.ClassValuePicker",
      "weka.gui.beans.ScatterPlotMatrix",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.attributeSelection.PrincipalComponents",
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
      "weka.core.OptionHandlerJavadoc",
      "weka.gui.explorer.AbstractPlotInstances",
      "weka.gui.explorer.ClassifierErrorsPlotInstances",
      "weka.core.FastVector",
      "weka.gui.explorer.ExplorerDefaults",
      "weka.gui.LogPanel",
      "weka.core.GlobalInfoJavadoc",
      "weka.gui.beans.AbstractEvaluator",
      "weka.gui.beans.ClassifierPerformanceEvaluator",
      "weka.core.converters.ArffLoader",
      "weka.filters.supervised.attribute.ClassOrder",
      "weka.core.ClassDiscovery",
      "weka.core.ClassCache",
      "weka.core.converters.TextDirectoryLoader",
      "weka.gui.WekaTaskMonitor",
      "weka.gui.beans.TrainTestSplitMaker",
      "weka.clusterers.RandomizableClusterer",
      "weka.clusterers.SimpleKMeans",
      "weka.classifiers.bayes.BayesNet",
      "weka.classifiers.bayes.net.search.SearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.K2",
      "weka.classifiers.bayes.net.estimate.BayesNetEstimator",
      "weka.classifiers.bayes.net.estimate.SimpleEstimator",
      "weka.filters.supervised.attribute.NominalToBinary",
      "weka.gui.beans.AbstractDataSource",
      "weka.gui.beans.Loader",
      "weka.core.converters.C45Loader",
      "weka.core.BinarySparseInstance",
      "weka.gui.beans.ClustererPerformanceEvaluator",
      "weka.core.ChebyshevDistance",
      "weka.core.AllJavadoc",
      "weka.core.xml.KOML",
      "com.thoughtworks.xstream.XStream",
      "weka.core.xml.XStream",
      "weka.gui.beans.SerializedModelSaver",
      "weka.gui.beans.DataSetEvent",
      "weka.gui.beans.IncrementalClassifierEvaluator",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.core.tokenizers.Tokenizer",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.core.tokenizers.WordTokenizer",
      "weka.filters.supervised.instance.SpreadSubsample",
      "weka.gui.beans.Sorter$InstanceHolder",
      "weka.experiment.InstanceQuery",
      "weka.associations.SingleAssociatorEnhancer",
      "weka.associations.FilteredAssociator",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.filters.unsupervised.attribute.ReplaceMissingValues",
      "weka.core.neighboursearch.BallTree",
      "weka.core.neighboursearch.balltrees.BallTreeConstructor",
      "weka.core.neighboursearch.balltrees.TopDownConstructor",
      "weka.core.neighboursearch.balltrees.BallSplitter",
      "weka.core.neighboursearch.balltrees.PointsClosestToFurthestChildren",
      "weka.gui.beans.AbstractTestSetProducer",
      "weka.gui.beans.TestSetMaker",
      "weka.classifiers.bayes.NaiveBayesMultinomialText",
      "weka.core.stemmers.NullStemmer",
      "weka.filters.supervised.instance.StratifiedRemoveFolds",
      "weka.classifiers.functions.supportVector.PrecomputedKernelMatrixKernel",
      "weka.core.logging.Logger",
      "weka.core.converters.SVMLightLoader",
      "weka.core.WekaException",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.gui.beans.FlowByExpression$ExpressionNode",
      "weka.gui.beans.FlowByExpression$ExpressionClause",
      "weka.core.neighboursearch.KDTree",
      "weka.core.neighboursearch.kdtrees.KDTreeNodeSplitter",
      "weka.core.neighboursearch.kdtrees.SlidingMidPointOfWidestSide",
      "weka.clusterers.SingleClustererEnhancer",
      "weka.clusterers.FilteredClusterer",
      "weka.gui.beans.ModelPerformanceChart",
      "weka.core.SingleIndex",
      "weka.classifiers.functions.LinearRegression",
      "weka.attributeSelection.WrapperSubsetEval",
      "weka.core.UnassignedDatasetException",
      "weka.filters.unsupervised.attribute.Add",
      "weka.core.TechnicalInformationHandlerJavadoc",
      "weka.classifiers.trees.RandomTree",
      "weka.core.Queue$QueueNode",
      "weka.classifiers.meta.AttributeSelectedClassifier",
      "weka.core.converters.MatlabSaver",
      "weka.core.converters.C45Saver",
      "weka.classifiers.meta.MultiClassClassifier",
      "weka.classifiers.meta.MultiClassClassifierUpdateable",
      "weka.classifiers.functions.Logistic",
      "weka.classifiers.functions.SMO",
      "weka.classifiers.functions.supportVector.PolyKernel",
      "weka.classifiers.functions.supportVector.NormalizedPolyKernel",
      "weka.core.converters.DatabaseSaver",
      "weka.classifiers.functions.GaussianProcesses",
      "weka.core.tokenizers.AlphabeticTokenizer",
      "weka.gui.visualize.VisualizeUtils",
      "weka.gui.visualize.PrintableComponent",
      "weka.gui.GenericObjectEditor",
      "weka.attributeSelection.CorrelationAttributeEval",
      "weka.classifiers.bayes.NaiveBayesMultinomial",
      "weka.classifiers.bayes.NaiveBayesMultinomialUpdateable"
    );
  }
}