/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 02:26:29 GMT 2019
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
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(361, byteOrder0);
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      try { 
        myLzwDecompressor0.decompress(sequenceInputStream0, 0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Bad Code: -1 codes: 514 code_size: 362, table: 4096
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwDecompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(0, byteOrder0);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-89);
      byteArray0[1] = (byte) (-89);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byte[] byteArray1 = myLzwDecompressor0.decompress(byteArrayInputStream0, 2);
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray1);
      
      byte[] byteArray2 = myLzwDecompressor0.decompress(byteArrayInputStream0, (byte)0);
      assertEquals(0, byteArray2.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)2;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      MyLzwDecompressor.Listener myLzwDecompressor_Listener0 = mock(MyLzwDecompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor((byte)1, byteOrder0, myLzwDecompressor_Listener0);
      try { 
        myLzwDecompressor0.decompress(byteArrayInputStream0, (byte)2);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // AddStringToTable: codes: 4 code_size: 2
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwDecompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)2;
      byteArray0[1] = (byte)47;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      MyLzwDecompressor.Listener myLzwDecompressor_Listener0 = mock(MyLzwDecompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor((byte)8, byteOrder0, myLzwDecompressor_Listener0);
      try { 
        myLzwDecompressor0.decompress(byteArrayInputStream0, 2734);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Bad Code: -1 codes: 258 code_size: 9, table: 4096
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwDecompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(0, byteOrder0);
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-55);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        myLzwDecompressor0.decompress(byteArrayInputStream0, 251);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // AddStringToTable: codes: 3 code_size: 1
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwDecompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      MyLzwDecompressor.Listener myLzwDecompressor_Listener0 = mock(MyLzwDecompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(4061, byteOrder0, myLzwDecompressor_Listener0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(10, byteOrder0);
      // Undeclared exception!
      try { 
        myLzwDecompressor0.decompress((InputStream) null, 10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyBitInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(0, byteOrder0);
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        myLzwDecompressor0.decompress(byteArrayInputStream0, (byte) (-55));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative initial size: -55
         //
         verifyException("java.io.ByteArrayOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      MyLzwDecompressor.Listener myLzwDecompressor_Listener0 = mock(MyLzwDecompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwDecompressor myLzwDecompressor0 = null;
      try {
        myLzwDecompressor0 = new MyLzwDecompressor(3696, byteOrder0, myLzwDecompressor_Listener0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(0, byteOrder0);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-89);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byte[] byteArray1 = myLzwDecompressor0.decompress(byteArrayInputStream0, 0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      MyLzwDecompressor.Listener myLzwDecompressor_Listener0 = mock(MyLzwDecompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwDecompressor myLzwDecompressor0 = new MyLzwDecompressor(8, byteOrder0, myLzwDecompressor_Listener0);
      myLzwDecompressor0.setTiffLZWMode();
      byte[] byteArray1 = myLzwDecompressor0.decompress(byteArrayInputStream0, 994);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
}
