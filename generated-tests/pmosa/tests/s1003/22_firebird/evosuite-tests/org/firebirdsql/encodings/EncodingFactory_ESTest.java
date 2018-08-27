/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 16 22:59:49 GMT 2018
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
      EncodingFactory.getIscEncoding("-(#boCpbsL)hWbdAIG");
      // Undeclared exception!
      try { 
        EncodingFactory.createEncoding((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias(";:TnV~pn|P{");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getEncoding("@f&;4z]jeT", encodingFactory0.DEFAULT_MAPPING);
      String string0 = EncodingFactory.getJavaEncoding(";:TnV~pn|P{");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EncodingFactory.getIscEncoding("");
      String string0 = EncodingFactory.getJavaEncodingForAlias("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("25000");
      String string0 = "t";
      EncodingFactory.getJavaEncodingForAlias("t");
      EncodingFactory.getIscEncodingSize("25000");
      EncodingFactory.getJavaEncodingForAlias("e1lHP}EEfvKA?");
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getIscEncodingSize("isc_encodings.properties");
      EncodingFactory.getJavaEncodingForAlias("e1lHP}EEfvKA?");
      // Undeclared exception!
      EncodingFactory.getEncoding((String) null, "Cp864");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = EncodingFactory.getIscEncodingSize((String) null);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[0];
      EncodingFactory.getEncoding("08007", charArray0);
      // Undeclared exception!
      EncodingFactory.getTranslator("WEy2:+xhIw6O*");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = EncodingFactory.getJavaEncoding((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EncodingFactory.getIscEncoding("D`v=|+)o={V7L");
      EncodingFactory.getIscEncodingSize((String) null);
      char[] charArray0 = new char[7];
      charArray0[0] = 'P';
      charArray0[1] = 'b';
      charArray0[2] = '{';
      charArray0[3] = 'J';
      charArray0[4] = ':';
      charArray0[5] = 'D';
      charArray0[6] = ' ';
      EncodingFactory.getEncoding("D`v=|+)o={V7L", charArray0);
      EncodingFactory.getCharacterSetSize(4);
      EncodingFactory.createEncoding("08006");
      String string0 = "U";
      // Undeclared exception!
      EncodingFactory.getEncoding("U", "08006");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EncodingFactory.getCharacterSetSize(0);
      Encoding encoding0 = EncodingFactory.createEncoding("G#8i\"2");
      assertNotNull(encoding0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EncodingFactory.getJavaEncoding("e*l[E`Iq0))");
      EncodingFactory.getEncoding((String) null);
      EncodingFactory.getCharacterSetSize(1030);
      // Undeclared exception!
      EncodingFactory.getTranslator("qegw");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EncodingFactory.getIscEncoding("Ru]=cM!'.");
      EncodingFactory.getEncoding((String) null, (char[]) null);
      EncodingFactory.getJavaEncodingForAlias((String) null);
      EncodingFactory encodingFactory0 = new EncodingFactory();
      String string0 = "HY002";
      EncodingFactory.getJavaEncodingForAlias("HY002");
      EncodingFactory.getJavaEncodingForAlias("S*NP.0rxZ]");
      EncodingFactory.createEncoding("isc_encodings.properties");
      EncodingFactory.getJavaEncodingForAlias("isc_encodings.properties");
      // Undeclared exception!
      EncodingFactory.getTranslator("");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getIscEncoding("isc_encodings.properties");
      EncodingFactory.getIscEncoding("Incorrect mapping format. Key should consist only of 4 characters, but ");
      EncodingFactory.getIscEncodingSize((String) null);
      EncodingFactory.getEncoding("*N.Y9M{]U#KGP@~(g_p");
      EncodingFactory.getJavaEncodingForAlias("UNICODE_FSS");
      EncodingFactory.createEncoding(")ZY4))7|NZ^0DIv;");
      EncodingFactory.getEncoding("ISO8859_6");
      EncodingFactory.createEncoding("isc_encodings.properties");
      EncodingFactory.getEncoding("3qBekF+IIL&W/2p", encodingFactory0.DEFAULT_MAPPING);
      String string0 = EncodingFactory.getJavaEncoding("Incorrect mapping format. Key should consist only of 4 characters, but ");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      String string0 = "DOS862";
      EncodingFactory.getJavaEncodingForAlias("DOS862");
      EncodingFactory.getJavaEncodingForAlias("isc_encoding_size.properties");
      EncodingFactory.getIscEncoding((String) null);
      EncodingFactory.getIscEncodingSize("");
      EncodingFactory.getJavaEncoding("Cp1256");
      EncodingFactory.createEncoding("Cp1256");
      EncodingFactory.getJavaEncoding("HX6)'pCN :5q\"I");
      EncodingFactory.getCharacterSetSize(1);
      EncodingFactory.getEncoding("#rOGwTUP");
      EncodingFactory.getIscEncodingSize("DOS852");
      // Undeclared exception!
      EncodingFactory.getTranslator((String) null);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      EncodingFactory.getJavaEncodingForAlias("ASCII");
      // Undeclared exception!
      EncodingFactory.getTranslator("7<>,U0RL4@r^v:l8*");
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("Incorrect mapping format. Key should consist only of 4 characters, but ");
      EncodingFactory.getJavaEncodingForAlias((String) null);
      EncodingFactory.getIscEncodingSize("Incorrect mapping format. Key should consist only of 4 characters, but ");
      EncodingFactory.getJavaEncodingForAlias(",7");
      EncodingFactory.getEncoding("Incorrect mapping format. Key should consist only of 4 characters, but ", (String) null);
      String string0 = EncodingFactory.getIscEncoding("01S06");
      assertNull(string0);
      
      EncodingFactory.getJavaEncoding("R}ybCEl");
      EncodingFactory.createEncoding("R}ybCEl");
      EncodingFactory.getJavaEncodingForAlias((String) null);
      int int0 = EncodingFactory.getIscEncodingSize("E,G<OSc^[$G,");
      assertEquals(1, int0);
      
      String string1 = EncodingFactory.getJavaEncodingForAlias("ISO8859_8");
      assertNotNull(string1);
      assertEquals("ISO-8859-8", string1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EncodingFactory.getJavaEncoding("e*l[E`Iq0))");
      EncodingFactory.getEncoding((String) null);
      String string0 = EncodingFactory.getJavaEncoding("ISO8859_3");
      assertNotNull(string0);
      assertEquals("ISO-8859-3", string0);
  }
}