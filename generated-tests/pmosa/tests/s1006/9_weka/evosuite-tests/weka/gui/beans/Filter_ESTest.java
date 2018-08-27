/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 06:47:15 GMT 2018
 */

package weka.gui.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.AWTEventMulticaster;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ContainerListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.beans.EventSetDescriptor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JScrollBar;
import javax.swing.KeyStroke;
import javax.swing.TransferHandler;
import javax.swing.text.DefaultCaret;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import weka.associations.AbstractAssociator;
import weka.associations.Apriori;
import weka.classifiers.meta.FilteredClassifier;
import weka.classifiers.misc.InputMappedClassifier;
import weka.core.Attribute;
import weka.core.BinarySparseInstance;
import weka.core.ChebyshevDistance;
import weka.core.DenseInstance;
import weka.core.FindWithCapabilities;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.SparseInstance;
import weka.core.TestInstances;
import weka.core.converters.DatabaseLoader;
import weka.core.converters.JSONLoader;
import weka.core.converters.TextDirectoryLoader;
import weka.core.neighboursearch.CoverTree;
import weka.core.neighboursearch.KDTree;
import weka.filters.AllFilter;
import weka.filters.MultiFilter;
import weka.filters.supervised.attribute.AttributeSelection;
import weka.filters.supervised.attribute.Discretize;
import weka.filters.supervised.instance.Resample;
import weka.filters.unsupervised.attribute.Add;
import weka.gui.Logger;
import weka.gui.SysErrLog;
import weka.gui.WekaTaskMonitor;
import weka.gui.beans.Appender;
import weka.gui.beans.Associator;
import weka.gui.beans.AttributeSummarizer;
import weka.gui.beans.BeanVisual;
import weka.gui.beans.ClassAssigner;
import weka.gui.beans.ConfigurationListener;
import weka.gui.beans.CostBenefitAnalysis;
import weka.gui.beans.DataSetEvent;
import weka.gui.beans.DataSourceListener;
import weka.gui.beans.Filter;
import weka.gui.beans.FlowByExpression;
import weka.gui.beans.InstanceEvent;
import weka.gui.beans.InstanceListener;
import weka.gui.beans.InstanceStreamToBatchMaker;
import weka.gui.beans.Loader;
import weka.gui.beans.MetaBean;
import weka.gui.beans.PredictionAppender;
import weka.gui.beans.SerializedModelSaver;
import weka.gui.beans.Sorter;
import weka.gui.beans.SubstringLabeler;
import weka.gui.beans.SubstringReplacer;
import weka.gui.beans.TestSetEvent;
import weka.gui.beans.TestSetMaker;
import weka.gui.beans.TextViewer;
import weka.gui.beans.TrainTestSplitMaker;
import weka.gui.beans.TrainingSetEvent;
import weka.gui.beans.TrainingSetMaker;
import weka.gui.explorer.ClassifierErrorsPlotInstances;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Filter_ESTest extends Filter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Filter filter0 = new Filter();
      AttributeSummarizer attributeSummarizer0 = new AttributeSummarizer();
      DefaultCaret defaultCaret0 = new DefaultCaret();
      MouseListener mouseListener0 = AWTEventMulticaster.add((MouseListener) defaultCaret0, (MouseListener) defaultCaret0);
      filter0.getColorModel();
      defaultCaret0.getUpdatePolicy();
      AWTEventMulticaster.remove(mouseListener0, mouseListener0);
      filter0.removeMouseListener((MouseListener) null);
      filter0.addTrainingSetListener(attributeSummarizer0);
      filter0.getFilter();
      filter0.addTestSetListener(attributeSummarizer0);
      filter0.removeConfigurationListener((ConfigurationListener) null);
      filter0.getCustomName();
      filter0.getWrappedAlgorithm();
      filter0.removeTrainingSetListener(attributeSummarizer0);
      filter0.getTransferHandler();
      TransferHandler.getCopyAction();
      attributeSummarizer0.setTransferHandler((TransferHandler) null);
      filter0.getFilter();
      filter0.removeDataSourceListener(attributeSummarizer0);
      filter0.removeTestSetListener(attributeSummarizer0);
      AttributeSummarizer attributeSummarizer1 = new AttributeSummarizer();
      filter0.removeDataSourceListener(attributeSummarizer1);
      Filter filter1 = new Filter();
      filter0.addInstanceListener(filter1);
      JScrollBar jScrollBar0 = new JScrollBar();
      Dimension dimension0 = jScrollBar0.getMaximumSize();
      filter1.setMaximumSize(dimension0);
      filter1.connectionAllowed("AllFilter");
      filter1.isBusy();
      filter1.removeTestSetListener(filter0);
      Loader loader0 = new Loader();
      loader0.getBounds((Rectangle) defaultCaret0);
      Logger logger0 = loader0.m_log;
      filter0.setLog((Logger) null);
      filter1.addConfigurationListener((ConfigurationListener) null);
      JSONLoader jSONLoader0 = new JSONLoader();
      try { 
        jSONLoader0.getStructure();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // No source has been specified
         //
         verifyException("weka.core.converters.JSONLoader", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Filter filter0 = new Filter();
      SerializedModelSaver serializedModelSaver0 = new SerializedModelSaver();
      filter0.acceptInstance((InstanceEvent) null);
      boolean boolean0 = filter0.isBusy();
      assertFalse(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Filter filter0 = new Filter();
      SerializedModelSaver serializedModelSaver0 = new SerializedModelSaver();
      DataSetEvent dataSetEvent0 = new DataSetEvent(serializedModelSaver0, (Instances) null);
      filter0.acceptDataSet(dataSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Filter filter0 = new Filter();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(filter0, (Instances) null);
      filter0.acceptTrainingSet(trainingSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Filter filter0 = new Filter();
      Canvas canvas0 = new Canvas();
      filter0.disconnectionNotification("dataSet", canvas0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.globalInfo();
      InstanceEvent instanceEvent0 = new InstanceEvent(filter0);
      InputMappedClassifier inputMappedClassifier0 = new InputMappedClassifier();
      FlowByExpression flowByExpression0 = new FlowByExpression();
      flowByExpression0.getStructure("<html><font color=blue>An instance filter that passes all instances through unmodified</font><br><br> Primarily for testing purposes.<br></html>");
      try { 
        inputMappedClassifier0.getModelHeader((Instances) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Instances", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.getMinimumSize();
      FlowByExpression flowByExpression0 = new FlowByExpression();
      Locale locale0 = Locale.ENGLISH;
      locale0.getDisplayName();
      flowByExpression0.getName();
      flowByExpression0.setLocale(locale0);
      flowByExpression0.getMinimumSize();
      flowByExpression0.requestFocus(false);
      filter0.addTrainingSetListener(flowByExpression0);
      filter0.getVisual();
      ConfigurationListener configurationListener0 = mock(ConfigurationListener.class, new ViolatedAssumptionAnswer());
      filter0.addConfigurationListener(configurationListener0);
      filter0.removeTestSetListener(flowByExpression0);
      FilteredClassifier filteredClassifier0 = new FilteredClassifier();
      try { 
        filteredClassifier0.numElements();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.trees.J48", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Filter filter0 = new Filter();
      Sorter sorter0 = new Sorter();
      sorter0.m_streamCounter = 10000;
      Logger logger0 = sorter0.m_log;
      Rectangle rectangle0 = filter0.getVisibleRect();
      filter0.setLog((Logger) null);
      filter0.addTrainingSetListener(sorter0);
      filter0.connectionAllowed("q@gQ8W%>");
      filter0.setLog((Logger) null);
      ConfigurationListener configurationListener0 = mock(ConfigurationListener.class, new ViolatedAssumptionAnswer());
      filter0.removeConfigurationListener(configurationListener0);
      TestInstances testInstances0 = new TestInstances();
      Instances instances0 = testInstances0.generate();
      DataSetEvent dataSetEvent0 = new DataSetEvent(rectangle0, instances0);
      filter0.acceptDataSet(dataSetEvent0);
      filter0.addTrainingSetListener(sorter0);
      filter0.getCustomName();
      InstanceStreamToBatchMaker instanceStreamToBatchMaker0 = new InstanceStreamToBatchMaker();
      InstanceEvent instanceEvent0 = new InstanceEvent(instanceStreamToBatchMaker0);
      filter0.acceptInstance(instanceEvent0);
      SubstringReplacer substringReplacer0 = new SubstringReplacer();
      BeanVisual beanVisual0 = substringReplacer0.m_visual;
      filter0.setVisual(beanVisual0);
      filter0.addDataSourceListener(sorter0);
      filter0.getVisual();
      assertEquals("SubstringReplacer", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.stop();
      CostBenefitAnalysis costBenefitAnalysis0 = new CostBenefitAnalysis();
      BeanVisual beanVisual0 = costBenefitAnalysis0.getVisual();
      beanVisual0.getInputVerifier();
      DatabaseLoader databaseLoader0 = new DatabaseLoader();
      databaseLoader0.getDataSet();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(beanVisual0, (Instances) null);
      trainingSetEvent0.m_setNumber = 0;
      filter0.acceptTrainingSet(trainingSetEvent0);
      filter0.useDefaultVisual();
      TrainingSetMaker trainingSetMaker0 = new TrainingSetMaker();
      filter0.addDataSourceListener(trainingSetMaker0);
      // Undeclared exception!
      try { 
        filter0.setFilter((weka.filters.Filter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.eventGeneratable("_animated.gif");
      filter0.stop();
      filter0.setCustomName("_animated.gif");
      assertEquals("_animated.gif", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.getComponentListeners();
      DataSetEvent dataSetEvent0 = new DataSetEvent(filter0, (Instances) null);
      filter0.acceptDataSet(dataSetEvent0);
      filter0.useDefaultVisual();
      TextViewer textViewer0 = new TextViewer();
      textViewer0.transferFocusUpCycle();
      filter0.removeDataSourceListener(textViewer0);
      boolean boolean0 = filter0.eventGeneratable("'SH7K&V}L`L<SI");
      assertEquals("AllFilter", filter0.getCustomName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Filter filter0 = new Filter();
      InstanceStreamToBatchMaker instanceStreamToBatchMaker0 = new InstanceStreamToBatchMaker();
      filter0.addInstanceListener(instanceStreamToBatchMaker0);
      AttributeSummarizer attributeSummarizer0 = new AttributeSummarizer();
      filter0.removeTrainingSetListener(attributeSummarizer0);
      Resample resample0 = new Resample();
      Appender appender0 = new Appender();
      Instances instances0 = appender0.m_completeHeader;
      InstanceEvent instanceEvent0 = new InstanceEvent(resample0, (Instances) null);
      filter0.notifyInstanceListeners(instanceEvent0);
      TestSetEvent testSetEvent0 = new TestSetEvent(instanceStreamToBatchMaker0, (Instances) null, 0, 2, (-1119), 2);
      testSetEvent0.m_maxSetNumber = 2;
      filter0.acceptTestSet(testSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.stop();
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(0);
      binarySparseInstance0.dataset();
      TestSetEvent testSetEvent0 = new TestSetEvent(mockJapaneseDate0, (Instances) null);
      filter0.acceptTestSet(testSetEvent0);
      filter0.enumerateRequests();
      Appender appender0 = new Appender();
      InstanceEvent instanceEvent0 = appender0.m_ie;
      filter0.notifyInstanceListeners(instanceEvent0);
      filter0.addConfigurationListener((ConfigurationListener) null);
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(binarySparseInstance0, (Instances) null, 31, 0);
      filter0.acceptTrainingSet(trainingSetEvent0);
      WekaTaskMonitor wekaTaskMonitor0 = new WekaTaskMonitor();
      Filter filter1 = new Filter();
      weka.gui.LogPanel logPanel0 = new weka.gui.LogPanel(wekaTaskMonitor0, false);
      filter1.setLog(logPanel0);
      assertEquals("AllFilter", filter1.getCustomName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.getComponentListeners();
      DataSetEvent dataSetEvent0 = new DataSetEvent(filter0, (Instances) null);
      filter0.acceptDataSet(dataSetEvent0);
      filter0.useDefaultVisual();
      Filter filter1 = new Filter();
      InstanceStreamToBatchMaker instanceStreamToBatchMaker0 = new InstanceStreamToBatchMaker();
      filter0.removeInstanceListener(instanceStreamToBatchMaker0);
      Class<ClassAssigner> class0 = ClassAssigner.class;
      filter1.getListeners(class0);
      filter1.setForeground((Color) null);
      // Undeclared exception!
      try { 
        filter0.performRequest("~A~Uvi(5nR#~nqqQ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ~A~Uvi(5nR#~nqqQ not supported (Filter)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.eventGeneratable("");
      // Undeclared exception!
      try { 
        filter0.performRequest("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         //  not supported (Filter)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-124);
      byteArray0[1] = (byte) (-35);
      byteArray0[2] = (byte)81;
      byteArray0[3] = (byte)1;
      byteArray0[4] = (byte)43;
      byteArray0[5] = (byte) (-90);
      byteArray0[6] = (byte) (-79);
      byteArray0[7] = (byte) (-40);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      Filter filter0 = new Filter();
      filter0.getVisibleRect();
      Discretize discretize0 = new Discretize();
      filter0.setWrappedAlgorithm(discretize0);
      assertEquals("Discretize", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.connectionAllowed("'SH7K&V}L`L<SI");
      AttributeSelection attributeSelection0 = new AttributeSelection();
      filter0.setFilter(attributeSelection0);
      assertEquals("AttributeSelection", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.eventGeneratable("_animated.gif");
      filter0.acceptInstance((InstanceEvent) null);
      // Undeclared exception!
      try { 
        filter0.setWrappedAlgorithm((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.getToolkit();
      AWTEventMulticaster.add((KeyListener) null, (KeyListener) null);
      AWTEventMulticaster.remove((KeyListener) null, (KeyListener) null);
      filter0.removeKeyListener((KeyListener) null);
      filter0.getCustomName();
      filter0.useDefaultVisual();
      filter0.setCustomName("M&31Z%ampUGO<D");
      Sorter sorter0 = new Sorter();
      Filter filter1 = new Filter();
      filter1.removeInstanceListener(filter0);
      filter0.addTestSetListener(sorter0);
      filter1.addInstanceListener(filter0);
      filter0.removeInstanceListener(sorter0);
      filter1.setCustomName("Model Performance Chart");
      filter0.removeTrainingSetListener(filter1);
      filter0.addInstanceListener(filter1);
      filter0.getWrappedAlgorithm();
      filter0.setSize(1422, 1713);
      TestSetMaker testSetMaker0 = new TestSetMaker();
      filter1.addDataSourceListener(testSetMaker0);
      InstanceEvent instanceEvent0 = sorter0.m_ie;
      filter0.notifyInstanceListeners(instanceEvent0);
      filter1.removeConfigurationListener((ConfigurationListener) null);
      filter1.enumerateRequests();
      filter1.removeInstanceListener(filter0);
      AllFilter allFilter0 = new AllFilter();
      filter0.setFilter(allFilter0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Filter filter0 = new Filter();
      AWTEventMulticaster.remove((KeyListener) null, (KeyListener) null);
      filter0.removeKeyListener((KeyListener) null);
      filter0.getCustomName();
      filter0.useDefaultVisual();
      Filter filter1 = new Filter();
      filter1.setCustomName(":/~ 'R;a&");
      Sorter sorter0 = new Sorter();
      filter1.removeInstanceListener(filter0);
      filter0.addTestSetListener(filter1);
      Appender appender0 = new Appender();
      filter1.addInstanceListener(appender0);
      Filter filter2 = new Filter();
      filter2.removeInstanceListener(appender0);
      filter2.setCustomName("!>");
      filter1.removeTrainingSetListener(filter0);
      Filter filter3 = new Filter();
      filter3.addInstanceListener(filter2);
      filter3.getWrappedAlgorithm();
      filter2.addKeyListener((KeyListener) null);
      filter2.setSize(40, (-166));
      TestSetMaker testSetMaker0 = new TestSetMaker();
      filter2.addDataSourceListener((DataSourceListener) null);
      InstanceEvent instanceEvent0 = sorter0.m_ie;
      filter2.notifyInstanceListeners(instanceEvent0);
      ConfigurationListener configurationListener0 = mock(ConfigurationListener.class, new ViolatedAssumptionAnswer());
      filter1.removeConfigurationListener(configurationListener0);
      filter1.enumerateRequests();
      filter2.removeInstanceListener(filter3);
      AllFilter allFilter0 = new AllFilter();
      Add add0 = new Add();
      filter0.setFilter(add0);
      filter2.removeTestSetListener(appender0);
      filter1.acceptInstance(instanceEvent0);
      assertEquals(":/~ 'R;a&", filter1.getCustomName());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.isFocusOwner();
      weka.gui.LogPanel logPanel0 = new weka.gui.LogPanel();
      KeyStroke keyStroke0 = KeyStroke.getKeyStroke('');
      KeyStroke.getKeyStroke(76, 374, true);
      filter0.getActionForKeyStroke(keyStroke0);
      logPanel0.repaint((-3772L), (-4222), (-1), 46, (-4222));
      logPanel0.getVerifyInputWhenFocusTarget();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      filter0.setLog(logPanel0);
      Appender appender0 = new Appender();
      InstanceEvent instanceEvent0 = appender0.m_ie;
      ClassifierErrorsPlotInstances classifierErrorsPlotInstances0 = new ClassifierErrorsPlotInstances();
      classifierErrorsPlotInstances0.getInstances();
      instanceEvent0.setStructure((Instances) null);
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(logPanel0, 1, (-1148L), 46, (-4222), 46, (-2765), (-4222), 1, true, 0, 7017, 7017, (-3772L));
      appender0.getToolTipLocation(mouseWheelEvent0);
      instanceEvent0.setStatus((-581));
      appender0.setFocusTraversalPolicyProvider(false);
      appender0.addDataSourceListener(filter0);
      filter0.acceptInstance(instanceEvent0);
      filter0.addDataSourceListener(appender0);
      filter0.useDefaultVisual();
      System.setCurrentTimeMillis(1488L);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Filter filter0 = new Filter();
      SerializedModelSaver serializedModelSaver0 = new SerializedModelSaver();
      SerializedModelSaver serializedModelSaver1 = new SerializedModelSaver();
      DataSetEvent dataSetEvent0 = new DataSetEvent(serializedModelSaver1, (Instances) null);
      filter0.acceptDataSet(dataSetEvent0);
      TextViewer textViewer0 = new TextViewer();
      filter0.addDataSourceListener(textViewer0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.connectionNotification("g", "g");
      filter0.stop();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.connectionNotification("*-Y7", "*-Y7");
      filter0.stop();
      Filter filter1 = new Filter();
      filter1.setCustomName("F!mG9");
      boolean boolean0 = filter1.eventGeneratable("F!mG9");
      assertEquals("F!mG9", filter1.getCustomName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.acceptInstance((InstanceEvent) null);
      InstanceStreamToBatchMaker instanceStreamToBatchMaker0 = new InstanceStreamToBatchMaker();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getDataSet();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(instanceStreamToBatchMaker0, instances0, 46, (-3533), (-18), (-18));
      filter0.acceptTrainingSet(trainingSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Filter filter0 = new Filter();
      // Undeclared exception!
      try { 
        filter0.connectionAllowed((EventSetDescriptor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SerializedModelSaver serializedModelSaver0 = new SerializedModelSaver();
      Logger logger0 = serializedModelSaver0.m_logger;
      Filter filter0 = new Filter();
      filter0.connectionNotification("instance", "l'rY-KSV!.2Q4:r");
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Filter filter0 = new Filter();
      MetaBean metaBean0 = new MetaBean();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("6Ifxk)Mfmi&u&9vVC!O", arrayList0, 1);
      TestSetEvent testSetEvent0 = new TestSetEvent(metaBean0, instances0, (-2355), (-14));
      filter0.acceptTestSet(testSetEvent0);
      TrainTestSplitMaker trainTestSplitMaker0 = new TrainTestSplitMaker();
      filter0.removeDataSourceListener(trainTestSplitMaker0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      Filter filter0 = new Filter();
      MetaBean metaBean0 = new MetaBean();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("6Ifxk)Mfmi&u&9vVC!O", arrayList0, 1);
      DataSetEvent dataSetEvent0 = new DataSetEvent(instances0, instances0);
      filter0.acceptDataSet(dataSetEvent0);
      boolean boolean0 = filter0.connectionAllowed("Me$Fq");
      assertEquals("AllFilter", filter0.getCustomName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.acceptDataSet((DataSetEvent) null);
      filter0.acceptTrainingSet((TrainingSetEvent) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Filter filter0 = new Filter();
      boolean boolean0 = filter0.eventGeneratable("configuration");
      assertEquals("AllFilter", filter0.getCustomName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.setIgnoreRepaint(true);
      filter0.connectionNotification("instace", "instace");
      boolean boolean0 = filter0.eventGeneratable("instace");
      assertTrue(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Filter filter0 = new Filter();
      ChebyshevDistance chebyshevDistance0 = new ChebyshevDistance();
      filter0.connectionNotification("@data", chebyshevDistance0);
      Appender appender0 = new Appender();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      filter0.removeTestSetListener(appender0);
      boolean boolean0 = filter0.eventGeneratable("@data");
      assertTrue(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Filter filter0 = new Filter();
      Loader loader0 = new Loader();
      filter0.connectionNotification("Xp)PRPh2apbl4)%:(u", loader0);
      boolean boolean0 = filter0.eventGeneratable("Xp)PRPh2apbl4)%:(u");
      assertEquals("AllFilter", filter0.getCustomName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Filter filter0 = new Filter();
      Thread thread0 = MockThread.currentThread();
      filter0.m_filterThread = thread0;
      filter0.acceptDataSet((DataSetEvent) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Filter filter0 = new Filter();
      MultiFilter multiFilter0 = new MultiFilter();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Instance Distances";
      MultiFilter.main(stringArray0);
      filter0.setFilter(multiFilter0);
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      InstanceEvent instanceEvent0 = substringLabeler0.m_ie;
      filter0.acceptInstance(instanceEvent0);
      filter0.connectionNotification("Alphabetic string tokenizer, tokens are to be formed only from contiguous alphabetic sequences.", "Alphabetic string tokenizer, tokens are to be formed only from contiguous alphabetic sequences.");
      filter0.removeInstanceListener(substringLabeler0);
      assertEquals("MultiFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Filter filter0 = new Filter();
      SysErrLog sysErrLog0 = new SysErrLog();
      filter0.setLog(sysErrLog0);
      Discretize discretize0 = new Discretize();
      filter0.setFilter(discretize0);
      PredictionAppender predictionAppender0 = new PredictionAppender();
      InstanceEvent instanceEvent0 = predictionAppender0.m_instanceEvent;
      filter0.acceptInstance((InstanceEvent) null);
      assertEquals("Discretize", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Filter filter0 = new Filter();
      MultiFilter multiFilter0 = new MultiFilter();
      filter0.setFilter(multiFilter0);
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      InstanceEvent instanceEvent0 = substringLabeler0.m_ie;
      instanceEvent0.setStatus(189);
      filter0.acceptInstance(instanceEvent0);
      filter0.enumerateRequests();
      assertEquals("MultiFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Filter filter0 = new Filter();
      MultiFilter multiFilter0 = new MultiFilter();
      filter0.setFilter(multiFilter0);
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      InstanceEvent instanceEvent0 = substringLabeler0.m_ie;
      TestInstances testInstances0 = new TestInstances();
      Instances instances0 = testInstances0.generate();
      instanceEvent0.setStructure(instances0);
      filter0.acceptInstance(instanceEvent0);
      assertEquals("MultiFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Filter filter0 = new Filter();
      MultiFilter multiFilter0 = new MultiFilter();
      filter0.setFilter(multiFilter0);
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      InstanceEvent instanceEvent0 = substringLabeler0.m_ie;
      instanceEvent0.setStatus(2);
      filter0.acceptInstance(instanceEvent0);
      assertEquals("MultiFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Filter filter0 = new Filter();
      MultiFilter multiFilter0 = new MultiFilter();
      filter0.setFilter(multiFilter0);
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      InstanceEvent instanceEvent0 = substringLabeler0.m_ie;
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-292.195532517498);
      doubleArray0[1] = (double) 0;
      ContainerListener containerListener0 = mock(ContainerListener.class, new ViolatedAssumptionAnswer());
      AWTEventMulticaster.remove(containerListener0, containerListener0);
      AWTEventMulticaster.add((ContainerListener) null, (ContainerListener) null);
      filter0.addContainerListener((ContainerListener) null);
      int[] intArray0 = new int[6];
      intArray0[0] = 2;
      intArray0[1] = 1;
      intArray0[2] = 2140;
      intArray0[3] = 1;
      intArray0[4] = 0;
      intArray0[5] = 2;
      SparseInstance sparseInstance0 = new SparseInstance(2, doubleArray0, intArray0, 0);
      instanceEvent0.setInstance(sparseInstance0);
      instanceEvent0.setStatus((-1));
      filter0.acceptInstance(instanceEvent0);
      filter0.acceptInstance(instanceEvent0);
      assertEquals("MultiFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Filter filter0 = new Filter();
      MultiFilter multiFilter0 = new MultiFilter();
      filter0.setFilter(multiFilter0);
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      InstanceEvent instanceEvent0 = substringLabeler0.m_ie;
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-292.195532517498);
      doubleArray0[1] = (double) 0;
      ContainerListener containerListener0 = mock(ContainerListener.class, new ViolatedAssumptionAnswer());
      AWTEventMulticaster.remove(containerListener0, containerListener0);
      AWTEventMulticaster.add((ContainerListener) null, (ContainerListener) null);
      filter0.addContainerListener((ContainerListener) null);
      int[] intArray0 = new int[6];
      intArray0[0] = 2;
      intArray0[1] = 1;
      intArray0[2] = 2140;
      intArray0[3] = 1;
      intArray0[4] = 0;
      intArray0[5] = 2;
      SparseInstance sparseInstance0 = new SparseInstance(2, doubleArray0, intArray0, 0);
      instanceEvent0.setInstance(sparseInstance0);
      instanceEvent0.setStatus(2);
      filter0.acceptInstance(instanceEvent0);
      filter0.acceptInstance(instanceEvent0);
      Filter filter1 = new Filter();
      filter0.addInstanceListener(filter1);
      assertEquals("MultiFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Filter filter0 = new Filter();
      MultiFilter multiFilter0 = new MultiFilter();
      filter0.setFilter(multiFilter0);
      boolean boolean0 = filter0.connectionAllowed("instance");
      assertEquals("MultiFilter", filter0.getCustomName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Filter filter0 = new Filter();
      MultiFilter multiFilter0 = new MultiFilter();
      filter0.setFilter(multiFilter0);
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getStructure();
      SerializedModelSaver serializedModelSaver0 = new SerializedModelSaver();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(serializedModelSaver0, instances0);
      filter0.acceptTrainingSet(trainingSetEvent0);
      assertEquals("MultiFilter", filter0.getCustomName());
  }
}