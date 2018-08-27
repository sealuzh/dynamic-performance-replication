/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 13:30:35 GMT 2018
 */

package accessories.plugins.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import accessories.plugins.time.JDayChooser;
import accessories.plugins.time.JMonthChooser;
import accessories.plugins.time.JYearChooser;
import freemind.controller.StructuredMenuHolder;
import freemind.main.FreeMindApplet;
import freemind.modes.Mode;
import freemind.modes.filemode.FileController;
import freemind.modes.filemode.FileMode;
import freemind.modes.mindmapmode.MindMapController;
import freemind.modes.mindmapmode.MindMapMapModel;
import freemind.modes.mindmapmode.MindMapMode;
import freemind.modes.mindmapmode.actions.BoldAction;
import freemind.modes.mindmapmode.actions.UseRichFormattingAction;
import freemind.modes.schememode.SchemeController;
import freemind.view.mindmapview.attributeview.AttributePopupMenu;
import java.awt.AWTEventMulticaster;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Component;
import java.awt.DefaultFocusTraversalPolicy;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ContainerListener;
import java.awt.event.FocusEvent;
import java.awt.event.HierarchyBoundsListener;
import java.awt.event.HierarchyListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.font.FontRenderContext;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.sql.Time;
import java.time.LocalDate;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JRootPane;
import javax.swing.JScrollBar;
import javax.swing.JToolBar;
import javax.swing.JWindow;
import javax.swing.MenuElement;
import javax.swing.MenuSelectionManager;
import javax.swing.event.MenuKeyEvent;
import javax.swing.plaf.basic.BasicSplitPaneDivider;
import javax.swing.plaf.metal.MetalSplitPaneUI;
import org.apache.batik.svggen.DefaultExtensionHandler;
import org.apache.batik.svggen.DefaultImageHandler;
import org.apache.batik.svggen.SVGGraphics2D;
import org.apache.fop.fonts.FontInfo;
import org.apache.fop.pdf.PDFCIDSystemInfo;
import org.apache.fop.pdf.PDFCMap;
import org.apache.fop.pdf.PDFDocument;
import org.apache.fop.pdf.PDFPage;
import org.apache.fop.pdf.PDFResources;
import org.apache.fop.svg.PDFDocumentGraphics2D;
import org.apache.fop.svg.PDFGraphics2D;
import org.apache.xalan.templates.ElemNumber;
import org.apache.xml.serializer.ToTextSAXHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.hsqldb.jdbc.jdbcCallableStatement;
import org.hsqldb.jdbc.jdbcConnection;
import org.hsqldb.persist.HsqlProperties;
import org.junit.runner.RunWith;
import org.openstreetmap.gui.jmapviewer.Demo;
import org.xml.sax.ContentHandler;
import plugins.collaboration.database.DatabaseConnectionHook;
import plugins.map.FreeMindMapController;
import plugins.map.MapDialog;
import plugins.map.Registration;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JDayChooser_ESTest extends JDayChooser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setEnabled(false);
      int int0 = jDayChooser0.getDay();
      assertEquals(14, int0);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Color color0 = Color.GRAY;
      jDayChooser0.setDecorationBackgroundColor(color0);
      boolean boolean0 = jDayChooser0.isDecorationBackgroundVisible();
      assertTrue(boolean0);
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.setIgnoreRepaint(false);
      Color color0 = Color.GRAY;
      float[] floatArray0 = new float[9];
      floatArray0[0] = 3500.0022F;
      floatArray0[1] = 0.787F;
      floatArray0[2] = 0.0F;
      floatArray0[3] = (-1017.2F);
      floatArray0[4] = 0.0F;
      floatArray0[5] = 0.0F;
      floatArray0[6] = 12.0F;
      floatArray0[7] = 0.0F;
      floatArray0[8] = 0.0F;
      color0.getColorComponents(floatArray0);
      jDayChooser0.setWeekdayForeground(color0);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      JOptionPane jOptionPane0 = new JOptionPane(jDayChooser_DecoratorButton0);
      String string0 = "\"7}ex:9vZj=^$~/|7";
      ActionMap actionMap0 = new ActionMap();
      JScrollBar jScrollBar0 = null;
      try {
        jScrollBar0 = new JScrollBar((-888), 4322, 4322, 4322, 4322);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // orientation must be one of: VERTICAL, HORIZONTAL
         //
         verifyException("javax.swing.JScrollBar", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getMouseMotionListeners();
      jDayChooser0.isDecorationBordersVisible();
      jDayChooser0.validate();
      jDayChooser0.isDecorationBackgroundVisible();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      String string0 = "}^<|58zLV*1n4-j";
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)74;
      byteArray0[1] = (byte) (-74);
      byteArray0[2] = (byte)116;
      pipedOutputStream0.close();
      try { 
        pipedOutputStream0.write(byteArray0, 444, (int) (byte)74);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      int int0 = 0;
      Date date0 = jDayChooser0.getMaxSelectableDate();
      jDayChooser0.defaultMaxSelectableDate = date0;
      jDayChooser0.firePropertyChange("H@6 I@q^DR._lE", 0, (-982));
      jDayChooser0.getDecorationBackgroundColor();
      jDayChooser0.getRootPane();
      jDayChooser0.setMonth(5);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "H@6 I@q^DR._lE";
      stringArray0[1] = "H@6 I@q^DR._lE";
      stringArray0[2] = "H@6 I@q^DR._lE";
      stringArray0[3] = "day";
      stringArray0[4] = "day";
      // Undeclared exception!
      try { 
        JDayChooser.main(stringArray0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setAlignmentY(0.0F);
      jDayChooser0.setMonth(1);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      ActionEvent actionEvent0 = new ActionEvent(jDayChooser0, 326, "day", 326, 0);
      // Undeclared exception!
      try { 
        jDayChooser0.actionPerformed(actionEvent0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // accessories.plugins.time.JDayChooser cannot be cast to javax.swing.JButton
         //
         verifyException("accessories.plugins.time.JDayChooser", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JYearChooser jYearChooser0 = jDayChooser0.yearChooser;
      jDayChooser0.setYearChooser((JYearChooser) null);
      jDayChooser0.setDay(1594);
      jDayChooser0.getToolkit();
      Demo demo0 = null;
      try {
        demo0 = new Demo();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      HierarchyBoundsListener hierarchyBoundsListener0 = mock(HierarchyBoundsListener.class, new ViolatedAssumptionAnswer());
      jDayChooser0.getVerifyInputWhenFocusTarget();
      jDayChooser0.getBaselineResizeBehavior();
      HierarchyBoundsListener hierarchyBoundsListener1 = AWTEventMulticaster.add(hierarchyBoundsListener0, hierarchyBoundsListener0);
      AWTEventMulticaster.remove(hierarchyBoundsListener1, hierarchyBoundsListener1);
      jDayChooser0.addHierarchyBoundsListener((HierarchyBoundsListener) null);
      jDayChooser0.createImage(1753, 1753);
      jDayChooser0.getDecorationBackgroundColor();
      jDayChooser0.getMaxSelectableDate();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.isFocusable();
      jDayChooser0.setYear(1753);
      jDayChooser0.updateUI();
      jDayChooser0.getDay();
      jDayChooser0.getMaxDayCharacters();
      Choice choice0 = null;
      try {
        choice0 = new Choice();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, (-1356), (-1356), 2188, 33, 'S');
      // Undeclared exception!
      try { 
        jDayChooser0.keyPressed(keyEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("accessories.plugins.time.JDayChooser", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      AWTEventMulticaster.add((ContainerListener) null, (ContainerListener) null);
      AWTEventMulticaster.remove((ContainerListener) null, (ContainerListener) null);
      jDayChooser0.addContainerListener((ContainerListener) null);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, (-813), (-2292L), (-813), (-813), 'k');
      keyEvent0.setKeyCode((-813));
      KeyEvent.getExtendedKeyCodeForChar(294);
      keyEvent0.getExtendedKeyCode();
      jDayChooser0.keyPressed(keyEvent0);
      jDayChooser0.getDecorationBackgroundColor();
      jDayChooser0.getMaxSelectableDate();
      jDayChooser0.setFocus();
      jDayChooser0.getWeekdayForeground();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "day";
      stringArray0[1] = "day";
      stringArray0[2] = "day";
      stringArray0[3] = "day";
      stringArray0[4] = "day";
      stringArray0[5] = "day";
      stringArray0[6] = "day";
      // Undeclared exception!
      try { 
        JDayChooser.main(stringArray0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      assertEquals(14, jDayChooser0.getDay());
      
      jDayChooser0.day = (-530);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, (-530), (-530), (-530), (-530), ']');
      jDayChooser0.keyPressed(keyEvent0);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.day = 3614;
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 3614, 3614, 3614, 482, '@');
      jDayChooser0.keyPressed(keyEvent0);
      boolean boolean0 = jDayChooser0.isDecorationBackgroundVisible();
      assertEquals(3614, jDayChooser0.getDay());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      HierarchyListener hierarchyListener0 = mock(HierarchyListener.class, new ViolatedAssumptionAnswer());
      HierarchyListener hierarchyListener1 = mock(HierarchyListener.class, new ViolatedAssumptionAnswer());
      HierarchyListener hierarchyListener2 = AWTEventMulticaster.remove(hierarchyListener0, hierarchyListener1);
      HierarchyListener hierarchyListener3 = AWTEventMulticaster.add(hierarchyListener2, hierarchyListener2);
      jDayChooser0.addHierarchyListener(hierarchyListener3);
      jDayChooser0.dayBordersVisible = false;
      jDayChooser0.firePropertyChange("/#ZKq9~iQT>;IPl", 0, 355);
      jDayChooser0.updateUI();
      jDayChooser0.setYear(355);
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, 355, true, jDayChooser0);
      jDayChooser0.focusLost(focusEvent0);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isWeekOfYearVisible());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setMaxDayCharacters(0);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setSelectableDateRange((Date) null, (Date) null);
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JButton jButton0 = jDayChooser0.selectedDay;
      jDayChooser0.selectedDay = null;
      jDayChooser0.getName();
      jDayChooser0.setYear((-3890));
      Time time0 = new Time(0L);
      jDayChooser0.setSelectableDateRange(time0, time0);
      jDayChooser0.getSundayForeground();
      int int0 = 4;
      ActionEvent actionEvent0 = new ActionEvent("JDayChooser", 4, "JDayChooser", 4);
      // Undeclared exception!
      try { 
        jDayChooser0.actionPerformed(actionEvent0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to javax.swing.JButton
         //
         verifyException("accessories.plugins.time.JDayChooser", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      boolean boolean0 = false;
      JDayChooser jDayChooser0 = new JDayChooser(false);
      HierarchyBoundsListener hierarchyBoundsListener0 = mock(HierarchyBoundsListener.class, new ViolatedAssumptionAnswer());
      HierarchyBoundsListener hierarchyBoundsListener1 = AWTEventMulticaster.add(hierarchyBoundsListener0, hierarchyBoundsListener0);
      AWTEventMulticaster.remove(hierarchyBoundsListener1, hierarchyBoundsListener1);
      jDayChooser0.removeHierarchyBoundsListener((HierarchyBoundsListener) null);
      JComponent.isLightweightComponent(jDayChooser0);
      // Undeclared exception!
      try { 
        jDayChooser0.setCalendar((Calendar) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("accessories.plugins.time.JDayChooser", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Color color0 = Color.GRAY;
      jDayChooser0.setDecorationBackgroundColor(color0);
      Color color1 = Color.WHITE;
      jDayChooser0.setDecorationBackgroundColor(color1);
      jDayChooser0.isWeekOfYearVisible();
      jDayChooser0.setDayBordersVisible(false);
      float[] floatArray0 = new float[4];
      floatArray0[0] = (float) (-1716);
      floatArray0[1] = (float) 4500;
      floatArray0[2] = (float) 4500;
      floatArray0[3] = (float) (-1716);
      Color.RGBtoHSB(4500, (-1716), 4500, floatArray0);
      // Undeclared exception!
      try { 
        jDayChooser0.computeVisibleRect((Rectangle) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.swing.JComponent", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.setMaxDayCharacters((-1595));
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      JWindow jWindow0 = null;
      try {
        jWindow0 = new JWindow();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.setEnabled(true);
      JMonthChooser jMonthChooser0 = jDayChooser0.monthChooser;
      jDayChooser0.setMonthChooser((JMonthChooser) null);
      ToTextSAXHandler toTextSAXHandler0 = new ToTextSAXHandler((ContentHandler) null, "month");
      toTextSAXHandler0.getOutputFormat();
      HsqlProperties hsqlProperties0 = new HsqlProperties((Properties) null);
      jdbcConnection jdbcConnection0 = null;
      try {
        jdbcConnection0 = new jdbcConnection(hsqlProperties0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.hsqldb.persist.HsqlProperties", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      boolean boolean0 = jDayChooser0.isDecorationBackgroundVisible();
      assertTrue(boolean0);
      
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 22, (-358L), 16, 43, 'f');
      jDayChooser0.keyReleased(keyEvent0);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.paint((Graphics) null);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getName();
      jDayChooser0.setDay(6);
      int int0 = 11;
      jDayChooser0.setMaxDayCharacters(11);
      jDayChooser0.getMinSelectableDate();
      jDayChooser0.getDay();
      jDayChooser0.initDecorations();
      Locale locale0 = new Locale("JKLq", "JKLq");
      locale0.getExtensionKeys();
      Locale.Category locale_Category0 = Locale.Category.DISPLAY;
      locale0.toLanguageTag();
      // Undeclared exception!
      try { 
        locale0.getExtension('3');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Ill-formed extension key: 3
         //
         verifyException("java.util.Locale", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      
      jDayChooser0.setWeekOfYearVisible(false);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      PDFDocumentGraphics2D pDFDocumentGraphics2D0 = new PDFDocumentGraphics2D(false);
      pDFDocumentGraphics2D0.getFontInfo();
      PDFResources pDFResources0 = new PDFResources((-2652));
      PDFCIDSystemInfo pDFCIDSystemInfo0 = new PDFCIDSystemInfo("lya(kgWIHSnulDa", "6", (-1301));
      PDFCMap pDFCMap0 = new PDFCMap("k@q", pDFCIDSystemInfo0);
      PDFPage pDFPage0 = new PDFPage(pDFResources0, pDFCMap0, (-1081), 3501);
      pDFPage0.getDocument();
      pDFDocumentGraphics2D0.getFontInfo();
      FontInfo fontInfo0 = new FontInfo();
      jDayChooser0.setMaxDayCharacters((byte)0);
      jDayChooser0.getLocale();
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Date date0 = jDayChooser0.getMaxSelectableDate();
      jDayChooser0.setMinSelectableDate(date0);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setWeekOfYearVisible(true);
      // Undeclared exception!
      try { 
        jDayChooser0.getTemporaryCalendar();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("accessories.plugins.time.JDayChooser", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.getRootPane();
      jDayChooser0.setWeekOfYearVisible(false);
      jDayChooser0.setYear(49);
      System.setCurrentTimeMillis(0L);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.getRootPane();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 7, 0L, 7, 966, 'n');
      keyEvent0.setKeyCode(7);
      Date date0 = jDayChooser0.maxSelectableDate;
      Date date1 = jDayChooser0.setMaxSelectableDate(date0);
      Date date2 = jDayChooser0.setMinSelectableDate(date1);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertTrue(jDayChooser0.isWeekOfYearVisible());
      assertSame(date2, date1);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.isDayBordersVisible();
      // Undeclared exception!
      try { 
        jDayChooser0.setLocale((Locale) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Color color0 = Color.GRAY;
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setDecorationBackgroundColor(color0);
      jDayChooser0.setMaxDayCharacters(3);
      assertEquals(3, jDayChooser0.getMaxDayCharacters());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Color color0 = Color.GRAY;
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.setAlwaysFireDayProperty(true);
      assertTrue(jDayChooser0.isWeekOfYearVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, (-1356), (-1136L), (-1356), 34, '(');
      KeyEvent keyEvent1 = new KeyEvent(jDayChooser0, 41, 188, 47, 47, '\"');
      keyEvent0.paramString();
      keyEvent0.paramString();
      KeyEvent keyEvent2 = new KeyEvent(jDayChooser0, 28, 156L, 238, (-1686), '[');
      // Undeclared exception!
      try { 
        jDayChooser0.keyPressed(keyEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("accessories.plugins.time.JDayChooser", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, (-1692), (-1692), (-1692), 37, 'K');
      KeyEvent keyEvent1 = new KeyEvent(jDayChooser0, 28, 238, (-329), (-1686), '2');
      jDayChooser0.keyPressed(keyEvent0);
      jDayChooser0.setFocus();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.isFocusable();
      assertEquals(13, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-71);
      byteArray0[1] = (byte)26;
      byteArray0[2] = (byte)89;
      byteArray0[3] = (byte) (-70);
      byteArray0[4] = (byte)39;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 35, (-32768L), 9, 35, 'd');
      InputEvent.getMaskForButton(9);
      JDayChooser jDayChooser1 = new JDayChooser(false);
      assertEquals(14, jDayChooser1.getDay());
      
      jDayChooser1.keyPressed(keyEvent0);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-71);
      byteArray0[1] = (byte)26;
      byteArray0[2] = (byte)89;
      byteArray0[3] = (byte) (-70);
      byteArray0[4] = (byte)39;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, (byte)26, (-1482L), (byte)89, (byte)39, 'i');
      KeyEvent.getExtendedKeyCodeForChar((byte) (-70));
      JDayChooser jDayChooser1 = new JDayChooser();
      jDayChooser1.keyPressed(keyEvent0);
      assertEquals(15, jDayChooser1.getDay());
      
      jDayChooser0.setMaxSelectableDate((Date) null);
      jDayChooser0.setDayBordersVisible(true);
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 34, 34, 34, 34, '\\');
      KeyEvent keyEvent1 = new KeyEvent(jDayChooser0, (-5859), 34, (-222), 14, '(');
      KeyEvent keyEvent2 = new KeyEvent(jDayChooser0, (-2274), (-5859), 40, 38, '3');
      jDayChooser0.keyPressed(keyEvent2);
      jDayChooser0.addListeners(38);
      assertEquals(7, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)39;
      byteArray0[1] = (byte)39;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 733, (-2897L), 33, 33, '_');
      keyEvent0.setKeyCode(33);
      KeyEvent.getExtendedKeyCodeForChar(292);
      JDayChooser jDayChooser1 = new JDayChooser();
      jDayChooser0.isPaintingForPrint();
      // Undeclared exception!
      try { 
        jDayChooser0.keyPressed(keyEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("accessories.plugins.time.JDayChooser", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 34, (-1638L), 34, 1162, '\\');
      int int0 = (-5859);
      KeyEvent keyEvent1 = new KeyEvent(jDayChooser0, 40, (-1640L), 34, 40, 'M');
      JDayChooser jDayChooser1 = new JDayChooser();
      jDayChooser1.keyPressed(keyEvent1);
      boolean boolean0 = true;
      JDayChooser jDayChooser2 = new JDayChooser(true);
      jDayChooser2.keyPressed(keyEvent1);
      DefaultFocusTraversalPolicy defaultFocusTraversalPolicy0 = new DefaultFocusTraversalPolicy();
      // Undeclared exception!
      try { 
        defaultFocusTraversalPolicy0.getComponentAfter(jDayChooser2, jDayChooser0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // aContainer should be focus cycle root or focus traversal policy provider
         //
         verifyException("java.awt.ContainerOrderFocusTraversalPolicy", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      KeyEvent.getKeyText(1);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 1, (-923L), 1, 36, 'V', 1);
      jDayChooser0.keyPressed(keyEvent0);
      assertEquals(1, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setMaxDayCharacters(4);
      assertEquals(4, jDayChooser0.getMaxDayCharacters());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.day = 3614;
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 638, 638, 516, 27, '`');
      jDayChooser0.keyPressed(keyEvent0);
      System.setCurrentTimeMillis(2024L);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      System.setCurrentTimeMillis((-9223372036854775808L));
      boolean boolean0 = false;
      JDayChooser jDayChooser0 = new JDayChooser(false);
      char char0 = 'a';
      FileSystemHandling.shouldAllThrowIOExceptions();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, (-2224), 10485760L, (-2224), (-2224), 'a');
      int int0 = 43;
      KeyEvent.getKeyText(43);
      jDayChooser0.keyPressed(keyEvent0);
      jDayChooser0.getDecorationBackgroundColor();
      // Undeclared exception!
      try { 
        MockLocalDate.from((TemporalAccessor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // temporal
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      System.setCurrentTimeMillis(9223372036854775800L);
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.initDecorations();
      JButton jButton0 = jDayChooser0.getSelectedDay();
      assertNull(jButton0);
      
      jDayChooser0.setForeground((Color) null);
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(17, jDayChooser0.getDay());
  }
}