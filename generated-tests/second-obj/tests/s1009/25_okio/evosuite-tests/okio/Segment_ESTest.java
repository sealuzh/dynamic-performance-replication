/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 22:09:45 GMT 2018
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
      Segment segment1 = segment0.unsharedCopy();
      SegmentPool.next = segment0;
      SegmentPool.next.prev = segment1;
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
  public void test01()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.pos = 0;
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
  public void test02()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment((byte[]) null, 2534, 2534, true, false);
      // Undeclared exception!
      try { 
        segment0.writeTo(segment1, 2534);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.sharedCopy();
      // Undeclared exception!
      try { 
        segment0.split(1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Segment segment0 = new Segment(byteArray0, (byte)0, (byte)0, false, false);
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
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte)6;
      Segment segment0 = new Segment(byteArray0, (byte)0, (byte)6, false, false);
      segment0.prev = segment0;
      SegmentPool.byteCount = (long) (byte)6;
      // Undeclared exception!
      try { 
        segment0.split((byte)6);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      // Undeclared exception!
      try { 
        segment1.writeTo(segment0, 8248);
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
      byte[] byteArray0 = new byte[5];
      int int0 = (-3621);
      SegmentPool.next = null;
      Segment segment1 = new Segment(byteArray0, (-3621), 4560, true, true);
      // Undeclared exception!
      try { 
        segment0.writeTo(segment1, 4557);
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
      Segment segment0 = new Segment();
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte)1;
      byteArray0[2] = (byte) (-123);
      byteArray0[3] = (byte) (-33);
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)66;
      byteArray0[6] = (byte) (-20);
      Segment segment1 = new Segment(byteArray0, 1416, (byte)0, false, false);
      segment0.prev = segment1;
      segment0.compact();
      segment0.compact();
      assertNotSame(segment0, segment1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.limit = 8248;
      segment0.owner = true;
      Segment segment1 = new Segment();
      segment0.prev = segment1;
      segment1.next = segment0;
      Segment segment2 = segment0.split(1553);
      segment2.compact();
      segment0.compact();
      assertNotSame(segment0, segment2);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte)107;
      byteArray0[1] = (byte)107;
      boolean boolean0 = true;
      Segment segment0 = new Segment(byteArray0, (byte)0, (byte)107, true, true);
      Segment segment1 = new Segment();
      segment0.prev = segment1;
      segment0.prev.shared = true;
      segment1.limit = (int) (byte)107;
      // Undeclared exception!
      try { 
        segment0.compact();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.limit = 8248;
      segment0.owner = true;
      Segment segment1 = new Segment();
      segment0.prev = segment1;
      segment0.prev.pos = 8248;
      segment1.next = segment0;
      // Undeclared exception!
      try { 
        segment1.writeTo(segment0.prev, 8248);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }
}