/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 11:27:18 GMT 2018
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import okio.Segment;
import okio.SegmentPool;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Segment_ESTest extends Segment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Segment segment0 = new Segment(byteArray0, 1217, (-1), true, true);
      int int0 = 1024;
      Segment segment1 = new Segment(byteArray0, 655, 0, true, true);
      // Undeclared exception!
      try { 
        segment0.push(segment1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-1);
      byteArray0[3] = (byte)35;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)1;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte)0;
      Segment segment0 = new Segment(byteArray0, (byte)1, (-1702), true, true);
      segment0.shared = true;
      Segment segment1 = new Segment(byteArray0, (-4180), (byte)35, true, true);
      segment1.owner = false;
      segment0.next = segment1;
      segment0.next.sharedCopy();
      // Undeclared exception!
      try { 
        segment0.split(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte byte0 = (byte)0;
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)1;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)55;
      byteArray0[6] = (byte)20;
      Segment segment0 = new Segment(byteArray0, (-2496), (byte)0, false, false);
      // Undeclared exception!
      try { 
        segment0.split((byte)55);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Segment segment0 = new Segment();
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)2;
      byteArray0[1] = (byte)52;
      byte[] byteArray1 = new byte[3];
      byteArray1[0] = (byte) (-71);
      byteArray1[1] = (byte)2;
      byteArray1[2] = (byte) (-71);
      Segment segment1 = new Segment(byteArray1, (byte)2, 0, true, true);
      segment0.prev = segment1;
      byteArray0[3] = (byte) (-114);
      Segment segment2 = new Segment(byteArray0, (byte)52, 678, false, true);
      segment0.next = segment2;
      segment0.compact();
      // Undeclared exception!
      try { 
        segment0.compact();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Segment segment0 = new Segment();
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)2;
      byteArray0[1] = (byte)52;
      byte[] byteArray1 = new byte[3];
      byteArray1[0] = (byte) (-71);
      byteArray1[1] = (byte)2;
      byteArray1[2] = (byte) (-71);
      Segment segment1 = new Segment();
      segment0.prev = segment1;
      byteArray0[3] = (byte) (-114);
      Segment segment2 = new Segment(byteArray0, (byte)52, 678, false, true);
      segment0.prev.limit = 678;
      segment0.next = segment2;
      segment0.compact();
      // Undeclared exception!
      try { 
        segment0.compact();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = segment0.unsharedCopy();
      // Undeclared exception!
      try { 
        segment1.writeTo(segment0, 8228);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = segment0.unsharedCopy();
      segment1.next = segment0;
      segment1.next.writeTo(segment0, 8192);
      segment0.writeTo(segment0, 8192);
      // Undeclared exception!
      try { 
        segment0.pop();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.next = segment0;
      // Undeclared exception!
      try { 
        segment0.pop();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }
}