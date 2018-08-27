/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 10:50:32 GMT 2018
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
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.javathena.core.data.Auth_data;
import org.javathena.core.data.Socket_data;
import org.javathena.core.utiles.ACO;
import org.javathena.data.IDBManagementLogin;
import org.javathena.login.Login;
import org.javathena.login.UserManagement;
import org.javathena.utiles.ConfigurationManagement;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Login_ESTest extends Login_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Login login0 = new Login();
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login_ConnectionListener0.run();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Login login0 = new Login();
      login0.setAuth_max(100000000);
      assertEquals(100000000, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
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

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Login.mmo_auth_initXML();
      Login.setPASSWORDENC(0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        Login.do_initSQL();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.utiles.ConfigurationManagement", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Login login0 = new Login();
      int int0 = login0.getAuth_max();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Login login0 = new Login();
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)70;
      byteArray0[1] = (byte)10;
      Login.showTab(byteArray0);
      assertArrayEquals(new byte[] {(byte)70, (byte)10}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = Login.getPASSWORDENC();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Login login0 = new Login();
      login0.getOut();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Login.display_title();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Login login0 = new Login();
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      login0.check_ip(inetAddress0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Socket_data socket_data0 = new Socket_data((Socket) null);
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
  public void test12()  throws Throwable  {
      Login login0 = new Login();
      int[] intArray0 = login0.getServer_fd();
      assertEquals(0, login0.getAuth_max());
      assertNotNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Login login0 = new Login();
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login_ConnectionListener0.close();
      login_ConnectionListener0.close();
      login_ConnectionListener0.run();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IDBManagementLogin iDBManagementLogin0 = Login.getDbManagemtType();
      assertNull(iDBManagementLogin0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initTXT();
      login0.check_auth_sync();
      login0.check_auth_sync();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Login login0 = new Login();
      login0.getLog_fp();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Login.login_log("Vo");
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Login login0 = new Login();
      Auth_data auth_data0 = UserManagement.addUserTXT("conf/subnet_athena.conf", "conf/subnet_athena.conf", "conf/subnet_athena.conf", 'P');
      assertEquals(2000000, (int)auth_data0.getAccount_id());
      
      login0.do_initTXT();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Login.mmo_auth_initXML();
      // Undeclared exception!
      try { 
        Login.version((Socket_data) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Login login0 = new Login();
      int int0 = login0.getAuth_num();
      assertEquals(0, int0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initXML();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_syncTXT();
      // Undeclared exception!
      try { 
        Login.mmo_auth_initTXT();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Login login0 = new Login();
      UserManagement.addUserTXT("conf/subnet_athena.conf", "conf/subnet_athena.conf", "conf/subnet_athena.conf", 'D');
      Login.mmo_auth_syncTXT();
      // Undeclared exception!
      try { 
        Login.mmo_auth_initTXT();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      Login.logUnknownPackets(socket_data0);
      assertEquals(0, socket_data0.getListenPort());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Login login0 = new Login();
      MockSocket mockSocket0 = new MockSocket();
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      Login login1 = new Login();
      // Undeclared exception!
      try { 
        login0.parse_admin(10, socket_data0, login1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.core.data.Socket_data", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_mosa/projects/12_javathena/save/account.xml");
      FileSystemHandling.createFolder(evoSuiteFile0);
      int int0 = Login.mmo_auth_initXML();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Login login0 = new Login();
      UserManagement.addUserTXT("LOGIN_LOG_39", "{4SKWv8//5vf[G6l", "{4SKWv8//5vf[G6l", 'X');
      Login.mmo_auth_syncTXT();
      Login login1 = new Login();
      // Undeclared exception!
      try { 
        login1.do_initTXT();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_syncTXT();
      login0.do_initXML();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Login login0 = new Login();
      int int0 = login0.check_ipmask(8, "OFF");
      assertEquals(0, int0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      // Undeclared exception!
      try { 
        Login.codingKey(socket_data0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.core.data.Socket_data", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Login login0 = new Login();
      boolean boolean0 = login0.yesNoOnOffToBoolean("ON");
      assertTrue(boolean0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Login login0 = new Login();
      PrintWriter printWriter0 = Login.loginLogOut;
      login0.setOut((PrintWriter) null);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initTXT();
      login0.parse_console("conf/subnet_athena.conf");
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Login login0 = new Login();
      boolean boolean0 = login0.yesNoOnOffToBoolean("YES");
      assertEquals(0, login0.getAuth_max());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Login login0 = new Login();
      ACO aCO0 = ACO.ALLOW_DENY;
      ConfigurationManagement.setAccess_order(aCO0);
      login0.do_initTXT();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Login login0 = new Login();
      ACO aCO0 = ACO.STRSIZE;
      ConfigurationManagement.setAccess_order(aCO0);
      login0.do_initTXT();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initTXT();
      // Undeclared exception!
      try { 
        login0.parse_console("quit");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initTXT();
      // Undeclared exception!
      try { 
        login0.parse_console("end");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Login login0 = new Login();
      UserManagement.addUserTXT("IjAbdn$>a", "conf/subnet_athena.conf", "IjAbdn$>a", 'S');
      Login.mmo_auth_syncTXT();
      // Undeclared exception!
      try { 
        Login.mmo_auth_initTXT();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.setAccess_denynum(2);
      login0.do_initTXT();
      login0.parse_console("*:<L>O");
      login0.parse_console("alive");
      login0.parse_console("*:<L>O");
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initTXT();
      login0.parse_console("help");
      int int0 = MockThread.NORM_PRIORITY;
      assertFalse(int0 == int1);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initTXT();
      boolean boolean0 = login0.yesNoOnOffToBoolean("NO");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initTXT();
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
  public void test44()  throws Throwable  {
      Socket_data socket_data0 = new Socket_data((Socket) null);
      socket_data0.setMd5key("IG]Q");
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
  public void test45()  throws Throwable  {
      Login login0 = new Login();
      UserManagement.setAccountIdCount((-1343));
      UserManagement.addUserTXT("ky0gy]6Fk", "ky0gy]6Fk", "ky0gy]6Fk", 'P');
      Login.mmo_auth_syncTXT();
      // Undeclared exception!
      try { 
        login0.yesNoOnOffToBoolean("Expected ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // anw doit etre egale a yes/no/on/off
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initTXT();
      int int0 = login0.parse_console("status");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Login login0 = new Login();
      UserManagement.addUserTXT("conf/subnet_athena.conf", "conf/subnet_athena.conf", "conf/subnet_athena.conf", 'Q');
      Login.mmo_auth_syncTXT();
      Login login1 = new Login();
      // Undeclared exception!
      try { 
        login1.do_initTXT();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}