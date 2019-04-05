/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 20:48:07 GMT 2019
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
      byteArray0[0] = (byte)52;
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte)52, (byte)52);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[13];
      try { 
        T4AndT6Compression.compressModifiedHuffman(byteArray0, 68, 68);
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
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = T4AndT6Compression.decompressT6(byteArray0, 22, (-2353));
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 1265, (-3), false, 1112);
      assertArrayEquals(new byte[] {(byte)0, (byte)16}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-54);
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, 1899, (byte)39);
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
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-54);
      byte[] byteArray1 = T4AndT6Compression.decompressT6(byteArray0, 2, 2);
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.decompressModifiedHuffman(byteArray0, 1211, (byte) (-3));
      byte[] byteArray2 = T4AndT6Compression.decompressT6(byteArray1, 0, 0);
      assertNotSame(byteArray0, byteArray2);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_2D(byteArray0, 0, (-1709), false);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_1D(byteArray0, (-3183), (-3183), false);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_1D(byteArray0, (byte)0, (byte)0, false);
      byte[] byteArray2 = T4AndT6Compression.decompressT4_1D(byteArray1, (-1600), (byte)0, false);
      assertNotSame(byteArray2, byteArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte)0, (byte)0);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_2D(byteArray0, (byte)0, 0, false);
      byte[] byteArray2 = T4AndT6Compression.decompressModifiedHuffman(byteArray1, (-1806), (-2675));
      assertArrayEquals(new byte[] {}, byteArray2);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT6((byte[]) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 0, (-1263));
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT4_2D(byteArray1, (-1263), 0, false, (-1709));
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
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, 258, (byte)0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, (byte)0, (-682));
      byte[] byteArray2 = T4AndT6Compression.compressT4_1D(byteArray1, (byte)0, 0, false);
      assertArrayEquals(new byte[] {(byte)0, (byte)16}, byteArray2);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = T4AndT6Compression.decompressModifiedHuffman(byteArray0, 1216, (byte) (-3));
      byte[] byteArray2 = T4AndT6Compression.compressModifiedHuffman(byteArray1, (-1165), (-2));
      assertEquals(0, byteArray2.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6((byte[]) null, 32, 32);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte) (-54), (byte) (-54));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, (byte)0, 2975);
      // Undeclared exception!
      T4AndT6Compression.decompressT4_2D(byteArray1, 1792, (byte)59, true);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D((byte[]) null, (-29), (-29), true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[14];
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (-3011), (-3011), false);
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
        T4AndT6Compression.decompressT4_1D((byte[]) null, 8, 8, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressModifiedHuffman((byte[]) null, (-2193), (byte)53);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      T4AndT6Compression.compressT6(byteArray0, 0, 3461);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT6((byte[]) null, 1536, 1536);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT6(byteArray0, (-623), (-623));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT4_2D((byte[]) null, 25, (-1575), true, 25);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      T4AndT6Compression.compressT4_1D(byteArray0, (-1003), 1176, false);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT4_1D((byte[]) null, (-3004), 3, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      T4AndT6Compression.compressModifiedHuffman(byteArray0, (-147), 3238);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressModifiedHuffman((byte[]) null, (byte)2, (-2039));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-43);
      byteArray0[1] = (byte)117;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, 2, 38);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)101;
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte)101, (byte)101);
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
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)88;
      byteArray0[1] = (byte)52;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)52, 1128);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)13;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, 60, (byte)13);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (byte) (-3), (-1020), true);
      try { 
        T4AndT6Compression.decompressT6(byteArray1, 63, 4);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid/unknown T.6 control code 0000000000000001
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)4;
      byteArray0[1] = (byte)23;
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
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)31;
      byteArray0[1] = (byte)66;
      byteArray0[2] = (byte) (-20);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, 299, 1939);
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
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, (-1), 301);
      // Undeclared exception!
      T4AndT6Compression.decompressT6(byteArray1, 299, 1939);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = T4AndT6Compression.decompressT6(byteArray0, (byte)0, 282);
      byte[] byteArray2 = T4AndT6Compression.compressT4_2D(byteArray1, (byte)0, 417, false, 22);
      assertEquals(699, byteArray2.length);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte) (-3);
      try { 
        T4AndT6Compression.compressT6(byteArray0, 3, 37);
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
      byte[] byteArray0 = new byte[9];
      byteArray0[4] = (byte) (-2);
      byteArray0[5] = (byte) (-113);
      try { 
        T4AndT6Compression.compressT6(byteArray0, 8, 2255);
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
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)88;
      byteArray0[1] = (byte) (-2);
      try { 
        T4AndT6Compression.compressT6(byteArray0, 8, 2255);
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
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)36;
      try { 
        T4AndT6Compression.compressT6(byteArray0, 8, 2255);
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
      byte[] byteArray0 = new byte[12];
      byteArray0[2] = (byte)34;
      byteArray0[3] = (byte)34;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)34, (byte)34, true);
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
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (-22), 15, true);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 15, 15, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      byte[] byteArray0 = new byte[14];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, (byte)8, (byte)8);
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, (byte)8, (byte)8, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte) (-3);
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 24, 1474, true, (-3));
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
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (byte) (-54), 122, true);
      byte[] byteArray2 = T4AndT6Compression.compressT4_2D(byteArray1, 5, (byte)70, true, (-3608));
      assertEquals(368, byteArray1.length);
      assertEquals(189, byteArray2.length);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte) (-3);
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte)2, 14, true, 0);
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
      byteArray0[1] = (byte) (-8);
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte)3, 3376, false, 40);
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
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte) (-3);
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte)6, 3343, true, 33);
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
      byte[] byteArray0 = new byte[11];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 3, 3, true, 3);
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 3, 1539, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte) (-2);
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, 8, 21, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[2] = (byte)108;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (byte)108, (byte)108, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[2] = (byte)108;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (byte)0, (byte)108, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, 1485, 1485, false);
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
      byte[] byteArray0 = new byte[11];
      try { 
        T4AndT6Compression.compressT4_1D(byteArray0, (byte)53, (byte)53, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      byte[] byteArray0 = new byte[11];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (byte)1, (byte)1, true);
      assertArrayEquals(new byte[] {(byte)0, (byte)1, (byte)28, (byte)0, (byte)1}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      byte[] byteArray0 = new byte[14];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (byte)4, (byte)4, true);
      byte[] byteArray2 = T4AndT6Compression.compressT6(byteArray1, (byte)4, (byte)4);
      assertArrayEquals(new byte[] {(byte)0, (byte)1, (byte) (-80), (byte)1, (byte) (-80), (byte)1, (byte) (-80), (byte)1, (byte) (-80), (byte)1}, byteArray1);
      assertArrayEquals(new byte[] {(byte) (-55), (byte) (-86), (byte)10, (byte)33, (byte) (-128), (byte)8, (byte)0, (byte) (-128)}, byteArray2);
      assertEquals(10, byteArray1.length);
      assertEquals(8, byteArray2.length);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
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
  public void test62()  throws Throwable  {
      byte[] byteArray0 = new byte[19];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, (-2443), 710);
      // Undeclared exception!
      T4AndT6Compression.compressT4_2D(byteArray1, 710, 710, false, (-2443));
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      byte[] byteArray0 = new byte[11];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 3, 3, false, 3);
      byte[] byteArray2 = T4AndT6Compression.decompressT4_2D(byteArray1, 3, 3, false);
      assertArrayEquals(new byte[] {(byte)0, (byte)28, (byte)0, (byte)10, (byte)0, (byte)40, (byte)0, (byte) (-128)}, byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0}, byteArray2);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      byte[] byteArray0 = new byte[14];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, (byte)8, (byte)8);
      assertArrayEquals(new byte[] {(byte) (-104), (byte) (-104), (byte) (-104), (byte) (-104), (byte) (-104), (byte) (-104), (byte) (-104), (byte) (-104)}, byteArray1);
      
      byte[] byteArray2 = T4AndT6Compression.decompressModifiedHuffman(byteArray1, (byte)8, (byte)8);
      assertEquals(8, byteArray2.length);
      assertEquals(8, byteArray1.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray2);
  }
}
