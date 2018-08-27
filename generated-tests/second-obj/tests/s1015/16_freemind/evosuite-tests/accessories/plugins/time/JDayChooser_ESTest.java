/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 03:29:52 GMT 2018
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
import freemind.view.mindmapview.MultipleImage;
import java.awt.AWTEventMulticaster;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.ImageCapabilities;
import java.awt.Panel;
import java.awt.Point;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.HierarchyListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseWheelListener;
import java.beans.PropertyChangeListener;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.swing.JApplet;
import javax.swing.JComponent;
import javax.swing.JEditorPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.MenuElement;
import javax.swing.MenuSelectionManager;
import javax.swing.border.LineBorder;
import javax.swing.event.MenuKeyEvent;
import javax.swing.plaf.synth.SynthScrollPaneUI;
import javax.swing.text.DefaultCaret;
import org.apache.batik.apps.svgbrowser.JSVGViewerFrame;
import org.apache.batik.css.parser.CSSLexicalUnit;
import org.apache.fop.image.FopImage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.openstreetmap.gui.jmapviewer.JMapViewer;
import plugins.map.MapDialog;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JDayChooser_ESTest extends JDayChooser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Color color0 = jDayChooser0.getDecorationBackgroundColor();
      assertEquals(14, jDayChooser0.getDay());
      assertEquals(228, color0.getGreen());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.isDecorationBordersVisible();
      assertTrue(jDayChooser0.isWeekOfYearVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.isDecorationBackgroundVisible();
      jDayChooser0.getDayPanel();
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isWeekOfYearVisible());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getHierarchyListeners();
      jDayChooser0.isDayBordersVisible();
      jDayChooser0.getSundayForeground();
      jDayChooser0.setFocus();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          JDayChooser jDayChooser0 = new JDayChooser(true);
          JComponent.isLightweightComponent(jDayChooser0);
          jDayChooser0.setYear(119);
          jDayChooser0.getDay();
          jDayChooser0.setWeekOfYearVisible(false);
          jDayChooser0.setFocus();
          JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
          jDayChooser_DecoratorButton0.getAutoscrolls();
          KeyEvent keyEvent0 = new KeyEvent(jDayChooser_DecoratorButton0, 2070, 0L, 119, 4, '|');
          keyEvent0.paramString();
          SynthScrollPaneUI synthScrollPaneUI0 = new SynthScrollPaneUI();
          keyEvent0.setSource(synthScrollPaneUI0);
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      int int0 = (-41);
      jDayChooser0.setDay((-41));
      MapDialog mapDialog0 = new MapDialog();
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
  public void test06()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      FileSystemHandling.shouldAllThrowIOExceptions();
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, 8827, true);
      focusEvent0.getOppositeComponent();
      jDayChooser0.focusGained(focusEvent0);
      jDayChooser0.getDay();
      jDayChooser0.isDayBordersVisible();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JYearChooser jYearChooser0 = jDayChooser0.yearChooser;
      jDayChooser0.setYearChooser((JYearChooser) null);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, (-96), 1702L, 4787, 1742, '/');
      jDayChooser0.keyTyped(keyEvent0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, (-342), (-342), (-342), 0, 'Q');
      keyEvent0.getExtendedKeyCode();
      jDayChooser0.setWeekOfYearVisible(false);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.enableInputMethods(true);
      MenuElement[] menuElementArray0 = new MenuElement[1];
      MultipleImage multipleImage0 = new MultipleImage(0.0);
      JRadioButtonMenuItem jRadioButtonMenuItem0 = new JRadioButtonMenuItem(multipleImage0);
      jRadioButtonMenuItem0.setContentAreaFilled(false);
      menuElementArray0[0] = (MenuElement) jRadioButtonMenuItem0;
      MenuSelectionManager menuSelectionManager0 = new MenuSelectionManager();
      menuSelectionManager0.getSelectedPath();
      MenuKeyEvent menuKeyEvent0 = new MenuKeyEvent(jDayChooser0, 9800, 9800, (-762), (-1380), 'J', menuElementArray0, menuSelectionManager0);
      jRadioButtonMenuItem0.setRolloverIcon(multipleImage0);
      menuKeyEvent0.getExtendedKeyCode();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      jDayChooser0.keyReleased(menuKeyEvent0);
      jDayChooser0.isDecorationBordersVisible();
      ActionEvent actionEvent0 = new ActionEvent(multipleImage0, 2266, "attribute_delete_value");
      // Undeclared exception!
      try { 
        jDayChooser0.actionPerformed(actionEvent0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // freemind.view.mindmapview.MultipleImage cannot be cast to javax.swing.JButton
         //
         verifyException("accessories.plugins.time.JDayChooser", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[19];
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getMinSelectableDate();
      jDayChooser0.isDayBordersVisible();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      ImageCapabilities imageCapabilities0 = new ImageCapabilities(false);
      Color color0 = jDayChooser0.getWeekdayForeground();
      jDayChooser0.removeMouseWheelListener((MouseWheelListener) null);
      jDayChooser0.setSundayForeground(color0);
      jDayChooser0.getSelectedDay();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setMaxDayCharacters((-41));
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setWeekOfYearVisible(true);
      jDayChooser0.setOpaque(true);
      jDayChooser0.setEnabled(false);
      Point point0 = new Point(450, 450);
      Color color0 = Color.GRAY;
      GradientPaint gradientPaint0 = new GradientPaint(point0, color0, point0, color0, false);
      Color color1 = gradientPaint0.getColor1();
      LineBorder lineBorder0 = new LineBorder(color1, 450);
      Color color2 = lineBorder0.getLineColor();
      jDayChooser0.setWeekdayForeground(color2);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.getGraphics();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.paint((Graphics) null);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 5, 5, 1624, 6, 'Q');
      jDayChooser0.keyReleased(keyEvent0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getHierarchyListeners();
      jDayChooser0.isDayBordersVisible();
      jDayChooser0.getSundayForeground();
      Locale locale0 = Locale.ENGLISH;
      jDayChooser0.setLocale(locale0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.getWeekdayForeground();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          JDayChooser jDayChooser0 = new JDayChooser();
          jDayChooser0.getHierarchyListeners();
          FileSystemHandling.shouldAllThrowIOExceptions();
          jDayChooser0.getSundayForeground();
          jDayChooser0.setFocus();
          JMonthChooser jMonthChooser0 = new JMonthChooser();
          jDayChooser0.setMonthChooser(jMonthChooser0);
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "3");
      DefaultCaret defaultCaret0 = new DefaultCaret();
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getDaysInMonth();
      jDayChooser0.getMaxDayCharacters();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      JDayChooser jDayChooser0 = new JDayChooser(true);
      Locale locale0 = Locale.US;
      locale0.getScript();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      jDayChooser0.setCalendar(mockGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 2133, 0L, (-41), 'U', 'U');
      Panel panel0 = new Panel();
      jDayChooser0.keyPressed(keyEvent0);
      jDayChooser0.setMaxDayCharacters(3);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser0.setMaxDayCharacters(4);
      jDayChooser0.createToolTip();
      jDayChooser0.getMaxSelectableDate();
      FopImage.ImageInfo fopImage_ImageInfo0 = new FopImage.ImageInfo();
      JYearChooser jYearChooser0 = jDayChooser0.yearChooser;
      fopImage_ImageInfo0.dpiVertical = (double) 4;
      jDayChooser0.setWeekdayForeground((Color) null);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getX();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "27");
      InputEvent.getModifiersExText(1656);
      jDayChooser0.initDecorations();
      Date date0 = jDayChooser0.getMaxSelectableDate();
      jDayChooser0.setMinSelectableDate(date0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, (-34), (-342), (-342), 29, 'U');
      jDayChooser0.setDay(554);
      KeyEvent keyEvent1 = new KeyEvent(jDayChooser0, 1286, 2000L, 40, 1000000, '[');
      jDayChooser0.keyPressed(keyEvent1);
      jDayChooser0.getLocale();
      jDayChooser0.setMonth((-342));
      jDayChooser0.isWeekOfYearVisible();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      Date date0 = jDayChooser0.maxSelectableDate;
      jDayChooser0.setMaxSelectableDate(date0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.setEnabled(false);
      jDayChooser0.getSundayForeground();
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      SystemColor systemColor0 = SystemColor.info;
      systemColor0.darker();
      JYearChooser jYearChooser0 = jDayChooser0.yearChooser;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Date date1 = jDayChooser0.setMinSelectableDate(date0);
      jDayChooser0.drawWeeks();
      jDayChooser0.isWeekOfYearVisible();
      jDayChooser0.setSelectableDateRange(date1, date0);
      jDayChooser0.setYearChooser((JYearChooser) null);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser0.getGraphics();
      jDayChooser_DecoratorButton0.printAll((Graphics) null);
      jDayChooser_DecoratorButton0.isFocusable();
      jDayChooser0.setFocus();
      jDayChooser0.setSelectableDateRange((Date) null, (Date) null);
      jDayChooser0.drawDays();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.setEnabled(false);
      jDayChooser0.getSundayForeground();
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      SystemColor systemColor0 = SystemColor.info;
      systemColor0.darker();
      JYearChooser jYearChooser0 = jDayChooser0.yearChooser;
      jDayChooser0.setMonth(496);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(22, (-6), (-6), 364, 6, (-6));
      Date date0 = mockGregorianCalendar1.getGregorianChange();
      MockDate mockDate0 = new MockDate(6, (-3012), 496);
      Date date1 = jDayChooser0.setMinSelectableDate(mockDate0);
      jDayChooser0.drawWeeks();
      jDayChooser0.isWeekOfYearVisible();
      jDayChooser0.setSelectableDateRange(date1, date0);
      jDayChooser0.setYearChooser((JYearChooser) null);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser0.setDay(24);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 40, 2L, 40, 40, '8');
      jDayChooser0.keyPressed(keyEvent0);
      Locale locale0 = Locale.ENGLISH;
      KeyEvent.getKeyModifiersText(40);
      // Undeclared exception!
      try { 
        jDayChooser0.getInputMap(24);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // condition must be one of JComponent.WHEN_IN_FOCUSED_WINDOW, JComponent.WHEN_FOCUSED or JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT
         //
         verifyException("javax.swing.JComponent", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)2;
      byteArray0[1] = (byte)79;
      byteArray0[2] = (byte) (-108);
      byteArray0[3] = (byte)2;
      byteArray0[4] = (byte)10;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.isWeekOfYearVisible();
      JMonthChooser jMonthChooser0 = jDayChooser0.monthChooser;
      jDayChooser0.setMonthChooser((JMonthChooser) null);
      jDayChooser0.getDay();
      jDayChooser0.getWeekdayForeground();
      jDayChooser0.setAlwaysFireDayProperty(true);
      jDayChooser0.setDay((byte)10);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      JMapViewer jMapViewer0 = new JMapViewer();
      jDayChooser0.getMouseWheelListeners();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser_DecoratorButton0, 43, 1289L, 2384, (-1260), 'x');
      KeyEvent keyEvent1 = new KeyEvent(jDayChooser0, 43, 4130L, 0, 36, '[');
      jDayChooser0.keyPressed(keyEvent1);
      jDayChooser0.setMaxSelectableDate((Date) null);
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser_DecoratorButton0, 0);
      FocusEvent focusEvent1 = new FocusEvent(jDayChooser_DecoratorButton0, (-7));
      JApplet jApplet0 = null;
      try {
        jApplet0 = new JApplet();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.applet.Applet", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setMinSelectableDate((Date) null);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      JDayChooser jDayChooser0 = new JDayChooser();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "X");
      jDayChooser0.transferFocusUpCycle();
      jDayChooser0.setInheritsPopupMenu(false);
      jDayChooser0.setAlwaysFireDayProperty(true);
      jDayChooser0.drawDays();
      jDayChooser0.getWeekdayForeground();
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, 37, false);
      focusEvent0.paramString();
      jDayChooser0.focusLost(focusEvent0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Locale locale0 = Locale.UK;
      Locale.getISOCountries();
      jDayChooser0.setDay(5);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 35, 5, (-193), 35, 'K');
      jDayChooser0.keyPressed(keyEvent0);
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, (-325));
      jDayChooser0.focusGained(focusEvent0);
      jDayChooser0.addListeners(5);
      jDayChooser0.getMinSelectableDate();
      jDayChooser0.setDayBordersVisible(true);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Locale locale0 = Locale.UK;
      String[] stringArray0 = Locale.getISOCountries();
      Locale locale1 = new Locale("/bo", "/bo", "/bo");
      locale1.getDisplayVariant(locale0);
      locale0.getUnicodeLocaleAttributes();
      locale1.getUnicodeLocaleAttributes();
      Locale.setDefault(locale1);
      String string0 = CSSLexicalUnit.UNIT_TEXT_KILOHERTZ;
      jDayChooser0.setLocale(locale0);
      jDayChooser0.transferFocus();
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      Locale.forLanguageTag("2");
      jDayChooser0.addPropertyChangeListener("/bo", (PropertyChangeListener) null);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 5, 11L, 98314, 38, 'u');
      keyEvent0.setSource((Object) null);
      jDayChooser0.keyPressed(keyEvent0);
      jDayChooser0.setMaxDayCharacters(38);
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
  public void test36()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Locale locale0 = Locale.UK;
      Locale.getISOCountries();
      Color color0 = Color.red;
      Color color1 = Color.getColor("day", color0);
      jDayChooser0.setSundayForeground(color0);
      Locale locale1 = new Locale("/bo", "/bo", "/bo");
      locale1.getDisplayVariant(locale0);
      locale1.getUnicodeLocaleAttributes();
      locale1.getUnicodeLocaleAttributes();
      Locale.setDefault(locale1);
      String string0 = CSSLexicalUnit.UNIT_TEXT_KILOHERTZ;
      jDayChooser0.setLocale(locale0);
      jDayChooser0.transferFocus();
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      Locale locale2 = Locale.forLanguageTag("2");
      jDayChooser0.addPropertyChangeListener("/bo", (PropertyChangeListener) null);
      HierarchyListener hierarchyListener0 = mock(HierarchyListener.class, new ViolatedAssumptionAnswer());
      HierarchyListener hierarchyListener1 = mock(HierarchyListener.class, new ViolatedAssumptionAnswer());
      HierarchyListener hierarchyListener2 = AWTEventMulticaster.add(hierarchyListener0, hierarchyListener1);
      AWTEventMulticaster.remove(hierarchyListener2, hierarchyListener2);
      AWTEventMulticaster.add((HierarchyListener) null, (HierarchyListener) null);
      AWTEventMulticaster.remove((HierarchyListener) null, (HierarchyListener) null);
      AWTEventMulticaster.add(hierarchyListener2, hierarchyListener2);
      Locale locale3 = new Locale("2");
      Locale.setDefault(locale2);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale3);
      Boolean boolean0 = new Boolean("?pTAV,x]E");
      Color color2 = Color.YELLOW;
      jDayChooser0.setDecorationBackgroundColor(color1);
      jDayChooser0.setMonth(1616);
      // Undeclared exception!
      try { 
        jDayChooser0.addListeners(2320);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2320
         //
         verifyException("accessories.plugins.time.JDayChooser", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      jDayChooser0.setDay(68);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 40, 68, 40, 40, '[');
      Locale locale0 = Locale.JAPAN;
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      jDayChooser0.getMouseMotionListeners();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "o*<k}}");
      Boolean boolean0 = new Boolean(false);
      KeyEvent keyEvent1 = new KeyEvent(jDayChooser_DecoratorButton0, 40, 604800000L, 34, 34, '>');
      // Undeclared exception!
      try { 
        jDayChooser0.keyPressed(keyEvent1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("accessories.plugins.time.JDayChooser", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      Cursor cursor0 = JSVGViewerFrame.WAIT_CURSOR;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "day");
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      jDayChooser0.initialized = false;
      jDayChooser0.setCursor(cursor0);
      jDayChooser0.getFont();
      jDayChooser0.setFont((Font) null);
      jDayChooser0.setFocus();
      Locale locale0 = null;
      jDayChooser0.setLocale((Locale) null);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)70;
      byteArray0[1] = (byte) (-120);
      byteArray0[2] = (byte)127;
      byteArray0[3] = (byte) (-66);
      byteArray0[4] = (byte) (-87);
      byteArray0[5] = (byte)3;
      byteArray0[6] = (byte) (-114);
      byteArray0[7] = (byte)87;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      KeyEvent keyEvent0 = null;
      try {
        keyEvent0 = new KeyEvent(jDayChooser0, 699, 732L, 699, 699, 'q', (-428));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid keyLocation
         //
         verifyException("java.awt.event.KeyEvent", e);
      }
  }
}