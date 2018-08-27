/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 17:47:37 GMT 2018
 */

package org.firebirdsql.encodings;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.firebirdsql.encodings.CharacterTranslator;
import org.firebirdsql.encodings.Encoding;
import org.firebirdsql.encodings.EncodingFactory;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EncodingFactory_ESTest extends EncodingFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      String string0 = EncodingFactory.getJavaEncodingForAlias("isc_encodings.properties");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      // Undeclared exception!
      EncodingFactory.getEncoding("isc_encodings.properties", "isc_encodings.properties");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EncodingFactory.getJavaEncoding("35_1oVOwMv{Z");
      EncodingFactory.getIscEncodingSize((String) null);
      String string0 = EncodingFactory.getJavaEncodingForAlias("35_1oVOwMv{Z");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EncodingFactory.getIscEncodingSize("ISO8859_8");
      int int0 = EncodingFactory.getIscEncodingSize("ISO8859_8");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EncodingFactory.getCharacterSetSize(3);
      EncodingFactory encodingFactory0 = new EncodingFactory();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      Encoding encoding0 = EncodingFactory.getEncoding("isc_encodings.properties", encodingFactory0.DEFAULT_MAPPING);
      Encoding encoding1 = EncodingFactory.getEncoding("isc_encodings.properties");
      assertNotSame(encoding1, encoding0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      String string0 = EncodingFactory.getIscEncoding("isc_encodings.properties");
      assertNull(string0);
      
      int int0 = EncodingFactory.getIscEncodingSize((String) null);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      Encoding encoding0 = EncodingFactory.getEncoding((String) null, encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EncodingFactory.getEncoding((String) null);
      String string0 = EncodingFactory.getJavaEncodingForAlias((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EncodingFactory.getEncoding("ISO8859_6");
      EncodingFactory.getJavaEncoding("ISO8859_6");
      // Undeclared exception!
      EncodingFactory.getEncoding((String) null, "Cp1250");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = EncodingFactory.getJavaEncodingForAlias("Cp852");
      assertNotNull(string0);
      assertEquals("Cp852", string0);
      
      String string1 = EncodingFactory.getIscEncoding("Cp852");
      assertEquals("DOS852", string1);
      assertNotNull(string1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_1");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getJavaEncoding("isc_encodings.properties");
      String string0 = EncodingFactory.getIscEncoding((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_5");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = "d]zh(GK+.EqMV1@(ek";
      String string1 = EncodingFactory.defaultEncoding;
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
  public void test15()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding((String) null, (String) null);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EncodingFactory.getJavaEncoding("Cp865");
      EncodingFactory.getJavaEncodingForAlias("BLbA9vgnj)");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      Encoding encoding0 = EncodingFactory.getEncoding("Cp862", encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EncodingFactory.getIscEncoding("g");
      EncodingFactory.getJavaEncoding("g");
      Encoding encoding0 = EncodingFactory.getEncoding("Cp775");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[3] = '&';
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
  public void test19()  throws Throwable  {
      EncodingFactory.getEncoding("Cp437");
      String string0 = EncodingFactory.getJavaEncoding("Cp437");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EncodingFactory.getEncoding("Cp737");
      Encoding encoding0 = EncodingFactory.createEncoding("KSC_5601");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EncodingFactory.createEncoding("Cp1251");
      EncodingFactory.getIscEncoding("Cp1251");
      // Undeclared exception!
      EncodingFactory.getTranslator("org.firebirdsql.encodings.Encoding_Cp1253");
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int int0 = Byte.SIZE;
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_8");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = "Cp775";
      char[] charArray0 = new char[1];
      charArray0[0] = '|';
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
  public void test24()  throws Throwable  {
      String string0 = "ISO8859_5";
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
  public void test25()  throws Throwable  {
      EncodingFactory.getJavaEncoding("UNICODE_FSS");
      EncodingFactory.getJavaEncodingForAlias("UTF-8");
      char[] charArray0 = new char[0];
      Encoding encoding0 = EncodingFactory.getEncoding("NONE", charArray0);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("NONE");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp862");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("Cp1254");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      EncodingFactory.getEncoding("uw{l_P)kqIZvfyWoFpr");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("ISO8859_6", encodingFactory0.DEFAULT_MAPPING);
      // Undeclared exception!
      EncodingFactory.getTranslator("ISO8859_6");
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String string0 = "Cp1251";
      char[] charArray0 = new char[10];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1251", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.createEncoding("Cp860");
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_9");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      EncodingFactory.createEncoding("Cp866");
      // Undeclared exception!
      EncodingFactory.getEncoding("WIN1252", "Cp866");
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("Cp1252");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
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
  public void test35()  throws Throwable  {
      EncodingFactory.createEncoding("ISO8859_2");
      int int0 = EncodingFactory.getIscEncodingSize("");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      String string0 = EncodingFactory.ISC_ENCODING_SIZE_RESOURCE;
      EncodingFactory.getEncoding("Cp1254", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getJavaEncoding("Cp1254");
      // Undeclared exception!
      try { 
        EncodingFactory.createEncoding((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getIscEncodingSize("=03e");
      EncodingFactory.getIscEncoding("isc_encodings.properties");
      Encoding encoding0 = EncodingFactory.getEncoding("Cp1253", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getJavaEncoding("Cp1253");
      Encoding encoding1 = EncodingFactory.createEncoding("Cp1253");
      assertNotSame(encoding1, encoding0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = ' ';
      charArray0[1] = 'Z';
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp852", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp865");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      Encoding encoding0 = EncodingFactory.getEncoding("Cp1257", encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = '-';
      charArray0[1] = '*';
      charArray0[2] = ':';
      charArray0[3] = 'O';
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
  public void test42()  throws Throwable  {
      EncodingFactory.getIscEncodingSize("_:3>D*Biwg_");
      String string0 = EncodingFactory.ISC_ENCODING_SIZE_RESOURCE;
      EncodingFactory.createEncoding("Cp1256");
      // Undeclared exception!
      EncodingFactory.getTranslator("_:3>D*Biwg_");
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      String string0 = "Cp866";
      EncodingFactory.getEncoding("Cp866", encodingFactory0.DEFAULT_MAPPING);
      CharacterTranslator characterTranslator0 = new CharacterTranslator();
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[2] = 'e';
      charArray0[3] = 'e';
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
  public void test45()  throws Throwable  {
      String string0 = "Cp861";
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
  public void test46()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1255");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("Cp1253");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String string0 = EncodingFactory.ISC_ENCODING_SIZE_RESOURCE;
      EncodingFactory.getEncoding("Cp863");
      String string1 = EncodingFactory.getIscEncoding("isc_encoding_size.properties");
      assertNull(string1);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      EncodingFactory.getIscEncoding((String) null);
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_3");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      int int0 = EncodingFactory.getIscEncodingSize("L=Zr9");
      assertEquals(1, int0);
      
      EncodingFactory.getEncoding("ISO8859_13");
      int int1 = EncodingFactory.getCharacterSetSize(1);
      assertTrue(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("Cp858");
      EncodingFactory.getJavaEncoding("HY092");
      char[] charArray0 = new char[0];
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
  public void test52()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[2] = ':';
      int int0 = Byte.SIZE;
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
  public void test53()  throws Throwable  {
      EncodingFactory.createEncoding("Cp737");
      char[] charArray0 = new char[4];
      charArray0[0] = 'b';
      charArray0[1] = 'b';
      charArray0[2] = '4';
      charArray0[3] = 'Y';
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
  public void test54()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1250");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[1] = '\u0000';
      EncodingFactory.getEncoding("Cp864");
      String string0 = "ISO8859_7";
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
      Encoding encoding0 = EncodingFactory.createEncoding("Cp861");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      Encoding encoding0 = EncodingFactory.getEncoding("Cp437", encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      int int0 = Byte.BYTES;
      char[] charArray0 = new char[4];
      EncodingFactory.createEncoding("qlJ$$J?(sw\u0003j,Y'g");
      EncodingFactory.getEncoding("org.firebirdsql.encodings.Encoding_Cp1251", charArray0);
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
  public void test59()  throws Throwable  {
      EncodingFactory.getEncoding("Cp1257");
      CharacterTranslator characterTranslator0 = new CharacterTranslator();
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("Cp858");
      char[] charArray0 = new char[1];
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
  public void test61()  throws Throwable  {
      String string0 = "Cp857";
      char[] charArray0 = new char[3];
      charArray0[2] = '{';
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
  public void test62()  throws Throwable  {
      String string0 = EncodingFactory.ISC_ENCODINGS_RESOURCE;
      String string1 = EncodingFactory.ISC_ENCODING_SIZE_RESOURCE;
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
  public void test63()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp869");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      EncodingFactory.getJavaEncoding("org.firebirdsql.jdbc.FBSQLException");
      EncodingFactory.createEncoding("org.firebirdsql.jdbc.FBSQLException");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getIscEncoding("isc_encoding_size.properties");
      Encoding encoding0 = EncodingFactory.getEncoding("ISO8859_2", encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      EncodingFactory.getIscEncoding("UNICODE_FSS");
      EncodingFactory.getIscEncoding((String) null);
      EncodingFactory.getIscEncodingSize((String) null);
      EncodingFactory.getEncoding("858", (String) null);
      CharacterTranslator characterTranslator0 = new CharacterTranslator();
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
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
  public void test67()  throws Throwable  {
      EncodingFactory.getEncoding("ISO8859_9");
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
  public void test68()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      Encoding encoding0 = EncodingFactory.getEncoding("ISO8859_7");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      EncodingFactory.createEncoding("Cp858");
      String string0 = EncodingFactory.getJavaEncoding((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      int int0 = Byte.SIZE;
      EncodingFactory.createEncoding("Cp857");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      int int1 = EncodingFactory.getCharacterSetSize(8);
      assertEquals(1, int1);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[1] = 'k';
      charArray0[2] = '_';
      charArray0[3] = 'k';
      charArray0[5] = 'k';
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp863", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      EncodingFactory.getEncoding("Cp852");
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_4");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      String string0 = EncodingFactory.defaultEncoding;
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getIscEncoding("isc_encoding_size.properties");
      Encoding encoding0 = EncodingFactory.getEncoding("Cp864", encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      String string0 = null;
      EncodingFactory.getJavaEncoding((String) null);
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
  public void test75()  throws Throwable  {
      EncodingFactory.createEncoding("Cp850");
      int int0 = EncodingFactory.getIscEncodingSize("Cp850");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      EncodingFactory.getCharacterSetSize(27);
      String string0 = "DOS860";
      int int0 = Byte.BYTES;
      EncodingFactory.getJavaEncoding("DOS860");
      char[] charArray0 = new char[4];
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
  public void test77()  throws Throwable  {
      String string0 = "s\\u/MZwS,DE0";
      char[] charArray0 = new char[10];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_13", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      EncodingFactory.getIscEncodingSize("ISO8859_8");
      EncodingFactory.getJavaEncoding("ISO8859_8");
      Encoding encoding0 = EncodingFactory.getEncoding("ascii", (char[]) null);
      assertNotNull(encoding0);
  }
}