/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 16:31:57 GMT 2019
 */

package org.apache.commons.imaging.common.mylzw;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
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
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(4096, byteOrder0, (MyLzwDecompressor.Listener) null);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0, 629);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      try { 
        myLzwDecompressor0.decompress(bufferedInputStream0, 4066);
        fail("Expecting exception: InterruptedIOException");
      
      } catch(InterruptedIOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(1, byteOrder0);
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 74, (byte)1);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pushbackInputStream0);
      try { 
        myLzwDecompressor0.decompress(bufferedInputStream0, (byte)0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Bad Code: -1 codes: 4 code_size: 2, table: 4096
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwDecompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      MyLzwDecompressor.Listener myLzwDecompressor_Listener0 = mock(MyLzwDecompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(257, byteOrder0, myLzwDecompressor_Listener0);
      // Undeclared exception!
      try { 
        myLzwDecompressor0.decompress((InputStream) null, (-1924));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative initial size: -1924
         //
         verifyException("java.io.ByteArrayOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      MyLzwDecompressor.Listener myLzwDecompressor_Listener0 = mock(MyLzwDecompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwDecompressor myLzwDecompressor0 = null;
      try {
        myLzwDecompressor0 = new MyLzwDecompressor((-1066), byteOrder0, myLzwDecompressor_Listener0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      MyLzwDecompressor myLzwDecompressor0 = null;
      try {
        myLzwDecompressor0 = new MyLzwDecompressor(2091, byteOrder0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      MyLzwDecompressor.Listener myLzwDecompressor_Listener0 = mock(MyLzwDecompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(2, byteOrder0, myLzwDecompressor_Listener0);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-27);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byte[] byteArray1 = myLzwDecompressor0.decompress(byteArrayInputStream0, (byte)74);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor((-1), byteOrder0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(dataInputStream0);
      try { 
        myLzwDecompressor0.decompress(pushbackInputStream0, 8);
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
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      MyLzwDecompressor.Listener myLzwDecompressor_Listener0 = mock(MyLzwDecompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(2, byteOrder0, myLzwDecompressor_Listener0);
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        myLzwDecompressor0.decompress(byteArrayInputStream0, (byte)74);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Bad Code: -1 codes: 6 code_size: 3, table: 4096
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwDecompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(0, byteOrder0);
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte) (-1);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)1, 5);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      try { 
        myLzwDecompressor0.decompress(bufferedInputStream0, 643);
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
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor((-1), byteOrder0);
      myLzwDecompressor0.setTiffLZWMode();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(dataInputStream0);
      try { 
        myLzwDecompressor0.decompress(pushbackInputStream0, 8);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Bad Code: -1 codes: -2147483646 code_size: 0, table: 4096
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwDecompressor", e);
      }
  }
}
