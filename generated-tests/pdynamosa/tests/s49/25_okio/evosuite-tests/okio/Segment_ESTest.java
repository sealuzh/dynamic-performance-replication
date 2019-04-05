/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 13:56:02 GMT 2019
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
      segment0.writeTo(segment0, 3570);
      segment0.pos = 1462;
      segment0.writeTo(segment0, 4675);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Segment segment0 = new Segment();
      SegmentPool.next = segment0;
      segment0.next = SegmentPool.next;
      SegmentPool.next.writeTo(segment0.next, 4400);
      SegmentPool.next.writeTo(SegmentPool.next, 8192);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Segment segment0 = new Segment();
      SegmentPool.next = segment0;
      segment0.next = SegmentPool.next;
      SegmentPool.next.writeTo(segment0.next, 4400);
      Segment segment1 = new Segment();
      segment1.writeTo(SegmentPool.next, 4400);
      assertFalse(segment1.equals((Object)segment0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment0.prev = segment1;
      segment0.prev.prev = segment1;
      segment0.prev.prev.writeTo(segment0.prev.prev, 35);
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
  public void test04()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment0.prev = segment1;
      segment0.limit = 8192;
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
  public void test05()  throws Throwable  {
      Segment segment0 = new Segment((byte[]) null, 2091, 2091, true, true);
      Segment segment1 = new Segment((byte[]) null, 2091, 2091, true, true);
      segment0.prev = segment1;
      // Undeclared exception!
      try { 
        segment0.compact();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Segment segment0 = new Segment();
      SegmentPool.next = segment0;
      segment0.next = SegmentPool.next;
      segment0.next.prev = SegmentPool.next;
      Segment segment1 = new Segment();
      segment1.writeTo(SegmentPool.next, 4400);
      Segment segment2 = SegmentPool.next.split(4400);
      Segment segment3 = segment2.split(4400);
      assertNotSame(segment3, segment0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment1.writeTo(segment0, 3628);
      // Undeclared exception!
      try { 
        segment0.split(1024);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      Segment segment0 = new Segment(byteArray0, (byte) (-11), (byte)0, false, false);
      // Undeclared exception!
      try { 
        segment0.split((byte)79);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Segment segment0 = new Segment(byteArray0, 0, (byte) (-1), true, false);
      Segment segment1 = segment0.unsharedCopy();
      assertNotSame(segment0, segment1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = segment0.sharedCopy();
      assertFalse(segment1.equals((Object)segment0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Segment segment0 = new Segment();
      SegmentPool.next = segment0;
      segment0.next = SegmentPool.next;
      Segment segment1 = new Segment();
      Segment segment2 = segment0.next.push(segment1);
      SegmentPool.next.compact();
      Segment segment3 = segment1.pop();
      assertNull(segment3);
      assertSame(segment1, segment2);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Segment segment0 = new Segment((byte[]) null, 2049, 2049, true, true);
      // Undeclared exception!
      try { 
        segment0.writeTo(segment0, (-3422));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Segment segment0 = new Segment();
      // Undeclared exception!
      try { 
        segment0.split((-747));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
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
        segment0.push((Segment) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Segment segment0 = new Segment();
      // Undeclared exception!
      try { 
        segment0.writeTo((Segment) null, 2968);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
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
      segment1.writeTo(segment0, 3613);
      // Undeclared exception!
      try { 
        segment0.writeTo(segment1, 11587);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Segment segment0 = new Segment();
      byte[] byteArray0 = new byte[0];
      Segment segment1 = new Segment(byteArray0, 1181, 1181, true, true);
      segment0.prev = segment1;
      // Undeclared exception!
      try { 
        segment0.compact();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment1.writeTo(segment0, 3584);
      // Undeclared exception!
      try { 
        segment1.writeTo(segment0, 4644);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Segment segment0 = new Segment((byte[]) null, 2074, 2074, true, true);
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
  public void test20()  throws Throwable  {
      Segment segment0 = new Segment();
      SegmentPool.next = segment0;
      segment0.next = segment0;
      segment0.next.prev = segment0.next;
      Segment segment1 = new Segment();
      segment1.writeTo(SegmentPool.next, 4298);
      segment0.next.next = segment1;
      SegmentPool.next.split(4298);
      segment1.compact();
      assertFalse(segment1.equals((Object)segment0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.prev = segment0;
      // Undeclared exception!
      try { 
        segment0.prev.prev.compact();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Segment segment0 = new Segment();
      SegmentPool.next = segment0;
      segment0.next = SegmentPool.next;
      segment0.next.prev = SegmentPool.next;
      Segment segment1 = new Segment();
      segment1.writeTo(SegmentPool.next, 4400);
      Segment segment2 = SegmentPool.next.split(4400);
      segment0.next.compact();
      assertNotSame(segment0, segment2);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment0.writeTo(segment1, 908);
      // Undeclared exception!
      try { 
        segment1.split(196);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Segment segment0 = new Segment(byteArray0, 0, (byte) (-1), true, false);
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
  public void test25()  throws Throwable  {
      Segment segment0 = new Segment();
      SegmentPool.next = segment0;
      segment0.next = SegmentPool.next;
      segment0.next.prev = SegmentPool.next;
      Segment segment1 = new Segment();
      segment1.writeTo(SegmentPool.next, 4400);
      SegmentPool.next.split(4400);
      Segment segment2 = segment0.pop();
      assertFalse(segment2.equals((Object)segment0));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Segment segment0 = new Segment();
      SegmentPool.next = segment0;
      segment0.next = SegmentPool.next;
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
  public void test27()  throws Throwable  {
      Segment segment0 = new Segment();
      SegmentPool.next = segment0;
      segment0.next = segment0;
      segment0.next.prev = segment0.next;
      Segment segment1 = new Segment();
      segment1.writeTo(SegmentPool.next, 4298);
      SegmentPool.next.split(4298);
      // Undeclared exception!
      try { 
        segment1.writeTo(segment0.next, 4298);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }
}
