/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 20:48:06 GMT 2019
 */

package weka.gui.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.beans.EventSetDescriptor;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.junit.runner.RunWith;
import weka.classifiers.meta.MultiScheme;
import weka.core.Attribute;
import weka.core.BinarySparseInstance;
import weka.core.Capabilities;
import weka.core.CheckGOE;
import weka.core.FindWithCapabilities;
import weka.core.GlobalInfoJavadoc;
import weka.core.Instances;
import weka.core.TestInstances;
import weka.core.converters.TextDirectoryLoader;
import weka.filters.MultiFilter;
import weka.filters.supervised.attribute.ClassOrder;
import weka.filters.supervised.instance.SpreadSubsample;
import weka.filters.supervised.instance.StratifiedRemoveFolds;
import weka.filters.unsupervised.attribute.Add;
import weka.gui.Logger;
import weka.gui.SysErrLog;
import weka.gui.beans.Appender;
import weka.gui.beans.Associator;
import weka.gui.beans.BeanVisual;
import weka.gui.beans.Classifier;
import weka.gui.beans.ConfigurationListener;
import weka.gui.beans.DataSetEvent;
import weka.gui.beans.Filter;
import weka.gui.beans.FlowByExpression;
import weka.gui.beans.ImageSaver;
import weka.gui.beans.InstanceEvent;
import weka.gui.beans.InstanceStreamToBatchMaker;
import weka.gui.beans.Saver;
import weka.gui.beans.ScatterPlotMatrix;
import weka.gui.beans.Sorter;
import weka.gui.beans.SubstringLabeler;
import weka.gui.beans.SubstringReplacer;
import weka.gui.beans.TestSetEvent;
import weka.gui.beans.TestSetListener;
import weka.gui.beans.TestSetMaker;
import weka.gui.beans.TrainingSetEvent;
import weka.gui.beans.TrainingSetListener;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Filter_ESTest extends Filter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.setLog((Logger) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Filter filter0 = new Filter();
      assertEquals("AllFilter", filter0.getCustomName());
      
      filter0.setCustomName("");
      String string0 = filter0.getCustomName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Filter filter0 = new Filter();
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
  public void test03()  throws Throwable  {
      Filter filter0 = new Filter();
      double[] doubleArray0 = new double[8];
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(128.049571260201, doubleArray0);
      InstanceEvent instanceEvent0 = new InstanceEvent(filter0, binarySparseInstance0, 150);
      filter0.notifyInstanceListeners(instanceEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.disconnectionNotification("Finished.", "Finished.");
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Filter filter0 = new Filter();
      boolean boolean0 = filter0.connectionAllowed("");
      assertTrue(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.addTrainingSetListener((TrainingSetListener) null);
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
      filter0.acceptTrainingSet((TrainingSetEvent) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Filter filter0 = new Filter();
      ScatterPlotMatrix scatterPlotMatrix0 = new ScatterPlotMatrix();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getDataSet();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(scatterPlotMatrix0, instances0);
      filter0.acceptTrainingSet(trainingSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Filter filter0 = new Filter();
      MultiScheme multiScheme0 = new MultiScheme();
      Capabilities capabilities0 = new Capabilities(multiScheme0);
      TestInstances testInstances0 = TestInstances.forCapabilities(capabilities0);
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(testInstances0, (Instances) null, 2364, (-2), (-73), (-73));
      filter0.acceptTrainingSet(trainingSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Filter filter0 = new Filter();
      CheckGOE checkGOE0 = new CheckGOE();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getDataSet();
      TestSetEvent testSetEvent0 = new TestSetEvent(checkGOE0, instances0);
      filter0.acceptTestSet(testSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Filter filter0 = new Filter();
      TestSetEvent testSetEvent0 = new TestSetEvent(filter0, (Instances) null, (-37), (-37));
      testSetEvent0.m_maxRunNumber = 150;
      testSetEvent0.m_maxRunNumber = (-37);
      filter0.acceptTestSet(testSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Filter filter0 = new Filter();
      InstanceEvent instanceEvent0 = new InstanceEvent(filter0);
      instanceEvent0.setStatus((-2331));
      filter0.acceptInstance(instanceEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
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
  public void test15()  throws Throwable  {
      Filter filter0 = new Filter();
      // Undeclared exception!
      try { 
        filter0.performRequest((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Filter filter0 = new Filter();
      // Undeclared exception!
      try { 
        filter0.disconnectionNotification((String) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Hashtable", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.stop();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.connectionNotification(" Error in obtaining post-filter structure", " Error in obtaining post-filter structure");
      boolean boolean0 = filter0.connectionAllowed(" Error in obtaining post-filter structure");
      assertEquals("AllFilter", filter0.getCustomName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Filter filter0 = new Filter();
      StratifiedRemoveFolds stratifiedRemoveFolds0 = new StratifiedRemoveFolds();
      filter0.setFilter(stratifiedRemoveFolds0);
      assertEquals("StratifiedRemoveFolds", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Filter filter0 = new Filter();
      Associator associator0 = new Associator();
      filter0.connectionNotification(" WARNING : ", associator0);
      boolean boolean0 = filter0.eventGeneratable(" WARNING : ");
      assertTrue(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.connectionNotification("7Wii^jyy&U6w6HN>(K.", "7Wii^jyy&U6w6HN>(K.");
      boolean boolean0 = filter0.eventGeneratable("7Wii^jyy&U6w6HN>(K.");
      assertEquals("AllFilter", filter0.getCustomName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Filter filter0 = new Filter();
      SubstringReplacer substringReplacer0 = new SubstringReplacer();
      filter0.connectionNotification("(jTQ+v", substringReplacer0);
      boolean boolean0 = filter0.eventGeneratable("(jTQ+v");
      assertEquals("AllFilter", filter0.getCustomName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Filter filter0 = new Filter();
      boolean boolean0 = filter0.eventGeneratable("configuration");
      assertEquals("AllFilter", filter0.getCustomName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Filter filter0 = new Filter();
      boolean boolean0 = filter0.eventGeneratable("SR|?b");
      assertEquals("AllFilter", filter0.getCustomName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Filter filter0 = new Filter();
      // Undeclared exception!
      try { 
        filter0.performRequest("jh`zK;WUbfH");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // jh`zK;WUbfH not supported (Filter)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Filter filter0 = new Filter();
      MockThread mockThread0 = new MockThread();
      filter0.m_filterThread = (Thread) mockThread0;
      filter0.enumerateRequests();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.enumerateRequests();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Filter filter0 = new Filter();
      MockThread mockThread0 = new MockThread();
      filter0.m_filterThread = (Thread) mockThread0;
      boolean boolean0 = filter0.isBusy();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Filter filter0 = new Filter();
      boolean boolean0 = filter0.isBusy();
      assertEquals("AllFilter", filter0.getCustomName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Filter filter0 = new Filter();
      MockThread mockThread0 = new MockThread();
      filter0.m_filterThread = (Thread) mockThread0;
      filter0.stop();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.connectionNotification("<html><font color=blue>An instance filter that passes all instances through unmodified</font><br><br> Primarily for testing purposes.<br></html>", "<html><font color=blue>An instance filter that passes all instances through unmodified</font><br><br> Primarily for testing purposes.<br></html>");
      Saver saver0 = new Saver();
      InstanceEvent instanceEvent0 = new InstanceEvent(saver0);
      filter0.acceptInstance(instanceEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Filter filter0 = new Filter();
      Sorter sorter0 = new Sorter();
      filter0.connectionNotification("-tabs", sorter0);
      InstanceEvent instanceEvent0 = new InstanceEvent(filter0, (Instances) null);
      filter0.acceptInstance(instanceEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Filter filter0 = new Filter();
      ImageSaver imageSaver0 = new ImageSaver();
      filter0.disconnectionNotification("", imageSaver0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Filter filter0 = new Filter();
      InstanceStreamToBatchMaker instanceStreamToBatchMaker0 = new InstanceStreamToBatchMaker();
      filter0.connectionNotification("instance", instanceStreamToBatchMaker0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Filter filter0 = new Filter();
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      filter0.connectionNotification("testSet", findWithCapabilities0);
      boolean boolean0 = filter0.connectionAllowed("5d5^(ReN=m#");
      assertEquals("AllFilter", filter0.getCustomName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Filter filter0 = new Filter();
      FlowByExpression flowByExpression0 = new FlowByExpression();
      filter0.addInstanceListener(flowByExpression0);
      GlobalInfoJavadoc globalInfoJavadoc0 = new GlobalInfoJavadoc();
      InstanceEvent instanceEvent0 = new InstanceEvent(globalInfoJavadoc0);
      filter0.notifyInstanceListeners(instanceEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.notifyInstanceListeners((InstanceEvent) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Filter filter0 = new Filter();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("r]'6.kt{HJvsy!D", arrayList0, 447);
      TestSetEvent testSetEvent0 = new TestSetEvent(instances0, instances0, (-4511), 447, 2, 2);
      filter0.addTestSetListener((TestSetListener) null);
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
  public void test39()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.acceptDataSet((DataSetEvent) null);
      filter0.acceptDataSet((DataSetEvent) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Filter filter0 = new Filter();
      Thread thread0 = MockThread.currentThread();
      filter0.m_filterThread = thread0;
      filter0.acceptDataSet((DataSetEvent) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Filter filter0 = new Filter();
      TestSetMaker testSetMaker0 = new TestSetMaker();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getStructure();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(testSetMaker0, instances0, 1252, (-2));
      filter0.acceptTrainingSet(trainingSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Filter filter0 = new Filter();
      StratifiedRemoveFolds stratifiedRemoveFolds0 = new StratifiedRemoveFolds();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getStructure();
      DataSetEvent dataSetEvent0 = new DataSetEvent(stratifiedRemoveFolds0, instances0);
      filter0.acceptDataSet(dataSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Filter filter0 = new Filter();
      SysErrLog sysErrLog0 = new SysErrLog();
      filter0.setLog(sysErrLog0);
      SubstringReplacer substringReplacer0 = new SubstringReplacer();
      InstanceEvent instanceEvent0 = substringReplacer0.m_ie;
      filter0.acceptInstance(instanceEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Filter filter0 = new Filter();
      Add add0 = new Add();
      filter0.setFilter(add0);
      Appender appender0 = new Appender();
      InstanceEvent instanceEvent0 = appender0.m_ie;
      filter0.acceptInstance(instanceEvent0);
      assertEquals("Add", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Filter filter0 = new Filter();
      MockThread mockThread0 = new MockThread("a");
      filter0.m_filterThread = (Thread) mockThread0;
      InstanceEvent instanceEvent0 = new InstanceEvent(filter0);
      filter0.acceptInstance(instanceEvent0);
      assertTrue(filter0.isBusy());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.acceptInstance((InstanceEvent) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Filter filter0 = new Filter();
      // Undeclared exception!
      try { 
        filter0.setWrappedAlgorithm(filter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // class weka.gui.beans.Filter : incorrect type of algorithm (Filter)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Filter filter0 = new Filter();
      MultiFilter multiFilter0 = new MultiFilter();
      filter0.setFilter(multiFilter0);
      assertEquals("MultiFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Filter filter0 = new Filter();
      SpreadSubsample spreadSubsample0 = new SpreadSubsample();
      filter0.setWrappedAlgorithm(spreadSubsample0);
      assertEquals("SpreadSubsample", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Filter filter0 = new Filter();
      ClassOrder classOrder0 = new ClassOrder();
      DataSetEvent dataSetEvent0 = new DataSetEvent(classOrder0, (Instances) null);
      filter0.acceptDataSet(dataSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.getWrappedAlgorithm();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Filter filter0 = new Filter();
      String string0 = filter0.getCustomName();
      assertEquals("AllFilter", string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
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
  public void test54()  throws Throwable  {
      Filter filter0 = new Filter();
      Sorter sorter0 = new Sorter();
      filter0.removeInstanceListener(sorter0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Filter filter0 = new Filter();
      String string0 = filter0.globalInfo();
      assertEquals("AllFilter", filter0.getCustomName());
      assertEquals("<html><font color=blue>An instance filter that passes all instances through unmodified</font><br><br> Primarily for testing purposes.<br></html>", string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.removeConfigurationListener((ConfigurationListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Filter filter0 = new Filter();
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      filter0.removeTestSetListener(substringLabeler0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Filter filter0 = new Filter();
      ConfigurationListener configurationListener0 = mock(ConfigurationListener.class, new ViolatedAssumptionAnswer());
      filter0.addConfigurationListener(configurationListener0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Filter filter0 = new Filter();
      BeanVisual beanVisual0 = filter0.getVisual();
      assertEquals("AllFilter", beanVisual0.getText());
      assertEquals("weka/gui/beans/icons/DefaultFilter.gif", beanVisual0.getIconPath());
      assertEquals("weka/gui/beans/icons/DefaultFilter_animated.gif", beanVisual0.getAnimatedIconPath());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.getFilter();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.setCustomName("Finished.");
      assertEquals("Finished.", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Filter filter0 = new Filter();
      Saver saver0 = new Saver();
      filter0.addInstanceListener(saver0);
      Appender appender0 = new Appender();
      InstanceEvent instanceEvent0 = appender0.m_ie;
      // Undeclared exception!
      try { 
        filter0.notifyInstanceListeners(instanceEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.gui.beans.Saver", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Filter filter0 = new Filter();
      Associator associator0 = new Associator();
      BeanVisual beanVisual0 = associator0.m_visual;
      filter0.setVisual(beanVisual0);
      assertEquals("Apriori", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Filter filter0 = new Filter();
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      filter0.addDataSourceListener(substringLabeler0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Filter filter0 = new Filter();
      ScatterPlotMatrix scatterPlotMatrix0 = new ScatterPlotMatrix();
      filter0.removeDataSourceListener(scatterPlotMatrix0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Filter filter0 = new Filter();
      Classifier classifier0 = new Classifier();
      filter0.removeTrainingSetListener(classifier0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.useDefaultVisual();
      assertEquals("AllFilter", filter0.getCustomName());
  }
}
