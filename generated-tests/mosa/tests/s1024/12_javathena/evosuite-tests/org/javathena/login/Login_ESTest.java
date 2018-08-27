/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 14:55:47 GMT 2018
 */

package org.javathena.login;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Calendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.javathena.core.data.Excecutable;
import org.javathena.core.data.IParse;
import org.javathena.core.data.Socket_data;
import org.javathena.core.utiles.ACO;
import org.javathena.login.Login;
import org.javathena.login.UserManagement;
import org.javathena.login.parse.FromChar;
import org.javathena.login.parse.FromClient;
import org.javathena.utiles.ConfigurationManagement;
import org.javathena.utiles.sql.MySQLConfig;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Login_ESTest extends Login_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_syncXML();
      login0.check_auth_sync();
      login0.getServer_fd();
      Random.setNextRandom(2000000);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_initXML();
      ConfigurationManagement.setAccess_denynum(2);
      UserManagement.addUserTXT("conf/subnet_athena.conf", "conf/subnet_athena.conf", "conf/subnet_athena.conf", 'W');
      login0.save_config_in_log();
      Login.mmo_auth_syncTXT();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockInetAddress.anyLocalAddress();
      Login login0 = new Login();
      login0.setAuth_max((-1766));
      assertEquals((-1766), login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      Login login0 = new Login();
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
  public void test04()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initXML();
      login0.getOut();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Login login0 = new Login();
      int int0 = Calendar.SHORT_STANDALONE;
      MockInetAddress.getLoopbackAddress();
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      login0.check_ip(inetAddress0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      Login.login_log("'./]x:=>vWy  11");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Login login0 = new Login();
      login0.getAuth_max();
      Login.setPASSWORDENC(3127);
      login0.getServer_fd();
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
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Login login0 = new Login();
      // Undeclared exception!
      try { 
        login0.yesNoOnOffToBoolean("conf/subnet_athena.conf");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // anw doit etre egale a yes/no/on/off
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Login.display_title();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = Calendar.DECEMBER;
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)43;
      Login.showTab(byteArray0);
      Login login0 = new Login();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      FromClient fromClient0 = new FromClient();
      Socket_data socket_data0 = new Socket_data(mockSocket0, fromClient0);
      Login.logUnknownPackets(socket_data0);
      // Undeclared exception!
      try { 
        Login.mmo_auth_syncXML();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Login.getDbManagemtType();
      int int0 = Login.getPASSWORDENC();
      assertEquals(2, int0);
      
      Login login0 = new Login();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Login login0 = new Login();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(41);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0);
      login0.setOut(mockPrintWriter0);
      Login.mmo_auth_syncXML();
      int int0 = login0.check_auth_sync();
      assertEquals(0, login0.getAuth_max());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Login login0 = new Login();
      Login.End login_End0 = login0.new End();
      int int0 = login0.check_ipmask((-578), (String) null);
      assertEquals(0, login0.getAuth_max());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Login login0 = new Login();
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login_ConnectionListener0.close();
      int int0 = login0.getAuth_num();
      assertEquals(0, int0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_syncXML();
      int int0 = Calendar.DAY_OF_WEEK_IN_MONTH;
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login_ConnectionListener0.run();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Login login0 = new Login();
      login0.getLog_fp();
      System.setCurrentTimeMillis(100000000);
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
  public void test20()  throws Throwable  {
      Login login0 = new Login();
      MockSocket mockSocket0 = new MockSocket();
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      Login login1 = new Login();
      // Undeclared exception!
      try { 
        login1.parse_admin(100000000, socket_data0, login0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.core.data.Socket_data", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      Login login0 = new Login();
      Login login1 = new Login();
      boolean boolean0 = login0.yesNoOnOffToBoolean("ON");
      assertTrue(boolean0);
      
      int int0 = login0.getAuth_num();
      assertEquals(0, int0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Login login0 = new Login();
      ACO aCO0 = ACO.ALLOW_DENY;
      ConfigurationManagement.setAccess_order(aCO0);
      ConfigurationManagement.setAccess_denynum(50);
      login0.do_initXML();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Login login0 = new Login();
      ACO aCO0 = ACO.MUTUAL_FAILTURE;
      ConfigurationManagement.setAccess_order(aCO0);
      ConfigurationManagement.setAccess_denynum(50);
      login0.do_initXML();
      Login.login_log("conf/subnet_athena.conf");
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_syncTXT();
      Login.mmo_auth_syncXML();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Login login0 = new Login();
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
  public void test26()  throws Throwable  {
      Login login0 = new Login();
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login_ConnectionListener0.close();
      login_ConnectionListener0.run();
      login0.do_initTXT();
      Login.Timer_interval_check_auth_sync login_Timer_interval_check_auth_sync0 = login0.new Timer_interval_check_auth_sync();
      // Undeclared exception!
      try { 
        login0.yesNoOnOffToBoolean("\"Z+1WS");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // anw doit etre egale a yes/no/on/off
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initTXT();
      int int0 = login0.parse_console("1u");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initTXT();
      Login.Timer_interval_check_auth_sync login_Timer_interval_check_auth_sync0 = login0.new Timer_interval_check_auth_sync();
      login_Timer_interval_check_auth_sync0.run();
      Login login1 = new Login();
      login1.save_config_in_log();
      UserManagement.setAccountIdCount(2416);
      MySQLConfig.setLogin_server_port(2);
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
  public void test29()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.setAccess_denynum(50);
      login0.do_initXML();
      int int0 = login0.parse_console("status");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_syncXML();
      // Undeclared exception!
      try { 
        login0.do_initXML();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         //  : Content is not allowed in prolog.
         //
         verifyException("com.thoughtworks.xstream.io.xml.DomDriver", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Socket socket0 = null;
      Socket_data socket_data0 = new Socket_data((Socket) null);
      socket_data0.getFunc_console();
      socket_data0.setFunc_recv((Excecutable) null);
      Login.getMd5Data(socket_data0);
      Login login0 = new Login();
      login0.do_initTXT();
      int int0 = 3368;
      login0.auth_max = 3368;
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
  public void test32()  throws Throwable  {
      Login login0 = new Login();
      ACO aCO0 = ACO.MUTUAL_FAILTURE;
      ConfigurationManagement.setAccess_order(aCO0);
      ConfigurationManagement.setAccess_allownum(225);
      login0.do_initTXT();
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initTXT();
      ACO aCO0 = ACO.MUTUAL_FAILTURE;
      ConfigurationManagement.setAccess_order(aCO0);
      ConfigurationManagement.setAccess_denynum(50);
      ConfigurationManagement.setAccess_allownum(100000000);
      login0.do_initXML();
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_initXML();
      ACO aCO0 = ACO.ALLOW_DENY;
      ConfigurationManagement.setAccess_order(aCO0);
      ConfigurationManagement.setAccess_denynum(50);
      ConfigurationManagement.setAccess_allownum(2);
      login0.do_initXML();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initTXT();
      Login login1 = new Login();
      login1.parse_console("help");
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initXML();
      Login login1 = new Login();
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
  public void test37()  throws Throwable  {
      UserManagement.addUserTXT("@9B", "0@", "\n\n", 'W');
      Login login0 = new Login();
      login0.yesNoOnOffToBoolean("YES");
      Login.mmo_auth_syncTXT();
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Login login0 = new Login();
      UserManagement.addUserTXT("conf/subnet_athena.conf", "@9B", "conf/subnet_athena.conf", 'C');
      Login login1 = new Login();
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
      UserManagement.addUserTXT("]T", "", "]T", 'W');
      Login login0 = new Login();
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
}
