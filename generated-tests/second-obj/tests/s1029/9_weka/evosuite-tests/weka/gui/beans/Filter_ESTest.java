/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 14:11:38 GMT 2018
 */

package weka.gui.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.AWTEventMulticaster;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ContainerListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.image.ImageFilter;
import java.beans.EventSetDescriptor;
import java.beans.PropertyChangeListener;
import java.beans.beancontext.BeanContext;
import java.beans.beancontext.BeanContextServicesSupport;
import java.io.File;
import java.text.AttributedCharacterIterator;
import java.util.Hashtable;
import java.util.Locale;
import javax.accessibility.AccessibleContext;
import javax.swing.JComponent;
import javax.swing.border.EtchedBorder;
import javax.swing.plaf.metal.MetalComboBoxUI;
import javax.swing.plaf.synth.SynthRadioButtonUI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;
import weka.associations.Apriori;
import weka.clusterers.SimpleKMeans;
import weka.core.BinarySparseInstance;
import weka.core.ChebyshevDistance;
import weka.core.CheckGOE;
import weka.core.FindWithCapabilities;
import weka.core.Instances;
import weka.core.MinkowskiDistance;
import weka.core.converters.ArffSaver;
import weka.core.converters.DatabaseLoader;
import weka.core.converters.TextDirectoryLoader;
import weka.core.tokenizers.AlphabeticTokenizer;
import weka.filters.AllFilter;
import weka.filters.MultiFilter;
import weka.filters.supervised.attribute.NominalToBinary;
import weka.filters.supervised.instance.SpreadSubsample;
import weka.gui.Logger;
import weka.gui.SysErrLog;
import weka.gui.beans.Appender;
import weka.gui.beans.BeanVisual;
import weka.gui.beans.ClassAssigner;
import weka.gui.beans.ClassValuePicker;
import weka.gui.beans.Classifier;
import weka.gui.beans.ConfigurationListener;
import weka.gui.beans.CrossValidationFoldMaker;
import weka.gui.beans.DataSetEvent;
import weka.gui.beans.Filter;
import weka.gui.beans.FlowByExpression;
import weka.gui.beans.IncrementalClassifierEvaluator;
import weka.gui.beans.InstanceEvent;
import weka.gui.beans.Loader;
import weka.gui.beans.MetaBean;
import weka.gui.beans.PredictionAppender;
import weka.gui.beans.Saver;
import weka.gui.beans.ScatterPlotMatrix;
import weka.gui.beans.Sorter;
import weka.gui.beans.SubstringLabeler;
import weka.gui.beans.SubstringReplacer;
import weka.gui.beans.TestSetEvent;
import weka.gui.beans.TestSetListener;
import weka.gui.beans.TestSetMaker;
import weka.gui.beans.TextViewer;
import weka.gui.beans.TrainTestSplitMaker;
import weka.gui.beans.TrainingSetEvent;
import weka.gui.beans.TrainingSetListener;
import weka.gui.beans.TrainingSetMaker;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Filter_ESTest extends Filter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SystemInUtil.addInputLine("");
      Filter filter0 = new Filter();
      ConfigurationListener configurationListener0 = mock(ConfigurationListener.class, new ViolatedAssumptionAnswer());
      filter0.removeConfigurationListener(configurationListener0);
      Apriori apriori0 = new Apriori();
      apriori0.getInstancesOnlyClass();
      TestSetEvent testSetEvent0 = new TestSetEvent("", (Instances) null, 1453, 1453, 1250, 1453);
      filter0.acceptTestSet(testSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.connectionNotification("index number expected", "index number expected");
      SimpleKMeans simpleKMeans0 = new SimpleKMeans();
      simpleKMeans0.getClusterStandardDevs();
      DataSetEvent dataSetEvent0 = new DataSetEvent("index number expected", (Instances) null);
      filter0.acceptDataSet(dataSetEvent0);
      boolean boolean0 = filter0.eventGeneratable("!");
      assertFalse(boolean0);
      
      filter0.getFilter();
      Appender appender0 = new Appender();
      InstanceEvent instanceEvent0 = appender0.m_ie;
      filter0.acceptInstance(instanceEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Saver saver0 = new Saver();
      Filter filter0 = new Filter();
      String string0 = filter0.globalInfo();
      assertEquals("<html><font color=blue>An instance filter that passes all instances through unmodified</font><br><br> Primarily for testing purposes.<br></html>", string0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Filter filter0 = new Filter();
      boolean boolean0 = filter0.eventGeneratable("7c@-");
      assertFalse(boolean0);
      
      filter0.addConfigurationListener((ConfigurationListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Filter filter0 = new Filter();
      Classifier classifier0 = new Classifier();
      filter0.removeTrainingSetListener(classifier0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Filter filter0 = new Filter();
      TextViewer textViewer0 = new TextViewer();
      filter0.removeDataSourceListener(textViewer0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Filter filter0 = new Filter();
      ClassAssigner classAssigner0 = new ClassAssigner();
      filter0.removeInstanceListener(classAssigner0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Filter filter0 = new Filter();
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      InstanceEvent instanceEvent0 = substringLabeler0.m_ie;
      filter0.notifyInstanceListeners(instanceEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Filter filter0 = new Filter();
      CrossValidationFoldMaker crossValidationFoldMaker0 = new CrossValidationFoldMaker();
      crossValidationFoldMaker0.isPaintingForPrint();
      crossValidationFoldMaker0.isRequestFocusEnabled();
      BeanVisual beanVisual0 = crossValidationFoldMaker0.m_visual;
      Component.BaselineResizeBehavior component_BaselineResizeBehavior0 = beanVisual0.getBaselineResizeBehavior();
      filter0.setVisual(beanVisual0);
      filter0.connectionNotification("weka/gui/beans/icons/", component_BaselineResizeBehavior0);
      filter0.connectionNotification("weka/gui/beans/icons/", beanVisual0);
      assertEquals("CrossValidationFoldMaker", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.getMouseWheelListeners();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getStructure();
      Sorter sorter0 = new Sorter();
      InstanceEvent instanceEvent0 = sorter0.m_ie;
      filter0.acceptInstance(instanceEvent0);
      ClassValuePicker classValuePicker0 = new ClassValuePicker();
      BeanVisual beanVisual0 = classValuePicker0.getVisual();
      filter0.setVisual(beanVisual0);
      MetaBean metaBean0 = new MetaBean();
      TestSetEvent testSetEvent0 = new TestSetEvent(metaBean0, instances0);
      filter0.acceptTestSet(testSetEvent0);
      assertEquals("ClassValuePicker", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      Filter filter0 = new Filter();
      filter0.getMouseWheelListeners();
      Loader loader0 = new Loader();
      BeanContext beanContext0 = loader0.m_beanContext;
      BeanContextServicesSupport beanContextServicesSupport0 = new BeanContextServicesSupport();
      boolean boolean0 = loader0.m_stopped;
      MinkowskiDistance minkowskiDistance0 = new MinkowskiDistance();
      IncrementalClassifierEvaluator incrementalClassifierEvaluator0 = new IncrementalClassifierEvaluator();
      filter0.connectionNotification(" } else if (((Double)i[", incrementalClassifierEvaluator0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      filter0.eventGeneratable(" } else if (((Double)i[");
      TestSetMaker testSetMaker0 = new TestSetMaker();
      filter0.stop();
      FileSystemHandling.shouldAllThrowIOExceptions();
      // Undeclared exception!
      try { 
        filter0.setWrappedAlgorithm(beanContextServicesSupport0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // class java.beans.beancontext.BeanContextServicesSupport : incorrect type of algorithm (Filter)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Filter filter0 = new Filter();
      MetalComboBoxUI metalComboBoxUI0 = new MetalComboBoxUI();
      filter0.addTestSetListener(filter0);
      boolean boolean0 = filter0.isBusy();
      CheckGOE checkGOE0 = new CheckGOE();
      filter0.addInstanceListener(filter0);
      filter0.setAutoscrolls(false);
      AllFilter allFilter0 = new AllFilter();
      Appender appender0 = new Appender();
      TestSetMaker testSetMaker0 = new TestSetMaker();
      filter0.disconnectionNotification("New York, NY, USA", testSetMaker0);
      InstanceEvent instanceEvent0 = appender0.m_ie;
      boolean boolean1 = filter0.eventGeneratable("configuration");
      assertFalse(boolean1 == boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Random.setNextRandom((-1730675867));
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      Random.setNextRandom(1646);
      Filter filter0 = new Filter();
      Appender appender0 = new Appender();
      BeanContextServicesSupport beanContextServicesSupport0 = new BeanContextServicesSupport();
      BeanContextServicesSupport beanContextServicesSupport1 = new BeanContextServicesSupport(beanContextServicesSupport0);
      appender0.removeVetoableChangeListener(beanContextServicesSupport1);
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(appender0, (-1730675867), 0L, (-1881310025), (-1730675867), (-1881310025), (-1881310025), 6, 5162, false, 4, 1646, (-1881310025), 1674.1);
      appender0.getToolTipText((MouseEvent) mouseWheelEvent0);
      filter0.addInstanceListener(appender0);
      FlowByExpression flowByExpression0 = new FlowByExpression();
      InstanceEvent instanceEvent0 = flowByExpression0.m_ie;
      filter0.notifyInstanceListeners(instanceEvent0);
      Logger logger0 = flowByExpression0.m_log;
      filter0.setLog((Logger) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.getMouseWheelListeners();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getStructure();
      Sorter sorter0 = new Sorter();
      InstanceEvent instanceEvent0 = sorter0.m_ie;
      filter0.acceptInstance(instanceEvent0);
      ClassValuePicker classValuePicker0 = new ClassValuePicker();
      BeanVisual beanVisual0 = classValuePicker0.getVisual();
      filter0.setVisual(beanVisual0);
      MetaBean metaBean0 = new MetaBean();
      TestSetEvent testSetEvent0 = new TestSetEvent(metaBean0, instances0);
      DataSetEvent dataSetEvent0 = new DataSetEvent(beanVisual0, instances0);
      filter0.acceptDataSet(dataSetEvent0);
      assertEquals("ClassValuePicker", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Filter filter0 = new Filter();
      AllFilter allFilter0 = new AllFilter();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/9_weka");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      filter0.stop();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getStructure();
      DataSetEvent dataSetEvent0 = new DataSetEvent(textDirectoryLoader0, instances0);
      filter0.setCustomName((String) null);
      SysErrLog sysErrLog0 = new SysErrLog();
      filter0.setLog(sysErrLog0);
      filter0.useDefaultVisual();
      PredictionAppender predictionAppender0 = new PredictionAppender();
      InstanceEvent instanceEvent0 = predictionAppender0.m_instanceEvent;
      instances0.lastIndexOf(".arff");
      filter0.addTestSetListener((TestSetListener) null);
      Appender appender0 = new Appender();
      appender0.m_completeHeader = instances0;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      appender0.transferFocusDownCycle();
      predictionAppender0.getVisual();
      FlowByExpression flowByExpression0 = new FlowByExpression();
      filter0.acceptInstance((InstanceEvent) null);
      Hashtable<AttributedCharacterIterator.Attribute, Button> hashtable0 = new Hashtable<AttributedCharacterIterator.Attribute, Button>();
      AlphabeticTokenizer alphabeticTokenizer0 = new AlphabeticTokenizer();
      Font.decode((String) null);
      TrainingSetMaker trainingSetMaker0 = new TrainingSetMaker();
      filter0.getCustomName();
      DatabaseLoader databaseLoader0 = new DatabaseLoader();
      databaseLoader0.getStructure();
      System.setCurrentTimeMillis(3);
      ClassValuePicker classValuePicker0 = new ClassValuePicker();
      TestSetEvent testSetEvent0 = new TestSetEvent(classValuePicker0, instances0);
      // Undeclared exception!
      try { 
        filter0.acceptTestSet(testSetEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.enumerateRequests();
      filter0.getRegisteredKeyStrokes();
      SysErrLog sysErrLog0 = new SysErrLog();
      sysErrLog0.logMessage("JX7!*E;:>6!");
      filter0.resetKeyboardActions();
      sysErrLog0.statusMessage("");
      filter0.setLog(sysErrLog0);
      filter0.useDefaultVisual();
      filter0.acceptInstance((InstanceEvent) null);
      boolean boolean0 = filter0.isBusy();
      assertEquals("AllFilter", filter0.getCustomName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SubstringReplacer substringReplacer0 = new SubstringReplacer();
      ConfigurationListener configurationListener0 = mock(ConfigurationListener.class, new ViolatedAssumptionAnswer());
      Filter filter0 = new Filter();
      SpreadSubsample spreadSubsample0 = new SpreadSubsample();
      filter0.setWrappedAlgorithm(spreadSubsample0);
      assertEquals("SpreadSubsample", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Filter filter0 = new Filter();
      Filter filter1 = new Filter();
      filter0.addTestSetListener(filter1);
      Classifier classifier0 = new Classifier();
      filter1.addTestSetListener(classifier0);
      Filter filter2 = new Filter();
      filter2.isBusy();
      CheckGOE checkGOE0 = new CheckGOE();
      filter1.addInstanceListener(filter2);
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getStructure();
      Sorter sorter0 = new Sorter();
      filter0.addDataSourceListener(filter2);
      SubstringReplacer substringReplacer0 = new SubstringReplacer();
      SubstringReplacer substringReplacer1 = new SubstringReplacer();
      SystemInUtil.addInputLine("model");
      InstanceEvent instanceEvent0 = substringReplacer0.m_ie;
      filter0.acceptInstance(instanceEvent0);
      Appender appender0 = new Appender();
      BeanVisual beanVisual0 = appender0.m_visual;
      filter0.setVisual(beanVisual0);
      beanVisual0.getFocusTraversalPolicy();
      Color color0 = Color.CYAN;
      EtchedBorder etchedBorder0 = new EtchedBorder(color0, (Color) null);
      substringReplacer1.setBorder(etchedBorder0);
      TestSetEvent testSetEvent0 = new TestSetEvent(beanVisual0, instances0);
      filter1.acceptTestSet(testSetEvent0);
      // Undeclared exception!
      try { 
        filter1.setWrappedAlgorithm(color0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // class java.awt.Color : incorrect type of algorithm (Filter)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Filter filter0 = new Filter();
      MetalComboBoxUI metalComboBoxUI0 = new MetalComboBoxUI();
      MetalComboBoxUI.MetalComboBoxLayoutManager metalComboBoxUI_MetalComboBoxLayoutManager0 = metalComboBoxUI0.new MetalComboBoxLayoutManager();
      metalComboBoxUI_MetalComboBoxLayoutManager0.minimumLayoutSize(filter0);
      filter0.addTestSetListener((TestSetListener) null);
      TestSetMaker testSetMaker0 = new TestSetMaker();
      TestSetMaker testSetMaker1 = new TestSetMaker();
      testSetMaker1.getStructure("4{]m}");
      ScatterPlotMatrix scatterPlotMatrix0 = new ScatterPlotMatrix();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(scatterPlotMatrix0, (Instances) null, 46, 67);
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)27;
      byteArray0[1] = (byte) (-1);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      Filter filter1 = new Filter();
      filter1.acceptTrainingSet(trainingSetEvent0);
      filter1.addDataSourceListener(testSetMaker1);
      SubstringReplacer substringReplacer0 = new SubstringReplacer();
      SubstringReplacer substringReplacer1 = new SubstringReplacer();
      InstanceEvent instanceEvent0 = substringReplacer1.m_ie;
      filter1.acceptInstance(instanceEvent0);
      Appender appender0 = new Appender();
      BeanVisual beanVisual0 = appender0.m_visual;
      DataSetEvent dataSetEvent0 = new DataSetEvent(metalComboBoxUI_MetalComboBoxLayoutManager0, (Instances) null);
      Filter filter2 = new Filter();
      filter2.acceptDataSet(dataSetEvent0);
      ClassValuePicker classValuePicker0 = new ClassValuePicker();
      classValuePicker0.getKeyListeners();
      NominalToBinary nominalToBinary0 = new NominalToBinary();
      filter0.setFilter(nominalToBinary0);
      filter1.setCustomName(".arff");
      filter1.getFilter();
      assertEquals(".arff", filter1.getCustomName());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Filter filter0 = new Filter();
      String string0 = filter0.getCustomName();
      assertEquals("AllFilter", string0);
      
      SubstringReplacer substringReplacer0 = new SubstringReplacer();
      InstanceEvent instanceEvent0 = substringReplacer0.m_ie;
      filter0.acceptInstance(instanceEvent0);
      filter0.connectionNotification("AllFilter", instanceEvent0);
      boolean boolean0 = filter0.eventGeneratable("AllFilter");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      Filter filter0 = new Filter();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getDataSet();
      ClassValuePicker classValuePicker0 = new ClassValuePicker();
      MultiFilter multiFilter0 = new MultiFilter();
      multiFilter0.isStreamableFilter();
      filter0.setFilter(multiFilter0);
      filter0.getMouseListeners();
      filter0.getRegisteredKeyStrokes();
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      SubstringLabeler substringLabeler1 = new SubstringLabeler();
      weka.filters.Filter filter1 = weka.filters.Filter.makeCopy(multiFilter0);
      DataSetEvent dataSetEvent0 = new DataSetEvent(filter1, instances0);
      filter0.acceptDataSet(dataSetEvent0);
      CheckGOE checkGOE0 = new CheckGOE();
      FileSystemHandling.shouldAllThrowIOExceptions();
      ArffSaver arffSaver0 = new ArffSaver();
      arffSaver0.getInstances();
      MetaBean metaBean0 = new MetaBean();
      Locale locale0 = Locale.KOREA;
      JComponent.setDefaultLocale(locale0);
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(metaBean0, instances0, (-1104), (-7));
      filter0.acceptTrainingSet(trainingSetEvent0);
      filter0.stop();
      assertEquals("MultiFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Filter filter0 = new Filter();
      ClassValuePicker classValuePicker0 = new ClassValuePicker();
      DatabaseLoader databaseLoader0 = new DatabaseLoader();
      databaseLoader0.getDataSet();
      DataSetEvent dataSetEvent0 = new DataSetEvent(classValuePicker0, (Instances) null);
      filter0.acceptDataSet(dataSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
      
      Filter filter1 = new Filter();
      Appender appender0 = new Appender();
      appender0.getBorder();
      Filter filter2 = new Filter();
      filter2.enumerateRequests();
      filter2.getFilter();
      filter0.setCustomName("~kKf'PB/<e/V");
      filter0.getAlignmentY();
      AllFilter allFilter0 = new AllFilter();
      String string0 = AccessibleContext.ACCESSIBLE_CHILD_PROPERTY;
      filter1.useDefaultVisual();
      filter2.isBusy();
      filter2.performRequest("Stop");
      filter2.setFilter(allFilter0);
      assertFalse(filter2.isBusy());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
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
  public void test23()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      Filter filter0 = new Filter();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      textDirectoryLoader0.getDataSet();
      ClassValuePicker classValuePicker0 = new ClassValuePicker();
      MultiFilter multiFilter0 = new MultiFilter();
      multiFilter0.isStreamableFilter();
      filter0.setFilter(multiFilter0);
      filter0.getMouseListeners();
      filter0.getRegisteredKeyStrokes();
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      InstanceEvent instanceEvent0 = substringLabeler0.m_ie;
      Random.setNextRandom(1);
      filter0.acceptInstance(instanceEvent0);
      filter0.disconnectionNotification(".bsi", instanceEvent0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Filter filter0 = new Filter();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      textDirectoryLoader0.getDataSet();
      ClassValuePicker classValuePicker0 = new ClassValuePicker();
      DatabaseLoader databaseLoader0 = new DatabaseLoader();
      MultiFilter multiFilter0 = new MultiFilter();
      multiFilter0.isStreamableFilter();
      filter0.setFilter(multiFilter0);
      filter0.getMouseListeners();
      filter0.getRegisteredKeyStrokes();
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      InstanceEvent instanceEvent0 = substringLabeler0.m_ie;
      instanceEvent0.setStatus(2);
      Random.setNextRandom(1);
      filter0.acceptInstance(instanceEvent0);
      // Undeclared exception!
      try { 
        filter0.acceptTestSet((TestSetEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Filter filter0 = new Filter();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      filter0.getFocusTraversalPolicy();
      ThreadGroup threadGroup0 = new ThreadGroup("b)");
      filter0.setIgnoreRepaint(false);
      SystemInUtil.addInputLine("6onfig9ration");
      ThreadGroup threadGroup1 = new ThreadGroup(threadGroup0, "configuration");
      MockThread mockThread0 = new MockThread(threadGroup1, "%_UP=C");
      filter0.m_filterThread = (Thread) mockThread0;
      filter0.isBusy();
      filter0.getVisual();
      CrossValidationFoldMaker crossValidationFoldMaker0 = new CrossValidationFoldMaker();
      filter0.addTestSetListener(crossValidationFoldMaker0);
      // Undeclared exception!
      try { 
        filter0.performRequest(":8f(sS7&9>-S4-cvV%");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // :8f(sS7&9>-S4-cvV% not supported (Filter)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      Filter filter0 = new Filter();
      filter0.getMouseWheelListeners();
      Loader loader0 = new Loader();
      BeanContextServicesSupport beanContextServicesSupport0 = new BeanContextServicesSupport();
      filter0.removeVetoableChangeListener(beanContextServicesSupport0);
      boolean boolean0 = loader0.m_stopped;
      MinkowskiDistance minkowskiDistance0 = new MinkowskiDistance();
      IncrementalClassifierEvaluator incrementalClassifierEvaluator0 = new IncrementalClassifierEvaluator();
      filter0.connectionNotification(" } else if (((Double)i[", incrementalClassifierEvaluator0);
      boolean boolean1 = loader0.m_stopped;
      filter0.eventGeneratable(" } else if (((Double)i[");
      TestSetMaker testSetMaker0 = new TestSetMaker();
      filter0.stop();
      FileSystemHandling.shouldAllThrowIOExceptions();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      MultiFilter multiFilter0 = new MultiFilter();
      ContainerListener containerListener0 = mock(ContainerListener.class, new ViolatedAssumptionAnswer());
      ContainerListener containerListener1 = AWTEventMulticaster.add(containerListener0, containerListener0);
      AWTEventMulticaster.remove(containerListener1, containerListener1);
      minkowskiDistance0.setInvertSelection(false);
      filter0.isBusy();
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 1;
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(0, doubleArray0);
      testSetMaker0.getStructure(" } else if (((Double)i[");
      DataSetEvent dataSetEvent0 = new DataSetEvent(multiFilter0, (Instances) null);
      filter0.addTrainingSetListener((TrainingSetListener) null);
      filter0.acceptDataSet(dataSetEvent0);
      ConfigurationListener configurationListener0 = mock(ConfigurationListener.class, new ViolatedAssumptionAnswer());
      filter0.getVisual();
      Random.setNextRandom(0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Filter filter0 = new Filter();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getDataSet();
      ClassValuePicker classValuePicker0 = new ClassValuePicker();
      DatabaseLoader databaseLoader0 = new DatabaseLoader();
      SynthRadioButtonUI synthRadioButtonUI0 = new SynthRadioButtonUI();
      filter0.removePropertyChangeListener("@data", (PropertyChangeListener) synthRadioButtonUI0);
      MultiFilter multiFilter0 = new MultiFilter();
      multiFilter0.isStreamableFilter();
      filter0.getMouseListeners();
      filter0.getRegisteredKeyStrokes();
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      SubstringLabeler substringLabeler1 = new SubstringLabeler();
      filter0.addDataSourceListener(substringLabeler1);
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Random.setNextRandom((-2060));
      filter0.getCustomName();
      DatabaseLoader databaseLoader1 = new DatabaseLoader();
      databaseLoader1.setCustomPropsFile((File) null);
      databaseLoader0.getStructure();
      DataSetEvent dataSetEvent0 = new DataSetEvent("AllFilter", instances0);
      filter0.acceptDataSet(dataSetEvent0);
      filter0.disconnectionNotification(".arff", instances0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Filter filter0 = new Filter();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getDataSet();
      filter0.getGraphics();
      ClassValuePicker classValuePicker0 = new ClassValuePicker();
      DatabaseLoader databaseLoader0 = new DatabaseLoader();
      MultiFilter multiFilter0 = new MultiFilter();
      filter0.setFilter(multiFilter0);
      filter0.getMouseListeners();
      filter0.getRegisteredKeyStrokes();
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      InstanceEvent instanceEvent0 = substringLabeler0.m_ie;
      instanceEvent0.setStatus((-563));
      filter0.acceptInstance(instanceEvent0);
      DataSetEvent dataSetEvent0 = new DataSetEvent("@data", instances0);
      filter0.acceptDataSet(dataSetEvent0);
      filter0.removeTestSetListener(substringLabeler0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      Filter filter0 = new Filter();
      ClassValuePicker classValuePicker0 = new ClassValuePicker();
      ClassValuePicker classValuePicker1 = new ClassValuePicker();
      MultiFilter multiFilter0 = new MultiFilter();
      multiFilter0.setDebug(false);
      filter0.setFilter(multiFilter0);
      filter0.getRegisteredKeyStrokes();
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      SubstringLabeler substringLabeler1 = new SubstringLabeler();
      SubstringReplacer substringReplacer0 = new SubstringReplacer();
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      int[] intArray0 = new int[2];
      intArray0[1] = 115;
      ImageFilter imageFilter0 = new ImageFilter();
      InstanceEvent instanceEvent0 = substringReplacer0.m_ie;
      filter0.acceptInstance(instanceEvent0);
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      TrainingSetMaker trainingSetMaker0 = new TrainingSetMaker();
      Random.setNextRandom(2);
      filter0.getCustomName();
      DatabaseLoader databaseLoader0 = new DatabaseLoader();
      databaseLoader0.getStructure();
      filter0.addInstanceListener(substringReplacer0);
      filter0.getWrappedAlgorithm();
      filter0.acceptTrainingSet((TrainingSetEvent) null);
      filter0.acceptTrainingSet((TrainingSetEvent) null);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      Filter filter0 = new Filter();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getDataSet();
      ClassValuePicker classValuePicker0 = new ClassValuePicker();
      MultiFilter multiFilter0 = new MultiFilter();
      multiFilter0.isStreamableFilter();
      filter0.setFilter(multiFilter0);
      filter0.getMouseListeners();
      filter0.getRegisteredKeyStrokes();
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      SubstringLabeler substringLabeler1 = new SubstringLabeler();
      InstanceEvent instanceEvent0 = substringLabeler1.m_ie;
      instanceEvent0.setStructure(instances0);
      Random.setNextRandom(1);
      filter0.acceptInstance(instanceEvent0);
      Random.setNextRandom(3201);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.getWrappedAlgorithm();
      filter0.stop();
      FileSystemHandling.shouldAllThrowIOExceptions();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getDataSet();
      filter0.getGraphics();
      SystemInUtil.addInputLine("@data");
      ClassValuePicker classValuePicker0 = new ClassValuePicker();
      DatabaseLoader databaseLoader0 = new DatabaseLoader();
      MultiFilter multiFilter0 = new MultiFilter();
      multiFilter0.setInputFormat(instances0);
      filter0.setFilter(multiFilter0);
      filter0.getRegisteredKeyStrokes();
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      InstanceEvent instanceEvent0 = substringLabeler0.m_ie;
      Color color0 = Color.BLUE;
      instanceEvent0.setStructure(instances0);
      substringLabeler0.m_hasLabels = false;
      instanceEvent0.setStatus(1);
      filter0.acceptInstance(instanceEvent0);
      SubstringLabeler substringLabeler1 = new SubstringLabeler();
      substringLabeler0.setMatchAttributeName("@data");
      DataSetEvent dataSetEvent0 = new DataSetEvent(substringLabeler1, instances0);
      filter0.acceptDataSet(dataSetEvent0);
      Instances instances1 = new Instances(instances0, 0, 0);
      DataSetEvent dataSetEvent1 = new DataSetEvent(dataSetEvent0, instances1);
      TrainingSetMaker trainingSetMaker0 = new TrainingSetMaker();
      Random.setNextRandom(0);
      filter0.getCustomName();
      DatabaseLoader databaseLoader1 = new DatabaseLoader();
      databaseLoader1.getStructure();
      System.setCurrentTimeMillis(0);
      ClassValuePicker classValuePicker1 = new ClassValuePicker();
      System.setCurrentTimeMillis(1);
      ChebyshevDistance chebyshevDistance0 = new ChebyshevDistance();
      TestSetEvent testSetEvent0 = new TestSetEvent(instances0, (Instances) null);
      // Undeclared exception!
      try { 
        filter0.acceptTestSet(testSetEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Instances", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.getWrappedAlgorithm();
      filter0.stop();
      FileSystemHandling.shouldAllThrowIOExceptions();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getDataSet();
      filter0.getGraphics();
      SystemInUtil.addInputLine("@data");
      ClassValuePicker classValuePicker0 = new ClassValuePicker();
      MultiFilter multiFilter0 = new MultiFilter();
      filter0.setFilter(multiFilter0);
      filter0.getRegisteredKeyStrokes();
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      InstanceEvent instanceEvent0 = substringLabeler0.m_ie;
      Color color0 = Color.BLUE;
      instanceEvent0.setStructure(instances0);
      substringLabeler0.m_hasLabels = false;
      instanceEvent0.setStatus(1);
      filter0.acceptInstance(instanceEvent0);
      SubstringLabeler substringLabeler1 = new SubstringLabeler();
      DataSetEvent dataSetEvent0 = new DataSetEvent(substringLabeler1, instances0);
      filter0.acceptDataSet(dataSetEvent0);
      Instances instances1 = new Instances(instances0, 0, 0);
      DataSetEvent dataSetEvent1 = new DataSetEvent(dataSetEvent0, instances1);
      filter0.acceptDataSet(dataSetEvent1);
      TrainingSetMaker trainingSetMaker0 = new TrainingSetMaker();
      Random.setNextRandom(0);
      filter0.getCustomName();
      DatabaseLoader databaseLoader0 = new DatabaseLoader();
      databaseLoader0.getStructure();
      System.setCurrentTimeMillis(0);
      ClassValuePicker classValuePicker1 = new ClassValuePicker();
      System.setCurrentTimeMillis(1);
      ChebyshevDistance chebyshevDistance0 = new ChebyshevDistance();
      TestSetEvent testSetEvent0 = new TestSetEvent(instances0, (Instances) null);
      System.setCurrentTimeMillis(0);
      ChebyshevDistance chebyshevDistance1 = new ChebyshevDistance();
      TestSetEvent testSetEvent1 = new TestSetEvent(classValuePicker0, instances1);
      filter0.acceptTestSet(testSetEvent1);
  }
}