/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 10:21:50 GMT 2018
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
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)8;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (byte)8, (byte)8, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)22;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)22, (byte)22, false);
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
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)8;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (byte)8, (byte)8, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      try { 
        T4AndT6Compression.compressModifiedHuffman(byteArray0, 59, 59);
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
      byte[] byteArray0 = new byte[3];
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 20, 20, true, 20);
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
      byte[] byteArray0 = new byte[43];
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte)103, (byte)103, false, (byte)103);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[16];
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 116, 116, false, 116);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)71;
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte)71, (byte)71);
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
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)8;
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte)8, (byte)8);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = T4AndT6Compression.decompressT6(byteArray0, (byte)0, (byte)92);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)21;
      try { 
        T4AndT6Compression.compressModifiedHuffman(byteArray0, (byte)21, (byte)21);
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
      byte[] byteArray0 = new byte[9];
      try { 
        T4AndT6Compression.compressT4_1D(byteArray0, 13, 13, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte)0, (byte)3);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {}, byteArray1);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte) (-1), 13);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      try { 
        T4AndT6Compression.compressT4_1D(byteArray0, 13, 13, true);
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
      byte[] byteArray0 = new byte[15];
      byteArray0[1] = (byte)8;
      byteArray0[2] = (byte)109;
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, (byte)8, (byte)8, false, (byte)8);
      assertNotNull(byteArray1);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[25];
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 116, 116, true, 116);
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
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 1, 1, true);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)1, (byte)28, (byte)0, (byte)1}, byteArray1);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      byte[] byteArray2 = T4AndT6Compression.decompressT4_1D(byteArray1, 1, 1, true);
      assertNotNull(byteArray2);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)1, (byte)28, (byte)0, (byte)1}, byteArray1);
      assertArrayEquals(new byte[] {(byte)0}, byteArray2);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray0, byteArray2);
      assertNotSame(byteArray1, byteArray0);
      assertNotSame(byteArray1, byteArray2);
      assertNotSame(byteArray2, byteArray1);
      assertNotSame(byteArray2, byteArray0);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertFalse(byteArray2.equals((Object)byteArray1));
      assertFalse(byteArray2.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)21;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)21, (byte)21, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      try { 
        T4AndT6Compression.compressT4_1D(byteArray0, 4, 4, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)21;
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)21, (byte)21);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid/unknown T.6 control code 000000000001
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[103];
      int int0 = 9;
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, 9, 9);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte) (-96), (byte) (-96), (byte) (-96), (byte) (-96), (byte) (-96), (byte) (-96), (byte) (-96), (byte) (-96), (byte) (-96)}, byteArray1);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray1, 9, 9);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, 1, 1);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {(byte)28}, byteArray1);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      try { 
        T4AndT6Compression.decompressT6(byteArray1, 45, 45);
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
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)8;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)8, (byte)8, true);
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
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)8;
      byteArray0[2] = (byte)92;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte)8, (byte)8, true, (byte)8);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)13;
      byteArray0[1] = (byte)13;
      byteArray0[2] = (byte)13;
      byteArray0[3] = (byte)13;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, 5, (byte)13);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte)22;
      try { 
        T4AndT6Compression.compressT6(byteArray0, (byte)22, (byte)22);
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
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte)14;
      try { 
        T4AndT6Compression.compressT6(byteArray0, (byte)14, (byte)14);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)21;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (byte)21, (byte)21, true);
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
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)69;
      try { 
        T4AndT6Compression.compressT6(byteArray0, 3, (byte)69);
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
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)21;
      try { 
        T4AndT6Compression.compressT6(byteArray0, 8, 586);
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
      byteArray0[0] = (byte)92;
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte)92, (byte)92);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)32;
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)32, (byte)32);
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
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)91;
      byteArray0[1] = (byte)91;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)91, (byte)91);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 91
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, 3, 3);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {(byte) (-128), (byte) (-128), (byte) (-128)}, byteArray1);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      byte[] byteArray2 = T4AndT6Compression.compressT6(byteArray1, 3, 3);
      assertNotNull(byteArray2);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {(byte) (-128), (byte) (-128), (byte) (-128)}, byteArray1);
      assertArrayEquals(new byte[] {(byte)4, (byte)23, (byte) (-16), (byte)1, (byte)0, (byte)16}, byteArray2);
      assertNotSame(byteArray0, byteArray2);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray2);
      assertNotSame(byteArray1, byteArray0);
      assertNotSame(byteArray2, byteArray0);
      assertNotSame(byteArray2, byteArray1);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertFalse(byteArray2.equals((Object)byteArray0));
      assertFalse(byteArray2.equals((Object)byteArray1));
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)9;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)9, (byte)9, true);
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
      byte[] byteArray0 = new byte[10];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 1, 1, true);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)1, (byte)28, (byte)0, (byte)1}, byteArray1);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 241, 1, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[26];
      byteArray0[2] = (byte)102;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (-4590), (byte)102, true);
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
      byte[] byteArray0 = new byte[19];
      try { 
        T4AndT6Compression.compressModifiedHuffman(byteArray0, (byte)95, (byte)95);
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
      byte[] byteArray0 = new byte[16];
      try { 
        T4AndT6Compression.compressModifiedHuffman(byteArray0, 128, 128);
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
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte)3;
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, (byte)3, (byte)3);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)3, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {(byte) (-32), (byte)2, (byte)0, (byte)32}, byteArray1);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      byte[] byteArray2 = T4AndT6Compression.compressT6(byteArray1, (byte)3, (byte)3);
      assertNotNull(byteArray2);
      assertArrayEquals(new byte[] {(byte)0, (byte)3, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {(byte) (-32), (byte)2, (byte)0, (byte)32}, byteArray1);
      assertArrayEquals(new byte[] {(byte)5, (byte)7, (byte)0, (byte)16, (byte)1}, byteArray2);
      assertNotSame(byteArray0, byteArray2);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray2);
      assertNotSame(byteArray1, byteArray0);
      assertNotSame(byteArray2, byteArray0);
      assertNotSame(byteArray2, byteArray1);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertFalse(byteArray2.equals((Object)byteArray0));
      assertFalse(byteArray2.equals((Object)byteArray1));
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, 6, 6);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {(byte) (-32), (byte) (-32), (byte) (-32), (byte) (-32), (byte) (-32), (byte) (-32)}, byteArray1);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray1, 6, 6);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[16];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, (byte)3, 6);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte) (-4), (byte)0, (byte)64, (byte)4}, byteArray1);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      byte[] byteArray2 = T4AndT6Compression.compressT6(byteArray1, 6, (byte)3);
      assertNotNull(byteArray2);
      assertArrayEquals(new byte[] {(byte) (-4), (byte)0, (byte)64, (byte)4}, byteArray1);
      assertArrayEquals(new byte[] {(byte)38, (byte) (-92), (byte)120, (byte)55, (byte)35, (byte) (-88), (byte)0, (byte) (-128), (byte)8}, byteArray2);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray0, byteArray2);
      assertNotSame(byteArray1, byteArray0);
      assertNotSame(byteArray1, byteArray2);
      assertNotSame(byteArray2, byteArray1);
      assertNotSame(byteArray2, byteArray0);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertFalse(byteArray2.equals((Object)byteArray1));
      assertFalse(byteArray2.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      byte[] byteArray0 = new byte[26];
      byte byte0 = (byte)14;
      byteArray0[1] = (byte)14;
      byteArray0[2] = (byte)107;
      boolean boolean0 = true;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte)14, (byte)14, true, (byte)14);
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
      byte[] byteArray0 = new byte[26];
      byteArray0[1] = (byte)8;
      byteArray0[2] = (byte)95;
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, (byte)8, (byte)8, false, (byte)8);
      assertNotNull(byteArray1);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      byte[] byteArray2 = T4AndT6Compression.decompressT4_2D(byteArray1, (byte)8, (byte)8, false);
      assertNotNull(byteArray2);
      assertArrayEquals(new byte[] {(byte)0, (byte)8, (byte)95, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray2);
      assertNotSame(byteArray0, byteArray2);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertNotSame(byteArray1, byteArray2);
      assertNotSame(byteArray2, byteArray1);
      assertNotSame(byteArray2, byteArray0);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertFalse(byteArray2.equals((Object)byteArray1));
      assertFalse(byteArray2.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)21;
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (byte)21, 3, true);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)21, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray1, (byte)21, (byte)21, true);
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
      byte[] byteArray0 = new byte[30];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 8, 8, true);
      assertNotNull(byteArray1);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      int int0 = 1124;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray1, 8, 1124, true);
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
      byte[] byteArray0 = new byte[26];
      byteArray0[1] = (byte)8;
      byteArray0[2] = (byte)57;
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, (byte)8, (byte)8, true, (byte)8);
      assertNotNull(byteArray1);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      byte[] byteArray2 = T4AndT6Compression.decompressT4_2D(byteArray1, (byte)8, (byte)8, true);
      assertNotNull(byteArray2);
      assertArrayEquals(new byte[] {(byte)0, (byte)8, (byte)57, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray2);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray0, byteArray2);
      assertNotSame(byteArray1, byteArray0);
      assertNotSame(byteArray1, byteArray2);
      assertNotSame(byteArray2, byteArray1);
      assertNotSame(byteArray2, byteArray0);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertFalse(byteArray2.equals((Object)byteArray1));
      assertFalse(byteArray2.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      byte[] byteArray0 = new byte[26];
      byteArray0[1] = (byte)8;
      byteArray0[2] = (byte)94;
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, (byte)8, (byte)8, true, (byte)8);
      assertNotNull(byteArray1);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      byte[] byteArray2 = T4AndT6Compression.decompressT4_2D(byteArray1, (byte)8, (byte)8, true);
      assertNotNull(byteArray2);
      assertArrayEquals(new byte[] {(byte)0, (byte)8, (byte)94, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray2);
      assertNotSame(byteArray0, byteArray2);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray2);
      assertNotSame(byteArray1, byteArray0);
      assertNotSame(byteArray2, byteArray0);
      assertNotSame(byteArray2, byteArray1);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertFalse(byteArray2.equals((Object)byteArray0));
      assertFalse(byteArray2.equals((Object)byteArray1));
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)8;
      byteArray0[3] = (byte)65;
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, (byte)0, (byte)8, true, (byte)8);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)8, (byte)0, (byte)65, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 4053, (byte)8, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid/unknown T.4 control code 000000000001
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }
}