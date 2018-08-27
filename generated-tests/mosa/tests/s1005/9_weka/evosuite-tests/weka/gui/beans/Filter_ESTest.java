/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 20:58:27 GMT 2018
 */

package weka.gui.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.beans.EventSetDescriptor;
import java.util.Enumeration;
import javax.swing.text.DefaultEditorKit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import weka.associations.FilteredAssociator;
import weka.clusterers.SimpleKMeans;
import weka.core.BinarySparseInstance;
import weka.core.CheckOptionHandler;
import weka.core.GlobalInfoJavadoc;
import weka.core.Instances;
import weka.core.MinkowskiDistance;
import weka.core.converters.TextDirectoryLoader;
import weka.filters.MultiFilter;
import weka.filters.supervised.instance.Resample;
import weka.filters.supervised.instance.SpreadSubsample;
import weka.filters.supervised.instance.StratifiedRemoveFolds;
import weka.gui.beans.Appender;
import weka.gui.beans.AttributeSummarizer;
import weka.gui.beans.BeanVisual;
import weka.gui.beans.ClassAssigner;
import weka.gui.beans.ConfigurationListener;
import weka.gui.beans.CrossValidationFoldMaker;
import weka.gui.beans.DataSetEvent;
import weka.gui.beans.Filter;
import weka.gui.beans.InstanceEvent;
import weka.gui.beans.Loader;
import weka.gui.beans.MetaBean;
import weka.gui.beans.ModelPerformanceChart;
import weka.gui.beans.PredictionAppender;
import weka.gui.beans.ScatterPlotMatrix;
import weka.gui.beans.Sorter;
import weka.gui.beans.SubstringLabeler;
import weka.gui.beans.SubstringReplacer;
import weka.gui.beans.TestSetEvent;
import weka.gui.beans.TrainTestSplitMaker;
import weka.gui.beans.TrainingSetEvent;
import weka.gui.beans.TrainingSetListener;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Filter_ESTest extends Filter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.setVisual((BeanVisual) null);
      assertFalse(filter0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Filter filter0 = new Filter();
      // Undeclared exception!
      try { 
        filter0.setWrappedAlgorithm("[xR6jnd+:_{`]OF");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // class java.lang.String : incorrect type of algorithm (Filter)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Filter filter0 = new Filter();
      // Undeclared exception!
      try { 
        filter0.performRequest("=Yy#K x0Z[:~ZeF(d}");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // =Yy#K x0Z[:~ZeF(d} not supported (Filter)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Filter filter0 = new Filter();
      StratifiedRemoveFolds stratifiedRemoveFolds0 = new StratifiedRemoveFolds();
      filter0.setWrappedAlgorithm(stratifiedRemoveFolds0);
      assertEquals("StratifiedRemoveFolds", filter0.getCustomName());
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
      boolean boolean0 = filter0.eventGeneratable(":jr');meq9;aopn");
      assertEquals("AllFilter", filter0.getCustomName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.removeTrainingSetListener((TrainingSetListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Filter filter0 = new Filter();
      ConfigurationListener configurationListener0 = mock(ConfigurationListener.class, new ViolatedAssumptionAnswer());
      filter0.removeConfigurationListener(configurationListener0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Filter filter0 = new Filter();
      BeanVisual beanVisual0 = filter0.getVisual();
      assertEquals("weka/gui/beans/icons/DefaultFilter.gif", beanVisual0.getIconPath());
      assertEquals("AllFilter", beanVisual0.getText());
      assertEquals("weka/gui/beans/icons/DefaultFilter_animated.gif", beanVisual0.getAnimatedIconPath());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Filter filter0 = new Filter();
      Appender appender0 = new Appender();
      filter0.removeInstanceListener(appender0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Filter filter0 = new Filter();
      AttributeSummarizer attributeSummarizer0 = new AttributeSummarizer();
      filter0.addTrainingSetListener(attributeSummarizer0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.setCustomName("iy<%-~");
      assertEquals("iy<%-~", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Filter filter0 = new Filter();
      ScatterPlotMatrix scatterPlotMatrix0 = new ScatterPlotMatrix();
      filter0.removeDataSourceListener(scatterPlotMatrix0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Filter filter0 = new Filter();
      SimpleKMeans simpleKMeans0 = new SimpleKMeans();
      simpleKMeans0.getClusterStandardDevs();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(filter0, (Instances) null);
      filter0.acceptTrainingSet(trainingSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Filter filter0 = new Filter();
      MockThread mockThread0 = new MockThread("pMg/,$MgMz@");
      filter0.m_filterThread = (Thread) mockThread0;
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      filter0.acceptDataSet((DataSetEvent) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Filter filter0 = new Filter();
      TestSetEvent testSetEvent0 = new TestSetEvent(filter0, (Instances) null);
      filter0.acceptTestSet(testSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Filter filter0 = new Filter();
      InstanceEvent instanceEvent0 = new InstanceEvent(filter0);
      filter0.notifyInstanceListeners(instanceEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Filter filter0 = new Filter();
      MetaBean metaBean0 = new MetaBean();
      MockThread mockThread0 = new MockThread("p;Mg1/,Ct$MMz:@");
      filter0.m_filterThread = (Thread) mockThread0;
      Enumeration enumeration0 = filter0.enumerateRequests();
      filter0.useDefaultVisual();
      filter0.disconnectionNotification(":jr');meq9;aopn", enumeration0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.connectionNotification("hoHs%1`C{::X", "hoHs%1`C{::X");
      boolean boolean0 = filter0.eventGeneratable("hoHs%1`C{::X");
      assertTrue(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.connectionNotification("hoHs%1`C{::X", "hoHs%1`C{::X");
      filter0.acceptInstance((InstanceEvent) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.enumerateRequests();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Filter filter0 = new Filter();
      DataSetEvent dataSetEvent0 = new DataSetEvent(filter0, (Instances) null);
      filter0.acceptDataSet(dataSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Filter filter0 = new Filter();
      FileSystemHandling.shouldAllThrowIOExceptions();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getDataSet();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(instances0, instances0);
      filter0.acceptTrainingSet(trainingSetEvent0);
      SpreadSubsample spreadSubsample0 = new SpreadSubsample();
      filter0.disconnectionNotification(".arff", spreadSubsample0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Filter filter0 = new Filter();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getDataSet();
      DataSetEvent dataSetEvent0 = new DataSetEvent(filter0, instances0);
      filter0.acceptDataSet(dataSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Filter filter0 = new Filter();
      ConfigurationListener configurationListener0 = mock(ConfigurationListener.class, new ViolatedAssumptionAnswer());
      filter0.addConfigurationListener(configurationListener0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Filter filter0 = new Filter();
      MockThread mockThread0 = new MockThread();
      filter0.m_filterThread = (Thread) mockThread0;
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      InstanceEvent instanceEvent0 = substringLabeler0.m_ie;
      filter0.acceptInstance(instanceEvent0);
      assertTrue(filter0.isBusy());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Filter filter0 = new Filter();
      MultiFilter multiFilter0 = new MultiFilter();
      filter0.setFilter(multiFilter0);
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      InstanceEvent instanceEvent0 = substringLabeler0.m_ie;
      filter0.acceptInstance(instanceEvent0);
      assertEquals("MultiFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.connectionNotification("hoHs%1`C{::X", "hoHs%1`C{::X");
      boolean boolean0 = filter0.connectionAllowed("hoHs%1`C{::X");
      assertFalse(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Filter filter0 = new Filter();
      MetaBean metaBean0 = new MetaBean();
      DataSetEvent dataSetEvent0 = new DataSetEvent(filter0, (Instances) null);
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
  public void test29()  throws Throwable  {
      Filter filter0 = new Filter();
      Resample resample0 = new Resample();
      ModelPerformanceChart modelPerformanceChart0 = new ModelPerformanceChart();
      filter0.connectionNotification("6h3=BW", modelPerformanceChart0);
      ClassAssigner classAssigner0 = new ClassAssigner();
      filter0.stop();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Filter filter0 = new Filter();
      Loader loader0 = new Loader();
      loader0.getStructure(":jr');meq9;aopn");
      DataSetEvent dataSetEvent0 = new DataSetEvent(filter0, (Instances) null);
      filter0.acceptDataSet(dataSetEvent0);
      CheckOptionHandler checkOptionHandler0 = new CheckOptionHandler();
      TestSetEvent testSetEvent0 = new TestSetEvent(checkOptionHandler0, (Instances) null);
      boolean boolean0 = filter0.eventGeneratable("}");
      assertFalse(boolean0);
      
      GlobalInfoJavadoc globalInfoJavadoc0 = new GlobalInfoJavadoc();
      filter0.disconnectionNotification("YaA9{[g.;6/X'*,2", globalInfoJavadoc0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Filter filter0 = new Filter();
      weka.gui.LogPanel logPanel0 = new weka.gui.LogPanel();
      filter0.setLog(logPanel0);
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      InstanceEvent instanceEvent0 = substringLabeler0.m_ie;
      filter0.acceptInstance(instanceEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Filter filter0 = new Filter();
      TrainTestSplitMaker trainTestSplitMaker0 = new TrainTestSplitMaker();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Filter filter1 = new Filter();
      filter1.performRequest("Stop");
      String string0 = DefaultEditorKit.beginWordAction;
      assertEquals("caret-begin-word", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Filter filter0 = new Filter();
      PredictionAppender predictionAppender0 = new PredictionAppender();
      filter0.connectionNotification("hoHs%1`C{::X", filter0);
      // Undeclared exception!
      try { 
        filter0.eventGeneratable("hoHs%1`C{::X");
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Filter filter0 = new Filter();
      MetaBean metaBean0 = new MetaBean();
      filter0.connectionNotification("=", metaBean0);
      filter0.eventGeneratable("=");
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.connectionNotification("instance", "instance");
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Filter filter0 = new Filter();
      MetaBean metaBean0 = new MetaBean();
      MockThread mockThread0 = new MockThread("p;Mg1/,Ct$MMz:@");
      MockThread mockThread1 = new MockThread(mockThread0);
      filter0.m_filterThread = (Thread) mockThread1;
      filter0.isBusy();
      filter0.globalInfo();
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Filter filter0 = new Filter();
      MockThread mockThread0 = new MockThread();
      filter0.m_filterThread = (Thread) mockThread0;
      filter0.connectionAllowed("@relation");
      filter0.stop();
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Filter filter0 = new Filter();
      Filter filter1 = new Filter();
      filter0.addInstanceListener(filter1);
      SubstringReplacer substringReplacer0 = new SubstringReplacer();
      InstanceEvent instanceEvent0 = substringReplacer0.m_ie;
      filter0.notifyInstanceListeners(instanceEvent0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Filter filter0 = new Filter();
      MultiFilter multiFilter0 = new MultiFilter();
      CrossValidationFoldMaker crossValidationFoldMaker0 = new CrossValidationFoldMaker();
      filter0.removeTestSetListener(crossValidationFoldMaker0);
      filter0.setFilter(multiFilter0);
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getDataSet();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(textDirectoryLoader0, instances0);
      filter0.acceptTrainingSet(trainingSetEvent0);
      Filter filter1 = new Filter();
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.eventGeneratable("configuration");
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Filter filter0 = new Filter();
      Loader loader0 = new Loader();
      filter0.connectionNotification(")c=$'!_FRc", loader0);
      filter0.eventGeneratable(")c=$'!_FRc");
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Filter filter0 = new Filter();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getDataSet();
      TrainTestSplitMaker trainTestSplitMaker0 = new TrainTestSplitMaker();
      filter0.addDataSourceListener(trainTestSplitMaker0);
      DataSetEvent dataSetEvent0 = new DataSetEvent(trainTestSplitMaker0, instances0);
      filter0.acceptDataSet(dataSetEvent0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Filter filter0 = new Filter();
      MultiFilter multiFilter0 = new MultiFilter();
      filter0.setFilter(multiFilter0);
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      InstanceEvent instanceEvent0 = substringLabeler0.m_ie;
      instanceEvent0.setStatus((-3145));
      filter0.acceptInstance(instanceEvent0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Filter filter0 = new Filter();
      FilteredAssociator filteredAssociator0 = new FilteredAssociator();
      weka.filters.Filter filter1 = filteredAssociator0.getFilter();
      filter0.setFilter(filter1);
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      SubstringLabeler substringLabeler1 = new SubstringLabeler();
      InstanceEvent instanceEvent0 = substringLabeler1.m_ie;
      instanceEvent0.setStatus(2);
      filter0.acceptInstance(instanceEvent0);
      filter0.disconnectionNotification("@relation", substringLabeler1);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.acceptTrainingSet((TrainingSetEvent) null);
      filter0.acceptDataSet((DataSetEvent) null);
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Filter filter0 = new Filter();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getDataSet();
      TestSetEvent testSetEvent0 = new TestSetEvent(filter0, instances0);
      filter0.acceptTestSet(testSetEvent0);
      filter0.getWrappedAlgorithm();
      Sorter sorter0 = new Sorter();
      filter0.addTestSetListener(sorter0);
      filter0.getCustomName();
      filter0.acceptTestSet(testSetEvent0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.connectionNotification("trainingSet", "dk");
      filter0.connectionNotification("dk", "trainingSet");
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.connectionNotification("trainingSet", "dk");
      System.setCurrentTimeMillis(2740L);
      filter0.connectionNotification("dataSet", "trainingSet");
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Filter filter0 = new Filter();
      MinkowskiDistance minkowskiDistance0 = new MinkowskiDistance();
      filter0.connectionNotification("dataSet", minkowskiDistance0);
      filter0.connectionAllowed("?@");
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Filter filter0 = new Filter();
      MultiFilter multiFilter0 = new MultiFilter();
      filter0.setFilter(multiFilter0);
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      InstanceEvent instanceEvent0 = substringLabeler0.m_ie;
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 1;
      doubleArray0[2] = (double) (-3145);
      doubleArray0[3] = (double) 1;
      doubleArray0[4] = (double) 1;
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(3315.48, doubleArray0);
      instanceEvent0.setInstance(binarySparseInstance0);
      instanceEvent0.setStatus((-3145));
      filter0.acceptInstance(instanceEvent0);
  }
}
