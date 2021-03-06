/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 09:40:37 GMT 2019
 */

package accessories.plugins.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import accessories.plugins.time.JDayChooser;
import accessories.plugins.time.JMonthChooser;
import accessories.plugins.time.JYearChooser;
import java.awt.AWTEventMulticaster;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.DefaultFocusTraversalPolicy;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.SystemColor;
import java.awt.color.ICC_ColorSpace;
import java.awt.color.ICC_Profile;
import java.awt.dnd.DropTarget;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerListener;
import java.awt.event.FocusEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.KeyEvent;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;
import java.util.Locale;
import javax.help.HelpSet;
import javax.swing.DebugGraphics;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.MenuElement;
import javax.swing.MenuSelectionManager;
import javax.swing.event.MenuKeyEvent;
import javax.swing.plaf.basic.BasicToolBarUI;
import javax.swing.tree.DefaultTreeCellRenderer;
import org.apache.batik.ext.awt.g2d.GraphicContext;
import org.apache.fop.fonts.FontInfo;
import org.apache.fop.fonts.FontType;
import org.apache.fop.image.FopImage;
import org.apache.fop.image.JpegImage;
import org.apache.fop.pdf.PDFArray;
import org.apache.fop.pdf.PDFCIDFontDescriptor;
import org.apache.fop.pdf.PDFDocument;
import org.apache.fop.pdf.PDFResources;
import org.apache.fop.pdf.PDFTTFStream;
import org.apache.xalan.templates.StylesheetRoot;
import org.apache.xalan.transformer.TransformerImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.time.MockLocalTime;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.hsqldb.Session;
import org.hsqldb.jdbc.jdbcCallableStatement;
import org.hsqldb.jdbc.jdbcConnection;
import org.junit.runner.RunWith;
import org.openstreetmap.gui.jmapviewer.JMapViewer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JDayChooser_ESTest extends JDayChooser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      JMonthChooser jMonthChooser0 = new JMonthChooser();
      jMonthChooser0.getX();
      jDayChooser0.setMonthChooser(jMonthChooser0);
      jDayChooser0.isWeekOfYearVisible();
      System.setCurrentTimeMillis((-2407L));
      jDayChooser0.getDecorationBackgroundColor();
      JYearChooser jYearChooser0 = new JYearChooser();
      jDayChooser0.removeFocusListener(jYearChooser0);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      jDayChooser0.setAlwaysFireDayProperty(true);
      jDayChooser0.setMonth(503);
      KeyEvent keyEvent0 = new KeyEvent(jYearChooser0, 216, (-1L), 503, 33, 'h');
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
  public void test01()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setDay(702);
      jDayChooser0.getInputContext();
      jDayChooser0.init();
      jDayChooser0.getComponentListeners();
      MenuElement[] menuElementArray0 = new MenuElement[0];
      MenuSelectionManager menuSelectionManager0 = MenuSelectionManager.defaultManager();
      MenuKeyEvent menuKeyEvent0 = new MenuKeyEvent(jDayChooser0, 90, (-1L), 90, 90, ' ', menuElementArray0, menuSelectionManager0);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 90, (-3050L), 90, 2245, ' ');
      menuSelectionManager0.getChangeListeners();
      keyEvent0.getExtendedKeyCode();
      menuSelectionManager0.processKeyEvent(keyEvent0);
      jDayChooser0.setYear(90);
      menuKeyEvent0.consume();
      menuSelectionManager0.setSelectedPath(menuElementArray0);
      KeyEvent.getKeyModifiersText(2245);
      jDayChooser0.keyReleased(menuKeyEvent0);
      Color color0 = jDayChooser0.getDecorationBackgroundColor();
      jDayChooser0.setWeekOfYearVisible(true);
      jDayChooser0.setEnabled(true);
      jDayChooser0.setYear(702);
      jDayChooser0.setMonth(90);
      JMonthChooser jMonthChooser0 = new JMonthChooser(true);
      jMonthChooser0.getAutoscrolls();
      jMonthChooser0.enableInputMethods(true);
      jDayChooser0.setMonthChooser(jMonthChooser0);
      jDayChooser0.setDecorationBackgroundColor(color0);
      jDayChooser0.setMonth(2245);
      jDayChooser0.setDecorationBackgroundColor(color0);
      assertEquals(28, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "org.apache.fop.pdf.PDFFilterException");
      jDayChooser0.maxDayCharacters = 41;
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      defaultTreeCellRenderer0.list();
      Color color0 = defaultTreeCellRenderer0.getBackgroundSelectionColor();
      jDayChooser0.setWeekdayForeground(color0);
      jDayChooser0.getSundayForeground();
      jdbcConnection jdbcConnection0 = new jdbcConnection((Session) null);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      int int0 = 5;
      jdbcCallableStatement jdbcCallableStatement0 = null;
      try {
        jdbcCallableStatement0 = new jdbcCallableStatement(jdbcConnection0, "darkmagenta", 5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.hsqldb.jdbc.jdbcPreparedStatement", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.setFocusable(true);
      GraphicContext graphicContext0 = new GraphicContext();
      Font font0 = graphicContext0.getFont();
      jDayChooser0.getFontMetrics(font0);
      Color color0 = jDayChooser0.getWeekdayForeground();
      assertEquals(0, color0.getRed());
      
      jDayChooser0.getBaselineResizeBehavior();
      jDayChooser0.setFont(font0);
      Color color1 = jDayChooser0.getSundayForeground();
      assertTrue(jDayChooser0.isWeekOfYearVisible());
      
      float[] floatArray0 = new float[9];
      floatArray0[0] = 1426.4152F;
      floatArray0[1] = 0.0F;
      floatArray0[2] = (-2540.399F);
      floatArray0[3] = 0.0F;
      floatArray0[4] = 25.4F;
      floatArray0[5] = 1.0F;
      floatArray0[6] = 0.0F;
      floatArray0[7] = 0.0F;
      jDayChooser0.weekOfYearVisible = true;
      floatArray0[8] = (-182.585F);
      color1.getColorComponents(floatArray0);
      jDayChooser0.setDecorationBackgroundColor(color1);
      jDayChooser0.setSelectableDateRange((Date) null, (Date) null);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.setAlwaysFireDayProperty(true);
      jDayChooser0.grabFocus();
      jDayChooser0.getSelectedDay();
      jDayChooser0.setMinSelectableDate((Date) null);
      FocusEvent focusEvent0 = null;
      try {
        focusEvent0 = new FocusEvent((Component) null, 3382, true, jDayChooser0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null source
         //
         verifyException("java.util.EventObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, false);
      JDayChooser jDayChooser0 = new JDayChooser(false);
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, 2, true);
      jDayChooser0.focusLost(focusEvent0);
      jDayChooser0.initDecorations();
      jDayChooser0.drawDays();
      jDayChooser0.setDecorationBordersVisible(true);
      jDayChooser0.getSundayForeground();
      jDayChooser0.setDecorationBackgroundColor((Color) null);
      jDayChooser0.isDecorationBackgroundVisible();
      jDayChooser0.setMaxDayCharacters(2);
      assertEquals(2, jDayChooser0.getMaxDayCharacters());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      assertTrue(boolean0);
      
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.requestFocus(false);
      jDayChooser0.getDaysInMonth();
      jDayChooser0.setMaxDayCharacters(349);
      MenuSelectionManager menuSelectionManager0 = new MenuSelectionManager();
      MenuKeyEvent menuKeyEvent0 = new MenuKeyEvent(jDayChooser0, (-1905), 1510L, 28, 1, '\'', (MenuElement[]) null, menuSelectionManager0);
      KeyEvent.getExtendedKeyCodeForChar(1957);
      jDayChooser0.keyTyped(menuKeyEvent0);
      jDayChooser0.getDecorationBackgroundColor();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "day";
      stringArray0[1] = "day";
      stringArray0[2] = "day";
      stringArray0[3] = "day";
      stringArray0[4] = "+$0=G1m*zM15XGrb";
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
  public void test07()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Color color0 = jDayChooser0.getWeekdayForeground();
      float[] floatArray0 = new float[9];
      floatArray0[0] = 0.715F;
      floatArray0[1] = 0.0F;
      floatArray0[2] = 209.2F;
      floatArray0[3] = 1788.8F;
      floatArray0[4] = (-1.0F);
      floatArray0[5] = (-2332.954F);
      floatArray0[6] = 1348.15F;
      floatArray0[7] = 1214.45F;
      floatArray0[8] = (-87.5F);
      color0.getRGBComponents(floatArray0);
      jDayChooser0.setWeekdayForeground(color0);
      jDayChooser0.setMaxSelectableDate((Date) null);
      jDayChooser0.setForeground(color0);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      Time time0 = new Time((-560L));
      jDayChooser0.setSelectableDateRange((Date) null, time0);
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      Color color0 = Color.GRAY;
      jDayChooser0.setDecorationBackgroundColor(color0);
      JMonthChooser jMonthChooser0 = new JMonthChooser(false);
      jDayChooser0.setMonthChooser(jMonthChooser0);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-21);
      byteArray0[1] = (byte)96;
      byteArray0[2] = (byte)87;
      byteArray0[3] = (byte) (-53);
      byteArray0[4] = (byte)110;
      byteArray0[5] = (byte) (-76);
      byteArray0[6] = (byte) (-40);
      byteArray0[7] = (byte)90;
      byteArray0[8] = (byte) (-97);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      jDayChooser0.updateUI();
      FocusEvent focusEvent0 = new FocusEvent(jMonthChooser0, 8930, true, jMonthChooser0);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "1");
      focusEvent0.paramString();
      focusEvent0.getOppositeComponent();
      jDayChooser0.focusLost(focusEvent0);
      jDayChooser0.setDay((-2033));
      jDayChooser0.getDayPanel();
      jDayChooser0.setFocus();
      assertEquals(1, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      boolean boolean0 = true;
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, true);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, ":cz");
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.setMaxDayCharacters(4);
      jDayChooser0.setFocus();
      int int0 = 23;
      Color color0 = jDayChooser0.getBackground();
      jDayChooser0.setMaxDayCharacters(23);
      float[] floatArray0 = new float[7];
      floatArray0[0] = (float) 23;
      floatArray0[1] = (float) 4;
      jDayChooser0.transferFocusDownCycle();
      floatArray0[2] = 1025.115F;
      floatArray0[3] = (float) 23;
      floatArray0[4] = (float) 4;
      floatArray0[5] = 0.0F;
      floatArray0[6] = (float) 23;
      color0.getRGBComponents(floatArray0);
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
  public void test11()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      Date date0 = jDayChooser0.getMaxSelectableDate();
      DefaultFocusTraversalPolicy defaultFocusTraversalPolicy0 = new DefaultFocusTraversalPolicy();
      jDayChooser0.setFocusTraversalPolicy(defaultFocusTraversalPolicy0);
      jDayChooser0.firePropertyChange("Windows", 0.0, 0.0);
      jDayChooser0.drawDays();
      JYearChooser jYearChooser0 = jDayChooser0.yearChooser;
      jDayChooser0.setYearChooser((JYearChooser) null);
      SystemColor systemColor0 = SystemColor.scrollbar;
      jDayChooser0.setForeground(systemColor0);
      jDayChooser0.setDecorationBackgroundColor(systemColor0);
      jDayChooser0.setSelectableDateRange(date0, date0);
      jDayChooser0.init();
      jDayChooser0.drawWeeks();
      jDayChooser0.setEnabled(true);
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      boolean boolean0 = true;
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.isFocusable();
      jDayChooser0.setAlwaysFireDayProperty(true);
      jDayChooser0.getDecorationBackgroundColor();
      jDayChooser0.getDaysInMonth();
      jDayChooser0.isDoubleBuffered();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 28, 0L, 28, 28, 'N');
      jDayChooser0.keyPressed(keyEvent0);
      int int0 = 42;
      jDayChooser0.addListeners(42);
      jDayChooser0.isDecorationBordersVisible();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      FontInfo fontInfo0 = new FontInfo();
      String string0 = null;
      jDayChooser_DecoratorButton0.setInheritsPopupMenu(false);
      PDFDocument pDFDocument0 = new PDFDocument((String) null);
      PDFResources pDFResources0 = new PDFResources(32);
      PDFTTFStream pDFTTFStream0 = new PDFTTFStream(32);
      pDFTTFStream0.add("14");
      int int1 = 31;
      FontType fontType0 = null;
      String string1 = null;
      int int2 = 65481;
      int[] intArray0 = new int[1];
      intArray0[0] = (int) 'N';
      PDFArray pDFArray0 = new PDFArray(intArray0);
      PDFCIDFontDescriptor pDFCIDFontDescriptor0 = null;
      try {
        pDFCIDFontDescriptor0 = new PDFCIDFontDescriptor("600", intArray0, 78, 28, 65481, 32, "d/<^OxMG");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.fop.pdf.PDFCIDFontDescriptor", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.setFocusable(true);
      GraphicContext graphicContext0 = new GraphicContext();
      Font font0 = graphicContext0.getFont();
      jDayChooser0.getFontMetrics(font0);
      jDayChooser0.getWeekdayForeground();
      jDayChooser0.getBaselineResizeBehavior();
      jDayChooser0.setFont(font0);
      Color color0 = jDayChooser0.getSundayForeground();
      float[] floatArray0 = new float[9];
      floatArray0[0] = 1426.4152F;
      floatArray0[1] = 0.0F;
      floatArray0[2] = (-2540.399F);
      floatArray0[3] = 0.0F;
      floatArray0[4] = 25.4F;
      floatArray0[5] = 1.0F;
      floatArray0[6] = 0.0F;
      floatArray0[7] = 0.0F;
      floatArray0[8] = (-182.585F);
      color0.getColorComponents(floatArray0);
      jDayChooser0.setDecorationBackgroundColor(color0);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isWeekOfYearVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.setWeekOfYearVisible(true);
      jDayChooser0.getInputMap();
      FileSystemHandling.shouldAllThrowIOExceptions();
      jDayChooser0.getToolkit();
      AWTEventMulticaster.add((ContainerListener) null, (ContainerListener) null);
      jDayChooser0.addContainerListener((ContainerListener) null);
      jDayChooser0.setWeekOfYearVisible(false);
      jDayChooser0.setDecorationBordersVisible(true);
      jDayChooser0.setAlwaysFireDayProperty(true);
      jDayChooser0.getLocale();
      System.setCurrentTimeMillis((-748L));
      Color color0 = Color.BLACK;
      jDayChooser0.setWeekdayForeground(color0);
      jDayChooser0.getMinSelectableDate();
      assertFalse(jDayChooser0.isWeekOfYearVisible());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, 28, false);
      jDayChooser0.focusLost(focusEvent0);
      jDayChooser0.getMaxDayCharacters();
      jDayChooser0.getDaysInMonth();
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
  public void test16()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      boolean boolean0 = jDayChooser0.isDayBordersVisible();
      LocalTime localTime0 = MockLocalTime.now();
      Time time0 = Time.valueOf(localTime0);
      time0.clone();
      time0.clone();
      jDayChooser0.setMinSelectableDate(time0);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.isFocusable();
      jDayChooser0.setDecorationBordersVisible(false);
      boolean boolean1 = jDayChooser0.isWeekOfYearVisible();
      assertFalse(boolean1 == boolean0);
      
      JMonthChooser jMonthChooser0 = new JMonthChooser();
      jDayChooser0.setMonthChooser(jMonthChooser0);
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.getAutoscrolls();
      jDayChooser0.drawDays();
      Date date0 = jDayChooser0.getMinSelectableDate();
      jDayChooser0.setMaxSelectableDate(date0);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, (String) null);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setDay(112);
      jDayChooser0.getDayPanel();
      jDayChooser0.getDecorationBackgroundColor();
      Button button0 = null;
      try {
        button0 = new Button((String) null);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.isFocusOwner();
      jDayChooser0.getMaximumSize();
      jDayChooser0.getMouseListeners();
      assertTrue(jDayChooser0.isDayBordersVisible());
      
      jDayChooser0.setDayBordersVisible(true);
      jDayChooser0.setFocus();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(720, (-1437625606), (-1437625606));
      jDayChooser0.setCalendar(mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=720,MONTH=-1437625606,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=-1437625606,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      ActionEvent actionEvent0 = new ActionEvent(jDayChooser0, (-905), (String) null, (-6043));
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
  public void test21()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.drawWeeks();
      jDayChooser0.getDayPanel();
      jDayChooser0.setDecorationBackgroundVisible(false);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "day";
      stringArray0[1] = "day";
      stringArray0[2] = "day";
      stringArray0[3] = "org.apache.batik.dom.svg.SVGDOMImplementation$GElementFactory";
      stringArray0[4] = "accessories.plugins.time.JDayChooser$DecoratorButton";
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
  public void test22()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      int int0 = 1739;
      jDayChooser0.getVetoableChangeListeners();
      jDayChooser0.setYear(1739);
      jDayChooser0.getPropertyChangeListeners();
      boolean boolean0 = true;
      jDayChooser0.invalidate();
      jDayChooser0.setDecorationBackgroundVisible(true);
      jDayChooser0.isDecorationBordersVisible();
      jDayChooser0.getSelectedDay();
      Color color0 = DebugGraphics.flashColor();
      color0.getColorSpace();
      int int1 = (-924);
      DropTarget dropTarget0 = null;
      try {
        dropTarget0 = new DropTarget();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.dnd.DropTarget", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      AWTEventMulticaster.remove((InputMethodListener) null, (InputMethodListener) null);
      jDayChooser0.removeInputMethodListener((InputMethodListener) null);
      jDayChooser0.setWeekOfYearVisible(true);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      GridLayout gridLayout0 = new GridLayout();
      jDayChooser0.setLayout(gridLayout0);
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
  public void test25()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.doLayout();
      int int0 = 10142;
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, 10142);
      focusEvent0.getOppositeComponent();
      jDayChooser0.focusGained(focusEvent0);
      jDayChooser0.getDay();
      BasicToolBarUI basicToolBarUI0 = new BasicToolBarUI();
      basicToolBarUI0.getFloatingColor();
      int int1 = 254;
      // Undeclared exception!
      try { 
        basicToolBarUI0.uninstallUI(jDayChooser0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.swing.LookAndFeel", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JYearChooser jYearChooser0 = new JYearChooser();
      jYearChooser0.print((Graphics) null);
      jDayChooser0.setYearChooser(jYearChooser0);
      jDayChooser0.setDayBordersVisible(false);
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      Color color0 = new Color(1478, true);
      float[] floatArray0 = new float[5];
      floatArray0[0] = (float) 1478;
      floatArray0[1] = (float) 1478;
      floatArray0[2] = (float) 1478;
      floatArray0[3] = (float) 1478;
      floatArray0[4] = (float) 1478;
      color0.getRGBColorComponents(floatArray0);
      jDayChooser0.setSundayForeground(color0);
      jDayChooser0.setWeekdayForeground(color0);
      jDayChooser0.getSelectedDay();
      FopImage.ImageInfo fopImage_ImageInfo0 = new FopImage.ImageInfo();
      JpegImage jpegImage0 = new JpegImage(fopImage_ImageInfo0);
      jpegImage0.getICCProfile();
      ICC_ColorSpace iCC_ColorSpace0 = null;
      try {
        iCC_ColorSpace0 = new ICC_ColorSpace((ICC_Profile) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.color.ICC_ColorSpace", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, 43, true);
      jDayChooser0.focusLost(focusEvent0);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.isFocusable();
      jDayChooser_DecoratorButton0.getDisplayedMnemonicIndex();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser_DecoratorButton0, 43, 43, 43, 43, 't');
      jDayChooser0.keyReleased(keyEvent0);
      jDayChooser_DecoratorButton0.isFocusable();
      jDayChooser0.getMinSelectableDate();
      jDayChooser0.keyPressed(keyEvent0);
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JMapViewer jMapViewer0 = new JMapViewer();
      jMapViewer0.getHierarchyBoundsListeners();
      jMapViewer0.getAncestorListeners();
      FocusEvent focusEvent0 = new FocusEvent(jMapViewer0, 0, false);
      jDayChooser0.focusGained(focusEvent0);
      JTable jTable0 = null;
      try {
        jTable0 = new JTable((-164), 4);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -164
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      HelpSet helpSet0 = new HelpSet(classLoader0);
      String string0 = "NAu\\:sr-ZHuPayc";
      String string1 = "uLOf1M:G";
      TransformerImpl transformerImpl0 = null;
      try {
        transformerImpl0 = new TransformerImpl((StylesheetRoot) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xalan.transformer.TransformerImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, false);
      JDayChooser jDayChooser0 = new JDayChooser(false);
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, 2, true);
      jDayChooser0.focusLost(focusEvent0);
      jDayChooser0.initDecorations();
      jDayChooser0.drawDays();
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      
      jDayChooser0.setDecorationBordersVisible(true);
      jDayChooser0.getSundayForeground();
      jDayChooser0.setDecorationBackgroundColor((Color) null);
      jDayChooser0.isDecorationBackgroundVisible();
      jDayChooser0.setMaxDayCharacters(13);
      assertEquals(0, jDayChooser0.getMaxDayCharacters());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Color color0 = Color.blue;
      jDayChooser0.setWeekdayForeground(color0);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      assertEquals(14, jDayChooser0.getDay());
      
      jDayChooser0.setDay(525);
      jDayChooser0.firePropertyChange("t?$Yn;cRV:{'%", (byte)39, (byte)47);
      jDayChooser0.isDayBordersVisible();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.firePropertyChange("t?$Yn;cRV:{'%", (-2278), 700);
      jDayChooser0.setEnabled(false);
      jDayChooser0.setAlwaysFireDayProperty(false);
      jDayChooser_DecoratorButton0.paint((Graphics) null);
      jDayChooser0.getSundayForeground();
      jDayChooser0.setYearChooser((JYearChooser) null);
      JDayChooser jDayChooser1 = new JDayChooser(false);
      JMonthChooser jMonthChooser0 = jDayChooser1.monthChooser;
      jDayChooser0.setMonthChooser((JMonthChooser) null);
      jDayChooser0.getMaxSelectableDate();
      assertEquals(28, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getMaxSelectableDate();
      int int0 = (-4603);
      jDayChooser0.setMaxDayCharacters((-4603));
      jDayChooser0.getLocale();
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, (-4603), true);
      char char0 = '<';
      Character character0 = new Character('<');
      KeyStroke keyStroke0 = KeyStroke.getKeyStroke(character0, (-4603));
      int int1 = (-177);
      // Undeclared exception!
      try { 
        jDayChooser0.registerKeyboardAction((ActionListener) null, keyStroke0, (-177));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // condition must be one of JComponent.WHEN_IN_FOCUSED_WINDOW, JComponent.WHEN_FOCUSED or JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT
         //
         verifyException("javax.swing.JComponent", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      JMonthChooser jMonthChooser0 = new JMonthChooser(false);
      jDayChooser0.setMonthChooser(jMonthChooser0);
      jDayChooser0.getLocale();
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }
}
