/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 16:26:24 GMT 2018
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
      // Undeclared exception!
      try { 
        segment0.split(125);
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
      segment0.unsharedCopy();
      // Undeclared exception!
      try { 
        segment0.split(3156);
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
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-33);
      Segment segment0 = new Segment(byteArray0, (-2205), (-2205), false, false);
      SegmentPool.next = segment0;
      SegmentPool.next.next = segment0;
      SegmentPool.next.next = segment0;
      SegmentPool.next.next.pos = (-2205);
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
      Segment segment0 = new Segment();
      // Undeclared exception!
      try { 
        segment0.split((-2089));
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
      Segment segment0 = new Segment();
      byte[] byteArray0 = new byte[0];
      segment0.limit = 1921;
      Segment segment1 = new Segment(byteArray0, 1921, 1921, false, false);
      // Undeclared exception!
      try { 
        segment0.writeTo(segment1, 1921);
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
      Segment segment1 = segment0.sharedCopy();
      segment1.prev = segment0;
      int int0 = 1;
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
  public void test06()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment1.prev = segment0;
      segment0.writeTo(segment1, 1214);
      segment0.writeTo(segment1, 1214);
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
  public void test07()  throws Throwable  {
      Segment segment0 = new Segment();
      Segment segment1 = new Segment();
      segment1.prev = segment1;
      segment0.sharedCopy();
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
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte)120;
      byteArray0[1] = (byte)120;
      Segment segment0 = new Segment(byteArray0, (byte)0, (byte)120, true, true);
      Segment segment1 = new Segment();
      // Undeclared exception!
      try { 
        segment0.writeTo(segment1, 8196);
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
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte)120;
      byteArray0[1] = (byte)120;
      Segment segment0 = new Segment(byteArray0, (byte)120, 1044, true, true);
      Segment segment1 = new Segment();
      // Undeclared exception!
      try { 
        segment1.writeTo(segment0, 8196);
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
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte)125;
      byteArray0[1] = (byte)125;
      byteArray0[0] = (byte)125;
      byteArray0[3] = (byte)0;
      byte[] byteArray1 = new byte[3];
      Segment segment0 = new Segment(byteArray1, (byte)0, 3996, true, true);
      int int0 = 1;
      // Undeclared exception!
      try { 
        segment0.split(1);
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
      SegmentPool.byteCount = (-2590L);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)1;
      byteArray0[4] = (byte) (-124);
      byteArray0[5] = (byte)114;
      Segment segment1 = new Segment(byteArray0, 12243, (byte)0, false, false);
      segment0.prev = segment1;
      segment0.compact();
      // Undeclared exception!
      try { 
        segment0.prev.writeTo(segment0, 1214);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte)125;
      byteArray0[1] = (byte)125;
      byteArray0[0] = (byte)125;
      byteArray0[3] = (byte)0;
      byte[] byteArray1 = new byte[3];
      Segment segment0 = new Segment(byteArray1, (byte)0, 3996, true, true);
      // Undeclared exception!
      try { 
        segment0.split(2154);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
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
      segment1.prev = segment0;
      segment0.writeTo(segment1.prev, 1243);
      segment0.writeTo(segment1, 1243);
      SegmentPool.next = segment1.prev;
      segment1.writeTo(segment1, 2042);
      segment0.writeTo(segment1, 1546);
      Segment segment2 = segment0.sharedCopy();
      segment2.prev = segment1.prev;
      segment2.prev.limit = 2042;
      segment1.writeTo(segment1, 1243);
      segment0.writeTo(segment1, 3592);
      // Undeclared exception!
      try { 
        segment2.prev.compact();
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
      Segment segment1 = new Segment();
      Segment segment2 = new Segment();
      segment1.prev = segment0;
      segment2.writeTo(segment1.prev, 1243);
      segment2.writeTo(segment1, 1243);
      segment2.writeTo(segment1, 2042);
      segment2.writeTo(segment1, 2042);
      Segment segment3 = segment0.sharedCopy();
      segment3.prev = segment1.prev;
      segment3.prev.limit = 2042;
      segment2.writeTo(segment1, 1243);
      segment1.compact();
      // Undeclared exception!
      try { 
        segment3.prev.push(segment1.prev);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Segment", e);
      }
  }
}
