/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 07:51:29 GMT 2019
 */

package org.apache.commons.imaging.common.mylzw;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
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
  public void test00()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(0, byteOrder0, false, myLzwCompressor_Listener0);
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = new byte[0];
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
  public void test01()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(0, byteOrder0, true, myLzwCompressor_Listener0);
      byte[] byteArray0 = new byte[2];
      ByteOrder.nativeOrder();
      byte[] byteArray1 = myLzwCompressor0.compress(byteArray0);
      ByteOrder.nativeOrder();
      byteArray0[0] = (byte)0;
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
  public void test02()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(809, byteOrder0, false, myLzwCompressor_Listener0);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-1);
      byteArray0[1] = (byte)73;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-114);
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte) (-1);
      byte[] byteArray1 = myLzwCompressor0.compress(byteArray0);
      assertEquals(810, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(10, byteOrder0, true, myLzwCompressor_Listener0);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)12;
      byteArray0[1] = (byte) (-10);
      byteArray0[2] = (byte)3;
      byteArray0[3] = (byte)52;
      byteArray0[4] = (byte) (-17);
      byte[] byteArray1 = myLzwCompressor0.compress(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)100, (byte) (-104), (byte) (-3), (byte)6, (byte)70, (byte) (-77), (byte) (-9), (byte)5, (byte)16}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      ByteOrder.nativeOrder();
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(777, byteOrder0, true, myLzwCompressor_Listener0);
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
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
  public void test05()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor((byte)65, byteOrder0, false);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)26;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)65;
      byteArray0[5] = (byte)16;
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
  public void test06()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(1, byteOrder0, true);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)65;
      byteArray0[3] = (byte)26;
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
  public void test07()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(1, byteOrder0, false);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)26;
      byteArray0[4] = (byte)0;
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
  public void test08()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(0, byteOrder0, false, myLzwCompressor_Listener0);
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte)1;
      byteArray0[0] = (byte)1;
      byte byte1 = (byte)22;
      byteArray0[1] = (byte)22;
      byte byte2 = (byte)17;
      byteArray0[2] = (byte)17;
      ByteOrder.nativeOrder();
      byteArray0[3] = (byte)68;
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
  public void test09()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(8, byteOrder0, true);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-1);
      byteArray0[1] = (byte)100;
      byteArray0[2] = (byte) (-1);
      byteArray0[3] = (byte) (-56);
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte) (-77);
      byteArray0[6] = (byte)28;
      byteArray0[7] = (byte)0;
      byte[] byteArray1 = myLzwCompressor0.compress(byteArray0);
      assertEquals(12, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor((-2038), byteOrder0, false, myLzwCompressor_Listener0);
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-17);
      byteArray0[1] = (byte) (-126);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)0;
      byte[] byteArray1 = myLzwCompressor0.compress(byteArray0);
      // Undeclared exception!
      myLzwCompressor0.compress(byteArray1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      ByteOrder.nativeOrder();
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor((-1), byteOrder0, false);
      byte[] byteArray0 = new byte[1];
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
  public void test12()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(0, byteOrder0, false);
      ByteOrder.nativeOrder();
      byte[] byteArray0 = new byte[1];
      byte byte0 = (byte)126;
      byteArray0[0] = (byte)126;
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
