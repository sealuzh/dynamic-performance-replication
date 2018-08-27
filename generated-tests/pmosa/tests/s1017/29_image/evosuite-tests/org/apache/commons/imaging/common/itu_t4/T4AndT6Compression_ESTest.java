/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 11:34:56 GMT 2018
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
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, (-2755), (byte)0);
      try { 
        T4AndT6Compression.compressT6(byteArray1, 2432, 2432);
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
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-64);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)36;
      byteArray0[3] = (byte)0;
      byte[] byteArray1 = T4AndT6Compression.decompressModifiedHuffman(byteArray0, 315, 0);
      T4AndT6Compression.compressModifiedHuffman(byteArray1, (byte)0, (-1718));
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, 1792, (byte)36, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      T4AndT6Compression.decompressT4_1D(byteArray0, 1505, (-1188), true);
      byte[] byteArray1 = T4AndT6Compression.decompressT6(byteArray0, 1505, (-1188));
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = 624;
      try { 
        T4AndT6Compression.compressT4_1D(byteArray0, 624, 624, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte)0;
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)11;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)0;
      boolean boolean0 = false;
      try { 
        T4AndT6Compression.compressT4_1D(byteArray0, 762, 827, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      T4AndT6Compression.decompressT4_1D(byteArray0, (byte)0, (byte)0, true);
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 1, 1, false);
      assertArrayEquals(new byte[] {(byte)0, (byte)17, (byte) (-64), (byte)4}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      T4AndT6Compression.compressT6(byteArray0, 0, 1);
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressModifiedHuffman((byte[]) null, 1, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)0;
      int int0 = 0;
      T4AndT6Compression.compressT4_2D(byteArray0, (byte)0, (-384), false, 0);
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)0, 2, false);
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
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, (-3), (-3));
      byte[] byteArray2 = T4AndT6Compression.compressT4_2D(byteArray1, 7, (-3), false, 7);
      assertArrayEquals(new byte[] {(byte)0, (byte)16}, byteArray2);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte)0;
      byteArray0[0] = (byte)0;
      byte byte1 = (byte) (-3);
      byteArray0[1] = (byte) (-3);
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (-935), (byte)0, true);
      boolean boolean0 = true;
      // Undeclared exception!
      T4AndT6Compression.compressT4_2D(byteArray1, (byte)0, 1012, true, 0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 9, 3, true, 9);
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
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-76);
      byteArray0[1] = (byte)64;
      byteArray0[2] = (byte) (-16);
      byteArray0[3] = (byte)0;
      T4AndT6Compression.compressT4_1D(byteArray0, 1085, (byte) (-16), true);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, 23, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)8;
      byteArray0[1] = (byte)1;
      byteArray0[2] = (byte)1;
      byteArray0[3] = (byte)1;
      T4AndT6Compression.decompressT6(byteArray0, (byte)0, (byte)1);
      byteArray0[4] = (byte)64;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte)0;
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      T4AndT6Compression.compressModifiedHuffman(byteArray0, (-1759), (-1759));
      byte[] byteArray1 = new byte[1];
      byteArray1[0] = (byte) (-40);
      byte[] byteArray2 = T4AndT6Compression.decompressT6(byteArray1, 1, 1);
      assertArrayEquals(new byte[] {(byte)0}, byteArray2);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 1, 1, false, (byte)0);
      try { 
        T4AndT6Compression.decompressT6(byteArray1, 1, 1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid/unknown T.6 control code 000000000001
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)46;
      byteArray0[1] = (byte)1;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)1, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)0;
      byte byte0 = (byte) (-85);
      byteArray0[1] = (byte) (-85);
      byteArray0[2] = (byte)0;
      byte byte1 = (byte)80;
      byteArray0[3] = (byte)80;
      byteArray0[4] = (byte)0;
      byte byte2 = (byte)0;
      byteArray0[5] = (byte)0;
      T4AndT6Compression.decompressT4_1D(byteArray0, 724, (-3286), true);
      try { 
        T4AndT6Compression.decompressT6(byteArray0, 724, 724);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte byte0 = (byte) (-71);
      byteArray0[0] = (byte) (-71);
      boolean boolean0 = false;
      byte[] byteArray1 = T4AndT6Compression.decompressT4_2D(byteArray0, 2361, (byte) (-71), false);
      T4AndT6Compression.compressModifiedHuffman(byteArray1, (-2653), (byte) (-71));
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte) (-71), (-2653), false);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte byte0 = (byte) (-99);
      int int0 = 28;
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte) (-99), 28);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)0;
      byte byte0 = (byte)62;
      byteArray0[1] = (byte)62;
      boolean boolean0 = false;
      int int0 = (-2275);
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, (byte)62, (byte)0, false, (-2275));
      int int1 = 8;
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray1, (-2275), 8);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte byte0 = (byte) (-95);
      byteArray0[0] = (byte) (-95);
      int int0 = 896;
      T4AndT6Compression.decompressT6(byteArray0, 0, 896);
      boolean boolean0 = true;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, 896, 896, true);
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
      byte[] byteArray0 = new byte[107];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, 1, 1);
      assertArrayEquals(new byte[] {(byte)28}, byteArray1);
      
      byte[] byteArray2 = T4AndT6Compression.decompressModifiedHuffman(byteArray1, 1, 1);
      assertArrayEquals(new byte[] {(byte)0}, byteArray2);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (byte)0, (byte) (-16), true);
      try { 
        T4AndT6Compression.decompressT6(byteArray1, 477, 418);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid/unknown T.6 control code 0000000000000001
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-64);
      try { 
        T4AndT6Compression.compressT6(byteArray0, 29, 10);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = 63;
      boolean boolean0 = false;
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (-3936), 63, false);
      int int1 = 49;
      int int2 = 0;
      T4AndT6Compression.compressT4_1D(byteArray1, 49, 0, false);
      int int3 = 261;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray1, 261, 63, false);
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
      byte[] byteArray0 = new byte[55];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 1, 1, false);
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray1, 1, 1856, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (-1096), (-1096), false);
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray1, (-1096), 1785, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = (-1318);
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 650, (-1318), false);
      T4AndT6Compression.decompressT4_1D(byteArray1, 650, (-1318), false);
      int int1 = (-2722);
      int int2 = 2599;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray1, (-2722), 2599, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      T4AndT6Compression.compressT4_1D(byteArray0, 650, (-1318), false);
      byte[] byteArray1 = new byte[9];
      byteArray1[0] = (byte) (-128);
      byteArray1[1] = (byte)41;
      byteArray1[2] = (byte) (-21);
      byteArray1[3] = (byte) (-65);
      byteArray1[4] = (byte)59;
      byteArray1[5] = (byte) (-1);
      byteArray1[6] = (byte)40;
      byteArray1[7] = (byte)61;
      byteArray1[8] = (byte)22;
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray1, (byte)40, 64);
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
      byteArray0[0] = (byte)14;
      byteArray0[1] = (byte)51;
      boolean boolean0 = false;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte)14, (byte)51, false, (byte)51);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_1D(byteArray0, (byte)0, (byte)0, false);
      int int0 = (-3);
      byte[] byteArray2 = T4AndT6Compression.compressT4_1D(byteArray1, 2240, (-3), false);
      int int1 = 2034;
      boolean boolean0 = true;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray2, 1, 2034, true, 2034);
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
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte)0;
      byteArray0[0] = (byte)0;
      byte byte1 = (byte) (-3);
      byteArray0[1] = (byte) (-3);
      boolean boolean0 = true;
      int int0 = (-37);
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 63, (-37), true);
      int int1 = 0;
      int int2 = 5;
      int int3 = 26;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray1, 5, 5, true, 26);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)94;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 4, 416, false, (-3124));
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
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)50;
      byteArray0[1] = (byte) (-64);
      byteArray0[2] = (byte)5;
      byteArray0[3] = (byte)37;
      byteArray0[4] = (byte)13;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 1, (byte)37, false, 5);
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
      byte[] byteArray0 = new byte[1];
      int int0 = 1;
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 1, 1, true);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 1, 1, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[17];
      byteArray0[1] = (byte)27;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 66, 64, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 2, 2);
      byte[] byteArray2 = T4AndT6Compression.compressT4_2D(byteArray1, 2, 2, false, 2);
      assertArrayEquals(new byte[] {(byte)0, (byte)25, (byte) (-82), (byte)0, (byte)32, (byte) (-64), (byte)4}, byteArray2);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-80);
      byteArray0[3] = (byte)4;
      byteArray0[2] = (byte) (-20);
      byteArray0[0] = (byte) (-65);
      byteArray0[4] = (byte) (-114);
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 2, 428, false, (byte) (-65));
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
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)25;
      byteArray0[1] = (byte)24;
      byteArray0[2] = (byte) (-56);
      byteArray0[3] = (byte)14;
      byteArray0[4] = (byte)75;
      byteArray0[5] = (byte)45;
      byteArray0[6] = (byte) (-1);
      byteArray0[7] = (byte) (-2);
      try { 
        T4AndT6Compression.compressT6(byteArray0, (byte)25, 28);
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
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-80);
      byteArray0[3] = (byte)4;
      byteArray0[2] = (byte) (-20);
      byteArray0[0] = (byte) (-73);
      byteArray0[4] = (byte) (-115);
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte)4, 428, true, (byte) (-80));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      boolean boolean0 = true;
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)7;
      byteArray0[2] = (byte)7;
      byteArray0[3] = (byte)7;
      byteArray0[4] = (byte)7;
      byteArray0[5] = (byte)7;
      byteArray0[6] = (byte) (-51);
      byteArray0[7] = (byte)7;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (byte)0, 4, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte byte0 = (byte)64;
      byte byte1 = (byte)1;
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)8;
      byteArray0[1] = (byte)1;
      byteArray0[2] = (byte)1;
      byteArray0[3] = (byte)1;
      byte[] byteArray1 = new byte[6];
      byteArray1[0] = (byte)8;
      byteArray1[1] = (byte)8;
      byteArray1[2] = (byte)8;
      byteArray1[3] = (byte)8;
      byteArray1[4] = (byte)64;
      byteArray1[5] = (byte)1;
      try { 
        T4AndT6Compression.decompressT6(byteArray1, (byte)1, 64);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-100);
      byteArray0[1] = (byte)11;
      byte byte0 = (byte)12;
      byteArray0[2] = (byte)12;
      byteArray0[3] = (byte)2;
      byte byte1 = (byte) (-31);
      byteArray0[4] = (byte) (-31);
      byteArray0[5] = (byte)8;
      byte byte2 = (byte)3;
      byteArray0[6] = (byte)3;
      byteArray0[7] = (byte)13;
      byteArray0[8] = (byte)64;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte)3, 21, false, 192);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      byte[] byteArray0 = new byte[89];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 2, 2);
      byte[] byteArray2 = T4AndT6Compression.compressT6(byteArray1, 2, 2);
      assertArrayEquals(new byte[] {(byte)10, (byte)24, (byte)0, (byte) (-128), (byte)8}, byteArray2);
      
      byte[] byteArray3 = T4AndT6Compression.compressT4_1D(byteArray1, 27, (-425), false);
      assertArrayEquals(new byte[] {(byte)0, (byte)16}, byteArray3);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)25;
      byteArray0[2] = (byte) (-26);
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)75;
      byteArray0[6] = (byte) (-1);
      byteArray0[7] = (byte) (-2);
      try { 
        T4AndT6Compression.compressT6(byteArray0, (byte)25, 28);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      int int0 = 67;
      boolean boolean0 = false;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 67, 67, false, 12);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      byte[] byteArray0 = new byte[18];
      try { 
        T4AndT6Compression.compressT4_1D(byteArray0, 93, 93, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (-1), 2, true);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 2, 62, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      byte[] byteArray0 = new byte[16];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 2, 2, true);
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 2, 4688, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 0, 0, false);
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 0, 1344, true);
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
      byteArray0[0] = (byte) (-100);
      byteArray0[1] = (byte)11;
      byteArray0[2] = (byte)12;
      byteArray0[3] = (byte)2;
      byteArray0[4] = (byte) (-31);
      byteArray0[5] = (byte)8;
      byteArray0[6] = (byte)3;
      byteArray0[7] = (byte)13;
      byteArray0[8] = (byte)64;
      try { 
        T4AndT6Compression.compressT6(byteArray0, 21, 21);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      byte[] byteArray0 = new byte[18];
      int int0 = 128;
      try { 
        T4AndT6Compression.compressModifiedHuffman(byteArray0, 128, 21);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)25;
      byteArray0[2] = (byte)25;
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (-1525), 374, false);
      int int0 = 2306;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, (byte)25, 2306, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      byte[] byteArray0 = new byte[11];
      byteArray0[4] = (byte)63;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte)8, 506, true, (-1732));
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
      byte[] byteArray0 = new byte[16];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 6, 6, false);
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 63, 121, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      byte[] byteArray0 = new byte[27];
      byteArray0[1] = (byte)14;
      int int0 = (-1);
      int int1 = 4;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (-1), 4, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-58);
      int int0 = 1;
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 1, 1, true, (byte) (-58));
      int int1 = 11;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 1, 11, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      byte[] byteArray0 = new byte[55];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 1, 1, true);
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray1, 1, 1856, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      int int0 = 1;
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 1, 1, true, (byte)0);
      int int1 = 11;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 1, 11, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }
}