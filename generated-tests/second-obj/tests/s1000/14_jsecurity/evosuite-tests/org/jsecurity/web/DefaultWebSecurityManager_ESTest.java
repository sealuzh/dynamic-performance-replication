/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 15:12:47 GMT 2018
 */

package org.jsecurity.web;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.InetAddress;
import java.util.LinkedHashSet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestWrapper;
import javax.servlet.ServletResponse;
import javax.servlet.ServletResponseWrapper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.jsecurity.authc.credential.Sha384CredentialsMatcher;
import org.jsecurity.authc.pam.FirstSuccessfulAuthenticationStrategy;
import org.jsecurity.realm.Realm;
import org.jsecurity.realm.SimpleAccountRealm;
import org.jsecurity.session.Session;
import org.jsecurity.subject.DelegatingSubject;
import org.jsecurity.subject.PrincipalCollection;
import org.jsecurity.subject.SimplePrincipalCollection;
import org.jsecurity.subject.Subject;
import org.jsecurity.web.DefaultWebSecurityManager;
import org.jsecurity.web.WebRememberMeManager;
import org.jsecurity.web.attr.CookieAttribute;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultWebSecurityManager_ESTest extends DefaultWebSecurityManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedHashSet<Realm> linkedHashSet0 = new LinkedHashSet<Realm>();
      DefaultWebSecurityManager defaultWebSecurityManager0 = null;
      try {
        defaultWebSecurityManager0 = new DefaultWebSecurityManager(linkedHashSet0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Realms collection argument cannot be empty.
         //
         verifyException("org.jsecurity.mgt.RealmSecurityManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.createSubject();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No ServletRequest found in ThreadContext. Make sure WebUtils.bind() is being called. (typically called by JSecurityFilter)  This could also happen when running integration tests that don't properly call WebUtils.bind().
         //
         verifyException("org.jsecurity.web.WebUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionIdCookieMaxAge((-1255));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The convenience passthrough methods for setting session id cookie attributes are only available when the underlying SessionManager implementation is org.jsecurity.web.session.DefaultWebSessionManager, which is enabled by default when the sessionMode is 'jsecurity'.
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionIdCookieName("http");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The convenience passthrough methods for setting session id cookie attributes are only available when the underlying SessionManager implementation is org.jsecurity.web.session.DefaultWebSessionManager, which is enabled by default when the sessionMode is 'jsecurity'.
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      String string0 = defaultWebSecurityManager0.getSessionMode();
      assertEquals("http", string0);
      assertTrue(defaultWebSecurityManager0.isHttpSessionMode());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionIdCookieSecure(true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The convenience passthrough methods for setting session id cookie attributes are only available when the underlying SessionManager implementation is org.jsecurity.web.session.DefaultWebSessionManager, which is enabled by default when the sessionMode is 'jsecurity'.
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionMode("[*&MlB{tD;pr_dA");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid sessionMode [[*&MlB{tD;pr_dA].  Allowed values are public static final String constants in the org.jsecurity.web.DefaultWebSecurityManager class: 'http' or 'jsecurity', with 'http' being the default.
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Sha384CredentialsMatcher sha384CredentialsMatcher0 = new Sha384CredentialsMatcher();
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionIdCookiePath("cLp[]'XuKb");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The convenience passthrough methods for setting session id cookie attributes are only available when the underlying SessionManager implementation is org.jsecurity.web.session.DefaultWebSessionManager, which is enabled by default when the sessionMode is 'jsecurity'.
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      defaultWebSecurityManager0.setSessionMode("http");
      boolean boolean0 = defaultWebSecurityManager0.isHttpSessionMode();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionMode((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid sessionMode [null].  Allowed values are public static final String constants in the org.jsecurity.web.DefaultWebSecurityManager class: 'http' or 'jsecurity', with 'http' being the default.
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      boolean boolean0 = defaultWebSecurityManager0.isHttpSessionMode();
      boolean boolean1 = defaultWebSecurityManager0.isAuthenticated((Session) null);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/jsecurity-ehcache/ehcache_auto_created_1392409281320/org.jsecurity.realm.text.PropertiesRealm-0-accounts.index");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "http");
      defaultWebSecurityManager0.setSessionMode("jsecurity");
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      defaultWebSecurityManager0.setSessionIdCookieName("Appender \"");
      FileSystemHandling.shouldAllThrowIOExceptions();
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.createSubject();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No ServletRequest found in ThreadContext. Make sure WebUtils.bind() is being called. (typically called by JSecurityFilter)  This could also happen when running integration tests that don't properly call WebUtils.bind().
         //
         verifyException("org.jsecurity.web.WebUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection(defaultWebSecurityManager0, " class: '");
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      DelegatingSubject delegatingSubject0 = new DelegatingSubject(simplePrincipalCollection0, false, inetAddress0, (Session) null, defaultWebSecurityManager0);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.bind(delegatingSubject0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No ServletRequest found in ThreadContext. Make sure WebUtils.bind() is being called. (typically called by JSecurityFilter)  This could also happen when running integration tests that don't properly call WebUtils.bind().
         //
         verifyException("org.jsecurity.web.WebUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
      FirstSuccessfulAuthenticationStrategy firstSuccessfulAuthenticationStrategy0 = new FirstSuccessfulAuthenticationStrategy();
      defaultWebSecurityManager0.setModularAuthenticationStrategy(firstSuccessfulAuthenticationStrategy0);
      defaultWebSecurityManager0.isAuthenticated((Session) null);
      Subject subject0 = defaultWebSecurityManager0.getSubject();
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.bind(subject0, servletRequestWrapper0, servletResponseWrapper0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No ServletRequest found in ThreadContext. Make sure WebUtils.bind() is being called. (typically called by JSecurityFilter)  This could also happen when running integration tests that don't properly call WebUtils.bind().
         //
         verifyException("org.jsecurity.web.WebUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection(defaultWebSecurityManager0, "org.jsecurity.web.DefaultWebSecurityManager_AUTHENTICATED_SESSION_KEY");
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/jsecurity-ehcache/ehcache_auto_created_1392409281320/org.jsecurity.realm.text.PropertiesRealm-0-accounts.data");
      defaultWebSecurityManager0.setRememberMeCookiePath("jsecurity");
      FileSystemHandling.setPermissions(evoSuiteFile0, true, false, false);
      DelegatingSubject delegatingSubject0 = new DelegatingSubject(simplePrincipalCollection0, false, inetAddress0, (Session) null, defaultWebSecurityManager0);
      ServletResponseWrapper servletResponseWrapper1 = new ServletResponseWrapper(servletResponseWrapper0);
      ServletResponseWrapper servletResponseWrapper2 = new ServletResponseWrapper(servletResponseWrapper1);
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(servletRequest0).getContentLength();
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      servletRequestWrapper0.getContentLength();
      ServletResponseWrapper servletResponseWrapper3 = new ServletResponseWrapper(servletResponseWrapper2);
      defaultWebSecurityManager0.getSubject();
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.bind(delegatingSubject0, servletRequestWrapper0, servletResponseWrapper1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No ServletRequest found in ThreadContext. Make sure WebUtils.bind() is being called. (typically called by JSecurityFilter)  This could also happen when running integration tests that don't properly call WebUtils.bind().
         //
         verifyException("org.jsecurity.web.WebUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-52);
      byteArray0[0] = (byte)0;
      byteArray0[3] = (byte) (-128);
      byteArray0[4] = (byte) (-128);
      Integer integer0 = new Integer(77);
      defaultWebSecurityManager0.setRememberMeCookieMaxAge(integer0);
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("org.jsecurity.web.DefaultWebSecurityManager_AUTHENTICATED_SESSION_KEY");
      DefaultWebSecurityManager defaultWebSecurityManager1 = new DefaultWebSecurityManager(simpleAccountRealm0);
      FirstSuccessfulAuthenticationStrategy firstSuccessfulAuthenticationStrategy0 = new FirstSuccessfulAuthenticationStrategy();
      defaultWebSecurityManager0.setModularAuthenticationStrategy(firstSuccessfulAuthenticationStrategy0);
      Session session0 = null;
      defaultWebSecurityManager1.isAuthenticated((Session) null);
      Subject subject0 = defaultWebSecurityManager1.getSubject();
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletRequestWrapper servletRequestWrapper1 = new ServletRequestWrapper(servletRequestWrapper0);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      ServletResponseWrapper servletResponseWrapper1 = new ServletResponseWrapper(servletResponseWrapper0);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.bind(subject0, servletRequestWrapper1, servletResponseWrapper1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No ServletRequest found in ThreadContext. Make sure WebUtils.bind() is being called. (typically called by JSecurityFilter)  This could also happen when running integration tests that don't properly call WebUtils.bind().
         //
         verifyException("org.jsecurity.web.WebUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp");
      FileSystemHandling.createFolder(evoSuiteFile0);
      defaultWebSecurityManager0.isAuthenticated((Session) null);
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn("").when(servletRequest0).getRemoteHost();
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      defaultWebSecurityManager0.getPrincipals((Session) null, servletRequestWrapper0, servletResponseWrapper0);
      ServletResponseWrapper servletResponseWrapper1 = new ServletResponseWrapper(servletResponseWrapper0);
      Subject subject0 = defaultWebSecurityManager0.createSubject((PrincipalCollection) null, true, (Session) null, (ServletRequest) servletRequestWrapper0, (ServletResponse) servletResponseWrapper0);
      ServletRequestWrapper servletRequestWrapper1 = new ServletRequestWrapper(servletRequestWrapper0);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.bind(subject0, servletRequestWrapper1, servletResponseWrapper0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No ServletRequest found in ThreadContext. Make sure WebUtils.bind() is being called. (typically called by JSecurityFilter)  This could also happen when running integration tests that don't properly call WebUtils.bind().
         //
         verifyException("org.jsecurity.web.WebUtils", e);
      }
  }
}