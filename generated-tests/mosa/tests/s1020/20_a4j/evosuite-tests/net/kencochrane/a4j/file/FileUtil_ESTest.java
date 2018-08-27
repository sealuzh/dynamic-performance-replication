/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 11:25:25 GMT 2018
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
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("_^a]5PQ(CNL[LH", "_^a]5PQ(CNL[LH");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("5.^ rRcb#]9=R&v)=", "5.^ rRcb#]9=R&v)=");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("ta_", arrayList0);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.isAgeGood((File) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("", "");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=c_&type=c_&offerpage=c_&offer=c_&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, ">SUs>nD)7\"FUkTCD");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("c_", "c_", "c_", "c_");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/__.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("", "", "");
      assertEquals(0, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&KeywordSearch=5.%5E+rRc%7Fb%23%5D9%3DR%29%3D&mode=5.^ rRcb#]9=R)=&type=5.^ rRcb#]9=R)=&page=5.^ rRcb#]9=R)=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "D[wM{p/dQd\"");
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("5.^ rRcb#]9=R)=", "5.^ rRcb#]9=R)=", "5.^ rRcb#]9=R)=", "5.^ rRcb#]9=R)=");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=YB{C\\92`&type=lite&offerpage=YB{C\\92`&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "YB{C92`");
      File file0 = fileUtil0.getSimilarItems("YB{C92`", "YB{C92`");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=&mode=&type=lite&page=&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "9M45PJ.N");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("", "", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=%28g%23r3_Pmwi9b%2F%21&type=(g#r3_Pmwi9b/!&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "(g#r3_Pmwi9b/!");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("(g#r3_Pmwi9b/!", "(g#r3_Pmwi9b/!");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=9?@&type=9?@&page=9?@&offerstatus=2=Ex<uGK\"~_j3CD.#fG&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "d3 Jg]>gd\"!%?");
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("9?@", "9?@", "9?@", "2=Ex<uGK\"~_j3CD.#fG");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_YB{C2`.XML");
      byte[] byteArray0 = new byte[18];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.getSimilarItems("YB{C2`", "YB{C2`");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("YB{C2`", "YB{C2`");
      assertEquals(18, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/C__C__C__C_.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("c_", "c_", "c_", "c_");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_RX36%QS$.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("RX36%qS$", arrayList0);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&=&mode=&type=&page=&offer=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "-&CartId=");
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("", "", "", "", "", "");
      assertNull(fileInputStream0);
  }
}