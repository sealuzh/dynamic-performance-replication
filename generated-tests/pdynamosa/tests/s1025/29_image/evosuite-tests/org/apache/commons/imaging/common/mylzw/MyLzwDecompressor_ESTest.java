/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 05:06:11 GMT 2019
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
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.nio.ByteOrder;
import org.apache.commons.imaging.common.mylzw.MyLzwDecompressor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MyLzwDecompressor_ESTest extends MyLzwDecompressor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = 0;
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(0, byteOrder0);
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte)1;
      InputStream inputStream0 = null;
      // Undeclared exception!
      try { 
        myLzwDecompressor0.decompress((InputStream) null, 257);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyBitInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = 0;
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      MyLzwDecompressor.Listener myLzwDecompressor_Listener0 = mock(MyLzwDecompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(0, byteOrder0, myLzwDecompressor_Listener0);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)12;
      byteArray0[2] = (byte)124;
      byteArray0[3] = (byte) (-45);
      byteArray0[4] = (byte)2;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)46;
      byteArray0[7] = (byte)45;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, 1049);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pushbackInputStream0);
      byteArrayInputStream0.close();
      int int1 = 909;
      try { 
        myLzwDecompressor0.decompress(bufferedInputStream0, 909);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Bad Code: -1 codes: 3 code_size: 1, table: 4096
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwDecompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      MyLzwDecompressor.Listener myLzwDecompressor_Listener0 = mock(MyLzwDecompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor((-2843), byteOrder0, myLzwDecompressor_Listener0);
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)59;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)2;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        myLzwDecompressor0.decompress(byteArrayInputStream0, (-2843));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative initial size: -2843
         //
         verifyException("java.io.ByteArrayOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor((byte)0, byteOrder0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0, 255);
      ByteOrder.nativeOrder();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)9;
      byteArray0[1] = (byte)52;
      byteArray0[2] = (byte)9;
      byteArray0[3] = (byte) (-35);
      byteArray0[4] = (byte)28;
      pipedOutputStream0.write(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0, 984);
      try { 
        myLzwDecompressor0.decompress(pushbackInputStream0, (byte)9);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // AddStringToTable: codes: 3 code_size: 1
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwDecompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor((byte)0, byteOrder0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0, 255);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-35);
      byteArray0[8] = (byte) (-35);
      pipedOutputStream0.write(byteArray0);
      myLzwDecompressor0.decompress(pipedInputStream0, 2);
      MyLzwDecompressor myLzwDecompressor1 = new MyLzwDecompressor((byte)0, byteOrder0);
      assertFalse(myLzwDecompressor1.equals((Object)myLzwDecompressor0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      MyLzwDecompressor.Listener myLzwDecompressor_Listener0 = mock(MyLzwDecompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(0, byteOrder0, myLzwDecompressor_Listener0);
      myLzwDecompressor0.setTiffLZWMode();
      ByteOrder.nativeOrder();
      myLzwDecompressor0.setTiffLZWMode();
      myLzwDecompressor0.setTiffLZWMode();
      myLzwDecompressor0.setTiffLZWMode();
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-75);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-98);
      byteArray0[3] = (byte)2;
      byteArray0[4] = (byte)0;
      myLzwDecompressor0.setTiffLZWMode();
      byteArray0[5] = (byte)0;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, (byte) (-75));
      PushbackInputStream pushbackInputStream0 = null;
      try {
        pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, (byte)0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // size <= 0
         //
         verifyException("java.io.PushbackInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      ByteOrder.nativeOrder();
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(0, byteOrder0, (MyLzwDecompressor.Listener) null);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pipedInputStream0, pipedInputStream0);
      myLzwDecompressor0.setTiffLZWMode();
      try { 
        myLzwDecompressor0.decompress(sequenceInputStream0, 0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(8, byteOrder0);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-17);
      byteArray0[1] = (byte)66;
      byteArray0[2] = (byte)69;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        myLzwDecompressor0.decompress(byteArrayInputStream0, 4798);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Bad Code: -1 codes: 258 code_size: 9, table: 4096
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwDecompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor((byte)0, byteOrder0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0, 255);
      ByteOrder.nativeOrder();
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-35);
      byteArray0[1] = (byte) (-21);
      byteArray0[2] = (byte)52;
      byteArray0[3] = (byte) (-21);
      byteArray0[4] = (byte)9;
      byteArray0[5] = (byte)52;
      pipedOutputStream0.write(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      myLzwDecompressor0.decompress(pipedInputStream0, 0);
      try { 
        myLzwDecompressor0.decompress(dataInputStream0, 1087);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // AddStringToTable: codes: 3 code_size: 1
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwDecompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      MyLzwDecompressor.Listener myLzwDecompressor_Listener0 = mock(MyLzwDecompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(0, byteOrder0, myLzwDecompressor_Listener0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = null;
      try {
        pipedInputStream0 = new PipedInputStream(pipedOutputStream0, (-85));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Pipe Size <= 0
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(0, byteOrder0);
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte)1;
      // Undeclared exception!
      try { 
        myLzwDecompressor0.decompress((InputStream) null, 257);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyBitInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor((-1), byteOrder0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
      try { 
        myLzwDecompressor0.decompress((InputStream) null, 4096);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Bad Code: -1 codes: -2147483646 code_size: 0, table: 4096
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwDecompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(2375, byteOrder0);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)8;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-126);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        myLzwDecompressor0.decompress(byteArrayInputStream0, 0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Bad Code: -1 codes: 130 code_size: 2376, table: 4096
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwDecompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      MyLzwDecompressor.Listener myLzwDecompressor_Listener0 = mock(MyLzwDecompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(0, byteOrder0, myLzwDecompressor_Listener0);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)12;
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      byteArray0[2] = (byte)124;
      byteArray0[3] = (byte) (-45);
      byteArray0[4] = (byte)2;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)46;
      byteArray0[7] = (byte)45;
      MyLzwDecompressor myLzwDecompressor1 = new MyLzwDecompressor(4061, byteOrder0);
      assertFalse(myLzwDecompressor1.equals((Object)myLzwDecompressor0));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ByteOrder.nativeOrder();
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(2, byteOrder0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0, 1011);
      ByteOrder.nativeOrder();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-35);
      pipedOutputStream0.write(byteArray0);
      try { 
        myLzwDecompressor0.decompress(pipedInputStream0, 1011);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Bad Code: -1 codes: 6 code_size: 3, table: 4096
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwDecompressor", e);
      }
  }
}
