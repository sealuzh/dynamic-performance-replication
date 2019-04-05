/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 02:59:09 GMT 2019
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
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/P;2+WXQK2^*SK__ZN_W{$FANYG CW _.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      File file0 = fileUtil0.getASINFile("p;2+WXQk2^*SK", "zn_W{$FANYg cW ", "", "");
      assertNotNull(file0);
      assertEquals(1L, file0.length());
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("/", "/");
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_TX`N.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("TX`N", "TX`N");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/,_OFFER=_,.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile(",", "offer=", ",");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/-^QRSST_-^QRSST_-^QRSST_-^QRSST.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("-^qRSsT", "-^qRSsT", "-^qRSsT", "-^qRSsT");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_TX`N.XML");
      byte[] byteArray0 = new byte[7];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("TX`N", "");
      assertEquals(7L, file0.length());
      assertNotNull(file0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_{DFQ0Z[DEDKSV3V-?`I.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      File file0 = fileUtil0.getAccessories("{dFq0z[dEDkSV3v-?`i", arrayList0);
      assertNotNull(file0);
      assertEquals(1392409281320L, file0.lastModified());
      assertEquals("/A_{DFQ0Z[DEDKSV3V-?`I.XML", file0.toString());
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_TX`N.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("TX`N", "TX`N");
      assertEquals(0, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_{DFQ0Z[DEDKSV3V-?`I.XML");
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("{dFq0z[dEDkSV3v-?`i", arrayList0);
      assertEquals(0, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_{DFQ0Z[DEDKSV3V-?`I.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "{dFq0z[dEDkSV3v-?`i");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("{dFq0z[dEDkSV3v-?`i", arrayList0);
      assertEquals(20, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      // Undeclared exception!
      try { 
        fileUtil0.renameFile("a4j-config.txt", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      MockFile mockFile0 = new MockFile((File) null, ".8<;u4v6UZ?7hcuG");
      boolean boolean0 = fileUtil0.isAgeGood(mockFile0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      MockFile mockFile0 = new MockFile("", "@rOn<#QUSCHF|");
      boolean boolean0 = fileUtil0.isAgeGood(mockFile0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("&t=", "&t=");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems((String) null, (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("qO^ZN6PpI:3AT)VQuK", (String) null, (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("/evf}Nq%~jK6L-VT", "", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("U)7=QVXz", "", "?i9@<{I/4wH0H");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("", "net.kencochrane.a4j.util.LoadProperties", "k_");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("-");
      File file0 = fileUtil0.getAccessories("", arrayList0);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      File file0 = fileUtil0.getAccessories((String) null, arrayList0);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("", "l8F);f6n 5", "", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("|#b]3J", (String) null, (String) null, "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("", "", "", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      String string0 = "A8cL4^r|2E\\u%Sj0)R'";
      File file0 = fileUtil0.getASINFile((String) null, "cacheDir", "&Hmac=", string0);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("", "", "_", (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("There is no Properties File Setting to default", "p;2+WXQk2^*SK", (String) null, "new");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile((String) null, (String) null, "all", "h&*I68J/i>U}<Lw,U");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("v", (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems((String) null, "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("", "SIEpRuzj-Qf7");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("bhEc-W= jWL>Z;G~(V", "bhEc-W= jWL>Z;G~(V", "", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile((String) null, "", (String) null, "-");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("", (String) null, "", "ShoppingCart=clear&f=xml&dev-t=");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile((String) null, "There is no Properties File Setting to default", "There is no Properties File Setting to default", (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("associateID", "associateID", "associateID", "associateID", "associateID", (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile((String) null, "lite", (String) null, "U OSpbM%l4", "", "U OSpbM%l4");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("", "", "", "", "", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile((String) null, (String) null, (String) null, (String) null, "", "FMi!!@-dL\"iDt");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("", "There is no Properties File Setting to default", "There is no Properties File Setting to default", "", "There is no Properties File Setting to default", "3rd_");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile((String) null, (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("\"6qik3Jl", "\"6qik3Jl");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("cacheLife", "jn]u3#9}2(-%g", (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("s_", (String) null, "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile((String) null, "", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("", "", "JA$Xqv{Ql,8}R=aQ&");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("lite", (ArrayList) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("k_");
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("", arrayList0);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>(0);
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories((String) null, arrayList0);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("URLSeperator", "$T6@i:Ug-8Qoz.", "", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("*mg49)`", (String) null, "b_", ">>5@,mNO~.vFDDI");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile((String) null, "", "", (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("URLSeperator", "jn]u3#9}2(-%g", (String) null, (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("SimilaritySearch", "eV", "'5QRGN`Rk`?", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("", (String) null, "K@ecm_", "b_");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile((String) null, "1", "", "O']");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("", "5+DC5k%ydv }/0x8&", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("", "", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile((String) null, "e2RP{+cE", "3rd_");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("-", (String) null, "8CUs]%I");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("", ">i5(KP}&wj=`4qh(c7U", (String) null, "", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("a4j-config.txt", "a4j-config.txt", (String) null, "a4j-config.txt", "8");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("", "", "all", "", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile((String) null, (String) null, "UA@s,KS{l=", "URLSeperator", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("", "GqNK+OZ6o$pVROEE", "", (String) null, "S@'W`?!N^#");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile(" m%sM*P5YyM(`MU}l", (String) null, "N", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("ts_", "", "Log file isn't there Setting default properties", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile((String) null, "}'!j9", "bdQ*", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("", "SH_FEK^,LBt!!jg_PVk", "", "?E286w]*Il");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("p;2+WXQk2^*SK", "", "associateID", "VoS !qb,8n(w1^5C3", (String) null, "g(1R:");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile(";V^&?$8h-fI4F;Ety", ";V^&?$8h-fI4F;Ety", (String) null, "", "", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("qXb*==P_>SX:", (String) null, "qXb*==P_>SX:", (String) null, "Y6Q]n1^Jsm<1sMGR^", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile((String) null, "", "Y6Q]n1^Jsm<1sMGR^", "5+DC5k%ydv }/0x8&", "Y6Q]n1^Jsm<1sMGR^", "~jM$n");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("", ")ku", "ts_", "3rd_", "*VkN-~0O1", "There is no Properties File Setting to default");
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
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("&Hmac=", "z5D0S", "s_", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("&lYg", "3tf$z~q.C,", "", "net.kencochrane.a4j.util.a4jUtil");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("", (String) null, ",L'x", "I");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile((String) null, "net.kencochrane.a4j.file.FileUtil", (String) null, (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("", "", "V8];{#", "+~_");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile("", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile("cacheDir", ".8<;u4v6UZ?7hcuG");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.add((Object) "associateID");
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("associateID", arrayList0, "}WV*!RrqP6C3`;i)");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile((String) null, arrayList0, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("s_", (ArrayList) null, "s_");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("", arrayList0, (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      // Undeclared exception!
      try { 
        fileUtil0.renameFile((String) null, "");
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
  public void test091()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_{DFQ0Z[DEDKSV3V-?`I.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "{dFq0z[dEDkSV3v-?`i");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      File file0 = fileUtil0.getAccessories("{dFq0z[dEDkSV3v-?`i", arrayList0);
      assertEquals(20L, file0.length());
      assertNotNull(file0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getAccessories("U@", (ArrayList) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("i\\-", "", "i\\-", "RPzsyD+g");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("jNs;R[:YeBZ@8", ":YIOi", "", "SIEpRuzj-Qf7", "=mLkCy)Q*C]*l6@+;^", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("D4vAw9", "D4vAw9", (String) null, (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile((String) null, (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/OFFER=_,_,.XML");
      byte[] byteArray0 = new byte[3];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      File file0 = fileUtil0.getBrowseNodeFile("offer=", ",", ",");
      assertEquals(3L, file0.length());
      assertNotNull(file0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile((String) null, (String) null, "*#Dbxeg");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("v");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_TX`N.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, " !^s=>iY[!X@VnQu?\"/");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("TX`N", "TX`N");
      assertEquals(20, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=TX`N&type=lite&offerpage=TX`N&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, ",");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("TX`N", "TX`N");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_TX`N.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("TX`N", "");
      assertNotNull(file0);
      assertEquals("S_TX`N.XML", file0.getName());
      assertTrue(file0.canRead());
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_{DFQ0Z[DEDKSV3V-?`I.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("{dFq0z[dEDkSV3v-?`i", arrayList0);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=&type=&page=&offerstatus=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "SimiTlaritySearch");
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("", "", "", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("U%b6>`Z|fT(3Pz.", "", "=:", "", (String) null, "ShoppingCart=clear&f=xml&dev-t=");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&KeywordSearch=TX%60N&mode=There is no Properties File Setting to default&type=There is no Properties File Setting to default&page=KeywordSearch=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "%Yd,");
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("TX`N", "There is no Properties File Setting to default", "There is no Properties File Setting to default", "KeywordSearch=");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=&type=oQK$35k`Ctl&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "fK\"b&c;]os rk~W23w{");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("", "oQK$35k`Ctl");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/TA__TA__.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "9M^wo_3e");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("ta_", "ta_", "");
      assertEquals(9, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=ta_&mode=ta_&type=lite&page=&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "J0YD6b&lt");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("ta_", "ta_", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("", "p;2+WXQk2^*SK", (String) null, "3tf$z~q.C,");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/-^QRSST_-^QRSST_-^QRSST_-^QRSST.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "z8IU`m#,YRp[4^@m$");
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("-^qRSsT", "-^qRSsT", "-^qRSsT", "-^qRSsT");
      assertEquals(18, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("", "");
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("U%b6>`Z|fT(3Pz.", "U%b6>`Z|fT(3Pz.");
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      MockFile mockFile0 = new MockFile((File) null, "");
      boolean boolean0 = fileUtil0.isAgeGood(mockFile0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.isAgeGood((File) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("");
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=S2r(#T_Q=d!X&type=oQK$35k`Ctl&offerpage=&offer=S2r(#T_Q=d!X&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "S2r(#T_Q=d!X");
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("S2r(#T_Q=d!X", "oQK$35k`Ctl", "S2r(#T_Q=d!X", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("DCh[>2Vm~");
  }
}
