/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 10:32:14 GMT 2018
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
      EncodingFactory.getJavaEncodingForAlias("isc_encodings.properties");
      String string0 = EncodingFactory.getIscEncoding("isc_encodings.properties");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      // Undeclared exception!
      EncodingFactory.getEncoding("*},@^o!dqUUS)", "isc_encoding_size.properties");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      Encoding encoding0 = EncodingFactory.getEncoding("isc_encoding_size.properties");
      Encoding encoding1 = EncodingFactory.getEncoding("isc_encodings.properties", encodingFactory0.DEFAULT_MAPPING);
      assertNotSame(encoding1, encoding0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getJavaEncodingForAlias("isc_encodings.properties");
      String string0 = EncodingFactory.getJavaEncoding("isc_encoding_size.properties");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[1] = '\u0000';
      String string0 = "P:ZXmc{F?iEU8C";
      EncodingFactory.getEncoding("Cp865");
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
  public void test05()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding((String) null, (String) null);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      Encoding encoding0 = EncodingFactory.getEncoding("isc_encoding_size.properties");
      Encoding encoding1 = EncodingFactory.getEncoding((String) null, encodingFactory0.DEFAULT_MAPPING);
      assertNotSame(encoding1, encoding0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EncodingFactory.getJavaEncoding("DOS860");
      // Undeclared exception!
      EncodingFactory.getEncoding("DOS860", "DOS860");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = EncodingFactory.getIscEncodingSize("ISO8859_3");
      assertEquals(1, int0);
      
      EncodingFactory.createEncoding("ISO8859_3");
      int int1 = EncodingFactory.getCharacterSetSize(1);
      assertTrue(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EncodingFactory.getIscEncodingSize("ISO8859_3");
      int int0 = EncodingFactory.getIscEncodingSize("ISO8859_3");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EncodingFactory.getIscEncoding("Cp869");
      EncodingFactory.getEncoding("DOS869");
      String string0 = EncodingFactory.getJavaEncodingForAlias("DOS869");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EncodingFactory.getIscEncoding((String) null);
      EncodingFactory.getIscEncodingSize((String) null);
      char[] charArray0 = new char[0];
      Encoding encoding0 = EncodingFactory.getEncoding((String) null, charArray0);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EncodingFactory.getIscEncodingSize("Cp865");
      char[] charArray0 = new char[3];
      charArray0[0] = '/';
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
  public void test13()  throws Throwable  {
      EncodingFactory.getIscEncodingSize("Cp1252");
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1252");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EncodingFactory.getEncoding("ISO8859_4");
      // Undeclared exception!
      EncodingFactory.getEncoding("ISO8859_4", ";I~Q.__M(!9L");
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EncodingFactory.getEncoding("Cp775");
      EncodingFactory.getCharacterSetSize((-237031238));
      // Undeclared exception!
      EncodingFactory.getTranslator("Cp775");
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      char[] charArray0 = new char[12];
      charArray0[3] = 'f';
      String string0 = "ISO8859_4";
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
  public void test17()  throws Throwable  {
      EncodingFactory.getJavaEncoding("Cp1250");
      EncodingFactory.getEncoding((String) null);
      char[] charArray0 = new char[7];
      charArray0[0] = '';
      charArray0[1] = '(';
      charArray0[2] = 'm';
      charArray0[4] = '>';
      charArray0[5] = 'O';
      charArray0[6] = '>';
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
  public void test18()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("Cp861", encodingFactory0.DEFAULT_MAPPING);
      String string0 = EncodingFactory.ISC_ENCODING_SIZE_RESOURCE;
      assertEquals("isc_encoding_size.properties", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EncodingFactory.createEncoding("HY000");
      int int0 = Byte.BYTES;
      String string0 = "R";
      EncodingFactory.getJavaEncodingForAlias("R");
      EncodingFactory.getIscEncoding("DOS862");
      String string1 = "ISO8859_4";
      char[] charArray0 = new char[1];
      charArray0[0] = 'I';
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
  public void test20()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp858");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EncodingFactory.getEncoding("NONE", (char[]) null);
      String string0 = EncodingFactory.getJavaEncoding((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[1] = 'u';
      EncodingFactory.getEncoding("HuYOq<^L>=x", charArray0);
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
  public void test23()  throws Throwable  {
      EncodingFactory.createEncoding("ISO8859_9");
      int int0 = EncodingFactory.getIscEncodingSize("ISO8859_9");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EncodingFactory.getEncoding("Cp1257");
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
  public void test25()  throws Throwable  {
      String string0 = "ISO8859_6";
      EncodingFactory.createEncoding("ISO8859_6");
      // Undeclared exception!
      EncodingFactory.getEncoding("ISO8859_6", "ISO8859_6");
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
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
  public void test27()  throws Throwable  {
      EncodingFactory.getEncoding("Cp1257");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      int int0 = EncodingFactory.getIscEncodingSize("isc_encoding_size.properties");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      EncodingFactory.getIscEncodingSize("NONE");
      Encoding encoding0 = EncodingFactory.createEncoding("NONE");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      EncodingFactory.getIscEncoding("DOS857");
      Encoding encoding0 = EncodingFactory.getEncoding("Cp1253", (String) null);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp863");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      EncodingFactory.getCharacterSetSize(4);
      EncodingFactory.getIscEncoding("Cp866");
      EncodingFactory.createEncoding("Cp866");
      // Undeclared exception!
      EncodingFactory.getTranslator("Cp866");
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      EncodingFactory.getCharacterSetSize((-1454755911));
      char[] charArray0 = new char[12];
      charArray0[2] = ':';
      charArray0[3] = 'f';
      String string0 = "ISO8859_4";
      EncodingFactory.getEncoding("jr~ZW", charArray0);
      EncodingFactory.getCharacterSetSize(1);
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
  public void test33()  throws Throwable  {
      EncodingFactory.createEncoding("Y");
      char[] charArray0 = new char[21];
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
  public void test34()  throws Throwable  {
      EncodingFactory.getEncoding("Cp1256");
      EncodingFactory.getJavaEncoding("v-/K*");
      // Undeclared exception!
      EncodingFactory.getTranslator("ISO8859_13");
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      int int0 = EncodingFactory.getIscEncodingSize("Cp437");
      assertEquals(1, int0);
      
      EncodingFactory.createEncoding("Cp437");
      String string0 = EncodingFactory.getJavaEncodingForAlias("Cp437");
      assertNotNull(string0);
      assertEquals("Cp437", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_6", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      EncodingFactory.getEncoding("Cp860");
      String string0 = EncodingFactory.ISC_ENCODING_SIZE_RESOURCE;
      int int0 = EncodingFactory.getIscEncodingSize("Cp860");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      EncodingFactory.getEncoding("Cp1250");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      int int0 = EncodingFactory.getIscEncodingSize((String) null);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("isc_encoding_size.properties");
      EncodingFactory.getEncoding("isc_encodings.properties");
      EncodingFactory.getEncoding("Cp862", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getEncoding("Cp862");
      int int0 = EncodingFactory.getCharacterSetSize(33);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      EncodingFactory.createEncoding("Cp862");
      int int0 = EncodingFactory.getIscEncodingSize("ISO8859_13");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      EncodingFactory.getEncoding("ISO8859_13");
      String string0 = EncodingFactory.getIscEncoding("ISO8859_13");
      assertNotNull(string0);
      assertEquals("ISO8859_13", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("Cp861");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      EncodingFactory.createEncoding("Cp1255");
      EncodingFactory.getCharacterSetSize(59);
      String string0 = EncodingFactory.getJavaEncodingForAlias("PT~}}1(M");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      EncodingFactory.createEncoding("Cp864");
      EncodingFactory.getIscEncodingSize("fnQq~<ip..V.kSX");
      // Undeclared exception!
      EncodingFactory.getEncoding((String) null, " A`Kw062>A^Zdan");
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      EncodingFactory.getEncoding("Cp1254");
      // Undeclared exception!
      EncodingFactory.getEncoding("Cp1254", "Cp850");
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      EncodingFactory.createEncoding("Cp1251");
      EncodingFactory.getIscEncoding("Cp1251");
      char[] charArray0 = new char[4];
      charArray0[0] = '0';
      charArray0[1] = 'w';
      charArray0[2] = '\"';
      charArray0[3] = '?';
      Encoding encoding0 = EncodingFactory.getEncoding("WIN1251", charArray0);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.createEncoding("isc_encoding_size.properties");
      EncodingFactory.getEncoding("Cp437", encodingFactory0.DEFAULT_MAPPING);
      String string0 = EncodingFactory.getJavaEncoding("Cp437");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String string0 = EncodingFactory.defaultEncoding;
      EncodingFactory.getEncoding("Cp737");
      int int0 = EncodingFactory.getIscEncodingSize("org.firebirdsql.encodings.Encoding_Cp1257");
      assertEquals(1, int0);
      
      int int1 = EncodingFactory.getCharacterSetSize(1);
      assertTrue(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      EncodingFactory.createEncoding("Cp869");
      String string0 = EncodingFactory.getJavaEncodingForAlias("iQK,7zj7:*");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      String string0 = EncodingFactory.ISC_ENCODING_SIZE_RESOURCE;
      char[] charArray0 = new char[1];
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
  public void test51()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("Cp869");
      char[] charArray0 = new char[1];
      charArray0[0] = 'D';
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
  public void test52()  throws Throwable  {
      EncodingFactory.createEncoding("%F!");
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_9", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp858", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
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
  public void test55()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_5");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      EncodingFactory.getEncoding("Cp850");
      String string0 = EncodingFactory.getJavaEncodingForAlias("ISO8859_8");
      assertEquals("ISO-8859-8", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      char[] charArray0 = null;
      String string0 = "Cp1254";
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
  public void test58()  throws Throwable  {
      EncodingFactory.getIscEncoding("utf-8");
      Encoding encoding0 = EncodingFactory.getEncoding("utf-8");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("Cp852");
      EncodingFactory.getJavaEncoding("Cp852");
      EncodingFactory.getIscEncoding("Cp852");
      Encoding encoding0 = EncodingFactory.createEncoding("Cp852");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_1");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("isc_encoding_size.properties");
      EncodingFactory.createEncoding("isc_encoding_size.properties");
      EncodingFactory.getEncoding(";");
      EncodingFactory.getIscEncodingSize((String) null);
      Encoding encoding0 = EncodingFactory.getEncoding("Cp737", encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      Encoding encoding0 = EncodingFactory.getEncoding("Cp850", encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      char[] charArray0 = new char[0];
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
  public void test64()  throws Throwable  {
      EncodingFactory.getEncoding((String) null);
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1257", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      EncodingFactory.createEncoding("ISO8859_7");
      String string0 = EncodingFactory.getJavaEncodingForAlias((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("Cp852");
      String string0 = EncodingFactory.defaultEncoding;
      char[] charArray0 = new char[1];
      charArray0[0] = '-';
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
  public void test67()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("ISO8859_8", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getIscEncodingSize("");
      String string0 = EncodingFactory.defaultEncoding;
      // Undeclared exception!
      EncodingFactory.getTranslator("ygP;s+k8Z>>=");
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      String string0 = EncodingFactory.defaultEncoding;
      EncodingFactory.getIscEncodingSize("FK3");
      Encoding encoding0 = EncodingFactory.getEncoding("ISO8859_1", encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      EncodingFactory.getJavaEncoding("^IN1255");
      EncodingFactory.getJavaEncodingForAlias("jh");
      char[] charArray0 = new char[3];
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
  public void test70()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_2");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[2] = '\u0000';
      charArray0[3] = '\u0000';
      charArray0[6] = '5';
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp857", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      String string0 = "ISO8859_7";
      char[] charArray0 = null;
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_7", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      String string0 = "Cp852";
      char[] charArray0 = null;
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
  public void test74()  throws Throwable  {
      EncodingFactory.getIscEncoding("Cp863");
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
  public void test75()  throws Throwable  {
      int int0 = Byte.SIZE;
      EncodingFactory.getIscEncodingSize("");
      String string0 = EncodingFactory.defaultEncoding;
      EncodingFactory.getJavaEncoding("UNICODE_FSS");
      EncodingFactory.getJavaEncodingForAlias("UTF8");
      String string1 = "Cp1253";
      char[] charArray0 = new char[2];
      charArray0[0] = 'N';
      charArray0[1] = 'W';
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
  public void test76()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      Encoding encoding0 = EncodingFactory.createEncoding("Cp857");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      char[] charArray0 = new char[1];
      EncodingFactory.getIscEncoding("\"AGx64a[T:\"");
      String string0 = "Cp852";
      EncodingFactory.getEncoding("ascii", charArray0);
      // Undeclared exception!
      EncodingFactory.getTranslator("h(.Xq6G<(i*");
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      EncodingFactory.getEncoding("1NONE", (char[]) null);
      EncodingFactory.getEncoding("ISO8859_8");
      EncodingFactory.getIscEncoding("1NONE");
      EncodingFactory.getEncoding("Q8k");
      EncodingFactory.getJavaEncoding((String) null);
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
}
