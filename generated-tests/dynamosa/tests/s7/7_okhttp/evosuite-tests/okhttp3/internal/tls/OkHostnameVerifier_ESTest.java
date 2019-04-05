/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 17:00:18 GMT 2019
 */

package okhttp3.internal.tls;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.HashMap;
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
  public void test0()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      X500Principal x500Principal0 = new X500Principal("", hashMap0);
      X509Certificate x509Certificate0 = mock(X509Certificate.class, new ViolatedAssumptionAnswer());
      doReturn((Collection) null).when(x509Certificate0).getSubjectAlternativeNames();
      doReturn(x500Principal0).when(x509Certificate0).getSubjectX500Principal();
      OkHostnameVerifier okHostnameVerifier0 = OkHostnameVerifier.INSTANCE;
      Certificate[] certificateArray0 = new Certificate[2];
      certificateArray0[0] = (Certificate) x509Certificate0;
      SSLSession sSLSession0 = mock(SSLSession.class, new ViolatedAssumptionAnswer());
      doReturn(certificateArray0).when(sSLSession0).getPeerCertificates();
      boolean boolean0 = okHostnameVerifier0.verify("", sSLSession0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OkHostnameVerifier okHostnameVerifier0 = OkHostnameVerifier.INSTANCE;
      // Undeclared exception!
      try { 
        okHostnameVerifier0.INSTANCE.verify("i|*y<+IbS[b\"", (SSLSession) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.tls.OkHostnameVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
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
  public void test3()  throws Throwable  {
      OkHostnameVerifier okHostnameVerifier0 = OkHostnameVerifier.INSTANCE;
      X509Certificate x509Certificate0 = mock(X509Certificate.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        okHostnameVerifier0.INSTANCE.verify((String) null, x509Certificate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      OkHostnameVerifier okHostnameVerifier0 = OkHostnameVerifier.INSTANCE;
      Certificate[] certificateArray0 = new Certificate[1];
      Certificate certificate0 = mock(Certificate.class, new ViolatedAssumptionAnswer());
      certificateArray0[0] = certificate0;
      SSLSession sSLSession0 = mock(SSLSession.class, new ViolatedAssumptionAnswer());
      doReturn(certificateArray0).when(sSLSession0).getPeerCertificates();
      // Undeclared exception!
      try { 
        okHostnameVerifier0.verify("*.", sSLSession0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // codegen.java.security.cert.Certificate$MockitoMock$275517540 cannot be cast to java.security.cert.X509Certificate
         //
         verifyException("okhttp3.internal.tls.OkHostnameVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      OkHostnameVerifier okHostnameVerifier0 = OkHostnameVerifier.INSTANCE;
      Certificate[] certificateArray0 = new Certificate[0];
      SSLSession sSLSession0 = mock(SSLSession.class, new ViolatedAssumptionAnswer());
      doReturn(certificateArray0).when(sSLSession0).getPeerCertificates();
      // Undeclared exception!
      try { 
        okHostnameVerifier0.verify("cs/P<p`W/,mT;0x", sSLSession0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("okhttp3.internal.tls.OkHostnameVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      OkHostnameVerifier okHostnameVerifier0 = OkHostnameVerifier.INSTANCE;
      // Undeclared exception!
      try { 
        okHostnameVerifier0.verify(".", (X509Certificate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.tls.OkHostnameVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
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
  public void test8()  throws Throwable  {
      LinkedList<List<String>> linkedList0 = new LinkedList<List<String>>();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("0`&HWizVU^_ay9{", "46R$#");
      X500Principal x500Principal0 = new X500Principal("", hashMap0);
      X509Certificate x509Certificate0 = mock(X509Certificate.class, new ViolatedAssumptionAnswer());
      doReturn((Collection) null).when(x509Certificate0).getSubjectAlternativeNames();
      doReturn(x500Principal0).when(x509Certificate0).getSubjectX500Principal();
      OkHostnameVerifier okHostnameVerifier0 = OkHostnameVerifier.INSTANCE;
      boolean boolean0 = okHostnameVerifier0.verify("", x509Certificate0);
      LinkedList<List<String>> linkedList1 = new LinkedList<List<String>>();
      X509Certificate x509Certificate1 = mock(X509Certificate.class, new ViolatedAssumptionAnswer());
      doReturn((Collection) null, (Collection) null).when(x509Certificate1).getSubjectAlternativeNames();
      OkHostnameVerifier.allSubjectAltNames(x509Certificate1);
      LinkedList<List<String>> linkedList2 = new LinkedList<List<String>>();
      X509Certificate x509Certificate2 = mock(X509Certificate.class, new ViolatedAssumptionAnswer());
      doReturn((Collection) null).when(x509Certificate2).getSubjectAlternativeNames();
      boolean boolean1 = okHostnameVerifier0.verify(".", x509Certificate2);
      assertTrue(boolean1 == boolean0);
      
      LinkedList<List<Object>> linkedList3 = new LinkedList<List<Object>>();
      X509Certificate x509Certificate3 = mock(X509Certificate.class, new ViolatedAssumptionAnswer());
      doReturn((Collection) null, (Collection) null).when(x509Certificate3).getSubjectAlternativeNames();
      List<String> list0 = OkHostnameVerifier.allSubjectAltNames(x509Certificate3);
      SSLSession sSLSession0 = mock(SSLSession.class, new ViolatedAssumptionAnswer());
      Certificate[] certificateArray0 = new Certificate[2];
      certificateArray0[0] = (Certificate) x509Certificate0;
      certificateArray0[1] = (Certificate) x509Certificate1;
      SSLSession sSLSession1 = mock(SSLSession.class, new ViolatedAssumptionAnswer());
      X509Certificate x509Certificate4 = mock(X509Certificate.class, new ViolatedAssumptionAnswer());
      doReturn((Collection) null, (Collection) null).when(x509Certificate4).getSubjectAlternativeNames();
      OkHostnameVerifier.allSubjectAltNames(x509Certificate4);
      X509Certificate x509Certificate5 = mock(X509Certificate.class, new ViolatedAssumptionAnswer());
      doReturn((Collection) null, (Collection) null).when(x509Certificate5).getSubjectAlternativeNames();
      List<String> list1 = OkHostnameVerifier.allSubjectAltNames(x509Certificate5);
      assertNotSame(list1, list0);
  }
}