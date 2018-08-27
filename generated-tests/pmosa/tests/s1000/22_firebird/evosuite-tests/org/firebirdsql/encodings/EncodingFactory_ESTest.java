/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 16 15:07:42 GMT 2018
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
      Encoding encoding0 = EncodingFactory.getEncoding("DOS865", encodingFactory0.DEFAULT_MAPPING);
      Encoding encoding1 = EncodingFactory.getEncoding("ResourceGException. ");
      assertFalse(encoding1.equals((Object)encoding0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = null;
      EncodingFactory.getIscEncodingSize((String) null);
      EncodingFactory.getCharacterSetSize(1);
      String string1 = "#HZKnUx==`O/vI";
      // Undeclared exception!
      EncodingFactory.getEncoding((String) null, "#HZKnUx==`O/vI");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = EncodingFactory.getCharacterSetSize(1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("`Nawh", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getIscEncodingSize((String) null);
      // Undeclared exception!
      EncodingFactory.getTranslator("ISO8859_4");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EncodingFactory.getIscEncoding("FPl*Q10");
      EncodingFactory.getCharacterSetSize((-658));
      EncodingFactory.getJavaEncodingForAlias((String) null);
      EncodingFactory.getCharacterSetSize((-658));
      EncodingFactory.getCharacterSetSize(3);
      // Undeclared exception!
      EncodingFactory.getTranslator("FPl*Q10");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getJavaEncodingForAlias("p=(Ruq;Dk9q");
      String string0 = EncodingFactory.getIscEncoding("isc_encoding_size.properties");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = EncodingFactory.getIscEncodingSize("ISO8859_2");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      String string0 = EncodingFactory.ISC_ENCODING_SIZE_RESOURCE;
      String string1 = EncodingFactory.getIscEncoding((String) null);
      assertNull(string1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EncodingFactory.createEncoding(":+^02h=>6TY\"O@j");
      String string0 = EncodingFactory.getJavaEncodingForAlias((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias((String) null);
      char[] charArray0 = new char[7];
      charArray0[0] = ':';
      charArray0[1] = '{';
      charArray0[2] = '-';
      charArray0[3] = '{';
      charArray0[4] = '/';
      charArray0[5] = 'G';
      charArray0[6] = 'b';
      Encoding encoding0 = EncodingFactory.getEncoding((String) null, charArray0);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[0] = 'l';
      charArray0[1] = '\\';
      charArray0[2] = 'R';
      charArray0[3] = 'Q';
      charArray0[4] = 'V';
      charArray0[5] = 'm';
      charArray0[6] = '%';
      charArray0[7] = '5';
      charArray0[8] = '%';
      EncodingFactory.getEncoding("", charArray0);
      EncodingFactory.getIscEncodingSize("");
      EncodingFactory.getJavaEncoding("");
      EncodingFactory.getIscEncoding((String) null);
      // Undeclared exception!
      EncodingFactory.getEncoding("ISO8859_4", "MsovLuGDR|");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EncodingFactory.getJavaEncoding("UU53J");
      // Undeclared exception!
      EncodingFactory.getEncoding("GDS Exception. ", "WIN1253");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EncodingFactory.getEncoding("R", (String) null);
      String string0 = EncodingFactory.getJavaEncoding((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("np=vejV");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EncodingFactory.getIscEncoding("UU53J");
      EncodingFactory.getJavaEncodingForAlias("UU53J");
      EncodingFactory.getIscEncodingSize("UU53J");
      char[] charArray0 = new char[4];
      charArray0[0] = 'o';
      charArray0[1] = 'F';
      charArray0[2] = '#';
      charArray0[3] = '9';
      EncodingFactory.getEncoding("UU53J", charArray0);
      EncodingFactory.getEncoding((String) null, (String) null);
      EncodingFactory.getJavaEncoding((String) null);
      EncodingFactory.getJavaEncodingForAlias((String) null);
      // Undeclared exception!
      EncodingFactory.getTranslator("");
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = "26000";
      EncodingFactory.getIscEncoding("26000");
      EncodingFactory.createEncoding("26000");
      EncodingFactory.getEncoding((String) null);
      EncodingFactory.getIscEncoding("]`R='a.;!k-;lsj@BJ");
      EncodingFactory.getIscEncoding("]`R='a.;!k-;lsj@BJ");
      String string1 = null;
      EncodingFactory.getJavaEncoding((String) null);
      EncodingFactory.getEncoding("]`R='a.;!k-;lsj@BJ", (String) null);
      EncodingFactory.getEncoding("08003");
      EncodingFactory.getCharacterSetSize(0);
      EncodingFactory.getIscEncoding((String) null);
      // Undeclared exception!
      try { 
        EncodingFactory.createEncoding((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("isc_encoding_size.properties", encodingFactory0.DEFAULT_MAPPING);
      EncodingFactory.getJavaEncodingForAlias("z_C-5_U.'te+c]svlt");
      EncodingFactory.getEncoding("", (String) null);
      EncodingFactory.getJavaEncodingForAlias("isc_encoding_size.properties");
      EncodingFactory.getIscEncoding("");
      EncodingFactory.getIscEncodingSize("7T|d");
      EncodingFactory.getJavaEncodingForAlias("07005");
      EncodingFactory.getJavaEncoding("isc_encodings.properties");
      EncodingFactory.getCharacterSetSize(4);
      EncodingFactory.getJavaEncodingForAlias("v9V: y(AYs");
      EncodingFactory.getEncoding((String) null);
      EncodingFactory.getJavaEncoding("$m");
      String string0 = null;
      EncodingFactory.getEncoding((String) null);
      EncodingFactory.getIscEncoding("isc_encoding_size.properties");
      // Undeclared exception!
      EncodingFactory.getTranslator("UhG9b(afI");
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EncodingFactory.createEncoding("");
      EncodingFactory.getIscEncodingSize("HY105");
      int int0 = EncodingFactory.getCharacterSetSize(1);
      int int1 = EncodingFactory.getIscEncodingSize("HY002");
      assertTrue(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = EncodingFactory.getJavaEncodingForAlias("Cp863");
      assertEquals("Cp863", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EncodingFactory.getIscEncoding("%duBe=H9ZhzQ[");
      EncodingFactory.getJavaEncoding(" y");
      EncodingFactory.getJavaEncodingForAlias((String) null);
      EncodingFactory.getJavaEncodingForAlias("Bhxw)`");
      EncodingFactory.getJavaEncodingForAlias("bb(a5!e7^YGC[HG");
      String string0 = "K";
      EncodingFactory.getJavaEncodingForAlias("ISO8859_4");
      // Undeclared exception!
      EncodingFactory.getTranslator("K");
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EncodingFactory.getJavaEncoding("ASCII");
      EncodingFactory.getJavaEncodingForAlias("US-ASCII");
      EncodingFactory.getJavaEncodingForAlias("HY002");
      EncodingFactory.getJavaEncodingForAlias("US-ASCII");
      String string0 = "ISO8859_9";
      // Undeclared exception!
      EncodingFactory.getTranslator((String) null);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EncodingFactory.getJavaEncoding("WIN1251");
      EncodingFactory encodingFactory0 = new EncodingFactory();
  }
}