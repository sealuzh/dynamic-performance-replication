/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 16 14:35:59 GMT 2018
 */

package net.kencochrane.a4j.file;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.function.Consumer;
import net.kencochrane.a4j.file.FileUtil;
import net.kencochrane.a4j.util.LoadProperties;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileUtil_ESTest extends FileUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      LoadProperties.instance();
      String string0 = null;
      fileUtil0.downloadSimilaritesFile((String) null, (String) null, (String) null);
      String string1 = "`O/vI`ewm7+GH\"[NE";
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      Object object0 = new Object();
      arrayList0.add(object0);
      fileUtil0.getAccessories("`O/vI`ewm7+GH\"[NE", arrayList0);
      String string2 = "Eo";
      // Undeclared exception!
      try { 
        fileUtil0.renameFile((String) null, "Eo");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      fileUtil0.downloadSimilaritesFile("}f8}at6=R", "}f8}at6=R", "g_");
      ArrayList<String> arrayList1 = new ArrayList<String>(arrayList0);
      arrayList1.clear();
      arrayList0.add("t_");
      arrayList0.add((String) null);
      fileUtil0.fetchASINFile("*yvCt*q-?@SqLyl)o", "", (String) null, "t_");
      arrayList0.add("(:,}L:.m");
      arrayList1.add("LeYufIhrL5o-~V~");
      fileUtil0.getAccessories("t_", arrayList1);
      fileUtil0.downloadThirdPartySearchFile("}f8}at6=R", "}f8}at6=R", "^BLjEE", "^BLjEE");
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      arrayList0.forEach(consumer0);
      File file0 = fileUtil0.getAccessories((String) null, arrayList1);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchThirdPartySearchFile("o?", "o?", (String) null, "o?");
      fileUtil0.deleteFile("b_");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchASINFile("Log file isn't there Setting default properties", "Log file isn't there Setting default properties", "", (String) null);
      fileUtil0.deleteFile("Log file isn't there Setting default properties");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchBNFile("J/rMue1poiZi@`~&K", "~^$ox)wuMNk%'Of", "DgZW");
      fileUtil0.downloadBrowseNodeFile("~^$ox)wuMNk%'Of", "(\"w!= ,|lJ%W#7]B ", "(\"w!= ,|lJ%W#7]B ", "GFn(q7+");
      fileUtil0.getSimilarItems("", "");
      fileUtil0.getASINFile(".", ".", ".", "'1X[2r\\']5");
      fileUtil0.getBrowseNodeFile("J/rMue1poiZi@`~&K", "", "(\"w!= ,|lJ%W#7]B ");
      fileUtil0.deleteFile("E]\"e:{-{/G");
      fileUtil0.fetchThirdPartySearchFile("~^$ox)wuMNk%'Of", "", "", "");
      LoadProperties.instance();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      fileUtil0.getAccessories("%,zrAETLl*(>x</", arrayList0);
      fileUtil0.downloadKeywordSearchFile("{Eyfk})7Bh>Y", "'1X[2r\\']5", "DgZW", "");
      fileUtil0.downloadCart("");
      arrayList0.add((Object) "");
      arrayList0.add((Object) null);
      fileUtil0.downloadBrowseNodeFile("DgZW", "", "", "");
      fileUtil0.getAccessories("DgZW", arrayList0);
      fileUtil0.fetchAccessories("", arrayList0);
      File file0 = fileUtil0.getSimilarItems("GFn(q7+", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      fileUtil0.fetchAccessories("", arrayList0);
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("", "KeywordSearch=", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.oldestAge = (-2308L);
      fileUtil0.deleteFile("D");
      fileUtil0.downloadThirdPartySearchFile("", "", "associateID", "");
      fileUtil0.fetchBlendedSearchFile("D", "D");
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("D", "k`se9qU25ZrWuv");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.downloadSimilaritesFile("`Ve3LA\"ivxfqxh|?^)", "`Ve3LA\"ivxfqxh|?^)", "z$mrt!Qa");
      fileUtil0.downloadCart("z$mrt!Qa");
      fileUtil0.getBrowseNodeFile(")JIN_Y|nIJN6U5f~Gm", ")JIN_Y|nIJN6U5f~Gm", ")JIN_Y|nIJN6U5f~Gm");
      fileUtil0.getASINFile("dP", "dP", "dP", "z$mrt!Qa");
      fileUtil0.downloadCart("dP");
      fileUtil0.fetchKeywordSearchFile("associateID", "z$mrt!Qa", "popcornmonste2-20", "associateID");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.add((Object) "l");
      fileUtil0.downloadAccessoriesFile("dP", arrayList0, "uVU|`+6Fgi`");
      fileUtil0.downloadSimilaritesFile("3rd_", "`Ve3LA\"ivxfqxh|?^)", "");
      fileUtil0.fetchASINFile("J@)\"2tzxj^!f{SY(z8", "", "", "");
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("W`gA%|", "Q\u0007,S$otdoF#9&,H,", "l", (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.downloadKeywordSearchFile("!FRJ`JUqk", "'hs(N>}YvL", "'hs(N>}YvL", "!FRJ`JUqk");
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("k_", "k_", "k_", "!FRJ`JUqk", "!FRJ`JUqk", "!FRJ`JUqk");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      fileUtil0.getAccessories("|;o]/Tr6<", arrayList0);
      fileUtil0.fetchGenericSearchFile("AwP mW<'LhvM:4", "ls;", "AwP mW<'LhvM:4", "ls;", "-", "amazonServerURL");
      boolean boolean0 = fileUtil0.isAgeGood((File) null);
      LoadProperties.instance();
      arrayList0.add("h%:zEz7d");
      fileUtil0.cacheDir = "/";
      fileUtil0.getSimilarItems("", "");
      fileUtil0.getASINFile("", "", "", "");
      fileUtil0.downloadBrowseNodeFile("|;o]/Tr6<", "|;o]/Tr6<", "AwP mW<'LhvM:4", (String) null);
      fileUtil0.fetchBlendedSearchFile("ls;", (String) null);
      fileUtil0.isAgeGood((File) null);
      fileUtil0.fetchKeywordSearchFile((String) null, "", "ls;", "ls;");
      boolean boolean1 = fileUtil0.downloadBrowseNodeFile(")oy", "AwP mW<'LhvM:4", "amazonServerURL", "");
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchBlendedSearchFile(">|bVmE*sY~'ps[4~q", "HMF*VJvbI(!y");
      File file0 = fileUtil0.downloadGenericSearchFile(">|bVmE*sY~'ps[4~q", ">|bVmE*sY~'ps[4~q", "f=xml", "HMF*VJvbI(!y", "HMF*VJvbI(!y", "A,E_l%+mrPZUq1L\"");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("d9", "d9");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.downloadCart("cacheDir");
      fileUtil0.fetchKeywordSearchFile("3QC\tXmD&;Inzo", "cacheDir", "!enFRvOEQ%Xt", "KR^PKu,$:{xG_l");
      fileUtil0.renameFile("!enFRvOEQ%Xt", "!enFRvOEQ%Xt");
      fileUtil0.downloadBlendedSearchFile("!enFRvOEQ%Xt", "!enFRvOEQ%Xt");
      fileUtil0.getBrowseNodeFile("!enFRvOEQ%Xt", "!enFRvOEQ%Xt", "!enFRvOEQ%Xt");
      fileUtil0.downloadCart("GDx\u0004f_quB{F,ZXe2\"");
      fileUtil0.downloadOneASINFile("http://xml.amazon.net/onca/xml3", "http://xml.amazon.net/onca/xml3", "", "!enFRvOEQ%Xt", "");
      fileUtil0.downloadBrowseNodeFile("cacheDir", "", "http://xml.amazon.net/onca/xml3", "http://xml.amazon.net/onca/xml3");
      fileUtil0.downloadThirdPartySearchFile("KR^PKu,$:{xG_l", "3QC\tXmD&;Inzo", "", "kh,NS~#");
      fileUtil0.downloadKeywordSearchFile("all", (String) null, "all", "http://xml.amazon.net/onca/xml3");
      File file0 = fileUtil0.downloadKeywordSearchFile("cacheDir", "", "cacheDir", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.downloadOneASINFile("jVJ>", "", "", "(:l", "(:l");
      fileUtil0.fetchSimilarItems(".xml", "all");
      fileUtil0.getASINFile("(:l", "", "K", "Lf5Xsv`2y7");
      fileUtil0.fetchThirdPartySearchFile("ZhzQ[IzyM6Tgc", "jVJ>", "ZhzQ[IzyM6Tgc", "x6[|`)");
      fileUtil0.fetchASINFile("", "#+qnqZIyo", "#+qnqZIyo", "#+qnqZIyo");
      fileUtil0.deleteFile("lTYX");
      fileUtil0.downloadBlendedSearchFile("x6[|`)", "lTYX");
      fileUtil0.fetchKeywordSearchFile("nx(dzP0/9O$yo@\u0006", "(:l", "u@lU\"fezP>7/S", "");
      fileUtil0.renameFile("%(aRuQCt<j8", "r]");
      fileUtil0.deleteFile("jVJ>");
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=Log file is@'t there Setting default properties&type=Log file is@'t there Setting default properties&offerpage=Log file is@'t there Setting default properties&offer=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "Log file is@'t there Setting default properties");
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("Log file is@'t there Setting default properties", "Log file is@'t there Setting default properties", "", "Log file is@'t there Setting default properties");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&FgAAW6I=FgAAW6I&mode=FgAAW6I&type=F&page=FgAAW6I&offer=F&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "j$~");
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("FgAAW6I", "FgAAW6I", "FgAAW6I", "F", "FgAAW6I", "F");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/NULL_NULL_NULL.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile((String) null, (String) null, (String) null);
      assertEquals("NULL_NULL_NULL.XML", file0.getName());
      assertNotNull(file0);
      assertTrue(file0.canWrite());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_MRBD{O.YD.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "m8*p@fx_E");
      File file0 = fileUtil0.getSimilarItems("MRBd{O.yd", "MRBd{O.yd");
      assertEquals(9L, file0.length());
      assertNotNull(file0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_T=.XML");
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte)109;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("t=", "t=");
      assertEquals(2L, file0.length());
      assertNotNull(file0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=&type=&page=&offerstatus=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "bgVL]:0");
      fileUtil0.fetchThirdPartySearchFile("", "", "", "");
      fileUtil0.renameFile("", "25mE$|+\"NEF!^yAw\"Y");
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+_0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+_0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+_0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+", "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+", "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+", "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_NULL.XML");
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-58);
      byteArray0[2] = (byte)25;
      byteArray0[3] = (byte)95;
      byteArray0[4] = (byte) (-21);
      byteArray0[5] = (byte) (-73);
      byteArray0[6] = (byte)100;
      byteArray0[7] = (byte)97;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories((String) null, arrayList0);
      assertEquals(8, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_NULL.XML");
      byte[] byteArray0 = new byte[26];
      byteArray0[2] = (byte)0;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories((String) null, arrayList0);
      assertEquals(26, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch={i&mode={i&type=lite&page={i&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "`yCS1");
      File file0 = fileUtil0.getBrowseNodeFile("{i", "{i", "{i");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&KeywordSearch=1&mode=1&type=1&page=1&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "bFx\"H6vxY");
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.downloadCart("9CI1C2o7j");
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("1", "1", "1", "1");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=1&type=lite&offerpage=Rm %gJ>\\M& Ot{^Dxj0&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "Rm %gJ>M& Ot{^Dxj0");
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("1", "Rm %gJ>M& Ot{^Dxj0");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=net.kencochrane.a4j.util.LoadProperties&type=net.kencochrane.a4j.util.LoadProperties&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "net.kencochrane.a4j.util.LoadProperties");
      fileUtil0.fetchBlendedSearchFile("net.kencochrane.a4j.util.LoadProperties", "net.kencochrane.a4j.util.LoadProperties");
      File file0 = fileUtil0.getSimilarItems("o6nz4Qoz+> &", "o6nz4Qoz+> &");
      assertNull(file0);
  }
}