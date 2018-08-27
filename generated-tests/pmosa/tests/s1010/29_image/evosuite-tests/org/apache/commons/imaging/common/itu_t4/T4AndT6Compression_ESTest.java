/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 18:45:18 GMT 2018
 */

package org.apache.commons.imaging.common.itu_t4;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.imaging.common.itu_t4.T4AndT6Compression;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class T4AndT6Compression_ESTest extends T4AndT6Compression_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)25;
      byte byte0 = (byte)78;
      byteArray0[1] = (byte)78;
      byte byte1 = (byte)25;
      byteArray0[2] = (byte)25;
      byte byte2 = (byte) (-52);
      byteArray0[3] = (byte) (-52);
      byte byte3 = (byte)63;
      byteArray0[4] = (byte)63;
      int int0 = 1278;
      boolean boolean0 = true;
      try { 
        T4AndT6Compression.compressT4_1D(byteArray0, (byte)78, 1278, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_1D(byteArray0, (-706), (-706), true);
      try { 
        T4AndT6Compression.compressT4_1D(byteArray1, 1781, 1781, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, (-1), 1);
      assertArrayEquals(new byte[] {(byte)53}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.decompressModifiedHuffman(byteArray0, (-112), (byte)0);
      byte[] byteArray2 = T4AndT6Compression.compressT4_1D(byteArray1, (byte)0, (byte)0, true);
      assertArrayEquals(new byte[] {(byte)0, (byte)1}, byteArray2);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_1D(byteArray0, (-1309), (-1309), true);
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray1, 1, 1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte) (-62);
      byteArray0[2] = (byte) (-74);
      byteArray0[3] = (byte) (-38);
      byteArray0[4] = (byte)63;
      byteArray0[5] = (byte)0;
      byte[] byteArray1 = T4AndT6Compression.decompressModifiedHuffman(byteArray0, 0, 15);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)64;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (byte)64, (byte)64, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      int int0 = 3635;
      byte[] byteArray1 = T4AndT6Compression.decompressT6(byteArray0, 3635, (byte)0);
      boolean boolean0 = false;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 3635, 3635, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)59;
      byteArray0[1] = (byte) (-98);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-33);
      T4AndT6Compression.compressT4_2D(byteArray0, (byte)59, 0, true, (-547));
      T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte) (-98), (-5393));
      byte[] byteArray1 = T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte)0, (-375));
      T4AndT6Compression.decompressT4_2D(byteArray0, 838, (byte) (-33), false);
      byte[] byteArray2 = T4AndT6Compression.compressT4_2D(byteArray0, 0, 0, true, (-1161));
      T4AndT6Compression.compressT4_1D(byteArray1, 0, (byte) (-33), false);
      try { 
        T4AndT6Compression.compressT6(byteArray2, 24, (byte)59);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_1D(byteArray0, (-3), (-3), false);
      try { 
        T4AndT6Compression.compressT4_2D(byteArray1, 2560, 2560, false, (-3));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[12];
      byte[] byteArray1 = T4AndT6Compression.decompressT6(byteArray0, (byte)0, (byte)1);
      try { 
        T4AndT6Compression.compressT6(byteArray1, 56, 49);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      T4AndT6Compression.compressModifiedHuffman(byteArray0, 0, 0);
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 0, 2, true, (-2));
      assertArrayEquals(new byte[] {(byte)0, (byte)1, (byte) (-102), (byte) (-128), (byte)1, (byte)0, (byte)1}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)3;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte)3, (byte)3, false, (byte)3);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      T4AndT6Compression.compressModifiedHuffman(byteArray0, (byte)0, (byte)0);
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 1, 1, false);
      byte[] byteArray2 = T4AndT6Compression.decompressT4_1D(byteArray1, 1, 1, false);
      assertArrayEquals(new byte[] {(byte)0, (byte)17, (byte) (-64), (byte)4}, byteArray1);
      assertArrayEquals(new byte[] {(byte)0}, byteArray2);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-55);
      byte byte0 = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-90);
      byteArray0[3] = (byte)63;
      byteArray0[4] = (byte)4;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte) (-50);
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 0, 518);
      boolean boolean0 = false;
      T4AndT6Compression.decompressT4_1D(byteArray1, 0, (byte)0, false);
      // Undeclared exception!
      T4AndT6Compression.compressModifiedHuffman(byteArray1, (byte)0, 3451);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)66;
      byte byte0 = (byte) (-24);
      byteArray0[1] = (byte) (-24);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)0;
      byte byte1 = (byte)2;
      byteArray0[5] = (byte)2;
      byte byte2 = (byte) (-92);
      byteArray0[6] = (byte) (-92);
      byteArray0[7] = (byte)0;
      byteArray0[8] = (byte)0;
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte)66, 2036);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)61;
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, 8, (byte)61);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)101;
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte)101, 64);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)47;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, 1, (byte)47);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)33;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-3);
      byte byte0 = (byte) (-11);
      byteArray0[3] = (byte) (-11);
      byteArray0[4] = (byte)67;
      byteArray0[5] = (byte) (-87);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)33, 847);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)14;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)14, (byte)14, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-42);
      byteArray0[1] = (byte)95;
      byteArray0[4] = (byte) (-17);
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte)0;
      // Undeclared exception!
      T4AndT6Compression.compressT4_1D(byteArray0, (byte)0, 1402, true);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 1, 1, true);
      assertArrayEquals(new byte[] {(byte)0, (byte)1, (byte)28, (byte)0, (byte)1}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[41];
      int int0 = (-2339);
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 2, (-2339));
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 2, 2, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-55);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-90);
      byteArray0[3] = (byte)63;
      byteArray0[4] = (byte)4;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte) (-50);
      T4AndT6Compression.compressT6(byteArray0, 0, 518);
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 6, (-949), false);
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 0, 410, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)84;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)54;
      byteArray0[3] = (byte)81;
      byteArray0[4] = (byte)123;
      byteArray0[5] = (byte) (-95);
      byteArray0[6] = (byte)58;
      byteArray0[7] = (byte)4;
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)54, (byte)123);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid/unknown T.6 control code 000000000001
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)30;
      try { 
        T4AndT6Compression.decompressT6(byteArray0, 2, 2);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid/unknown T.6 control code 000000000001
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 1, 1);
      byte[] byteArray2 = T4AndT6Compression.decompressT6(byteArray1, 1, 1);
      assertArrayEquals(new byte[] {(byte) (-128), (byte)8, (byte)0, (byte) (-128)}, byteArray1);
      assertArrayEquals(new byte[] {(byte)0}, byteArray2);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)21;
      byteArray0[2] = (byte) (-104);
      byteArray0[3] = (byte)18;
      byteArray0[4] = (byte)92;
      byteArray0[5] = (byte)1;
      byteArray0[6] = (byte) (-127);
      byteArray0[7] = (byte)15;
      byteArray0[8] = (byte)1;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (byte)1, 7, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (-1095), (-1095), true);
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray1, (-1095), 15, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)24;
      byteArray0[1] = (byte) (-12);
      byteArray0[2] = (byte)34;
      byteArray0[3] = (byte) (-12);
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)103;
      try { 
        T4AndT6Compression.compressT6(byteArray0, (byte)24, 3381);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[14];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 1, 1, true, 0);
      assertArrayEquals(new byte[] {(byte)0, (byte)1, (byte) (-114), (byte)0, (byte)1}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)59;
      byteArray0[1] = (byte) (-98);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-78);
      T4AndT6Compression.compressT4_2D(byteArray0, (byte)59, 0, true, (-547));
      T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte) (-98), (-5393));
      byte[] byteArray1 = T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte)0, (-375));
      T4AndT6Compression.decompressT4_2D(byteArray0, 838, (byte) (-78), false);
      byte[] byteArray2 = T4AndT6Compression.compressT4_2D(byteArray0, 0, 5, true, (-1161));
      T4AndT6Compression.compressT4_1D(byteArray1, 0, (byte) (-78), false);
      try { 
        T4AndT6Compression.compressT6(byteArray2, 24, (byte)59);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte byte0 = (byte)34;
      byte byte1 = (byte) (-12);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)34;
      byteArray0[1] = (byte)34;
      byteArray0[2] = (byte) (-12);
      byteArray0[3] = (byte) (-12);
      byteArray0[4] = (byte)34;
      byteArray0[5] = (byte)34;
      byteArray0[6] = (byte)34;
      byteArray0[7] = (byte) (-12);
      byteArray0[8] = (byte) (-12);
      try { 
        T4AndT6Compression.compressT6(byteArray0, 9, (byte)34);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      T4AndT6Compression.decompressT4_1D(byteArray0, (byte)0, (byte)0, true);
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 3, 3, true, 3);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte byte0 = (byte)123;
      byteArray0[0] = (byte)123;
      byte byte1 = (byte)113;
      byteArray0[1] = (byte)113;
      byte byte2 = (byte)0;
      byteArray0[2] = (byte)0;
      int int0 = 2;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 2, 16, false, 1367);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-11);
      byteArray0[1] = (byte) (-31);
      byteArray0[2] = (byte) (-2);
      byteArray0[3] = (byte)119;
      byteArray0[4] = (byte)91;
      byteArray0[5] = (byte)22;
      byteArray0[6] = (byte)109;
      byteArray0[7] = (byte)2;
      byteArray0[8] = (byte)107;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 26, 75, true, 47);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      T4AndT6Compression.decompressModifiedHuffman(byteArray0, (-73), (-73));
      T4AndT6Compression.decompressT4_2D(byteArray0, 64, (-73), false);
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 64, 1792, false, (-73));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte)68, (byte)91, false, (byte)91);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (-3), (-3), true);
      byte[] byteArray2 = new byte[3];
      byteArray2[0] = (byte)1;
      byteArray2[1] = (byte) (-30);
      byteArray2[2] = (byte) (-59);
      T4AndT6Compression.compressT6(byteArray2, 3100, (byte) (-30));
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 3100, 320, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 2, 2);
      byte[] byteArray2 = T4AndT6Compression.compressT4_2D(byteArray1, 2, 2, false, 2);
      assertArrayEquals(new byte[] {(byte)0, (byte)25, (byte) (-82), (byte)0, (byte)32, (byte) (-64), (byte)4}, byteArray2);
      
      byte[] byteArray3 = T4AndT6Compression.compressT6(byteArray1, 2, 2);
      assertArrayEquals(new byte[] {(byte)10, (byte)24, (byte)0, (byte) (-128), (byte)8}, byteArray3);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-11);
      byteArray0[1] = (byte) (-11);
      byteArray0[2] = (byte) (-2);
      byteArray0[3] = (byte)119;
      byteArray0[4] = (byte)91;
      byteArray0[5] = (byte)68;
      byteArray0[6] = (byte)109;
      byteArray0[7] = (byte)2;
      byteArray0[8] = (byte)107;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 26, 75, true, 47);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)10;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)10, (byte)10, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)21;
      byteArray0[3] = (byte)21;
      byteArray0[4] = (byte)107;
      byteArray0[5] = (byte)5;
      byteArray0[4] = (byte)0;
      byteArray0[7] = (byte)15;
      T4AndT6Compression.decompressT4_1D(byteArray0, (byte)5, (byte)0, false);
      T4AndT6Compression.compressT4_1D(byteArray0, (byte)0, (byte)18, false);
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 61, (byte)21, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)19;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)19, (byte)19, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-11);
      byteArray0[1] = (byte) (-11);
      byteArray0[2] = (byte) (-11);
      byteArray0[3] = (byte)119;
      byteArray0[4] = (byte)91;
      byteArray0[5] = (byte)68;
      byteArray0[6] = (byte)91;
      byte[] byteArray1 = T4AndT6Compression.decompressT4_1D(byteArray0, (-3), (-717), true);
      byte[] byteArray2 = T4AndT6Compression.compressT4_1D(byteArray1, (-268), (byte)119, true);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray2, 61, (byte)119, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[5] = (byte)21;
      byteArray0[2] = (byte) (-104);
      byteArray0[3] = (byte)18;
      byteArray0[4] = (byte)92;
      byte byte0 = (byte)1;
      byteArray0[5] = (byte)1;
      byteArray0[6] = (byte) (-127);
      byteArray0[7] = (byte)15;
      byteArray0[8] = (byte)1;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (byte)1, 7, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)10;
      byte byte0 = (byte)9;
      byteArray0[1] = (byte)9;
      byte byte1 = (byte) (-10);
      byteArray0[2] = (byte) (-10);
      byte byte2 = (byte)86;
      byteArray0[3] = (byte)86;
      byte byte3 = (byte)8;
      byteArray0[4] = (byte)8;
      byteArray0[5] = (byte)34;
      byte byte4 = (byte)63;
      byteArray0[6] = (byte)63;
      byteArray0[7] = (byte)6;
      try { 
        T4AndT6Compression.compressT6(byteArray0, (byte)10, (byte)9);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)2;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, 49, 252, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)3;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 790, 790, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte byte0 = (byte)4;
      byteArray0[1] = (byte)4;
      boolean boolean0 = true;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (byte)4, (byte)4, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte byte0 = (byte)14;
      byteArray0[1] = (byte)14;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)14, (byte)14, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)17;
      byteArray0[1] = (byte) (-29);
      byteArray0[2] = (byte) (-28);
      byteArray0[3] = (byte) (-32);
      byteArray0[4] = (byte)26;
      byteArray0[5] = (byte)104;
      byteArray0[6] = (byte)110;
      int int0 = 1499;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte)17, 1499, false, (byte)26);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)3;
      byteArray0[1] = (byte) (-2);
      byteArray0[2] = (byte)1;
      byteArray0[3] = (byte) (-29);
      byteArray0[4] = (byte) (-127);
      byteArray0[5] = (byte) (-9);
      byteArray0[6] = (byte)15;
      byteArray0[7] = (byte) (-127);
      byteArray0[8] = (byte)32;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 6, 1792, true, 1513);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      byte[] byteArray0 = new byte[30];
      try { 
        T4AndT6Compression.compressModifiedHuffman(byteArray0, 143, 143);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)26;
      byte byte0 = (byte)104;
      byteArray0[4] = (byte)104;
      boolean boolean0 = false;
      int int0 = 0;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 0, (byte)104, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte)95;
      byte byte0 = (byte)91;
      byteArray0[2] = (byte)91;
      byte byte1 = (byte)54;
      byteArray0[3] = (byte)54;
      byte byte2 = (byte)36;
      byteArray0[4] = (byte)36;
      byte byte3 = (byte)0;
      byteArray0[1] = (byte)0;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (byte)0, (byte)36, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }
}
