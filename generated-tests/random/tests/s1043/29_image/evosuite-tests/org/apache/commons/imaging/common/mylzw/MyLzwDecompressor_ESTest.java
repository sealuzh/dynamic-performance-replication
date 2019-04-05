/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 16:57:35 GMT 2019
 */

package org.apache.commons.imaging.common.mylzw;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PipedInputStream;
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
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor((-32), byteOrder0);
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)94, (byte)94);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, (byte)94);
      // Undeclared exception!
      try { 
        myLzwDecompressor0.decompress(pushbackInputStream0, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative initial size: -1
         //
         verifyException("java.io.ByteArrayOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
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
  public void test2()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      MyLzwDecompressor myLzwDecompressor0 = null;
      try {
        myLzwDecompressor0 = new MyLzwDecompressor(4083, byteOrder0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      MyLzwDecompressor.Listener myLzwDecompressor_Listener0 = mock(MyLzwDecompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(1, byteOrder0, myLzwDecompressor_Listener0);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)14;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byte[] byteArray1 = myLzwDecompressor0.decompress(byteArrayInputStream0, (byte)0);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      MyLzwDecompressor.Listener myLzwDecompressor_Listener0 = mock(MyLzwDecompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(1, byteOrder0, myLzwDecompressor_Listener0);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-33);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      byte[] byteArray1 = myLzwDecompressor0.decompress(dataInputStream0, 1779);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      MyLzwDecompressor.Listener myLzwDecompressor_Listener0 = mock(MyLzwDecompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(1, byteOrder0, myLzwDecompressor_Listener0);
      myLzwDecompressor0.setTiffLZWMode();
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        myLzwDecompressor0.decompress(byteArrayInputStream0, (byte)0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Bad Code: -1 codes: 4 code_size: 2, table: 4096
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwDecompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor((-1), byteOrder0);
      PipedInputStream pipedInputStream0 = new PipedInputStream(713);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0);
      try { 
        myLzwDecompressor0.decompress(pushbackInputStream0, 358);
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
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor((-381), byteOrder0);
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 1087, (byte) (-7));
      try { 
        myLzwDecompressor0.decompress(byteArrayInputStream0, 2022);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Bad Code: -1 codes: 10 code_size: -380, table: 4096
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwDecompressor", e);
      }
  }
}
