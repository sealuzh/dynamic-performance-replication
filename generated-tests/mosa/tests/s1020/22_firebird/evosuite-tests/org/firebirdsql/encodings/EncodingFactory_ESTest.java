/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 11:46:54 GMT 2018
 */

package org.firebirdsql.encodings;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.firebirdsql.encodings.Encoding;
import org.firebirdsql.encodings.EncodingFactory;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EncodingFactory_ESTest extends EncodingFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = EncodingFactory.getCharacterSetSize(4259);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      EncodingFactory.getEncoding("@Dc", "@Dc");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding((String) null, (String) null);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding((String) null, (char[]) null);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("[2?3_OBQ");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = EncodingFactory.getCharacterSetSize(46);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("Cp860");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp869");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_8");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = EncodingFactory.getJavaEncoding("DOS869");
      assertNotNull(string0);
      assertEquals("Cp869", string0);
      
      String string1 = EncodingFactory.getJavaEncodingForAlias("Cp869");
      assertNotNull(string1);
      assertEquals("Cp869", string1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("Cp869");
      String string0 = EncodingFactory.getJavaEncoding("Cp869");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("4lK");
      String string0 = EncodingFactory.getIscEncoding("4lK");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = EncodingFactory.getJavaEncodingForAlias((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EncodingFactory.getIscEncodingSize("7f=QZO0f");
      int int0 = EncodingFactory.getIscEncodingSize("7f=QZO0f");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = EncodingFactory.getIscEncodingSize((String) null);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = EncodingFactory.getJavaEncoding((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("Cp1257");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = EncodingFactory.getIscEncoding((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EncodingFactory.getIscEncodingSize("ISO8859_13");
      Encoding encoding0 = EncodingFactory.getEncoding("ISO8859_13");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("ISO8859_6");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp850", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_4");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp858");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp850");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp857");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp863");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("Cp737");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1254");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_1");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1252", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_3");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("Cp1253");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp857", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      EncodingFactory.getJavaEncoding("Cp1251");
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1251", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("isc_encoding_size.properties");
      char[] charArray0 = null;
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp737", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      EncodingFactory.getEncoding("Cp1252");
      String string0 = EncodingFactory.getJavaEncoding("Cp1252");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp869", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_2");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("NONE");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("Cp1255");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      EncodingFactory.createEncoding("Cp1250");
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1250", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1254", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_9", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp862");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      char[] charArray0 = new char[7];
      Encoding encoding0 = EncodingFactory.createEncoding("Cp865");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      EncodingFactory.getIscEncodingSize("bvK/c#sooIg");
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_4", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      EncodingFactory.getIscEncodingSize("ISO8859_8");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      Encoding encoding0 = EncodingFactory.getEncoding("Cp437", encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("NONE", (char[]) null);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp864");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String string0 = "Cp1256";
      char[] charArray0 = null;
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1256", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      Encoding encoding0 = EncodingFactory.getEncoding("ISO8859_8", encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp775");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_7");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1256");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp865", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp852");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1251");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      char[] charArray0 = new char[2];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_6", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_9");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp861", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("Cp866");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("isc_encodings.properties");
      Encoding encoding0 = EncodingFactory.getEncoding("Cp862", encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      Encoding encoding0 = EncodingFactory.getEncoding("Cp858", encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp866", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1257", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_13", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      EncodingFactory.getIscEncoding("Cp1255");
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1255", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp863", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      EncodingFactory.getIscEncodingSize("Cp437");
      Encoding encoding0 = EncodingFactory.getEncoding("Cp437");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_2", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("utf-8");
      Encoding encoding0 = EncodingFactory.createEncoding("utf-8");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp864", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_3", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("ISO8859_5", encodingFactory0.DEFAULT_MAPPING);
      Encoding encoding0 = EncodingFactory.getEncoding("vCp858");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("Cp861");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("ISO8859_5");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.createEncoding("isc_encodings.properties");
      Encoding encoding0 = EncodingFactory.getEncoding("Cp860", encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_1", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("isc_encoding_size.properties", encodingFactory0.DEFAULT_MAPPING);
      Encoding encoding0 = EncodingFactory.getEncoding("Cp852", encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("utf-8");
      char[] charArray0 = new char[1];
      charArray0[0] = '\\';
      Encoding encoding0 = EncodingFactory.getEncoding("utf-8", charArray0);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      Encoding encoding0 = EncodingFactory.getEncoding("ISO8859_7", encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      String string0 = "Cp775";
      EncodingFactory.getIscEncodingSize("Cp775");
      char[] charArray0 = null;
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp775", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1253", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}