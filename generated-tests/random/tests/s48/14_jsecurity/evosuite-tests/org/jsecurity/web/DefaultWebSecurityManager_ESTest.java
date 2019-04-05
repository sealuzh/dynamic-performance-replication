/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 10:25:47 GMT 2019
 */

package org.jsecurity.web;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ObjectStreamConstants;
import java.io.SerializablePermission;
import java.util.Collection;
import java.util.LinkedList;
import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestWrapper;
import javax.servlet.ServletResponse;
import javax.servlet.ServletResponseWrapper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.jsecurity.authc.AuthenticationListener;
import org.jsecurity.authc.AuthenticationToken;
import org.jsecurity.authz.permission.WildcardPermissionResolver;
import org.jsecurity.realm.Realm;
import org.jsecurity.realm.SimpleAccountRealm;
import org.jsecurity.session.Session;
import org.jsecurity.session.mgt.eis.MemorySessionDAO;
import org.jsecurity.subject.DelegatingSubject;
import org.jsecurity.subject.PrincipalCollection;
import org.jsecurity.subject.RememberMeManager;
import org.jsecurity.web.DefaultWebSecurityManager;
import org.jsecurity.web.WebRememberMeManager;
import org.jsecurity.web.session.DefaultWebSessionManager;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultWebSecurityManager_ESTest extends DefaultWebSecurityManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
      defaultWebSecurityManager0.setSessionMode("jsecurity");
      assertEquals("jsecurity", defaultWebSecurityManager0.getSessionMode());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      defaultWebSecurityManager0.getSessionMode();
      defaultWebSecurityManager0.setSessionMode("http");
      WebRememberMeManager webRememberMeManager0 = new WebRememberMeManager();
      // Undeclared exception!
      try { 
        webRememberMeManager0.getRememberedPrincipals();
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
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
      WildcardPermissionResolver wildcardPermissionResolver0 = new WildcardPermissionResolver();
      simpleAccountRealm0.setPermissionResolver(wildcardPermissionResolver0);
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
  public void test03()  throws Throwable  {
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
  public void test04()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionIdCookieName("2$Y+Vj!Z?f_ %");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The convenience passthrough methods for setting session id cookie attributes are only available when the underlying SessionManager implementation is org.jsecurity.web.session.DefaultWebSessionManager, which is enabled by default when the sessionMode is 'jsecurity'.
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(servletRequest0).getRemoteHost();
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      defaultWebSecurityManager0.createSubject((Session) null, (ServletRequest) servletRequestWrapper0, (ServletResponse) servletResponseWrapper0);
      MemorySessionDAO memorySessionDAO0 = new MemorySessionDAO();
      try { 
        memorySessionDAO0.readSession("org.jsecurity.web.DefaultWebSecurityManager_AUTHENTICATED_SESSION_KEY");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // There is no session with id [org.jsecurity.web.DefaultWebSecurityManager_AUTHENTICATED_SESSION_KEY]
         //
         verifyException("org.jsecurity.session.mgt.eis.CachingSessionDAO", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      RememberMeManager rememberMeManager0 = defaultWebSecurityManager0.getRememberMeManager();
      defaultWebSecurityManager0.setRememberMeManager(rememberMeManager0);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionIdCookieMaxAge(0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The convenience passthrough methods for setting session id cookie attributes are only available when the underlying SessionManager implementation is org.jsecurity.web.session.DefaultWebSessionManager, which is enabled by default when the sessionMode is 'jsecurity'.
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      defaultWebSecurityManager0.getPrincipals((Session) null, servletRequestWrapper0, servletResponseWrapper0);
      assertTrue(defaultWebSecurityManager0.isHttpSessionMode());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("', with '");
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      defaultWebSecurityManager0.isHttpSessionMode();
      String string0 = "N-DcJ92CCP@}xi2Si";
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionIdCookiePath("N-DcJ92CCP@}xi2Si");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The convenience passthrough methods for setting session id cookie attributes are only available when the underlying SessionManager implementation is org.jsecurity.web.session.DefaultWebSessionManager, which is enabled by default when the sessionMode is 'jsecurity'.
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<Realm> linkedList0 = new LinkedList<Realm>();
      DefaultWebSecurityManager defaultWebSecurityManager0 = null;
      try {
        defaultWebSecurityManager0 = new DefaultWebSecurityManager(linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Realms collection argument cannot be empty.
         //
         verifyException("org.jsecurity.mgt.RealmSecurityManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      DefaultWebSessionManager defaultWebSessionManager0 = new DefaultWebSessionManager();
      ServletRequest servletRequest0 = null;
      try { 
        defaultWebSessionManager0.retrieveSession("org.jsecurity.web.DefaultWebSecurityManager_PRINCIPALS_SESSION_KEY");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // There is no session with id [org.jsecurity.web.DefaultWebSecurityManager_PRINCIPALS_SESSION_KEY]
         //
         verifyException("org.jsecurity.session.mgt.eis.CachingSessionDAO", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      Integer integer0 = new Integer(3761);
      Integer.toUnsignedString((-1648693676));
      defaultWebSecurityManager0.setRememberMeCookieMaxAge(integer0);
      defaultWebSecurityManager0.newSessionManagerInstance();
      System.setCurrentTimeMillis(0L);
      DefaultWebSessionManager defaultWebSessionManager0 = new DefaultWebSessionManager();
      ServletRequest servletRequest0 = mock(ServletRequest.class, new ViolatedAssumptionAnswer());
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(servletRequest0);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      // Undeclared exception!
      try { 
        defaultWebSessionManager0.getSession(servletRequestWrapper0, servletResponseWrapper0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // javax.servlet.ServletRequestWrapper cannot be cast to javax.servlet.http.HttpServletRequest
         //
         verifyException("org.jsecurity.web.WebUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
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
  public void test13()  throws Throwable  {
      DefaultWebSecurityManager defaultWebSecurityManager0 = null;
      try {
        defaultWebSecurityManager0 = new DefaultWebSecurityManager((Realm) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Realm argument cannot be null
         //
         verifyException("org.jsecurity.mgt.RealmSecurityManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
      Integer integer0 = Integer.getInteger("jsecurity", (-1061));
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setRememberMeCookieMaxAge(integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "LQ7uM?#:K");
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager();
      DefaultWebSessionManager defaultWebSessionManager0 = new DefaultWebSessionManager();
      RememberMeManager rememberMeManager0 = defaultWebSecurityManager0.getRememberMeManager();
      defaultWebSecurityManager0.setRememberMeManager(rememberMeManager0);
      defaultWebSecurityManager0.setSessionManager(defaultWebSessionManager0);
      defaultWebSecurityManager0.getSessionMode();
      Session session0 = null;
      defaultWebSecurityManager0.isAuthenticated((Session) null);
      defaultWebSecurityManager0.getPrincipals((Session) null);
      defaultWebSecurityManager0.hasRole((PrincipalCollection) null, "2I");
      defaultWebSecurityManager0.setSessionIdCookieSecure(false);
      // Undeclared exception!
      try { 
        defaultWebSecurityManager0.setSessionMode("2I");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid sessionMode [2I].  Allowed values are public static final String constants in the org.jsecurity.web.DefaultWebSecurityManager class: 'http' or 'jsecurity', with 'http' being the default.
         //
         verifyException("org.jsecurity.web.DefaultWebSecurityManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = "(N^O7;Y<.]t<pGwNq";
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("(N^O7;Y<.]t<pGwNq");
      simpleAccountRealm0.supports((AuthenticationToken) null);
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
      Collection<Realm> collection0 = defaultWebSecurityManager0.getRealms();
      DefaultWebSecurityManager defaultWebSecurityManager1 = new DefaultWebSecurityManager(collection0);
      AuthenticationListener authenticationListener0 = mock(AuthenticationListener.class, new ViolatedAssumptionAnswer());
      defaultWebSecurityManager1.add(authenticationListener0);
      DefaultWebSessionManager defaultWebSessionManager0 = new DefaultWebSessionManager();
      SerializablePermission serializablePermission0 = ObjectStreamConstants.SUBSTITUTION_PERMISSION;
      // Undeclared exception!
      try { 
        defaultWebSessionManager0.validateSession("jsecurity");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // There is no session with id [jsecurity]
         //
         verifyException("org.jsecurity.session.mgt.eis.CachingSessionDAO", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = "^c%h6{QiOb4Ucl";
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("^c%h6{QiOb4Ucl");
      DefaultWebSecurityManager defaultWebSecurityManager0 = new DefaultWebSecurityManager(simpleAccountRealm0);
      DefaultWebSessionManager defaultWebSessionManager0 = new DefaultWebSessionManager();
      try { 
        defaultWebSessionManager0.retrieveSession("^c%h6{QiOb4Ucl");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // There is no session with id [^c%h6{QiOb4Ucl]
         //
         verifyException("org.jsecurity.session.mgt.eis.CachingSessionDAO", e);
      }
  }
}
