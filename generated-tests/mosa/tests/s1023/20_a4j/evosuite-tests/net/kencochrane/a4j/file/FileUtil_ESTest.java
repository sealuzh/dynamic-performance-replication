/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 14:30:02 GMT 2018
 */

package net.kencochrane.a4j.file;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import net.kencochrane.a4j.file.FileUtil;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
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
      boolean boolean0 = fileUtil0.isAgeGood((File) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile(":", ":");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("u", arrayList0);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("KeywordSearch=", "KeywordSearch=");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile(":", ":", ":");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("", "");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("", arrayList0);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/__.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("", "", "");
      assertEquals(0, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/G-C`DG-D_G-C`DG-D_G-C`DG-D_G-C`DG-D.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("G-c`DG-D", "G-c`DG-D", "G-c`DG-D", "G-c`DG-D");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch={dps3&type=lite&offerpage=l\"&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "{dps3");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("{dps3", "l\"");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=G-c`DG-D&type=G-c`DG-D&offerpage=G-c`DG-D&offer=G-c`DG-D&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "F[f");
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("G-c`DG-D", "G-c`DG-D", "G-c`DG-D", "G-c`DG-D");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&=&mode=&type=&page=&offer=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "ShoppingCart=get&f=xml&dev-t=");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("", "", "", "", "", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=null&mode=null&type=lite&page=null&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "/&4qQPjC$");
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile((String) null, (String) null, (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=5l&type=5l&page=5l&offerstatus=5l&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "g5Iu$U02lD");
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("5l", "5l", "5l", "5l");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=ShoppingCart%3Dadd%26f%3Dxml%26dev-t%3D&type=ShoppingCart=add&f=xml&dev-t=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "AsinSr=\"earch");
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile("ShoppingCart=add&f=xml&dev-t=", "ShoppingCart=add&f=xml&dev-t=");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&KeywordSearch=8&mode=8&type=8&page=8&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "1> 1Z(^K\"6B5hs");
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("8", "8", "8", "8");
      assertNull(fileInputStream0);
  }
}
