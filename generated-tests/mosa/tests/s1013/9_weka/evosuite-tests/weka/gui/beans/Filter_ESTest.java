/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 04:08:55 GMT 2018
 */

package weka.gui.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.AWTEventMulticaster;
import java.awt.event.ContainerListener;
import java.beans.EventSetDescriptor;
import javax.swing.KeyStroke;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.evosuite.runtime.mock.java.time.chrono.MockThaiBuddhistDate;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import weka.core.BinarySparseInstance;
import weka.core.GlobalInfoJavadoc;
import weka.core.Instances;
import weka.core.converters.TextDirectoryLoader;
import weka.filters.AllFilter;
import weka.filters.MultiFilter;
import weka.filters.supervised.instance.SpreadSubsample;
import weka.filters.supervised.instance.StratifiedRemoveFolds;
import weka.gui.Logger;
import weka.gui.SysErrLog;
import weka.gui.beans.Appender;
import weka.gui.beans.AttributeSummarizer;
import weka.gui.beans.BeanVisual;
import weka.gui.beans.ClassifierPerformanceEvaluator;
import weka.gui.beans.ConfigurationListener;
import weka.gui.beans.DataSetEvent;
import weka.gui.beans.DataVisualizer;
import weka.gui.beans.Filter;
import weka.gui.beans.FlowByExpression;
import weka.gui.beans.InstanceEvent;
import weka.gui.beans.Loader;
import weka.gui.beans.PredictionAppender;
import weka.gui.beans.Saver;
import weka.gui.beans.ScatterPlotMatrix;
import weka.gui.beans.Sorter;
import weka.gui.beans.SubstringLabeler;
import weka.gui.beans.TestSetEvent;
import weka.gui.beans.TrainTestSplitMaker;
import weka.gui.beans.TrainingSetEvent;
import weka.gui.explorer.ClassifierErrorsPlotInstances;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Filter_ESTest extends Filter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.enumerateRequests();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Filter filter0 = new Filter();
      InstanceEvent instanceEvent0 = new InstanceEvent(filter0);
      filter0.acceptInstance(instanceEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Filter filter0 = new Filter();
      DataSetEvent dataSetEvent0 = new DataSetEvent(filter0, (Instances) null);
      filter0.acceptDataSet(dataSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.acceptTrainingSet((TrainingSetEvent) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Filter filter0 = new Filter();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(filter0, (Instances) null);
      filter0.acceptTrainingSet(trainingSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.notifyInstanceListeners((InstanceEvent) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Appender appender0 = new Appender();
      Filter filter0 = new Filter();
      filter0.setVisual((BeanVisual) null);
      assertFalse(filter0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Filter filter0 = new Filter();
      GlobalInfoJavadoc globalInfoJavadoc0 = new GlobalInfoJavadoc();
      // Undeclared exception!
      try { 
        filter0.performRequest("<!-- globalinfo-start -->");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // <!-- globalinfo-start --> not supported (Filter)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.acceptDataSet((DataSetEvent) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Filter filter0 = new Filter();
      TrainTestSplitMaker trainTestSplitMaker0 = new TrainTestSplitMaker();
      // Undeclared exception!
      try { 
        filter0.setWrappedAlgorithm(trainTestSplitMaker0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // class weka.gui.beans.TrainTestSplitMaker : incorrect type of algorithm (Filter)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StratifiedRemoveFolds stratifiedRemoveFolds0 = new StratifiedRemoveFolds();
      Filter filter0 = new Filter();
      filter0.setWrappedAlgorithm(stratifiedRemoveFolds0);
      assertEquals("StratifiedRemoveFolds", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Filter filter0 = new Filter();
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      filter0.addDataSourceListener(substringLabeler0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Filter filter0 = new Filter();
      BeanVisual beanVisual0 = filter0.getVisual();
      assertEquals("weka/gui/beans/icons/DefaultFilter.gif", beanVisual0.getIconPath());
      assertEquals("AllFilter", beanVisual0.getText());
      assertEquals("weka/gui/beans/icons/DefaultFilter_animated.gif", beanVisual0.getAnimatedIconPath());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Filter filter0 = new Filter();
      Saver saver0 = new Saver();
      filter0.removeInstanceListener(saver0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Filter filter0 = new Filter();
      ConfigurationListener configurationListener0 = mock(ConfigurationListener.class, new ViolatedAssumptionAnswer());
      filter0.removeConfigurationListener(configurationListener0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Filter filter0 = new Filter();
      boolean boolean0 = filter0.isBusy();
      assertFalse(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Filter filter0 = new Filter();
      SpreadSubsample spreadSubsample0 = new SpreadSubsample();
      MultiFilter multiFilter0 = new MultiFilter();
      filter0.setWrappedAlgorithm(multiFilter0);
      assertEquals("MultiFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Filter filter0 = new Filter();
      Sorter sorter0 = new Sorter();
      filter0.removeDataSourceListener(sorter0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Filter filter0 = new Filter();
      TestSetEvent testSetEvent0 = new TestSetEvent(filter0, (Instances) null);
      filter0.acceptTestSet(testSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.removeTestSetListener(filter0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AttributeSummarizer attributeSummarizer0 = new AttributeSummarizer();
      Filter filter0 = new Filter();
      filter0.removeTrainingSetListener(attributeSummarizer0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Filter filter0 = new Filter();
      DataVisualizer dataVisualizer0 = new DataVisualizer();
      filter0.addTrainingSetListener(dataVisualizer0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Filter filter0 = new Filter();
      GlobalInfoJavadoc globalInfoJavadoc0 = new GlobalInfoJavadoc();
      filter0.disconnectionNotification("<!-- globalinfo-start -->", globalInfoJavadoc0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.setCustomName("configuratin");
      assertEquals("configuratin", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Filter filter0 = new Filter();
      boolean boolean0 = filter0.eventGeneratable("configuration");
      assertEquals("AllFilter", filter0.getCustomName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Filter filter0 = new Filter();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getDataSet();
      TestSetEvent testSetEvent0 = new TestSetEvent(filter0, instances0);
      filter0.acceptTestSet(testSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Filter filter0 = new Filter();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getStructure();
      DataSetEvent dataSetEvent0 = new DataSetEvent(instances0, instances0);
      filter0.acceptDataSet(dataSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MultiFilter multiFilter0 = new MultiFilter();
      Filter filter0 = new Filter();
      filter0.setFilter(multiFilter0);
      GlobalInfoJavadoc globalInfoJavadoc0 = new GlobalInfoJavadoc();
      InstanceEvent instanceEvent0 = new InstanceEvent(globalInfoJavadoc0, (Instances) null);
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getStructure();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(instances0, instances0);
      filter0.acceptTrainingSet(trainingSetEvent0);
      assertEquals("MultiFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Filter filter0 = new Filter();
      ConfigurationListener configurationListener0 = mock(ConfigurationListener.class, new ViolatedAssumptionAnswer());
      filter0.addConfigurationListener(configurationListener0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Filter filter0 = new Filter();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getStructure();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(textDirectoryLoader0, instances0);
      filter0.acceptTrainingSet(trainingSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.connectionNotification("instance", "instance");
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.connectionNotification("m}tv_/M", "m}tv_/M");
      boolean boolean0 = filter0.connectionAllowed("m}tv_/M");
      assertEquals("AllFilter", filter0.getCustomName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
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
  public void test33()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.connectionNotification("h<o%", "h<o%");
      filter0.stop();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Filter filter0 = new Filter();
      ScatterPlotMatrix scatterPlotMatrix0 = new ScatterPlotMatrix();
      scatterPlotMatrix0.getMouseMotionListeners();
      filter0.connectionNotification("h<o%", scatterPlotMatrix0);
      boolean boolean0 = filter0.eventGeneratable("h<o%");
      assertFalse(boolean0);
      
      filter0.stop();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Filter filter0 = new Filter();
      FileSystemHandling.shouldAllThrowIOExceptions();
      filter0.getWrappedAlgorithm();
      filter0.performRequest("Stop");
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.connectionNotification("h<o%", "h<o%");
      boolean boolean0 = filter0.eventGeneratable("h<o%");
      assertTrue(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Filter filter0 = new Filter();
      Loader loader0 = new Loader();
      filter0.connectionNotification("constructor", loader0);
      boolean boolean0 = filter0.eventGeneratable("constructor");
      assertEquals("AllFilter", filter0.getCustomName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Filter filter0 = new Filter();
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      Logger logger0 = substringLabeler0.m_log;
      MockThread mockThread0 = new MockThread("-LW2AsICIqYQ9ApwJG");
      filter0.m_filterThread = (Thread) mockThread0;
      filter0.acceptTrainingSet((TrainingSetEvent) null);
      boolean boolean0 = filter0.isBusy();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      MultiFilter multiFilter0 = new MultiFilter();
      Filter filter0 = new Filter();
      filter0.setFilter(multiFilter0);
      GlobalInfoJavadoc globalInfoJavadoc0 = new GlobalInfoJavadoc();
      InstanceEvent instanceEvent0 = new InstanceEvent(globalInfoJavadoc0, (Instances) null);
      instanceEvent0.setStatus(626);
      filter0.acceptInstance(instanceEvent0);
      assertEquals("MultiFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MultiFilter multiFilter0 = new MultiFilter();
      Filter filter0 = new Filter();
      filter0.setFilter(multiFilter0);
      GlobalInfoJavadoc globalInfoJavadoc0 = new GlobalInfoJavadoc();
      FlowByExpression flowByExpression0 = new FlowByExpression();
      InstanceEvent instanceEvent0 = flowByExpression0.m_ie;
      filter0.acceptInstance(instanceEvent0);
      assertEquals("MultiFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      MultiFilter multiFilter0 = new MultiFilter();
      Filter filter0 = new Filter();
      filter0.setFilter(multiFilter0);
      // Undeclared exception!
      try { 
        filter0.connectionNotification("instance", (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Hashtable", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Filter filter0 = new Filter();
      SysErrLog sysErrLog0 = new SysErrLog();
      filter0.setLog(sysErrLog0);
      PredictionAppender predictionAppender0 = new PredictionAppender();
      InstanceEvent instanceEvent0 = predictionAppender0.m_instanceEvent;
      filter0.acceptInstance((InstanceEvent) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      MultiFilter multiFilter0 = new MultiFilter();
      multiFilter0.listOptions();
      Filter filter0 = new Filter();
      Filter filter1 = new Filter();
      filter1.setFilter(multiFilter0);
      GlobalInfoJavadoc globalInfoJavadoc0 = new GlobalInfoJavadoc();
      Filter filter2 = new Filter();
      filter2.getMouseListeners();
      GlobalInfoJavadoc globalInfoJavadoc1 = new GlobalInfoJavadoc();
      ClassifierPerformanceEvaluator classifierPerformanceEvaluator0 = new ClassifierPerformanceEvaluator();
      InstanceEvent instanceEvent0 = new InstanceEvent(classifierPerformanceEvaluator0, (Instances) null);
      AllFilter allFilter0 = new AllFilter();
      InstanceEvent instanceEvent1 = new InstanceEvent(allFilter0, (Instances) null);
      instanceEvent1.setStatus(2);
      filter1.acceptInstance(instanceEvent1);
      assertEquals("MultiFilter", filter1.getCustomName());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getDataSet();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(textDirectoryLoader0, instances0);
      TestSetEvent testSetEvent0 = new TestSetEvent(trainingSetEvent0, instances0);
      testSetEvent0.m_maxSetNumber = 834;
      Filter filter0 = new Filter();
      AttributeSummarizer attributeSummarizer0 = new AttributeSummarizer();
      filter0.addTestSetListener(attributeSummarizer0);
      filter0.acceptTestSet(testSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      MultiFilter multiFilter0 = new MultiFilter();
      Filter filter0 = new Filter();
      filter0.setFilter(multiFilter0);
      GlobalInfoJavadoc globalInfoJavadoc0 = new GlobalInfoJavadoc();
      InstanceEvent instanceEvent0 = new InstanceEvent(globalInfoJavadoc0, (Instances) null);
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(1338.946157639181, (int[]) null, 0);
      instanceEvent0.setInstance(binarySparseInstance0);
      instanceEvent0.setStatus(626);
      filter0.acceptInstance(instanceEvent0);
      assertEquals("MultiFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Filter filter0 = new Filter();
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, " Error in obtaining post-filter structure. ");
      ContainerListener containerListener0 = mock(ContainerListener.class, new ViolatedAssumptionAnswer());
      substringLabeler0.addInstanceListener(filter0);
      ContainerListener containerListener1 = AWTEventMulticaster.add(containerListener0, containerListener0);
      AWTEventMulticaster.remove(containerListener1, containerListener1);
      substringLabeler0.removeContainerListener((ContainerListener) null);
      filter0.addInstanceListener(substringLabeler0);
      boolean boolean0 = filter0.eventGeneratable("06?)D@r{2}qDr-");
      String string0 = filter0.globalInfo();
      assertEquals("<html><font color=blue>An instance filter that passes all instances through unmodified</font><br><br> Primarily for testing purposes.<br></html>", string0);
      
      MockThaiBuddhistDate mockThaiBuddhistDate0 = new MockThaiBuddhistDate();
      InstanceEvent instanceEvent0 = new InstanceEvent(mockThaiBuddhistDate0);
      filter0.notifyInstanceListeners(instanceEvent0);
      boolean boolean1 = filter0.connectionAllowed("h<W%");
      assertEquals("AllFilter", filter0.getCustomName());
      assertFalse(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Filter filter0 = new Filter();
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      weka.gui.LogPanel logPanel0 = new weka.gui.LogPanel();
      ThreadGroup threadGroup0 = new ThreadGroup("-LW2AsICIqYQ9ApwJG");
      MockThread mockThread0 = new MockThread();
      filter0.m_filterThread = (Thread) mockThread0;
      filter0.enumerateRequests();
      // Undeclared exception!
      try { 
        filter0.performRequest("-LW2AsICIqYQ9ApwJG");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -LW2AsICIqYQ9ApwJG not supported (Filter)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Filter filter0 = new Filter();
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      Logger logger0 = substringLabeler0.m_log;
      filter0.setLog((Logger) null);
      PredictionAppender predictionAppender0 = new PredictionAppender();
      ThreadGroup threadGroup0 = new ThreadGroup("-LW2AsICIqYQ9ApwJG");
      MockThread mockThread0 = new MockThread("-LW2AsICIqYQ9ApwJG");
      MockThread mockThread1 = new MockThread(mockThread0);
      filter0.m_filterThread = (Thread) mockThread1;
      InstanceEvent instanceEvent0 = predictionAppender0.m_instanceEvent;
      filter0.acceptInstance((InstanceEvent) null);
      filter0.stop();
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Filter filter0 = new Filter();
      KeyStroke keyStroke0 = KeyStroke.getKeyStroke('0');
      ClassifierErrorsPlotInstances classifierErrorsPlotInstances0 = new ClassifierErrorsPlotInstances();
      classifierErrorsPlotInstances0.getInstances();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(keyStroke0, (Instances) null, 84, 84, 84, 84);
      trainingSetEvent0.m_setNumber = 84;
      filter0.acceptTrainingSet(trainingSetEvent0);
  }
}