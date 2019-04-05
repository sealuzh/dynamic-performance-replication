/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 22:06:11 GMT 2019
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
      Segment segment1 = new Segment();
      segment1.limit = 5327;
      segment0.writeTo(segment1, 1024);
      assertFalse(segment0.equals((Object)segment1));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Segment segment0 = new Segment(byteArray0, (-1986), 3341, true, true);
      // Undeclared exception!
      try { 
        segment0.split(3341);
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
      byte[] byteArray0 = new byte[5];
      Segment segment1 = new Segment(byteArray0, 8192, (byte)13, false, true);
      segment0.next = segment1;
      Segment segment2 = segment0.push(segment1);
      assertSame(segment2, segment1);
      assertNotNull(segment2);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Segment segment0 = new Segment(byteArray0, (-1569), 1704, false, false);
      Segment segment1 = segment0.unsharedCopy();
      assertFalse(segment1.equals((Object)segment0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      Segment segment0 = new Segment(byteArray0, (-3302), (byte) (-86), false, false);
      segment0.prev = segment0;
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
      Segment segment1 = segment0.sharedCopy();
      assertNotSame(segment0, segment1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Segment segment0 = new Segment(byteArray0, (byte)0, (byte)0, true, false);
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
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      Segment segment0 = new Segment(byteArray0, 146, 863, true, false);
      // Undeclared exception!
      try { 
        segment0.writeTo((Segment) null, (byte)0);
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
      byte[] byteArray0 = new byte[0];
      Segment segment0 = new Segment(byteArray0, (-1569), 1704, false, false);
      Segment segment1 = new Segment(byteArray0, (-1569), 8192, false, true);
      segment0.prev = segment1;
      // Undeclared exception!
      try { 
        segment0.writeTo(segment0.prev, (-1569));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment1.limit = 5327;
      // Undeclared exception!
      try { 
        segment0.writeTo(segment1, 3155);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Segment segment0 = new Segment();
      byte[] byteArray0 = new byte[5];
      Segment segment1 = new Segment(byteArray0, 8192, (byte)36, false, true);
      // Undeclared exception!
      try { 
        segment0.writeTo(segment1, 8192);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Segment segment0 = new Segment();
      byte[] byteArray0 = new byte[4];
      Segment segment1 = new Segment(byteArray0, (byte) (-1), 8192, true, true);
      // Undeclared exception!
      try { 
        segment0.writeTo(segment1, 8192);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Segment segment0 = new Segment();
      byte[] byteArray0 = new byte[8];
      Segment segment1 = new Segment(byteArray0, (byte) (-1), 1666, false, false);
      // Undeclared exception!
      try { 
        segment0.writeTo(segment1, (byte) (-1));
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
      byte[] byteArray0 = new byte[0];
      Segment segment0 = new Segment(byteArray0, (-1569), 1704, false, false);
      Segment segment1 = new Segment(byteArray0, (-1569), 8192, false, true);
      segment0.prev = segment1;
      segment0.compact();
      assertFalse(segment0.equals((Object)segment1));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Segment segment0 = new Segment(byteArray0, (-1), (-3), false, false);
      Segment segment1 = new Segment();
      segment0.prev = segment1;
      segment0.prev.shared = true;
      // Undeclared exception!
      try { 
        segment0.compact();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Segment segment0 = new Segment();
      byte[] byteArray0 = new byte[5];
      segment0.next = segment0;
      Segment segment1 = new Segment(byteArray0, (-2462), (byte) (-3), false, false);
      Segment segment2 = segment0.push(segment1);
      segment0.compact();
      assertNotSame(segment0, segment2);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      Segment segment0 = new Segment(byteArray0, (byte) (-28), (byte)0, true, true);
      SegmentPool.next = segment0;
      SegmentPool.next.prev = segment0;
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
  public void test17()  throws Throwable  {
      Segment segment0 = new Segment();
      byte[] byteArray0 = new byte[5];
      Segment segment1 = new Segment(byteArray0, 3503, 3503, false, true);
      segment0.prev = segment1;
      // Undeclared exception!
      try { 
        segment0.prev.compact();
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
      byte[] byteArray0 = new byte[1];
      Segment segment0 = new Segment(byteArray0, 1, 5115, false, false);
      // Undeclared exception!
      try { 
        segment0.split(1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Segment segment0 = new Segment();
      // Undeclared exception!
      try { 
        segment0.split(1795);
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
      byte[] byteArray0 = new byte[3];
      Segment segment0 = new Segment(byteArray0, (byte)36, 0, false, true);
      // Undeclared exception!
      try { 
        segment0.split((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Segment segment0 = new Segment();
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
  public void test22()  throws Throwable  {
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

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.limit = 5327;
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
}
