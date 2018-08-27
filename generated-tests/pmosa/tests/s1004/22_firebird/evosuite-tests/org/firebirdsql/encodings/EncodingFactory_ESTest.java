/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 01:56:42 GMT 2018
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
      EncodingFactory.getJavaEncoding(":jDd>J\u0007]");
      EncodingFactory.getJavaEncoding("");
      EncodingFactory.getCharacterSetSize((-21));
      // Undeclared exception!
      EncodingFactory.getEncoding((String) null, ":jDd>J\u0007]");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EncodingFactory.getCharacterSetSize(0);
      // Undeclared exception!
      EncodingFactory.getEncoding("-qyR{BtqIP.", "g[^wn[V0\"");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EncodingFactory.getEncoding("Pr[hZ");
      int int0 = EncodingFactory.getIscEncodingSize("Pr[hZ");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = EncodingFactory.getJavaEncoding((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EncodingFactory.getJavaEncoding("yuV;;FgPA?Ad(");
      int int0 = EncodingFactory.getIscEncodingSize((String) null);
      EncodingFactory.createEncoding("Cp860");
      int int1 = EncodingFactory.getCharacterSetSize(0);
      assertTrue(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_9", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      Encoding encoding0 = EncodingFactory.getEncoding("K{@v", encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getJavaEncoding((String) null);
      EncodingFactory.getJavaEncodingForAlias("isc_encoding_size.properties");
      // Undeclared exception!
      EncodingFactory.getEncoding("TZ[", "isc_encoding_size.properties");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias((String) null);
      EncodingFactory.getEncoding((String) null, (String) null);
      String string0 = EncodingFactory.getIscEncoding((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EncodingFactory.getIscEncoding((String) null);
      EncodingFactory.getJavaEncodingForAlias((String) null);
      EncodingFactory.createEncoding("");
      EncodingFactory.getEncoding("");
      EncodingFactory.getJavaEncoding("");
      EncodingFactory.getIscEncodingSize((String) null);
      String string0 = "";
      // Undeclared exception!
      EncodingFactory.getEncoding("A7HG3sr:y", "");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EncodingFactory.createEncoding("Cp1256");
      EncodingFactory.getIscEncodingSize((String) null);
      // Undeclared exception!
      EncodingFactory.getTranslator("Resource Exception. ");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("Cp1255");
      // Undeclared exception!
      EncodingFactory.getTranslator("ISO8859_5");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EncodingFactory.getCharacterSetSize(0);
      EncodingFactory.getIscEncodingSize((String) null);
      char[] charArray0 = new char[0];
      EncodingFactory.getEncoding("<7S7Ab:1Ay>_", charArray0);
      EncodingFactory.getIscEncoding("<,H$+}6'CK`SW8");
      EncodingFactory.getJavaEncodingForAlias("<7S7Ab:1Ay>_");
      EncodingFactory.getJavaEncodingForAlias("ISO8859_3");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getIscEncoding("");
      EncodingFactory.getJavaEncoding("s5");
      // Undeclared exception!
      EncodingFactory.getEncoding("", "ISO8859_3");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = "";
      EncodingFactory.getJavaEncoding("");
      EncodingFactory.createEncoding("?jm8YPvdv7D}d");
      String string1 = "L$8-OD0JbzV'AR\"f}0(";
      EncodingFactory.getIscEncodingSize("L$8-OD0JbzV'AR\"f}0(");
      char[] charArray0 = new char[7];
      charArray0[0] = '\'';
      charArray0[1] = ')';
      charArray0[2] = 'q';
      charArray0[3] = 'E';
      charArray0[4] = '/';
      charArray0[5] = 'Q';
      charArray0[6] = '!';
      EncodingFactory.getEncoding("?jm8YPvdv7D}d", charArray0);
      EncodingFactory.getIscEncodingSize((String) null);
      EncodingFactory.getCharacterSetSize(16);
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getJavaEncodingForAlias("6rv6!SL<wLMeVW`d@");
      String string2 = "GH0*LZ65*Q*f";
      // Undeclared exception!
      EncodingFactory.getEncoding("L$8-OD0JbzV'AR\"f}0(", "GH0*LZ65*Q*f");
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EncodingFactory.getCharacterSetSize(64);
      EncodingFactory.getIscEncodingSize("Id");
      EncodingFactory.getIscEncodingSize("Id");
      char[] charArray0 = new char[0];
      EncodingFactory.getEncoding("", charArray0);
      EncodingFactory.getCharacterSetSize(1);
      // Undeclared exception!
      EncodingFactory.getTranslator((String) null);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EncodingFactory.getCharacterSetSize(3784);
      EncodingFactory.createEncoding("");
      EncodingFactory.getJavaEncoding((String) null);
      EncodingFactory.getEncoding((String) null);
      EncodingFactory encodingFactory0 = new EncodingFactory();
      char[] charArray0 = new char[9];
      charArray0[0] = 'C';
      charArray0[1] = 'l';
      charArray0[2] = ',';
      charArray0[3] = '{';
      charArray0[4] = 'p';
      charArray0[5] = '7';
      charArray0[6] = '9';
      charArray0[7] = 'j';
      charArray0[8] = 'R';
      EncodingFactory.getEncoding((String) null, charArray0);
      EncodingFactory.getIscEncoding("eop`yYY]>c");
      EncodingFactory.getEncoding("");
      // Undeclared exception!
      EncodingFactory.getEncoding("isc_encodings.properties", "isc_encodings.properties");
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = "";
      EncodingFactory.getJavaEncoding("");
      EncodingFactory.createEncoding("BoEvtEJ6Zwa@Zq");
      String string1 = "L$8-OD0JbzV'AR\"f}0(";
      EncodingFactory.getIscEncodingSize("DOS861");
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp775", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = "ISO8859_13";
      EncodingFactory.getJavaEncoding("ISO8859_13");
      EncodingFactory.getJavaEncoding("ISO8859_13");
      EncodingFactory.getCharacterSetSize((-21));
      // Undeclared exception!
      EncodingFactory.getEncoding("iF\"m;<@O:Q<?~_", "");
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = EncodingFactory.getJavaEncoding("SJIS_0208");
      assertNotNull(string0);
      assertEquals("MS932", string0);
  }
}