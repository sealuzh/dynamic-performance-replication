/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 17:33:25 GMT 2018
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
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(0, byteOrder0, false, myLzwCompressor_Listener0);
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)117;
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
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor((-1), byteOrder0, true);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)0;
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
  public void test2()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(0, byteOrder0, false);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)60;
      byteArray0[2] = (byte) (-101);
      byteArray0[3] = (byte)0;
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
  public void test3()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      assertEquals("LITTLE_ENDIAN", byteOrder0.toString());
      assertNotNull(byteOrder0);
      
      ByteOrder byteOrder1 = ByteOrder.nativeOrder();
      assertSame(byteOrder1, byteOrder0);
      assertEquals("LITTLE_ENDIAN", byteOrder1.toString());
      assertNotNull(byteOrder1);
      
      ByteOrder byteOrder2 = ByteOrder.nativeOrder();
      assertSame(byteOrder2, byteOrder1);
      assertSame(byteOrder2, byteOrder0);
      assertEquals("LITTLE_ENDIAN", byteOrder2.toString());
      assertNotNull(byteOrder2);
      
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(0, byteOrder1, true);
      assertEquals("LITTLE_ENDIAN", byteOrder1.toString());
      assertNotNull(myLzwCompressor0);
      
      ByteOrder byteOrder3 = ByteOrder.nativeOrder();
      assertSame(byteOrder3, byteOrder1);
      assertSame(byteOrder3, byteOrder0);
      assertSame(byteOrder3, byteOrder2);
      assertEquals("LITTLE_ENDIAN", byteOrder3.toString());
      assertNotNull(byteOrder3);
      
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
  public void test4()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      assertNotNull(byteOrder0);
      
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(0, byteOrder0, false);
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      assertNotNull(myLzwCompressor0);
      
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = myLzwCompressor0.compress(byteArray0);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {(byte) (-96)}, byteArray1);
      assertNotNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      assertEquals("LITTLE_ENDIAN", byteOrder0.toString());
      assertNotNull(byteOrder0);
      
      ByteOrder byteOrder1 = ByteOrder.BIG_ENDIAN;
      assertNotSame(byteOrder1, byteOrder0);
      assertFalse(byteOrder1.equals((Object)byteOrder0));
      assertEquals("BIG_ENDIAN", byteOrder1.toString());
      assertNotNull(byteOrder1);
      
      ByteOrder byteOrder2 = ByteOrder.nativeOrder();
      assertNotSame(byteOrder2, byteOrder1);
      assertSame(byteOrder2, byteOrder0);
      assertFalse(byteOrder2.equals((Object)byteOrder1));
      assertEquals("LITTLE_ENDIAN", byteOrder2.toString());
      assertNotNull(byteOrder2);
      
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(0, byteOrder0, true, myLzwCompressor_Listener0);
      assertFalse(byteOrder0.equals((Object)byteOrder1));
      assertEquals("LITTLE_ENDIAN", byteOrder0.toString());
      assertNotNull(myLzwCompressor0);
      
      ByteOrder byteOrder3 = ByteOrder.nativeOrder();
      assertSame(byteOrder3, byteOrder0);
      assertNotSame(byteOrder3, byteOrder1);
      assertSame(byteOrder3, byteOrder2);
      assertFalse(byteOrder3.equals((Object)byteOrder1));
      assertEquals("LITTLE_ENDIAN", byteOrder3.toString());
      assertNotNull(byteOrder3);
      
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-85);
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
  public void test6()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      assertEquals("LITTLE_ENDIAN", byteOrder0.toString());
      assertNotNull(byteOrder0);
      
      ByteOrder byteOrder1 = ByteOrder.nativeOrder();
      assertSame(byteOrder1, byteOrder0);
      assertEquals("LITTLE_ENDIAN", byteOrder1.toString());
      assertNotNull(byteOrder1);
      
      ByteOrder byteOrder2 = ByteOrder.nativeOrder();
      assertSame(byteOrder2, byteOrder1);
      assertSame(byteOrder2, byteOrder0);
      assertEquals("LITTLE_ENDIAN", byteOrder2.toString());
      assertNotNull(byteOrder2);
      
      ByteOrder byteOrder3 = ByteOrder.nativeOrder();
      assertSame(byteOrder3, byteOrder2);
      assertSame(byteOrder3, byteOrder0);
      assertSame(byteOrder3, byteOrder1);
      assertEquals("LITTLE_ENDIAN", byteOrder3.toString());
      assertNotNull(byteOrder3);
      
      MyLzwCompressor.Listener myLzwCompressor_Listener0 = mock(MyLzwCompressor.Listener.class, new ViolatedAssumptionAnswer());
      MyLzwCompressor myLzwCompressor0 = new MyLzwCompressor(0, byteOrder0, false, myLzwCompressor_Listener0);
      assertEquals("LITTLE_ENDIAN", byteOrder0.toString());
      assertNotNull(myLzwCompressor0);
      
      ByteOrder byteOrder4 = ByteOrder.nativeOrder();
      assertSame(byteOrder4, byteOrder0);
      assertSame(byteOrder4, byteOrder2);
      assertSame(byteOrder4, byteOrder1);
      assertSame(byteOrder4, byteOrder3);
      assertEquals("LITTLE_ENDIAN", byteOrder4.toString());
      assertNotNull(byteOrder4);
      
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = myLzwCompressor0.compress(byteArray0);
      assertSame(byteOrder0, byteOrder4);
      assertSame(byteOrder0, byteOrder3);
      assertSame(byteOrder0, byteOrder1);
      assertSame(byteOrder0, byteOrder2);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertEquals("LITTLE_ENDIAN", byteOrder0.toString());
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
      assertArrayEquals(new byte[] {(byte)1}, byteArray1);
      assertNotNull(byteArray1);
      
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