/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 10:40:08 GMT 2018
 */

package org.javathena.login;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Calendar;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.javathena.core.data.Socket_data;
import org.javathena.core.utiles.ACO;
import org.javathena.data.IDBManagementLogin;
import org.javathena.login.Login;
import org.javathena.login.UserManagement;
import org.javathena.login.parse.FromAdmin;
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
      login0.do_initXML();
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login_ConnectionListener0.run();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Login.showTab(byteArray0);
      try { 
        MockInetAddress.getByAddress(byteArray0);
        fail("Expecting exception: UnknownHostException");
      
      } catch(UnknownHostException e) {
         //
         // Not IPv4: [0]
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Login login0 = new Login();
      login0.setAuth_max((-2187));
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      login0.check_ip(inetAddress0);
      login_ConnectionListener0.close();
      login_ConnectionListener0.run();
      Login.setPASSWORDENC((-2390));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
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
  public void test04()  throws Throwable  {
      Login.login_log("Zq");
      Login login0 = new Login();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Login.getPASSWORDENC();
      byte[] byteArray0 = new byte[7];
      MockSocket mockSocket0 = new MockSocket();
      FromAdmin fromAdmin0 = new FromAdmin();
      Socket_data socket_data0 = new Socket_data(mockSocket0, fromAdmin0);
      Login.logUnknownPackets(socket_data0);
      assertNull(socket_data0.getName());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Login login0 = new Login();
      login0.getLog_fp();
      // Undeclared exception!
      try { 
        Login.login_log("Could not read ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Login login0 = new Login();
      login0.save_config_in_log();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Login login0 = new Login();
      login0.getOut();
      login0.setOut((PrintWriter) null);
      // Undeclared exception!
      try { 
        login0.yesNoOnOffToBoolean("java.util.Calendar");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // anw doit etre egale a yes/no/on/off
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_initXML();
      Login.display_title();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Login.setPASSWORDENC((-1613580914));
      Login login0 = new Login();
      int int0 = login0.check_ipmask(204, (String) null);
      assertEquals(0, int0);
      assertEquals(0, login0.getAuth_max());
      assertEquals((-1613580914), login0.getPASSWORDENC());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Login login0 = new Login();
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
  public void test12()  throws Throwable  {
      Login login0 = new Login();
      MySQLConfig.setLogin_server_id("conf/subnet_athena.conf");
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login0.getAuth_max();
      IDBManagementLogin iDBManagementLogin0 = Login.getDbManagemtType();
      assertNull(iDBManagementLogin0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Login login0 = new Login();
      Login.display_title();
      login0.setAuth_max((-1846528835));
      // Undeclared exception!
      try { 
        login0.parse_console("conf/subnet_athena.conf");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_initTXT();
      int int0 = login0.getAuth_num();
      assertEquals(0, int0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Login login0 = new Login();
      int int0 = login0.getAuth_max();
      assertEquals(0, int0);
      
      login0.do_initTXT();
      Socket_data socket_data0 = new Socket_data((Socket) null);
      Login.getMd5Data(socket_data0);
      assertEquals(0, socket_data0.getEof());
      assertEquals("2345678910111213", socket_data0.getMd5key());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_syncTXT();
      Login.Timer_interval_check_auth_sync login_Timer_interval_check_auth_sync0 = login0.new Timer_interval_check_auth_sync();
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
  public void test17()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.setAccess_allow("nD");
      login0.do_initTXT();
      Login.getDbManagemtType();
      int int0 = login0.parse_console("Zq");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Login login0 = new Login();
      MySQLConfig.setLogin_server_id("conf/subnet_athena.conf");
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      login0.getAuth_max();
      Login.getDbManagemtType();
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      // Undeclared exception!
      try { 
        Login.version(socket_data0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
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
  public void test20()  throws Throwable  {
      Login login0 = new Login();
      login0.setAuth_max((-1846528835));
      login0.do_initXML();
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
  public void test21()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initXML();
      login0.check_auth_sync();
      // Undeclared exception!
      login0.do_init();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initTXT();
      String string0 = "w9";
      login0.parse_console("alive");
      MySQLConfig.setLogin_server_ip("w9");
      // Undeclared exception!
      try { 
        login0.yesNoOnOffToBoolean("w9");
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
      FromClient fromClient0 = new FromClient();
      Socket_data socket_data0 = new Socket_data((Socket) null, fromClient0);
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("SOUL_LINKER", 10023);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      socket_data0.setUsers(1030);
      // Undeclared exception!
      try { 
        login0.parse_admin(2, socket_data0, login0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.core.data.Socket_data", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initTXT();
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte)38;
      byteArray0[2] = (byte) (-40);
      byteArray0[3] = (byte)14;
      login0.parse_console("help");
      int[] intArray0 = new int[8];
      intArray0[1] = (int) (byte) (-40);
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      MockSocket mockSocket0 = null;
      try {
        mockSocket0 = new MockSocket(inetAddress0, 2000000, inetAddress0, (byte)38);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // port out of range:2000000
         //
         verifyException("java.net.InetSocketAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Login login0 = new Login();
      login0.setAuth_max(31030);
      NetworkHandling.sendMessageOnTcp((EvoSuiteLocalAddress) null, "CONF/SUBNET_ATHENA.CONF");
      MockInetAddress.getLoopbackAddress();
      FromAdmin fromAdmin0 = new FromAdmin();
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
  public void test26()  throws Throwable  {
      Login login0 = new Login();
      login0.setAuth_max(31040);
      UserManagement.addUserTXT("V!E4IL~D*Q", "V!E4IL~D*Q", "Zq", 'B');
      Login.Timer_interval_check_auth_sync login_Timer_interval_check_auth_sync0 = login0.new Timer_interval_check_auth_sync();
      ACO aCO0 = ACO.MUTUAL_FAILTURE;
      ConfigurationManagement.setAccess_order(aCO0);
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
  public void test27()  throws Throwable  {
      Login login0 = new Login();
      int[] intArray0 = new int[7];
      intArray0[0] = 10;
      intArray0[1] = 2;
      UserManagement.addUserTXT("conf/subnet_athena.conf", "conf/subnet_athena.conf", "conf/subnet_athena.conf", 'J');
      Login.Timer_interval_check_auth_sync login_Timer_interval_check_auth_sync0 = login0.new Timer_interval_check_auth_sync();
      ACO aCO0 = ACO.MUTUAL_FAILTURE;
      ConfigurationManagement.setAccess_order(aCO0);
      Login.mmo_auth_syncTXT();
      int int0 = FromChar.REQUEST_ACCOUNT_DATA;
      login0.do_initXML();
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
  public void test28()  throws Throwable  {
      Login login0 = new Login();
      login0.getServer_fd();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Login login0 = new Login();
      int[] intArray0 = new int[7];
      intArray0[0] = 10;
      intArray0[1] = 2;
      intArray0[2] = 2;
      UserManagement.addUserTXT("conf/subnet_athena.conf", "conf/subnet_athena.conf", "conf/subnet_athena.conf", 'J');
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
  public void test30()  throws Throwable  {
      Login login0 = new Login();
      MySQLConfig.setLogin_server_db("conf/subnet_athena.conf");
      login0.getAuth_num();
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("ON", 12345);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      Login.mmo_auth_initXML();
      MySQLConfig.setDefault_codepage("conf/subnet_athena.conf");
      ACO aCO0 = ACO.ALLOW_DENY;
      ConfigurationManagement.setAccess_order(aCO0);
      Login.mmo_auth_syncTXT();
      int int0 = Calendar.NARROW_STANDALONE;
      login0.do_initXML();
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
  public void test31()  throws Throwable  {
      Login login0 = new Login();
      UserManagement.addUserTXT("conf/subnet_athena.conf", "conf/subnet_athena.conf", "conf/subnet_athena.conf", '$');
      Login.Timer_interval_check_auth_sync login_Timer_interval_check_auth_sync0 = login0.new Timer_interval_check_auth_sync();
      ACO aCO0 = ACO.MUTUAL_FAILTURE;
      ConfigurationManagement.setAccess_order(aCO0);
      Login.mmo_auth_syncTXT();
      int int0 = FromChar.REQUEST_ACCOUNT_DATA;
      Login.mmo_auth_initXML();
      Login login1 = new Login();
      Login login2 = new Login();
      // Undeclared exception!
      try { 
        login2.do_initTXT();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Login login0 = new Login();
      MySQLConfig.setLogin_server_pw("");
      Login.mmo_auth_syncTXT();
      login0.check_auth_sync();
      Login login1 = new Login();
      UserManagement.addUserTXT("", "", "", 'v');
      Login.Timer_interval_check_auth_sync login_Timer_interval_check_auth_sync0 = login1.new Timer_interval_check_auth_sync();
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
  public void test33()  throws Throwable  {
      NetworkHandling.sendMessageOnTcp((EvoSuiteLocalAddress) null, "");
      Login.logUnknownPackets((Socket_data) null);
      Login login0 = new Login();
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
  public void test34()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_syncTXT();
      int int0 = Calendar.YEAR;
      Login login1 = new Login();
      int[] intArray0 = new int[8];
      intArray0[0] = 1;
      intArray0[1] = 1;
      intArray0[2] = 2000000;
      intArray0[3] = 2;
      ConfigurationManagement.setAccess_denynum((-2967));
      MySQLConfig.setDefault_codepage("0000-00-00 00:00:00");
      login0.do_initXML();
      int int1 = FromClient.NEW_CONNECTION_OF_CLIENT;
      MySQLConfig.setLogin_server_db("conf/subnet_athena.conf");
      // Undeclared exception!
      try { 
        login1.yesNoOnOffToBoolean("Med+KL");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // anw doit etre egale a yes/no/on/off
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_syncTXT();
      int int0 = Calendar.YEAR;
      Login login1 = new Login();
      Login login2 = new Login();
      ConfigurationManagement.setAccess_denynum(9);
      MySQLConfig.setDefault_codepage("conf/subnet_athena.conf");
      login2.do_initXML();
      int int1 = FromClient.NEW_CONNECTION_OF_CLIENT;
      MySQLConfig.setLogin_server_db("Localized messages from resource bundle 'com.mysql.jdbc.LocalizedErrorMessages' not loaded during initialization of driver.");
      // Undeclared exception!
      try { 
        login2.yesNoOnOffToBoolean("%`0*dfk3OL>ZA(z");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // anw doit etre egale a yes/no/on/off
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Login login0 = new Login();
      String string0 = "ZQq";
      login0.yesNoOnOffToBoolean("OFF");
      login0.do_initTXT();
      login0.setAuth_max(7);
      Login login1 = new Login();
      // Undeclared exception!
      try { 
        login0.yesNoOnOffToBoolean("ZQQ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // anw doit etre egale a yes/no/on/off
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initTXT();
      login0.parse_console("|NtivWe");
      MySQLConfig.setDefault_codepage("|NtivWe");
      UserManagement.addUserTXT("[d2(] Uc3BN0", (String) null, "conf/subnet_athena.conf", 'S');
      ACO aCO0 = ACO.STRSIZE;
      ConfigurationManagement.setAccess_order(aCO0);
      Login.mmo_auth_syncTXT();
      login0.do_initXML();
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
}
