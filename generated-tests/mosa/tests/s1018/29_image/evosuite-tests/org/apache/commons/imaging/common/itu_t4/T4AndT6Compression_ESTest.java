/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 09:03:01 GMT 2018
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
      byte[] byteArray0 = new byte[15];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_2D(byteArray0, (byte)0, (byte)0, false);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[13];
      try { 
        T4AndT6Compression.compressT4_1D(byteArray0, 22, 22, true);
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
      byte[] byteArray0 = new byte[13];
      try { 
        T4AndT6Compression.compressModifiedHuffman(byteArray0, (byte)50, (byte)50);
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
      byte[] byteArray0 = new byte[40];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 10, 10);
      try { 
        T4AndT6Compression.compressModifiedHuffman(byteArray1, 10, 10);
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
      byte[] byteArray0 = new byte[1];
      try { 
        T4AndT6Compression.compressT4_1D(byteArray0, 5, 5, false);
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
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)27;
      try { 
        T4AndT6Compression.compressT6(byteArray0, (byte)27, (byte)27);
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
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_1D(byteArray0, (-3), (-3), false);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {}, byteArray1);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[21];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, (byte)0, (byte)0);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {}, byteArray1);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 4, 4, true, 4);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)8;
      byteArray0[2] = (byte)54;
      try { 
        T4AndT6Compression.compressT6(byteArray0, (byte)8, 320);
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
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)88;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (byte)88, (byte)88, false);
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
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)88;
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte)88, (byte)88);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte)0, (byte)8);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {}, byteArray1);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, (-1), 8);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 10, 10, true, 10);
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
      byte[] byteArray0 = new byte[13];
      byte[] byteArray1 = T4AndT6Compression.decompressT6(byteArray0, (byte)0, (byte)26);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {}, byteArray1);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
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
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)103;
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte)103, (byte)103);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
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
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[15];
      byteArray0[2] = (byte)45;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)45, (byte)45, true);
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
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 374, (byte)0);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)16, (byte)1}, byteArray1);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray1, 374, 374, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)26;
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)26, (byte)26);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid/unknown T.6 control code 000000000001
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)4;
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)4, 1121);
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
      byte[] byteArray0 = new byte[17];
      byteArray0[0] = (byte)18;
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)18, (byte)18);
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
      byte[] byteArray0 = new byte[32];
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
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[18];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 5, 5);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte) (-8), (byte)0, (byte) (-128), (byte)8}, byteArray1);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      try { 
        T4AndT6Compression.compressT6(byteArray1, 5, 5);
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
      byte[] byteArray0 = new byte[17];
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
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 4, 4, true);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)1, (byte) (-80), (byte)1, (byte) (-80), (byte)1, (byte) (-80), (byte)1, (byte) (-80), (byte)1}, byteArray1);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      byte[] byteArray2 = T4AndT6Compression.compressT6(byteArray1, 4, 4);
      assertNotNull(byteArray2);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)1, (byte) (-80), (byte)1, (byte) (-80), (byte)1, (byte) (-80), (byte)1, (byte) (-80), (byte)1}, byteArray1);
      assertArrayEquals(new byte[] {(byte) (-55), (byte) (-86), (byte)10, (byte)33, (byte) (-128), (byte)8, (byte)0, (byte) (-128)}, byteArray2);
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
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[39];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 1, 1);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte) (-128), (byte)8, (byte)0, (byte) (-128)}, byteArray1);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      try { 
        T4AndT6Compression.compressT6(byteArray1, 1, 226);
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
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 1, 1, false, 296);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)24, (byte) (-32), (byte)2}, byteArray1);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[85];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 8, 8, false);
      assertNotNull(byteArray1);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      byte[] byteArray2 = T4AndT6Compression.compressT4_2D(byteArray1, 8, 8, false, 1091);
      assertNotNull(byteArray2);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray0, byteArray2);
      assertNotSame(byteArray1, byteArray0);
      assertNotSame(byteArray1, byteArray2);
      assertNotSame(byteArray2, byteArray0);
      assertNotSame(byteArray2, byteArray1);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertFalse(byteArray2.equals((Object)byteArray0));
      assertFalse(byteArray2.equals((Object)byteArray1));
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[11];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 5, 5);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte) (-8), (byte)0, (byte) (-128), (byte)8}, byteArray1);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      try { 
        T4AndT6Compression.compressT4_2D(byteArray1, 5, 5, true, 677);
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
      byte[] byteArray0 = new byte[16];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 1, 1);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte) (-128), (byte)8, (byte)0, (byte) (-128)}, byteArray1);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      try { 
        T4AndT6Compression.compressT4_2D(byteArray1, 1, 109, false, 109);
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
      byte[] byteArray0 = new byte[5];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 389, (byte)0);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)16, (byte)1}, byteArray1);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray1, (-1669), 389, true);
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
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte)69;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (byte)69, (byte)69, true);
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
      byte[] byteArray0 = new byte[15];
      byteArray0[2] = (byte)53;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)53, (byte)53, true);
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
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)118;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte) (-8);
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)0, 62, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[19];
      byteArray0[0] = (byte)12;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)12, (byte)12);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 12
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-35);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)27, 1746);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 27
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte byte0 = (byte)4;
      byteArray0[1] = (byte)4;
      byteArray0[2] = (byte)45;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (byte)45, 769, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 0, 0, false);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)16}, byteArray1);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray1, 0, 3, false);
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
      byte[] byteArray0 = new byte[39];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 10, 10);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte) (-1), (byte) (-64), (byte)4, (byte)0, (byte)64}, byteArray1);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      try { 
        T4AndT6Compression.compressT6(byteArray1, 10, 10);
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
      byte[] byteArray0 = new byte[20];
      byteArray0[2] = (byte)76;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)76, (byte)76, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 76
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)8;
      byteArray0[2] = (byte)45;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)45, (byte)8, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[15];
      byteArray0[2] = (byte)33;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)33, (byte)33, true);
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
      byte[] byteArray0 = new byte[5];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 1, 1, true);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)1, (byte)28, (byte)0, (byte)1}, byteArray1);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 1, 6456, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)11;
      int int0 = 1;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, 1, (byte)11);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      byte[] byteArray0 = new byte[39];
      try { 
        T4AndT6Compression.compressModifiedHuffman(byteArray0, 310, 310);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      byte[] byteArray0 = new byte[50];
      try { 
        T4AndT6Compression.compressModifiedHuffman(byteArray0, 372, 372);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      byte[] byteArray0 = new byte[21];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 8, 8);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte) (-1), (byte)0, (byte)16, (byte)1}, byteArray1);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      int int0 = 31;
      try { 
        T4AndT6Compression.compressT6(byteArray1, 11, 31);
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
      int int0 = 2;
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 2, 2);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {(byte) (-64), (byte)4, (byte)0, (byte)64}, byteArray1);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      int int1 = 4408;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray1, 2, 4408, true, 15);
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
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)120;
      byteArray0[1] = (byte)17;
      byteArray0[2] = (byte)62;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 7, (byte)17, true, (byte)62);
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
      byte byte0 = (byte)18;
      byte[] byteArray0 = new byte[6];
      byteArray0[4] = (byte)18;
      byteArray0[1] = (byte)18;
      byteArray0[2] = (byte)18;
      byteArray0[3] = (byte)18;
      byteArray0[3] = (byte)18;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)18, (byte)18, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-107);
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte) (-107);
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)0, 62, true);
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
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)8;
      byteArray0[2] = (byte)52;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)52, 375, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 52
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)8;
      byteArray0[2] = (byte)24;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)24, 4419, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 24
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)8;
      byteArray0[2] = (byte)21;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)21, 4419, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      byte[] byteArray0 = new byte[15];
      byteArray0[2] = (byte)70;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)70, (byte)70, true);
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
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte)8;
      byteArray0[1] = (byte)8;
      byteArray0[3] = (byte)18;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (byte)0, (byte)8, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)2;
      byteArray0[4] = (byte)45;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 3, (byte)45, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid/unknown T.4 control code 0000000000000000001
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }
}