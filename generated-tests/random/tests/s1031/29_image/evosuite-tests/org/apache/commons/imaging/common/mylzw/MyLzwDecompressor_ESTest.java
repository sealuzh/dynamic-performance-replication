/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 15:05:35 GMT 2019
 */

package org.apache.commons.imaging.common.mylzw;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.nio.ByteOrder;
import org.apache.commons.imaging.common.mylzw.MyLzwDecompressor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MyLzwDecompressor_ESTest extends MyLzwDecompressor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(1725, byteOrder0);
      // Undeclared exception!
      try { 
        myLzwDecompressor0.decompress((InputStream) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyBitInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
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
  public void test2()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      MyLzwDecompressor.Listener myLzwDecompressor_Listener0 = mock(MyLzwDecompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor((-671), byteOrder0, myLzwDecompressor_Listener0);
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        myLzwDecompressor0.decompress(byteArrayInputStream0, (-671));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative initial size: -671
         //
         verifyException("java.io.ByteArrayOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      MyLzwDecompressor.Listener myLzwDecompressor_Listener0 = mock(MyLzwDecompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwDecompressor myLzwDecompressor0 = null;
      try {
        myLzwDecompressor0 = new MyLzwDecompressor(2132, byteOrder0, myLzwDecompressor_Listener0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      MyLzwDecompressor myLzwDecompressor0 = null;
      try {
        myLzwDecompressor0 = new MyLzwDecompressor((-2511), byteOrder0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(1, byteOrder0);
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-60);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byte[] byteArray1 = myLzwDecompressor0.decompress(byteArrayInputStream0, 12);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      MyLzwDecompressor.Listener myLzwDecompressor_Listener0 = mock(MyLzwDecompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor((-1), byteOrder0, myLzwDecompressor_Listener0);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        myLzwDecompressor0.decompress(pipedInputStream0, 887);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Bad Code: -1 codes: -2147483646 code_size: 0, table: 4096
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwDecompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(1, byteOrder0);
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        myLzwDecompressor0.decompress(byteArrayInputStream0, 12);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Bad Code: -1 codes: 4 code_size: 2, table: 4096
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwDecompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      MyLzwDecompressor.Listener myLzwDecompressor_Listener0 = mock(MyLzwDecompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(0, byteOrder0, myLzwDecompressor_Listener0);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)81;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        myLzwDecompressor0.decompress(byteArrayInputStream0, (byte)97);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // AddStringToTable: codes: 3 code_size: 1
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwDecompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(1894, byteOrder0, (MyLzwDecompressor.Listener) null);
      myLzwDecompressor0.setTiffLZWMode();
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        myLzwDecompressor0.decompress(byteArrayInputStream0, (byte)95);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Bad Code: -1 codes: 66 code_size: 1895, table: 4096
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwDecompressor", e);
      }
  }
}