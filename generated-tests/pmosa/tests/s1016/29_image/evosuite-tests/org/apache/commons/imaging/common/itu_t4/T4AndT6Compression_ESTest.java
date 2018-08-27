/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 10:33:52 GMT 2018
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
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte)0;
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)66;
      int int0 = 3233;
      boolean boolean0 = true;
      // Undeclared exception!
      T4AndT6Compression.compressT4_1D(byteArray0, (byte)0, 3233, true);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      try { 
        T4AndT6Compression.compressT4_1D(byteArray0, 1931, 1931, true);
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
      byte[] byteArray0 = new byte[0];
      try { 
        T4AndT6Compression.compressModifiedHuffman(byteArray0, 304, 304);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)20;
      byteArray0[2] = (byte)0;
      T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte)20, (byte)0);
      T4AndT6Compression.decompressT6(byteArray0, 479, (byte)0);
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte)20, 3812, false, (byte)0);
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
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-98);
      byteArray0[1] = (byte)93;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)30;
      byteArray0[4] = (byte)68;
      byteArray0[5] = (byte)64;
      byteArray0[6] = (byte)52;
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte)93, (byte)52);
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
      byte[] byteArray0 = new byte[10];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, 1, 1);
      assertArrayEquals(new byte[] {(byte)28}, byteArray1);
      
      byte[] byteArray2 = T4AndT6Compression.decompressModifiedHuffman(byteArray1, 1, 1);
      assertArrayEquals(new byte[] {(byte)0}, byteArray2);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = 0;
      T4AndT6Compression.decompressT6(byteArray0, 0, 0);
      int int1 = 348;
      byte[] byteArray1 = T4AndT6Compression.decompressT6(byteArray0, 0, 348);
      int int2 = (-3);
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray1, (-3), 348);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte) (-5), 1344);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-65);
      int int0 = 0;
      int int1 = 448;
      boolean boolean0 = true;
      int int2 = 879;
      T4AndT6Compression.compressT4_2D(byteArray0, 0, 448, true, 879);
      int int3 = 0;
      byte[] byteArray1 = T4AndT6Compression.decompressT6(byteArray0, 0, 0);
      int int4 = 367;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 879, 367, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[34];
      T4AndT6Compression.compressT4_2D(byteArray0, 0, 2, false, 5);
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, 5, 5, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)52;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (byte)52, (byte)52, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)21;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (byte)21, (byte)21, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte) (-39), (byte) (-39));
      try { 
        T4AndT6Compression.compressT6(byteArray1, 9, 9);
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
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)6;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)6, (byte)6);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, 1, 1);
      assertArrayEquals(new byte[] {(byte)28}, byteArray1);
      
      byte[] byteArray2 = T4AndT6Compression.decompressT6(byteArray1, 1, 1);
      assertArrayEquals(new byte[] {(byte)0}, byteArray2);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_1D(byteArray0, (-2623), (-2623), true);
      byte[] byteArray2 = T4AndT6Compression.compressT6(byteArray1, 1, (-2623));
      try { 
        T4AndT6Compression.decompressT6(byteArray2, 1, 1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid/unknown T.6 control code 000000000001
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte byte0 = (byte)25;
      byteArray0[0] = (byte)25;
      byte byte1 = (byte)12;
      byteArray0[1] = (byte)12;
      byteArray0[2] = (byte)22;
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)25, (byte)12);
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
      byte[] byteArray0 = new byte[12];
      int int0 = 1;
      int int1 = 64;
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, 64, 1);
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 3205, 338, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte byte0 = (byte)64;
      int int0 = 0;
      int int1 = 948;
      try { 
        T4AndT6Compression.compressModifiedHuffman(byteArray0, (byte)64, 948);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte byte0 = (byte) (-62);
      byteArray0[0] = (byte) (-62);
      byte byte1 = (byte)8;
      int int0 = 5;
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)8, 5);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      T4AndT6Compression.compressT6(byteArray0, 0, 1);
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT6(byteArray0, (-658), 35);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, (byte) (-98), 948);
      T4AndT6Compression.compressModifiedHuffman(byteArray0, (-1), (-1334));
      // Undeclared exception!
      T4AndT6Compression.decompressT6(byteArray1, 437, 3486);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      T4AndT6Compression.decompressT4_1D(byteArray0, (byte) (-5), (byte) (-5), true);
      byte[] byteArray1 = new byte[5];
      byteArray1[0] = (byte)58;
      byteArray1[1] = (byte) (-9);
      byteArray1[2] = (byte) (-5);
      byteArray1[3] = (byte) (-5);
      byteArray1[4] = (byte)50;
      try { 
        T4AndT6Compression.decompressT6(byteArray1, 271, (byte)50);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte)6;
      byteArray0[0] = (byte)6;
      byteArray0[1] = (byte)17;
      byteArray0[2] = (byte)27;
      byteArray0[3] = (byte)64;
      try { 
        T4AndT6Compression.compressT6(byteArray0, (byte)27, (byte)12);
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
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 2, 2, false, 2);
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray1, 2, 2);
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
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-33);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)38;
      byte byte0 = (byte)15;
      byteArray0[3] = (byte)15;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)17;
      byteArray0[7] = (byte) (-14);
      byteArray0[8] = (byte)4;
      boolean boolean0 = true;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 21, (byte)17, true, 3254);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte)19;
      byteArray0[0] = (byte)19;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 4, (byte)19, true, 103);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 2, 2);
      byte[] byteArray2 = T4AndT6Compression.compressT6(byteArray1, 2, 2);
      assertArrayEquals(new byte[] {(byte)10, (byte)24, (byte)0, (byte) (-128), (byte)8}, byteArray2);
      
      byte[] byteArray3 = T4AndT6Compression.compressT4_2D(byteArray1, 2, 2, false, 2);
      assertArrayEquals(new byte[] {(byte)0, (byte)25, (byte) (-82), (byte)0, (byte)32, (byte) (-64), (byte)4}, byteArray3);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[15];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 1, 1);
      byte[] byteArray2 = T4AndT6Compression.compressT6(byteArray1, 1, 3);
      assertArrayEquals(new byte[] {(byte)87, (byte)0, (byte)16, (byte)1}, byteArray2);
      assertArrayEquals(new byte[] {(byte) (-128), (byte)8, (byte)0, (byte) (-128)}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[23];
      byteArray0[0] = (byte) (-4);
      byteArray0[1] = (byte)25;
      byteArray0[2] = (byte)25;
      byteArray0[3] = (byte)25;
      byteArray0[4] = (byte)25;
      try { 
        T4AndT6Compression.compressT6(byteArray0, 32, 823);
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
      byte[] byteArray0 = new byte[26];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 2, (byte)0, false, (byte)0);
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 4, 2, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      boolean boolean0 = false;
      int int0 = (-1446);
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (-1446), (-1446), false);
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray1, (-1446), 457, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 39, (-2294), false, (-2294));
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray1, 39, 39, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)15;
      byteArray0[2] = (byte)21;
      byteArray0[3] = (byte) (-111);
      byteArray0[4] = (byte) (-97);
      byteArray0[5] = (byte)20;
      byteArray0[6] = (byte)38;
      byteArray0[7] = (byte) (-126);
      byteArray0[8] = (byte)19;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, 63, 320, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 1, 1, false);
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray1, 2, 2, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      T4AndT6Compression.decompressModifiedHuffman(byteArray0, (-3), (-3));
      byte[] byteArray1 = new byte[9];
      byteArray1[0] = (byte)55;
      byteArray1[1] = (byte)92;
      byteArray1[2] = (byte)0;
      byteArray1[3] = (byte)118;
      byteArray1[4] = (byte)90;
      byteArray1[5] = (byte)3;
      byteArray1[6] = (byte)19;
      byteArray1[7] = (byte)42;
      byteArray1[8] = (byte)55;
      try { 
        T4AndT6Compression.decompressT6(byteArray1, 603, (byte)118);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid/unknown T.6 control code 000000000001
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte byte0 = (byte)25;
      byte[] byteArray0 = new byte[26];
      byteArray0[1] = (byte)25;
      byteArray0[6] = (byte)25;
      int int0 = 2;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 2, (byte)25, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-3);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)58;
      T4AndT6Compression.decompressModifiedHuffman(byteArray0, 2857, (byte)0);
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, (byte) (-3), (-3));
      T4AndT6Compression.compressT4_2D(byteArray1, (byte)58, (-498), true, 2);
      byte[] byteArray2 = new byte[3];
      byteArray2[0] = (byte)0;
      byteArray2[1] = (byte)0;
      byteArray2[2] = (byte) (-57);
      T4AndT6Compression.compressT6(byteArray2, (byte)0, (-417));
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray2, (-3415), 2, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      int int0 = 1;
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 1, 1, false);
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
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (-1651), 8, true);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 8, 8, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 2, 2, false);
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 2, 2, false);
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
      byte[] byteArray0 = new byte[23];
      byteArray0[0] = (byte) (-4);
      int int0 = 184;
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (byte) (-4), 184, false);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 1789, 1375, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[23];
      byteArray0[0] = (byte) (-4);
      T4AndT6Compression.compressT4_1D(byteArray0, (byte) (-4), 184, false);
      try { 
        T4AndT6Compression.compressT4_1D(byteArray0, 184, 1152, false);
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
      byte[] byteArray0 = new byte[26];
      byteArray0[0] = (byte) (-4);
      byteArray0[1] = (byte)25;
      byteArray0[2] = (byte)25;
      byteArray0[5] = (byte)25;
      byteArray0[6] = (byte)25;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 11, (byte)25, false, (byte)25);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[15];
      byteArray0[0] = (byte) (-4);
      byteArray0[1] = (byte)12;
      byteArray0[3] = (byte) (-4);
      byteArray0[4] = (byte)12;
      try { 
        T4AndT6Compression.compressT6(byteArray0, (byte)12, (byte)12);
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
      byte[] byteArray0 = new byte[26];
      byteArray0[1] = (byte)25;
      byteArray0[3] = (byte)25;
      byteArray0[5] = (byte)25;
      byteArray0[6] = (byte)25;
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 2, (byte)25, false, 50);
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 2, 50, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      byte[] byteArray0 = new byte[26];
      byteArray0[1] = (byte)5;
      byteArray0[6] = (byte)5;
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 2, (byte)5, true, 2);
      byte[] byteArray2 = T4AndT6Compression.decompressT4_2D(byteArray1, 2, (byte)5, true);
      byte[] byteArray3 = T4AndT6Compression.compressT4_1D(byteArray0, 11, (byte)5, true);
      assertNotSame(byteArray3, byteArray2);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 2, 2, true, 2163);
      T4AndT6Compression.decompressT4_2D(byteArray1, 2, 2, true);
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray1, 7, 7, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 1
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      byte[] byteArray0 = new byte[26];
      byteArray0[0] = (byte) (-4);
      byteArray0[2] = (byte)25;
      byteArray0[14] = (byte)25;
      byteArray0[4] = (byte)25;
      byteArray0[5] = (byte)25;
      byteArray0[6] = (byte)25;
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 2, (byte)25, false, (byte) (-4));
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 2, 609, false);
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
      byte[] byteArray0 = new byte[26];
      byteArray0[0] = (byte) (-4);
      byteArray0[2] = (byte)25;
      byteArray0[14] = (byte)25;
      byteArray0[4] = (byte)25;
      byteArray0[5] = (byte)25;
      byteArray0[6] = (byte)25;
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 3, (byte)25, true, (byte) (-4));
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 3, 609, true);
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
      byte[] byteArray0 = new byte[26];
      byteArray0[0] = (byte) (-4);
      byteArray0[2] = (byte)25;
      byteArray0[14] = (byte)25;
      byteArray0[6] = (byte)25;
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 3, (byte)25, true, (byte) (-4));
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 3, 609, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }
}