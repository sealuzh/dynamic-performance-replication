/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 20:00:38 GMT 2018
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
      byte[] byteArray0 = new byte[10];
      try { 
        T4AndT6Compression.compressT4_1D(byteArray0, 38, 38, false);
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
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_1D(byteArray0, (byte)0, (byte)0, true);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 6, 6, false, 6);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[16];
      byteArray0[1] = (byte)23;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)23, (byte)23, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)34;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (byte)34, (byte)34, true);
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
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 1856, (byte)0, true, 1856);
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray1, 1856, 1856, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)7;
      try { 
        T4AndT6Compression.compressModifiedHuffman(byteArray0, (byte)7, (byte)7);
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
      byte[] byteArray0 = new byte[3];
      try { 
        T4AndT6Compression.compressModifiedHuffman(byteArray0, (byte)7, (byte)7);
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
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)34;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)34, (byte)34, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)34;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (byte)34, (byte)34, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)7;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)7, (byte)7);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)70;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)70, (byte)70);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 70
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)27;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)27, (byte)27);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 27
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)64;
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)64, (byte)64);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)8;
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)8, (byte)8);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[28];
      try { 
        T4AndT6Compression.compressT4_1D(byteArray0, 38, 38, true);
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
      byte[] byteArray0 = new byte[10];
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 64, 64, false, 64);
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
      byte[] byteArray0 = new byte[5];
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 8, 8, false, 8);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, (byte)8, (byte)8, true, (byte)8);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, 8, 8);
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray1, 2201, 8);
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
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)4;
      byteArray0[1] = (byte)64;
      byteArray0[2] = (byte)4;
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)4, (byte)4);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      try { 
        T4AndT6Compression.compressT4_1D(byteArray0, 10, 10, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, 8, 8);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {(byte) (-104), (byte) (-104), (byte) (-104), (byte) (-104), (byte) (-104), (byte) (-104), (byte) (-104), (byte) (-104)}, byteArray1);
      
      byte[] byteArray2 = T4AndT6Compression.compressT4_1D(byteArray1, 8, 8, true);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertFalse(byteArray2.equals((Object)byteArray0));
      assertFalse(byteArray2.equals((Object)byteArray1));
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray0, byteArray2);
      assertNotSame(byteArray1, byteArray2);
      assertNotSame(byteArray1, byteArray0);
      assertNotSame(byteArray2, byteArray0);
      assertNotSame(byteArray2, byteArray1);
      assertNotNull(byteArray2);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {(byte) (-104), (byte) (-104), (byte) (-104), (byte) (-104), (byte) (-104), (byte) (-104), (byte) (-104), (byte) (-104)}, byteArray1);
      
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray2, 8, 8, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = T4AndT6Compression.decompressModifiedHuffman(byteArray0, 0, 2521);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)8;
      byteArray0[1] = (byte)39;
      byteArray0[2] = (byte)72;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, 1, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[11];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, (byte)0, (byte)0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)16, (byte)1}, byteArray1);
      
      try { 
        T4AndT6Compression.decompressT6(byteArray1, 4, 4);
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
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)7;
      try { 
        T4AndT6Compression.compressT6(byteArray0, (byte)7, (byte)7);
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
      byte[] byteArray0 = new byte[10];
      try { 
        T4AndT6Compression.compressModifiedHuffman(byteArray0, 64, 64);
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
      byte[] byteArray0 = new byte[63];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 5, 5);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte) (-8), (byte)0, (byte) (-128), (byte)8}, byteArray1);
      
      try { 
        T4AndT6Compression.compressT4_2D(byteArray1, 5, 896, true, 896);
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
      byte[] byteArray0 = new byte[3];
      byteArray0[2] = (byte)34;
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 3, 3, true, (byte)34);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)34}, byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)1, (byte) (-64), (byte)0, (byte)1, (byte)64, (byte)1, (byte)40, (byte)0, (byte)1}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)39;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 8, (byte)39, false, (byte)39);
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
      byte[] byteArray0 = new byte[11];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, (byte)0, (byte)0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)16, (byte)1}, byteArray1);
      
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray1, (-2), 152, true);
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
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)7;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte)7, (byte)7, true, 10);
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
      byte[] byteArray0 = new byte[13];
      byteArray0[1] = (byte)23;
      try { 
        T4AndT6Compression.compressT6(byteArray0, (byte)23, (byte)23);
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
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)15;
      try { 
        T4AndT6Compression.compressT6(byteArray0, (byte)15, (byte)15);
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
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)6;
      try { 
        T4AndT6Compression.compressT6(byteArray0, (byte)6, (byte)6);
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
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)9;
      byte[] byteArray1 = T4AndT6Compression.decompressT6(byteArray0, (byte)0, (byte)9);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)9, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {}, byteArray1);
      
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 1699, 238, true);
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
      byte[] byteArray0 = new byte[19];
      byteArray0[1] = (byte)15;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)15, (byte)15, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (-2370), 29, false);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray0);
      
      try { 
        T4AndT6Compression.compressT4_2D(byteArray1, 29, 29, false, (-1856));
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
      byteArray0[0] = (byte)34;
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 3, 3, true, (byte)34);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte)34, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)1, (byte) (-70), (byte)0, (byte)1, (byte)48, (byte)1, (byte)64, (byte)1}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[16];
      byteArray0[1] = (byte)23;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (byte)23, (byte)23, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte byte0 = (byte)15;
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)15;
      byteArray0[1] = (byte)15;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)15, 11);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 15
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[13];
      byteArray0[1] = (byte)6;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)6, (byte)6, true);
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
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)39;
      try { 
        T4AndT6Compression.compressT6(byteArray0, 8, (byte)39);
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
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte)25;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)25, (byte)25, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, (byte)4, (byte)4);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {(byte) (-16), (byte)1, (byte)0, (byte)16}, byteArray1);
      
      try { 
        T4AndT6Compression.compressT6(byteArray1, (byte)4, 9);
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
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (-2370), 37, true);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray0);
      
      byte[] byteArray2 = T4AndT6Compression.compressT4_1D(byteArray1, 26, 18, true);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertFalse(byteArray2.equals((Object)byteArray0));
      assertFalse(byteArray2.equals((Object)byteArray1));
      assertNotSame(byteArray0, byteArray2);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray2);
      assertNotSame(byteArray1, byteArray0);
      assertNotSame(byteArray2, byteArray0);
      assertNotSame(byteArray2, byteArray1);
      assertNotNull(byteArray2);
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray0);
      
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray2, 26, 2243, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      byte[] byteArray0 = new byte[16];
      int int0 = 2;
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (byte)23, 2, true);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)1, (byte)8, (byte)0, (byte)1, (byte)8, (byte)0, (byte)1}, byteArray1);
      
      byte[] byteArray2 = T4AndT6Compression.decompressT4_2D(byteArray1, (byte)23, 2, true);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertFalse(byteArray2.equals((Object)byteArray1));
      assertFalse(byteArray2.equals((Object)byteArray0));
      assertNotSame(byteArray0, byteArray2);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertNotSame(byteArray1, byteArray2);
      assertNotSame(byteArray2, byteArray1);
      assertNotSame(byteArray2, byteArray0);
      assertNotNull(byteArray2);
      assertArrayEquals(new byte[] {(byte)0, (byte)1, (byte)8, (byte)0, (byte)1, (byte)8, (byte)0, (byte)1}, byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray2);
      
      byte[] byteArray3 = new byte[1];
      assertFalse(byteArray3.equals((Object)byteArray1));
      assertFalse(byteArray3.equals((Object)byteArray2));
      assertFalse(byteArray3.equals((Object)byteArray0));
      
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray3, (byte)23, 368);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, 8, 8);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {(byte) (-104), (byte) (-104), (byte) (-104), (byte) (-104), (byte) (-104), (byte) (-104), (byte) (-104), (byte) (-104)}, byteArray1);
      
      byte[] byteArray2 = T4AndT6Compression.compressT4_1D(byteArray1, 8, 8, true);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertFalse(byteArray2.equals((Object)byteArray0));
      assertFalse(byteArray2.equals((Object)byteArray1));
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray0, byteArray2);
      assertNotSame(byteArray1, byteArray2);
      assertNotSame(byteArray1, byteArray0);
      assertNotSame(byteArray2, byteArray0);
      assertNotSame(byteArray2, byteArray1);
      assertNotNull(byteArray2);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {(byte) (-104), (byte) (-104), (byte) (-104), (byte) (-104), (byte) (-104), (byte) (-104), (byte) (-104), (byte) (-104)}, byteArray1);
      
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray2, 8, 875, true);
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
      byte[] byteArray0 = new byte[13];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, (byte)0, (byte)0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)16, (byte)1}, byteArray1);
      
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray1, 0, 91, false);
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
      byte[] byteArray0 = new byte[25];
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
  public void test51()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, 2, 2);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {(byte)112, (byte)112}, byteArray1);
      
      byte[] byteArray2 = T4AndT6Compression.compressT4_1D(byteArray1, 2, 2, true);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertFalse(byteArray2.equals((Object)byteArray1));
      assertFalse(byteArray2.equals((Object)byteArray0));
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray0, byteArray2);
      assertNotSame(byteArray1, byteArray0);
      assertNotSame(byteArray1, byteArray2);
      assertNotSame(byteArray2, byteArray1);
      assertNotSame(byteArray2, byteArray0);
      assertNotNull(byteArray2);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {(byte)112, (byte)112}, byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)1, (byte)29, (byte)0, (byte)1, (byte)29, (byte)0, (byte)1}, byteArray2);
      
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray2, 2, 2, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      byte[] byteArray0 = new byte[17];
      byteArray0[1] = (byte)3;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)3, (byte)3, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }
}