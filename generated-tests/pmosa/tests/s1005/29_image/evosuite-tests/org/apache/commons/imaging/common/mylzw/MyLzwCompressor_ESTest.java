/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 02:37:29 GMT 2018
 */

package org.apache.commons.imaging.common.mylzw;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.nio.ByteOrder;
import org.apache.commons.imaging.common.mylzw.MyLzwCompressor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MyLzwCompressor_ESTest extends MyLzwCompressor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor((-1), byteOrder0, true, myLzwCompressor_Listener0);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)86;
      byteArray0[2] = (byte)0;
      byte byte0 = (byte)0;
      byte[] byteArray1 = new byte[8];
      byteArray1[0] = (byte)0;
      byteArray1[1] = (byte)0;
      byteArray1[2] = (byte)0;
      byteArray1[3] = (byte)86;
      byteArray1[4] = (byte)0;
      byteArray1[5] = (byte)0;
      byteArray1[6] = (byte)0;
      byteArray1[7] = (byte)86;
      try { 
        myLzwCompressor0.compress(byteArray1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // CodeFromString
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      ByteOrder byteOrder1 = ByteOrder.nativeOrder();
      ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor((-95), byteOrder1, false);
      ByteOrder.nativeOrder();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)0;
      byte[] byteArray1 = myLzwCompressor0.compress(byteArray0);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(0, byteOrder0, true, myLzwCompressor_Listener0);
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = myLzwCompressor0.compress(byteArray0);
      assertArrayEquals(new byte[] {(byte) (-128)}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(138, byteOrder0, false);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-29);
      byteArray0[1] = (byte)20;
      byteArray0[2] = (byte)28;
      byteArray0[3] = (byte)56;
      byteArray0[4] = (byte) (-77);
      byteArray0[5] = (byte) (-67);
      byteArray0[6] = (byte)3;
      byteArray0[7] = (byte) (-96);
      byte[] byteArray1 = myLzwCompressor0.compress(byteArray0);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor((-95), byteOrder0, false);
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte)0;
      byteArray0[5] = (byte) (-122);
      byteArray0[4] = (byte)96;
      byteArray0[5] = (byte)8;
      byteArray0[6] = (byte)8;
      try { 
        myLzwCompressor0.compress(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // CodeFromString
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwCompressor", e);
      }
  }
}