/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 15:07:11 GMT 2019
 */

package org.apache.commons.imaging.common.itu_t4;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
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
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, (-3899), 33);
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
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, (byte)7, (byte) (-21));
      assertEquals(3, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte)0, (byte)0);
      byte[] byteArray2 = T4AndT6Compression.compressT6(byteArray1, (byte)0, 17);
      assertArrayEquals(new byte[] {(byte)0, (byte)16, (byte)1}, byteArray2);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 48, 0, true, (-2058));
      assertArrayEquals(new byte[] {(byte)0, (byte)1}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = T4AndT6Compression.decompressT6(byteArray0, 0, 1856);
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT4_2D(byteArray1, (byte) (-100), (byte)32, false, (byte)0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (-1156), (byte) (-111), true);
      assertArrayEquals(new byte[] {(byte)0, (byte)1}, byteArray1);
      assertEquals(2, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, (-1156), (-2031));
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, 0, 0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (-1235), 1);
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
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (-2152), (-106), true, (byte)37);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[2] = (byte)52;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (-2528), 96, true);
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
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte)6;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (-2528), 96, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-64);
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 2240, 1846, false);
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
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)7;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, 13, (byte)7);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 13
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, (byte)13, (-356), true, 22);
      try { 
        T4AndT6Compression.decompressT6(byteArray1, 31, 31);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid/unknown T.6 control code 0000000000000001
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)9;
      byteArray0[1] = (byte)11;
      byteArray0[2] = (byte)88;
      byteArray0[3] = (byte)43;
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)88, 63);
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
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = T4AndT6Compression.compressModifiedHuffman(byteArray0, (-3110), 2);
      try { 
        T4AndT6Compression.decompressT6(byteArray1, 2176, 1527);
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
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)13;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, 31, 31);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 31
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)20;
      byte[] byteArray1 = T4AndT6Compression.decompressT6(byteArray0, 61, 1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = T4AndT6Compression.decompressT6(byteArray0, (byte)16, (byte) (-2));
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte) (-117);
      byteArray0[2] = (byte) (-1);
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 4, 3);
      assertArrayEquals(new byte[] {(byte) (-109), (byte)85, (byte) (-125), (byte)0, (byte)16, (byte)1}, byteArray1);
      assertEquals(6, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[4] = (byte)44;
      byteArray0[5] = (byte) (-1);
      try { 
        T4AndT6Compression.compressT6(byteArray0, (byte)8, (byte)33);
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
      byte[] byteArray0 = new byte[7];
      byteArray0[3] = (byte)1;
      byteArray0[4] = (byte)44;
      try { 
        T4AndT6Compression.compressT6(byteArray0, (byte)8, (byte)33);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)14;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 832, 992, true);
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
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte)2;
      byteArray0[3] = (byte)2;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 2112, 43, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid/unknown T.4 control code 000000000000001
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte)2;
      byteArray0[2] = (byte) (-128);
      byteArray0[3] = (byte)15;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 2112, 43, true);
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
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)16;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)16, 715, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 2878, 815, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          byte[] byteArray0 = new byte[0];
          byte[] byteArray1 = T4AndT6Compression.decompressT4_2D(byteArray0, 1824, (-695), true);
          assertNotSame(byteArray1, byteArray0);
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      T4AndT6Compression.compressT4_2D(byteArray0, (byte)0, 1792, true, 28);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte) (-113);
      byteArray0[4] = (byte)3;
      byteArray0[5] = (byte) (-128);
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte)21, 186, false, 53);
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
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte)60;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte)21, 186, false, 53);
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
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (byte) (-19), (byte)3, false);
      try { 
        T4AndT6Compression.compressT4_2D(byteArray1, 28, (byte)40, false, 28);
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
      byte[] byteArray0 = new byte[7];
      byteArray0[2] = (byte)96;
      byteArray0[3] = (byte) (-40);
      byteArray0[4] = (byte) (-96);
      byteArray0[5] = (byte)20;
      byteArray0[6] = (byte) (-17);
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, 2454, 2454, true);
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
      byte[] byteArray0 = new byte[7];
      byteArray0[2] = (byte) (-128);
      byteArray0[3] = (byte) (-40);
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, 2427, 2427, true);
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
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (byte) (-93), 9, true);
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray1, 3265, (byte)63, true);
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
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)58;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (byte)58, 834, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected EOL not found
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, (byte)0, 17);
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray1, (byte)0, 4196, false);
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
      byte[] byteArray1 = T4AndT6Compression.decompressT4_1D(byteArray0, (-1720), (-492), true);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      try { 
        T4AndT6Compression.compressT4_1D(byteArray0, (byte)42, (byte)23, true);
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
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (byte) (-111), (byte)16, true);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 2878, 815, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2878
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)28;
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte)1, (byte)28);
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
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)64;
      byteArray0[1] = (byte) (-64);
      byteArray0[2] = (byte)64;
      byteArray0[3] = (byte) (-19);
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte)64, 2);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte)16, (byte) (-111));
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      try { 
        T4AndT6Compression.compressModifiedHuffman(byteArray0, (byte)31, (byte)31);
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
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)111;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte)8, 52, true, (byte)8);
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
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (byte)1, (byte)1, true);
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 832, 1246, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }
}
