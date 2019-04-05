/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 17:10:47 GMT 2019
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
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileUtil_ESTest extends FileUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=null&type=lite&offerpage=null&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "SimilaritySearch");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems((String) null, (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/_TPJ<.M_.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      File file0 = fileUtil0.getBrowseNodeFile("", "tPj<.M", "");
      assertNotNull(file0);
      assertEquals("/_TPJ<.M_.XML", file0.toString());
      assertTrue(file0.canRead());
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile(".0123456789", "", "@63{Z0u~u:t9mbnePH", "popcornmonste2-20");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("/", "/");
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("", arrayList0);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_NULL.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "(1Y");
      File file0 = fileUtil0.getSimilarItems((String) null, "(1Y");
      assertNotNull(file0);
      assertEquals(4L, file0.length());
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/&T=_!P:QYE].V_!P:QYE].V.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      File file0 = fileUtil0.getBrowseNodeFile("&t=", "!p:Qye].v", "!p:Qye].v");
      assertFalse(file0.isFile());
      assertNotNull(file0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/&T=_!P:QYE].V_!P:QYE].V.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "tsQ");
      FileSystemHandling.setPermissions(evoSuiteFile0, false, false, false);
      File file0 = fileUtil0.getBrowseNodeFile("&t=", "!p:Qye].v", "!p:Qye].v");
      assertEquals("&T=_!P:QYE].V_!P:QYE].V.XML", file0.getName());
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      byte[] byteArray0 = new byte[1];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      File file0 = fileUtil0.getAccessories("", arrayList0);
      assertNotNull(file0);
      assertEquals(1L, file0.length());
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      File file0 = fileUtil0.getAccessories("", arrayList0);
      assertNotNull(file0);
      assertTrue(file0.canWrite());
      assertFalse(file0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      FileSystemHandling.setPermissions(evoSuiteFile0, true, false, false);
      File file0 = fileUtil0.getAccessories("", arrayList0);
      assertNotNull(file0);
      assertEquals("/A_.XML", file0.toString());
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/4$@(<WF:OAZL:=M_4$@(<WF:OAZL:=M_4$@(<WF:OAZL:=M_4$@(<WF:OAZL:=M.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("4$@(<Wf:oaZL:=m", "4$@(<Wf:oaZL:=m", "4$@(<Wf:oaZL:=m", "4$@(<Wf:oaZL:=m");
      assertNotNull(file0);
      assertEquals("/4$@(<WF:OAZL:=M_4$@(<WF:OAZL:=M_4$@(<WF:OAZL:=M_4$@(<WF:OAZL:=M.XML", file0.toString());
      assertTrue(file0.canRead());
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/LOG FILE ISN'T THERE SETTING DEFAULT PROPERTIES_0NBQ_NULL_LOG FILE ISN'T THERE SETTING DEFAULT PROPERTIES.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, ",Q:5?XnHn5:");
      FileSystemHandling.setPermissions(evoSuiteFile0, true, false, true);
      File file0 = fileUtil0.getASINFile("Log file isn't there Setting default properties", (String) null, "0NbQ", "Log file isn't there Setting default properties");
      assertNotNull(file0);
      assertEquals(12L, file0.length());
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_NULL.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems((String) null, "k_");
      assertEquals(0, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_NULL.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems((String) null, "!HKgZ4%tC\">i@");
      assertEquals(1, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/GE/IZC;_GE/IZC;_GE/IZC;.XML");
      byte[] byteArray0 = new byte[7];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("GE/iZc;", "GE/iZc;", "GE/iZc;");
      assertEquals(7, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      byte[] byteArray0 = new byte[2];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("", arrayList0);
      assertEquals(2, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/Z_Z_Z_Z.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("Z", "Z", "Z", "Z");
      assertEquals(0, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/Z_Z_Z_Z.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("Z", "Z", "Z", "Z");
      assertEquals(1, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("", "");
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/&T=_!P:QYE].V_!P:QYE].V.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "l]]MAb,6]-");
      File file0 = fileUtil0.getBrowseNodeFile("&t=", "!p:Qye].v", "!p:Qye].v");
      assertNotNull(file0);
      
      boolean boolean0 = fileUtil0.isAgeGood(file0);
      assertEquals(10L, file0.length());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      System.setCurrentTimeMillis((-5044L));
      FileUtil fileUtil0 = new FileUtil();
      File file0 = MockFile.createTempFile("Rv%>$-k/", "Log file isn't there Setting default properties");
      boolean boolean0 = fileUtil0.isAgeGood(file0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      MockFile mockFile0 = new MockFile(".+DmG2X(Ky?+G*T");
      boolean boolean0 = fileUtil0.isAgeGood(mockFile0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      File file0 = fileUtil0.getAccessories("", arrayList0);
      assertNotNull(file0);
      
      boolean boolean0 = fileUtil0.isAgeGood(file0);
      assertFalse(boolean0);
      assertEquals("/A_.XML", file0.toString());
      assertFalse(file0.isFile());
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("AI1:F66cE)9Ou|", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("", ">MG/");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("8S9dev", "QDE%*T{=?)>wxveZ)", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile((String) null, "", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("", (String) null, "cX F;lG2\"");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileUtil fileUtil0 = new FileUtil();
      Integer integer0 = new Integer(3340);
      arrayList0.add((Object) integer0);
      File file0 = fileUtil0.getAccessories("", arrayList0);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getAccessories((String) null, (ArrayList) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("8S9dev", "8S9dev", (String) null, "cacheLife");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("10:/]9-WF{+=!y2@n", "", "", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile((String) null, ")@'e", "\u0001ZB n", "\u0001ZB n");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("", "t wa)|pi74}", "", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("", (String) null, (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile((String) null, (String) null, "", "LQ2(]BAgm@");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("d$@(<Wf:1aZL:=m", "d$@(<Wf:1aZL:=m", "d$@(<Wf:1aZL:=m", "d$@(<Wf:1aZL:=m");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("-", (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("B8o$%*JqQ5{9CDA", "pamazonwServerURL", "B8o$%*JqQ5{9CDA", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("HIKm`>@bEjG0u+NbV!", (String) null, "", "#`u>?ntR");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("^.A0s=S*?!@z|", (String) null, (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("", "", "c_", (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile((String) null, "k_", "t.O(yEvV", "k_");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("Z", "Z", "", "", "", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("DUMwQqoh5,Q ", "", "KevICs'W", "offer=", (String) null, "{B%^g");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("86400000", "", "AsinSearch", "", "#i:W9NXE9ynb/X{jE", "L]W;");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile((String) null, (String) null, (String) null, (String) null, "\u0001ZB n", (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("", "'9PM", "", "'9PM", "", "3[\"JjZe&[:^F-");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile((String) null, (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile((String) null, "net.kencochrane.a4j.data.Query");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile((String) null, "#a8ldv2?]9DR#L'{", "R={g9m=0w2H6}m+e1");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("&Item.", "&Item.", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("", "", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("popcornmonste2-20", (ArrayList) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("");
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories((String) null, arrayList0);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile(".xml", "^0xsZDZyj3I3", (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("\"Z?GUQocu", (String) null, "Log file isn't there Setting default properties", "\"Z?GUQocu");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile((String) null, "]9-]uoHfrAWj`$ $Y;j", "]9-]uoHfrAWj`$ $Y;j", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("", "", "", (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("H]==\"\u0000jEV`", "idbt2j0si,WFE$VGr", (String) null, (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("an<-", (String) null, "'9PM", "U");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile((String) null, "", "_n{wTz#YQ09J|9D", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("", "", "", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("", "", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile((String) null, (String) null, "8:-VF+'>q`yS<BXe");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("", "", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("", "n0z>TXC6)+X*Dy", "j0.eMW`O{Bnhl=b", (String) null, (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("", (String) null, (String) null, "#sWk5T2O", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("", "", "", "", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("Z`=yS#RI)", "", "86400000", "cacheDir", ";<@IjVa'");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile((String) null, "V+=[dYP=r<XB:4", "V+=[dYP=r<XB:4", "", "x?loCGcBDc,{@");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("Cw", "mgl^_'X", "amazonServerURL", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("", "e5y?&A72&SI[O .w@p", "/", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile((String) null, (String) null, (String) null, "IjeOq8wjOyC!$B&A*");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("", "", "", "Gpr");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("", "all", "URLSeperator", "", (String) null, "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("rr1O", "{Orr#M3#wub%et.lnu*", "rr1O", (String) null, (String) null, (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("R976", (String) null, (String) null, "ts_", "rJW", "kDw#5%+\"KsB_N\"9C");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile((String) null, "", "", "", "L'5", "jn%[,YzwpFU");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("", "HIKm`>@bEjG0u+NbV!", "", "HRwd]vCC}h\"/w};l'{", "", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart((String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("", "", "", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile((String) null, "G!dt", (String) null, (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile((String) null, (String) null, "_amMwLy", "ShoppingCart=add&f=xml&dev-t=");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("(1Y", "(1Y", "(1Y", "(1Y");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile((String) null, (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile("u[.KH|mu.k[V", "Psj ");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("#7HxQ)dHC>|q~6Gk,", arrayList0, "#7HxQ)dHC>|q~6Gk,");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("!\tz=h*STXo");
      boolean boolean0 = fileUtil0.downloadAccessoriesFile((String) null, arrayList0, (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("c", (ArrayList) null, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("", arrayList0, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      // Undeclared exception!
      try { 
        fileUtil0.renameFile((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      // Undeclared exception!
      try { 
        fileUtil0.deleteFile((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_NULL.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems((String) null, (String) null);
      assertTrue(file0.canRead());
      assertNotNull(file0);
      assertEquals("/S_NULL.XML", file0.toString());
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile("", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("AsinSearch");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=y;vCKB*YfJ/\"d|(cv&type=lite&offerpage=y;vCKB*YfJ/\"d|(cv&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "b2~JdaF_)DFXVi-N'V^");
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("y;vCKB*YfJ/\"d|(cv", "y;vCKB*YfJ/\"d|(cv", "y;vCKB*YfJ/\"d|(cv");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_NULL.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems((String) null, (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("", arrayList0);
      assertEquals(0, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      File file0 = fileUtil0.getAccessories("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+", arrayList0);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=&type=&page=&offerstatus=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "Fpamazonw{ServerUL");
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("", "", "", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&Z=Z&mode=Z&type=Z&page=Z&offer=Z&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "gI>{fu])',)}");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("Z", "Z", "Z", "Z", "Z", "Z");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&KeywordSearch=%7BOrr%23Mt3%23wub%25et.lnu%3C&mode={Orr#Mt3#wub%et.lnu<&type={Orr#Mt3#wub%et.lnu<&page={Orr#Mt3#wub%et.lnu<&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "{Orr#Mt3#wub%et.lnu<");
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("{Orr#Mt3#wub%et.lnu<", "{Orr#Mt3#wub%et.lnu<", "{Orr#Mt3#wub%et.lnu<", "{Orr#Mt3#wub%et.lnu<");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=Fpamazonw%7BServerUL&type=Fpamazonw{ServerUL&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "Fpamazonw{ServerUL");
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("Fpamazonw{ServerUL", "Fpamazonw{ServerUL");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/NULL_NULL_NULL.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile((String) null, (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=null&mode=null&type=lite&page=null&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "^.A0s=S*?!@z|");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile((String) null, (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/Z_Z_Z_Z.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("Z", "Z", "Z", "Z");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("d$@(<Wf:1aZL:=m", "d$@(<Wf:1aZL:=m");
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("", "b_");
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.isAgeGood((File) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("");
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=4$@(<Wf:oaZL:=m&type=4$@(<Wf:oaZL:=m&offerpage=4$@(<Wf:oaZL:=m&offer=4$@(<Wf:oaZL:=m&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "gXwqP{9Q~P;^!4R{");
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("4$@(<Wf:oaZL:=m", "4$@(<Wf:oaZL:=m", "4$@(<Wf:oaZL:=m", "4$@(<Wf:oaZL:=m");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("5*`<|r*Swoe");
  }
}
