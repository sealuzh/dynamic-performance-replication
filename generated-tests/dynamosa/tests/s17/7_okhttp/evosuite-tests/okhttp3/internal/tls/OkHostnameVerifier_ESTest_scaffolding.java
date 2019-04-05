/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Mar 23 04:11:28 GMT 2019
 */

package okhttp3.internal.tls;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class OkHostnameVerifier_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "okhttp3.internal.tls.OkHostnameVerifier"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.dir", "/home/apaniche/performance/Dataset/gordon_scripts/projects/7_okhttp"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(OkHostnameVerifier_ESTest_scaffolding.class.getClassLoader() ,
      "okhttp3.ResponseBody$BomAwareReader",
      "okio.Source",
      "okhttp3.RequestBody$1",
      "okio.Timeout$1",
      "okio.Options",
      "okio.Sink",
      "okhttp3.RequestBody",
      "okio.Timeout",
      "okio.BufferedSink",
      "okhttp3.internal.Util",
      "okio.ByteString",
      "okio.Segment",
      "okhttp3.internal.tls.OkHostnameVerifier",
      "okio.Util",
      "okhttp3.ResponseBody",
      "okhttp3.MediaType",
      "okio.Buffer",
      "okhttp3.ResponseBody$1",
      "okio.SegmentedByteString",
      "okio.BufferedSource",
      "okhttp3.HttpUrl$Builder",
      "okhttp3.internal.tls.DistinguishedNameParser",
      "okio.Buffer$2",
      "okio.Buffer$1",
      "okhttp3.RequestBody$2",
      "okhttp3.RequestBody$3",
      "okhttp3.HttpUrl",
      "okhttp3.HttpUrl$Builder$ParseResult"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.security.cert.Certificate", false, OkHostnameVerifier_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.security.cert.X509Certificate", false, OkHostnameVerifier_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("javax.net.ssl.SSLSession", false, OkHostnameVerifier_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(OkHostnameVerifier_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "okhttp3.internal.tls.OkHostnameVerifier",
      "okhttp3.ResponseBody",
      "okio.Buffer",
      "okio.Util",
      "okhttp3.ResponseBody$1",
      "okhttp3.RequestBody",
      "okhttp3.RequestBody$2",
      "okio.ByteString",
      "okhttp3.internal.Util",
      "okhttp3.internal.tls.DistinguishedNameParser"
    );
  }
}
