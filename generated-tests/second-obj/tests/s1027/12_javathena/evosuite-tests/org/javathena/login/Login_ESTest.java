/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 12:31:15 GMT 2018
 */

package org.javathena.login;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.Socket;
import java.util.Calendar;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.javathena.core.data.Socket_data;
import org.javathena.core.utiles.ACO;
import org.javathena.core.utiles.MultilanguageManagement;
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
      Login.mmo_auth_initXML();
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
  public void test01()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      int int0 = FromChar.STATUS_CHANGE;
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
  public void test02()  throws Throwable  {
      Login login0 = new Login();
      Login.Timer_interval_check_auth_sync login_Timer_interval_check_auth_sync0 = login0.new Timer_interval_check_auth_sync();
      login0.setAuth_max(100000000);
      int int0 = login0.check_ipmask(100000000, "  Refused IP are:");
      assertEquals(100000000, login0.getAuth_max());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Login.getDbManagemtType();
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
  public void test04()  throws Throwable  {
      Login login0 = new Login();
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      login0.check_ip(inetAddress0);
      // Undeclared exception!
      try { 
        Login.login_log("SMN");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      Login login0 = new Login();
      login0.do_initTXT();
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      Login.getMd5Data(socket_data0);
      assertEquals("2345678910111213", socket_data0.getMd5key());
      assertEquals(0, socket_data0.getEof());
      
      login0.getLog_fp();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_syncTXT();
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
  public void test07()  throws Throwable  {
      Login.login_log("~K^Q1-^T~?FpQ:R");
      int int0 = Login.getPASSWORDENC();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Login login0 = new Login();
      MySQLConfig.setLogin_server_id((String) null);
      // Undeclared exception!
      try { 
        login0.yesNoOnOffToBoolean("E&hr>");
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
      Login.mmo_auth_initXML();
      Login login0 = new Login();
      login0.getOut();
      login0.setOut((PrintWriter) null);
      // Undeclared exception!
      try { 
        Login.login_log("BABY");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Login.logUnknownPackets((Socket_data) null);
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
  public void test11()  throws Throwable  {
      Login.mmo_auth_initXML();
      MockSocket mockSocket0 = new MockSocket();
      Login login0 = new Login();
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login_ConnectionListener0.run();
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
  public void test12()  throws Throwable  {
      Login login0 = new Login();
      login0.getOut();
      login0.getLog_fp();
      MockSocket mockSocket0 = new MockSocket();
      FromAdmin fromAdmin0 = new FromAdmin();
      // Undeclared exception!
      try { 
        login0.yesNoOnOffToBoolean("GTBwg[YRI");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // anw doit etre egale a yes/no/on/off
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Login login0 = new Login();
      Login.display_title();
      int int0 = login0.getAuth_num();
      assertEquals(0, int0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      MockInetAddress.getLoopbackAddress();
      Login.display_title();
      Login login0 = new Login();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(4272);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0, true);
      login0.setOut(mockPrintWriter0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Login.login_log("CONF/SUBNET_ATHENA.CONF");
      MockSocket mockSocket0 = new MockSocket();
      FromAdmin fromAdmin0 = new FromAdmin();
      Socket_data socket_data0 = new Socket_data(mockSocket0, fromAdmin0);
      Socket_data socket_data1 = new Socket_data(mockSocket0, fromAdmin0);
      // Undeclared exception!
      try { 
        Login.version(socket_data1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      FromClient fromClient0 = new FromClient();
      Socket_data socket_data0 = new Socket_data(mockSocket0, fromClient0);
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
  public void test17()  throws Throwable  {
      Login.login_log("~K^Q1-^T~?FpQ:R");
      Login.setPASSWORDENC((-1928));
      Login.display_title();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.setAccess_denynum(2);
      login0.do_initXML();
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login_ConnectionListener0.run();
      MockSocket mockSocket0 = new MockSocket();
      login0.getOut();
      int int0 = Login.mmo_auth_initTXT();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Login.login_log(".");
      Login login0 = new Login();
      MySQLConfig.setLogin_server_pw("conf/subnet_athena.conf");
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-14);
      Login.loginLogOut = null;
      Login.showTab(byteArray0);
      int int0 = login0.check_ipmask(4353, "java.specification.version");
      assertEquals(0, int0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Login login0 = new Login();
      MySQLConfig.setLogin_server_port((-1083015984));
      login0.getAuth_max();
      MockSocket mockSocket0 = null;
      try {
        mockSocket0 = new MockSocket("conf/subnet_athena.conf", 2031, true);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Remote address/port is not opened: org.evosuite.runtime.vnet.EndPointInfo@43ea8b7c
         //
         verifyException("org.evosuite.runtime.vnet.VirtualNetwork", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.setAccess_denynum((-159));
      login0.do_initXML();
      MockFile mockFile0 = new MockFile("A-0");
      MockFile.createTempFile("A-0", "conf/subnet_athena.conf");
      MockFile mockFile1 = new MockFile(mockFile0, "conf/subnet_athena.conf");
      Locale locale0 = Locale.JAPAN;
      Object object0 = new Object();
      ConfigurationManagement.setAuth_before_save_file(10);
      // Undeclared exception!
      try { 
        login0.do_final();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initXML();
      Login login1 = new Login();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, true);
      Login.getDbManagemtType();
      Login.Timer_interval_check_auth_sync login_Timer_interval_check_auth_sync0 = login0.new Timer_interval_check_auth_sync();
      login_Timer_interval_check_auth_sync0.run();
      login1.check_auth_sync();
      // Undeclared exception!
      login1.do_final();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Login login0 = new Login();
      login0.save_config_in_log();
      Login.loginLogOut = null;
      login0.getServer_fd();
      login0.getServer_fd();
      Login.mmo_auth_syncXML();
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("NO", 12345);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      MockSocket mockSocket0 = null;
      try {
        mockSocket0 = new MockSocket((Proxy) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid Proxy
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockSocket", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Login login0 = new Login();
      String string0 = "QEI'";
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login_ConnectionListener0.close();
      Login.mmo_auth_syncTXT();
      login_ConnectionListener0.run();
      // Undeclared exception!
      try { 
        login0.parse_console("QEI'");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initXML();
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login_ConnectionListener0.run();
      login0.parse_console("IQEI'");
      MockSocket mockSocket0 = null;
      try {
        mockSocket0 = new MockSocket((InetAddress) null, 2000000, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockSocket", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initXML();
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login_ConnectionListener0.run();
      Login.mmo_auth_syncTXT();
      login_ConnectionListener0.run();
      login0.parse_console("QEI'");
      login0.setAuth_max(0);
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
  public void test27()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/12_javathena/save/account.xml");
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      // Undeclared exception!
      try { 
        Login.mmo_auth_initXML();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         //  : Premature end of file.
         //
         verifyException("com.thoughtworks.xstream.io.xml.DomDriver", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.setAccess_denynum(2);
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login_ConnectionListener0.run();
      MockSocket mockSocket0 = new MockSocket();
      login0.getOut();
      ACO aCO0 = ACO.ALLOW_DENY;
      ConfigurationManagement.setAccess_order(aCO0);
      login0.setAuth_max(44);
      login0.do_initTXT();
      // Undeclared exception!
      try { 
        MultilanguageManagement.init("");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Login login0 = new Login();
      login0.auth_max = 3598;
      ConfigurationManagement.setAccess_denynum(2);
      login0.do_initXML();
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login_ConnectionListener0.run();
      MockSocket mockSocket0 = new MockSocket();
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      socket_data0.setMd5key("DEMON");
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
  public void test30()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initXML();
      Login.setPASSWORDENC(2);
      ACO aCO0 = ACO.MUTUAL_FAILTURE;
      ConfigurationManagement.setAccess_order(aCO0);
      login0.setAuth_max((-2045283838));
      login0.do_initTXT();
      login0.check_auth_sync();
      ConfigurationManagement.setAccess_order(aCO0);
      // Undeclared exception!
      try { 
        login0.yesNoOnOffToBoolean("help");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // anw doit etre egale a yes/no/on/off
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initXML();
      Login.setPASSWORDENC(2);
      Login.login_log("W");
      Login login1 = new Login();
      Login login2 = new Login();
      login1.parse_console("JEELY");
      MockInetAddress.getLoopbackAddress();
      Login login3 = new Login();
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
  public void test32()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.setAccess_denynum(2);
      login0.do_initXML();
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login_ConnectionListener0.run();
      ACO aCO0 = ACO.ALLOW_DENY;
      ConfigurationManagement.setAccess_order(aCO0);
      login0.setAuth_max((-2045283824));
      login0.do_initTXT();
      login0.check_auth_sync();
      UserManagement.addUserTXT("conf/subnet_athena.conf", "  __     /'__`/   / /   __   /   _ `  /'__`/' _ `  /'__`     ", "save/account.xml", 'r');
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
  public void test33()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initXML();
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login_ConnectionListener0.run();
      Socket_data socket_data0 = new Socket_data((Socket) null);
      // Undeclared exception!
      try { 
        login0.parse_admin(1412, socket_data0, login0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.core.data.Socket_data", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initXML();
      MockSocket mockSocket0 = new MockSocket();
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login_ConnectionListener0.close();
      // Undeclared exception!
      try { 
        login0.parse_console("exit");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)31;
      Login login0 = new Login();
      login0.yesNoOnOffToBoolean("ON");
      Login login1 = new Login();
      Login login2 = new Login();
      login1.do_initXML();
      MockSocket mockSocket0 = new MockSocket();
      login2.getOut();
      ACO aCO0 = ACO.ALLOW_DENY;
      ConfigurationManagement.setAccess_order(aCO0);
      login0.setAuth_max(31058);
      login1.do_initTXT();
      Login login3 = new Login();
      Login login4 = new Login();
      ConfigurationManagement.setSubneti((int[]) null);
      Login login5 = new Login();
      UserManagement.setAccountIdCount(1000);
      login1.check_auth_sync();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("help");
      MockPrintWriter mockPrintWriter1 = new MockPrintWriter("1N%Y(85&$dn");
      Login login6 = new Login();
      MockPrintStream mockPrintStream0 = new MockPrintStream("ON");
      MockPrintWriter mockPrintWriter2 = new MockPrintWriter(mockPrintStream0);
      login6.setOut(mockPrintWriter2);
      // Undeclared exception!
      try { 
        login6.yesNoOnOffToBoolean("conf/subnet_athena.conf");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // anw doit etre egale a yes/no/on/off
         //
         verifyException("org.javathena.login.Login", e);
      }
  }
}