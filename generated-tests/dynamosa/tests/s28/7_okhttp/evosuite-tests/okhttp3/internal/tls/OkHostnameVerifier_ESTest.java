/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 16:43:42 GMT 2019
 */

package okhttp3.internal.tls;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import javax.net.ssl.SSLSession;
import javax.security.auth.x500.X500Principal;
import okhttp3.internal.tls.OkHostnameVerifier;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OkHostnameVerifier_ESTest extends OkHostnameVerifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      X500Principal x500Principal0 = new X500Principal("");
      X509Certificate x509Certificate0 = mock(X509Certificate.class, new ViolatedAssumptionAnswer());
      doReturn((Collection) null).when(x509Certificate0).getSubjectAlternativeNames();
      doReturn(x500Principal0).when(x509Certificate0).getSubjectX500Principal();
      OkHostnameVerifier okHostnameVerifier0 = OkHostnameVerifier.INSTANCE;
      Certificate[] certificateArray0 = new Certificate[4];
      certificateArray0[0] = (Certificate) x509Certificate0;
      SSLSession sSLSession0 = mock(SSLSession.class, new ViolatedAssumptionAnswer());
      doReturn(certificateArray0).when(sSLSession0).getPeerCertificates();
      boolean boolean0 = okHostnameVerifier0.verify("2)fnsOqP)~fvo(p`c", sSLSession0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OkHostnameVerifier okHostnameVerifier0 = OkHostnameVerifier.INSTANCE;
      // Undeclared exception!
      try { 
        okHostnameVerifier0.INSTANCE.verify("..", (SSLSession) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.tls.OkHostnameVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OkHostnameVerifier okHostnameVerifier0 = OkHostnameVerifier.INSTANCE;
      SSLSession sSLSession0 = mock(SSLSession.class, new ViolatedAssumptionAnswer());
      doReturn((Certificate[]) null).when(sSLSession0).getPeerCertificates();
      // Undeclared exception!
      try { 
        okHostnameVerifier0.verify((String) null, sSLSession0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.tls.OkHostnameVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OkHostnameVerifier okHostnameVerifier0 = OkHostnameVerifier.INSTANCE;
      SSLSession sSLSession0 = mock(SSLSession.class, new ViolatedAssumptionAnswer());
      doReturn((Certificate[]) null).when(sSLSession0).getPeerCertificates();
      // Undeclared exception!
      try { 
        okHostnameVerifier0.INSTANCE.verify("", sSLSession0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.tls.OkHostnameVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OkHostnameVerifier okHostnameVerifier0 = OkHostnameVerifier.INSTANCE;
      // Undeclared exception!
      try { 
        okHostnameVerifier0.INSTANCE.verify("", (X509Certificate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.tls.OkHostnameVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OkHostnameVerifier okHostnameVerifier0 = OkHostnameVerifier.INSTANCE;
      X509Certificate x509Certificate0 = mock(X509Certificate.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        okHostnameVerifier0.verify((String) null, x509Certificate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      X500Principal x500Principal0 = new X500Principal("");
      X509Certificate x509Certificate0 = mock(X509Certificate.class, new ViolatedAssumptionAnswer());
      doReturn((Collection) null).when(x509Certificate0).getSubjectAlternativeNames();
      doReturn(x500Principal0).when(x509Certificate0).getSubjectX500Principal();
      OkHostnameVerifier okHostnameVerifier0 = OkHostnameVerifier.INSTANCE;
      boolean boolean0 = okHostnameVerifier0.verify("", x509Certificate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OkHostnameVerifier okHostnameVerifier0 = OkHostnameVerifier.INSTANCE;
      Certificate[] certificateArray0 = new Certificate[1];
      Certificate certificate0 = mock(Certificate.class, new ViolatedAssumptionAnswer());
      certificateArray0[0] = certificate0;
      SSLSession sSLSession0 = mock(SSLSession.class, new ViolatedAssumptionAnswer());
      doReturn(certificateArray0).when(sSLSession0).getPeerCertificates();
      // Undeclared exception!
      try { 
        okHostnameVerifier0.verify("jg!ay8C", sSLSession0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // codegen.java.security.cert.Certificate$MockitoMock$1935982209 cannot be cast to java.security.cert.X509Certificate
         //
         verifyException("okhttp3.internal.tls.OkHostnameVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OkHostnameVerifier okHostnameVerifier0 = OkHostnameVerifier.INSTANCE;
      Certificate[] certificateArray0 = new Certificate[0];
      SSLSession sSLSession0 = mock(SSLSession.class, new ViolatedAssumptionAnswer());
      doReturn(certificateArray0).when(sSLSession0).getPeerCertificates();
      // Undeclared exception!
      try { 
        okHostnameVerifier0.verify("~e7o=  2: ", sSLSession0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("okhttp3.internal.tls.OkHostnameVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OkHostnameVerifier okHostnameVerifier0 = OkHostnameVerifier.INSTANCE;
      X509Certificate x509Certificate0 = mock(X509Certificate.class, new ViolatedAssumptionAnswer());
      doReturn((Collection) null).when(x509Certificate0).getSubjectAlternativeNames();
      doReturn((X500Principal) null).when(x509Certificate0).getSubjectX500Principal();
      // Undeclared exception!
      try { 
        okHostnameVerifier0.verify("&b$L/Yun,c`{gV^Q9p", x509Certificate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.tls.DistinguishedNameParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        OkHostnameVerifier.allSubjectAltNames((X509Certificate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.tls.OkHostnameVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<List<Object>> linkedList0 = new LinkedList<List<Object>>();
      X509Certificate x509Certificate0 = mock(X509Certificate.class, new ViolatedAssumptionAnswer());
      doReturn((Collection) null, (Collection) null).when(x509Certificate0).getSubjectAlternativeNames();
      List<String> list0 = OkHostnameVerifier.allSubjectAltNames(x509Certificate0);
      X509Certificate x509Certificate1 = mock(X509Certificate.class, new ViolatedAssumptionAnswer());
      OkHostnameVerifier okHostnameVerifier0 = OkHostnameVerifier.INSTANCE;
      X509Certificate x509Certificate2 = mock(X509Certificate.class, new ViolatedAssumptionAnswer());
      doReturn((Collection) null, (Collection) null).when(x509Certificate2).getSubjectAlternativeNames();
      List<String> list1 = OkHostnameVerifier.allSubjectAltNames(x509Certificate2);
      assertNotSame(list1, list0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      X509Certificate x509Certificate0 = mock(X509Certificate.class, new ViolatedAssumptionAnswer());
      doReturn((Collection) null).when(x509Certificate0).getSubjectAlternativeNames();
      OkHostnameVerifier okHostnameVerifier0 = OkHostnameVerifier.INSTANCE;
      boolean boolean0 = okHostnameVerifier0.verify(".", x509Certificate0);
      assertFalse(boolean0);
  }
}
