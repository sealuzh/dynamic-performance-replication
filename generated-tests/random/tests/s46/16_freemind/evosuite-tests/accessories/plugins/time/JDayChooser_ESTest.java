/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 07:27:59 GMT 2019
 */

package accessories.plugins.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import accessories.plugins.time.JDayChooser;
import accessories.plugins.time.JMonthChooser;
import accessories.plugins.time.JYearChooser;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.sql.Time;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.MenuElement;
import javax.swing.MenuSelectionManager;
import javax.swing.event.MenuKeyEvent;
import javax.swing.tree.DefaultTreeCellRenderer;
import org.apache.batik.svggen.SVGGeneratorContext;
import org.apache.batik.svggen.SVGGraphics2D;
import org.apache.xerces.dom.DocumentImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.time.MockLocalTime;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JDayChooser_ESTest extends JDayChooser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.initDecorations();
      assertTrue(jDayChooser0.isWeekOfYearVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.drawWeeks();
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.drawDays();
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JYearChooser jYearChooser0 = new JYearChooser();
      jDayChooser0.setYearChooser(jYearChooser0);
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.setYear(1822);
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.setMonthChooser((JMonthChooser) null);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JMonthChooser jMonthChooser0 = new JMonthChooser(false);
      jMonthChooser0.setFocusTraversalKeysEnabled(false);
      jDayChooser0.setMonthChooser(jMonthChooser0);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Color color0 = Color.RED;
      jDayChooser0.setForeground(color0);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      Color color0 = defaultTreeCellRenderer0.getTextSelectionColor();
      jDayChooser0.setForeground(color0);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setEnabled(false);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.setDecorationBordersVisible(false);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isWeekOfYearVisible());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      Color color0 = jDayChooser0.getBackground();
      jDayChooser0.setDecorationBackgroundColor(color0);
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setAlwaysFireDayProperty(false);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertFalse(jDayChooser0.isWeekOfYearVisible());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 30, 30, (-1089), 38, 'b');
      jDayChooser0.keyTyped(keyEvent0);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      JInternalFrame jInternalFrame0 = new JInternalFrame(":E%qw", false, false, true, true);
      KeyEvent keyEvent0 = new KeyEvent(jInternalFrame0, 1204, 0L, 1204, 333, 'M');
      jDayChooser0.keyTyped(keyEvent0);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertTrue(jDayChooser0.isWeekOfYearVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 1, (-1100L), 1, 1, 'M');
      jDayChooser0.keyReleased(keyEvent0);
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, (-1875), false, jDayChooser0);
      jDayChooser0.focusLost(focusEvent0);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, 1736, true);
      jDayChooser0.focusGained(focusEvent0);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      JInternalFrame jInternalFrame0 = new JInternalFrame(":E%qw", false, false, true, true);
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, (-1216), true, jInternalFrame0);
      jDayChooser0.focusGained(focusEvent0);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isWeekOfYearVisible());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      
      jDayChooser0.updateUI();
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setDayBordersVisible(false);
      jDayChooser0.isDayBordersVisible();
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.setFocus();
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.setForeground((Color) null);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.setFont((Font) null);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setAlwaysFireDayProperty(true);
      jDayChooser0.setDay(14);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setDecorationBackgroundVisible(true);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      int int0 = jDayChooser0.getDay();
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.setDecorationBordersVisible(true);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertTrue(jDayChooser0.isWeekOfYearVisible());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
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
  public void test29()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.addListeners(28);
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.getDaysInMonth();
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      DocumentImpl documentImpl0 = new DocumentImpl(false);
      SVGGeneratorContext sVGGeneratorContext0 = SVGGeneratorContext.createDefault(documentImpl0);
      SVGGraphics2D sVGGraphics2D0 = new SVGGraphics2D(sVGGeneratorContext0, false);
      jDayChooser_DecoratorButton0.paint(sVGGraphics2D0);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.setMaxDayCharacters(40);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(0, jDayChooser0.getMaxDayCharacters());
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.setMaxDayCharacters((-1424));
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.setMaxDayCharacters(0);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setMinSelectableDate((Date) null);
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      Date date0 = jDayChooser0.getMinSelectableDate();
      jDayChooser0.setMinSelectableDate(date0);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertTrue(jDayChooser0.isWeekOfYearVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.setMaxSelectableDate((Date) null);
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      Date date0 = jDayChooser0.getMaxSelectableDate();
      jDayChooser0.setMaxSelectableDate(date0);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.setSelectableDateRange((Date) null, (Date) null);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      ZoneId zoneId0 = ZoneId.systemDefault();
      LocalTime localTime0 = MockLocalTime.now(zoneId0);
      Time time0 = Time.valueOf(localTime0);
      jDayChooser0.setSelectableDateRange((Date) null, time0);
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Color color0 = Color.GRAY;
      jDayChooser0.setDecorationBackgroundColor(color0);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setWeekOfYearVisible(false);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setWeekOfYearVisible(true);
      assertTrue(jDayChooser0.isWeekOfYearVisible());
      
      jDayChooser0.setWeekOfYearVisible(false);
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.setEnabled(true);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 0, 0L, 0, 0, '!');
      jDayChooser0.keyPressed(keyEvent0);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      MenuElement[] menuElementArray0 = new MenuElement[2];
      MenuSelectionManager menuSelectionManager0 = new MenuSelectionManager();
      MenuKeyEvent menuKeyEvent0 = new MenuKeyEvent(jDayChooser0, 40, 0L, 40, 40, 'w', menuElementArray0, menuSelectionManager0);
      jDayChooser0.keyPressed(menuKeyEvent0);
      assertEquals(21, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 30, 30, (-1089), 38, 'b');
      jDayChooser0.keyPressed(keyEvent0);
      assertEquals(7, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      System.setCurrentTimeMillis((-243L));
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setMonth(331);
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setMonth(46);
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      assertEquals(14, jDayChooser0.getDay());
      
      jDayChooser0.setDay(65487);
      assertEquals(28, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      assertEquals(14, jDayChooser0.getDay());
      
      jDayChooser0.setDay((-1));
      assertEquals(1, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.initialized = false;
      Locale locale0 = Locale.ROOT;
      jDayChooser0.setLocale(locale0);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      Locale locale0 = Locale.FRENCH;
      jDayChooser0.setLocale(locale0);
      jDayChooser0.setYear(0);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.setMaxDayCharacters(3);
      assertEquals(3, jDayChooser0.getMaxDayCharacters());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.maxDayCharacters = 8203;
      jDayChooser0.init();
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.keyTyped((KeyEvent) null);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      TimeZone timeZone0 = TimeZone.getTimeZone("day");
      Calendar calendar0 = MockCalendar.getInstance(timeZone0);
      jDayChooser0.setCalendar(calendar0);
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isWeekOfYearVisible());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.focusGained((FocusEvent) null);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      Date date0 = jDayChooser0.getMinSelectableDate();
      jDayChooser0.setSelectableDateRange(date0, date0);
      assertTrue(jDayChooser0.isWeekOfYearVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JMonthChooser jMonthChooser0 = new JMonthChooser(false);
      jDayChooser0.setMonthChooser(jMonthChooser0);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Color color0 = jDayChooser0.getWeekdayForeground();
      assertEquals((-16754012), color0.getRGB());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getDayPanel();
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JButton jButton0 = jDayChooser0.getSelectedDay();
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertNull(jButton0);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.keyReleased((KeyEvent) null);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setYearChooser((JYearChooser) null);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, 34, true, jDayChooser0);
      jDayChooser0.focusLost(focusEvent0);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Color color0 = Color.LIGHT_GRAY;
      jDayChooser0.setSundayForeground(color0);
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.getDecorationBackgroundColor();
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      String[] stringArray0 = new String[9];
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
  public void test70()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.getMaxDayCharacters();
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      SystemColor systemColor0 = SystemColor.infoText;
      jDayChooser0.setWeekdayForeground(systemColor0);
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getLocale();
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      boolean boolean0 = jDayChooser0.isDecorationBordersVisible();
      assertFalse(boolean0);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 1, (-1100L), 1, 1, 'M');
      ActionEvent actionEvent0 = new ActionEvent(keyEvent0, 1, "day", (-1100L), 1);
      // Undeclared exception!
      try { 
        jDayChooser0.actionPerformed(actionEvent0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.awt.event.KeyEvent cannot be cast to javax.swing.JButton
         //
         verifyException("accessories.plugins.time.JDayChooser", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.isDecorationBackgroundVisible();
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      Color color0 = jDayChooser0.getSundayForeground();
      assertEquals(14, jDayChooser0.getDay());
      assertEquals((-6029312), color0.getRGB());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.isDayBordersVisible();
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 49, 860L, 9, 34, '6');
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
  public void test79()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setAlwaysFireDayProperty(true);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 35, 35, 842, 35, ';');
      jDayChooser0.keyPressed(keyEvent0);
      assertEquals(28, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.isWeekOfYearVisible();
      assertEquals(14, jDayChooser0.getDay());
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.isFocusable();
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }
}
