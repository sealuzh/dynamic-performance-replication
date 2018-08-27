/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Jul 06 18:37:31 GMT 2018
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
      "weka.filters.unsupervised.attribute.NominalToBinary",
      "weka.clusterers.AbstractClusterer",
      "com.thoughtworks.xstream.XStream",
      "weka.gui.beans.TestSetProducer",
      "weka.gui.beans.AbstractDataSource",
      "weka.core.converters.TextDirectoryLoader",
      "org.pentaho.packageManagement.PackageConstraint",
      "weka.core.converters.Saver",
      "weka.gui.beans.LogWriter",
      "weka.gui.beans.FlowByExpression$ExpressionClause$ExpressionType$4",
      "weka.filters.UnsupervisedFilter",
      "weka.gui.beans.FlowByExpression$ExpressionClause$ExpressionType$5",
      "weka.core.neighboursearch.BallTree",
      "com.thoughtworks.xstream.XStream$InitializationException",
      "weka.gui.beans.FlowByExpression$ExpressionClause$ExpressionType$6",
      "weka.gui.beans.FlowByExpression$ExpressionClause$ExpressionType$7",
      "weka.gui.beans.FlowByExpression$ExpressionClause$ExpressionType$8",
      "weka.gui.beans.DataSourceListener",
      "weka.gui.beans.FlowByExpression$ExpressionClause$ExpressionType$9",
      "weka.core.DenseInstance",
      "weka.gui.SysErrLog",
      "weka.core.converters.DatabaseConverter",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.gui.beans.FlowByExpression$1",
      "com.thoughtworks.xstream.converters.Converter",
      "com.thoughtworks.xstream.security.TypePermission",
      "weka.gui.graphvisualizer.GraphConstants",
      "weka.gui.beans.KnowledgeFlowApp$BeanLayout",
      "org.bounce.net.DefaultAuthenticator",
      "weka.filters.SimpleStreamFilter",
      "com.thoughtworks.xstream.converters.SingleValueConverter",
      "weka.gui.beans.TestSetEvent",
      "weka.filters.unsupervised.attribute.Add",
      "weka.estimators.IncrementalEstimator",
      "weka.gui.beans.FlowByExpression$ExpressionClause$ExpressionType$1",
      "weka.gui.beans.ConnectionNotificationConsumer",
      "weka.gui.beans.FlowByExpression$ExpressionClause$ExpressionType$2",
      "weka.gui.beans.FlowByExpression$ExpressionClause$ExpressionType$3",
      "weka.clusterers.NumberOfClustersRequestable",
      "com.thoughtworks.xstream.core.util.CompositeClassLoader",
      "weka.core.CustomDisplayStringProvider",
      "com.thoughtworks.xstream.converters.ConverterLookup",
      "weka.gui.beans.KnowledgeFlowApp$MainKFPerspective",
      "weka.gui.beans.GraphEvent",
      "weka.core.NormalizableDistance",
      "weka.core.xml.KOML",
      "weka.core.TechnicalInformation$Type",
      "weka.core.Copyable",
      "weka.gui.beans.AbstractDataSink",
      "weka.core.BinarySparseInstance",
      "weka.filters.supervised.attribute.NominalToBinary",
      "weka.gui.beans.BatchClustererEvent",
      "weka.gui.beans.KnowledgeFlowApp$20",
      "weka.gui.beans.KnowledgeFlowApp$KFPerspective",
      "weka.clusterers.UpdateableClusterer",
      "weka.core.xml.XStream",
      "weka.gui.beans.BeanCustomizer$ModifyListener",
      "com.thoughtworks.xstream.converters.ConversionException",
      "weka.core.AdditionalMeasureProducer",
      "weka.core.converters.AbstractSaver",
      "weka.attributeSelection.GreedyStepwise",
      "weka.gui.beans.InstanceStreamToBatchMaker",
      "com.thoughtworks.xstream.mapper.MapperWrapper",
      "com.thoughtworks.xstream.mapper.Mapper",
      "weka.core.Check",
      "weka.gui.beans.Sorter$InstanceHolder",
      "weka.gui.beans.FlowByExpression$ExpressionClause$ExpressionType",
      "weka.gui.beans.ThresholdDataEvent",
      "com.thoughtworks.xstream.mapper.SecurityMapper",
      "weka.gui.beans.KnowledgeFlowApp$34",
      "weka.gui.beans.MetaBean",
      "weka.gui.beans.FlowByExpression$ExpressionClause$ExpressionType$11",
      "weka.gui.beans.FlowByExpression$ExpressionClause$ExpressionType$10",
      "weka.core.Version",
      "weka.attributeSelection.AttributeSelection",
      "weka.gui.Logger",
      "weka.gui.beans.Saver$SaveBatchThread",
      "weka.gui.beans.Startable",
      "weka.gui.graphvisualizer.GraphVisualizer",
      "weka.gui.beans.ThresholdDataListener",
      "weka.gui.beans.BeanCommon",
      "weka.core.converters.ArffLoader",
      "weka.classifiers.AbstractClassifier",
      "weka.filters.unsupervised.attribute.Center",
      "weka.gui.beans.Sorter$1",
      "weka.core.WekaException",
      "com.thoughtworks.xstream.core.util.CustomObjectOutputStream",
      "weka.filters.StreamableFilter",
      "weka.gui.beans.ClassValuePicker",
      "weka.gui.beans.Visible",
      "weka.core.Attribute$1",
      "weka.gui.beans.ConfigurationProducer",
      "weka.core.SparseInstance",
      "weka.attributeSelection.AttributeTransformer",
      "com.thoughtworks.xstream.core.BaseException",
      "weka.filters.unsupervised.attribute.ReplaceMissingValues",
      "weka.attributeSelection.PrincipalComponents",
      "weka.classifiers.Evaluation",
      "com.thoughtworks.xstream.converters.ConverterRegistry",
      "weka.gui.beans.FlowByExpression$ExpressionClause",
      "weka.filters.supervised.instance.SpreadSubsample",
      "weka.gui.beans.UserRequestAcceptor",
      "weka.core.converters.URLSourcedLoader",
      "weka.core.converters.FileSourcedConverter",
      "weka.gui.explorer.ExplorerDefaults",
      "weka.clusterers.Clusterer",
      "weka.core.neighboursearch.PerformanceStats",
      "weka.gui.beans.DataVisualizer",
      "weka.gui.beans.ClustererPerformanceEvaluator$1",
      "weka.core.converters.ArffSaver",
      "weka.gui.beans.TextViewer",
      "com.thoughtworks.xstream.InitializationException",
      "weka.gui.beans.GraphViewer",
      "weka.core.tokenizers.AlphabeticTokenizer",
      "weka.gui.beans.TrainingSetListener",
      "com.thoughtworks.xstream.mapper.DefaultMapper",
      "weka.core.Memory",
      "com.thoughtworks.xstream.mapper.ImmutableTypesMapper",
      "weka.core.UnassignedDatasetException",
      "weka.core.neighboursearch.balltrees.BallTreeConstructor",
      "weka.gui.beans.ClassAssigner",
      "weka.attributeSelection.RankedOutputSearch",
      "weka.gui.beans.IncrementalClassifierListener",
      "weka.gui.beans.EventConstraints",
      "com.thoughtworks.xstream.mapper.AttributeMapper",
      "weka.core.converters.Loader",
      "com.thoughtworks.xstream.converters.ErrorWritingException",
      "weka.gui.beans.ImageEvent",
      "weka.clusterers.RandomizableDensityBasedClusterer",
      "weka.estimators.Estimator",
      "weka.core.ProtectedProperties",
      "weka.gui.beans.AbstractTrainAndTestSetProducer",
      "weka.core.StringLocator",
      "weka.core.AttributeStats",
      "weka.clusterers.DensityBasedClusterer",
      "weka.filters.MultiFilter",
      "weka.gui.beans.BatchClustererListener",
      "weka.gui.beans.DataSink",
      "weka.filters.unsupervised.attribute.Remove",
      "weka.core.Randomizable",
      "weka.core.EuclideanDistance",
      "weka.core.Instances",
      "weka.gui.beans.DataSetEvent",
      "weka.gui.beans.DataFormatListener",
      "weka.core.converters.AbstractFileLoader",
      "com.thoughtworks.xstream.MarshallingStrategy",
      "weka.gui.beans.Loader$LoadThread",
      "weka.gui.beans.Loader",
      "weka.attributeSelection.Ranker",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.core.TechnicalInformation",
      "weka.gui.beans.Loader$1",
      "weka.core.RevisionHandler",
      "weka.gui.treevisualizer.TreeVisualizer",
      "weka.filters.Filter",
      "weka.gui.beans.TextListener",
      "weka.filters.supervised.attribute.Discretize",
      "weka.clusterers.EM",
      "weka.core.CheckOptionHandler",
      "weka.core.TestInstances",
      "weka.core.DistanceFunction",
      "weka.attributeSelection.AttributeEvaluator",
      "org.pentaho.packageManagement.Package",
      "weka.core.converters.AbstractFileSaver",
      "weka.gui.beans.TextEvent",
      "weka.attributeSelection.SubsetEvaluator",
      "weka.gui.beans.TestSetListener",
      "weka.core.logging.Logger$Level",
      "weka.gui.beans.Filter$1",
      "weka.attributeSelection.CfsSubsetEval",
      "weka.gui.beans.Filter$2",
      "weka.gui.beans.TestSetMaker",
      "weka.filters.supervised.attribute.ClassOrder",
      "weka.core.converters.IncrementalConverter",
      "weka.gui.beans.Saver",
      "weka.gui.beans.WekaWrapper",
      "com.thoughtworks.xstream.XStreamException",
      "weka.filters.SimpleFilter",
      "weka.core.ChebyshevDistance",
      "weka.gui.explorer.ClassifierErrorsPlotInstances",
      "weka.gui.beans.Sorter",
      "weka.gui.beans.SerializedModelSaver",
      "weka.gui.beans.Clusterer",
      "weka.core.EnvironmentHandler",
      "weka.gui.beans.Clusterer$1",
      "com.thoughtworks.xstream.converters.ConverterMatcher",
      "weka.core.RelationalLocator",
      "weka.core.Utils",
      "weka.gui.beans.AbstractTestSetProducer",
      "weka.core.tokenizers.Tokenizer",
      "weka.gui.graphvisualizer.BIFFormatException",
      "weka.clusterers.AbstractDensityBasedClusterer",
      "weka.core.NoSupportForMissingValuesException",
      "com.thoughtworks.xstream.core.util.CustomObjectOutputStream$StreamCallback",
      "weka.classifiers.UpdateableClassifier",
      "weka.gui.visualize.PlotData2D",
      "weka.gui.visualize.VisualizePanel",
      "weka.gui.beans.BeanVisual",
      "weka.gui.beans.KFStep",
      "weka.core.Capabilities",
      "weka.core.neighboursearch.balltrees.TopDownConstructor",
      "weka.core.AttributeLocator",
      "weka.gui.AttributeVisualizationPanel",
      "weka.gui.beans.GraphListener",
      "weka.attributeSelection.BestFirst",
      "weka.core.Summarizable",
      "org.pentaho.packageManagement.PackageManager$1",
      "weka.filters.supervised.instance.StratifiedRemoveFolds",
      "weka.gui.beans.InstanceListener",
      "weka.gui.explorer.AbstractPlotInstances",
      "com.thoughtworks.xstream.core.util.CustomObjectInputStream$StreamCallback",
      "weka.gui.treevisualizer.NodePlace",
      "weka.gui.beans.ImageListener",
      "weka.core.CapabilitiesHandler",
      "weka.gui.beans.BatchClassifierListener",
      "weka.gui.beans.CrossValidationFoldMaker",
      "weka.attributeSelection.ASEvaluation",
      "weka.core.AbstractInstance",
      "weka.filters.unsupervised.attribute.SwapValues",
      "weka.gui.beans.SubstringLabeler",
      "weka.gui.beans.StructureProducer",
      "org.pentaho.packageManagement.DefaultPackage",
      "weka.estimators.DiscreteEstimator",
      "weka.gui.beans.ConfigurationEvent",
      "weka.core.Queue",
      "weka.gui.beans.BeanInstance",
      "weka.core.converters.AbstractLoader",
      "weka.gui.beans.DataSource",
      "weka.filters.AllFilter",
      "weka.gui.beans.HeadlessEventCollector",
      "weka.core.converters.BatchConverter",
      "com.thoughtworks.xstream.mapper.AbstractXmlFriendlyMapper",
      "weka.gui.beans.CrossValidationFoldMaker$1",
      "weka.core.Tag",
      "weka.gui.ResultHistoryPanel",
      "weka.gui.beans.ConfigurationListener",
      "weka.gui.visualize.PrintableHandler",
      "weka.core.OptionHandler",
      "weka.filters.supervised.attribute.AttributeSelection",
      "weka.core.Range",
      "weka.gui.beans.ImageSaver",
      "weka.classifiers.Classifier",
      "weka.core.Capabilities$Capability",
      "com.thoughtworks.xstream.converters.DataHolder",
      "org.pentaho.packageManagement.PackageManager",
      "com.thoughtworks.xstream.core.util.CustomObjectInputStream",
      "weka.core.WekaEnumeration",
      "weka.gui.beans.OffscreenChartRenderer",
      "weka.attributeSelection.ASSearch",
      "weka.core.WekaPackageManager",
      "weka.gui.beans.FlowByExpression$BracketNode",
      "weka.filters.SupervisedFilter",
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
      "weka.core.Attribute",
      "weka.gui.beans.AbstractEvaluator",
      "weka.core.FastVector",
      "weka.gui.beans.ClustererPerformanceEvaluator",
      "weka.gui.visualize.PrintablePanel",
      "weka.gui.beans.FlowByExpression",
      "weka.gui.beans.AbstractTrainingSetProducer",
      "weka.core.Instance",
      "weka.gui.beans.FlowByExpression$ExpressionNode",
      "weka.gui.beans.BatchClassifierEvent",
      "weka.gui.beans.TrainingSetEvent",
      "weka.gui.beans.IncrementalClassifierEvent",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.core.WeightedInstancesHandler",
      "weka.gui.beans.Filter",
      "weka.core.TechnicalInformation$Field",
      "com.thoughtworks.xstream.io.HierarchicalStreamDriver",
      "weka.gui.visualize.MatrixPanel",
      "com.thoughtworks.xstream.converters.ErrorWriter",
      "weka.core.UnassignedClassException",
      "com.thoughtworks.xstream.mapper.XStream11XmlFriendlyMapper",
      "weka.classifiers.rules.ZeroR",
      "weka.gui.beans.TrainingSetMaker",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.filters.unsupervised.attribute.Standardize",
      "weka.gui.beans.TrainingSetProducer",
      "weka.classifiers.Sourcable",
      "weka.core.neighboursearch.TreePerformanceStats",
      "weka.gui.AttributeSelectionPanel",
      "weka.gui.graphvisualizer.LayoutCompleteEventListener"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.awt.event.ComponentListener", false, Filter_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.awt.event.HierarchyBoundsListener", false, Filter_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.awt.event.HierarchyListener", false, Filter_ESTest_scaffolding.class.getClassLoader()));
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
      "weka.filters.supervised.attribute.NominalToBinary",
      "weka.gui.beans.AbstractTrainingSetProducer",
      "weka.gui.beans.TrainingSetMaker",
      "weka.gui.beans.ModelPerformanceChart",
      "weka.associations.FPGrowth",
      "weka.associations.DefaultAssociationRule$METRIC_TYPE$1",
      "weka.associations.DefaultAssociationRule$METRIC_TYPE$2",
      "weka.associations.DefaultAssociationRule$METRIC_TYPE$3",
      "weka.associations.DefaultAssociationRule$METRIC_TYPE$4",
      "weka.associations.DefaultAssociationRule$METRIC_TYPE",
      "weka.filters.supervised.attribute.Discretize",
      "weka.filters.supervised.instance.SpreadSubsample",
      "weka.gui.beans.MetaBean",
      "weka.core.GlobalInfoJavadoc",
      "weka.core.SparseInstance",
      "weka.core.BinarySparseInstance",
      "weka.classifiers.functions.SimpleLinearRegression",
      "weka.gui.beans.AbstractDataSource",
      "weka.gui.beans.Loader",
      "weka.core.converters.ArffLoader",
      "weka.core.TechnicalInformationHandlerJavadoc",
      "weka.filters.supervised.instance.Resample",
      "weka.core.converters.CSVLoader",
      "weka.core.DenseInstance",
      "weka.core.converters.C45Loader",
      "weka.gui.beans.AbstractTestSetProducer",
      "weka.gui.beans.TestSetMaker",
      "weka.gui.beans.CostBenefitAnalysis",
      "weka.gui.beans.Sorter$InstanceHolder",
      "weka.core.Attribute",
      "weka.core.ProtectedProperties",
      "weka.core.converters.LibSVMLoader",
      "weka.core.ChebyshevDistance",
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
      "weka.core.MinkowskiDistance",
      "weka.gui.beans.AbstractEvaluator",
      "weka.gui.beans.ClassifierPerformanceEvaluator",
      "weka.core.converters.MatlabLoader",
      "weka.core.converters.SerializedInstancesLoader",
      "weka.core.Queue",
      "weka.core.AttributeLocator",
      "weka.core.StringLocator",
      "weka.core.RelationalLocator",
      "weka.core.Queue$QueueNode",
      "weka.gui.beans.ImageSaver",
      "weka.core.UnassignedDatasetException",
      "weka.clusterers.SingleClustererEnhancer",
      "weka.clusterers.FilteredClusterer",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.gui.beans.CrossValidationFoldMaker",
      "weka.core.ManhattanDistance",
      "weka.core.AllJavadoc",
      "weka.gui.beans.IncrementalClassifierEvaluator",
      "weka.core.tokenizers.Tokenizer",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.core.tokenizers.WordTokenizer",
      "weka.gui.beans.GraphViewer",
      "weka.gui.beans.ClustererPerformanceEvaluator",
      "weka.core.OptionHandlerJavadoc",
      "weka.clusterers.FarthestFirst",
      "weka.clusterers.MakeDensityBasedClusterer",
      "weka.core.tokenizers.AlphabeticTokenizer",
      "weka.filters.supervised.attribute.ClassOrder",
      "weka.experiment.InstanceQuery",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.classifiers.functions.supportVector.RBFKernel",
      "weka.core.xml.XMLDocument",
      "weka.core.xml.XMLInstances",
      "weka.core.converters.XRFFLoader",
      "weka.core.logging.Logger",
      "weka.core.neighboursearch.CoverTree",
      "weka.classifiers.meta.MultiClassClassifier",
      "weka.classifiers.functions.Logistic",
      "weka.classifiers.trees.J48",
      "weka.gui.visualize.Plot2D",
      "weka.gui.visualize.VisualizeUtils",
      "weka.gui.visualize.InstanceInfoFrame",
      "weka.gui.visualize.PlotData2D",
      "weka.classifiers.misc.SerializedClassifier",
      "weka.classifiers.meta.FilteredClassifier",
      "weka.classifiers.IteratedSingleClassifierEnhancer",
      "weka.classifiers.RandomizableIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.AdaBoostM1",
      "weka.classifiers.trees.DecisionStump",
      "weka.core.tokenizers.NGramTokenizer",
      "weka.attributeSelection.WrapperSubsetEval",
      "weka.gui.beans.BatchClustererEvent",
      "weka.core.converters.ConverterUtils$DataSource",
      "weka.classifiers.bayes.BayesNet",
      "weka.classifiers.bayes.net.search.SearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.K2",
      "weka.classifiers.bayes.net.estimate.BayesNetEstimator",
      "weka.classifiers.bayes.net.estimate.SimpleEstimator",
      "weka.classifiers.rules.DecisionTable",
      "weka.attributeSelection.InfoGainAttributeEval",
      "weka.core.neighboursearch.BallTree",
      "weka.core.neighboursearch.balltrees.BallTreeConstructor",
      "weka.core.neighboursearch.balltrees.TopDownConstructor",
      "weka.core.neighboursearch.balltrees.BallSplitter",
      "weka.core.neighboursearch.balltrees.PointsClosestToFurthestChildren",
      "weka.core.neighboursearch.KDTree",
      "weka.core.neighboursearch.kdtrees.KDTreeNodeSplitter",
      "weka.core.neighboursearch.kdtrees.SlidingMidPointOfWidestSide",
      "weka.core.converters.LibSVMSaver",
      "weka.gui.beans.FlowByExpression$ExpressionNode",
      "weka.gui.beans.FlowByExpression$BracketNode",
      "weka.classifiers.RandomizableClassifier",
      "weka.classifiers.functions.SGDText",
      "weka.core.stemmers.NullStemmer",
      "weka.gui.visualize.PrintableComponent",
      "weka.gui.GenericObjectEditor",
      "weka.gui.AttributeSelectionPanel",
      "weka.attributeSelection.Ranker",
      "weka.classifiers.bayes.NaiveBayesMultinomialText",
      "weka.classifiers.functions.supportVector.PrecomputedKernelMatrixKernel",
      "weka.classifiers.trees.RandomForest",
      "weka.classifiers.trees.RandomTree",
      "weka.classifiers.functions.supportVector.PolyKernel",
      "weka.classifiers.functions.supportVector.NormalizedPolyKernel",
      "weka.core.converters.JSONSaver",
      "weka.classifiers.rules.OneR",
      "weka.gui.beans.BeanInstance",
      "weka.classifiers.bayes.NaiveBayesMultinomial",
      "weka.core.AttributeStats",
      "weka.core.converters.CSVSaver",
      "weka.classifiers.meta.AttributeSelectedClassifier",
      "weka.core.WekaException",
      "weka.classifiers.bayes.NaiveBayes",
      "weka.classifiers.bayes.NaiveBayesUpdateable",
      "weka.classifiers.functions.SimpleLogistic",
      "weka.classifiers.rules.PART",
      "weka.classifiers.rules.part.MakeDecList",
      "weka.classifiers.trees.REPTree",
      "weka.classifiers.functions.SMOreg",
      "weka.classifiers.functions.supportVector.RegOptimizer",
      "weka.classifiers.functions.supportVector.RegSMO",
      "weka.classifiers.functions.supportVector.RegSMOImproved",
      "weka.classifiers.MultipleClassifiersCombiner",
      "weka.classifiers.RandomizableMultipleClassifiersCombiner",
      "weka.classifiers.meta.Vote",
      "weka.core.converters.MatlabSaver",
      "weka.gui.ResultHistoryPanel"
    );
  }
}