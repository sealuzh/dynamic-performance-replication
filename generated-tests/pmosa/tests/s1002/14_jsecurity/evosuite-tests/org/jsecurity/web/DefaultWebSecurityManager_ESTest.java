/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 16 20:31:24 GMT 2018
 */

package org.jsecurity.web;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.InetAddress;
import java.util.Collection;
import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestWrapper;
import javax.servlet.ServletResponse;
import javax.servlet.ServletResponseWrapper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.jsecurity.authc.pam.AllSuccessfulModularAuthenticationStrategy;
import org.jsecurity.authz.Permission;
import org.jsecurity.realm.Realm;
import org.jsecurity.realm.SimpleAccountRealm;
import org.jsecurity.session.ProxiedSession;
import org.jsecurity.session.Session;
import org.jsecurity.session.SessionListener;
import org.jsecurity.session.mgt.eis.MemorySessionDAO;
import org.jsecurity.subject.DelegatingSubject;
import org.jsecurity.subject.PrincipalCollection;
import org.jsecurity.subject.SimplePrincipalCollection;
import org.jsecurity.subject.Subject;
import org.jsecurity.web.DefaultWebSecurityManager;
import org.jsecurity.web.WebRememberMeManager;
import org.jsecurity.web.session.DefaultWebSessionManager;
import org.jsecurity.web.session.ServletContainerSessionManager;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultWebSecurityManager_ESTest extends DefaultWebSecurityManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionIdCookieMaxAge((-785));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The convenience passthrough methods for setting session id cookie attributes are only available when the underlying SessionManager implementation is org.jsecurity.web.session.DefaultWebSessionManager, which is enabled by default when the sessionMode is 'jsecurity'.
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      SimplePrincipalCollection simplePrincipalCollection1 = new SimplePrincipalCollection(simplePrincipalCollection0);
      Class<Realm> class0 = Realm.class;
      Collection<Realm> collection0 = simplePrincipalCollection1.byType(class0);
      DefaultWebSecurityManager defaultWebSecurityManager0 = null;
      try {
        defaultWebSecurityManager0 = new DefaultWebSecurityManager(collection0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Realms collection argument cannot be empty.
         //
         verifyException("org.jsecurity.mgt.RealmSecurityManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      AllSuccessfulModularAuthenticationStrategy allSuccessfulModularAuthenticationStrategy0 = new AllSuccessfulModularAuthenticationStrategy();
      defaultWebSecurityManager0.setModularAuthenticationStrategy(allSuccessfulModularAuthenticationStrategy0);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionIdCookiePath("Category ");
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
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      defaultWebSecurityManager0.getSessionMode();
      ServletContainerSessionManager servletContainerSessionManager0 = new ServletContainerSessionManager();
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletResponse servletResponse0 = null;
      ServletResponseWrapper servletResponseWrapper0 = null;
      try {
        servletResponseWrapper0 = new ServletResponseWrapper((ServletResponse) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Response cannot be null
         //
         verifyException("javax.servlet.ServletResponseWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionMode(" interface.  This is required to support ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid sessionMode [ interface.  This is required to support ].  Allowed values are public static final String constants in the org.jsecurity.web.DefaultWebSecurityManager class: 'http' or 'jsecurity', with 'http' being the default.
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("Incoming byte array of size ");
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
      defaultWebSecurityManager0.getSessionMode();
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      SessionListener sessionListener0 = mock(SessionListener.class, new ViolatedAssumptionAnswer());
      defaultWebSecurityManager0.remove(sessionListener0);
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setRememberMeCookiePath("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
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
  public void test07()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      defaultWebSecurityManager0.setRememberMeCookiePath("`/%");
      Integer integer0 = new Integer(349);
      defaultWebSecurityManager0.setRememberMeCookieMaxAge(integer0);
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
  public void test08()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
      SimpleAccountRealm simpleAccountRealm1 = new SimpleAccountRealm("");
      DefaultWebSecurityManager defaultWebSecurityManager1 = new DefaultWebSecurityManager(simpleAccountRealm1);
      defaultWebSecurityManager1.getPrincipals((Session) null);
      SimplePrincipalCollection simplePrincipalCollection0 = null;
      try {
        simplePrincipalCollection0 = new SimplePrincipalCollection((PrincipalCollection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsecurity.subject.SimplePrincipalCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      FileSystemHandling.createFolder(evoSuiteFile0);
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      DelegatingSubject delegatingSubject0 = new DelegatingSubject(defaultWebSecurityManager0);
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
  public void test10()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      defaultWebSecurityManager0.setSessionMode("http");
      assertTrue(defaultWebSecurityManager0.isHttpSessionMode());
      
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(servletResponse0).getContentType();
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      servletResponseWrapper0.getContentType();
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.createSubject((ServletRequest) servletRequestWrapper0, (ServletResponse) servletResponseWrapper0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // javax.servlet.ServletRequestWrapper cannot be cast to javax.servlet.http.HttpServletRequest
         //
         verifyException("org.jsecurity.web.session.ServletContainerSessionManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(servletRequest0).getRemoteHost();
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      Subject subject0 = defaultWebSecurityManager0.createSubject((Session) null, (ServletRequest) servletRequestWrapper0, (ServletResponse) null);
      assertFalse(subject0.isAuthenticated());
      
      defaultWebSecurityManager0.bind(subject0, servletRequestWrapper0, (ServletResponse) null);
      assertTrue(defaultWebSecurityManager0.isHttpSessionMode());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/jsecurity-ehcache/ehcache_auto_created_1392409281320/org.jsecurity.realm.text.PropertiesRealm-0-accounts.index");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      DelegatingSubject delegatingSubject0 = new DelegatingSubject(defaultWebSecurityManager0);
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(servletRequest0).getRemoteHost();
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      defaultWebSecurityManager0.newSessionManagerInstance();
      ServletResponseWrapper servletResponseWrapper1 = new ServletResponseWrapper(servletResponseWrapper0);
      defaultWebSecurityManager0.isAuthenticated((Session) null, servletRequestWrapper0, servletResponseWrapper1);
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      SimplePrincipalCollection simplePrincipalCollection1 = new SimplePrincipalCollection(simplePrincipalCollection0);
      defaultWebSecurityManager0.createSubject((PrincipalCollection) simplePrincipalCollection1, false, (Session) null, (ServletRequest) servletRequestWrapper0, (ServletResponse) servletResponseWrapper0);
      assertTrue(defaultWebSecurityManager0.isHttpSessionMode());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      Integer integer0 = new Integer(275);
      defaultWebSecurityManager0.setRememberMeCookieMaxAge(integer0);
      defaultWebSecurityManager0.setSessionMode("jsecurity");
      ServletContainerSessionManager servletContainerSessionManager0 = new ServletContainerSessionManager();
      defaultWebSecurityManager0.setSessionIdCookieName("VaT9MyDwqrJ8r");
      assertEquals("jsecurity", defaultWebSecurityManager0.getSessionMode());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      Session session0 = null;
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn("7$2hJto {PC").when(servletRequest0).getRemoteHost();
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection(servletRequestWrapper0, "org.jsecurity.web.DefaultWebSecurityManager_PRINCIPALS_SESSION_KEY");
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      Subject subject0 = defaultWebSecurityManager0.createSubject((PrincipalCollection) simplePrincipalCollection0, true, (Session) null, (ServletRequest) servletRequestWrapper0, (ServletResponse) servletResponseWrapper0);
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

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      Session session0 = null;
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn("http").when(servletRequest0).getRemoteHost();
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletRequestWrapper servletRequestWrapper1 = new ServletRequestWrapper(servletRequestWrapper0);
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      Subject subject0 = defaultWebSecurityManager0.createSubject((PrincipalCollection) simplePrincipalCollection0, true, (Session) null, (ServletRequest) servletRequestWrapper1, (ServletResponse) servletResponseWrapper0);
      ServletRequestWrapper servletRequestWrapper2 = new ServletRequestWrapper(servletRequestWrapper0);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.bind(subject0, servletRequestWrapper2, servletResponseWrapper0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No ServletRequest found in ThreadContext. Make sure WebUtils.bind() is being called. (typically called by JSecurityFilter)  This could also happen when running integration tests that don't properly call WebUtils.bind().
         //
         verifyException("org.jsecurity.web.WebUtils", e);
      }
  }
}