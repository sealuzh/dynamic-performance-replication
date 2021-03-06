/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 12:59:47 GMT 2019
 */

package accessories.plugins.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import accessories.plugins.time.JDayChooser;
import accessories.plugins.time.JMonthChooser;
import accessories.plugins.time.JYearChooser;
import java.awt.AWTKeyStroke;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.ImageCapabilities;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.SystemColor;
import java.awt.color.ColorSpace;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.geom.AffineTransform;
import java.awt.image.RescaleOp;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.DateTimeException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.InputVerifier;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSpinner;
import javax.swing.KeyStroke;
import javax.swing.MenuElement;
import javax.swing.MenuSelectionManager;
import javax.swing.event.MenuKeyEvent;
import javax.swing.plaf.metal.MetalDesktopIconUI;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.Element;
import javax.swing.text.LabelView;
import javax.swing.text.PlainDocument;
import javax.swing.text.StyleContext;
import javax.swing.tree.DefaultTreeCellRenderer;
import org.apache.batik.ext.awt.g2d.GraphicContext;
import org.apache.batik.svggen.CachedImageHandlerBase64Encoder;
import org.apache.batik.svggen.ImageHandlerPNGEncoder;
import org.apache.crimson.tree.XmlDocument;
import org.apache.xalan.templates.StylesheetComposed;
import org.apache.xalan.templates.StylesheetRoot;
import org.apache.xalan.transformer.TransformerImpl;
import org.apache.xerces.util.SymbolTable;
import org.apache.xml.utils.DefaultErrorHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.time.MockLocalTime;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;
import org.xml.sax.InputSource;
import org.xml.sax.SAXParseException;
import plugins.map.MapDialog;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JDayChooser_ESTest extends JDayChooser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.getMaxDayCharacters();
      jDayChooser0.setMaxDayCharacters(0);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 0, 5000L, 34, (-18), ',');
      jDayChooser0.keyPressed(keyEvent0);
      jDayChooser0.updateUI();
      Date date0 = jDayChooser0.getMaxSelectableDate();
      jDayChooser0.setSelectableDateRange(date0, date0);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "day";
      stringArray0[1] = "day";
      stringArray0[2] = "day";
      stringArray0[3] = "day";
      stringArray0[4] = "day";
      stringArray0[5] = "%ky.[D3m49@-@If";
      stringArray0[6] = "day";
      stringArray0[7] = "day";
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
  public void test01()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getX();
      jDayChooser0.setMaxDayCharacters(4);
      jDayChooser0.getAncestorListeners();
      // Undeclared exception!
      try { 
        jDayChooser0.addListeners(2156);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      jDayChooser0.setDay(3130);
      Date date0 = jDayChooser0.getMaxSelectableDate();
      jDayChooser0.setSelectableDateRange(date0, date0);
      jDayChooser0.setMonth(3130);
      jDayChooser0.setDecorationBackgroundVisible(true);
      jDayChooser0.updateUI();
      jDayChooser0.isWeekOfYearVisible();
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
  public void test03()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.setMaxSelectableDate((Date) null);
      int int0 = (-305);
      int int1 = 2336;
      boolean boolean0 = true;
      Button button0 = null;
      try {
        button0 = new Button();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      JDayChooser jDayChooser0 = new JDayChooser(false);
      int int0 = 2;
      jDayChooser0.setMaxDayCharacters(2);
      jDayChooser0.init();
      Component component0 = null;
      int int1 = (-2388);
      int int2 = 49;
      int int3 = 21;
      char char0 = 'L';
      MenuElement[] menuElementArray0 = new MenuElement[4];
      MapDialog mapDialog0 = new MapDialog();
      mapDialog0.shutdownMapHook();
      // Undeclared exception!
      try { 
        mapDialog0.getRegistration();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("freemind.extensions.HookAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = null;
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      JDayChooser jDayChooser0 = new JDayChooser(true);
      SystemColor systemColor0 = SystemColor.windowBorder;
      float[] floatArray0 = new float[6];
      jDayChooser0.getInputMap();
      jDayChooser0.setInheritsPopupMenu(false);
      floatArray0[0] = (-2708.1523F);
      jDayChooser0.setWeekOfYearVisible(false);
      floatArray0[1] = 1364.383F;
      floatArray0[2] = (-1933.8528F);
      floatArray0[3] = 2.0F;
      floatArray0[4] = 1087.19F;
      floatArray0[5] = 900.0F;
      Color.getColor("L&D?@");
      systemColor0.getRGBColorComponents(floatArray0);
      jDayChooser0.setSundayForeground(systemColor0);
      KeyEvent keyEvent0 = null;
      try {
        keyEvent0 = new KeyEvent(jDayChooser0, 2417, 2417, 2417, 2417, 'w', 1277);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid keyLocation
         //
         verifyException("java.awt.event.KeyEvent", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.getSelectedDay();
      jDayChooser0.setEnabled(true);
      jDayChooser0.setAlwaysFireDayProperty(true);
      StyleContext styleContext0 = new StyleContext();
      DefaultStyledDocument defaultStyledDocument0 = new DefaultStyledDocument(styleContext0);
      Element element0 = defaultStyledDocument0.getCharacterElement(1007);
      LabelView labelView0 = new LabelView(element0);
      Font font0 = labelView0.getFont();
      jDayChooser0.setFont(font0);
      jDayChooser0.setDay((-900));
      Date date0 = null;
      // Undeclared exception!
      try { 
        Timestamp.valueOf("day");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Timestamp format must be yyyy-mm-dd hh:mm:ss[.fffffffff]
         //
         verifyException("java.sql.Timestamp", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.dayBordersVisible = true;
      jDayChooser0.isDoubleBuffered();
      jDayChooser0.getInputVerifier();
      JMonthChooser jMonthChooser0 = new JMonthChooser();
      jMonthChooser0.hasFocus();
      jMonthChooser0.setAutoscrolls(false);
      jDayChooser0.setMonthChooser(jMonthChooser0);
      jDayChooser0.setMaxDayCharacters((-204));
      jDayChooser0.setDayBordersVisible(false);
      jDayChooser0.setMinSelectableDate((Date) null);
      jDayChooser0.getLocale();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 2036, (-204), (-204), 594, 'E');
      jDayChooser0.keyTyped(keyEvent0);
      ImageCapabilities imageCapabilities0 = new ImageCapabilities(false);
      jDayChooser0.createVolatileImage((-1385), 594, imageCapabilities0);
      SystemColor systemColor0 = SystemColor.controlDkShadow;
      jDayChooser0.setForeground(systemColor0);
      jDayChooser0.initDecorations();
      FocusEvent focusEvent0 = new FocusEvent(jMonthChooser0, (-2341), true);
      jDayChooser0.focusGained(focusEvent0);
      assertFalse(jDayChooser0.isDayBordersVisible());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Date date0 = jDayChooser0.getMinSelectableDate();
      Time time0 = new Time(0L);
      jDayChooser0.setSelectableDateRange(date0, time0);
      jDayChooser0.setWeekOfYearVisible(true);
      jDayChooser0.getInputContext();
      int int0 = jDayChooser0.getDaysInMonth();
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(28, int0);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      System.setCurrentTimeMillis(0L);
      JDayChooser jDayChooser0 = new JDayChooser();
      MenuElement[] menuElementArray0 = new MenuElement[0];
      MenuSelectionManager menuSelectionManager0 = new MenuSelectionManager();
      MenuKeyEvent menuKeyEvent0 = new MenuKeyEvent(jDayChooser0, 35, (-610L), 35, 35, 'A', menuElementArray0, menuSelectionManager0);
      jDayChooser0.keyPressed(menuKeyEvent0);
      jDayChooser0.setYear(63706);
      assertEquals(31, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Color color0 = Color.green;
      float[] floatArray0 = new float[5];
      jDayChooser0.getDebugGraphicsOptions();
      Color.getColor("day");
      floatArray0[0] = 0.0F;
      floatArray0[1] = 2368.997F;
      floatArray0[2] = 2512.87F;
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "day");
      floatArray0[3] = (-504.38F);
      floatArray0[4] = (-1657.0F);
      color0.getColorComponents(floatArray0);
      jDayChooser0.setForeground(color0);
      jDayChooser0.setDay(32);
      JYearChooser jYearChooser0 = new JYearChooser();
      jDayChooser0.setYearChooser(jYearChooser0);
      jDayChooser0.setDay((-339));
      jDayChooser0.getSelectedDay();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "year";
      stringArray0[1] = "day";
      stringArray0[2] = "day";
      stringArray0[3] = "day";
      stringArray0[4] = "year";
      stringArray0[5] = "year";
      stringArray0[6] = "year";
      stringArray0[7] = "day";
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
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, true);
      JDayChooser jDayChooser0 = new JDayChooser();
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
  public void test12()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)25;
      byteArray0[1] = (byte) (-2);
      byteArray0[2] = (byte)124;
      byteArray0[3] = (byte)1;
      byteArray0[4] = (byte)29;
      byteArray0[5] = (byte) (-8);
      byteArray0[6] = (byte) (-88);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-399), 75, 75);
      jDayChooser0.setCalendar(mockGregorianCalendar0);
      Date date0 = jDayChooser0.getMaxSelectableDate();
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, 75, true, jDayChooser0);
      jDayChooser0.focusLost(focusEvent0);
      jDayChooser0.setSelectableDateRange(date0, (Date) null);
      jDayChooser0.setSelectableDateRange((Date) null, date0);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      MenuElement[] menuElementArray0 = new MenuElement[0];
      MenuSelectionManager menuSelectionManager0 = MenuSelectionManager.defaultManager();
      MenuKeyEvent menuKeyEvent0 = new MenuKeyEvent(jDayChooser0, (-849), 0L, (-849), (-849), 'p', menuElementArray0, menuSelectionManager0);
      jDayChooser0.keyPressed(menuKeyEvent0);
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      JSpinner jSpinner0 = new JSpinner();
      JSpinner.NumberEditor jSpinner_NumberEditor0 = new JSpinner.NumberEditor(jSpinner0, "");
      jDayChooser_DecoratorButton0.removeChangeListener(jSpinner_NumberEditor0);
      jDayChooser_DecoratorButton0.getActionMap();
      FileSystemHandling.shouldAllThrowIOExceptions();
      jDayChooser_DecoratorButton0.isFocusable();
      jDayChooser0.getUI();
      jDayChooser0.isDayBordersVisible();
      jDayChooser0.getDayPanel();
      jDayChooser0.isWeekOfYearVisible();
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      java.sql.Date date0 = new java.sql.Date(572L);
      Date date1 = jDayChooser0.setMaxSelectableDate(date0);
      System.setCurrentTimeMillis(572L);
      date0.clone();
      jDayChooser0.setDecorationBordersVisible(false);
      jDayChooser0.getSelectedDay();
      jDayChooser0.getWeekdayForeground();
      jDayChooser0.setWeekOfYearVisible(true);
      jDayChooser0.setSelectableDateRange(date1, date1);
      jDayChooser0.getMaxDayCharacters();
      JMonthChooser jMonthChooser0 = new JMonthChooser();
      jDayChooser0.setMonthChooser(jMonthChooser0);
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      Color color0 = defaultTreeCellRenderer0.getTextSelectionColor();
      float[] floatArray0 = new float[5];
      floatArray0[0] = (float) 572L;
      floatArray0[1] = (float) 572L;
      floatArray0[2] = (float) 0;
      floatArray0[3] = (float) 0;
      floatArray0[4] = (float) 572L;
      color0.getRGBComponents(floatArray0);
      jDayChooser0.setForeground(color0);
      InputSource inputSource0 = new InputSource();
      try { 
        XmlDocument.createXmlDocument(inputSource0, true);
        fail("Expecting exception: SAXParseException");
      
      } catch(SAXParseException e) {
         //
         // java.lang.NullPointerException
         //
         verifyException("org.apache.crimson.parser.Parser2", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getFocusTraversalPolicy();
      jDayChooser0.getMaxSelectableDate();
      jDayChooser0.setMaxDayCharacters((-342));
      SymbolTable symbolTable0 = null;
      try {
        symbolTable0 = new SymbolTable(3048, (-342));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Load: -342.0
         //
         verifyException("org.apache.xerces.util.SymbolTable", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      MenuElement[] menuElementArray0 = new MenuElement[0];
      MenuSelectionManager menuSelectionManager0 = MenuSelectionManager.defaultManager();
      MenuKeyEvent menuKeyEvent0 = new MenuKeyEvent(jDayChooser0, 17, (-4858L), 727, 195, 'k', menuElementArray0, menuSelectionManager0);
      InputEvent.getModifiersExText(3728);
      jDayChooser0.keyReleased(menuKeyEvent0);
      PlainDocument plainDocument0 = new PlainDocument();
      Element element0 = plainDocument0.getDefaultRootElement();
      LabelView labelView0 = new LabelView(element0);
      labelView0.getChildAllocation(1956, (Shape) null);
      // Undeclared exception!
      try { 
        labelView0.getFont();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // LabelView needs StyledDocument
         //
         verifyException("javax.swing.text.LabelView", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.isValidateRoot();
      jDayChooser0.getLocale();
      jDayChooser0.getSelectedDay();
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isWeekOfYearVisible());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      KeyStroke.getKeyStroke("day");
      Character character0 = new Character(',');
      Character.lowSurrogate((-964));
      AWTKeyStroke.getAWTKeyStroke(character0, 4);
      AWTKeyStroke.getAWTKeyStroke(4, 63195);
      Character character1 = new Character('2');
      AWTKeyStroke.getAWTKeyStroke(character1, 1116);
      jDayChooser0.getConditionForKeyStroke((KeyStroke) null);
      jDayChooser0.isOptimizedDrawingEnabled();
      jDayChooser0.isDecorationBackgroundVisible();
      jDayChooser0.drawWeeks();
      jDayChooser0.setWeekOfYearVisible(true);
      jDayChooser0.getDaysInMonth();
      jDayChooser0.setMaxDayCharacters(65500);
      MenuSelectionManager menuSelectionManager0 = MenuSelectionManager.defaultManager();
      MenuKeyEvent menuKeyEvent0 = new MenuKeyEvent(jDayChooser0, 12, (-547L), 12, 1532, 'X', (MenuElement[]) null, menuSelectionManager0);
      jDayChooser0.keyTyped(menuKeyEvent0);
      assertTrue(jDayChooser0.isWeekOfYearVisible());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.createVolatileImage(6, 5463);
      jDayChooser0.isWeekOfYearVisible();
      jDayChooser0.isDecorationBordersVisible();
      jDayChooser0.initDecorations();
      JMonthChooser jMonthChooser0 = new JMonthChooser(true);
      jDayChooser0.monthChooser = jMonthChooser0;
      JYearChooser jYearChooser0 = new JYearChooser();
      jDayChooser0.yearChooser = jYearChooser0;
      jDayChooser0.setSundayForeground((Color) null);
      jDayChooser0.setDecorationBackgroundVisible(false);
      jDayChooser0.setWeekOfYearVisible(false);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.createToolTip();
      jDayChooser0.getMaxDayCharacters();
      System.setCurrentTimeMillis(0);
      jDayChooser0.getDecorationBackgroundColor();
      JDayChooser jDayChooser1 = new JDayChooser();
      jDayChooser1.getInputVerifier();
      jDayChooser0.setInputVerifier((InputVerifier) null);
      jDayChooser0.getName();
      jDayChooser0.setAlwaysFireDayProperty(false);
      MockSimpleDateFormat mockSimpleDateFormat0 = null;
      try {
        mockSimpleDateFormat0 = new MockSimpleDateFormat("zArn");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'A'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getAccessibleContext();
      jDayChooser0.getMaxSelectableDate();
      System.setCurrentTimeMillis(50L);
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
  public void test23()  throws Throwable  {
      String[] stringArray0 = new String[0];
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
  public void test24()  throws Throwable  {
      boolean boolean0 = true;
      JDayChooser jDayChooser0 = new JDayChooser(true);
      MockDate mockDate0 = new MockDate();
      mockDate0.toInstant();
      Timestamp timestamp0 = new Timestamp(0L);
      timestamp0.toLocalDateTime();
      mockDate0.after(timestamp0);
      mockDate0.toInstant();
      jDayChooser0.setWeekOfYearVisible(true);
      jDayChooser0.setMaxSelectableDate(mockDate0);
      CachedImageHandlerBase64Encoder cachedImageHandlerBase64Encoder0 = new CachedImageHandlerBase64Encoder();
      MetalDesktopIconUI metalDesktopIconUI0 = new MetalDesktopIconUI();
      // Undeclared exception!
      try { 
        metalDesktopIconUI0.getMinimumSize(jDayChooser0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.swing.plaf.metal.MetalDesktopIconUI", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.isWeekOfYearVisible();
      jDayChooser0.getY();
      int int0 = 1031;
      jDayChooser0.setMaxDayCharacters(1031);
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
  public void test26()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      boolean boolean0 = true;
      jDayChooser0.setDecorationBackgroundVisible(true);
      jDayChooser0.drawDays();
      JYearChooser jYearChooser0 = jDayChooser0.yearChooser;
      jDayChooser0.setYearChooser((JYearChooser) null);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.transferFocusDownCycle();
      jDayChooser_DecoratorButton0.getGraphics();
      jDayChooser_DecoratorButton0.paint((Graphics) null);
      jDayChooser0.setYearChooser((JYearChooser) null);
      Color color0 = null;
      jDayChooser0.setSundayForeground((Color) null);
      Frame frame0 = null;
      try {
        frame0 = new Frame("year");
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getDaysInMonth();
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, 28, false, jDayChooser0);
      jDayChooser0.focusGained(focusEvent0);
      jDayChooser0.setAlwaysFireDayProperty(false);
      Date date0 = jDayChooser0.getMinSelectableDate();
      jDayChooser0.setMinSelectableDate(date0);
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      try { 
        jDayChooser0.getMousePosition();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.Component", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.setDecorationBackgroundVisible(false);
      jDayChooser0.setDay((-752));
      assertFalse(jDayChooser0.isDecorationBackgroundVisible());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getLocale();
      Color color0 = Color.LIGHT_GRAY;
      float[] floatArray0 = new float[1];
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, true);
      float float0 = 1.0F;
      // Undeclared exception!
      try { 
        color0.getRGBComponents(floatArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("java.awt.Color", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      System.setCurrentTimeMillis((-1L));
      boolean boolean0 = true;
      JDayChooser jDayChooser0 = new JDayChooser(true);
      JYearChooser jYearChooser0 = new JYearChooser();
      jDayChooser0.yearChooser = jYearChooser0;
      JYearChooser jYearChooser1 = new JYearChooser();
      AffineTransform affineTransform0 = AffineTransform.getRotateInstance(462.59976418, (-59.5), 462.59976418, 462.59976418);
      GraphicContext graphicContext0 = new GraphicContext(affineTransform0);
      RenderingHints renderingHints0 = graphicContext0.getRenderingHints();
      RescaleOp rescaleOp0 = null;
      try {
        rescaleOp0 = new RescaleOp((float[]) null, (float[]) null, renderingHints0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.image.RescaleOp", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getWeekdayForeground();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, true);
      MenuElement[] menuElementArray0 = new MenuElement[1];
      JMenu jMenu0 = new JMenu();
      JMenuItem jMenuItem0 = jMenu0.add("0l2i_\"UXpu");
      menuElementArray0[0] = (MenuElement) jMenuItem0;
      MenuSelectionManager menuSelectionManager0 = MenuSelectionManager.defaultManager();
      MenuKeyEvent menuKeyEvent0 = new MenuKeyEvent(jDayChooser0, 1031, 1534L, 9758, 37, '<', menuElementArray0, menuSelectionManager0);
      jDayChooser0.keyPressed(menuKeyEvent0);
      DefaultErrorHandler defaultErrorHandler0 = new DefaultErrorHandler(false);
      StylesheetRoot stylesheetRoot0 = new StylesheetRoot(defaultErrorHandler0);
      StylesheetComposed stylesheetComposed0 = new StylesheetComposed(stylesheetRoot0);
      ImageHandlerPNGEncoder imageHandlerPNGEncoder0 = null;
      try {
        imageHandlerPNGEncoder0 = new ImageHandlerPNGEncoder("u56w,oHPRENGLlP^*Sp", "u56w,oHPRENGLlP^*Sp");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // imageDir does not exist
         //
         verifyException("org.apache.batik.svggen.AbstractImageHandlerEncoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JMonthChooser jMonthChooser0 = new JMonthChooser();
      jDayChooser0.setMonthChooser(jMonthChooser0);
      jDayChooser0.setWeekOfYearVisible(false);
      jDayChooser0.updateUI();
      JDayChooser jDayChooser1 = new JDayChooser();
      jDayChooser0.setComponentOrientation((ComponentOrientation) null);
      Color color0 = jDayChooser1.getDecorationBackgroundColor();
      float[] floatArray0 = new float[6];
      floatArray0[0] = 0.0F;
      floatArray0[1] = (-1578.777F);
      floatArray0[2] = (-1033.6697F);
      floatArray0[3] = 2147.0F;
      floatArray0[4] = 3969.4F;
      floatArray0[5] = (-1.0F);
      color0.getRGBColorComponents(floatArray0);
      jDayChooser0.setDecorationBackgroundColor(color0);
      assertTrue(jDayChooser1.isDayBordersVisible());
      assertEquals(14, jDayChooser1.getDay());
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "m>/ut3");
      jDayChooser0.repaint(0L, (-815), (-516), 2662, (-1012));
      jDayChooser0.paintImmediately(2662, 2662, 2662, (-720));
      jDayChooser0.getDaysInMonth();
      Font font0 = Font.decode("day");
      jDayChooser0.setFont(font0);
      jDayChooser0.setDecorationBordersVisible(false);
      boolean boolean0 = jDayChooser0.isDayBordersVisible();
      assertTrue(boolean0);
      
      jDayChooser0.drawWeeks();
      jDayChooser0.getSundayForeground();
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      JDayChooser jDayChooser0 = new JDayChooser(true);
      int int0 = 181;
      jDayChooser0.setMonth(181);
      jDayChooser0.getDaysInMonth();
      ActionEvent actionEvent0 = new ActionEvent(jDayChooser0, 28, "4", 28, 181);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      actionEvent0.setSource("4");
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
  public void test36()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      SystemColor systemColor0 = SystemColor.controlLtHighlight;
      jDayChooser0.setWeekdayForeground(systemColor0);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "3(\"Js\">)lt[");
      jDayChooser0.drawDays();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      SystemColor systemColor1 = SystemColor.activeCaption;
      float[] floatArray0 = new float[1];
      NetworkHandling.sendMessageOnTcp((EvoSuiteLocalAddress) null, "HTMLParagraphElementImpl");
      floatArray0[0] = 0.072F;
      // Undeclared exception!
      try { 
        ColorSpace.getInstance(33);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown color space
         //
         verifyException("java.awt.color.ColorSpace", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)4;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-1);
      NetworkHandling.sendDataOnTcp((EvoSuiteLocalAddress) null, byteArray0);
      JDayChooser jDayChooser0 = new JDayChooser();
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("day");
      mockSimpleDateFormat0.applyPattern("day");
      Calendar calendar0 = mockSimpleDateFormat0.getCalendar();
      jDayChooser0.setCalendar(calendar0);
      // Undeclared exception!
      try { 
        MockLocalTime.of((-1866), (-1866), (-1866));
        fail("Expecting exception: DateTimeException");
      
      } catch(DateTimeException e) {
         //
         // Invalid value for HourOfDay (valid values 0 - 23): -1866
         //
         verifyException("java.time.temporal.ValueRange", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.firePropertyChange((String) null, 0.0F, 0.0F);
      jDayChooser0.setEnabled(true);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }
}
