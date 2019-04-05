/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 02:20:54 GMT 2019
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
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
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
import org.javathena.login.parse.FromChar;
import org.javathena.login.parse.FromClient;
import org.javathena.utiles.ConfigurationManagement;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Login_ESTest extends Login_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initTXT();
      login0.setAuth_max(1123);
      assertEquals(1123, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      Login login0 = new Login();
      Login.auth_num = (-130);
      login0.do_initTXT();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      Login login0 = new Login();
      Auth_data auth_data0 = UserManagement.addUserTXT("conf/subnet_athena.conf", "TU$n[5s", "TU$n[5s", 'O');
      assertEquals(2000000, (int)auth_data0.getAccount_id());
      
      Login.mmo_auth_syncTXT();
      int int0 = login0.check_auth_sync();
      assertEquals(0, login0.getAuth_max());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.setAuth_before_save_file(30);
      int int0 = login0.check_auth_sync();
      assertEquals(0, int0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Login.showTab(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initXML();
      Login.mmo_auth_syncTXT();
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      Login login0 = new Login();
      Login.auth_num = 100000000;
      UserManagement.addUserTXT("T55Nd", (String) null, "T55Nd", 'q');
      Login.mmo_auth_syncTXT();
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initTXT();
      Login.Timer_interval_check_auth_sync login_Timer_interval_check_auth_sync0 = login0.new Timer_interval_check_auth_sync();
      login_Timer_interval_check_auth_sync0.run();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initXML();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("save");
      boolean boolean0 = FileSystemHandling.appendLineToFile(evoSuiteFile0, "conf/subnet_athena.conf");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      Login login0 = new Login();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("save");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "conf/subnet_athena.conf");
      Login.mmo_auth_syncTXT();
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      mockSocket0.close();
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      // Undeclared exception!
      try { 
        Login.codingKeyAdministration(socket_data0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initXML();
      login0.getOut();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Login login0 = new Login();
      Login.auth_num = 664;
      int int0 = login0.getAuth_num();
      assertEquals(664, int0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Login login0 = new Login();
      Login.auth_num = (-130);
      int int0 = login0.getAuth_num();
      assertEquals((-130), int0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
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
  public void test015()  throws Throwable  {
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
  public void test016()  throws Throwable  {
      Socket_data socket_data0 = new Socket_data((Socket) null);
      socket_data0.setListenPort((-1909411022));
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
  public void test017()  throws Throwable  {
      Login login0 = new Login();
      int[] intArray0 = new int[5];
      login0.setServer_fd(intArray0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Login login0 = new Login();
      int[] intArray0 = new int[0];
      login0.setServer_fd(intArray0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Login.setPASSWORDENC(0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      Login.setPASSWORDENC((-2100877280));
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      Login login0 = new Login();
      login0.setOut((PrintWriter) null);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      Login login0 = new Login();
      login0.setAuth_max(0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      Login login0 = new Login();
      login0.setAuth_max((-453));
      int int0 = login0.getAuth_max();
      assertEquals((-453), int0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      Login login0 = new Login();
      // Undeclared exception!
      try { 
        login0.parse_console((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      Login login0 = new Login();
      Socket_data socket_data0 = new Socket_data((Socket) null);
      socket_data0.setUsers((-1618525689));
      // Undeclared exception!
      try { 
        login0.parse_admin(10002, socket_data0, login0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.core.data.Socket_data", e);
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      Login login0 = new Login();
      MockSocket mockSocket0 = new MockSocket();
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      socket_data0.setEof(30);
      // Undeclared exception!
      try { 
        login0.parse_admin(50, socket_data0, login0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.core.data.Socket_data", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Login login0 = new Login();
      MockSocket mockSocket0 = new MockSocket();
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      socket_data0.setEof((-1113682920));
      // Undeclared exception!
      try { 
        login0.parse_admin(50, socket_data0, login0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.core.data.Socket_data", e);
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      Login login0 = new Login();
      // Undeclared exception!
      try { 
        login0.parse_admin(0, (Socket_data) null, login0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      Login login0 = new Login();
      // Undeclared exception!
      try { 
        login0.parse_admin((-410), (Socket_data) null, login0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      Login.login_log((String) null);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      Login.logUnknownPackets((Socket_data) null);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      FromChar fromChar0 = new FromChar();
      Socket_data socket_data0 = new Socket_data((Socket) null, fromChar0);
      socket_data0.setUsers(44);
      byte[] byteArray0 = Login.getMd5Data(socket_data0);
      assertEquals(20, byteArray0.length);
      assertEquals("2345678910111213", socket_data0.getMd5key());
      assertEquals(0, socket_data0.getEof());
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      socket_data0.setUsers((-1));
      byte[] byteArray0 = Login.getMd5Data(socket_data0);
      assertEquals(20, byteArray0.length);
      assertEquals(0, socket_data0.getEof());
      assertEquals("2345678910111213", socket_data0.getMd5key());
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      Socket_data socket_data0 = new Socket_data((Socket) null);
      socket_data0.setListenPort(1004);
      byte[] byteArray0 = Login.getMd5Data(socket_data0);
      assertEquals(20, byteArray0.length);
      assertEquals("2345678910111213", socket_data0.getMd5key());
      assertEquals(0, socket_data0.getEof());
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
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
  public void test036()  throws Throwable  {
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
  public void test037()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      Login.getMd5Data(socket_data0);
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
  public void test038()  throws Throwable  {
      Login login0 = new Login();
      int int0 = login0.check_ipmask(0, "VoJW{\"C~|-oe}");
      assertEquals(0, int0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      Login login0 = new Login();
      int int0 = login0.check_ipmask(476, "");
      assertEquals(0, int0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      Login login0 = new Login();
      login0.check_ip((InetAddress) null);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      Login login0 = new Login();
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      login0.check_ip(inetAddress0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      Login login0 = new Login();
      // Undeclared exception!
      try { 
        login0.yesNoOnOffToBoolean((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      // Undeclared exception!
      try { 
        Login.showTab((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      Login login0 = new Login();
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
  public void test045()  throws Throwable  {
      // Undeclared exception!
      try { 
        Login.mmo_auth_syncTXT();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      // Undeclared exception!
      try { 
        Login.getMd5Data((Socket_data) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
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
  public void test048()  throws Throwable  {
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
  public void test049()  throws Throwable  {
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
  public void test050()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.setAccess_denynum(651);
      ConfigurationManagement.setAccess_allownum(2);
      ACO aCO0 = ACO.STRSIZE;
      ConfigurationManagement.setAccess_order(aCO0);
      login0.save_config_in_log();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      Login login0 = new Login();
      ACO aCO0 = ACO.ALLOW_DENY;
      ConfigurationManagement.setAccess_order(aCO0);
      ConfigurationManagement.setAccess_allownum((-2045358916));
      login0.save_config_in_log();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      Login login0 = new Login();
      ACO aCO0 = ACO.ALLOW_DENY;
      ConfigurationManagement.setAccess_order(aCO0);
      login0.save_config_in_log();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      Login login0 = new Login();
      login0.save_config_in_log();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initXML();
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
  public void test055()  throws Throwable  {
      Login login0 = new Login();
      login0.do_final();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
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
  public void test057()  throws Throwable  {
      Login login0 = new Login();
      int int0 = Login.mmo_auth_initTXT();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      int int0 = Login.mmo_auth_initXML();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Login login0 = new Login();
      // Undeclared exception!
      try { 
        Login.login_log("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      Login login0 = new Login();
      login0.setServer_fd((int[]) null);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      Login login0 = new Login();
      Login.End login_End0 = login0.new End();
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      Login login0 = new Login();
      boolean boolean0 = login0.yesNoOnOffToBoolean("OFF");
      assertEquals(0, login0.getAuth_max());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      Login login0 = new Login();
      boolean boolean0 = login0.yesNoOnOffToBoolean("NO");
      assertEquals(0, login0.getAuth_max());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Login login0 = new Login();
      boolean boolean0 = login0.yesNoOnOffToBoolean("ON");
      assertTrue(boolean0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Login login0 = new Login();
      boolean boolean0 = login0.yesNoOnOffToBoolean("YES");
      assertEquals(0, login0.getAuth_max());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.setAccess_denynum(2);
      ACO aCO0 = ACO.ALLOW_DENY;
      ConfigurationManagement.setAccess_allownum(2);
      ConfigurationManagement.setAccess_order(aCO0);
      login0.do_initXML();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Login login0 = new Login();
      ACO aCO0 = ACO.MUTUAL_FAILTURE;
      ConfigurationManagement.setAccess_order(aCO0);
      login0.save_config_in_log();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.setAccess_denynum(2);
      login0.save_config_in_log();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initXML();
      login0.parse_console("status");
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initXML();
      int int0 = login0.parse_console("alive");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initXML();
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
  public void test072()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initXML();
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
  public void test073()  throws Throwable  {
      Login login0 = new Login();
      MockSocket mockSocket0 = new MockSocket();
      FromClient fromClient0 = new FromClient();
      Socket_data socket_data0 = new Socket_data(mockSocket0, fromClient0);
      // Undeclared exception!
      try { 
        login0.parse_admin(100000000, socket_data0, (Login) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.core.data.Socket_data", e);
      }
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      Login login0 = new Login();
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login_ConnectionListener0.run();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
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
  public void test076()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_syncXML();
      int int0 = login0.check_auth_sync();
      assertEquals(0, int0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Login.showTab(byteArray0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.setAuth_before_save_file(255);
      Login.mmo_auth_syncXML();
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      Login login0 = new Login();
      UserManagement.addAccountIdCount(2147483645);
      UserManagement.addUserTXT("?Lx>7<r b(s", "+rmt;On|cP_nZmL", "?Lx>7<r b(s", '\'');
      Login.mmo_auth_syncTXT();
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Login login0 = new Login();
      UserManagement.addUserTXT("\u001B[1;33m", "\u001B[1;33m", "8Q=4lA'hj{(", ':');
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
  public void test081()  throws Throwable  {
      UserManagement.addUserTXT("- with a remote administration with the DEFAULT password.", "OF", "OF", 'k');
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
  public void test082()  throws Throwable  {
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
  public void test083()  throws Throwable  {
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
  public void test084()  throws Throwable  {
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
  public void test085()  throws Throwable  {
      Login.login_log("B+L%1GF&m{'Rka\"5");
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      Socket_data socket_data0 = new Socket_data((Socket) null);
      Login.getMd5Data(socket_data0);
      Login.getMd5Data(socket_data0);
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
  public void test087()  throws Throwable  {
      Login login0 = new Login();
      int int0 = login0.getAuth_max();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      Login.setPASSWORDENC(31036);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initXML();
      int int0 = login0.parse_console("- TO CREATE NEW ACCOUNTS WITH AN UNLIMITED TIME.");
      assertEquals(0, int0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      IDBManagementLogin iDBManagementLogin0 = Login.getDbManagemtType();
      assertNull(iDBManagementLogin0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Login.display_title();
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      int int0 = Login.getPASSWORDENC();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      Login login0 = new Login();
      login0.getOut();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      FromClient fromClient0 = new FromClient();
      Socket_data socket_data0 = new Socket_data(mockSocket0, fromClient0);
      Login.logUnknownPackets(socket_data0);
      assertEquals(0, socket_data0.getListenPort());
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      Login login0 = new Login();
      int int0 = login0.check_ipmask((-1933148426), (String) null);
      assertEquals(0, login0.getAuth_max());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      Login login0 = new Login();
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      login0.check_ip(inetAddress0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      Login login0 = new Login();
      int[] intArray0 = login0.getServer_fd();
      assertEquals(30, intArray0.length);
      assertEquals(0, login0.getAuth_max());
      assertNotNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      Login login0 = new Login();
      int int0 = login0.getAuth_num();
      assertEquals(0, int0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
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
  public void test100()  throws Throwable  {
      Login login0 = new Login();
      MockPrintStream mockPrintStream0 = new MockPrintStream("conf/subnet_athena.conf");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockPrintStream0);
      login0.setOut(mockPrintWriter0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      Login login0 = new Login();
      login0.getLog_fp();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      Login login0 = new Login();
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login_ConnectionListener0.close();
      login_ConnectionListener0.run();
      assertEquals(0, login0.getAuth_max());
  }
}