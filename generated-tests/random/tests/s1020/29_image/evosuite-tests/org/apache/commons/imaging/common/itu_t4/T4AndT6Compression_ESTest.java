/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 13:05:27 GMT 2019
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
      byte[] byteArray0 = new byte[4];
      byteArray0[2] = (byte) (-40);
      byteArray0[3] = (byte) (-14);
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, 2169, 590, true);
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
      byte[] byteArray0 = new byte[2];
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)0, (byte)29, false);
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
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte)0, (byte)0);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte) (-40), 25);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 703, (-4988));
      assertEquals(3, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      try { 
        T4AndT6Compression.compressT6(byteArray0, 2373, 2131);
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
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (-1421), 62, true);
      byte[] byteArray2 = T4AndT6Compression.compressT4_2D(byteArray1, 19, 0, true, 21);
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray2, 72, 62, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_2D(byteArray0, (byte)15, (byte) (-64), false);
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT4_2D(byteArray1, (byte) (-64), (byte)15, false, (-2));
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
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (byte)0, (byte)0, true);
      assertArrayEquals(new byte[] {(byte)0, (byte)1}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, (byte)91, (-867));
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte) (-105), (byte)44);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte) (-11), 0, false);
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
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressModifiedHuffman((byte[]) null, 0, 1910);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      T4AndT6Compression.compressT4_2D(byteArray0, 0, 1810, true, 3700);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT4_2D((byte[]) null, 298, 298, false, 298);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressModifiedHuffman((byte[]) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)110;
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte)110, 2046);
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
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (-1421), 62, true);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 72, 62, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)4;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (byte)78, (byte)4, true);
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
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte)8;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (byte)0, (byte)60, true);
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
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)64;
      byteArray0[1] = (byte) (-40);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)106, 1014);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)13;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)13, (byte)13);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 2993, (byte) (-27), true);
      try { 
        T4AndT6Compression.decompressT6(byteArray1, (byte)111, 2993);
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
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)8;
      try { 
        T4AndT6Compression.decompressT6(byteArray0, 1, 46);
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
      byteArray0[0] = (byte)64;
      byteArray0[1] = (byte) (-127);
      byteArray0[2] = (byte)47;
      byteArray0[3] = (byte) (-18);
      byteArray0[4] = (byte)95;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)47, (byte)64);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)27;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)10, (byte)32);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = T4AndT6Compression.decompressT6(byteArray0, 1455, (-1720));
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-34);
      byteArray0[1] = (byte) (-61);
      try { 
        T4AndT6Compression.compressT6(byteArray0, 8, 987);
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
      byteArray0[2] = (byte)63;
      try { 
        T4AndT6Compression.compressT6(byteArray0, 4, (byte)91);
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
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)90;
      try { 
        T4AndT6Compression.compressT6(byteArray0, 4, (byte)91);
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
      byteArray0[3] = (byte) (-48);
      byteArray0[4] = (byte) (-1);
      try { 
        T4AndT6Compression.compressT6(byteArray0, 8, 987);
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
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, (byte)0, 0);
      assertEquals(3, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)18;
      byteArray0[2] = (byte) (-47);
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 185, 1575, false);
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
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)18;
      byteArray0[2] = (byte)18;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 185, 1575, false);
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
      byte[] byteArray0 = new byte[9];
      byteArray0[2] = (byte)43;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)65, (byte)112, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte)77;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 3, 53, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_2D(byteArray0, 703, (byte)0, true);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 1, 1, false, 1);
      assertArrayEquals(new byte[] {(byte)0, (byte)24, (byte) (-32), (byte)2}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[5] = (byte) (-11);
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte)19, (byte)16, true, (byte)19);
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
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)37;
      byteArray0[3] = (byte)58;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte)19, (byte)16, true, (byte)19);
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
      byte[] byteArray0 = new byte[4];
      byteArray0[2] = (byte)82;
      byteArray0[3] = (byte)127;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte)3, 151, false, 896);
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
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte) (-32);
      byteArray0[6] = (byte) (-2);
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 32, 57, true, 2637);
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
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, (byte)83, (-1511), true, 2169);
      assertArrayEquals(new byte[] {(byte)0, (byte)1}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, (byte)39, (byte) (-3), false, (byte)8);
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray1, (-3), 1600, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)3;
      byteArray0[2] = (byte)21;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (byte)3, 2087, true);
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
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (byte) (-120), (byte)127, false);
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray1, 143, 896, false);
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
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_1D(byteArray0, (byte) (-105), (-516), false);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte) (-64);
      try { 
        T4AndT6Compression.compressT4_1D(byteArray0, 18, 19, true);
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
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)21;
      byteArray0[1] = (byte)97;
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte)56, 56);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte)0, 2046);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = T4AndT6Compression.decompressModifiedHuffman(byteArray0, 590, (-218));
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      try { 
        T4AndT6Compression.compressModifiedHuffman(byteArray0, 4020, 4020);
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
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, (byte) (-14), (byte)83);
      assertEquals(83, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (-1421), 62, false);
      byte[] byteArray2 = T4AndT6Compression.compressT4_2D(byteArray1, 19, 17, false, 21);
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray2, 72, 62, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }
}
