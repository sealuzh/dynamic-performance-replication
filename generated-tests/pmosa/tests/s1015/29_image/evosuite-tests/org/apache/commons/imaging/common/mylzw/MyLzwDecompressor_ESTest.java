/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 08:05:58 GMT 2018
 */

package org.apache.commons.imaging.common.mylzw;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteOrder;
import org.apache.commons.imaging.common.mylzw.MyLzwDecompressor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MyLzwDecompressor_ESTest extends MyLzwDecompressor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(0, byteOrder0);
      byte[] byteArray0 = new byte[5];
      ByteOrder.nativeOrder();
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      myLzwDecompressor0.setTiffLZWMode();
      byteArray0[3] = (byte)69;
      ByteOrder.nativeOrder();
      byteArray0[4] = (byte)1;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)69, 0);
      try { 
        myLzwDecompressor0.decompress(byteArrayInputStream0, 4096);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Bad Code: -1 codes: 3 code_size: 1, table: 4096
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwDecompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(8, byteOrder0);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)35;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      myLzwDecompressor0.decompress(byteArrayInputStream0, (byte)0);
      assertEquals(1, byteArrayInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(8, byteOrder0);
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)35;
      byteArray0[2] = (byte)35;
      byteArray0[3] = (byte)35;
      byteArray0[5] = (byte)35;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        myLzwDecompressor0.decompress(byteArrayInputStream0, 2711);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Bad Code: 401 codes: 258 code_size: 9, table: 4096
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwDecompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      ByteOrder byteOrder1 = ByteOrder.nativeOrder();
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(0, byteOrder1);
      myLzwDecompressor0.setTiffLZWMode();
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte)1;
      byteArray0[2] = (byte) (-29);
      byteArray0[3] = (byte) (-31);
      byteArray0[4] = (byte) (-51);
      byteArray0[5] = (byte)2;
      byteArray0[6] = (byte) (-1);
      byteArray0[7] = (byte)105;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byte[] byteArray1 = myLzwDecompressor0.decompress(byteArrayInputStream0, (byte)1);
      assertArrayEquals(new byte[] {(byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-95);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)40;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)1;
      byteArray0[5] = (byte) (-95);
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte)0;
      byteArray0[8] = (byte)46;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      MyLzwDecompressor.Listener myLzwDecompressor_Listener0 = mock(MyLzwDecompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor((byte)0, byteOrder0, myLzwDecompressor_Listener0);
      try { 
        myLzwDecompressor0.decompress(byteArrayInputStream0, (byte)40);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // AddStringToTable: codes: 3 code_size: 1
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwDecompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      byte[] byteArray0 = new byte[23];
      byteArray0[0] = (byte) (-95);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)40;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)1;
      byteArray0[5] = (byte) (-95);
      byteArray0[8] = (byte)0;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      MyLzwDecompressor.Listener myLzwDecompressor_Listener0 = mock(MyLzwDecompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor((byte)0, byteOrder0, myLzwDecompressor_Listener0);
      try { 
        myLzwDecompressor0.decompress(byteArrayInputStream0, (byte)40);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // AddStringToTable: codes: 3 code_size: 1
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwDecompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      MyLzwDecompressor.Listener myLzwDecompressor_Listener0 = mock(MyLzwDecompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(1384, byteOrder0, myLzwDecompressor_Listener0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      myLzwDecompressor0.setTiffLZWMode();
      ByteOrder.nativeOrder();
      myLzwDecompressor0.setTiffLZWMode();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)0;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byte[] byteArray1 = myLzwDecompressor0.decompress(byteArrayInputStream0, 1384);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      MyLzwDecompressor.Listener myLzwDecompressor_Listener0 = mock(MyLzwDecompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(0, byteOrder0, myLzwDecompressor_Listener0);
      myLzwDecompressor0.setTiffLZWMode();
      byte[] byteArray0 = new byte[3];
      myLzwDecompressor0.setTiffLZWMode();
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      MyLzwDecompressor.Listener myLzwDecompressor_Listener1 = mock(MyLzwDecompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwDecompressor myLzwDecompressor1 = new MyLzwDecompressor((-1), byteOrder0, myLzwDecompressor_Listener1);
      try { 
        myLzwDecompressor1.decompress(byteArrayInputStream0, (byte)0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Bad Code: -1 codes: -2147483646 code_size: 0, table: 4096
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwDecompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(8, byteOrder0);
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)35;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)35;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)35;
      byteArray0[6] = (byte)0;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        myLzwDecompressor0.decompress(byteArrayInputStream0, 2711);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Bad Code: -1 codes: 264 code_size: 9, table: 4096
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwDecompressor", e);
      }
  }
}