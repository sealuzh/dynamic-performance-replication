/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 14:10:09 GMT 2018
 */

package net.kencochrane.a4j.file;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import net.kencochrane.a4j.file.FileUtil;
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
      fileUtil0.fetchSimilarItems("", "");
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("", "", "", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("O-K;", "O-K;");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchThirdPartySearchFile("_-_mo?9vfE n", "_-_mo?9vfE n", "_-_mo?9vfE n", "_-_mo?9vfE n");
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("_-_mo?9vfE n", "_-_mo?9vfE n", "_-_mo?9vfE n", "_-_mo?9vfE n");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("", "");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("LwPo?", "LwPo?");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("");
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("", "", "", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.isAgeGood((File) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/]CBFBG^I?!0_]CBFBG^I?!0_]CBFBG^I?!0.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "S%(K|UP2QJu7W");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("]CBfBG^I?!0", "]CBfBG^I?!0", "]CBfBG^I?!0");
      assertEquals(14, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_*<G!A-~*WVKRLCUXW.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      fileUtil0.fetchSimilarItems("*<G!A-~*WvkRLCuXW", "*<G!A-~*WvkRLCuXW");
      File file0 = fileUtil0.downloadCart("*<G!A-~*WvkRLCuXW");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=+&type=Log file isn't t)ere(Setting default properties&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "Log file isn't t)ere(Setting default properties");
      fileUtil0.fetchASINFile("Log file isn't t)ere(Setting default properties", "Log file isn't t)ere(Setting default properties", "Log file isn't t)ere(Setting default properties", "Log file isn't t)ere(Setting default properties");
      fileUtil0.downloadBlendedSearchFile(" ", "Log file isn't t)ere(Setting default properties");
      fileUtil0.fetchGenericSearchFile(" ", "Log file isn't t)ere(Setting default properties", "Log file isn't t)ere(Setting default properties", (String) null, "Log file isn't t)ere(Setting default properties", "bOm6j");
      fileUtil0.deleteFile("Log file isn't t)ere(Setting default properties");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.cacheDir = "Log file isn't t)ere(Setting default properties";
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=mJI&/}R]_{9$eIZ&type=f&page=null&offerstatus=7I:}nf~,VVUG&f=xml");
      boolean boolean0 = NetworkHandling.createRemoteTextFile(evoSuiteURL0, "Log file isn't t)ere(Setting default properties");
      fileUtil0.downloadThirdPartySearchFile("mJI&/}R]_{9$eIZ", "f", (String) null, "7I:}nf~,VVUG");
      boolean boolean1 = FileSystemHandling.shouldAllThrowIOExceptions();
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "all");
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("", arrayList0);
      assertEquals(3, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_3RD_.XML");
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.createFolder(evoSuiteFile0);
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&KeywordSearch=3rd_&mode=null&type=*<G!A-~*WvkRLCuXW&page=null&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "*<G!A-~*WvkRLCuXW");
      fileUtil0.fetchKeywordSearchFile("3rd_", (String) null, "*<G!A-~*WvkRLCuXW", (String) null);
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(1);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/___.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "ERSN=NR!7KiFG-Qv2,M");
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchASINFile("", "", "", "");
      File file0 = fileUtil0.getBrowseNodeFile("ERSN=NR!7KiFG-Qv2,M", "", "ERSN=NR!7KiFG-Qv2,M");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=ay}%(4'\"YSpbW&type=lite&offerpage=Log file isn't t)ere(Setting default properties&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "Log file isn't t)ere(Setting default properties");
      fileUtil0.fetchSimilarItems("ay}%(4'\"YSpbW", "Log file isn't t)ere(Setting default properties");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "ay}%(4'\"YSpbW");
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("Log file isn't t)ere(Setting default properties", "Log file isn't t)ere(Setting default properties", "b", "Log file isn't t)ere(Setting default properties");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&lrdI+6A=lrdI%2B6A&mode=*<G!A-~*WvkRLCuXW&type=*<G!A-~*WvkRLCuXW&page=lrdI+6A&offer=null&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "*<G!A-~*WvkRLCuXW");
      fileUtil0.downloadGenericSearchFile("lrdI+6A", "lrdI+6A", "*<G!A-~*WvkRLCuXW", "*<G!A-~*WvkRLCuXW", "lrdI+6A", (String) null);
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("AsinSearch", "lrdI+6A", "lrdI+6A", "cacheLife");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=7I:}nf~,VVUG&mode=&type=lite&page=&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "Log file isn't t)ere(Seting default properties");
      fileUtil0.getASINFile("7I:}nf~,VVUG", "Log file isn't t)ere(Seting default properties", (String) null, "7I:}nf~,VVUG");
      fileUtil0.fetchBNFile("", "7I:}nf~,VVUG", "");
      // Undeclared exception!
      try { 
        fileUtil0.renameFile("", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=Log file isn't t)ere(Setting default properties&type=Log file isn't t)ere(Setting default properties&offerpage=Log file isn't t)ere(Setting default properties&offer=Log file isn't t)ere(Setting default properties&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "Log file isn't t)ere(Setting default properties");
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("Log file isn't t)ere(Setting default properties", "Log file isn't t)ere(Setting default properties", "Log file isn't t)ere(Setting default properties", "Log file isn't t)ere(Setting default properties");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      String string0 = "*<G!A-~*WvkRLCuXW";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/NULL___JNK5 Y.T.UE+R0}AWO.XML");
      String string1 = null;
      FileSystemHandling.appendStringToFile(evoSuiteFile0, (String) null);
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=lrdI+6A&type=lite&offerpage=1&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "*<G!A-~*WvkRLCuXW");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, (String) null);
      ArrayList<String> arrayList0 = new ArrayList<String>();
      ArrayList<Object> arrayList1 = new ArrayList<Object>();
      arrayList0.add("lrdI+6A");
      arrayList0.containsAll(arrayList1);
      fileUtil0.fetchAccessories((String) null, arrayList0);
      MockFile mockFile0 = null;
      try {
        mockFile0 = new MockFile((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }
}