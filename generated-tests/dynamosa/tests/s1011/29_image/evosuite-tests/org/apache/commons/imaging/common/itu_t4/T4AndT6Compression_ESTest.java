/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 16:53:56 GMT 2019
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
      byte[] byteArray0 = new byte[26];
      try { 
        T4AndT6Compression.compressT4_1D(byteArray0, 128, 125, false);
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
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 36, (-1114), false, (-1114));
      assertArrayEquals(new byte[] {(byte)0, (byte)16}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)57;
      try { 
        T4AndT6Compression.decompressT6(byteArray0, 32, 6815);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (byte)27, (byte) (-9), true);
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 881, (byte)27, true);
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
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = T4AndT6Compression.decompressT6(byteArray0, (byte)0, (byte)0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = T4AndT6Compression.decompressT6(byteArray0, 1824, (-4424));
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[15];
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 0, (byte)27, true);
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
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_2D(byteArray0, 2, (byte)0, true);
      byte[] byteArray2 = T4AndT6Compression.decompressT4_2D(byteArray1, (byte)62, (byte) (-60), true);
      assertNotSame(byteArray1, byteArray2);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_1D(byteArray0, (byte)0, (byte)0, true);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_1D(byteArray0, 1133, (-417), false);
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray1, 224, (byte)69, true);
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
      byte[] byteArray0 = new byte[6];
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, (-1), 35);
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
      byte[] byteArray0 = new byte[0];
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, 3174, 3174);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_1D(byteArray0, 12, (byte) (-60), false);
      byte[] byteArray2 = T4AndT6Compression.compressT6(byteArray1, 12, (-1989));
      assertNotSame(byteArray0, byteArray2);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte) (-1), 0, false, (byte) (-8));
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
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_1D(byteArray0, 12, (byte) (-60), false);
      try { 
        T4AndT6Compression.compressT4_2D(byteArray1, 1791, 2661, false, (byte)0);
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
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (byte)0, (byte)0, false);
      assertArrayEquals(new byte[] {(byte)0, (byte)16}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte)8, (-319));
      try { 
        T4AndT6Compression.compressT4_1D(byteArray1, 409, 3174, true);
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
      byte[] byteArray0 = new byte[15];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, 0, 0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_1D(byteArray0, 1133, (-417), false);
      byte[] byteArray2 = T4AndT6Compression.compressModifiedHuffman(byteArray1, 3100, (-417));
      assertNotSame(byteArray0, byteArray2);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-15);
      // Undeclared exception!
      T4AndT6Compression.decompressT6(byteArray0, 2540, 1217);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6((byte[]) null, 1852, 1852);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte) (-3), (byte) (-3));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D((byte[]) null, 964, 964, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (-2100), (-2100), true);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_1D((byte[]) null, 345, 345, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressModifiedHuffman((byte[]) null, (byte)67, (byte)67);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      T4AndT6Compression.compressT6(byteArray0, 0, 3391);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT6((byte[]) null, 120, 120);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT6(byteArray0, (-3847), (-3847));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      T4AndT6Compression.compressT4_2D(byteArray0, 0, 5137, true, 26);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT4_2D((byte[]) null, 757, 757, true, 757);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      T4AndT6Compression.compressT4_1D(byteArray0, (-86), 454, false);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT4_1D((byte[]) null, (-1754), (-1754), true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      T4AndT6Compression.compressModifiedHuffman(byteArray0, (-2), 2112);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressModifiedHuffman((byte[]) null, 64, 64);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[20];
      byteArray0[0] = (byte)100;
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte)100, (byte)100);
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
      byte[] byteArray0 = new byte[19];
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 147, 147, false, 309);
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
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte) (-15);
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, 1792, 1391, true);
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
      byte[] byteArray0 = new byte[15];
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
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)8;
      byteArray0[1] = (byte)116;
      byteArray0[2] = (byte)13;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)35, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)12;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)12, (byte)12);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, (byte)0, (byte)0);
      try { 
        T4AndT6Compression.decompressT6(byteArray1, 64, (byte)100);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid/unknown T.6 control code 000000000001
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)4;
      try { 
        T4AndT6Compression.decompressT6(byteArray0, 106, (byte)4);
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
      byteArray0[0] = (byte)65;
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)1, 131);
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
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)100;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, 64, (byte)100);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-15);
      byte[] byteArray1 = T4AndT6Compression.decompressT6(byteArray0, 1, 2);
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte) (-41);
      try { 
        T4AndT6Compression.compressT6(byteArray0, 16, 1170);
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
      byte[] byteArray0 = new byte[15];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 8, 8, false, 8);
      byte[] byteArray2 = T4AndT6Compression.compressT6(byteArray1, 2, 8);
      assertArrayEquals(new byte[] {(byte) (-62), (byte) (-121), (byte) (-44), (byte)0, (byte)64, (byte)4}, byteArray2);
      assertEquals(6, byteArray2.length);
      assertEquals(16, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      byte[] byteArray0 = new byte[14];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 4, 4);
      byte[] byteArray2 = T4AndT6Compression.compressT6(byteArray1, 4, 4);
      assertArrayEquals(new byte[] {(byte)38, (byte) (-84), (byte) (-40), (byte)111, (byte)80, (byte)1, (byte)0, (byte)16}, byteArray2);
      assertEquals(4, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      byte[] byteArray0 = new byte[28];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 8, 8, true, 8);
      byte[] byteArray2 = T4AndT6Compression.compressT6(byteArray1, 8, 8);
      assertEquals(14, byteArray2.length);
      assertEquals(19, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      byte[] byteArray0 = new byte[28];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 8, 8, true, 8);
      byte[] byteArray2 = T4AndT6Compression.decompressT4_2D(byteArray1, 8, 8, true);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray2);
      assertEquals(19, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      byte[] byteArray0 = new byte[15];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, 8, 8);
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 8, 8, false);
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
      byte[] byteArray0 = new byte[17];
      byteArray0[0] = (byte)100;
      byteArray0[4] = (byte)95;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 26, (byte)100, true, 26);
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
      byte[] byteArray0 = new byte[19];
      byteArray0[2] = (byte)112;
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 4, (byte)13, true, 4);
      assertEquals(34, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      byte[] byteArray0 = new byte[17];
      byteArray0[2] = (byte)125;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 22, 20, true, 56);
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
      byte[] byteArray0 = new byte[28];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 8, 8, true, 8);
      byte[] byteArray2 = T4AndT6Compression.compressT4_2D(byteArray1, 8, 8, true, 8);
      byte[] byteArray3 = T4AndT6Compression.decompressT4_2D(byteArray2, 8, 8, true);
      assertArrayEquals(new byte[] {(byte)0, (byte)1, (byte) (-52), (byte)0, (byte)1, (byte)64, (byte)1, (byte)64}, byteArray3);
      assertEquals(31, byteArray2.length);
      assertEquals(19, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      byte[] byteArray0 = new byte[14];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 4, 4, true);
      assertArrayEquals(new byte[] {(byte)0, (byte)1, (byte) (-80), (byte)1, (byte) (-80), (byte)1, (byte) (-80), (byte)1, (byte) (-80), (byte)1}, byteArray1);
      assertEquals(10, byteArray1.length);
      
      byte[] byteArray2 = T4AndT6Compression.decompressT4_1D(byteArray1, 4, 4, true);
      assertEquals(4, byteArray2.length);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)27;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (byte)27, (byte)27, true);
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
      byte[] byteArray0 = new byte[26];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, (byte)0, (byte)0);
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray1, (-682), 115, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      try { 
        T4AndT6Compression.compressT4_1D(byteArray0, (byte)64, (byte)64, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      byte[] byteArray0 = new byte[15];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (-3744), 390, true);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 390, 1088, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (-3744), 400, false);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 400, 1088, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-58);
      byteArray0[1] = (byte)104;
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, 32, (byte)104);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      byte[] byteArray0 = new byte[19];
      byte[] byteArray1 = T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte)0, 147);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = T4AndT6Compression.decompressModifiedHuffman(byteArray0, 0, 0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, (byte)0, (byte)0);
      try { 
        T4AndT6Compression.compressModifiedHuffman(byteArray1, 23, 23);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }
}