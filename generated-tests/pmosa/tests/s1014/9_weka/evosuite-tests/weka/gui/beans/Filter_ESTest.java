/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 05:27:36 GMT 2018
 */

package weka.gui.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.AWTEventMulticaster;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Graphics;
import java.awt.PopupMenu;
import java.awt.Rectangle;
import java.awt.Scrollbar;
import java.awt.color.ICC_Profile;
import java.awt.event.ComponentListener;
import java.awt.event.ContainerListener;
import java.awt.event.HierarchyBoundsListener;
import java.awt.event.InputMethodListener;
import java.awt.event.MouseWheelListener;
import java.beans.EventSetDescriptor;
import java.beans.MethodDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.Action;
import javax.swing.DebugGraphics;
import javax.swing.InputVerifier;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JWindow;
import javax.swing.KeyStroke;
import javax.swing.TransferHandler;
import javax.swing.plaf.basic.BasicComboBoxEditor;
import javax.swing.text.DefaultEditorKit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import weka.associations.FilteredAssociator;
import weka.classifiers.bayes.BayesNet;
import weka.clusterers.FilteredClusterer;
import weka.clusterers.MakeDensityBasedClusterer;
import weka.clusterers.SimpleKMeans;
import weka.core.Attribute;
import weka.core.BinarySparseInstance;
import weka.core.Capabilities;
import weka.core.ChebyshevDistance;
import weka.core.CheckOptionHandler;
import weka.core.DenseInstance;
import weka.core.Instances;
import weka.core.ListOptions;
import weka.core.OptionHandlerJavadoc;
import weka.core.TestInstances;
import weka.core.converters.DatabaseLoader;
import weka.core.converters.LibSVMLoader;
import weka.core.converters.TextDirectoryLoader;
import weka.core.neighboursearch.CoverTree;
import weka.filters.AllFilter;
import weka.filters.supervised.attribute.Discretize;
import weka.filters.supervised.instance.Resample;
import weka.filters.supervised.instance.SpreadSubsample;
import weka.filters.supervised.instance.StratifiedRemoveFolds;
import weka.filters.unsupervised.attribute.Add;
import weka.gui.Logger;
import weka.gui.beans.Appender;
import weka.gui.beans.Associator;
import weka.gui.beans.AttributeSummarizer;
import weka.gui.beans.BeanVisual;
import weka.gui.beans.ClassAssigner;
import weka.gui.beans.Classifier;
import weka.gui.beans.ConfigurationListener;
import weka.gui.beans.CostBenefitAnalysis;
import weka.gui.beans.CrossValidationFoldMaker;
import weka.gui.beans.DataSetEvent;
import weka.gui.beans.DataVisualizer;
import weka.gui.beans.Filter;
import weka.gui.beans.FlowByExpression;
import weka.gui.beans.IncrementalClassifierEvaluator;
import weka.gui.beans.InstanceEvent;
import weka.gui.beans.Loader;
import weka.gui.beans.MetaBean;
import weka.gui.beans.ModelPerformanceChart;
import weka.gui.beans.PredictionAppender;
import weka.gui.beans.Saver;
import weka.gui.beans.ScatterPlotMatrix;
import weka.gui.beans.Sorter;
import weka.gui.beans.SubstringLabeler;
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
      Add add0 = new Add();
      filter0.setFilter(add0);
      FlowByExpression flowByExpression0 = new FlowByExpression();
      ComponentListener componentListener0 = null;
      try { 
        MockURI.URI("%$/Y", "%$/Y", "", "Cj[ZyN_Yh@*|~RS");
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Malformed escape pair at index 0: %$/Y://%$/Y#Cj[ZyN_Yh@*%7C~RS
         //
         verifyException("java.net.URI$Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Filter filter0 = new Filter();
      TextViewer textViewer0 = new TextViewer();
      filter0.addTestSetListener(textViewer0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.connectionNotification("j2](/D", "j2](/D");
      Discretize discretize0 = new Discretize();
      filter0.setWrappedAlgorithm(discretize0);
      assertEquals("Discretize", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Filter filter0 = new Filter();
      DataVisualizer dataVisualizer0 = new DataVisualizer();
      filter0.revalidate();
      filter0.addTrainingSetListener(dataVisualizer0);
      ComponentListener componentListener0 = mock(ComponentListener.class, new ViolatedAssumptionAnswer());
      ComponentListener componentListener1 = AWTEventMulticaster.add(componentListener0, componentListener0);
      AWTEventMulticaster.remove(componentListener1, componentListener1);
      filter0.removeComponentListener((ComponentListener) null);
      filter0.getFocusListeners();
      filter0.getFilter();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Filter filter0 = new Filter();
      FlowByExpression flowByExpression0 = new FlowByExpression();
      filter0.removeTestSetListener(flowByExpression0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.enumerateRequests();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Filter filter0 = new Filter();
      ConfigurationListener configurationListener0 = mock(ConfigurationListener.class, new ViolatedAssumptionAnswer());
      filter0.addConfigurationListener(configurationListener0);
      Saver saver0 = new Saver();
      MouseWheelListener mouseWheelListener0 = mock(MouseWheelListener.class, new ViolatedAssumptionAnswer());
      filter0.enumerateRequests();
      MouseWheelListener mouseWheelListener1 = AWTEventMulticaster.add(mouseWheelListener0, mouseWheelListener0);
      DefaultEditorKit.DefaultKeyTypedAction defaultEditorKit_DefaultKeyTypedAction0 = new DefaultEditorKit.DefaultKeyTypedAction();
      JCheckBoxMenuItem jCheckBoxMenuItem0 = new JCheckBoxMenuItem(defaultEditorKit_DefaultKeyTypedAction0);
      jCheckBoxMenuItem0.getAccelerator();
      saver0.unregisterKeyboardAction((KeyStroke) null);
      AWTEventMulticaster.remove(mouseWheelListener1, mouseWheelListener1);
      saver0.m_globalInfo = null;
      filter0.setFocusTraversalPolicyProvider(false);
      saver0.removeMouseWheelListener((MouseWheelListener) null);
      saver0.addNotify();
      filter0.transferFocusUpCycle();
      // Undeclared exception!
      try { 
        filter0.setWrappedAlgorithm(saver0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // class weka.gui.beans.Saver : incorrect type of algorithm (Filter)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.getWrappedAlgorithm();
      TestSetMaker testSetMaker0 = new TestSetMaker();
      // Undeclared exception!
      try { 
        filter0.setWrappedAlgorithm(testSetMaker0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // class weka.gui.beans.TestSetMaker : incorrect type of algorithm (Filter)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Filter filter0 = new Filter();
      ClassAssigner classAssigner0 = new ClassAssigner();
      BeanVisual beanVisual0 = classAssigner0.m_visual;
      beanVisual0.getVetoableChangeListeners();
      beanVisual0.getComponentListeners();
      classAssigner0.setLocation(350, 0);
      filter0.setVisual(beanVisual0);
      filter0.addTestSetListener(classAssigner0);
      String string0 = "=H\\Tt'~";
      // Undeclared exception!
      try { 
        filter0.performRequest("=HTt'~");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // =HTt'~ not supported (Filter)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Filter filter0 = new Filter();
      AllFilter allFilter0 = new AllFilter();
      // Undeclared exception!
      try { 
        filter0.performRequest("Relation Name:  ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Relation Name:   not supported (Filter)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Filter filter0 = new Filter();
      boolean boolean0 = filter0.isBusy();
      assertFalse(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Filter filter0 = new Filter();
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      InstanceEvent instanceEvent0 = substringLabeler0.m_ie;
      filter0.acceptInstance(instanceEvent0);
      filter0.removeDataSourceListener(substringLabeler0);
      CrossValidationFoldMaker crossValidationFoldMaker0 = new CrossValidationFoldMaker();
      CoverTree coverTree0 = new CoverTree();
      BinarySparseInstance binarySparseInstance0 = null;
      try {
        binarySparseInstance0 = new BinarySparseInstance(0.0, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.BinarySparseInstance", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.isPaintingForPrint();
      boolean boolean0 = filter0.eventGeneratable("++7maJ,v\"c4$");
      assertEquals("AllFilter", filter0.getCustomName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Filter filter0 = new Filter();
      String string0 = "a/$ J@E~C-A`";
      filter0.eventGeneratable("a/$ J@E~C-A`");
      TrainingSetMaker trainingSetMaker0 = new TrainingSetMaker();
      ChebyshevDistance chebyshevDistance0 = new ChebyshevDistance();
      chebyshevDistance0.getTechnicalInformation();
      // Undeclared exception!
      try { 
        trainingSetMaker0.add((Component) filter0, (Object) chebyshevDistance0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot add to layout: constraint must be a string (or null)
         //
         verifyException("java.awt.BorderLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Filter filter0 = new Filter();
      PredictionAppender predictionAppender0 = new PredictionAppender();
      InstanceEvent instanceEvent0 = predictionAppender0.m_instanceEvent;
      filter0.notifyInstanceListeners((InstanceEvent) null);
      filter0.disconnectionNotification("st7)@:f", "st7)@:f");
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.grabFocus();
      Classifier classifier0 = new Classifier();
      Rectangle rectangle0 = new Rectangle(450, 450, 450, 450);
      rectangle0.add(1447.814919263343, (double) 450);
      classifier0.repaint(rectangle0);
      filter0.addTrainingSetListener(classifier0);
      String string0 = filter0.globalInfo();
      assertEquals("<html><font color=blue>An instance filter that passes all instances through unmodified</font><br><br> Primarily for testing purposes.<br></html>", string0);
      
      filter0.getWrappedAlgorithm();
      boolean boolean0 = filter0.isBusy();
      assertFalse(boolean0);
      
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      InstanceEvent instanceEvent0 = substringLabeler0.m_ie;
      filter0.acceptInstance(instanceEvent0);
      Loader loader0 = new Loader();
      filter0.disconnectionNotification("D0[", loader0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Filter filter0 = new Filter();
      AWTEventMulticaster.remove((ContainerListener) null, (ContainerListener) null);
      filter0.addContainerListener((ContainerListener) null);
      filter0.setCustomName((String) null);
      assertFalse(filter0.isBusy());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Filter filter0 = new Filter();
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      substringLabeler0.addHierarchyBoundsListener((HierarchyBoundsListener) null);
      InstanceEvent instanceEvent0 = substringLabeler0.m_ie;
      ClassifierErrorsPlotInstances classifierErrorsPlotInstances0 = new ClassifierErrorsPlotInstances();
      classifierErrorsPlotInstances0.getInstances();
      instanceEvent0.setStructure((Instances) null);
      ConfigurationListener configurationListener0 = mock(ConfigurationListener.class, new ViolatedAssumptionAnswer());
      filter0.addConfigurationListener(configurationListener0);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, ".arff");
      Classifier classifier0 = new Classifier();
      filter0.removeInstanceListener(substringLabeler0);
      Resample resample0 = new Resample();
      Filter filter1 = new Filter();
      SpreadSubsample spreadSubsample0 = new SpreadSubsample();
      filter1.setWrappedAlgorithm(spreadSubsample0);
      assertEquals("SpreadSubsample", filter1.getCustomName());
      
      filter0.getCustomName();
      TestSetEvent testSetEvent0 = new TestSetEvent(resample0, (Instances) null, 0, 2);
      filter0.acceptTestSet(testSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Filter filter0 = new Filter();
      TextViewer textViewer0 = new TextViewer();
      textViewer0.setAlignmentX(0.2F);
      filter0.removeTrainingSetListener(textViewer0);
      AWTEventMulticaster.remove((InputMethodListener) null, (InputMethodListener) null);
      AWTEventMulticaster.add((InputMethodListener) null, (InputMethodListener) null);
      filter0.addInputMethodListener((InputMethodListener) null);
      filter0.removeConfigurationListener((ConfigurationListener) null);
      boolean boolean0 = filter0.connectionAllowed("`Wd{,#J");
      assertTrue(boolean0);
      
      Appender appender0 = new Appender();
      Logger logger0 = appender0.m_log;
      filter0.setLog((Logger) null);
      filter0.removeConfigurationListener((ConfigurationListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Filter filter0 = new Filter();
      ConfigurationListener configurationListener0 = mock(ConfigurationListener.class, new ViolatedAssumptionAnswer());
      filter0.addConfigurationListener(configurationListener0);
      CostBenefitAnalysis costBenefitAnalysis0 = new CostBenefitAnalysis();
      int int0 = ICC_Profile.icSigSpaceCCLR;
      Locale locale0 = Locale.CANADA_FRENCH;
      ComponentOrientation.getOrientation(locale0);
      BeanVisual beanVisual0 = costBenefitAnalysis0.getVisual();
      filter0.setVisual(beanVisual0);
      FlowByExpression flowByExpression0 = new FlowByExpression();
      InstanceEvent instanceEvent0 = flowByExpression0.m_ie;
      filter0.acceptInstance(instanceEvent0);
      filter0.addInstanceListener(flowByExpression0);
      assertEquals("CostBenefitAnalysis", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Filter filter0 = new Filter();
      BayesNet bayesNet0 = new BayesNet();
      Instances instances0 = bayesNet0.m_Instances;
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(filter0, (Instances) null, (-1120), 2);
      filter0.acceptTrainingSet(trainingSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.stop();
      Class<MockMinguoDate> class0 = MockMinguoDate.class;
      MethodDescriptor[] methodDescriptorArray0 = new MethodDescriptor[0];
      EventSetDescriptor eventSetDescriptor0 = new EventSetDescriptor("/$rm1<=<", class0, methodDescriptorArray0, (Method) null, (Method) null);
      eventSetDescriptor0.getListenerType();
      eventSetDescriptor0.setShortDescription("/$rm1<=<");
      boolean boolean0 = filter0.connectionAllowed(eventSetDescriptor0);
      assertEquals("AllFilter", filter0.getCustomName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Filter filter0 = new Filter();
      Loader loader0 = new Loader();
      TrainTestSplitMaker trainTestSplitMaker0 = new TrainTestSplitMaker();
      trainTestSplitMaker0.getStructure(" not supported (Filter)");
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(loader0, (Instances) null, (-3216), (-3216), (-1), (-1884767012));
      filter0.acceptTrainingSet(trainingSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.paint((Graphics) null);
      filter0.getLocale();
      filter0.connectionNotification("ERRORZWSee log for detail6).", "ERRORZWSee log for detail6).");
      filter0.connectionNotification("ERRORZWSee log for detail6).", "ERRORZWSee log for detail6).");
      Filter filter1 = new Filter();
      filter0.addDataSourceListener(filter1);
      assertEquals("AllFilter", filter1.getCustomName());
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.connectionNotification("ERROR (See log for details).", "ERROR (See log for details).");
      filter0.stop();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Filter filter0 = new Filter();
      Thread thread0 = MockThread.currentThread();
      MockThread mockThread0 = new MockThread(thread0, "|5jy3BS");
      filter0.m_filterThread = (Thread) mockThread0;
      filter0.acceptInstance((InstanceEvent) null);
      assertTrue(filter0.isBusy());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Filter filter0 = new Filter();
      ConfigurationListener configurationListener0 = mock(ConfigurationListener.class, new ViolatedAssumptionAnswer());
      filter0.addConfigurationListener(configurationListener0);
      int int0 = ICC_Profile.icSigSpaceCCLR;
      Locale locale0 = Locale.FRENCH;
      ComponentOrientation.getOrientation(locale0);
      Loader loader0 = new Loader();
      filter0.connectionNotification("2soDQtP_J4=:}3X", loader0);
      filter0.eventGeneratable("2soDQtP_J4=:}3X");
      OptionHandlerJavadoc optionHandlerJavadoc0 = new OptionHandlerJavadoc();
      DenseInstance denseInstance0 = new DenseInstance(Double.NEGATIVE_INFINITY, (double[]) null);
      denseInstance0.setWeight(Double.NEGATIVE_INFINITY);
      InstanceEvent instanceEvent0 = null;
      try {
        instanceEvent0 = new InstanceEvent((Object) null, denseInstance0, 6);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null source
         //
         verifyException("java.util.EventObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Filter filter0 = new Filter();
      TrainTestSplitMaker trainTestSplitMaker0 = new TrainTestSplitMaker();
      filter0.connectionNotification("j2](/D", trainTestSplitMaker0);
      boolean boolean0 = filter0.eventGeneratable("j2](/D");
      assertEquals("AllFilter", filter0.getCustomName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Filter filter0 = new Filter();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances((String) null, arrayList0, 1256);
      TestSetEvent testSetEvent0 = new TestSetEvent(filter0, instances0);
      filter0.acceptTestSet(testSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Filter filter0 = new Filter();
      Thread thread0 = filter0.m_filterThread;
      MockThread mockThread0 = new MockThread();
      MockThread.reset();
      filter0.m_filterThread = (Thread) mockThread0;
      filter0.acceptDataSet((DataSetEvent) null);
      System.setCurrentTimeMillis(0L);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Filter filter0 = new Filter();
      ListOptions listOptions0 = new ListOptions();
      filter0.connectionNotification("jtOR{a", listOptions0);
      filter0.addInputMethodListener((InputMethodListener) null);
      filter0.eventGeneratable("jtOR{a");
      filter0.eventGeneratable("jtOR{a");
      Sorter sorter0 = new Sorter();
      filter0.addInstanceListener(sorter0);
      CrossValidationFoldMaker crossValidationFoldMaker0 = new CrossValidationFoldMaker();
      sorter0.requestFocusInWindow();
      DatabaseLoader databaseLoader0 = new DatabaseLoader();
      databaseLoader0.getStructure();
      InstanceEvent instanceEvent0 = sorter0.m_ie;
      instanceEvent0.setStatus(10000);
      filter0.notifyInstanceListeners(instanceEvent0);
      assertTrue(sorter0.isBusy());
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Filter filter0 = new Filter();
      ModelPerformanceChart modelPerformanceChart0 = new ModelPerformanceChart();
      filter0.connectionNotification("instance", (Object) null);
      boolean boolean0 = filter0.eventGeneratable("instance");
      assertEquals("AllFilter", filter0.getCustomName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Filter filter0 = new Filter();
      SimpleKMeans simpleKMeans0 = new SimpleKMeans();
      filter0.eventGeneratable("configuration");
      // Undeclared exception!
      try { 
        filter0.performRequest("configuration");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // configuration not supported (Filter)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Filter filter0 = new Filter();
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      CheckOptionHandler checkOptionHandler0 = new CheckOptionHandler();
      filter0.connectionNotification("instance", checkOptionHandler0);
      BayesNet bayesNet0 = new BayesNet();
      Instances instances0 = bayesNet0.m_Instances;
      DataSetEvent dataSetEvent0 = new DataSetEvent("instance", (Instances) null);
      filter0.acceptDataSet(dataSetEvent0);
      System.setCurrentTimeMillis(0L);
      Sorter sorter0 = new Sorter();
      InstanceEvent instanceEvent0 = sorter0.m_ie;
      filter0.notifyInstanceListeners(instanceEvent0);
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
      Filter filter1 = new Filter();
      filter0.addDataSourceListener(filter1);
      StratifiedRemoveFolds stratifiedRemoveFolds0 = new StratifiedRemoveFolds();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getStructure();
      DataSetEvent dataSetEvent0 = new DataSetEvent(stratifiedRemoveFolds0, instances0);
      filter0.acceptDataSet(dataSetEvent0);
      String string0 = filter0.getCustomName();
      assertEquals("AllFilter", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Filter filter0 = new Filter();
      ClassifierErrorsPlotInstances classifierErrorsPlotInstances0 = new ClassifierErrorsPlotInstances();
      classifierErrorsPlotInstances0.getInstances();
      DataSetEvent dataSetEvent0 = new DataSetEvent(filter0, (Instances) null);
      filter0.acceptDataSet(dataSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Filter filter0 = new Filter();
      AttributeSummarizer attributeSummarizer0 = new AttributeSummarizer();
      FilteredClusterer filteredClusterer0 = new FilteredClusterer();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      MakeDensityBasedClusterer makeDensityBasedClusterer0 = new MakeDensityBasedClusterer(filteredClusterer0);
      Capabilities capabilities0 = makeDensityBasedClusterer0.getCapabilities();
      TestInstances testInstances0 = TestInstances.forCapabilities(capabilities0);
      Instances instances0 = testInstances0.generate();
      DataSetEvent dataSetEvent0 = new DataSetEvent(attributeSummarizer0, instances0);
      filter0.acceptDataSet(dataSetEvent0);
      TestSetEvent testSetEvent0 = new TestSetEvent(makeDensityBasedClusterer0, instances0, 1284, (-408), (-346), 1284);
      filter0.acceptTestSet(testSetEvent0);
      BeanVisual beanVisual0 = filter0.getVisual();
      assertEquals("AllFilter", beanVisual0.getText());
      assertEquals("weka/gui/beans/icons/DefaultFilter_animated.gif", beanVisual0.getAnimatedIconPath());
      assertFalse(filter0.isBusy());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Filter filter0 = new Filter();
      Appender appender0 = new Appender();
      InstanceEvent instanceEvent0 = appender0.m_ie;
      FilteredAssociator filteredAssociator0 = new FilteredAssociator();
      weka.filters.Filter filter1 = filteredAssociator0.getFilter();
      filter0.setFilter(filter1);
      filter0.acceptInstance(instanceEvent0);
      filter0.removeInstanceListener(appender0);
      assertEquals("MultiFilter", filter0.getCustomName());
  }
}
