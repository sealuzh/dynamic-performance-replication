/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 10:46:54 GMT 2019
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
      segment0.writeTo(segment0, 8192);
      segment0.next = segment0;
      Segment segment1 = segment0.push(segment0);
      segment1.pos = 2040;
      segment1.writeTo(segment1, 1);
      assertSame(segment1, segment0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.writeTo(segment0, 8178);
      segment0.writeTo(segment0, 474);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.writeTo(segment0, 8192);
      Segment segment1 = new Segment();
      segment1.writeTo(segment0, 1024);
      assertFalse(segment0.equals((Object)segment1));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment0.writeTo(segment1, 8192);
      Segment segment2 = new Segment();
      segment2.prev = segment1;
      // Undeclared exception!
      try { 
        segment2.compact();
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
      segment1.prev = segment0;
      segment0.pos = 1024;
      // Undeclared exception!
      try { 
        segment1.compact();
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
      byte[] byteArray0 = new byte[18];
      Segment segment0 = new Segment();
      segment0.next = segment0;
      Segment segment1 = new Segment(byteArray0, (byte)0, 2039, true, true);
      Segment segment2 = segment0.push(segment1);
      segment2.prev = segment0.next;
      Segment segment3 = segment0.next.split(2039);
      assertNotSame(segment3, segment1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Segment segment0 = new Segment(byteArray0, 1024, 2982, false, false);
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
  public void test07()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment1.next = segment0;
      Segment segment2 = segment1.sharedCopy();
      Segment segment3 = segment1.push(segment2);
      assertSame(segment3, segment2);
      
      SegmentPool.next = segment3;
      Segment segment4 = SegmentPool.next.pop();
      assertSame(segment4, segment0);
      assertNotNull(segment4);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Segment segment0 = new Segment();
      // Undeclared exception!
      try { 
        segment0.writeTo(segment0, (-988));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Segment segment0 = new Segment(byteArray0, (byte) (-47), (byte) (-47), false, false);
      // Undeclared exception!
      try { 
        segment0.writeTo((Segment) null, 2775);
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
      byte[] byteArray0 = new byte[20];
      Segment segment0 = new Segment(byteArray0, 1157, (-136), true, true);
      segment0.next = segment0;
      Segment segment1 = new Segment(byteArray0, (byte)0, 2039, true, true);
      segment0.push(segment1);
      // Undeclared exception!
      try { 
        segment0.next.split((byte)84);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment1.prev = segment0;
      segment1.pos = 1344;
      // Undeclared exception!
      try { 
        segment1.compact();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      Segment segment0 = new Segment();
      // Undeclared exception!
      try { 
        segment0.writeTo(segment0, 8217);
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
      Segment segment0 = new Segment();
      Segment segment1 = new Segment(byteArray0, (-1), 3587, true, true);
      // Undeclared exception!
      try { 
        segment0.writeTo(segment1, 4664);
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
      segment0.writeTo(segment0, 8192);
      segment0.writeTo(segment0, 8192);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment0.writeTo(segment1, 8192);
      Segment segment2 = new Segment();
      segment2.limit = 1295;
      segment2.prev = segment1;
      segment2.compact();
      assertFalse(segment2.equals((Object)segment0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = segment0.unsharedCopy();
      segment1.next = segment0;
      Segment segment2 = segment1.sharedCopy();
      Segment segment3 = segment1.push(segment2);
      segment3.compact();
      assertFalse(segment3.equals((Object)segment0));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment1.next = segment0;
      Segment segment2 = segment1.sharedCopy();
      segment1.push(segment2);
      segment0.compact();
      assertFalse(segment0.equals((Object)segment2));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
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
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[18];
      Segment segment0 = new Segment();
      segment0.next = segment0;
      Segment segment1 = new Segment(byteArray0, (byte)0, 2039, true, true);
      Segment segment2 = segment0.push(segment1);
      segment0.next.split(2039);
      assertNotSame(segment0, segment2);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.next = segment0;
      // Undeclared exception!
      try { 
        segment0.next.split(2039);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Segment segment0 = new Segment();
      // Undeclared exception!
      try { 
        segment0.split((-5296));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = segment0.unsharedCopy();
      segment1.next = segment0;
      segment1.next.next = segment0;
      Segment segment2 = segment1.sharedCopy();
      segment0.push(segment2);
      segment1.next.next.compact();
      Segment segment3 = segment1.next.next.pop();
      assertNull(segment3);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[20];
      Segment segment0 = new Segment(byteArray0, 1157, (-123), true, true);
      Segment segment1 = segment0.unsharedCopy();
      assertNotSame(segment0, segment1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Segment segment0 = new Segment();
      // Undeclared exception!
      try { 
        segment0.push(segment0.next);
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
      Segment segment1 = segment0.sharedCopy();
      // Undeclared exception!
      try { 
        segment0.writeTo(segment1, (byte)0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }
}