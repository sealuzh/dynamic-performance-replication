/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 11:52:51 GMT 2019
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
      byte[] byteArray0 = new byte[1];
      Segment segment0 = new Segment(byteArray0, (byte)1, 8192, false, false);
      Segment segment1 = segment0.unsharedCopy();
      segment1.pos = 443;
      // Undeclared exception!
      try { 
        segment0.writeTo(segment1, (byte)1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Segment segment0 = new Segment();
      byte[] byteArray0 = new byte[0];
      Segment segment1 = new Segment(byteArray0, (-58), 0, true, false);
      segment0.prev = segment1;
      // Undeclared exception!
      try { 
        segment0.prev.push(segment0);
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
      byte[] byteArray0 = new byte[2];
      Segment segment0 = new Segment(byteArray0, (-1944), (byte) (-105), false, false);
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
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Segment segment0 = new Segment(byteArray0, (-434), (-434), false, false);
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
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Segment segment0 = new Segment(byteArray0, (byte)1, 8192, false, false);
      Segment segment1 = segment0.unsharedCopy();
      // Undeclared exception!
      try { 
        segment0.writeTo(segment1, (byte)1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.limit = 5182;
      // Undeclared exception!
      try { 
        segment0.writeTo(segment0, 4163);
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
      Segment segment1 = new Segment((byte[]) null, (-776), (-776), false, false);
      // Undeclared exception!
      try { 
        segment0.writeTo(segment1, (-1952));
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
      byte[] byteArray0 = new byte[2];
      Segment segment1 = new Segment(byteArray0, (byte)33, (-949), true, true);
      segment0.prev = segment1;
      // Undeclared exception!
      try { 
        segment0.compact();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Segment segment0 = new Segment();
      byte[] byteArray0 = new byte[0];
      Segment segment1 = new Segment(byteArray0, (-58), 0, true, false);
      segment0.prev = segment1;
      segment0.compact();
      assertNotSame(segment0, segment1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Segment segment0 = new Segment(byteArray0, (-1944), (byte) (-105), false, false);
      Segment segment1 = new Segment(byteArray0, (byte) (-105), 7750, false, true);
      segment0.prev = segment1;
      segment0.compact();
      assertNotSame(segment0, segment1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      Segment segment0 = new Segment(byteArray0, (byte) (-49), (byte) (-123), true, true);
      SegmentPool.next = segment0;
      SegmentPool.next.prev = segment0;
      // Undeclared exception!
      try { 
        SegmentPool.next.prev.compact();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Segment segment0 = new Segment(byteArray0, (-1944), (byte) (-105), false, false);
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
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      Segment segment0 = new Segment(byteArray0, (-510), (byte) (-38), false, false);
      // Undeclared exception!
      try { 
        segment0.split(83);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Segment segment0 = new Segment();
      // Undeclared exception!
      try { 
        segment0.split(7750);
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
      byte[] byteArray0 = new byte[7];
      Segment segment0 = new Segment(byteArray0, (-1), 1661, false, true);
      // Undeclared exception!
      try { 
        segment0.split(1073);
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
      byte[] byteArray0 = new byte[6];
      Segment segment0 = new Segment(byteArray0, 7582, 1692, false, false);
      // Undeclared exception!
      try { 
        segment0.split((-109));
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
      segment1.next = segment0.prev;
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
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      Segment segment0 = new Segment(byteArray0, (-1), 1661, false, true);
      Segment segment1 = segment0.unsharedCopy();
      assertNotSame(segment1, segment0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Segment segment0 = new Segment();
      segment0.prev = segment0;
      // Undeclared exception!
      try { 
        segment0.prev.push(segment0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = segment0.sharedCopy();
      assertNotSame(segment1, segment0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Segment segment0 = new Segment((byte[]) null, 8192, 8192, true, true);
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
}