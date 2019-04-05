/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 21:23:35 GMT 2019
 */

package weka.gui.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.beans.EventSetDescriptor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.junit.runner.RunWith;
import weka.associations.FilteredAssociator;
import weka.core.CheckGOE;
import weka.core.Instances;
import weka.core.ManhattanDistance;
import weka.core.TestInstances;
import weka.core.converters.TextDirectoryLoader;
import weka.filters.supervised.attribute.ClassOrder;
import weka.filters.supervised.attribute.NominalToBinary;
import weka.filters.supervised.instance.SpreadSubsample;
import weka.gui.Logger;
import weka.gui.WekaTaskMonitor;
import weka.gui.beans.Appender;
import weka.gui.beans.BeanVisual;
import weka.gui.beans.Clusterer;
import weka.gui.beans.ClustererPerformanceEvaluator;
import weka.gui.beans.ConfigurationListener;
import weka.gui.beans.CrossValidationFoldMaker;
import weka.gui.beans.DataSetEvent;
import weka.gui.beans.Filter;
import weka.gui.beans.FlowByExpression;
import weka.gui.beans.ImageSaver;
import weka.gui.beans.InstanceEvent;
import weka.gui.beans.InstanceListener;
import weka.gui.beans.InstanceStreamToBatchMaker;
import weka.gui.beans.ScatterPlotMatrix;
import weka.gui.beans.Sorter;
import weka.gui.beans.SubstringReplacer;
import weka.gui.beans.TestSetEvent;
import weka.gui.beans.TestSetMaker;
import weka.gui.beans.TrainingSetEvent;
import weka.gui.beans.TrainingSetListener;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Filter_ESTest extends Filter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Filter filter0 = new Filter();
      // Undeclared exception!
      try { 
        filter0.performRequest("w:");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // w: not supported (Filter)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.setLog((Logger) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.removeTrainingSetListener((TrainingSetListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Filter filter0 = new Filter();
      ConfigurationListener configurationListener0 = mock(ConfigurationListener.class, new ViolatedAssumptionAnswer());
      filter0.removeConfigurationListener(configurationListener0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Filter filter0 = new Filter();
      ScatterPlotMatrix scatterPlotMatrix0 = new ScatterPlotMatrix();
      InstanceEvent instanceEvent0 = new InstanceEvent(scatterPlotMatrix0, (Instances) null);
      filter0.notifyInstanceListeners(instanceEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Filter filter0 = new Filter();
      boolean boolean0 = filter0.eventGeneratable("");
      assertFalse(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.addInstanceListener((InstanceListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.addConfigurationListener((ConfigurationListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Filter filter0 = new Filter();
      CrossValidationFoldMaker crossValidationFoldMaker0 = new CrossValidationFoldMaker();
      TestSetEvent testSetEvent0 = new TestSetEvent(crossValidationFoldMaker0, (Instances) null, 1, 1, 1, (-1850));
      filter0.acceptTestSet(testSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Filter filter0 = new Filter();
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
  public void test10()  throws Throwable  {
      Filter filter0 = new Filter();
      // Undeclared exception!
      try { 
        filter0.connectionNotification((String) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Filter filter0 = new Filter();
      boolean boolean0 = filter0.connectionAllowed("instance");
      assertFalse(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Filter filter0 = new Filter();
      boolean boolean0 = filter0.connectionAllowed(" WARNING : ");
      assertEquals("AllFilter", filter0.getCustomName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Filter filter0 = new Filter();
      weka.filters.Filter filter1 = filter0.getFilter();
      filter0.setFilter(filter1);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Filter filter0 = new Filter();
      String string0 = filter0.getCustomName();
      assertEquals("AllFilter", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Filter filter0 = new Filter();
      Sorter sorter0 = new Sorter();
      filter0.connectionNotification("<html><font color=blue>An instance filter that passes all instances through unmodified</font><br><br> Primarily for testing purposes.<br></html>", sorter0);
      boolean boolean0 = filter0.eventGeneratable("<html><font color=blue>An instance filter that passes all instances through unmodified</font><br><br> Primarily for testing purposes.<br></html>");
      assertFalse(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Filter filter0 = new Filter();
      Clusterer clusterer0 = new Clusterer();
      filter0.connectionNotification("Filter", clusterer0);
      boolean boolean0 = filter0.eventGeneratable("Filter");
      assertTrue(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Filter filter0 = new Filter();
      ClassOrder classOrder0 = new ClassOrder();
      filter0.connectionNotification("u- VKBo=^a =H|M.b%", classOrder0);
      boolean boolean0 = filter0.eventGeneratable("u- VKBo=^a =H|M.b%");
      assertEquals("AllFilter", filter0.getCustomName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Filter filter0 = new Filter();
      boolean boolean0 = filter0.eventGeneratable("configuration");
      assertTrue(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.performRequest("Stop");
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Filter filter0 = new Filter();
      // Undeclared exception!
      try { 
        filter0.performRequest("Number of performed iterations: ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of performed iterations:  not supported (Filter)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.enumerateRequests();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Filter filter0 = new Filter();
      MockThread mockThread0 = new MockThread("-Mt'E&2tg-Mr59h");
      filter0.m_filterThread = (Thread) mockThread0;
      boolean boolean0 = filter0.isBusy();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Filter filter0 = new Filter();
      boolean boolean0 = filter0.isBusy();
      assertFalse(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Filter filter0 = new Filter();
      ThreadGroup threadGroup0 = mock(ThreadGroup.class, new ViolatedAssumptionAnswer());
      MockThread mockThread0 = new MockThread(threadGroup0, "");
      filter0.m_filterThread = (Thread) mockThread0;
      filter0.stop();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Filter filter0 = new Filter();
      TestSetMaker testSetMaker0 = new TestSetMaker();
      filter0.connectionNotification("Passing on pending instances...", testSetMaker0);
      filter0.stop();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Filter filter0 = new Filter();
      InstanceStreamToBatchMaker instanceStreamToBatchMaker0 = new InstanceStreamToBatchMaker();
      DataSetEvent dataSetEvent0 = new DataSetEvent(instanceStreamToBatchMaker0, (Instances) null);
      filter0.acceptDataSet(dataSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Filter filter0 = new Filter();
      CheckGOE checkGOE0 = new CheckGOE();
      filter0.disconnectionNotification("}~bWROL,}d_%O", checkGOE0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Filter filter0 = new Filter();
      ManhattanDistance manhattanDistance0 = new ManhattanDistance();
      filter0.connectionNotification("instance", manhattanDistance0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Filter filter0 = new Filter();
      Clusterer clusterer0 = new Clusterer();
      filter0.connectionNotification("Filter", clusterer0);
      ImageSaver imageSaver0 = new ImageSaver();
      filter0.connectionNotification("Filter", imageSaver0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Filter filter0 = new Filter();
      ClassOrder classOrder0 = new ClassOrder();
      filter0.connectionNotification("u- VKBo=^a =H|M.b%", classOrder0);
      InstanceEvent instanceEvent0 = new InstanceEvent("u- VKBo=^a =H|M.b%", (Instances) null);
      filter0.acceptInstance(instanceEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.addInstanceListener(filter0);
      filter0.notifyInstanceListeners((InstanceEvent) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Filter filter0 = new Filter();
      ScatterPlotMatrix scatterPlotMatrix0 = new ScatterPlotMatrix();
      filter0.addTestSetListener(scatterPlotMatrix0);
      SubstringReplacer substringReplacer0 = new SubstringReplacer();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getStructure();
      TestSetEvent testSetEvent0 = new TestSetEvent(substringReplacer0, instances0);
      filter0.acceptTestSet(testSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Filter filter0 = new Filter();
      SubstringReplacer substringReplacer0 = new SubstringReplacer();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getStructure();
      TestSetEvent testSetEvent0 = new TestSetEvent(substringReplacer0, instances0);
      filter0.acceptTestSet(testSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.acceptTrainingSet((TrainingSetEvent) null);
      filter0.acceptTrainingSet((TrainingSetEvent) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Filter filter0 = new Filter();
      ClustererPerformanceEvaluator clustererPerformanceEvaluator0 = new ClustererPerformanceEvaluator();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getStructure();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(clustererPerformanceEvaluator0, instances0, (-4390), (-4390));
      filter0.acceptTrainingSet(trainingSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Filter filter0 = new Filter();
      ScatterPlotMatrix scatterPlotMatrix0 = new ScatterPlotMatrix();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getDataSet();
      DataSetEvent dataSetEvent0 = new DataSetEvent(scatterPlotMatrix0, instances0);
      filter0.acceptDataSet(dataSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Filter filter0 = new Filter();
      ThreadGroup threadGroup0 = mock(ThreadGroup.class, new ViolatedAssumptionAnswer());
      MockThread mockThread0 = new MockThread(threadGroup0, "");
      filter0.m_filterThread = (Thread) mockThread0;
      SubstringReplacer substringReplacer0 = new SubstringReplacer();
      InstanceEvent instanceEvent0 = substringReplacer0.m_ie;
      filter0.acceptInstance(instanceEvent0);
      assertTrue(filter0.isBusy());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Filter filter0 = new Filter();
      ManhattanDistance manhattanDistance0 = new ManhattanDistance((Instances) null);
      // Undeclared exception!
      try { 
        filter0.setWrappedAlgorithm(manhattanDistance0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // class weka.core.ManhattanDistance : incorrect type of algorithm (Filter)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Filter filter0 = new Filter();
      SpreadSubsample spreadSubsample0 = new SpreadSubsample();
      filter0.setWrappedAlgorithm(spreadSubsample0);
      assertEquals("SpreadSubsample", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Filter filter0 = new Filter();
      FilteredAssociator filteredAssociator0 = new FilteredAssociator();
      weka.filters.Filter filter1 = filteredAssociator0.getFilter();
      filter0.setFilter(filter1);
      FlowByExpression flowByExpression0 = new FlowByExpression();
      InstanceEvent instanceEvent0 = flowByExpression0.m_ie;
      filter0.acceptInstance(instanceEvent0);
      assertEquals("MultiFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Filter filter0 = new Filter();
      NominalToBinary nominalToBinary0 = new NominalToBinary();
      filter0.setFilter(nominalToBinary0);
      WekaTaskMonitor wekaTaskMonitor0 = new WekaTaskMonitor();
      weka.gui.LogPanel logPanel0 = new weka.gui.LogPanel(wekaTaskMonitor0, false, true, false);
      filter0.setLog(logPanel0);
      filter0.acceptInstance((InstanceEvent) null);
      assertEquals("NominalToBinary", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
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
  public void test43()  throws Throwable  {
      Filter filter0 = new Filter();
      Appender appender0 = new Appender();
      filter0.removeInstanceListener(appender0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Filter filter0 = new Filter();
      String string0 = filter0.globalInfo();
      assertEquals("<html><font color=blue>An instance filter that passes all instances through unmodified</font><br><br> Primarily for testing purposes.<br></html>", string0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.removeConfigurationListener((ConfigurationListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Filter filter0 = new Filter();
      ScatterPlotMatrix scatterPlotMatrix0 = new ScatterPlotMatrix();
      filter0.removeTestSetListener(scatterPlotMatrix0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Filter filter0 = new Filter();
      ConfigurationListener configurationListener0 = mock(ConfigurationListener.class, new ViolatedAssumptionAnswer());
      filter0.addConfigurationListener(configurationListener0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Filter filter0 = new Filter();
      BeanVisual beanVisual0 = filter0.getVisual();
      assertEquals("AllFilter", beanVisual0.getText());
      assertEquals("weka/gui/beans/icons/DefaultFilter_animated.gif", beanVisual0.getAnimatedIconPath());
      assertEquals("weka/gui/beans/icons/DefaultFilter.gif", beanVisual0.getIconPath());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.getWrappedAlgorithm();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.setCustomName("?]$!n`");
      assertEquals("?]$!n`", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Filter filter0 = new Filter();
      Clusterer clusterer0 = new Clusterer();
      filter0.addTrainingSetListener(clusterer0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Filter filter0 = new Filter();
      FlowByExpression flowByExpression0 = new FlowByExpression();
      BeanVisual beanVisual0 = flowByExpression0.getVisual();
      filter0.setVisual(beanVisual0);
      assertEquals("FlowByExpression", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Filter filter0 = new Filter();
      ScatterPlotMatrix scatterPlotMatrix0 = new ScatterPlotMatrix();
      filter0.addDataSourceListener(scatterPlotMatrix0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Filter filter0 = new Filter();
      FlowByExpression flowByExpression0 = new FlowByExpression();
      filter0.removeDataSourceListener(flowByExpression0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.useDefaultVisual();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Filter filter0 = new Filter();
      TestInstances testInstances0 = new TestInstances();
      Instances instances0 = testInstances0.generate();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent("WoVk8W15v16", instances0);
      filter0.acceptTrainingSet(trainingSetEvent0);
      TestSetEvent testSetEvent0 = new TestSetEvent(trainingSetEvent0, instances0);
      filter0.acceptTestSet(testSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }
}