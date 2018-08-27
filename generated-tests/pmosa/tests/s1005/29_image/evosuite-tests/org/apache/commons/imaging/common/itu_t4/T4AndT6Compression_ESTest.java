/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 03:49:06 GMT 2018
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
      byteArray0[0] = (byte)3;
      byteArray0[1] = (byte)95;
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, (byte)95, (-3916));
      byte[] byteArray2 = T4AndT6Compression.decompressT6(byteArray0, 0, (byte)3);
      T4AndT6Compression.compressT4_1D(byteArray2, (byte)95, 0, false);
      byte[] byteArray3 = T4AndT6Compression.compressT6(byteArray2, (byte)95, (-3916));
      byte[] byteArray4 = T4AndT6Compression.decompressT4_2D(byteArray3, 0, (-379), true);
      assertNotSame(byteArray4, byteArray1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 315, (-623));
      T4AndT6Compression.decompressT6(byteArray0, 315, (-623));
      byte[] byteArray2 = T4AndT6Compression.decompressT4_1D(byteArray1, (-623), (-623), true);
      assertNotSame(byteArray2, byteArray1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)1;
      byte byte0 = (byte)0;
      byteArray0[1] = (byte)0;
      byte byte1 = (byte) (-4);
      byteArray0[2] = (byte) (-4);
      byte byte2 = (byte)19;
      byteArray0[3] = (byte)19;
      try { 
        T4AndT6Compression.compressT4_1D(byteArray0, (byte)19, 30, true);
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
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = T4AndT6Compression.decompressModifiedHuffman(byteArray0, (-3), (-3));
      try { 
        T4AndT6Compression.compressT4_1D(byteArray1, 2756, 2756, false);
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
      byte[] byteArray0 = new byte[20];
      int int0 = 1;
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, 1, 1);
      int int1 = 2;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 2, 2, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (-392), 1, true);
      assertArrayEquals(new byte[] {(byte)0, (byte)1, (byte)53, (byte)0, (byte)1}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[34];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 1, 1, false);
      T4AndT6Compression.decompressT4_2D(byteArray1, 0, 0, false);
      assertArrayEquals(new byte[] {(byte)0, (byte)17, (byte) (-64), (byte)4}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte byte0 = (byte)8;
      byteArray0[0] = (byte)8;
      byteArray0[1] = (byte) (-117);
      byte byte1 = (byte)8;
      byteArray0[2] = (byte)8;
      T4AndT6Compression.compressModifiedHuffman(byteArray0, 289, (-2475));
      int int0 = 274;
      boolean boolean0 = false;
      T4AndT6Compression.compressT4_2D(byteArray0, 274, (byte) (-117), false, 2638);
      int int1 = 853;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 853, (byte)8, false, (-3549));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte byte0 = (byte) (-21);
      byteArray0[0] = (byte) (-21);
      byteArray0[1] = (byte)53;
      byteArray0[2] = (byte)116;
      byte byte1 = (byte)29;
      byteArray0[3] = (byte)29;
      byte byte2 = (byte)63;
      byteArray0[4] = (byte)63;
      byteArray0[5] = (byte)0;
      T4AndT6Compression.compressT4_2D(byteArray0, (byte)0, (byte)116, true, (byte) (-21));
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT6(byteArray0, (-5460), 0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      T4AndT6Compression.decompressModifiedHuffman(byteArray0, (-4), (-4));
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 7, 7, false, (-4));
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
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (byte)0, (byte)0, false);
      assertArrayEquals(new byte[] {(byte)0, (byte)16}, byteArray1);
      
      byte[] byteArray2 = T4AndT6Compression.compressT4_2D(byteArray0, 1, 1, false, 2639);
      assertArrayEquals(new byte[] {(byte)0, (byte)24, (byte) (-32), (byte)2}, byteArray2);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)28;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (byte)28, (byte)28, false);
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
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)31;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)31, (byte)31, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte) (-103), (byte) (-103));
      byte[] byteArray2 = T4AndT6Compression.decompressT4_1D(byteArray1, (byte) (-103), (byte) (-103), false);
      assertArrayEquals(new byte[] {}, byteArray2);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte byte0 = (byte) (-13);
      byteArray0[0] = (byte) (-13);
      byte byte1 = (byte) (-3);
      byteArray0[1] = (byte) (-3);
      byte byte2 = (byte) (-19);
      byteArray0[2] = (byte) (-19);
      int int0 = (-404);
      boolean boolean0 = false;
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 576, (-404), false, 0);
      T4AndT6Compression.decompressModifiedHuffman(byteArray1, (byte) (-13), (byte) (-13));
      byte[] byteArray2 = T4AndT6Compression.compressModifiedHuffman(byteArray1, 576, (-3965));
      int int1 = 62;
      try { 
        T4AndT6Compression.compressT6(byteArray2, 62, 1792);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, 5, (-2));
      try { 
        T4AndT6Compression.compressT6(byteArray1, 1832, 1832);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = T4AndT6Compression.decompressModifiedHuffman(byteArray0, (-2820), (-2820));
      try { 
        T4AndT6Compression.compressModifiedHuffman(byteArray1, 63, 75);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte byte0 = (byte) (-13);
      byteArray0[0] = (byte) (-13);
      int int0 = 961;
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, 961, 64);
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
      byteArray0[0] = (byte)57;
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, 7, (byte)57);
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
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-112);
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, 17, 17);
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
      byte[] byteArray0 = new byte[1];
      byte byte0 = (byte) (-126);
      byteArray0[0] = (byte) (-126);
      byte[] byteArray1 = T4AndT6Compression.decompressT4_1D(byteArray0, 0, 0, true);
      byte[] byteArray2 = T4AndT6Compression.compressT4_1D(byteArray1, (byte) (-126), 0, true);
      T4AndT6Compression.compressT4_2D(byteArray2, 0, (-1), true, 0);
      int int0 = 0;
      T4AndT6Compression.decompressT4_1D(byteArray2, 0, 0, false);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray2, (-459), 0);
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
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)2;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-68);
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte) (-105);
      byteArray0[5] = (byte)0;
      boolean boolean0 = true;
      T4AndT6Compression.decompressT4_1D(byteArray0, (byte) (-68), (byte) (-105), true);
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte) (-105), 2);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, 1, 1);
      byte[] byteArray2 = T4AndT6Compression.compressT6(byteArray1, 1, 1);
      assertArrayEquals(new byte[] {(byte) (-128), (byte)8, (byte)0, (byte) (-128)}, byteArray2);
      assertArrayEquals(new byte[] {(byte)28}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, 1, 1);
      byte[] byteArray2 = T4AndT6Compression.decompressT6(byteArray1, 1, 1);
      assertArrayEquals(new byte[] {(byte)28}, byteArray1);
      assertArrayEquals(new byte[] {(byte)0}, byteArray2);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)8;
      byteArray0[1] = (byte) (-117);
      byte byte0 = (byte)8;
      byteArray0[2] = (byte)8;
      T4AndT6Compression.compressModifiedHuffman(byteArray0, 289, (-2475));
      T4AndT6Compression.compressT4_2D(byteArray0, 274, (byte) (-117), false, 2638);
      int int0 = 1751;
      int int1 = 1;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, 1751, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1751
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 0, (-1), true);
      try { 
        T4AndT6Compression.decompressT6(byteArray1, 1, 1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid/unknown T.6 control code 0000000000000001
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[2] = (byte) (-125);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 1, 1743, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)38;
      byte byte0 = (byte)0;
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, (byte)0, (-3562));
      int int0 = 4856;
      try { 
        T4AndT6Compression.decompressT6(byteArray1, (byte)38, 4856);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid/unknown T.6 control code 000000000001
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      T4AndT6Compression.compressModifiedHuffman(byteArray0, 768, (-949));
      T4AndT6Compression.compressT4_1D(byteArray0, (-949), (-3005), true);
      byte[] byteArray1 = new byte[2];
      byteArray1[0] = (byte) (-68);
      byteArray1[1] = (byte) (-64);
      try { 
        T4AndT6Compression.compressT6(byteArray1, 4, 717);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte byte0 = (byte)0;
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byte byte1 = (byte)106;
      byteArray0[2] = (byte)106;
      byte byte2 = (byte)0;
      byteArray0[3] = (byte)0;
      byte byte3 = (byte)0;
      try { 
        T4AndT6Compression.compressT6(byteArray0, 23, (byte)106);
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
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte)19;
      boolean boolean0 = true;
      // Undeclared exception!
      T4AndT6Compression.compressT4_1D(byteArray0, (-743), 832, true);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte byte0 = (byte)21;
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)19;
      byteArray0[1] = (byte) (-26);
      byteArray0[2] = (byte) (-26);
      byteArray0[3] = (byte) (-128);
      byteArray0[4] = (byte)21;
      byteArray0[5] = (byte)19;
      try { 
        T4AndT6Compression.compressT6(byteArray0, (byte)19, (byte)19);
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
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = new byte[5];
      byteArray1[0] = (byte) (-13);
      byteArray1[1] = (byte) (-13);
      T4AndT6Compression.decompressModifiedHuffman(byteArray0, 3674, (byte) (-13));
      byteArray1[2] = (byte) (-13);
      byteArray1[3] = (byte) (-13);
      byteArray1[4] = (byte) (-13);
      boolean boolean0 = false;
      T4AndT6Compression.decompressT4_2D(byteArray1, (byte)0, (-204), false);
      byte[] byteArray2 = new byte[7];
      byteArray2[0] = (byte) (-13);
      byteArray2[1] = (byte) (-13);
      byteArray2[2] = (byte) (-13);
      byteArray2[3] = (byte) (-13);
      byteArray2[4] = (byte) (-13);
      byteArray2[5] = (byte) (-13);
      byteArray2[6] = (byte) (-13);
      // Undeclared exception!
      T4AndT6Compression.compressT4_2D(byteArray2, 0, 1792, false, (-204));
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (-768), (-768), true);
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray1, (-768), 2240, true);
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
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)107;
      byteArray0[1] = (byte)28;
      byte byte0 = (byte) (-32);
      byteArray0[2] = (byte) (-32);
      byteArray0[3] = (byte) (-1);
      byteArray0[4] = (byte)9;
      boolean boolean0 = true;
      T4AndT6Compression.compressT4_1D(byteArray0, (byte)107, (-819), true);
      int int0 = 4;
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, 4, 37);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte byte0 = (byte)63;
      byteArray0[0] = (byte)63;
      byteArray0[1] = (byte)100;
      byteArray0[2] = (byte)64;
      byteArray0[3] = (byte) (-68);
      byte byte1 = (byte) (-120);
      byteArray0[4] = (byte) (-120);
      byteArray0[5] = (byte)12;
      byteArray0[6] = (byte)4;
      byteArray0[7] = (byte)17;
      byteArray0[8] = (byte) (-53);
      try { 
        T4AndT6Compression.compressT6(byteArray0, (byte)17, 7);
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
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (-3), (-3), false);
      int int0 = 270;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray1, (-3), 270, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[85];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, 8, 4);
      byte[] byteArray2 = T4AndT6Compression.compressT6(byteArray1, 4, (-36));
      try { 
        T4AndT6Compression.compressT4_2D(byteArray2, 4, 4, true, (-36));
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
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)8;
      byte byte0 = (byte) (-19);
      byteArray0[1] = (byte) (-19);
      byte byte1 = (byte) (-66);
      byteArray0[2] = (byte) (-66);
      boolean boolean0 = true;
      int int0 = 576;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte)8, (byte)8, true, 576);
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
      byteArray0[0] = (byte)8;
      byteArray0[1] = (byte)8;
      byteArray0[2] = (byte) (-66);
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte)8, (byte)8, false, 570);
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
      byte[] byteArray0 = new byte[3];
      byte byte0 = (byte)8;
      byteArray0[0] = (byte)8;
      byteArray0[1] = (byte)8;
      byte byte1 = (byte) (-66);
      byteArray0[2] = (byte) (-66);
      boolean boolean0 = true;
      int int0 = 576;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte)8, (byte)8, true, 576);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (-4406), (-4406), false);
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 1, 1, false);
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
      byte[] byteArray0 = new byte[4];
      boolean boolean0 = false;
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (-3), (-3), false);
      int int0 = (-4893);
      byte[] byteArray2 = T4AndT6Compression.compressT6(byteArray1, 60, (-4893));
      boolean boolean1 = false;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray2, 439, 2660, false);
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
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte) (-103);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 2000, 1291, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2000
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)8;
      byteArray0[1] = (byte) (-19);
      byteArray0[1] = (byte) (-81);
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte)8, (byte)8, false, 576);
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
      byte[] byteArray0 = new byte[10];
      boolean boolean0 = true;
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (-3), (-3), true);
      int int0 = 256;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray1, 36, 256, true);
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
      byte[] byteArray0 = new byte[3];
      boolean boolean0 = false;
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 1, 1, false);
      int int0 = 256;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray1, 36, 256, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[2] = (byte) (-125);
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, 2, 125, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte) (-58);
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 2000, 2000, true);
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
      byte[] byteArray0 = new byte[3];
      byteArray0[2] = (byte)111;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 1925, 1925, true);
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
      byte[] byteArray0 = new byte[20];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 4, 15, false);
      boolean boolean0 = true;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 0, 15, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      byte[] byteArray0 = new byte[20];
      int int0 = (-2645);
      int int1 = 15;
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (-2645), 15, false);
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 0, 15, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      int int0 = 5;
      int int1 = 64;
      try { 
        T4AndT6Compression.compressModifiedHuffman(byteArray0, 64, 5);
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
      byte[] byteArray0 = new byte[20];
      int int0 = 2098;
      try { 
        T4AndT6Compression.compressT4_1D(byteArray0, 64, 2098, true);
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
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte) (-87);
      int int0 = 1291;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 1998, 1291, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[2] = (byte)89;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)89, (byte)89, true);
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
      byte[] byteArray0 = new byte[17];
      int int0 = 128;
      try { 
        T4AndT6Compression.compressT4_1D(byteArray0, 128, 128, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte) (-125);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 2, 2, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte)111;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 1946, 1946, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)5;
      byteArray0[2] = (byte) (-28);
      byteArray0[3] = (byte)69;
      byteArray0[4] = (byte) (-117);
      byteArray0[5] = (byte)4;
      byteArray0[6] = (byte) (-84);
      byteArray0[7] = (byte)37;
      byteArray0[8] = (byte)0;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (byte)37, (byte)37, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }
}