/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 19:27:26 GMT 2018
 */

package weka.gui.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.beans.EventSetDescriptor;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import weka.associations.FilteredAssociator;
import weka.core.BinarySparseInstance;
import weka.core.CheckOptionHandler;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.ListOptions;
import weka.core.SparseInstance;
import weka.core.converters.TextDirectoryLoader;
import weka.filters.supervised.attribute.Discretize;
import weka.filters.unsupervised.attribute.Add;
import weka.gui.beans.Appender;
import weka.gui.beans.AttributeSummarizer;
import weka.gui.beans.BeanVisual;
import weka.gui.beans.ClassAssigner;
import weka.gui.beans.ClassValuePicker;
import weka.gui.beans.ConfigurationListener;
import weka.gui.beans.CrossValidationFoldMaker;
import weka.gui.beans.DataSetEvent;
import weka.gui.beans.Filter;
import weka.gui.beans.FlowByExpression;
import weka.gui.beans.InstanceEvent;
import weka.gui.beans.MetaBean;
import weka.gui.beans.PredictionAppender;
import weka.gui.beans.ScatterPlotMatrix;
import weka.gui.beans.SerializedModelSaver;
import weka.gui.beans.Sorter;
import weka.gui.beans.TestSetEvent;
import weka.gui.beans.TextViewer;
import weka.gui.beans.TrainTestSplitMaker;
import weka.gui.beans.TrainingSetEvent;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Filter_ESTest extends Filter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.disconnectionNotification(" is not an incremental filter", " is not an incremental filter");
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Filter filter0 = new Filter();
      DataSetEvent dataSetEvent0 = new DataSetEvent(filter0, (Instances) null);
      filter0.acceptDataSet(dataSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
      
      filter0.getWrappedAlgorithm();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.acceptTrainingSet((TrainingSetEvent) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Filter filter0 = new Filter();
      Integer integer0 = JLayeredPane.MODAL_LAYER;
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(integer0, (Instances) null, (-691), (-691));
      filter0.acceptTrainingSet(trainingSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Filter filter0 = new Filter();
      boolean boolean0 = filter0.isBusy();
      assertFalse(boolean0);
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
      ConfigurationListener configurationListener0 = mock(ConfigurationListener.class, new ViolatedAssumptionAnswer());
      filter0.addConfigurationListener(configurationListener0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Filter filter0 = new Filter();
      ScatterPlotMatrix scatterPlotMatrix0 = new ScatterPlotMatrix();
      filter0.removeTestSetListener(scatterPlotMatrix0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Filter filter0 = new Filter();
      ClassAssigner classAssigner0 = new ClassAssigner();
      filter0.removeInstanceListener(classAssigner0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.addTrainingSetListener(filter0);
      filter0.getWrappedAlgorithm();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Filter filter0 = new Filter();
      boolean boolean0 = filter0.eventGeneratable("<!-- options-end -->");
      assertFalse(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Filter filter0 = new Filter();
      BeanVisual beanVisual0 = filter0.getVisual();
      assertEquals("AllFilter", beanVisual0.getText());
      assertEquals("weka/gui/beans/icons/DefaultFilter.gif", beanVisual0.getIconPath());
      assertEquals("weka/gui/beans/icons/DefaultFilter_animated.gif", beanVisual0.getAnimatedIconPath());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Filter filter0 = new Filter();
      ClassValuePicker classValuePicker0 = new ClassValuePicker();
      classValuePicker0.getConnectedFormat();
      TestSetEvent testSetEvent0 = new TestSetEvent(filter0, (Instances) null);
      filter0.acceptTestSet(testSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Filter filter0 = new Filter();
      BeanVisual beanVisual0 = filter0.m_visual;
      filter0.setVisual(beanVisual0);
      assertEquals("weka/gui/beans/icons/DefaultFilter.gif", beanVisual0.getIconPath());
      assertEquals("AllFilter", beanVisual0.getText());
      assertEquals("weka/gui/beans/icons/DefaultFilter_animated.gif", beanVisual0.getAnimatedIconPath());
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Filter filter0 = new Filter();
      Sorter sorter0 = new Sorter();
      filter0.addTestSetListener(sorter0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Filter filter0 = new Filter();
      // Undeclared exception!
      try { 
        filter0.performRequest("R");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // R not supported (Filter)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Filter filter0 = new Filter();
      ConfigurationListener configurationListener0 = mock(ConfigurationListener.class, new ViolatedAssumptionAnswer());
      filter0.removeConfigurationListener(configurationListener0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Filter filter0 = new Filter();
      String string0 = filter0.globalInfo();
      assertEquals("<html><font color=blue>An instance filter that passes all instances through unmodified</font><br><br> Primarily for testing purposes.<br></html>", string0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.enumerateRequests();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.acceptDataSet((DataSetEvent) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Filter filter0 = new Filter();
      CheckOptionHandler checkOptionHandler0 = new CheckOptionHandler();
      filter0.connectionNotification("Can only handle numeric or nominal attributes.", "Can only handle numeric or nominal attributes.");
      filter0.stop();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Filter filter0 = new Filter();
      SerializedModelSaver serializedModelSaver0 = new SerializedModelSaver();
      filter0.connectionNotification("dataSet", serializedModelSaver0);
      Appender appender0 = new Appender();
      InstanceEvent instanceEvent0 = appender0.m_ie;
      filter0.acceptInstance(instanceEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.connectionNotification("java.util.LinkedHashMap", "java.util.LinkedHashMap");
      boolean boolean0 = filter0.eventGeneratable("java.util.LinkedHashMap");
      assertTrue(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Filter filter0 = new Filter();
      TrainTestSplitMaker trainTestSplitMaker0 = new TrainTestSplitMaker();
      filter0.connectionNotification("jgv.util.LinkedHashLap", trainTestSplitMaker0);
      boolean boolean0 = filter0.eventGeneratable("jgv.util.LinkedHashLap");
      assertFalse(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Filter filter0 = new Filter();
      // Undeclared exception!
      try { 
        filter0.setWrappedAlgorithm("\n]mLr");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // class java.lang.String : incorrect type of algorithm (Filter)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
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
      Filter filter0 = new Filter();
      FilteredAssociator filteredAssociator0 = new FilteredAssociator();
      weka.filters.Filter filter1 = filteredAssociator0.getFilter();
      filter0.setFilter(filter1);
      assertEquals("MultiFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Filter filter0 = new Filter();
      boolean boolean0 = filter0.eventGeneratable("configuration");
      assertTrue(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Filter filter0 = new Filter();
      SerializedModelSaver serializedModelSaver0 = new SerializedModelSaver();
      filter0.connectionNotification("dataSet", serializedModelSaver0);
      filter0.connectionNotification("model", serializedModelSaver0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Filter filter0 = new Filter();
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      filter0.connectionNotification("instance", mockMinguoDate0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Filter filter0 = new Filter();
      SerializedModelSaver serializedModelSaver0 = new SerializedModelSaver();
      filter0.connectionNotification("trainingSet", serializedModelSaver0);
      filter0.connectionNotification("trainingSet", "trainingSet");
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.notifyInstanceListeners((InstanceEvent) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Filter filter0 = new Filter();
      CheckOptionHandler checkOptionHandler0 = new CheckOptionHandler();
      ClassAssigner classAssigner0 = new ClassAssigner();
      filter0.connectionNotification("~h$8XZ", classAssigner0);
      boolean boolean0 = filter0.eventGeneratable("~h$8XZ");
      assertTrue(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.getWrappedAlgorithm();
      filter0.resetKeyboardActions();
      Discretize discretize0 = new Discretize();
      filter0.setWrappedAlgorithm(discretize0);
      assertEquals("Discretize", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Filter filter0 = new Filter();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getDataSet();
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(instances0, instances0, (-1711), (-1711));
      filter0.acceptTrainingSet(trainingSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Filter filter0 = new Filter();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getDataSet();
      DataSetEvent dataSetEvent0 = new DataSetEvent(textDirectoryLoader0, instances0);
      filter0.acceptDataSet(dataSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Filter filter0 = new Filter();
      weka.gui.LogPanel logPanel0 = new weka.gui.LogPanel();
      filter0.setLog(logPanel0);
      Appender appender0 = new Appender();
      InstanceEvent instanceEvent0 = appender0.m_ie;
      filter0.acceptInstance(instanceEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getDataSet();
      TestSetEvent testSetEvent0 = new TestSetEvent(textDirectoryLoader0, instances0, (-919), (-919));
      Filter filter0 = new Filter();
      filter0.acceptTestSet(testSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Filter filter0 = new Filter();
      Add add0 = new Add();
      filter0.setFilter(add0);
      Appender appender0 = new Appender();
      InstanceEvent instanceEvent0 = appender0.m_ie;
      filter0.acceptInstance(instanceEvent0);
      assertEquals("Add", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Filter filter0 = new Filter();
      Add add0 = new Add();
      filter0.setFilter(add0);
      Appender appender0 = new Appender();
      InstanceEvent instanceEvent0 = appender0.m_ie;
      InstanceEvent instanceEvent1 = new InstanceEvent(instanceEvent0, (Instance) null, (-1284));
      filter0.acceptInstance(instanceEvent1);
      assertEquals("Add", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Filter filter0 = new Filter();
      Add add0 = new Add();
      filter0.setFilter(add0);
      double[] doubleArray0 = new double[4];
      int[] intArray0 = new int[0];
      filter0.getHierarchyListeners();
      SparseInstance sparseInstance0 = new SparseInstance(0.0, doubleArray0, intArray0, (-267));
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance((Instance) sparseInstance0);
      InstanceEvent instanceEvent0 = new InstanceEvent(sparseInstance0, binarySparseInstance0, 1);
      filter0.acceptInstance(instanceEvent0);
      assertEquals("Add", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Filter filter0 = new Filter();
      Add add0 = new Add();
      filter0.setFilter(add0);
      filter0.setCustomName("instance");
      CrossValidationFoldMaker crossValidationFoldMaker0 = new CrossValidationFoldMaker();
      MetaBean metaBean0 = new MetaBean();
      filter0.connectionNotification("instance", metaBean0);
      assertEquals("instance", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Filter filter0 = new Filter();
      FlowByExpression flowByExpression0 = new FlowByExpression();
      Filter filter1 = new Filter();
      filter1.addInstanceListener(filter0);
      filter1.removeTrainingSetListener(flowByExpression0);
      PredictionAppender predictionAppender0 = new PredictionAppender();
      InstanceEvent instanceEvent0 = flowByExpression0.m_ie;
      filter1.notifyInstanceListeners(instanceEvent0);
      assertEquals("AllFilter", filter1.getCustomName());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Filter filter0 = new Filter();
      SerializedModelSaver serializedModelSaver0 = new SerializedModelSaver();
      filter0.connectionNotification("trainingSet", "trainingSet");
      filter0.connectionNotification("model", "trainingSet");
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Filter filter0 = new Filter();
      TextViewer textViewer0 = new TextViewer();
      filter0.addDataSourceListener(textViewer0);
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getDataSet();
      DataSetEvent dataSetEvent0 = new DataSetEvent(textDirectoryLoader0, instances0);
      filter0.acceptDataSet(dataSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Filter filter0 = new Filter();
      SerializedModelSaver serializedModelSaver0 = new SerializedModelSaver();
      filter0.connectionNotification("trainingSet", serializedModelSaver0);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      AttributeSummarizer attributeSummarizer0 = new AttributeSummarizer();
      attributeSummarizer0.setGridWidth(40);
      filter0.connectionNotification("dataSet", (Object) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Filter filter0 = new Filter();
      Add add0 = new Add();
      filter0.setFilter(add0);
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getDataSet();
      ListOptions listOptions0 = new ListOptions();
      DataSetEvent dataSetEvent0 = new DataSetEvent(listOptions0, instances0);
      filter0.acceptDataSet(dataSetEvent0);
      assertFalse(filter0.isFocusCycleRoot());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.getDebugGraphicsOptions();
      ListOptions listOptions0 = new ListOptions();
      DataSetEvent dataSetEvent0 = new DataSetEvent(listOptions0, (Instances) null);
      filter0.acceptDataSet(dataSetEvent0);
  }
}