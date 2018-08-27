/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 00:53:46 GMT 2018
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
      byte[] byteArray0 = new byte[1];
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
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)26;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (byte)26, (byte)26, false);
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
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = T4AndT6Compression.decompressT6(byteArray0, (byte)80, (byte)0);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      try { 
        T4AndT6Compression.compressModifiedHuffman(byteArray0, 45, 45);
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
      byteArray0[0] = (byte)15;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)15, (byte)15, false);
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
      byte[] byteArray0 = new byte[1];
      try { 
        T4AndT6Compression.compressT4_1D(byteArray0, (byte)26, (byte)26, false);
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
      byte[] byteArray0 = new byte[7];
      try { 
        T4AndT6Compression.compressT4_1D(byteArray0, 54, 54, false);
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
      byte[] byteArray0 = new byte[7];
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 51, 51, true, 51);
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
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte)0, (byte)1);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)40;
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)40, (byte)40);
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
      byteArray0[0] = (byte)26;
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte)26, (byte)26);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)17;
      try { 
        T4AndT6Compression.compressModifiedHuffman(byteArray0, (byte)17, (byte)17);
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
      byte[] byteArray0 = new byte[8];
      try { 
        T4AndT6Compression.compressT4_1D(byteArray0, 46, 46, true);
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
      byte[] byteArray0 = new byte[5];
      try { 
        T4AndT6Compression.compressT4_1D(byteArray0, 14, 14, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)22;
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
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[36];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 5, 5, false, (byte) (-29));
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)95;
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte)95, (byte)95);
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
      byte[] byteArray0 = new byte[34];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (byte)10, (byte)10, true);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotNull(byteArray1);
      
      byte[] byteArray2 = T4AndT6Compression.compressT6(byteArray1, (byte)10, (byte)10);
      assertNotSame(byteArray0, byteArray2);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertNotSame(byteArray1, byteArray2);
      assertNotSame(byteArray2, byteArray0);
      assertNotSame(byteArray2, byteArray1);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertFalse(byteArray2.equals((Object)byteArray0));
      assertFalse(byteArray2.equals((Object)byteArray1));
      assertNotNull(byteArray2);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[16];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, (byte)7, (byte)7);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertArrayEquals(new byte[] {(byte) (-16), (byte) (-16), (byte) (-16), (byte) (-16), (byte) (-16), (byte) (-16), (byte) (-16)}, byteArray1);
      assertNotNull(byteArray1);
      
      try { 
        T4AndT6Compression.compressT6(byteArray1, 26, 26);
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
      byte[] byteArray0 = new byte[16];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, (byte)7, (byte)7);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertArrayEquals(new byte[] {(byte) (-16), (byte) (-16), (byte) (-16), (byte) (-16), (byte) (-16), (byte) (-16), (byte) (-16)}, byteArray1);
      assertNotNull(byteArray1);
      
      byte[] byteArray2 = T4AndT6Compression.compressT6(byteArray1, (byte)7, (byte)7);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray0, byteArray2);
      assertNotSame(byteArray1, byteArray2);
      assertNotSame(byteArray1, byteArray0);
      assertNotSame(byteArray2, byteArray1);
      assertNotSame(byteArray2, byteArray0);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertFalse(byteArray2.equals((Object)byteArray1));
      assertFalse(byteArray2.equals((Object)byteArray0));
      assertArrayEquals(new byte[] {(byte) (-16), (byte) (-16), (byte) (-16), (byte) (-16), (byte) (-16), (byte) (-16), (byte) (-16)}, byteArray1);
      assertArrayEquals(new byte[] {(byte)38, (byte) (-81), (byte) (-1), (byte) (-1), (byte) (-128), (byte)8, (byte)0, (byte) (-128)}, byteArray2);
      assertNotNull(byteArray2);
      
      byte[] byteArray3 = T4AndT6Compression.compressT4_2D(byteArray2, (byte)7, (byte)7, true, (byte)7);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray0, byteArray3);
      assertNotSame(byteArray0, byteArray2);
      assertNotSame(byteArray1, byteArray2);
      assertNotSame(byteArray1, byteArray0);
      assertNotSame(byteArray1, byteArray3);
      assertNotSame(byteArray2, byteArray3);
      assertNotSame(byteArray2, byteArray1);
      assertNotSame(byteArray2, byteArray0);
      assertNotSame(byteArray3, byteArray2);
      assertNotSame(byteArray3, byteArray1);
      assertNotSame(byteArray3, byteArray0);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertFalse(byteArray0.equals((Object)byteArray2));
      assertFalse(byteArray1.equals((Object)byteArray2));
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertFalse(byteArray2.equals((Object)byteArray1));
      assertFalse(byteArray2.equals((Object)byteArray0));
      assertFalse(byteArray3.equals((Object)byteArray2));
      assertFalse(byteArray3.equals((Object)byteArray1));
      assertFalse(byteArray3.equals((Object)byteArray0));
      assertArrayEquals(new byte[] {(byte) (-16), (byte) (-16), (byte) (-16), (byte) (-16), (byte) (-16), (byte) (-16), (byte) (-16)}, byteArray1);
      assertArrayEquals(new byte[] {(byte)38, (byte) (-81), (byte) (-1), (byte) (-1), (byte) (-128), (byte)8, (byte)0, (byte) (-128)}, byteArray2);
      assertNotNull(byteArray3);
      
      byte[] byteArray4 = T4AndT6Compression.compressModifiedHuffman(byteArray2, (-891), 7);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray0, byteArray4);
      assertNotSame(byteArray0, byteArray3);
      assertNotSame(byteArray0, byteArray2);
      assertNotSame(byteArray1, byteArray2);
      assertNotSame(byteArray1, byteArray0);
      assertNotSame(byteArray1, byteArray3);
      assertNotSame(byteArray1, byteArray4);
      assertNotSame(byteArray2, byteArray4);
      assertNotSame(byteArray2, byteArray3);
      assertNotSame(byteArray2, byteArray1);
      assertNotSame(byteArray2, byteArray0);
      assertNotSame(byteArray4, byteArray0);
      assertNotSame(byteArray4, byteArray2);
      assertNotSame(byteArray4, byteArray1);
      assertNotSame(byteArray4, byteArray3);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertFalse(byteArray0.equals((Object)byteArray3));
      assertFalse(byteArray0.equals((Object)byteArray2));
      assertFalse(byteArray1.equals((Object)byteArray2));
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertFalse(byteArray1.equals((Object)byteArray3));
      assertFalse(byteArray2.equals((Object)byteArray3));
      assertFalse(byteArray2.equals((Object)byteArray1));
      assertFalse(byteArray2.equals((Object)byteArray0));
      assertFalse(byteArray4.equals((Object)byteArray0));
      assertFalse(byteArray4.equals((Object)byteArray2));
      assertFalse(byteArray4.equals((Object)byteArray1));
      assertFalse(byteArray4.equals((Object)byteArray3));
      assertArrayEquals(new byte[] {(byte) (-16), (byte) (-16), (byte) (-16), (byte) (-16), (byte) (-16), (byte) (-16), (byte) (-16)}, byteArray1);
      assertArrayEquals(new byte[] {(byte)38, (byte) (-81), (byte) (-1), (byte) (-1), (byte) (-128), (byte)8, (byte)0, (byte) (-128)}, byteArray2);
      assertArrayEquals(new byte[] {(byte)53, (byte)53, (byte)53, (byte)53, (byte)53, (byte)53, (byte)53}, byteArray4);
      assertNotNull(byteArray4);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, (byte)0, (byte)0);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)16, (byte)1}, byteArray1);
      assertNotNull(byteArray1);
      
      byte[] byteArray2 = T4AndT6Compression.compressT4_1D(byteArray0, 5, 5, true);
      assertNotSame(byteArray0, byteArray2);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray2, byteArray1);
      assertNotSame(byteArray2, byteArray0);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertFalse(byteArray2.equals((Object)byteArray1));
      assertFalse(byteArray2.equals((Object)byteArray0));
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertNotNull(byteArray2);
      
      try { 
        T4AndT6Compression.compressT4_2D(byteArray1, 5, 5, false, 63);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (-5500), 362, true);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertNotNull(byteArray1);
      
      byte[] byteArray2 = T4AndT6Compression.compressT4_2D(byteArray1, 6, 6, true, 1510);
      assertNotSame(byteArray0, byteArray2);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray2);
      assertNotSame(byteArray1, byteArray0);
      assertNotSame(byteArray2, byteArray1);
      assertNotSame(byteArray2, byteArray0);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertFalse(byteArray2.equals((Object)byteArray1));
      assertFalse(byteArray2.equals((Object)byteArray0));
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertNotNull(byteArray2);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[16];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (byte)7, (byte)7, true);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotNull(byteArray1);
      
      byte[] byteArray2 = T4AndT6Compression.compressT4_2D(byteArray1, (byte)7, (byte)7, true, (byte)7);
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
      assertNotNull(byteArray2);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[2] = (byte)122;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)122, (byte)122, true);
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
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)3;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (byte)3, (byte)122, true);
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
      byteArray0[1] = (byte)1;
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)1, (byte)1);
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
      byte[] byteArray0 = new byte[23];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, (byte)7, (byte)7);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertArrayEquals(new byte[] {(byte) (-16), (byte) (-16), (byte) (-16), (byte) (-16), (byte) (-16), (byte) (-16), (byte) (-16)}, byteArray1);
      assertNotNull(byteArray1);
      
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray1, (byte)7, (byte)7);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[36];
      try { 
        T4AndT6Compression.compressModifiedHuffman(byteArray0, 255, 255);
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
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, (byte)0, (byte)0);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)16, (byte)1}, byteArray1);
      assertNotNull(byteArray1);
      
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray1, 224, 224, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)1;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (byte)1, (byte)1, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (byte)1, (byte)1, false);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)17, (byte) (-64), (byte)4}, byteArray1);
      assertNotNull(byteArray1);
      
      byte[] byteArray2 = T4AndT6Compression.decompressT4_1D(byteArray1, (byte)1, (byte)1, false);
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
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)17, (byte) (-64), (byte)4}, byteArray1);
      assertArrayEquals(new byte[] {(byte)0}, byteArray2);
      assertNotNull(byteArray2);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[12];
      byteArray0[0] = (byte)17;
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 8, 8);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertArrayEquals(new byte[] {(byte)48, (byte) (-108), (byte)95, (byte) (-32), (byte)2, (byte)0, (byte)32}, byteArray1);
      assertNotNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)1;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (-1671), (byte)1, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)26;
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)26, (byte)26);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)3;
      byteArray0[1] = (byte)8;
      byteArray0[2] = (byte)64;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte)8, (byte)8, true, (byte)3);
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
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)7;
      byteArray0[2] = (byte) (-68);
      byteArray0[4] = (byte) (-16);
      byteArray0[5] = (byte)8;
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 3, (byte)7, false, (-455));
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertArrayEquals(new byte[] {(byte)0, (byte)7, (byte) (-68), (byte)0, (byte) (-16), (byte)8, (byte)0, (byte)0}, byteArray0);
      assertNotNull(byteArray1);
      
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray1, (byte) (-16), (byte)8);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byteArray0[1] = (byte)5;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)5, (byte)5, true);
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
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)1;
      byte[] byteArray1 = T4AndT6Compression.decompressT4_2D(byteArray0, (byte)0, (byte)1, true);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertArrayEquals(new byte[] {(byte)0, (byte)1, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {}, byteArray1);
      assertNotNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte)122;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)0, (byte)122, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)118;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)118, (byte)118);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 118
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte byte0 = (byte) (-105);
      byteArray0[2] = (byte) (-105);
      boolean boolean0 = true;
      int int0 = 4;
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
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)99;
      try { 
        T4AndT6Compression.compressT6(byteArray0, 3, (byte)99);
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
      byte[] byteArray0 = new byte[18];
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte) (-1);
      int int0 = 1154;
      try { 
        T4AndT6Compression.compressT6(byteArray0, 7, 1154);
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
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)4;
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
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)11;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (byte)11, (byte)11, true);
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
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)6;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)6, (byte)6);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      byte[] byteArray0 = new byte[16];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (byte)7, (byte)7, false);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotNull(byteArray1);
      
      byte[] byteArray2 = T4AndT6Compression.compressT4_2D(byteArray1, (byte)7, (byte)7, false, (byte)7);
      assertNotSame(byteArray0, byteArray2);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertNotSame(byteArray1, byteArray2);
      assertNotSame(byteArray2, byteArray0);
      assertNotSame(byteArray2, byteArray1);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertFalse(byteArray2.equals((Object)byteArray0));
      assertFalse(byteArray2.equals((Object)byteArray1));
      assertNotNull(byteArray2);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      byte[] byteArray0 = new byte[34];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (byte)10, (byte)10, true);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotNull(byteArray1);
      
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, (byte)10, (byte)10, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 10
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)1;
      byteArray0[3] = (byte)1;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)1, (byte)1, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid/unknown T.4 control code 000000000000001
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)10;
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)10, (byte)10);
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
      byte[] byteArray0 = new byte[36];
      byteArray0[1] = (byte) (-50);
      byteArray0[2] = (byte) (-50);
      try { 
        T4AndT6Compression.compressT6(byteArray0, 7, 5350);
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
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)11;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)11, (byte)11, true);
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
      byte[] byteArray0 = new byte[36];
      try { 
        T4AndT6Compression.compressModifiedHuffman(byteArray0, 265, 265);
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
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)16;
      byteArray0[2] = (byte)122;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)16, (byte)122, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 16
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 1, 1, false);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)17, (byte) (-64), (byte)4}, byteArray1);
      assertNotNull(byteArray1);
      
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 1587, 1, false);
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
      byte[] byteArray0 = new byte[5];
      byteArray0[2] = (byte)38;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)38, 909, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 38
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)80;
      byteArray0[1] = (byte)80;
      byteArray0[2] = (byte)80;
      byteArray0[3] = (byte)80;
      byteArray0[4] = (byte)80;
      int int0 = 2;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, 2, (byte)80);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}