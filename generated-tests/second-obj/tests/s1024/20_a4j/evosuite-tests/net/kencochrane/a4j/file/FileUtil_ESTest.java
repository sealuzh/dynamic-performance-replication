/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 10:24:18 GMT 2018
 */

package net.kencochrane.a4j.file;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
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
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("0?Hp", "0?Hp", "0?Hp", "0?Hp");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.isAgeGood((File) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("l4b2^3>^zWF", "l4b2^3>^zWF");
      File file0 = fileUtil0.getBrowseNodeFile("l4b2^3>^zWF", "l4b2^3>^zWF", "l4b2^3>^zWF");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("p", "p");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("cacheLife");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.downloadThirdPartySearchFile((String) null, (String) null, (String) null, (String) null);
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile((String) null, (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("page=", "page=", "page=");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("", "");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=&type=null&offerpage=ShoppingCart=clear&f=xml&dev-t=&offer=<-9{m}1Lm\\k=$FQ_U&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "ShoppingCart=clear&f=xml&dev-t=");
      File file0 = fileUtil0.getASINFile("", (String) null, "<-9{m}1Lmk=$FQ_U", "ShoppingCart=clear&f=xml&dev-t=");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, ".xml");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems(".xml", "uvBE{m");
      assertEquals(4, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/PAGE=_PAGE=_PAGE=.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "C[@xKb7`-^^4a");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("page=", "page=", "page=");
      assertEquals(13, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/NULL_NULL_CL<,QX~Y*L5QR3CJ(R_NULL.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "daoMqtb]h#G;mc");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile((String) null, "CL<,qx~Y*l5Qr3Cj(r", (String) null, (String) null);
      assertEquals(14, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_P.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "p");
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("p", arrayList0);
      assertEquals(2, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&KeywordSearch=&mode=&type=&page=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "B4WA");
      fileUtil0.downloadKeywordSearchFile("", "", "", "");
      FileSystemHandling.shouldAllThrowIOExceptions();
      fileUtil0.deleteFile("");
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=CtoV{waY%]vEx)y$&mode=&t=&type=lite&page=null&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "CtoV{waY%]vEx)y$");
      File file0 = fileUtil0.getBrowseNodeFile("&t=", "CtoV{waY%]vEx)y$", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&$QZrrK=%5D1s8&mode=page=&type=cacheLife&page=&t=&offer=__|qVr&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "__|qVr");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("$QZrrK", "]1s8", "page=", "cacheLife", "&t=", "__|qVr");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=FXb}X.R,&type=,&H4[L,Y>)[d&page=FXb}X.R,&offerstatus=FXb}X.R,&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "}S7{");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("FXb}X.R,", ",&H4[L,Y>)[d", "FXb}X.R,", "FXb}X.R,");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=net.kencochrane.a4j.util.LoadProperties@1&type=lite&offerpage=1&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "0^23456789abcdefghijk@mnopqrstuvwxyzABCDEFFHIJKLMNOPQRSTUVWXYZ_-~|+");
      LoadProperties loadProperties0 = LoadProperties.instance();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/TS_0^23456789ABCDEFGHIJK@MNOPQRSTUVWXYZABCDEFFHIJKLMNOPQRSTUVWXYZ_-~|+.XML");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      arrayList0.add((Object) loadProperties0);
      fileUtil0.fetchAccessories("", arrayList0);
      fileUtil0.downloadBlendedSearchFile("0^23456789abcdefghijk@mnopqrstuvwxyzABCDEFFHIJKLMNOPQRSTUVWXYZ_-~|+", "");
      MockFile mockFile0 = new MockFile("");
      assertFalse(mockFile0.isFile());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=r.+U12&type=lite&offerpage=r.+U12&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "a_");
      fileUtil0.getSimilarItems("r.+U12", "r.+U12");
      File file0 = fileUtil0.downloadThirdPartySearchFile("a_", "oy<3B1", "a_", "m4");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=_&type=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      fileUtil0.fetchBlendedSearchFile("_", "");
      File file0 = fileUtil0.getBrowseNodeFile("_", "_", "Wcl?Yo>C^N?)}rO");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_<2F&1)?*O1W`/.XML");
      byte[] byteArray0 = new byte[108];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "8o#OHfR_<G2oSZ!sI}\"");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "8o#OHfR_<G2oSZ!sI}\"");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "8o#OHfR_<G2oSZ!sI}\"");
      fileUtil0.fetchKeywordSearchFile("8o#OHfR_<G2oSZ!sI}\"", "8o#OHfR_<G2oSZ!sI}\"", "8o#OHfR_<G2oSZ!sI}\"", "8o#OHfR_<G2oSZ!sI}\"");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "8o#OHfR_<G2oSZ!sI}\"");
      MockFile mockFile0 = new MockFile("8o#OHfR_<G2oSZ!sI}\"");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "8o#OHfR_<G2oSZ!sI}\"");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "8o#OHfR_<G2oSZ!sI}\"");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      fileUtil0.fetchBlendedSearchFile("8o#OHfR_<G2oSZ!sI}\"", "8o#OHfR_<G2oSZ!sI}\"");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "0129456789abcdefghijklmnopq@stuvwxyzABaD`FGHIJKLMNQPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "0129456789abcdefghijklmnopq@stuvwxyzABaD`FGHIJKLMNQPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "8o#OHfR_<G2oSZ!sI}\"");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "0129456789abcdefghijklmnopq@stuvwxyzABaD`FGHIJKLMNQPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "8o#OHfR_<G2oSZ!sI}\"");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "0129456789abcdefghijklmnopq@stuvwxyzABaD`FGHIJKLMNQPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "0129456789abcdefghijklmnopq@stuvwxyzABaD`FGHIJKLMNQPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0129456789abcdefghijklmnopq@stuvwxyzABaD`FGHIJKLMNQPQRSTUVWXYZ_-~|+");
      MockFile mockFile1 = new MockFile("8o#OHfR_<G2oSZ!sI}\"", "8o#OHfR_<G2oSZ!sI}\"");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "8o#OHfR_<G2oSZ!sI}\"");
      fileUtil0.getSimilarItems("<2f&1)?*o1w`/", "8o#OHfR_<G2oSZ!sI}\"");
      fileUtil0.getAccessories("8o#OHfR_<G2oSZ!sI}\"", (ArrayList) null);
      MockFile mockFile2 = new MockFile("8o#OHfR_<G2oSZ!sI}\"");
      assertEquals(0L, mockFile2.getTotalSpace());
  }
}