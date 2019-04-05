/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 17:13:42 GMT 2019
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
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor((-2685), byteOrder0, false);
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)1;
      byte[] byteArray1 = myLzwCompressor0.compress(byteArray0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      ByteOrder.nativeOrder();
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(0, byteOrder0, true);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-66);
      byte byte0 = (byte)1;
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
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
  public void test02()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(1379, byteOrder0, false, myLzwCompressor_Listener0);
      byte[] byteArray0 = new byte[8];
      byte byte0 = (byte)0;
      byteArray0[0] = (byte)0;
      byte byte1 = (byte)12;
      ByteOrder.nativeOrder();
      byteArray0[1] = (byte)12;
      byteArray0[2] = (byte)16;
      byte byte2 = (byte)0;
      byteArray0[3] = (byte)0;
      ByteOrder.nativeOrder();
      byte byte3 = (byte)0;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)112;
      byteArray0[7] = (byte)8;
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
  public void test03()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(1, byteOrder0, false, myLzwCompressor_Listener0);
      byte[] byteArray0 = new byte[4];
      ByteOrder.nativeOrder();
      byteArray0[0] = (byte)58;
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
  public void test04()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor((-1471), byteOrder0, true);
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
      ByteOrder.nativeOrder();
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(8, byteOrder0, true, myLzwCompressor_Listener0);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)4;
      byte[] byteArray1 = myLzwCompressor0.compress(byteArray0);
      byte[] byteArray2 = myLzwCompressor0.compress(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)1, (byte)36, (byte)32, (byte)64, (byte)32, (byte)32}, byteArray2);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor((-2685), byteOrder0, true);
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)1;
      byte[] byteArray1 = myLzwCompressor0.compress(byteArray0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(8, byteOrder0, false);
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-70);
      byte[] byteArray1 = myLzwCompressor0.compress(byteArray0);
      byte[] byteArray2 = new byte[3];
      byteArray2[0] = (byte)0;
      ByteOrder.nativeOrder();
      byteArray2[1] = (byte)0;
      byteArray2[2] = (byte) (-70);
      ByteOrder.nativeOrder();
      byte[] byteArray3 = myLzwCompressor0.compress(byteArray2);
      myLzwCompressor0.compress(byteArray3);
      myLzwCompressor0.compress(byteArray2);
      myLzwCompressor0.compress(byteArray0);
      // Undeclared exception!
      myLzwCompressor0.compress(byteArray1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(0, (ByteOrder) null, false);
      byte[] byteArray0 = new byte[7];
      byte byte0 = (byte) (-24);
      myLzwCompressor0.compress(byteArray0);
      myLzwCompressor0.compress(byteArray0);
      byteArray0[0] = (byte) (-24);
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
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(8, byteOrder0, true);
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)2;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-66);
      ByteOrder.nativeOrder();
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte) (-1);
      byteArray0[6] = (byte) (-39);
      byte[] byteArray1 = myLzwCompressor0.compress(byteArray0);
      assertEquals(11, byteArray1.length);
      
      byte[] byteArray2 = new byte[6];
      byteArray2[0] = (byte) (-1);
      byteArray2[1] = (byte)0;
      byteArray2[2] = (byte) (-66);
      byteArray2[3] = (byte)2;
      byteArray2[4] = (byte) (-1);
      byteArray2[5] = (byte) (-39);
      byte[] byteArray3 = myLzwCompressor0.compress(byteArray2);
      assertArrayEquals(new byte[] {(byte)0, (byte) (-1), (byte)1, (byte) (-16), (byte)37, (byte) (-32), (byte)95, (byte) (-74), (byte) (-128)}, byteArray3);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(132, byteOrder0, false, myLzwCompressor_Listener0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(642, byteOrder0, false, myLzwCompressor_Listener0);
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
  public void test12()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(0, byteOrder0, false, myLzwCompressor_Listener0);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte)58;
      byteArray0[2] = (byte) (-1);
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
  public void test13()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(0, byteOrder0, true);
      ByteOrder.nativeOrder();
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)0;
      ByteOrder.nativeOrder();
      myLzwCompressor0.compress(byteArray0);
      ByteOrder.nativeOrder();
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte)0;
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
  public void test14()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(255, byteOrder0, false);
      ByteOrder.nativeOrder();
      byte[] byteArray0 = new byte[7];
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
  public void test15()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(3560, byteOrder0, false, myLzwCompressor_Listener0);
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
  public void test16()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      byte byte0 = (byte)0;
      ByteOrder.nativeOrder();
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(1, byteOrder0, false);
      byte[] byteArray0 = new byte[8];
      byte byte1 = (byte)1;
      byteArray0[0] = (byte)1;
      byte byte2 = (byte)72;
      byteArray0[1] = (byte)72;
      byteArray0[2] = (byte)18;
      byteArray0[3] = (byte)0;
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
  public void test17()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(8, byteOrder0, true, myLzwCompressor_Listener0);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-128);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)121;
      byteArray0[3] = (byte)117;
      byteArray0[4] = (byte)9;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte) (-95);
      byteArray0[7] = (byte) (-100);
      byte[] byteArray1 = myLzwCompressor0.compress(byteArray0);
      assertEquals(12, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor((-1887), byteOrder0, false);
  }
}