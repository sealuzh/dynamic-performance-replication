/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 14:08:26 GMT 2019
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
      byteArray0[5] = (byte)67;
      byteArray0[6] = (byte) (-11);
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte)8, 129, false, 63);
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
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)30;
      byteArray0[2] = (byte) (-122);
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, 1696, (byte)30, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_1D(byteArray0, (byte)0, (byte)0, false);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, 24, (byte) (-104));
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray1, (byte)21, 3930, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte[] byteArray1 = T4AndT6Compression.decompressModifiedHuffman(byteArray0, 1936, (-95));
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_2D(byteArray0, (byte)0, (byte) (-12), false);
      byte[] byteArray2 = T4AndT6Compression.decompressModifiedHuffman(byteArray1, (byte) (-12), (byte)0);
      assertNotSame(byteArray0, byteArray2);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte) (-12), (byte)0);
      byte[] byteArray2 = T4AndT6Compression.compressT6(byteArray1, (byte)0, (byte)0);
      assertNotSame(byteArray2, byteArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (-1575), 0, false, (-272));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 9, (byte)0, false);
      assertArrayEquals(new byte[] {(byte)0, (byte)16}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 2199, (byte) (-26), false);
      assertArrayEquals(new byte[] {(byte)0, (byte)16}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, 0, (byte) (-23));
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (-3), (-1223), true);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT6(byteArray0, (byte) (-12), 2456);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (-315), 47, false, 42);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)80;
      byteArray0[1] = (byte)86;
      byteArray0[2] = (byte) (-102);
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, 3930, (byte)64);
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
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)8;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, 523, 1963, true);
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
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 0, 41, true, (byte)86);
      try { 
        T4AndT6Compression.decompressT6(byteArray1, 3705, (byte)86);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid/unknown T.6 control code 0000000000000001
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)13;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, 63, (byte)99);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)5;
      byteArray0[1] = (byte)7;
      byteArray0[2] = (byte)75;
      byteArray0[3] = (byte)52;
      byteArray0[4] = (byte) (-38);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)85, 29);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-16);
      byteArray0[1] = (byte) (-112);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, 1, 64);
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
      byteArray0[0] = (byte)30;
      try { 
        T4AndT6Compression.decompressT6(byteArray0, 1856, 3067);
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
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-26);
      // Undeclared exception!
      T4AndT6Compression.decompressT6(byteArray0, 3705, (byte)86);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.decompressT6(byteArray0, (byte)0, (byte)61);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = T4AndT6Compression.decompressT6(byteArray0, 3582, (byte) (-114));
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[3] = (byte)61;
      try { 
        T4AndT6Compression.compressT6(byteArray0, (byte)5, 513);
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
      byteArray0[0] = (byte) (-34);
      try { 
        T4AndT6Compression.compressT6(byteArray0, (byte)5, 513);
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
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, (byte)4, (byte) (-91));
      try { 
        T4AndT6Compression.compressT6(byteArray1, (byte)4, 650);
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
      byte[] byteArray0 = new byte[9];
      byteArray0[5] = (byte) (-12);
      try { 
        T4AndT6Compression.compressT6(byteArray0, (byte)4, 47);
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
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)3;
      byteArray0[2] = (byte) (-43);
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 17, 4333, true);
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
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)31;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 1, 2, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte)4;
      byteArray0[2] = (byte)27;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)11, (byte)51, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[2] = (byte)41;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)41, 3844, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte)26;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)0, (byte)15, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-23);
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 1539, (byte)77, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (-2375), (byte)95, false);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 3, 768, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 3, 768, true);
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
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-2);
      byteArray0[3] = (byte)24;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte)19, (byte)19, true, 1792);
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
      byte[] byteArray0 = new byte[8];
      byteArray0[6] = (byte) (-11);
      byteArray0[7] = (byte)10;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte)8, 129, false, 63);
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
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, (byte)0, (byte)88, false, 74);
      assertEquals(147, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 2014, (-1231), true, (-1608));
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray1, (-1231), 2014, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[2] = (byte)91;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, 0, (byte)91, true);
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
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_1D(byteArray0, (-1407), (byte) (-122), true);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (-315), (byte)8, true);
      assertEquals(26, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-47);
      byteArray0[1] = (byte)3;
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, 14, 10);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 1
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte)0, (byte)0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      try { 
        T4AndT6Compression.compressModifiedHuffman(byteArray0, 36, 48);
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
      byte[] byteArray0 = new byte[5];
      try { 
        T4AndT6Compression.compressT4_1D(byteArray0, 13, (byte)64, true);
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
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, (-2119), 2);
      assertArrayEquals(new byte[] {(byte)53, (byte)53}, byteArray1);
  }
}
