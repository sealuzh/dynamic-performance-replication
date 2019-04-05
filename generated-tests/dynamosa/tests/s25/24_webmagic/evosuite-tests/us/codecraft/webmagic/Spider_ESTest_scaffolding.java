/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Mar 23 13:45:58 GMT 2019
 */

package us.codecraft.webmagic;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class Spider_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "us.codecraft.webmagic.Spider"; 
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
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.dir", "/home/apaniche/performance/Dataset/gordon_scripts/projects/24_webmagic"); 
    java.lang.System.setProperty("sun.management.compiler", "HotSpot 64-Bit Tiered Compilers"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Spider_ESTest_scaffolding.class.getClassLoader() ,
      "us.codecraft.webmagic.scheduler.Scheduler",
      "us.codecraft.webmagic.thread.CountableThreadPool",
      "us.codecraft.webmagic.model.HttpRequestBody",
      "us.codecraft.webmagic.pipeline.Pipeline",
      "us.codecraft.webmagic.Spider$Status",
      "us.codecraft.webmagic.selector.Selector",
      "us.codecraft.webmagic.selector.RegexResult",
      "us.codecraft.webmagic.utils.FilePersistentBase",
      "us.codecraft.webmagic.selector.CssSelector",
      "us.codecraft.webmagic.scheduler.QueueScheduler",
      "us.codecraft.webmagic.selector.BaseElementSelector",
      "us.codecraft.webmagic.selector.HtmlNode",
      "us.codecraft.webmagic.selector.Html",
      "us.codecraft.webmagic.selector.OrSelector",
      "us.codecraft.webmagic.pipeline.MultiPagePipeline",
      "us.codecraft.webmagic.utils.DoubleKeyMap",
      "us.codecraft.webmagic.Site",
      "us.codecraft.webmagic.pipeline.JsonFilePipeline",
      "us.codecraft.webmagic.downloader.HttpClientDownloader",
      "us.codecraft.webmagic.Request",
      "us.codecraft.webmagic.pipeline.ResultItemsCollectorPipeline",
      "us.codecraft.webmagic.selector.ElementSelector",
      "us.codecraft.webmagic.scheduler.MonitorableScheduler",
      "us.codecraft.webmagic.selector.AbstractSelectable",
      "us.codecraft.webmagic.downloader.PhantomJSDownloader",
      "us.codecraft.webmagic.monitor.SpiderStatus",
      "us.codecraft.webmagic.selector.AndSelector",
      "us.codecraft.webmagic.Spider$1",
      "us.codecraft.webmagic.scheduler.FileCacheQueueScheduler",
      "us.codecraft.webmagic.scheduler.FileCacheQueueScheduler$2",
      "us.codecraft.webmagic.selector.SmartContentSelector",
      "us.codecraft.webmagic.scheduler.FileCacheQueueScheduler$1",
      "us.codecraft.webmagic.selector.ReplaceSelector",
      "us.codecraft.webmagic.processor.PageProcessor",
      "us.codecraft.webmagic.utils.UrlUtils",
      "us.codecraft.webmagic.downloader.AbstractDownloader",
      "us.codecraft.webmagic.monitor.SpiderStatusMXBean",
      "us.codecraft.webmagic.monitor.SpiderMonitor$MonitorSpiderListener",
      "us.codecraft.webmagic.Site$1",
      "us.codecraft.webmagic.selector.Json",
      "us.codecraft.webmagic.processor.SimplePageProcessor",
      "us.codecraft.webmagic.monitor.SpiderMonitor",
      "us.codecraft.webmagic.selector.Selectable",
      "us.codecraft.webmagic.scheduler.component.HashSetDuplicateRemover",
      "us.codecraft.webmagic.selector.PlainText",
      "us.codecraft.webmagic.pipeline.CollectorPipeline",
      "us.codecraft.webmagic.scheduler.DuplicateRemovedScheduler",
      "us.codecraft.webmagic.pipeline.FilePipeline",
      "us.codecraft.webmagic.Spider",
      "us.codecraft.webmagic.downloader.Downloader",
      "us.codecraft.webmagic.selector.XpathSelector",
      "us.codecraft.webmagic.scheduler.component.DuplicateRemover",
      "us.codecraft.webmagic.utils.WMCollections",
      "us.codecraft.webmagic.Page",
      "us.codecraft.webmagic.selector.RegexSelector",
      "us.codecraft.webmagic.scheduler.PriorityScheduler",
      "us.codecraft.webmagic.pipeline.ConsolePipeline",
      "us.codecraft.webmagic.scheduler.PriorityScheduler$2",
      "us.codecraft.webmagic.SpiderListener",
      "us.codecraft.webmagic.ResultItems",
      "us.codecraft.webmagic.scheduler.PriorityScheduler$1",
      "us.codecraft.webmagic.utils.MultiKeyMapBase",
      "us.codecraft.webmagic.Task",
      "us.codecraft.webmagic.selector.JsonPathSelector"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.util.concurrent.ThreadFactory", false, Spider_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Spider_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "us.codecraft.webmagic.Spider",
      "us.codecraft.webmagic.Spider$1",
      "us.codecraft.webmagic.Spider$Status",
      "us.codecraft.webmagic.utils.UrlUtils",
      "us.codecraft.webmagic.processor.SimplePageProcessor",
      "us.codecraft.webmagic.Site",
      "us.codecraft.webmagic.scheduler.DuplicateRemovedScheduler",
      "us.codecraft.webmagic.scheduler.QueueScheduler",
      "us.codecraft.webmagic.scheduler.component.HashSetDuplicateRemover",
      "us.codecraft.webmagic.Page",
      "us.codecraft.webmagic.ResultItems",
      "us.codecraft.webmagic.downloader.AbstractDownloader",
      "us.codecraft.webmagic.downloader.PhantomJSDownloader",
      "us.codecraft.webmagic.selector.ReplaceSelector",
      "us.codecraft.webmagic.pipeline.MultiPagePipeline",
      "us.codecraft.webmagic.utils.MultiKeyMapBase",
      "us.codecraft.webmagic.utils.DoubleKeyMap",
      "us.codecraft.webmagic.Request",
      "us.codecraft.webmagic.selector.AbstractSelectable",
      "us.codecraft.webmagic.selector.PlainText",
      "us.codecraft.webmagic.selector.Json",
      "us.codecraft.webmagic.scheduler.PriorityScheduler",
      "us.codecraft.webmagic.scheduler.PriorityScheduler$1",
      "us.codecraft.webmagic.scheduler.PriorityScheduler$2",
      "us.codecraft.webmagic.utils.FilePersistentBase",
      "us.codecraft.webmagic.pipeline.JsonFilePipeline",
      "us.codecraft.webmagic.selector.JsonPathSelector",
      "us.codecraft.webmagic.pipeline.FilePipeline",
      "us.codecraft.webmagic.pipeline.ResultItemsCollectorPipeline",
      "us.codecraft.webmagic.scheduler.FileCacheQueueScheduler",
      "us.codecraft.webmagic.scheduler.FileCacheQueueScheduler$1",
      "us.codecraft.webmagic.pipeline.ConsolePipeline",
      "us.codecraft.webmagic.scheduler.FileCacheQueueScheduler$2",
      "us.codecraft.webmagic.selector.RegexSelector",
      "us.codecraft.webmagic.selector.SmartContentSelector",
      "us.codecraft.webmagic.monitor.SpiderMonitor",
      "us.codecraft.webmagic.monitor.SpiderMonitor$MonitorSpiderListener",
      "us.codecraft.webmagic.selector.OrSelector",
      "us.codecraft.webmagic.Site$1",
      "us.codecraft.webmagic.monitor.SpiderStatus",
      "us.codecraft.webmagic.model.HttpRequestBody",
      "us.codecraft.webmagic.selector.AndSelector",
      "us.codecraft.webmagic.utils.WMCollections"
    );
  }
}
