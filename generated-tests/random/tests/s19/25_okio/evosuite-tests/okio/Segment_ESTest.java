/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 03:44:50 GMT 2019
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
  public void test00()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = segment0.sharedCopy();
      // Undeclared exception!
      try { 
        segment1.push(segment0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Segment segment0 = new Segment(byteArray0, (byte)0, 0, false, false);
      // Undeclared exception!
      try { 
        segment0.split((byte)0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Segment segment0 = new Segment((byte[]) null, (-1), (-2472), false, false);
      // Undeclared exception!
      try { 
        segment0.unsharedCopy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Segment segment0 = new Segment(byteArray0, 8192, 8192, true, true);
      Segment segment1 = new Segment();
      SegmentPool.next = segment0;
      SegmentPool.next = segment1;
      // Undeclared exception!
      try { 
        segment0.writeTo(SegmentPool.next, 767);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Segment segment0 = new Segment();
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
  public void test05()  throws Throwable  {
      Segment segment0 = new Segment();
      // Undeclared exception!
      try { 
        segment0.writeTo(segment0, 12273);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Segment segment0 = new Segment(byteArray0, 4081, 4081, true, true);
      // Undeclared exception!
      try { 
        segment0.writeTo(segment0, 8192);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Segment segment0 = new Segment();
      byte[] byteArray0 = new byte[6];
      Segment segment1 = new Segment(byteArray0, 1609, 1, false, false);
      // Undeclared exception!
      try { 
        segment0.writeTo(segment1, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Segment segment0 = new Segment(byteArray0, 1469, 12273, false, false);
      Segment segment1 = new Segment();
      segment0.prev = segment1;
      segment0.compact();
      assertNotSame(segment0, segment1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment0.prev = segment1;
      segment0.prev.sharedCopy();
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
  public void test10()  throws Throwable  {
      Segment segment0 = new Segment();
      byte[] byteArray0 = new byte[1];
      Segment segment1 = new Segment(byteArray0, 0, 0, true, false);
      segment0.prev = segment1;
      SegmentPool.next = segment0;
      SegmentPool.next.compact();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.prev = segment0;
      // Undeclared exception!
      try { 
        segment0.compact();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Segment segment0 = new Segment((byte[]) null, (-852), (-280), true, false);
      // Undeclared exception!
      try { 
        segment0.split(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Segment segment0 = new Segment((byte[]) null, (-4329), 1, true, true);
      // Undeclared exception!
      try { 
        segment0.split(3128);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Segment segment0 = new Segment();
      // Undeclared exception!
      try { 
        segment0.split(484);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Segment segment0 = new Segment(byteArray0, 1469, 12273, false, false);
      // Undeclared exception!
      try { 
        segment0.split((-174));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment0.prev = segment1;
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
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Segment segment0 = new Segment(byteArray0, (byte) (-1), (byte) (-1), true, true);
      SegmentPool.next = segment0;
      SegmentPool.next.next = segment0;
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
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Segment segment0 = new Segment(byteArray0, 4081, 4081, true, true);
      Segment segment1 = segment0.unsharedCopy();
      // Undeclared exception!
      try { 
        segment0.writeTo(segment1, 8192);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Segment segment0 = new Segment();
      // Undeclared exception!
      try { 
        segment0.push(segment0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }
}
