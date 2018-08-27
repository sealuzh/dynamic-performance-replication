/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 01:12:10 GMT 2018
 */

package okhttp3.internal.tls;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;
import javax.security.auth.x500.X500Principal;
import okhttp3.internal.tls.DistinguishedNameParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DistinguishedNameParser_ESTest extends DistinguishedNameParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      X500Principal x500Principal0 = new X500Principal("");
      DistinguishedNameParser distinguishedNameParser0 = new DistinguishedNameParser(x500Principal0);
      String string0 = distinguishedNameParser0.findMostSpecific("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      X500Principal x500Principal0 = new X500Principal("o=bIStS3 |3#/vL", hashMap0);
      Object object0 = new Object();
      DistinguishedNameParser distinguishedNameParser0 = new DistinguishedNameParser(x500Principal0);
      String string0 = distinguishedNameParser0.findMostSpecific("i%?'qp");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      X500Principal x500Principal0 = new X500Principal("o=bIStS3 |39KvL", hashMap0);
      Object object0 = new Object();
      x500Principal0.equals(object0);
      hashMap0.clone();
      NetworkHandling.createRemoteTextFile((EvoSuiteURL) null, "o=bIStS3 |39KvL");
      DistinguishedNameParser distinguishedNameParser0 = new DistinguishedNameParser(x500Principal0);
      String string0 = distinguishedNameParser0.findMostSpecific("o");
      assertNotNull(string0);
      assertEquals("bIStS3 |39KvL", string0);
  }
}