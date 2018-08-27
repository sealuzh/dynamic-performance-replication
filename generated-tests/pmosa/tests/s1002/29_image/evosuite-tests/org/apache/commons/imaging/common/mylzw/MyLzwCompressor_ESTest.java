/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 16 19:00:10 GMT 2018
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
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor((byte) (-1), byteOrder0, true, myLzwCompressor_Listener0);
      byte[] byteArray0 = new byte[21];
      byteArray0[0] = (byte)106;
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte)106;
      byteArray0[3] = (byte)106;
      byteArray0[5] = (byte)106;
      byteArray0[6] = (byte) (-1);
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

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
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
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(8, byteOrder0, false);
      byte[] byteArray0 = new byte[3];
      ByteOrder.nativeOrder();
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)31;
      byteArray0[2] = (byte) (-93);
      byte[] byteArray1 = myLzwCompressor0.compress(byteArray0);
      myLzwCompressor0.compress(byteArray1);
      byte[] byteArray2 = new byte[4];
      byteArray2[0] = (byte)0;
      byteArray2[1] = (byte)0;
      byteArray2[2] = (byte) (-6);
      byteArray2[3] = (byte) (-1);
      myLzwCompressor0.compress(byteArray2);
      // Undeclared exception!
      try { 
        myLzwCompressor0.compress((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.mylzw.MyLzwCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(2, (ByteOrder) null, true);
      byte[] byteArray0 = new byte[16];
      ByteOrder.nativeOrder();
      byte[] byteArray1 = myLzwCompressor0.compress(byteArray0);
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
  public void test3()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      ByteOrder.nativeOrder();
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(803, byteOrder0, false, myLzwCompressor_Listener0);
      ByteOrder.nativeOrder();
      byte[] byteArray0 = new byte[1];
      byte byte0 = (byte)111;
      byte[] byteArray1 = myLzwCompressor0.compress(byteArray0);
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
}