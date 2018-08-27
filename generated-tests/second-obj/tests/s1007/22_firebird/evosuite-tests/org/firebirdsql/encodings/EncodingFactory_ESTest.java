/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 20:35:29 GMT 2018
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
      EncodingFactory encodingFactory0 = new EncodingFactory();
      Encoding encoding0 = EncodingFactory.getEncoding("isc_encoding_size.properties");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_3");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EncodingFactory.getIscEncodingSize((String) null);
      Encoding encoding0 = EncodingFactory.getEncoding((String) null, (String) null);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = EncodingFactory.getJavaEncodingForAlias((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = EncodingFactory.getCharacterSetSize(3158);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = EncodingFactory.getCharacterSetSize(3);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("isc_encodings.properties", encodingFactory0.DEFAULT_MAPPING);
      int int0 = EncodingFactory.getIscEncodingSize("isc_encoding_size.properties");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      String string0 = EncodingFactory.getJavaEncodingForAlias("isc_encodings.properties");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getJavaEncoding("isc_encoding_size.properties");
      Encoding encoding0 = EncodingFactory.getEncoding("isc_encodings.properties", encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("");
      String string0 = EncodingFactory.getJavaEncoding("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EncodingFactory.getIscEncodingSize("Cp1253");
      EncodingFactory.getCharacterSetSize(1);
      int int0 = EncodingFactory.getIscEncodingSize("Cp1253");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EncodingFactory.getIscEncodingSize("DOS737");
      Encoding encoding0 = EncodingFactory.getEncoding("DOS737");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EncodingFactory.getJavaEncoding("ISO8859_4");
      Encoding encoding0 = EncodingFactory.getEncoding("ISO-8859-4");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getJavaEncoding("isc_encoding_size.properties");
      Encoding encoding0 = EncodingFactory.getEncoding((String) null);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getJavaEncoding("isc_encoding_size.properties");
      String string0 = EncodingFactory.getJavaEncodingForAlias("isc_encodings.properties");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getJavaEncoding("isc_encoding_size.properties");
      String string0 = EncodingFactory.getIscEncoding("isc_encodings.properties");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getIscEncoding("isc_encodings.properties");
      Encoding encoding0 = EncodingFactory.getEncoding((String) null, encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EncodingFactory.getIscEncoding((String) null);
      String string0 = EncodingFactory.getJavaEncoding((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = "Cp1250";
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
  public void test19()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getJavaEncoding("isc_encoding_size.properties");
      EncodingFactory.getEncoding("Cp1254", encodingFactory0.DEFAULT_MAPPING);
      // Undeclared exception!
      EncodingFactory.getEncoding("Cp858", "");
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      char[] charArray0 = new char[2];
      EncodingFactory.getEncoding("Cp864");
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp864", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("Cp869");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("Cp1250");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = "ISO8859_4";
      EncodingFactory.getEncoding("ISO8859_4");
      // Undeclared exception!
      EncodingFactory.getTranslator("ISO8859_4");
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EncodingFactory.getEncoding("Cp864");
      int int0 = EncodingFactory.getIscEncodingSize("<ydl&`Llr1<hP!M");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      EncodingFactory.getJavaEncoding("ISO8859_4");
      EncodingFactory.getEncoding("c}'O4c:s&l#");
      char[] charArray0 = new char[1];
      charArray0[0] = 'Y';
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
  public void test26()  throws Throwable  {
      char[] charArray0 = new char[20];
      charArray0[0] = '2';
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp869", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("NONE");
      char[] charArray0 = new char[0];
      Encoding encoding1 = EncodingFactory.getEncoding("NONE", charArray0);
      assertFalse(encoding1.equals((Object)encoding0));
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[1] = 'H';
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp865", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      EncodingFactory.getEncoding("Cp1251");
      EncodingFactory encodingFactory0 = new EncodingFactory();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      EncodingFactory.getEncoding("Cp863");
      String string0 = EncodingFactory.getIscEncoding("Cp863");
      assertNotNull(string0);
      assertEquals("DOS863", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      EncodingFactory.getJavaEncoding((String) null);
      EncodingFactory encodingFactory0 = new EncodingFactory();
      Encoding encoding0 = EncodingFactory.getEncoding("Cp437", encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      Encoding encoding0 = EncodingFactory.getEncoding("Cp1251", encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1252");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      EncodingFactory.getEncoding("Cp1257");
      EncodingFactory encodingFactory0 = new EncodingFactory();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("Cp1254");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      EncodingFactory.getJavaEncoding("Cp737");
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp737", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      EncodingFactory.createEncoding("ISO8859_5");
      int int0 = EncodingFactory.getIscEncodingSize("utf-8");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("_r.m");
      EncodingFactory.getIscEncodingSize("_r.m");
      char[] charArray0 = new char[2];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1255", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_5", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      char[] charArray0 = new char[2];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_2", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      String string0 = "Cp863";
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
  public void test42()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp865");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_7");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      EncodingFactory.getEncoding("Cp860");
      EncodingFactory.getIscEncoding("org.firebirdsql.encodings.Encoding_Cp860");
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp860", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      int int0 = Byte.SIZE;
      char[] charArray0 = new char[8];
      charArray0[0] = '9';
      charArray0[1] = '9';
      EncodingFactory.getEncoding("Cp1257");
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
  public void test46()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.createEncoding("Cp866");
      // Undeclared exception!
      EncodingFactory.getTranslator("isc_encoding_size.properties");
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("UICODE_FSS");
      Encoding encoding0 = EncodingFactory.createEncoding("Cp857");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      EncodingFactory.getEncoding("ISO8859_9");
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_1");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String string0 = "ISO8859_3";
      char[] charArray0 = new char[6];
      charArray0[1] = '\u0000';
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_3", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("iso-8859-4");
      Encoding encoding0 = EncodingFactory.createEncoding("iso-8859-4");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_8", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      char[] charArray0 = new char[20];
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
  public void test53()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("Cp1256", (String) null);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      EncodingFactory.getIscEncoding("Cp862");
      char[] charArray0 = new char[1];
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
  public void test55()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[1] = 'l';
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
  public void test56()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("Cp1255");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
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
  public void test58()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[1] = '#';
      charArray0[2] = 'e';
      charArray0[3] = 'n';
      EncodingFactory.getEncoding("<*$c **@7nrf@bEgZK0", charArray0);
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
  public void test59()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[3] = 'Y';
      charArray0[2] = 'Y';
      charArray0[0] = 'Y';
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
  public void test60()  throws Throwable  {
      char[] charArray0 = new char[8];
      EncodingFactory.getEncoding("org.firebirdsql.encodings.Encoding_Cp858", charArray0);
      String string0 = "ISO8859_3";
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
  public void test61()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("Cp437");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      EncodingFactory.createEncoding("Cp861");
      String string0 = EncodingFactory.getJavaEncoding("Cp861");
      assertNull(string0);
      
      String string1 = EncodingFactory.getIscEncoding("Cp861");
      assertNotNull(string1);
      assertEquals("DOS861", string1);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_1", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      Encoding encoding0 = EncodingFactory.getEncoding("Cp1252", encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      String string0 = EncodingFactory.ISC_ENCODINGS_RESOURCE;
      EncodingFactory.getJavaEncoding("isc_encodings.properties");
      EncodingFactory.getJavaEncodingForAlias("isc_encodings.properties");
      Encoding encoding0 = EncodingFactory.getEncoding("Cp775");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp866", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      EncodingFactory.createEncoding("Cp861");
      EncodingFactory.getJavaEncoding("Cp861");
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
  public void test68()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("Cp737");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp852");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("ISO8859_6");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      char[] charArray0 = new char[6];
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
  public void test72()  throws Throwable  {
      EncodingFactory.getIscEncodingSize("Cp1253");
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1253");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      EncodingFactory.getEncoding("p437");
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
  public void test74()  throws Throwable  {
      EncodingFactory.createEncoding("Cp862");
      int int0 = EncodingFactory.getIscEncodingSize("E-");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      String string0 = "xKqx}ET}O4L%D%Jh:)";
      EncodingFactory.getIscEncodingSize("xKqx}ET}O4L%D%Jh:)");
      String string1 = "Cp857";
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
  public void test76()  throws Throwable  {
      EncodingFactory.getIscEncoding("Cp850");
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp850", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_2");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_13");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("ISO8859_8");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      Encoding encoding0 = EncodingFactory.createEncoding("Cp850");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      int int0 = Byte.SIZE;
      char[] charArray0 = new char[8];
      charArray0[7] = '9';
      EncodingFactory.getEncoding("Cp858");
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp858", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("Cp861");
      char[] charArray0 = new char[6];
      charArray0[0] = 'K';
      charArray0[1] = 'K';
      charArray0[2] = ';';
      charArray0[4] = '\u0000';
      EncodingFactory.getEncoding("utf-8", charArray0);
      String string0 = EncodingFactory.getJavaEncoding("*InhmNr~Lo)");
      assertNull(string0);
  }
}