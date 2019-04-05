/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 19:55:47 GMT 2019
 */

package org.javathena.login;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.javathena.core.data.Socket_data;
import org.javathena.core.utiles.ACO;
import org.javathena.data.IDBManagementLogin;
import org.javathena.login.Login;
import org.javathena.login.UserManagement;
import org.javathena.login.parse.FromChar;
import org.javathena.login.parse.FromClient;
import org.javathena.utiles.ConfigurationManagement;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Login_ESTest extends Login_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Login login0 = new Login();
      login0.setAuth_max(1181);
      // Undeclared exception!
      try { 
        Login.do_initSQL();
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initTXT();
      PrintWriter printWriter0 = login0.getOut();
      assertNotNull(printWriter0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Login login0 = new Login();
      login0.setAuth_max((byte)5);
      int int0 = login0.getAuth_max();
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Login login0 = new Login();
      int[] intArray0 = new int[0];
      login0.setServer_fd(intArray0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Login.setPASSWORDENC(74);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Login login0 = new Login();
      login0.setAuth_max((-2021347096));
      int int0 = login0.getAuth_max();
      assertEquals((-2021347096), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Login.logUnknownPackets((Socket_data) null);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        Login.codingKeyAdministration((Socket_data) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Login login0 = new Login();
      int int0 = login0.check_ipmask((-1), "t#\"6$39j&_nS&`=%KR");
      assertEquals(0, int0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Login login0 = new Login();
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      login0.check_ip(inetAddress0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Login login0 = new Login();
      // Undeclared exception!
      try { 
        login0.parse_console("FEx9&dSc\"Wuet_");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        Login.mmo_auth_initTXT();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Login login0 = new Login();
      // Undeclared exception!
      try { 
        login0.do_init();
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Login login0 = new Login();
      login0.save_config_in_log();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Login login0 = new Login();
      login0.do_final();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Login login0 = new Login();
      // Undeclared exception!
      try { 
        login0.check_auth_sync();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = Login.mmo_auth_initXML();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Login login0 = new Login();
      int[] intArray0 = new int[3];
      login0.setServer_fd(intArray0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Login login0 = new Login();
      Login.End login_End0 = login0.new End();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Login login0 = new Login();
      boolean boolean0 = login0.yesNoOnOffToBoolean("OFF");
      assertFalse(boolean0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Login login0 = new Login();
      boolean boolean0 = login0.yesNoOnOffToBoolean("NO");
      assertEquals(0, login0.getAuth_max());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Login login0 = new Login();
      boolean boolean0 = login0.yesNoOnOffToBoolean("ON");
      assertTrue(boolean0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Login login0 = new Login();
      // Undeclared exception!
      try { 
        login0.yesNoOnOffToBoolean("R[*rDGV\"J3?");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // anw doit etre egale a yes/no/on/off
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Login login0 = new Login();
      boolean boolean0 = login0.yesNoOnOffToBoolean("YES");
      assertTrue(boolean0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.setAccess_allownum((byte)39);
      ACO aCO0 = ACO.ALLOW_DENY;
      ConfigurationManagement.setAccess_order(aCO0);
      login0.do_initTXT();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Login login0 = new Login();
      ACO aCO0 = ACO.MUTUAL_FAILTURE;
      ConfigurationManagement.setAccess_order(aCO0);
      login0.save_config_in_log();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.setAccess_denynum(100000000);
      // Undeclared exception!
      login0.save_config_in_log();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.setAccess_denynum((-804));
      login0.do_initTXT();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Login login0 = new Login();
      ACO aCO0 = ACO.ALLOW_DENY;
      ConfigurationManagement.setAccess_order(aCO0);
      login0.do_initTXT();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initTXT();
      int int0 = login0.parse_console("t#\"6$39j&_nS&`=%KR");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Login login0 = new Login();
      MockSocket mockSocket0 = new MockSocket();
      mockSocket0.close();
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      login0.parse_admin(1662, socket_data0, login0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Login login0 = new Login();
      FromClient fromClient0 = new FromClient();
      Socket_data socket_data0 = new Socket_data((Socket) null, fromClient0);
      socket_data0.setMd5key("cXUd[wWXTe5");
      Login.getMd5Data(socket_data0);
      int int0 = login0.parse_admin(475, socket_data0, login0);
      assertEquals("2345678910111213", socket_data0.getMd5key());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Login login0 = new Login();
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login_ConnectionListener0.run();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_syncXML();
      int int0 = login0.check_auth_sync();
      assertEquals(0, login0.getAuth_max());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      Login.showTab(byteArray0);
      assertEquals(8, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_syncTXT();
      Login.mmo_auth_syncXML();
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_syncTXT();
      UserManagement.addUserTXT((String) null, "p9ht;2,R#H{/Y", "conf/subnet_athena.conf", '\\');
      // Undeclared exception!
      try { 
        login0.do_initTXT();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_syncTXT();
      UserManagement.addAccountIdCount((-652));
      // Undeclared exception!
      try { 
        login0.do_initTXT();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Login login0 = new Login();
      UserManagement.addUserTXT("conf/subnet_athena.conf", "", "", '@');
      Login.mmo_auth_syncTXT();
      // Undeclared exception!
      try { 
        login0.do_initTXT();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Login login0 = new Login();
      int int0 = Login.mmo_auth_initTXT();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_syncXML();
      // Undeclared exception!
      try { 
        Login.mmo_auth_initXML();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         //  : Content is not allowed in prolog.
         //
         verifyException("com.thoughtworks.xstream.io.xml.DomDriver", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Login.login_log("-JD");
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FromChar fromChar0 = new FromChar();
      Socket_data socket_data0 = new Socket_data((Socket) null, fromChar0);
      Login.getMd5Data(socket_data0);
      // Undeclared exception!
      try { 
        Login.codingKeyAdministration(socket_data0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.core.data.Socket_data", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FromChar fromChar0 = new FromChar();
      Socket_data socket_data0 = new Socket_data((Socket) null, fromChar0);
      // Undeclared exception!
      try { 
        Login.codingKeyAdministration(socket_data0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.core.data.Socket_data", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Login login0 = new Login();
      int int0 = login0.getAuth_max();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Login.setPASSWORDENC((-1933066711));
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initXML();
      // Undeclared exception!
      try { 
        login0.parse_console("shutdown");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      IDBManagementLogin iDBManagementLogin0 = Login.getDbManagemtType();
      assertNull(iDBManagementLogin0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Login.display_title();
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FromChar fromChar0 = new FromChar();
      Socket_data socket_data0 = new Socket_data((Socket) null, fromChar0);
      // Undeclared exception!
      try { 
        Login.version(socket_data0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      int int0 = Login.getPASSWORDENC();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Login login0 = new Login();
      login0.getOut();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Login login0 = new Login();
      int int0 = login0.check_ipmask(31036, "?7x;+pz8;xSf2");
      assertEquals(0, int0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Login login0 = new Login();
      InetAddress inetAddress0 = MockInetAddress.getByName("conf/subnet_athena.conf");
      login0.check_ip(inetAddress0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Login login0 = new Login();
      int[] intArray0 = login0.getServer_fd();
      assertEquals(0, login0.getAuth_max());
      assertNotNull(intArray0);
      assertEquals(30, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Login login0 = new Login();
      int int0 = login0.getAuth_num();
      assertEquals(0, int0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      // Undeclared exception!
      try { 
        Login.codingKey((Socket_data) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Login login0 = new Login();
      login0.setOut((PrintWriter) null);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Login login0 = new Login();
      login0.getLog_fp();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Login login0 = new Login();
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login_ConnectionListener0.close();
      login_ConnectionListener0.run();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Login login0 = new Login();
      Login.Timer_interval_check_auth_sync login_Timer_interval_check_auth_sync0 = login0.new Timer_interval_check_auth_sync();
      // Undeclared exception!
      try { 
        login_Timer_interval_check_auth_sync0.run();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.login.Login", e);
      }
  }
}
