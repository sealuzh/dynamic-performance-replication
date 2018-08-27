/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 23:02:56 GMT 2018
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
      Segment segment1 = new Segment((byte[]) null, 1292, 1292, true, true);
      boolean boolean0 = false;
      segment0.prev = segment1;
      // Undeclared exception!
      try { 
        segment0.split(1292);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Segment segment0 = new Segment();
      SegmentPool.byteCount = 0L;
      Segment segment1 = segment0.unsharedCopy();
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
  public void test02()  throws Throwable  {
      Segment segment0 = new Segment();
      byte[] byteArray0 = new byte[0];
      Segment segment1 = new Segment(byteArray0, (-562), 2248, true, true);
      segment1.pos = (-562);
      segment1.prev = segment0;
      // Undeclared exception!
      try { 
        segment1.compact();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = segment0.sharedCopy();
      // Undeclared exception!
      try { 
        segment1.pop();
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
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-36);
      byteArray0[1] = (byte)110;
      Segment segment0 = new Segment();
      Segment segment1 = new Segment(byteArray0, (byte)110, (byte) (-36), true, false);
      // Undeclared exception!
      try { 
        segment0.writeTo(segment1, (-168));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
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
  public void test06()  throws Throwable  {
      Segment segment0 = new Segment();
      SegmentPool.byteCount = 0L;
      Segment segment1 = segment0.unsharedCopy();
      segment1.prev = segment0;
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)40;
      Segment segment2 = new Segment(byteArray0, (byte)40, 8192, true, false);
      segment1.prev = segment2;
      Segment segment3 = new Segment();
      segment1.compact();
      assertNotSame(segment0, segment1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Segment segment0 = new Segment(byteArray0, 0, 0, true, false);
      segment0.owner = true;
      Segment segment1 = new Segment();
      Segment segment2 = new Segment();
      SegmentPool.next = segment2;
      SegmentPool.next.prev = segment0;
      // Undeclared exception!
      try { 
        SegmentPool.next.compact();
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
      Segment segment0 = new Segment();
      Segment segment1 = segment0.unsharedCopy();
      SegmentPool.next = segment0;
      segment1.prev = segment1;
      Segment segment2 = new Segment();
      // Undeclared exception!
      try { 
        segment1.compact();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = 1352;
      int int1 = (-217);
      boolean boolean0 = false;
      boolean boolean1 = true;
      Segment segment0 = new Segment(byteArray0, (-1153), 525, true, true);
      // Undeclared exception!
      try { 
        segment0.split(1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Segment segment0 = new Segment(byteArray0, (-2912), (-217), false, false);
      // Undeclared exception!
      try { 
        segment0.split(1352);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment1.writeTo(segment0, 885);
      segment0.writeTo(segment1, 4500);
      byte[] byteArray0 = new byte[1];
      Segment segment2 = new Segment(byteArray0, 2095, 4498, false, true);
      segment0.unsharedCopy();
      // Undeclared exception!
      try { 
        segment0.writeTo(segment1, 4500);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment1.writeTo(segment0, 2249);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-70);
      segment1.writeTo(segment0, 4498);
      Segment segment2 = new Segment(byteArray0, 2095, 4498, true, false);
      Segment segment3 = segment0.unsharedCopy();
      // Undeclared exception!
      try { 
        segment3.writeTo(segment0, 2000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment1.writeTo(segment0, 2249);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-70);
      segment1.writeTo(segment0, 4498);
      segment0.shared = true;
      Segment segment2 = new Segment(byteArray0, 2095, 4498, true, false);
      Segment segment3 = segment0.unsharedCopy();
      // Undeclared exception!
      try { 
        segment3.writeTo(segment0, 2000);
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
      segment0.owner = true;
      segment0.writeTo(segment0, 0);
      Segment segment1 = new Segment();
      SegmentPool.next = segment1;
      SegmentPool.next.next = segment1;
      segment0.limit = 1;
      SegmentPool.next.sharedCopy();
      SegmentPool.next.prev = segment0;
      SegmentPool.next.compact();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      int int0 = 1335;
      segment0.writeTo(segment1, 1335);
      byte[] byteArray0 = new byte[0];
      int int1 = 7681;
      boolean boolean0 = true;
      Segment segment2 = new Segment(byteArray0, (-1), 7681, true, true);
      segment2.pos = (-1);
      segment2.prev = segment1;
      segment2.compact();
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
}