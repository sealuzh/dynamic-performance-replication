/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 14:47:16 GMT 2018
 */

package org.javathena.login;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.util.Calendar;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.javathena.core.data.Excecutable;
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
      Login login0 = new Login();
      Login.display_title();
      login0.setAuth_max(0);
      String string0 = "NG$";
      MySQLConfig.setDefault_codepage("NG$");
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
  public void test01()  throws Throwable  {
      Login.login_log("Jpw7Dq=");
      Login login0 = new Login();
      String string0 = "";
      // Undeclared exception!
      try { 
        login0.parse_console("");
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
      Login.End login_End0 = login0.new End();
      Login.auth_num = 100000000;
      Thread.UncaughtExceptionHandler thread_UncaughtExceptionHandler0 = MockThread.getDefaultUncaughtExceptionHandler();
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      login0.check_ip(inetAddress0);
      MockThread.setDefaultUncaughtExceptionHandler(thread_UncaughtExceptionHandler0);
      login_End0.run();
      login0.do_initXML();
      login0.do_initTXT();
      login0.getServer_fd();
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login_ConnectionListener0.run();
      Login.setPASSWORDENC(4978);
      Login.getDbManagemtType();
      login_ConnectionListener0.run();
      assertEquals(4978, login0.getPASSWORDENC());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initTXT();
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
  public void test04()  throws Throwable  {
      Login login0 = new Login();
      int int0 = login0.getAuth_max();
      assertEquals(0, int0);
      
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login_ConnectionListener0.run();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Login.getPASSWORDENC();
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
  public void test06()  throws Throwable  {
      Login login0 = new Login();
      int[] intArray0 = new int[3];
      intArray0[0] = 100000000;
      intArray0[1] = 2000000;
      intArray0[2] = 100000000;
      ConfigurationManagement.setSubnetmaski(intArray0);
      login0.getLog_fp();
      MockPrintWriter mockPrintWriter0 = null;
      try {
        mockPrintWriter0 = new MockPrintWriter((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Login login0 = new Login();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("conf/subnet_athena.conf");
      Locale locale0 = new Locale("conf/subnet_athena.conf");
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) login0;
      objectArray0[1] = (Object) "'hB#:xmRrOp[,nUg";
      objectArray0[2] = (Object) login0;
      objectArray0[3] = (Object) "'hB#:xmRrOp[,nUg";
      objectArray0[4] = (Object) login0;
      objectArray0[5] = (Object) locale0;
      objectArray0[6] = (Object) "'hB#:xmRrOp[,nUg";
      Object object0 = new Object();
      objectArray0[7] = object0;
      PrintWriter printWriter0 = mockPrintWriter0.printf(locale0, "'hB#:xmRrOp[,nUg", objectArray0);
      MockPrintWriter mockPrintWriter1 = new MockPrintWriter(printWriter0, false);
      PrintWriter printWriter1 = mockPrintWriter1.append((CharSequence) "'hB#:xmRrOp[,nUg");
      login0.setOut(printWriter1);
      int int0 = 31032;
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      MockSocket mockSocket0 = null;
      try {
        mockSocket0 = new MockSocket("java.text.AttributedString", 2, inetAddress0, (-1396));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // port out of range:-1396
         //
         verifyException("java.net.InetSocketAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Login.mmo_auth_initXML();
      Login login0 = new Login();
      login0.save_config_in_log();
      InetAddress inetAddress0 = MockInetAddress.getByName("conf/subnet_athena.conf");
      login0.check_ip(inetAddress0);
      Login.End login_End0 = login0.new End();
      login_End0.run();
      ConfigurationManagement.setAccess_denynum(4022);
      Login.mmo_auth_initTXT();
      login0.save_config_in_log();
      Login.login_log("conf/subnet_athena.conf");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Login.getPASSWORDENC();
      Login login0 = new Login();
      login0.check_ipmask((-392), "ON");
      // Undeclared exception!
      try { 
        login0.yesNoOnOffToBoolean("LOGIN_CONF_NAME");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // anw doit etre egale a yes/no/on/off
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Login login0 = new Login();
      // Undeclared exception!
      try { 
        login0.yesNoOnOffToBoolean("");
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
      Login login0 = new Login();
      int[] intArray0 = new int[9];
      intArray0[0] = 2;
      intArray0[1] = 30;
      intArray0[2] = 100000000;
      intArray0[3] = 50;
      intArray0[4] = 2;
      intArray0[5] = 2;
      intArray0[6] = 100000000;
      intArray0[7] = 2000000;
      intArray0[8] = 2;
      login0.setServer_fd(intArray0);
      login0.getAuth_max();
      MockSocket mockSocket0 = new MockSocket();
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      Login.logUnknownPackets(socket_data0);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-35);
      byteArray0[2] = (byte)0;
      Login.showTab(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte) (-35), (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ACO aCO0 = ACO.MUTUAL_FAILTURE;
      ConfigurationManagement.setAccess_order(aCO0);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)1;
      Login.showTab(byteArray0);
      assertArrayEquals(new byte[] {(byte)1}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Login login0 = new Login();
      int int0 = (-444);
      login0.setAuth_max((-444));
      login0.save_config_in_log();
      Login.Timer_interval_check_auth_sync login_Timer_interval_check_auth_sync0 = login0.new Timer_interval_check_auth_sync();
      login_Timer_interval_check_auth_sync0.cancel();
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
  public void test14()  throws Throwable  {
      Login login0 = new Login();
      MockSocket mockSocket0 = new MockSocket();
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      // Undeclared exception!
      try { 
        login0.parse_admin(2000000, socket_data0, login0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.core.data.Socket_data", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_initTXT();
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      Login.getMd5Data(socket_data0);
      // Undeclared exception!
      try { 
        Login.login_log("conf/subnet_athena.conf");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = FromChar.NUMBER_OF_USER;
      FromChar fromChar0 = new FromChar();
      Socket_data socket_data0 = new Socket_data((Socket) null, fromChar0);
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
      Login login0 = new Login();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "conf/subnet_athena.conf");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "conf/subnet_athena.conf");
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      login0.check_ip(inetAddress0);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      login0.setAuth_max((-1431655763));
      login0.getOut();
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
  public void test18()  throws Throwable  {
      Login login0 = new Login();
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login_ConnectionListener0.close();
      int int0 = login0.getAuth_num();
      assertEquals(0, int0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      FromClient fromClient0 = new FromClient();
      Socket_data socket_data0 = new Socket_data(mockSocket0, fromClient0);
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
  public void test20()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = null;
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "ON");
      Login.getDbManagemtType();
      System.setCurrentTimeMillis(432L);
      Login login0 = new Login();
      int int0 = (-651);
      MockSocket mockSocket0 = new MockSocket();
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      socket_data0.setClient_addr(mockSocket0);
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
  public void test21()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_scripts_adaptive/projects/12_javathena/save/account.xml");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "LOGIN_CONF_NAME");
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
  public void test22()  throws Throwable  {
      Login login0 = new Login();
      login0.getOut();
      Login.loginLogOut = null;
      Login.mmo_auth_syncTXT();
      int int0 = login0.check_auth_sync();
      assertEquals(0, login0.getAuth_max());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Login login0 = new Login();
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login_ConnectionListener0.close();
      login_ConnectionListener0.run();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initTXT();
      int int0 = Calendar.MONDAY;
      int int1 = login0.parse_console("alive");
      assertEquals(0, int1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initXML();
      int int0 = login0.parse_console("CONF/SUBNET_ATHENA.CONF");
      int int1 = login0.check_ipmask((-2518), "CONF/SUBNET_ATHENA.CONF");
      assertTrue(int1 == int0);
      assertEquals(0, int1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initXML();
      login0.parse_console("error_20");
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
  public void test27()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_syncTXT();
      login0.do_initXML();
      login0.parse_console("CONF/SUBNET_ATHENA.CONF");
      login0.check_ipmask((-2518), "CONF/SUBNET_ATHENA.CONF");
      MockSocket mockSocket0 = null;
      try {
        mockSocket0 = new MockSocket("conf/subnet_athena.conf", (-2040852226));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // port out of range:-2040852226
         //
         verifyException("java.net.InetSocketAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Login login0 = new Login();
      login0.yesNoOnOffToBoolean("YES");
      Login.mmo_auth_syncXML();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Login login0 = new Login();
      boolean boolean0 = login0.yesNoOnOffToBoolean("NO");
      assertFalse(boolean0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_scripts_adaptive/projects/12_javathena/save/account.txt");
      FileSystemHandling.createFolder(evoSuiteFile0);
      Login login0 = new Login();
      ConfigurationManagement.setAccess_allownum(2);
      login0.do_initTXT();
      Login.getPASSWORDENC();
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      Socket_data socket_data0 = new Socket_data(mockSocket0);
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
  public void test31()  throws Throwable  {
      Login login0 = new Login();
      UserManagement.addUserTXT("- with NO dynamic password error ban.", "HELP", "4RZT1IG]VtIf7tt", '2');
      ConfigurationManagement.setAccess_denynum(2);
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
  public void test32()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initTXT();
      login0.check_auth_sync();
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
      Login login0 = new Login();
      ConfigurationManagement.setAccess_denynum(10);
      login0.do_initTXT();
      login0.check_auth_sync();
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
  public void test34()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_scripts_adaptive/projects/12_javathena/save/account.txt");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "#m|KU{3%6Sal");
      Login login0 = new Login();
      int[] intArray0 = new int[1];
      intArray0[0] = 2;
      login0.setServer_fd(intArray0);
      UserManagement.addUserTXT("#m|KU{3%6Sal", "#m|KU{3%6Sal", "principals", 'v');
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
  public void test35()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.setAccess_denynum(1);
      login0.do_initTXT();
      login0.check_auth_sync();
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
  public void test36()  throws Throwable  {
      Login login0 = new Login();
      MockSocket mockSocket0 = new MockSocket();
      UserManagement.addUserTXT("conf/subnet_athena.conf", "oM:~C|+j),", "\u001B[0;44m", 'u');
      Login login1 = new Login();
      login1.do_initXML();
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
  public void test37()  throws Throwable  {
      Login login0 = new Login();
      UserManagement.addAccountIdCount();
      ConfigurationManagement.setAccess_deny("conf/subnet_athena.conf");
      ConfigurationManagement.setAccess_denynum(1);
      login0.do_initTXT();
      int int0 = login0.check_auth_sync();
      assertEquals(0, int0);
      
      int int1 = Calendar.DAY_OF_YEAR;
      login0.setAuth_max(0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Login login0 = new Login();
      ACO aCO0 = ACO.MUTUAL_FAILTURE;
      ConfigurationManagement.setAccess_order(aCO0);
      login0.do_initTXT();
      login0.check_auth_sync();
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
      ACO aCO0 = ACO.ALLOW_DENY;
      ConfigurationManagement.setAccess_order(aCO0);
      login0.do_initTXT();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.setAccess_allownum((-592));
      ACO aCO0 = ACO.ALLOW_DENY;
      ConfigurationManagement.setAccess_order(aCO0);
      login0.do_initTXT();
      assertEquals(0, login0.getAuth_max());
      
      int int0 = Login.mmo_auth_initXML();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Login login0 = new Login();
      ACO aCO0 = ACO.MUTUAL_FAILTURE;
      ConfigurationManagement.setAccess_allownum(73);
      ConfigurationManagement.setAccess_order(aCO0);
      login0.do_initTXT();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.setAccess_allownum(1);
      ACO aCO0 = ACO.MUTUAL_FAILTURE;
      ConfigurationManagement.setAccess_order(aCO0);
      login0.do_initTXT();
      assertEquals(100000000, Login.END_ACCOUNT_NUM);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.setAccess_allownum(1);
      ACO aCO0 = ACO.ALLOW_DENY;
      ConfigurationManagement.setAccess_order(aCO0);
      login0.do_initTXT();
      assertEquals(0, login0.getAuth_max());
  }
}