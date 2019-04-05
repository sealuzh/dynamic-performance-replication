/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 20:13:59 GMT 2019
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
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      FileUtil fileUtil0 = new FileUtil();
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/NULL_H-}K&JW'F`'^[BX_.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile((String) null, "h-}K&JW'f`'^[bX", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("", arrayList0);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/Q7NMS0Z M9!)'K`_Q7NMS0Z M9!)'K`_Q7NMS0Z M9!)'K`_Q7NMS0Z M9!)'K`.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("Q7nmS0z M9!)'K`", "Q7nmS0z M9!)'K`", "Q7nmS0z M9!)'K`", "Q7nmS0z M9!)'K`");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      FileUtil fileUtil0 = new FileUtil();
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "net.kencochrane.a4j.util.a4jUtil");
      File file0 = fileUtil0.getSimilarItems("", ": +a/K5&|t");
      assertEquals(32L, file0.length());
      assertNotNull(file0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/__NULL.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      File file0 = fileUtil0.getBrowseNodeFile("", "", (String) null);
      assertEquals("__NULL.XML", file0.getName());
      assertNotNull(file0);
      assertTrue(file0.canExecute());
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_/.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "_");
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      File file0 = fileUtil0.getAccessories("/", arrayList0);
      assertEquals(1L, file0.length());
      assertNotNull(file0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      FileUtil fileUtil0 = new FileUtil();
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "ShoppingCar=get&f=xml&dev-=");
      FileSystemHandling.setPermissions(evoSuiteFile0, true, false, false);
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      File file0 = fileUtil0.getAccessories("", arrayList0);
      assertNotNull(file0);
      assertEquals("A_.XML", file0.getName());
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/86400000_D?W&,R#S.<=I=,V4 _VA5-_D?W&,R#S.<=I=,V4 .XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      File file0 = fileUtil0.getASINFile("86400000", "va5-", "d?w&,r#s.<=i=,V4 ", "d?w&,r#s.<=i=,V4 ");
      assertNotNull(file0);
      assertEquals("86400000_D?W&,R#S.<=I=,V4 _VA5-_D?W&,R#S.<=I=,V4 .XML", file0.getName());
      assertTrue(file0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      FileUtil fileUtil0 = new FileUtil();
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "net.kencochrane.a4j.util.a4jUtil");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("", "");
      assertEquals(32, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/7NMS0Z M9!)'K`_7NMS0Z M9!)'K`_7NMS0Z M9!)'K`.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "7nmS0z M9!)'K`");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("7nmS0z M9!)'K`", "7nmS0z M9!)'K`", "7nmS0z M9!)'K`");
      assertEquals(14, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/Q7NMS0Z M9!)'K`_Q7NMS0Z M9!)'K`_Q7NMS0Z M9!)'K`_Q7NMS0Z M9!)'K`.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("Q7nmS0z M9!)'K`", "Q7nmS0z M9!)'K`", "Q7nmS0z M9!)'K`", "Q7nmS0z M9!)'K`");
      assertEquals(0, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      FileUtil fileUtil0 = new FileUtil();
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "ShoppingCart=get&f=xml&dev-t=");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      File file0 = fileUtil0.getAccessories("", arrayList0);
      assertNotNull(file0);
      
      boolean boolean0 = fileUtil0.isAgeGood(file0);
      assertEquals(29L, file0.length());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      MockFile mockFile0 = new MockFile("Xz)CG@l(:Boi ", ".xml");
      boolean boolean0 = fileUtil0.isAgeGood(mockFile0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems((String) null, "1{Q,gT&0O1YL");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("lite", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("fLzee?)/}^_K:", (String) null, "h;3pWV$)+( `g");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile((String) null, "3rd_", "UQ!5nHh$~r%Y6+f");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getAccessories("7nmS0z M9!)'K`", (ArrayList) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("@Dg!nvq3@");
      File file0 = fileUtil0.getAccessories("@Dg!nvq3@", arrayList0);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      File file0 = fileUtil0.getAccessories((String) null, arrayList0);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("J\"vO1}3s|`bAJm1;P", "SimilaritySearch", "SimilaritySearch", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("[SH54hU^8TLLX/", (String) null, (String) null, "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile((String) null, "utG)CwSU[M", "tjSFTeNVI", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("", "", "", "QF");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("", "", "", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile((String) null, (String) null, (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("", (String) null, "", "Bu|SMtgXrN}!MG?~");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems((String) null, (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("q3'UTv6e=", "", "cacheDir", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("net.kencochrane.a4j.util.LoadProperties", "net.kencochrane.a4j.util.LoadProperties", (String) null, "net.kencochrane.a4j.file.FileUtil");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("", "XXsOk23lmw+=kkV", "", "Bu}?J0w M");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("Log file isn't there Setting default properties", "", "Log file isn't there Setting default properties", (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile((String) null, (String) null, "fkm\"", "?Jr");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("5", "+9~4D", (String) null, "", "", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("k_", ",&+re>Uk?", "7G+)RuKRpd+7]b7Y", (String) null, "new", "new");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile((String) null, (String) null, (String) null, "w]0KE0UbW", (String) null, "w]0KE0UbW");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile((String) null, "", "cacheLife", "", "", "a:#<V");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("", "", "", "", "", (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("F%", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile((String) null, (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("", "ta_");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile((String) null, "h-}K&JW'f`'^[bX", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile((String) null, (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("", "", "h-}K&JW'f`'^[bX");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories((String) null, (ArrayList) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      Integer integer0 = new Integer(4);
      arrayList0.add((Object) integer0);
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("", arrayList0);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("R8W;>uj+^#e:[HRpST", (String) null, (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("", "", "", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile((String) null, "W^ipWk#MO.Oa*~`_h#", "W^ipWk#MO.Oa*~`_h#", "W^ipWk#MO.Oa*~`_h#");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("", "4JQKSb", "", "4JQKSb");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("(l k", "cacheLife", "", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("F*f,s )qbT", "", "", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("", "/gG:", (String) null, "tjSFTeNVI");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile((String) null, "", "", "iN{$ W^6kiQlOV'[a)");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("", (String) null, "", "n");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("(0m$9n:R]", (String) null, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("", "", "/gG:");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile((String) null, (String) null, (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("ShoppingCart=get&f=xml&dev-t=", "G%\"_Y/l8^)DX", "G%\"_Y/l8^)DX");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("](k", "!#Jf+q2g", (String) null, "", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile((String) null, (String) null, (String) null, (String) null, ".0123456789");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("Ed<V'3v3PmDonN=0", "/YM)y}i", "U*a(0f", (String) null, "DJyo");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("", "", "", "t_", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("net.kencochrane.a4j.file.FileUtil", "net.kencochrane.a4j.file.FileUtil", "net.kencochrane.a4j.file.FileUtil", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile((String) null, (String) null, (String) null, (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("7nmS0z M9!)'K`", "7nmS0z M9!)'K`", "7nmS0z M9!)'K`", "7nmS0z M9!)'K`");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile((String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile((String) null, "3rd_", (String) null, "", "", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile((String) null, "", "", (String) null, "", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("", "", (String) null, (String) null, "", "g_");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart((String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("ta_");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("h(Ii^B*4(YM&(LRg]v", "86400000", ")+wq#nuj.]J", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("3rd_", "3rd_", "3rd_", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("amazonServerURL", "1{Q,gT&0O1YL", (String) null, "1{Q,gT&0O1YL");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("|B(=MX&Ppz<?T'nh", "", "k_", ")G4");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile((String) null, (String) null, "", "a_");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("", "DT0X/}H=FK", "", "popcornmonste2-20");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile("jf{@(3$}DslvyFIY/", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile((String) null, (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile("", "86400000");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("ts_", (ArrayList) null, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.add((Object) "q");
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("q", arrayList0, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile((String) null, arrayList0, "w$j'G)Xt_(sJ;i");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("|]P<tF0,;6U*^*", arrayList0, (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("", arrayList0, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
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
  public void test088()  throws Throwable  {
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
  public void test089()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=&type=lite&offerpage=W&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "7>49>KN\"x)'QaH~il#=<");
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("", "W", "Zx]fX{;R8");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      FileUtil fileUtil0 = new FileUtil();
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      File file0 = fileUtil0.getSimilarItems("", (String) null);
      assertNotNull(file0);
      assertTrue(file0.canWrite());
      assertFalse(file0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=7nmS0z M9!)'K`&type=7nmS0z M9!)'K`&page=7nmS0z M9!)'K`&offerstatus=7nmS0z M9!)'K`&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "7nmS0z M9!)'K`");
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("7nmS0z M9!)'K`", "7nmS0z M9!)'K`", "7nmS0z M9!)'K`", "7nmS0z M9!)'K`");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("m/wU", (String) null, "M+) A\"1C", "Log file isn't there Setting default properties", "a4j-config.txt", "_");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("", "", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=7>49>KN\"x'QaH~il#=<&mode=W&type=lite&page=W&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "7>49>KN\"x'QaH~il#=<");
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("W", "7>49>KN\"x'QaH~il#=<", "W", "7>49>KN\"x'QaH~il#=<");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/D?@E_(VK'TO:_XZ)CG@L(:BOI _D?@E_(VK'TO:_.XML.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "t=");
      File file0 = fileUtil0.getASINFile("D?@e_(VK'tO:", "D?@e_(VK'tO:", "Xz)CG@l(:Boi ", ".xml");
      assertNotNull(file0);
      assertEquals(2L, file0.length());
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      MockFile mockFile0 = new MockFile("popcornmonste2-20");
      boolean boolean0 = fileUtil0.isAgeGood(mockFile0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("6!BdWd]J");
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=&type=lite&offerpage=W&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "7>49>KN\"x'QaH~il#=<");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("", "W");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      FileUtil fileUtil0 = new FileUtil();
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("", "");
      assertEquals(0, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("k+F.!yhi8A", "k+F.!yhi8A");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      FileUtil fileUtil0 = new FileUtil();
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "ShoppingCart=get&f=xml&dev-t=");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("", arrayList0);
      assertEquals(29, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("net.kencochrane.a4j.file.FileUtil", arrayList0);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      File file0 = fileUtil0.getAccessories("", arrayList0);
      assertNotNull(file0);
      
      boolean boolean0 = fileUtil0.isAgeGood(file0);
      assertFalse(boolean0);
      assertEquals("/A_.XML", file0.toString());
      assertTrue(file0.canWrite());
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=7nmS0z M9!)'K`&type=7nmS0z M9!)'K`&page=7nmS0z M9!)'K`&offerstatus=7nmS0z M9!)'K`&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "7nmS0z M9!)'K`");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("7nmS0z M9!)'K`", "7nmS0z M9!)'K`", "7nmS0z M9!)'K`", "7nmS0z M9!)'K`");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&Q7nmS0z M9!)'K`=Q7nmS0z+M9%21%29%27K%60&mode=Q7nmS0z M9!)'K`&type=Q7nmS0z M9!)'K`&page=Q7nmS0z M9!)'K`&offer=Q7nmS0z M9!)'K`&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "oq\u0007`c]gEF`\"{'pfU]V");
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("Q7nmS0z M9!)'K`", "Q7nmS0z M9!)'K`", "Q7nmS0z M9!)'K`", "Q7nmS0z M9!)'K`", "Q7nmS0z M9!)'K`", "Q7nmS0z M9!)'K`");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&KeywordSearch=&mode=&type=&page=popcornmonste2-20&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "popcornmonste2-20");
      File file0 = fileUtil0.downloadKeywordSearchFile("", "", "", "popcornmonste2-20");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=b%5B%24%27o%5B%27%2BNVh%60E&type=b[$'o['+NVh`E&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "b[$'o['+NVh`E");
      File file0 = fileUtil0.downloadBlendedSearchFile("b[$'o['+NVh`E", "b[$'o['+NVh`E");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/7NMS0Z M9!)'K`_7NMS0Z M9!)'K`_7NMS0Z M9!)'K`.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("7nmS0z M9!)'K`", "7nmS0z M9!)'K`", "7nmS0z M9!)'K`");
      assertEquals(0, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=7nmS0z M9!)'K`&mode=7nmS0z M9!)'K`&type=lite&page=7nmS0z M9!)'K`&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "7nmS0z M9!)'K`");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("7nmS0z M9!)'K`", "7nmS0z M9!)'K`", "7nmS0z M9!)'K`");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/Q7NMS0Z M9!)'K`_Q7NMS0Z M9!)'K`_Q7NMS0Z M9!)'K`_Q7NMS0Z M9!)'K`.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "T\"0_,;@");
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("Q7nmS0z M9!)'K`", "Q7nmS0z M9!)'K`", "Q7nmS0z M9!)'K`", "Q7nmS0z M9!)'K`");
      assertEquals(7, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("", "");
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("%IDod-/", ".xml");
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.isAgeGood((File) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("");
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/__NULL.XML");
      byte[] byteArray0 = new byte[4];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      File file0 = fileUtil0.getBrowseNodeFile("", "", (String) null);
      assertNotNull(file0);
      assertEquals(4L, file0.length());
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=ta_&type=&offerpage=&offer=IO~-Xqmy%P&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "7>49>KN\"x'QaH~il#=<");
      File file0 = fileUtil0.getASINFile("ta_", "", "IO~-Xqmy%P", "");
      assertNull(file0);
  }
}
