/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 15:46:29 GMT 2019
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
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)26;
      byteArray0[2] = (byte)17;
      byteArray0[3] = (byte) (-5);
      byteArray0[4] = (byte) (-63);
      byteArray0[5] = (byte)0;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 18, 8, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 18
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)61;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)0;
      int int0 = (-2899);
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (-2899), 1522, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)7;
      byteArray0[2] = (byte) (-52);
      byteArray0[3] = (byte)19;
      byte byte0 = (byte) (-1);
      byteArray0[4] = (byte) (-1);
      byteArray0[5] = (byte)3;
      byteArray0[6] = (byte)102;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, 64, 22, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)10;
      byteArray0[2] = (byte)17;
      byteArray0[3] = (byte)7;
      byteArray0[4] = (byte) (-63);
      byteArray0[5] = (byte)0;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 18, 8, true);
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
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)4;
      byte byte0 = (byte) (-70);
      byteArray0[1] = (byte) (-70);
      byteArray0[2] = (byte)21;
      byteArray0[3] = (byte)82;
      byteArray0[4] = (byte) (-91);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, 1, (byte)4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = (-3859);
      boolean boolean0 = false;
      byte[] byteArray1 = T4AndT6Compression.decompressT4_1D(byteArray0, (-3859), (-3859), false);
      int int1 = 23;
      byte[] byteArray2 = T4AndT6Compression.compressT4_1D(byteArray1, (-3859), 23, false);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray2, 23, 23, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte byte0 = (byte)0;
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byte byte1 = (byte) (-128);
      byteArray0[2] = (byte) (-128);
      byteArray0[4] = (byte)93;
      byte byte2 = (byte)16;
      byteArray0[5] = (byte)16;
      byte byte3 = (byte) (-1);
      byteArray0[6] = (byte) (-1);
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, 8, 64, true);
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
      byte byte0 = (byte)8;
      byteArray0[1] = (byte)8;
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, 1100, (byte)0);
      T4AndT6Compression.decompressT4_1D(byteArray0, (byte)8, (-149), false);
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray1, (byte)0, 1745, false);
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
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-128);
      byteArray0[1] = (byte)5;
      byteArray0[2] = (byte)59;
      byteArray0[3] = (byte)29;
      byteArray0[4] = (byte)63;
      byteArray0[5] = (byte)1;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte) (-37);
      T4AndT6Compression.compressT4_2D(byteArray0, (byte)63, (byte) (-128), false, (byte)5);
      T4AndT6Compression.compressT4_2D(byteArray0, (byte)0, (byte) (-128), true, (-1191));
      try { 
        T4AndT6Compression.compressT6(byteArray0, 11, 657);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)0;
      byte byte0 = (byte)2;
      byteArray0[1] = (byte)2;
      byte byte1 = (byte) (-128);
      byteArray0[2] = (byte) (-128);
      byteArray0[3] = (byte)14;
      byteArray0[4] = (byte)93;
      byteArray0[5] = (byte)16;
      byte byte2 = (byte) (-1);
      byteArray0[6] = (byte) (-1);
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, 8, 64, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-29);
      byte byte0 = (byte)8;
      byteArray0[1] = (byte)8;
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (byte) (-29), (byte) (-29), true);
      T4AndT6Compression.decompressModifiedHuffman(byteArray1, (byte) (-29), (byte) (-29));
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, (byte)8, (byte)8, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Decompression error
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-7);
      byteArray0[1] = (byte)76;
      byteArray0[2] = (byte) (-30);
      byteArray0[3] = (byte) (-1);
      byteArray0[4] = (byte)18;
      byteArray0[5] = (byte) (-61);
      byteArray0[6] = (byte)10;
      byteArray0[7] = (byte)0;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 32, (byte)10, false, 13);
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
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-97);
      byteArray0[1] = (byte)7;
      byteArray0[2] = (byte)112;
      byteArray0[3] = (byte)27;
      byteArray0[4] = (byte)5;
      byteArray0[5] = (byte) (-127);
      byteArray0[6] = (byte) (-65);
      byteArray0[7] = (byte)33;
      byteArray0[8] = (byte) (-116);
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte)27, (byte)33, true, (byte)33);
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
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)14;
      byteArray0[2] = (byte)7;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (byte)7, 48, true);
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
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-63);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-74);
      byteArray0[3] = (byte) (-1);
      byteArray0[4] = (byte)6;
      byteArray0[5] = (byte) (-24);
      byteArray0[6] = (byte)5;
      byteArray0[7] = (byte) (-29);
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte)5, 63, false, (-645));
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
      byte[] byteArray0 = new byte[3];
      byte byte0 = (byte)64;
      byteArray0[0] = (byte)64;
      byte byte1 = (byte) (-96);
      byteArray0[1] = (byte) (-96);
      byte byte2 = (byte) (-33);
      byteArray0[2] = (byte) (-33);
      int int0 = 26;
      int int1 = 182;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, 26, 182);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)9;
      byteArray0[1] = (byte) (-5);
      byteArray0[2] = (byte)17;
      byteArray0[3] = (byte) (-35);
      byteArray0[4] = (byte)64;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, 5, 1904);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-98);
      byteArray0[1] = (byte)12;
      byteArray0[2] = (byte)126;
      byteArray0[3] = (byte) (-65);
      byteArray0[4] = (byte) (-64);
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)8;
      byteArray0[7] = (byte)57;
      byteArray0[8] = (byte) (-14);
      // Undeclared exception!
      T4AndT6Compression.compressT4_2D(byteArray0, (byte)0, 1601, false, (byte)8);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte byte0 = (byte)42;
      byteArray0[0] = (byte)42;
      byte byte1 = (byte)12;
      byteArray0[1] = (byte)12;
      byte byte2 = (byte)63;
      byteArray0[2] = (byte)63;
      try { 
        T4AndT6Compression.compressT4_1D(byteArray0, (byte)12, (byte)63, true);
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
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)34;
      byteArray0[1] = (byte)46;
      byteArray0[2] = (byte)4;
      byteArray0[3] = (byte)16;
      byte byte0 = (byte)40;
      byteArray0[4] = (byte)40;
      byteArray0[5] = (byte)4;
      byteArray0[6] = (byte)39;
      byteArray0[7] = (byte)96;
      boolean boolean0 = true;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte)4, (byte)39, true, 62);
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
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)4;
      byte byte0 = (byte)9;
      byteArray0[1] = (byte)9;
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
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-88);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)61;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)37;
      byte[] byteArray1 = T4AndT6Compression.compressT6(byteArray0, (byte)0, 1792);
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, (byte)0, (byte)37, true);
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
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)29;
      byte byte0 = (byte) (-126);
      byteArray0[1] = (byte) (-126);
      byte byte1 = (byte)39;
      byteArray0[2] = (byte)39;
      byteArray0[3] = (byte)32;
      byte byte2 = (byte) (-9);
      byteArray0[4] = (byte) (-9);
      boolean boolean0 = false;
      T4AndT6Compression.compressT4_2D(byteArray0, 0, (byte)29, false, (byte)39);
      int int0 = (-166);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (-166), (byte)39);
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
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)127;
      byteArray0[1] = (byte)8;
      byteArray0[2] = (byte)105;
      byteArray0[3] = (byte)57;
      byteArray0[4] = (byte)123;
      byteArray0[5] = (byte) (-68);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, (byte)8, (byte)105);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)6;
      byteArray0[1] = (byte) (-36);
      byteArray0[2] = (byte) (-33);
      byteArray0[3] = (byte)8;
      byteArray0[4] = (byte)63;
      byteArray0[5] = (byte)32;
      T4AndT6Compression.compressT4_1D(byteArray0, (byte) (-36), (byte)63, true);
      byte[] byteArray1 = new byte[3];
      byteArray1[0] = (byte)14;
      byteArray1[1] = (byte) (-36);
      byteArray1[2] = (byte) (-36);
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray1, (-3), 30);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte)54;
      byteArray0[0] = (byte)54;
      byteArray0[1] = (byte) (-128);
      byte byte1 = (byte) (-2);
      byteArray0[2] = (byte) (-2);
      byteArray0[3] = (byte)51;
      byteArray0[4] = (byte) (-81);
      int int0 = 14;
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, 14, (byte)54);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecoverable row length error in image row 0
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-121);
      int int0 = 262;
      int int1 = 52;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT6(byteArray0, 262, 52);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-86);
      byteArray0[1] = (byte)60;
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray0, (byte)60, 2911);
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
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte) (-9);
      byteArray0[0] = (byte) (-9);
      byte byte1 = (byte)15;
      byteArray0[1] = (byte)15;
      byte byte2 = (byte)56;
      byteArray0[2] = (byte)56;
      byte byte3 = (byte)64;
      byteArray0[3] = (byte)64;
      try { 
        T4AndT6Compression.compressT6(byteArray0, (byte)15, 1337);
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
      byte[] byteArray0 = new byte[0];
      int int0 = 1600;
      int int1 = (-397);
      boolean boolean0 = false;
      byte[] byteArray1 = T4AndT6Compression.compressT4_2D(byteArray0, 1600, (-397), false, 1600);
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, 1600, 1600, false);
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
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)56;
      byte byte0 = (byte)25;
      byteArray0[1] = (byte)25;
      byteArray0[2] = (byte)8;
      boolean boolean0 = true;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte)8, (byte)8, true, 55);
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
      byte[] byteArray0 = new byte[1];
      byte byte0 = (byte)0;
      byteArray0[0] = (byte)0;
      boolean boolean0 = true;
      byte[] byteArray1 = T4AndT6Compression.decompressT4_1D(byteArray0, (byte)0, (byte)0, true);
      int int0 = 3840;
      T4AndT6Compression.decompressT6(byteArray0, (byte)0, 3840);
      T4AndT6Compression.decompressT4_2D(byteArray0, 3840, (byte)0, true);
      T4AndT6Compression.decompressT6(byteArray0, (byte)0, (-4950));
      T4AndT6Compression.decompressModifiedHuffman(byteArray1, (byte)0, 3840);
      int int1 = (-675);
      // Undeclared exception!
      T4AndT6Compression.compressT4_1D(byteArray0, (-675), 3840, false);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte byte0 = (byte)105;
      byteArray0[0] = (byte)105;
      byteArray0[1] = (byte)3;
      byteArray0[2] = (byte)15;
      byteArray0[3] = (byte) (-3);
      byteArray0[4] = (byte)4;
      byteArray0[5] = (byte) (-12);
      byte[] byteArray1 = T4AndT6Compression.decompressT6(byteArray0, 1060, (-1607));
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray1, (-1062), 972);
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
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-56);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)14;
      byteArray0[3] = (byte)19;
      byte byte0 = (byte) (-6);
      byteArray0[4] = (byte) (-6);
      byte byte1 = (byte) (-3);
      byteArray0[5] = (byte) (-3);
      byteArray0[6] = (byte)17;
      byteArray0[7] = (byte) (-109);
      byteArray0[8] = (byte)80;
      byte[] byteArray1 = T4AndT6Compression.decompressT6(byteArray0, 199, (-4950));
      boolean boolean0 = true;
      T4AndT6Compression.compressT4_2D(byteArray1, (byte)19, (-2241), true, (byte) (-3));
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte) (-109), (byte)19, true, 2106);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-82);
      byteArray0[1] = (byte)92;
      byteArray0[2] = (byte) (-100);
      byteArray0[3] = (byte)54;
      byteArray0[4] = (byte)2;
      byteArray0[5] = (byte)1;
      byteArray0[6] = (byte) (-77);
      byteArray0[7] = (byte) (-118);
      byteArray0[8] = (byte)64;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, 1280, 449, false);
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
      byte[] byteArray0 = new byte[8];
      byte byte0 = (byte) (-28);
      byteArray0[0] = (byte) (-28);
      byteArray0[1] = (byte) (-3);
      byteArray0[2] = (byte)117;
      byte byte1 = (byte) (-91);
      byteArray0[3] = (byte) (-91);
      byte byte2 = (byte) (-109);
      byteArray0[4] = (byte) (-109);
      byte byte3 = (byte)46;
      byteArray0[5] = (byte)46;
      byteArray0[6] = (byte) (-91);
      byteArray0[7] = (byte)71;
      // Undeclared exception!
      T4AndT6Compression.decompressT6(byteArray0, 1504, 4141);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)27;
      byteArray0[1] = (byte)60;
      byteArray0[2] = (byte) (-96);
      byteArray0[3] = (byte)18;
      byteArray0[4] = (byte)24;
      byteArray0[5] = (byte) (-23);
      byteArray0[6] = (byte)45;
      byteArray0[7] = (byte)1;
      byteArray0[8] = (byte)103;
      byte[] byteArray1 = T4AndT6Compression.decompressT6(byteArray0, 64, 2);
      byte[] byteArray2 = T4AndT6Compression.decompressT4_1D(byteArray1, (byte)24, (-2), true);
      try { 
        T4AndT6Compression.compressT6(byteArray2, 192, 8);
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
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-26);
      byteArray0[1] = (byte)3;
      byte byte0 = (byte) (-128);
      byteArray0[2] = (byte) (-128);
      byte byte1 = (byte) (-38);
      byteArray0[3] = (byte) (-38);
      byteArray0[4] = (byte)11;
      int int0 = 1686;
      try { 
        T4AndT6Compression.compressT6(byteArray0, (byte)3, 1686);
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
      int int0 = (-552);
      int int1 = 0;
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT6((byte[]) null, (-552), 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = null;
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressModifiedHuffman((byte[]) null, 863, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = null;
      int int0 = 0;
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressModifiedHuffman((byte[]) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte)0;
      byteArray0[0] = (byte)0;
      byte byte1 = (byte) (-3);
      byteArray0[1] = (byte) (-3);
      try { 
        T4AndT6Compression.compressT4_1D(byteArray0, 5841, 3513, true);
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
      byteArray0[0] = (byte)64;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)1;
      byteArray0[5] = (byte) (-95);
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte) (-22);
      byteArray0[8] = (byte)0;
      byte[] byteArray1 = T4AndT6Compression.decompressT4_1D(byteArray0, (byte) (-95), (byte) (-22), false);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray1, (-2883), (byte)64, true);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte) (-114);
      byteArray0[0] = (byte) (-114);
      byteArray0[1] = (byte) (-19);
      byte byte1 = (byte) (-70);
      byteArray0[2] = (byte) (-70);
      byte byte2 = (byte)55;
      byteArray0[3] = (byte)55;
      T4AndT6Compression.compressT4_1D(byteArray0, 0, (byte) (-114), true);
      byte[] byteArray1 = new byte[2];
      byteArray1[0] = (byte)55;
      byteArray1[1] = (byte) (-70);
      try { 
        T4AndT6Compression.compressModifiedHuffman(byteArray1, (byte)55, 64);
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
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-26);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-1);
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte) (-102);
      byteArray0[6] = (byte) (-17);
      T4AndT6Compression.compressT4_1D(byteArray0, (-2965), (-686), true);
      // Undeclared exception!
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (-109), (-54), true);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte) (-98);
      byteArray0[2] = (byte)26;
      byteArray0[3] = (byte) (-115);
      byteArray0[4] = (byte)97;
      byteArray0[5] = (byte)21;
      byteArray0[6] = (byte)21;
      byteArray0[7] = (byte) (-50);
      byteArray0[8] = (byte)3;
      byte[] byteArray1 = T4AndT6Compression.decompressModifiedHuffman(byteArray0, 0, 4);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-104);
      byteArray0[1] = (byte)71;
      byteArray0[2] = (byte) (-1);
      byte byte0 = (byte)64;
      byteArray0[3] = (byte)64;
      byteArray0[4] = (byte)64;
      byte[] byteArray1 = T4AndT6Compression.compressT4_1D(byteArray0, (byte)64, (-3338), false);
      T4AndT6Compression.decompressModifiedHuffman(byteArray1, (-270), (byte) (-1));
      T4AndT6Compression.decompressT4_2D(byteArray1, 2164, (byte) (-104), false);
      try { 
        T4AndT6Compression.decompressModifiedHuffman(byteArray1, (byte)64, (byte)71);
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
      byte[] byteArray0 = new byte[0];
      int int0 = 1187;
      try { 
        T4AndT6Compression.compressModifiedHuffman(byteArray0, 1187, 1187);
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
      byte[] byteArray0 = new byte[6];
      byte byte0 = (byte)15;
      byteArray0[0] = (byte)15;
      byteArray0[1] = (byte) (-19);
      byteArray0[2] = (byte)14;
      byte byte1 = (byte)2;
      byteArray0[3] = (byte)2;
      byte byte2 = (byte) (-54);
      byteArray0[4] = (byte) (-54);
      byte byte3 = (byte) (-7);
      byteArray0[5] = (byte) (-7);
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, 13, (byte)14, true, (byte) (-7));
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
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte) (-89);
      byteArray0[0] = (byte) (-89);
      byte byte1 = (byte)3;
      byteArray0[1] = (byte)3;
      byteArray0[2] = (byte) (-116);
      byte byte2 = (byte)64;
      byteArray0[3] = (byte)64;
      T4AndT6Compression.compressModifiedHuffman(byteArray0, (byte)3, (byte) (-89));
      // Undeclared exception!
      try { 
        T4AndT6Compression.compressT6(byteArray0, (byte) (-89), (byte) (-116));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)19;
      byteArray0[1] = (byte)94;
      byte byte0 = (byte)1;
      byteArray0[2] = (byte)1;
      byteArray0[3] = (byte)121;
      byte byte1 = (byte)95;
      byteArray0[4] = (byte)95;
      byte byte2 = (byte) (-81);
      byteArray0[5] = (byte) (-81);
      boolean boolean0 = false;
      try { 
        T4AndT6Compression.compressT4_2D(byteArray0, (byte)95, (byte)1, false, 1);
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
      byteArray0[0] = (byte) (-128);
      byteArray0[1] = (byte)8;
      byteArray0[2] = (byte) (-112);
      byteArray0[3] = (byte)5;
      T4AndT6Compression.decompressModifiedHuffman(byteArray0, (-1), (byte) (-112));
      try { 
        T4AndT6Compression.decompressT6(byteArray0, 4, 1664);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid/unknown T.6 control code 000000000001
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)64;
      byteArray0[1] = (byte)40;
      byteArray0[2] = (byte)23;
      byteArray0[3] = (byte)4;
      byteArray0[4] = (byte) (-128);
      byteArray0[5] = (byte)1;
      try { 
        T4AndT6Compression.decompressT4_1D(byteArray0, (byte)23, 1792, true);
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
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte)6;
      byteArray0[0] = (byte)6;
      byte byte1 = (byte)24;
      byteArray0[1] = (byte)24;
      byte byte2 = (byte)25;
      byteArray0[2] = (byte)25;
      byte byte3 = (byte)63;
      byteArray0[3] = (byte)63;
      byteArray0[4] = (byte)11;
      boolean boolean0 = true;
      try { 
        T4AndT6Compression.decompressT4_2D(byteArray0, (byte)63, (byte)25, true);
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
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-1);
      byteArray0[1] = (byte)95;
      byteArray0[2] = (byte)4;
      try { 
        T4AndT6Compression.compressT6(byteArray0, (byte)4, (byte)95);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error reading image to compress
         //
         verifyException("org.apache.commons.imaging.common.itu_t4.T4AndT6Compression", e);
      }
  }
}
