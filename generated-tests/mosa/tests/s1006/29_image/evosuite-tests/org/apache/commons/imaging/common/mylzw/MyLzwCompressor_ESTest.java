/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 21:18:05 GMT 2018
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
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(0, (ByteOrder) null, false);
      byte[] byteArray0 = new byte[0];
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
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(8, (ByteOrder) null, true, myLzwCompressor_Listener0);
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = myLzwCompressor0.compress(byteArray0);
      myLzwCompressor0.compress(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)1, (byte)8, (byte)28, (byte)40, (byte)48, (byte)32}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor((byte)74, byteOrder0, true, (MyLzwCompressor.Listener) null);
      myLzwCompressor0.compress(byteArray0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(1004, byteOrder0, true);
      ByteOrder byteOrder1 = ByteOrder.BIG_ENDIAN;
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(0, (ByteOrder) null, false, (MyLzwCompressor.Listener) null);
      myLzwCompressor0.compress(byteArray0);
  }
}