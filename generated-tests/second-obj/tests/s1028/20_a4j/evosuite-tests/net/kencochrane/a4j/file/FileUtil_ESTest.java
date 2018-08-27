/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 13:51:13 GMT 2018
 */

package net.kencochrane.a4j.file;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import net.kencochrane.a4j.file.FileUtil;
import net.kencochrane.a4j.util.LoadProperties;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
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
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("``+#dxbtnaLyEz(xe", arrayList0);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("", "");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("('}h!s0&-}a8,Y/Hz", "('}h!s0&-}a8,Y/Hz");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_V.XML");
      fileUtil0.fetchGenericSearchFile("V", "b", "b", "b", "b", "V");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "b");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("V", "V");
      assertEquals(1, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.downloadCart("V");
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=V&type=V&page=;:%+QY%&offerstatus=D\"{tG[*7L&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "V");
      fileUtil0.fetchThirdPartySearchFile("V", "V", ";:%+QY%", "D\"{tG[*7L");
      fileUtil0.getBrowseNodeFile("V", "b_", "V");
      File file0 = fileUtil0.downloadBlendedSearchFile(";:%+QY%", "V");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileSystemHandling.shouldAllThrowIOExceptions();
      LoadProperties.instance();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S__OFFER=_OFFER=_P_&2PTT73ESQ.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "cacheLife");
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("s_", "offer=", "offer=", "p_&2pTt73eSQ");
      assertNotNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&=&mode=0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+&type=&page=0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+&offer=0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      MockFile mockFile0 = new MockFile("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+", "");
      fileUtil0.fetchGenericSearchFile("", "", "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+", "", "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+", "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("", "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("``+#dxbtnaLyEz(xe");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_``+#DXBTNALYEZ(XE.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "YBUGFC%?1xc^5");
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("``+#dxbtnaLyEz(xe", arrayList0);
      assertEquals(13, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=g_&type=g_&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "ShoppingCart=add&f=xml&dev-t=");
      fileUtil0.downloadBlendedSearchFile("g_", "g_");
      File file0 = fileUtil0.downloadThirdPartySearchFile("g_", "g_", "E @L5L2S%k.", "g_");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=&type=&offerpage=``+#dxbtnaLyEz(xe&offer=4g$`<rTB>&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "}|OP{$/-yAdB<HYA");
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_``+#DXBTNALYEZ(XE.XML");
      FileSystemHandling.setPermissions(evoSuiteFile0, true, true, true);
      File file0 = fileUtil0.getASINFile("", "", "4g$`<rTB>", "``+#dxbtnaLyEz(xe");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&KeywordSearch=673NU_p%7B%3B+%3BSm%2Fh%3D%2F0&mode=0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+&type=673NU_p{; ;Sm/h=/0&page=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      fileUtil0.downloadCart("673NU_p{; ;Sm/h=/0");
      fileUtil0.fetchGenericSearchFile("", "", "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+", "", "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+", "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("673NU_p{; ;Sm/h=/0", "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+", "673NU_p{; ;Sm/h=/0", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchBNFile(";8~2*4SCHemT*?W_", "ta_", ";8~2*4SCHemT*?W_");
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=&type=lite&offerpage=#{3+r3l&offer=all&f=xml");
      fileUtil0.fetchThirdPartySearchFile("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+", "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+", "", "#{3+r3l");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      fileUtil0.downloadCart("673NU_p{; ;Sm/h=/0");
      fileUtil0.isAgeGood((File) null);
      fileUtil0.fetchGenericSearchFile("", "", "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+", "", "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+", "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      fileUtil0.fetchSimilarItems("", "#{3+r3l");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      assertEquals(0, arrayList0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=c_&mode=c_&type=lite&page=c_&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "Eo`LpdIX8ji)");
      File file0 = fileUtil0.getBrowseNodeFile("c_", "c_", "c_");
      assertNull(file0);
      
      boolean boolean0 = fileUtil0.isAgeGood((File) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      LoadProperties.instance();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/C__C__C_.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      MockFile mockFile0 = new MockFile("c_");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("c_", "c_", "c_");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=&type=lite&offerpage=1&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "Ak^ymLAMdcP;5krXAH");
      arrayList0.add("");
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.pollFirst();
      arrayList0.addAll((Collection<? extends String>) linkedList0);
      fileUtil0.getAccessories("", arrayList0);
      ArrayList<Object> arrayList1 = new ArrayList<Object>();
      assertEquals(0, arrayList1.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_NULL.XML");
      byte[] byteArray0 = new byte[152];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "http://xml.amazon.net/onca/xml3");
      LoadProperties.instance();
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "Peb|xFEUF(x9Kn}#)$]a");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "http://xml.amazon.net/onca/xml3");
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "Peb|xFEUF(x9Kn}#)$]a");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "http://xml.amazon.net/onca/xml3");
      fileUtil0.fetchKeywordSearchFile("http://xml.amazon.net/onca/xml3", "Peb|xFEUF(x9Kn}#)$]a", "http://xml.amazon.net/onca/xml3", "Peb|xFEUF(x9Kn}#)$]a");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "Peb|xFEUF(x9Kn}#)$]a");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "Peb|xFEUF(x9Kn}#)$]a");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "Peb|xFEUF(x9Kn}#)$]a");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "http://xml.amazon.net/onca/xml3");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "http://xml.amazon.net/onca/xml3");
      fileUtil0.fetchAccessories((String) null, arrayList0);
      fileUtil0.downloadThirdPartySearchFile("Peb|xFEUF(x9Kn}#)$]a", "Peb|xFEUF(x9Kn}#)$]a", "http://xml.amazon.net/onca/xml3", "Peb|xFEUF(x9Kn}#)$]a");
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("Peb|xFEUF(x9Kn}#)$]a", "http://xml.amazon.net/onca/xml3", "http://xml.amazon.net/onca/xml3", "Peb|xFEUF(x9Kn}#)$]a");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/PEB|XFEUF(X9KN}#)$]A__NULL_NULL.XML");
      byte[] byteArray0 = new byte[152];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      LoadProperties.instance();
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "http://xml.amazon.net/onca/xml3");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "http://xml.amazon.net/onca/xml3");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "http://xml.amazon.net/onca/xml3");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "Peb|xFEUF(x9Kn}#)$]a");
      fileUtil0.fetchKeywordSearchFile("http://xml.amazon.net/onca/xml3", "Peb|xFEUF(x9Kn}#)$]a", "http://xml.amazon.net/onca/xml3", "Peb|xFEUF(x9Kn}#)$]a");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "Peb|xFEUF(x9Kn}#)$]a");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "Peb|xFEUF(x9Kn}#)$]a");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "Peb|xFEUF(x9Kn}#)$]a");
      NetworkHandling.createRemoteTextFile((EvoSuiteURL) null, "Peb|xFEUF(x9Kn}#)$]a");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "http://xml.amazon.net/onca/xml3");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "http://xml.amazon.net/onca/xml3");
      fileUtil0.downloadThirdPartySearchFile("Peb|xFEUF(x9Kn}#)$]a", "l\"GRZUJGr~mAU", "http://xml.amazon.net/onca/xml3", "Peb|xFEUF(x9Kn}#)$]a");
      fileUtil0.fetchBlendedSearchFile((String) null, "l\"GRZUJGr~mAU");
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("Peb|xFEUF(x9Kn}#)$]a", (String) null, "", (String) null);
      assertEquals(1003, fileInputStream0.available());
  }
}