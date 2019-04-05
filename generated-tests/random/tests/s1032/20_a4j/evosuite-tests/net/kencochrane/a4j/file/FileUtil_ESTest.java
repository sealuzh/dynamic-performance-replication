/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 15:05:47 GMT 2019
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
      File file0 = MockFile.createTempFile("HbV;h~Yn5)", "all");
      boolean boolean0 = fileUtil0.isAgeGood(file0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems((String) null, "6YP4h_IK2(WMP;Z)@Xd");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("<fX;!bR`JbtJw=", "", "<fX;!bR`JbtJw=");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getAccessories("ShoppingCart=modify&f=xml&dev-t=", (ArrayList) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("tI");
      File file0 = fileUtil0.getAccessories("^", arrayList0);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("", "", "htQY", "offer=");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile((String) null, "popcornmonste2-20", (String) null, (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("L", "", (String) null, "n'");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile((String) null, (String) null, (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("^", "", "", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile((String) null, (String) null, "", "s_");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("", "h6]Lve6&", "?;Q|/qkb,%y!", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("6YP4h_IK2(WMP;Z)@Xd", (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("s j@bH#I0V>+R", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile(",C5", "?;Q|/qkb,%y!", "popcornmonste2-20", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("b_", "b_", ",C5", "?;Q|/qkb,%y!");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("", "", "Jjo~ZX;y}:P", "^HKt]h9SX0nH");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("n'", "2=.cr_Y", "^u]Kn]L,8HlVpmW7", "2=.cr_Y", "", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("", "[+0A$xj(E3K3CzP-}O", "", "", "[+0A$xj(E3K3CzP-}O", "a_");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile((String) null, "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("$_1.vu1Z", "http://xml.amazon.net/onca/xml3");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile(";CdmgH8!Z[S~N)SnH#", (String) null, "&;:$,H:SVfa ;vygK");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("offer=", ")yiVZs{KTdv", "htQY");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("?Cf,a");
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("?Cf,a", arrayList0);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories((String) null, arrayList0);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("b_", "VZL=8V\")mcO4E,", "", "XXtO@sX$D!I}r");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("", "igJ=bOe", (String) null, "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("p&cIN2IH5", "p&cIN2IH5", "", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("", "&Hmac=", "a_", "p&cIN2IH5");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile((String) null, "_Y)[bjGTl+TSN^Y", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("", "", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("cacheLife", "jx J=,fA", "popcornmonste2-20", "3rd_", "a2s=g@yQ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("cacheLife", "", "popcornmonste2-20", "3rd_", "a2s=g@yQ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile((String) null, "SellerSearch=", "BrowseNodeSearch=", "c(Jbz^Y,9YpjQrS");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("6YP4h_IK2(WMP;Z)@Xd", "PL<P!S=%?`z", "v?pLL,?XX<tS0", "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile((String) null, (String) null, (String) null, (String) null, (String) null, "HbV;h~Yn5)");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("ts_", "URLSeperator", "URLSeperator", "ts_", "86400000", "cacheDir");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile("?", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile((String) null, (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("3rd_", arrayList0, (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("ypZci<ykYiPwDBC", (ArrayList) null, "ypZci<ykYiPwDBC");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.add((Object) null);
      boolean boolean0 = fileUtil0.downloadAccessoriesFile((String) null, arrayList0, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("", arrayList0, "ump)TWlg5");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      File file0 = fileUtil0.getAccessories("VdUeQ!2*9[(?{<5!", arrayList0);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      MockFile mockFile0 = new MockFile((String) null, "VdUeQ!2*9[(?{<5!");
      boolean boolean0 = fileUtil0.isAgeGood(mockFile0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("popcornmonste2-20");
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("net.kencochrane.a4j.file.FileUtil");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=,LdM2Pm57y&type=lite&offerpage=,LdM2Pm57y&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "lite");
      File file0 = fileUtil0.getSimilarItems(",LdM2Pm57y", ",LdM2Pm57y");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("", "qSV{xL#e?");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.cacheDir = "n'";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("n'A_[.XML");
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("[", (ArrayList) null);
      assertEquals(0, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "/~0_EKZE|-X-%.@^");
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      File file0 = fileUtil0.getAccessories("", arrayList0);
      assertNotNull(file0);
      assertEquals(17L, file0.length());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=aN\"yI[u(EJmF;&type=3rd_&page=&offerstatus=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "93t>m(l\"J[L");
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("aN\"yI[u(EJmF;", "3rd_", "", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile(";CdmgH8!Z[S~N)SnH#", "", "DSB0XDDW1GQ3S", (String) null, "Wik`Nl#;o$", (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&=&mode=s_&type=N&page=s_&offer=,C5&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, ">ZY|Q9f9e?B");
      File file0 = fileUtil0.downloadGenericSearchFile("", "", "s_", "N", "s_", ",C5");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile((String) null, "\"^#3Z_aWulI0o", "$DRx5<<ABz&4L0`z\"", "&Hmac=");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&KeywordSearch=&mode=ts_&type=p&cIN2IH5&page=jOb&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, ">D/Y\"lU!]%)h");
      File file0 = fileUtil0.downloadKeywordSearchFile("", "ts_", "p&cIN2IH5", "jOb");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=N&type=b_&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "b_");
      File file0 = fileUtil0.downloadBlendedSearchFile("N", "b_");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("", "", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("=", "=", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=null&mode=Z2yso&type=lite&page=null&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "a'*uPqjU=)-%%49C");
      File file0 = fileUtil0.getBrowseNodeFile("Z2yso", (String) null, (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("", "net.kencochrane.a4j.util.LoadProperties", (String) null, "=");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/_6)F83G_BV70_.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("", "BV70", "6)f83g", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("", "4DLBP)8|7h;8z");
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("l:Qg3/]WZV", "3rd_");
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.isAgeGood((File) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("");
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_M.O]EC(3S>-TLQ.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "N");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("M.O]eC(3S>-tlQ", "j!GN$}j/2l=j8!");
      assertEquals(2, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=&type=&offerpage=null&offer=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "93t>m(l\"J[L");
      File file0 = fileUtil0.getASINFile("", "", "", (String) null);
      assertNull(file0);
  }
}
