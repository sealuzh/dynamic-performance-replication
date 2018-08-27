/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 18:58:12 GMT 2018
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
      int int0 = EncodingFactory.getCharacterSetSize(1160);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = EncodingFactory.getCharacterSetSize(6);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      EncodingFactory.getEncoding("Cp1255", "Cp1255");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("Cp864");
      String string0 = EncodingFactory.getJavaEncodingForAlias("Cp864");
      assertEquals("Cp864", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EncodingFactory.getIscEncodingSize("HY009");
      int int0 = EncodingFactory.getIscEncodingSize("HY009");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EncodingFactory.getJavaEncoding("UNICODE_FSS");
      String string0 = EncodingFactory.getJavaEncoding("UNICODE_FSS");
      assertEquals("UTF-8", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = EncodingFactory.getIscEncoding("Cp86");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getJavaEncodingForAlias("isc_encoding_size.properties");
      String string0 = EncodingFactory.getIscEncoding("isc_encoding_size.properties");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      Encoding encoding0 = EncodingFactory.getEncoding("isc_encoding_size.properties", encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("Cp866");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = EncodingFactory.getJavaEncodingForAlias((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      Encoding encoding0 = EncodingFactory.getEncoding((String) null, encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = EncodingFactory.getJavaEncoding((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getJavaEncodingForAlias("isc_encodings.properties");
      Encoding encoding0 = EncodingFactory.getEncoding("ISO8859_1", encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = EncodingFactory.getIscEncodingSize((String) null);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("Cp737");
      Encoding encoding0 = EncodingFactory.createEncoding("Cp737");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding((String) null, (String) null);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = EncodingFactory.getIscEncoding((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1250");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      char[] charArray0 = new char[13];
      charArray0[0] = 'A';
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp862", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("Cp437");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_6");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EncodingFactory.getIscEncodingSize("Xl|+6rDuCZU<");
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1250", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("NONE");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      Encoding encoding0 = EncodingFactory.createEncoding("Cp860");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("Cp869");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = "Cp775";
      char[] charArray0 = new char[2];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp775", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp775");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp852", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("Cp862");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      String string0 = EncodingFactory.defaultEncoding;
      Encoding encoding0 = EncodingFactory.getEncoding("Cp866", encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      EncodingFactory.getIscEncodingSize("ISO8859_7");
      String string0 = "Cp1256";
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1256", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("ISO8859_1");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1256");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      EncodingFactory.getIscEncodingSize("Cp437");
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp437", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp852");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = '4';
      charArray0[1] = '<';
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp861", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("Cp1252");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp864");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      Encoding encoding0 = EncodingFactory.getEncoding("Cp860", encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      EncodingFactory.getJavaEncoding("Cp1257");
      Encoding encoding0 = EncodingFactory.getEncoding("Cp1257");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("Cp850");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("ISO8859_3");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      EncodingFactory.getJavaEncoding("UNICODE_FSS");
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
  public void test45()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1253");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      Encoding encoding0 = EncodingFactory.getEncoding("ISO8859_9", encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1254");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      EncodingFactory.createEncoding("ISO8859_4");
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
  public void test49()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("D,OS857");
      char[] charArray0 = new char[0];
      EncodingFactory.getEncoding((String) null, charArray0);
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
  public void test50()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      Encoding encoding0 = EncodingFactory.getEncoding("Cp869", encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
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
  public void test52()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("ISO8859_2");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("Cp863");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      char[] charArray0 = new char[6];
      EncodingFactory.getEncoding("NONE", charArray0);
      // Undeclared exception!
      EncodingFactory.getTranslator("NONE");
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("ISO8859_9");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
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
  public void test57()  throws Throwable  {
      char[] charArray0 = new char[1];
      String string0 = "ISO8859_5";
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_5", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("ISO8859_13");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      EncodingFactory.getIscEncodingSize("ISO8859_7");
      EncodingFactory.getEncoding("ISO8859_7");
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_7", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_8", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp865");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1253", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("UTF-8");
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
  public void test64()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getJavaEncodingForAlias("isc_encodings.properties");
      Encoding encoding0 = EncodingFactory.getEncoding("Cp1257", encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      EncodingFactory.getIscEncodingSize("ISO8859_5");
      Encoding encoding0 = EncodingFactory.getEncoding("ISO8859_5");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.createEncoding("isc_encoding_size.properties");
      Encoding encoding0 = EncodingFactory.getEncoding("Cp858", encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.createEncoding("isc_encodings.properties");
      Encoding encoding0 = EncodingFactory.getEncoding("Cp1252", encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("Cp861");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
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
  public void test70()  throws Throwable  {
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
  public void test71()  throws Throwable  {
      EncodingFactory.createEncoding("Cp1251");
      EncodingFactory encodingFactory0 = new EncodingFactory();
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getJavaEncodingForAlias("Cp869");
      Encoding encoding0 = EncodingFactory.getEncoding("Cp1251", encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      Encoding encoding0 = EncodingFactory.getEncoding("Cp850", encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp858");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_8");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      Encoding encoding0 = EncodingFactory.getEncoding("ISO8859_2", encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("Cp1255");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("Cp857");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      Encoding encoding0 = EncodingFactory.getEncoding("ISO8859_13", encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      EncodingFactory.getIscEncodingSize("Cp852");
      EncodingFactory.getCharacterSetSize(1);
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
  public void test81()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("utf-8");
      Encoding encoding0 = EncodingFactory.getEncoding("utf-8", (char[]) null);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("utf-8");
      Encoding encoding0 = EncodingFactory.getEncoding("utf-8");
      assertNotNull(encoding0);
  }
}