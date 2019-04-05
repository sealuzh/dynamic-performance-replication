/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 16:35:09 GMT 2019
 */

package org.apache.commons.imaging.common.mylzw;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
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
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor((-3), byteOrder0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      MyLzwDecompressor.Listener myLzwDecompressor_Listener0 = mock(MyLzwDecompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor((-1), byteOrder0, myLzwDecompressor_Listener0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
      try { 
        myLzwDecompressor0.decompress(bufferedInputStream0, 0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Bad Code: -1 codes: -2147483646 code_size: 0, table: 4096
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwDecompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(2790, byteOrder0);
      // Undeclared exception!
      try { 
        myLzwDecompressor0.decompress((InputStream) null, 2790);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyBitInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor((-1), (ByteOrder) null);
      // Undeclared exception!
      try { 
        myLzwDecompressor0.decompress((InputStream) null, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative initial size: -1
         //
         verifyException("java.io.ByteArrayOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MyLzwDecompressor.Listener myLzwDecompressor_Listener0 = mock(MyLzwDecompressor.Listener.class, new ViolatedAssumptionAnswer());
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1), 2662);
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(969, (ByteOrder) null, myLzwDecompressor_Listener0);
      // Undeclared exception!
      try { 
        myLzwDecompressor0.decompress(byteArrayInputStream0, (byte)115);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      MyLzwDecompressor.Listener myLzwDecompressor_Listener0 = mock(MyLzwDecompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwDecompressor myLzwDecompressor0 = null;
      try {
        myLzwDecompressor0 = new MyLzwDecompressor(12, byteOrder0, myLzwDecompressor_Listener0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(10, byteOrder0);
      MyLzwDecompressor myLzwDecompressor1 = new MyLzwDecompressor(10, byteOrder0);
      MyLzwDecompressor myLzwDecompressor2 = new MyLzwDecompressor(4082, byteOrder0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      MyLzwDecompressor myLzwDecompressor0 = null;
      try {
        myLzwDecompressor0 = new MyLzwDecompressor((-11), byteOrder0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MyLzwDecompressor.Listener myLzwDecompressor_Listener0 = mock(MyLzwDecompressor.Listener.class, new ViolatedAssumptionAnswer());
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)101;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, 2);
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor((byte)0, (ByteOrder) null, myLzwDecompressor_Listener0);
      byte[] byteArray1 = myLzwDecompressor0.decompress(byteArrayInputStream0, 1);
      assertArrayEquals(new byte[] {(byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MyLzwDecompressor.Listener myLzwDecompressor_Listener0 = mock(MyLzwDecompressor.Listener.class, new ViolatedAssumptionAnswer());
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)115;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, 2);
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor((byte)0, (ByteOrder) null, myLzwDecompressor_Listener0);
      byte[] byteArray1 = myLzwDecompressor0.decompress(byteArrayInputStream0, (byte)0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byteArray0[0] = (byte)115;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(1, (ByteOrder) null);
      byte[] byteArray1 = myLzwDecompressor0.decompress(byteArrayInputStream0, 1034);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MyLzwDecompressor.Listener myLzwDecompressor_Listener0 = mock(MyLzwDecompressor.Listener.class, new ViolatedAssumptionAnswer());
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, 2);
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor((byte)0, (ByteOrder) null, myLzwDecompressor_Listener0);
      myLzwDecompressor0.setTiffLZWMode();
      try { 
        myLzwDecompressor0.decompress(byteArrayInputStream0, (byte)39);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Bad Code: -1 codes: 3 code_size: 1, table: 4096
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwDecompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byteArray0[0] = (byte)115;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor((byte)0, (ByteOrder) null);
      try { 
        myLzwDecompressor0.decompress(byteArrayInputStream0, (byte)115);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // AddStringToTable: codes: 3 code_size: 1
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwDecompressor", e);
      }
  }
}
