/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 03 00:08:43 GMT 2019
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
  public void test000()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=DId[AMqE=&type=lite&offerpage=>h[NaEhu-IQ&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "v");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("DId[AMqE=", ">h[NaEhu-IQ");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=&type=lite&offerpage=&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/__Q6C4J.XML");
      byte[] byteArray0 = new byte[7];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("", "", "Q6c4j");
      assertEquals(7, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("<ghL\u0002`%di9*b|G!", "Log file isn't there Setting vefault properties", ")+Y");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("&Item.", "uj.ct?rCIaJ&Z8)", "YdJTD5Q{", (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("/", "/");
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/___.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("", "", "", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      FileSystemHandling.setPermissions(evoSuiteFile0, true, false, true);
      File file0 = fileUtil0.getSimilarItems("", "offer=");
      assertNotNull(file0);
      assertEquals("S_.XML", file0.getName());
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_OFP).XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      File file0 = fileUtil0.getAccessories("Ofp)", arrayList0);
      assertNotNull(file0);
      assertEquals("/A_OFP).XML", file0.toString());
      assertTrue(file0.canRead());
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/_PX(D,@LJU+B!_HTTP:/XML.AMAZON.NET/ONCA/XML3_HTTP:/XML.AMAZON.NET/ONCA/XML3.XML");
      byte[] byteArray0 = new byte[3];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      File file0 = fileUtil0.getASINFile("", "http://xml.amazon.net/onca/xml3", "px(d,@lju+b!", "http://xml.amazon.net/onca/xml3");
      assertNotNull(file0);
      assertEquals(3L, file0.length());
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_U*$QP?JNLWX/YEU.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("U*$Qp?JNlWx/YEu", (String) null);
      assertEquals(0, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "I-");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("", "");
      assertEquals(3, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/NULL_NULL_NULL.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile((String) null, (String) null, (String) null);
      assertEquals(0, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_OFP).XML");
      byte[] byteArray0 = new byte[4];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("Ofp)", arrayList0);
      assertEquals(4, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/___.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("", "", "", "");
      assertEquals(0, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      MockFile mockFile0 = new MockFile("cTWq/{?X", ".&gxL,gabLk#:=]9J5r~");
      boolean boolean0 = fileUtil0.isAgeGood(mockFile0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      MockFile mockFile0 = new MockFile((File) null, "J`f-");
      MockFile.createTempFile("J`f-", "_LCd>:)/'F&mm>o]T", (File) mockFile0);
      boolean boolean0 = fileUtil0.isAgeGood(mockFile0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("r*", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems((String) null, (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("", "", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("b_", (String) null, "c_");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile((String) null, "3~4&?Ap", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getAccessories("<ghL\u0002`%di9*b|G!", (ArrayList) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("(_W");
      File file0 = fileUtil0.getAccessories(">Ln?o]&U", arrayList0);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      File file0 = fileUtil0.getAccessories((String) null, arrayList0);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile((String) null, "C@BcKP'7]7zSodbB", "reo!Yu~:;\"o", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile(">Ln?o]&U", "B):JMj*(R;=('3\"k", (String) null, "3~4&?Ap");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile((String) null, (String) null, "", "C@BcKP'7]7zSodbB");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile((String) null, "", "net.kencochrane.a4j.file.FileUtil", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("net.kencochrane.a4j.util.a4jUtil", "y", "IY<17wd!T\"#:Q=I`;W.", (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("?:W_r/G]OBDN<S)K4YE", "a_", "", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("-GW5Sx}HG 2", (String) null, (String) null, "-GW5Sx}HG 2");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile((String) null, (String) null, "[X.=L@3gRA9M", "jX3b?R7@#Xi:Endgofz");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("", "", "", "zWf6H~&puX.nS57q7");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems((String) null, "px(d,@lju+b!");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("86400000", "", "#p-", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("a_", "", "", "a_");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile((String) null, (String) null, (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("", "", "e/:M?", "oM?_F?tZsZXIWWY");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("DiSlY@J6K%O^An.o", "", "", ":y)yeau<gi", (String) null, "$LC\"26+<\"T.?LB");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("ZK4)1", "", (String) null, (String) null, "k_", "e/:M?");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("http://xml.amazon.net/onca/xml3", "http://xml.amazon.net/onca/xml3", "http://xml.amazon.net/onca/xml3", "http://xml.amazon.net/onca/xml3", "http://xml.amazon.net/onca/xml3", "http://xml.amazon.net/onca/xml3");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile((String) null, (String) null, "", "cacheDir", "cacheDir", (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("", "", "", "", "", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("", (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile((String) null, "K+=1[T");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("J|`%TTP", "J|`%TTP");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("\"l(]}0h-?WfzgA", "\"l(]}0h-?WfzgA", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("ay<M:u|7e", (ArrayList) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("ta_");
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("", arrayList0);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile((String) null, (String) null, (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile((String) null, (String) null, "Npub5", "s_");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("", (String) null, (String) null, "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("5HmNg/ZbHl]V.+*dZJ", (String) null, "5HmNg/ZbHl]V.+*dZJ", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile((String) null, "Q6c4j", "lite", ">?*$ud!{M|e!QHl;4");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("", "", "", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("net.kencochrane.a4j.util.LoadProperties", "?Orxqz9_g8WMDkq", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("", "", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile((String) null, (String) null, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("", "#r},@;DQC-?D^;ZU", "@m#m0z`Ey", "", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("SellerSearch=", "ta_", "ta_", (String) null, (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("f9g$J[Xx)i,u'", "N`>=", "", "f9g$J[Xx)i,u'", "k_");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("", (String) null, (String) null, "", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile((String) null, "-o[)4", "-o[)4", "c_", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("offer=", "", "net.kencochrane.a4j.util.a4jUtil", "SimilaritySearch", "0zk=SugAN");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("?<@XS;8~Q4Ro", "?<@XS;8~Q4Ro", "?<@XS;8~Q4Ro", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("3~4&?Ap", (String) null, "", "lufJsA,6rzOM");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("ae!^E_", "", "", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile((String) null, "?", (String) null, "?");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("", "S^</t&YJaMqCpf", "ShoppingCart=remove&f=xml&dev-t=", "Q|");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile(":y)yeau<gi", "", "", "OWg", "", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("y *Fnm^M+Z2N=2Wh", "", "</H(\"kwn>!1H", "", "</H(\"kwn>!1H", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("", "pWg(}VhFGGG1EX>", (String) null, (String) null, "`XZC&B{E4;PaS%9 ", "`~eVr;`/xM_0n15J");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("", (String) null, "OWg", "associateID", "DiSlY@J6K%O^An.o", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile((String) null, ")Ci.@a", "", "ta_", (String) null, "ta_");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart((String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("ta_");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("1hs/sAH{\"No!dKvdj", (String) null, "1hs/sAH{\"No!dKvdj", "1hs/sAH{\"No!dKvdj");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile((String) null, "cacheLife", (String) null, "!{4FRq");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("AsinSearch", "", "px(d,@lju+b!", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("", "", "", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile("mL!}gVc5p", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile((String) null, "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile((String) null, arrayList0, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(0);
      arrayList0.add(integer0);
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("", arrayList0, "popcornmonste2-20");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile((String) null, arrayList0, (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("{{sbm\"6>7j/l", (ArrayList) null, "zl_/`6:?c{gh>i@(z.*");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
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
  public void test089()  throws Throwable  {
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
  public void test090()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "I-");
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("", "&Asin.");
      assertNotNull(file0);
      assertEquals(3L, file0.length());
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_OFP).XML");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "Ofp)");
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getAccessories("Ofp)", arrayList0);
      assertNotNull(file0);
      assertEquals(4L, file0.length());
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=&type=)N&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "5Hmg^TZjlHl]V.+*dZJ");
      File file0 = fileUtil0.downloadBlendedSearchFile("", ")N");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/_PX(D,@LJU+B!_HTTP:/XML.AMAZON.NET/ONCA/XML3_HTTP:/XML.AMAZON.NET/ONCA/XML3.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      File file0 = fileUtil0.getASINFile("", "http://xml.amazon.net/onca/xml3", "px(d,@lju+b!", "http://xml.amazon.net/onca/xml3");
      assertNotNull(file0);
      assertEquals("/_PX(D,@LJU+B!_HTTP:/XML.AMAZON.NET/ONCA/XML3_HTTP:/XML.AMAZON.NET/ONCA/XML3.XML", file0.toString());
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=5j$'}25_Q}&T_&h t&type=lite&offerpage=5j$'}25_Q}&T_&h t&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "5j$'}25_Q}&T_&h t");
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("5j$'}25_Q}&T_&h t", "5j$'}25_Q}&T_&h t", "5j$'}25_Q}&T_&h t");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories((String) null, arrayList0);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_OFP).XML");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("Ofp)", arrayList0);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      File file0 = fileUtil0.getAccessories("", arrayList0);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=&Item.&type=&Item.&page=&Item.&offerstatus=&Item.&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "&Ain.");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("&Item.", "&Item.", "&Item.", "&Item.");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&5Hmg/ZjHl]V.+*dZJ=5Hmg%2FZjHl%5DV.%2B*d%7FZJ&mode=5Hmg/ZjHl]V.+*dZJ&type=5Hmg/ZjHl]V.+*dZJ&page=5Hmg/ZjHl]V.+*dZJ&offer=5Hmg/ZjHl]V.+*dZJ&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "5Hmg/ZjHl]V.+*dZJ");
      File file0 = fileUtil0.downloadGenericSearchFile("5Hmg/ZjHl]V.+*dZJ", "5Hmg/ZjHl]V.+*dZJ", "5Hmg/ZjHl]V.+*dZJ", "5Hmg/ZjHl]V.+*dZJ", "5Hmg/ZjHl]V.+*dZJ", "5Hmg/ZjHl]V.+*dZJ");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&KeywordSearch=%22l%28%5D%7D0h-%3FWf5gA&mode=\"l(]}0h-?Wf5gA&type=\"l(]}0h-?Wf5gA&page=Q6c4j&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "a_");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("\"l(]}0h-?Wf5gA", "\"l(]}0h-?Wf5gA", "\"l(]}0h-?Wf5gA", "Q6c4j");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("<ghL\u0002`%di9*b|G!", "<ghL\u0002`%di9*b|G!", "<ghL\u0002`%di9*b|G!");
      assertNull(file0);
      
      boolean boolean0 = fileUtil0.isAgeGood(file0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=&mode=&type=lite&page=Q6c4j&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "a_");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("", "", "Q6c4j");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/___.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "cacheDir");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("", "", "", "");
      assertEquals(9, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("", "");
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("bTz9E#=<AN-2", "SimilaritySearch");
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("");
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("gizi");
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=^aAj+V\"8O&type=^aAj+V\"8O&offerpage=^aAj+V\"8O&offer=^aAj+V\"8O&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "^aAj+V\"8O");
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("^aAj+V\"8O", "^aAj+V\"8O", "^aAj+V\"8O", "^aAj+V\"8O");
      assertNull(fileInputStream0);
  }
}
