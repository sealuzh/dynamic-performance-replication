/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 23:05:46 GMT 2019
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
      byte[] byteArray0 = new byte[5];
      byteArray0[2] = (byte) (-102);
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, 3262, 2533, true);
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
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = T4AndT6Compression.decompressT6(byteArray0, 4, (-2849));
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 21, (-3102), true, 21);
      assertArrayEquals(new byte[] {(byte)0, (byte)1}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[2] = (byte)113;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (byte)113, (byte)113, true);
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
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)64;
      byteArray0[1] = (byte)88;
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, 958, 958);
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
      byte[] byteArray0 = new byte[11];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 1, 1, false);
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, (byte)79, 1, false);
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
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_2D(byteArray0, (byte)0, (byte)0, true);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = T4AndT6Compression.decompressT6(byteArray0, 0, 3266);
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 0, 4, false);
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
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_1D(byteArray0, (-1669), (-1669), false);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_1D(byteArray0, 0, 0, true);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = T4AndT6Compression.decompressT6(byteArray0, 0, 0);
      byte[] byteArray2 = T4AndT6Compression.decompressModifiedHuffman(byteArray1, (-1994), 0);
      assertNotSame(byteArray2, byteArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte)0, (-146));
      byte[] byteArray2 = T4AndT6Compression.compressT6(byteArray1, 0, (byte) (-2));
      assertEquals(3, byteArray2.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 0, 0, false, (byte) (-84));
      assertArrayEquals(new byte[] {(byte)0, (byte)16}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
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
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (byte)0, (byte)0, true);
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 9, 11, true);
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
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (-7), (-7), false);
      assertArrayEquals(new byte[] {(byte)0, (byte)16}, byteArray1);
      assertEquals(2, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, (byte)0, 0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, (-2035), (-2035));
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byteArray0[0] = (byte)95;
      byteArray0[1] = (byte)95;
      // Undeclared exception!
      T4AndT6Compression.decompressT6(byteArray0, 1792, (byte)95);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6((byte[]) null, (-1735), (-1735));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte) (-81), (byte) (-81));
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
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D((byte[]) null, (-793), (-793), true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[12];
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (-1554), (-1554), true);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_1D((byte[]) null, 1792, 2337, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressModifiedHuffman((byte[]) null, (-1736), (-1736));
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
        T4AndT6Compression.compressT6((byte[]) null, 115, 115);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT6(byteArray0, (-2223), (-2223));
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
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      T4AndT6Compression.compressT4_2D(byteArray0, 0, 2118, true, 0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT4_2D((byte[]) null, 47, 7, false, 47);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[14];
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (-1479), (-1479), false, (-1479));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      T4AndT6Compression.compressT4_1D(byteArray0, (-736), 2980, true);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT4_1D((byte[]) null, 1917, 1917, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      T4AndT6Compression.compressModifiedHuffman(byteArray0, (-625), 5616);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressModifiedHuffman((byte[]) null, 32, 32);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 64, 1, true);
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray1, 64, 64, true);
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
      byte[] byteArray0 = new byte[15];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 70, 1, false);
      assertArrayEquals(new byte[] {(byte)0, (byte)29, (byte) (-16), (byte)0, (byte) (-128)}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[11];
      byteArray0[2] = (byte)73;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 2334, 2283, true);
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
      byteArray0[1] = (byte)4;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)4, (byte)4, true);
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
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)4;
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)4, (byte)4);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid/unknown T.6 control code 00000000000001
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)57;
      byteArray0[1] = (byte)8;
      byteArray0[2] = (byte)96;
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)65, 2971);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)79;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)79, (byte)79);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)74;
      byteArray0[1] = (byte)8;
      try { 
        T4AndT6Compression.decompressT6(byteArray0, 2, 2438);
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
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)9;
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)9, 8);
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
      byte[] byteArray0 = new byte[12];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, 1, 8);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray1, 8, 8);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-81);
      byte[] byteArray1 = T4AndT6Compression.decompressT6(byteArray0, 3, 3);
      assertArrayEquals(new byte[] {(byte)0, (byte)32, (byte)32}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte)63;
      byteArray0[2] = (byte)5;
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 7, (byte)5);
      assertArrayEquals(new byte[] {(byte) (-105), (byte)48, (byte)106, (byte)56, (byte)0, (byte) (-128), (byte)8}, byteArray1);
      assertEquals(7, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-92);
      byteArray0[1] = (byte) (-33);
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 8, 3);
      assertEquals(13, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      byte[] byteArray0 = new byte[19];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 6, 6, true);
      try { 
        T4AndT6Compression.compressT6(byteArray1, 35, 52);
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
      byte[] byteArray0 = new byte[12];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 22, 1, true);
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
  public void test49()  throws Throwable  {
      byte[] byteArray0 = new byte[12];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (-6), 3, true);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 3, 3, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      byte[] byteArray0 = new byte[12];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 39, 1, true);
      byte[] byteArray2 = T4AndT6Compression.decompressT4_2D(byteArray1, 1, 1, true);
      assertArrayEquals(new byte[] {(byte)0, (byte)1, (byte)40, (byte)0, (byte)1}, byteArray1);
      assertEquals(5, byteArray1.length);
      assertArrayEquals(new byte[] {(byte) (-128)}, byteArray2);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 5, 5, true);
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 5, 5, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-92);
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 722, 1041, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = T4AndT6Compression.decompressT4_2D(byteArray0, 661, (byte) (-33), false);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 1, 1, true, 1);
      assertArrayEquals(new byte[] {(byte)0, (byte)1, (byte) (-114), (byte)0, (byte)1}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[2] = (byte) (-80);
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 4, 1725, true, (byte) (-80));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (-481), (byte)95, false);
      try { 
        T4AndT6Compression.compressT4_2D(byteArray1, (byte)95, 605, false, (-481));
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
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)63;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 5, (byte)63, false, (byte)63);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)63;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 8, (byte)63, false, (byte)63);
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
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, (byte)0, (byte)0);
      try { 
        T4AndT6Compression.compressT4_2D(byteArray1, 8, 8, true, 8);
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
      byte[] byteArray0 = new byte[11];
      byteArray0[2] = (byte) (-84);
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (byte) (-84), 56, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, (byte)0, 43);
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray1, 43, 43, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      byte[] byteArray0 = new byte[19];
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, 6, 6, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 50, 0);
      try { 
        T4AndT6Compression.compressT4_1D(byteArray1, 4, 2723, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, (-2035), 2583);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, 3, 5);
      byte[] byteArray2 = T4AndT6Compression.decompressModifiedHuffman(byteArray1, 3, 5);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray2);
      assertArrayEquals(new byte[] {(byte) (-128), (byte) (-128), (byte) (-128), (byte) (-128), (byte) (-128)}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      byte[] byteArray0 = new byte[63];
      try { 
        T4AndT6Compression.compressModifiedHuffman(byteArray0, 319, 319);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      byte[] byteArray0 = new byte[19];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, 6, 6, true);
      byte[] byteArray2 = T4AndT6Compression.decompressT4_1D(byteArray1, 6, 6, true);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray2);
      assertEquals(14, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (-608), 32, false);
      // Undeclared exception!
      T4AndT6Compression.compressT6(byteArray1, 522, 32);
  }
}