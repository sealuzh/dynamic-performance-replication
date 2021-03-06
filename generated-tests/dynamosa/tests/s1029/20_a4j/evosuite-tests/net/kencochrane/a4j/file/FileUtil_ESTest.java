/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 04 21:54:32 GMT 2019
 */

package net.kencochrane.a4j.file;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.LinkedList;
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
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("2m1-m-(6OPZi(x>", (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/_)O_DYUHU)OC8F#GD>6N_^7U,*_NULL.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "YH_U dG?]'");
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("", "^7U,*", ")o_dYUhu)Oc8F#gD>6N", (String) null);
      assertEquals(10, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/___.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("", "", "", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("S_X?M-U0K'B^ULMW#@CQGU.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "ts_");
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.cacheDir = "";
      File file0 = fileUtil0.getSimilarItems("x?M-U0k'b^ULMw#@cqGu", "x?M-U0k'b^ULMw#@cqGu");
      assertNotNull(file0);
      assertEquals(3L, file0.length());
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/_NULL_.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "rc>5rcQc(5`/*^");
      File file0 = fileUtil0.getBrowseNodeFile("", (String) null, "");
      assertNotNull(file0);
      assertEquals(1392409281320L, file0.lastModified());
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_)T4RMSNEGRGLE?;NH.XML");
      byte[] byteArray0 = new byte[4];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      File file0 = fileUtil0.getAccessories(")t4RMSNegRgle?;nh", arrayList0);
      assertNotNull(file0);
      assertEquals(4L, file0.length());
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_IG:Q5OGRANF4LX!{.XML");
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("Ig:q5OgrANf4lx!{", "Ig:q5OgrANf4lx!{");
      assertEquals(0, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_UA_.XML");
      byte[] byteArray0 = new byte[4];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("ua_", "ua_");
      assertEquals(4, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/P?<G)=_P?<G)=_P?<G)=.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("p?<g)=", "p?<g)=", "p?<g)=");
      assertEquals(0, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/P?<G)=_P?<G)=_P?<G)=.XML");
      byte[] byteArray0 = new byte[7];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("p?<g)=", "p?<g)=", "p?<g)=");
      assertEquals(7, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_S_.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("s_", arrayList0);
      assertEquals(0, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_)T4RMSNEGRGLE?;NH.XML");
      byte[] byteArray0 = new byte[4];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories(")t4RMSNegRgle?;nh", arrayList0);
      assertEquals(4, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/___.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("", "", "", "");
      assertEquals(0, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("", "");
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/___.XML");
      byte[] byteArray0 = new byte[6];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("", "", "", "");
      assertNotNull(file0);
      
      boolean boolean0 = fileUtil0.isAgeGood(file0);
      assertEquals(6L, file0.length());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      MockFile mockFile0 = new MockFile((File) null, ".xml");
      boolean boolean0 = fileUtil0.isAgeGood(mockFile0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems((String) null, "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("popcornmonste2-20", "@d,TT\u00FE('7b9", (String) null);
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
      File file0 = fileUtil0.getBrowseNodeFile((String) null, (String) null, "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ArrayList<String> arrayList0 = new ArrayList<String>(linkedList0);
      arrayList0.add("");
      File file0 = fileUtil0.getAccessories("b_", arrayList0);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getAccessories((String) null, (ArrayList) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile((String) null, "C3tdPf-1K", "", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("", "", (String) null, "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile((String) null, (String) null, "`", "`");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("", "4WS", (String) null, "z");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("", (String) null, "zV#}(", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile((String) null, "", "", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("", "g_", "", (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems((String) null, ":03?._~!rdXc<u#e");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("<`2<", (String) null, (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("popcornmonste2-20", (String) null, "", "b_");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("Ct3J", "", "LF_kx;hkQjDk<uNfldI", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile((String) null, "6P bDk7)[YCYu-", "", "r3oYqt");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("^!|CA2/^s)D#+", "at~)~f'?QZCA", (String) null, "", "", "jq&KWiynber)L|GML");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile(")KmBV/2|8RnSix_]| ", ")KmBV/2|8RnSix_]| ", ")KmBV/2|8RnSix_]| ", "", "g_", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("$/F'3f", "new", "", "hpeU'.B ~S90e", ":mnNE)&qN9<Sp", "F4}o");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("0+5", (String) null, "%2,vQ&ytX;Ou(", "&Item.", "%2,vQ&ytX;Ou(", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile((String) null, "", (String) null, "popcornmonste2-20", (String) null, "1");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile((String) null, "xq", (String) null, (String) null, "S@]z &J5:v\r`$'r", (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("", "CrxQ", "REC6JH2h:Z!i", "k_", "yxyHK-TOB3&Vd", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile((String) null, (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("QlO~jTQX)nR}", "TtPV(ChDz5|5cy[", (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("b_", "&Hmac=", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("dev-t=", (String) null, "SimilaritySearch");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile((String) null, "", "There is no Properties File Setting to default");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("", "/", "/");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("3rd_", (ArrayList) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("");
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("", arrayList0);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile((String) null, "v", "%2,vQ&ytX;Ou(", (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("", (String) null, "", "T");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("U]E. ak", "U]E. ak", "c$3Bs(ADn>6nE'h@", "Qx");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("hrZUjmQ.oY`O\"k", "-", "/Kx\"1+hKgaUx", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("ts_", (String) null, (String) null, "3rd_");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("ljmyz4G([@h", "", "", "L");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile((String) null, "(hCc-+>##e4", "@35OizYJ-", "amazonServerURL");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("", "s_", "j0m00.6K!Ee~LEja6G", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("dev-t=", "lite", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("", (String) null, "-");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile((String) null, "", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("", "7`FQU@]:", ",unZ-(gX~X", "", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("", "3rd_", (String) null, "lite", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("rc>5rcQc(5`/*^", (String) null, "", (String) null, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("", "", "cB_n^V|3^<?V3", "", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile((String) null, "cF)6!IRTF|eR,d{`", "cF)6!IRTF|eR,d{`", "", "#l;m]MbeSb@C~ibD<");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("", "", "", "lite");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("SimilaritySearch", "ntToAp(;USbf]Z2", "az#zg", "ShoppingCart=modify&f=xml&dev-t=");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile((String) null, (String) null, ">),n5gYI", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile((String) null, (String) null, (String) null, (String) null, "k_", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile((String) null, (String) null, "ntToAp(;USbf]Z2", "\"dW2u6,UXP#%eM`{P", "YU'ZGbP 9^(rN8", "\"dW2u6,UXP#%eM`{P");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("}.9k/y.mQAw:", "", "all", "\"dW2u6,UXP#%eM`{P", "", "g_");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile((String) null, "cacheLife", "", "", "JI&/}R]_{9$eIZ", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("", "new", "x$-jN]&c;o9", "There is no Properties File Setting to default", (String) null, "F4}o");
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
      File file0 = fileUtil0.downloadCart("");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("", "UU/]0m7X]h", "", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile(")o_dYUhu)Oc8F#gD>6N", ")o_dYUhu)Oc8F#gD>6N", ")o_dYUhu)Oc8F#gD>6N", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("", "net.kencochrane.a4j.file.FileUtil", (String) null, "net.kencochrane.a4j.file.FileUtil");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("O1QwN", (String) null, "ta_", "1(<%b");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile((String) null, "all", "", "offerstatus=");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("", "", "YU'ZGbP 9^(rN8", "ntToAp(;USbf]Z2");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile("r6D LP$>x`c", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile((String) null, "ETJ8$");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile("", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("", arrayList0, (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("", arrayList0, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("({#", (ArrayList) null, "\"9&.C");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("Z2yK");
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("Z2yK", arrayList0, "Q;0Nu~LFKC");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>(4065);
      boolean boolean0 = fileUtil0.downloadAccessoriesFile((String) null, arrayList0, "N={hMg{2ydN,=^");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
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
  public void test093()  throws Throwable  {
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
  public void test094()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=Log file isn't there Setting default properties&type=lite&offerpage=Log file isn't there Setting default properties&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "F\"j\"f");
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("Log file isn't there Setting default properties", "Log file isn't there Setting default properties", "s_");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_IG:Q5OGRANF4LX!{.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("Ig:q5OgrANf4lx!{", "http://xml.amazon.net/onca/xml3");
      assertEquals("S_IG:Q5OGRANF4LX!{.XML", file0.getName());
      assertFalse(file0.isFile());
      assertNotNull(file0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_)T4RMSNEGRGLE?;NH.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      File file0 = fileUtil0.getAccessories(")t4RMSNegRgle?;nh", arrayList0);
      assertNotNull(file0);
      assertEquals("A_)T4RMSNEGRGLE?;NH.XML", file0.getName());
      assertTrue(file0.canExecute());
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&1r=%zdbzhN=M%2F%22%3Do&mode=&type=&page=/home/apaniche/performance/Dataset/gordon_scripts/projects/20_a4j&offer=null&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "sVqX~d");
      File file0 = fileUtil0.downloadGenericSearchFile("1r=%zdbzhN", "M/\"=o", "", "", "/home/apaniche/performance/Dataset/gordon_scripts/projects/20_a4j", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("", "", (String) null, "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=%7F%29t4RMSNegRgle%3F%3Bnh&type=xiwr{P>t4o+^G]l4w)w<&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "fnV");
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile(")t4RMSNegRgle?;nh", "xiwr{P>t4o+^G]l4w)w<");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/P?<G)=_P?<G)=_P?<G)=.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("p?<g)=", "p?<g)=", "p?<g)=");
      assertEquals("P?<G)=_P?<G)=_P?<G)=.XML", file0.getName());
      assertTrue(file0.canWrite());
      assertNotNull(file0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=#D/#&mode=x?-Uk'bLMw@cGqG4&type=lite&page=#D/#&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "x?-Uk'bLMw@cGqG4");
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("x?-Uk'bLMw@cGqG4", "#D/#", "#D/#", "x?-Uk'bLMw@cGqG4");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/=->I< G4`_=->I< G4`_=->I< G4`_W]&'G<T}K<VN}C8.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("=->i< G4`", "=->i< G4`", "=->i< G4`", "w]&'G<T}K<Vn}C8");
      assertNotNull(file0);
      assertTrue(file0.exists());
      assertEquals("/=->I< G4`_=->I< G4`_=->I< G4`_W]&'G<T}K<VN}C8.XML", file0.toString());
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("=");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_IG:Q5OGRANF4LX!{.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("Ig:q5OgrANf4lx!{", "Ig:q5OgrANf4lx!{");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("=", (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories((String) null, arrayList0);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_)T4RMSNEGRGLE?;NH.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories(")t4RMSNegRgle?;nh", arrayList0);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      File file0 = fileUtil0.getAccessories("", arrayList0);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=tl_&type=tl_&page=tl_&offerstatus=tl_&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "w~6DI.h");
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("tl_", "tl_", "tl_", "tl_");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("", ",unZ-(gX~X", "net.kencochrane.a4j.file.FileUtil", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=%23&type=#&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "Lo!,ogM@kD");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("#", "#");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/P?<G)=_P?<G)=_P?<G)=.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("p?<g)=", "p?<g)=", "p?<g)=");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=ShoppingCart=clear&f=xml&dev-t=&mode=ShoppingCart=clear&f=xml&dev-t=&type=lite&page=ShoppingCart=clear&f=xml&dev-t=&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "ShoppingCart=clear&f=xml&dev-t=");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("ShoppingCart=clear&f=xml&dev-t=", "ShoppingCart=clear&f=xml&dev-t=", "ShoppingCart=clear&f=xml&dev-t=");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile((String) null, "(Zc`(7px8~|z]4N", (String) null, "k_");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("/", "/");
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("amazonServerURL", "u[$;");
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      MockFile mockFile0 = new MockFile((File) null, "");
      boolean boolean0 = fileUtil0.isAgeGood(mockFile0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.isAgeGood((File) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("");
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=&type=&offerpage=&offer=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, ")LyWmDDJ");
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("", "", "", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("=");
  }
}
