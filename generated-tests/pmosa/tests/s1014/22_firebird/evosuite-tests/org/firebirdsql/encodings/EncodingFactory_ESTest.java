/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 03:29:57 GMT 2018
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
      EncodingFactory.createEncoding("HY092");
      EncodingFactory.getCharacterSetSize(0);
      EncodingFactory.createEncoding("Cp1251");
      EncodingFactory.getEncoding("[ZyN_Yh@*|", (char[]) null);
      EncodingFactory.getIscEncoding("HY002");
      EncodingFactory.getJavaEncodingForAlias((String) null);
      Encoding encoding0 = EncodingFactory.getEncoding("");
      EncodingFactory.getCharacterSetSize(1654);
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getJavaEncoding("");
      EncodingFactory.getEncoding("");
      EncodingFactory.getEncoding("v_c9qX,(", (char[]) null);
      Encoding encoding1 = EncodingFactory.getEncoding("", encodingFactory0.DEFAULT_MAPPING);
      assertNotSame(encoding1, encoding0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = "DOS863";
      EncodingFactory.getEncoding("DOS863", (char[]) null);
      EncodingFactory.getEncoding((String) null);
      // Undeclared exception!
      EncodingFactory.getTranslator("WIN1255");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = EncodingFactory.getCharacterSetSize(0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("p861");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EncodingFactory.getEncoding("org.firebirdsql.encodings.Encoding_Cp858", (String) null);
      String string0 = EncodingFactory.getJavaEncodingForAlias((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = EncodingFactory.getIscEncoding("08S01");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EncodingFactory.getIscEncoding((String) null);
      Encoding encoding0 = EncodingFactory.getEncoding((String) null, (String) null);
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = EncodingFactory.getJavaEncoding((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = "\\#?6WrvWtE";
      char[] charArray0 = new char[2];
      charArray0[0] = 'w';
      charArray0[1] = ':';
      EncodingFactory.getEncoding("#?6WrvWtE", charArray0);
      String string1 = "]r.@7@)WD5,d\\'.w";
      String string2 = "";
      // Undeclared exception!
      EncodingFactory.getEncoding("]r.@7@)WD5,d'.w", "");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("Cp865");
      Encoding encoding0 = EncodingFactory.createEncoding(" coldnot^ be found.");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EncodingFactory.getEncoding(" could not be found.");
      String string0 = EncodingFactory.getJavaEncodingForAlias("X%SfEaPSG4-e;");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = "";
      EncodingFactory.getIscEncodingSize("");
      EncodingFactory.getJavaEncoding("");
      EncodingFactory.getCharacterSetSize((-1));
      EncodingFactory.getIscEncodingSize("");
      EncodingFactory.createEncoding("l7GS#sR.Wo6`=");
      EncodingFactory.getEncoding("");
      char[] charArray0 = new char[7];
      charArray0[0] = '5';
      charArray0[1] = 's';
      charArray0[2] = 'G';
      charArray0[3] = 'T';
      charArray0[4] = 'V';
      charArray0[5] = 'K';
      charArray0[6] = '|';
      EncodingFactory.getEncoding((String) null, charArray0);
      EncodingFactory.getEncoding((String) null);
      // Undeclared exception!
      EncodingFactory.getTranslator("l7GS#sR.Wo6`=");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("4^");
      EncodingFactory.getIscEncoding("08S01");
      Encoding encoding0 = EncodingFactory.getEncoding((String) null, (String) null);
      EncodingFactory.getIscEncodingSize("4^");
      EncodingFactory.getJavaEncoding("4^");
      EncodingFactory.getCharacterSetSize((-1124));
      char[] charArray0 = new char[6];
      charArray0[0] = 'v';
      charArray0[1] = 'J';
      charArray0[2] = '9';
      charArray0[4] = 'M';
      charArray0[5] = 'p';
      EncodingFactory.getEncoding("08S01", charArray0);
      EncodingFactory.getJavaEncodingForAlias("ISO8859_8");
      EncodingFactory.getIscEncoding("ISO8859_8");
      EncodingFactory.getIscEncodingSize("ISO8859_8");
      int int0 = Byte.BYTES;
      Encoding encoding1 = EncodingFactory.createEncoding("8oYkgZyc");
      assertNotSame(encoding1, encoding0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EncodingFactory.getJavaEncoding("W/~*kII cecZcD4~Q");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getJavaEncoding("DOS864");
      EncodingFactory.getEncoding("Cp1256", (String) null);
      EncodingFactory.getIscEncoding("W/~*kII cecZcD4~Q");
      // Undeclared exception!
      EncodingFactory.getEncoding("W/~*kII cecZcD4~Q", "DOS775");
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EncodingFactory.getEncoding("DOS863", (char[]) null);
      EncodingFactory.getEncoding((String) null);
      String string0 = EncodingFactory.getJavaEncoding("DOS863");
      assertEquals("Cp863", string0);
      assertNotNull(string0);
  }
}