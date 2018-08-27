/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 13:38:35 GMT 2018
 */

package okhttp3.internal.tls;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;
import javax.security.auth.x500.X500Principal;
import okhttp3.internal.tls.DistinguishedNameParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
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
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      X500Principal x500Principal0 = new X500Principal("l=[s7V63PI::g`/", hashMap0);
      DistinguishedNameParser distinguishedNameParser0 = new DistinguishedNameParser(x500Principal0);
      String string0 = distinguishedNameParser0.findMostSpecific("l");
      assertEquals("[s7V63PI::g`/", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      X500Principal x500Principal0 = new X500Principal("l=7#63 `");
      DistinguishedNameParser distinguishedNameParser0 = new DistinguishedNameParser(x500Principal0);
      String string0 = distinguishedNameParser0.findMostSpecific("l=7#63 `");
      assertNull(string0);
  }
}