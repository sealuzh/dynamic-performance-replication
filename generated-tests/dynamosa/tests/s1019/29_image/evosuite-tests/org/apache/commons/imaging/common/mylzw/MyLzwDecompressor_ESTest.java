/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 18:35:17 GMT 2019
 */

package org.apache.commons.imaging.common.mylzw;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.nio.ByteOrder;
import java.util.Enumeration;
import org.apache.commons.imaging.common.mylzw.MyLzwDecompressor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MyLzwDecompressor_ESTest extends MyLzwDecompressor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(418, byteOrder0);
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-79), 425);
      // Undeclared exception!
      try { 
        myLzwDecompressor0.decompress(byteArrayInputStream0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -79
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(2, (ByteOrder) null);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-18);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        myLzwDecompressor0.decompress(byteArrayInputStream0, 2);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Bad Code: -1 codes: 6 code_size: 3, table: 4096
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwDecompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor((-2275), (ByteOrder) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(1, byteOrder0);
      // Undeclared exception!
      try { 
        myLzwDecompressor0.decompress((InputStream) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyBitInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor((-2273), byteOrder0);
      // Undeclared exception!
      try { 
        myLzwDecompressor0.decompress((InputStream) null, (-2273));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative initial size: -2273
         //
         verifyException("java.io.ByteArrayOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(10, (ByteOrder) null);
      MyLzwDecompressor myLzwDecompressor1 = new MyLzwDecompressor(10, (ByteOrder) null);
      MyLzwDecompressor myLzwDecompressor2 = new MyLzwDecompressor(4053, (ByteOrder) null, (MyLzwDecompressor.Listener) null);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      MyLzwDecompressor.Listener myLzwDecompressor_Listener0 = mock(MyLzwDecompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwDecompressor myLzwDecompressor0 = null;
      try {
        myLzwDecompressor0 = new MyLzwDecompressor((-5135), byteOrder0, myLzwDecompressor_Listener0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      MyLzwDecompressor myLzwDecompressor0 = null;
      try {
        myLzwDecompressor0 = new MyLzwDecompressor((-2278), byteOrder0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(0, (ByteOrder) null);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)1;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byte[] byteArray1 = myLzwDecompressor0.decompress(byteArrayInputStream0, (byte)1);
      assertArrayEquals(new byte[] {(byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(2, (ByteOrder) null);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-20);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      myLzwDecompressor0.decompress(byteArrayInputStream0, 2);
      assertEquals(5, byteArrayInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(0, (ByteOrder) null);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)1;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byte[] byteArray1 = myLzwDecompressor0.decompress(byteArrayInputStream0, 0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(2, (ByteOrder) null);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-11);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byte[] byteArray1 = myLzwDecompressor0.decompress(byteArrayInputStream0, 2);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor((-2273), byteOrder0);
      try { 
        myLzwDecompressor0.decompress((InputStream) null, 12);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Bad Code: -1 codes: -2147483646 code_size: -2272, table: 4096
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwDecompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      MyLzwDecompressor.Listener myLzwDecompressor_Listener0 = mock(MyLzwDecompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(2, byteOrder0, myLzwDecompressor_Listener0);
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      try { 
        myLzwDecompressor0.decompress(sequenceInputStream0, 2);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Bad Code: -1 codes: 6 code_size: 3, table: 4096
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwDecompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(0, (ByteOrder) null);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)13;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        myLzwDecompressor0.decompress(byteArrayInputStream0, (byte)13);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // AddStringToTable: codes: 3 code_size: 1
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwDecompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(2, (ByteOrder) null);
      myLzwDecompressor0.setTiffLZWMode();
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        myLzwDecompressor0.decompress(byteArrayInputStream0, 2);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Bad Code: -1 codes: 6 code_size: 3, table: 4096
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwDecompressor", e);
      }
  }
}
