/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 11:38:09 GMT 2019
 */

package us.codecraft.webmagic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.SpiderListener;
import us.codecraft.webmagic.downloader.PhantomJSDownloader;
import us.codecraft.webmagic.monitor.SpiderMonitor;
import us.codecraft.webmagic.pipeline.CollectorPipeline;
import us.codecraft.webmagic.pipeline.ConsolePipeline;
import us.codecraft.webmagic.pipeline.FilePipeline;
import us.codecraft.webmagic.pipeline.JsonFilePipeline;
import us.codecraft.webmagic.pipeline.MultiPagePipeline;
import us.codecraft.webmagic.pipeline.Pipeline;
import us.codecraft.webmagic.pipeline.ResultItemsCollectorPipeline;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.processor.SimplePageProcessor;
import us.codecraft.webmagic.scheduler.DuplicateRemovedScheduler;
import us.codecraft.webmagic.scheduler.FileCacheQueueScheduler;
import us.codecraft.webmagic.scheduler.PriorityScheduler;
import us.codecraft.webmagic.scheduler.QueueScheduler;
import us.codecraft.webmagic.scheduler.Scheduler;
import us.codecraft.webmagic.scheduler.component.HashSetDuplicateRemover;
import us.codecraft.webmagic.selector.Json;
import us.codecraft.webmagic.selector.Selector;
import us.codecraft.webmagic.utils.FilePersistentBase;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Spider_ESTest extends Spider_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("_cycle_tried_times");
      Spider spider0 = new Spider(simplePageProcessor0);
      LinkedList<Request> linkedList0 = new LinkedList<Request>();
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("<:I+k1 O", "_cycle_tried_times");
      spider0.downloader(phantomJSDownloader0);
      Spider spider1 = spider0.startRequest(linkedList0);
      JsonFilePipeline jsonFilePipeline0 = new JsonFilePipeline();
      Spider spider2 = spider1.addPipeline(jsonFilePipeline0);
      Spider spider3 = spider2.clearPipeline();
      QueueScheduler queueScheduler0 = new QueueScheduler();
      Spider spider4 = spider3.scheduler(queueScheduler0);
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      ThreadPoolExecutor.DiscardPolicy threadPoolExecutor_DiscardPolicy0 = new ThreadPoolExecutor.DiscardPolicy();
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(1430, threadFactory0, threadPoolExecutor_DiscardPolicy0);
      spider0.sleep(1430);
      SynchronousQueue<String> synchronousQueue0 = new SynchronousQueue<String>();
      jsonFilePipeline0.checkAndMakeParentDirecotry("_cycle_tried_times");
      synchronousQueue0.remainingCapacity();
      List<Pipeline> list0 = spider3.getAll((Collection<String>) synchronousQueue0);
      spider1.pipelines = list0;
      Spider spider5 = spider4.thread((ExecutorService) scheduledThreadPoolExecutor0, 1430);
      spider5.pipeline(jsonFilePipeline0);
      assertEquals(Spider.Status.Stopped, spider4.getStatus());
      
      Spider.Status.fromValue(1430);
      Spider.Status spider_Status0 = Spider.Status.fromValue((-1557));
      assertEquals(Spider.Status.Init, spider_Status0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Spider.Status.values();
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("O2[nt*UqxlW");
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider spider1 = spider0.setSpiderListeners((List<SpiderListener>) null);
      Spider spider2 = spider1.thread(3);
      Spider spider3 = spider2.setUUID("");
      PriorityScheduler priorityScheduler0 = new PriorityScheduler();
      Spider spider4 = spider3.setScheduler(priorityScheduler0);
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(5);
      Spider spider5 = spider4.setExecutorService(scheduledThreadPoolExecutor0);
      spider5.isSpawnUrl();
      Page page0 = Page.fail();
      Page page1 = page0.setSkip(true);
      Json json0 = page1.getJson();
      // Undeclared exception!
      try { 
        json0.removePadding("");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // us/codecraft/xsoup/XTokenQueue
         //
         verifyException("us.codecraft.webmagic.selector.Json", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("HW`wp/");
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider spider1 = spider0.scheduler((Scheduler) null);
      Spider spider2 = spider1.clearPipeline();
      Site site0 = new Site();
      Site site1 = site0.setTimeOut(2926);
      Site site2 = site1.setRetryTimes(2926);
      Site site3 = site2.setDomain((String) null);
      Site site4 = site3.setCharset("us.codecraft.webmagic.Spider$Status");
      Site site5 = site4.setSleepTime(2926);
      spider2.site = site5;
      spider2.setScheduler((Scheduler) null);
      PhantomJSDownloader phantomJSDownloader0 = null;
      try {
        phantomJSDownloader0 = new PhantomJSDownloader("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = Spider.create(simplePageProcessor0);
      Spider spider1 = spider0.setExitWhenComplete(true);
      Page page0 = Page.fail();
      ResultItemsCollectorPipeline resultItemsCollectorPipeline0 = new ResultItemsCollectorPipeline();
      spider1.pipeline(resultItemsCollectorPipeline0);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, true);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "0JWkM}-");
      Page page1 = page0.setRawText("");
      Page page2 = page1.setSkip(true);
      // Undeclared exception!
      try { 
        spider1.extractAndAddRequests(page2, true);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/collections/CollectionUtils
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, false);
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = new Spider(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("", "");
      Spider spider1 = spider0.downloader(phantomJSDownloader0);
      ForkJoinPool forkJoinPool0 = new ForkJoinPool(2);
      Spider spider2 = spider1.setExecutorService(forkJoinPool0);
      JsonFilePipeline jsonFilePipeline0 = new JsonFilePipeline();
      Spider spider3 = spider2.addPipeline(jsonFilePipeline0);
      spider3.getScheduler();
      LinkedList<SpiderListener> linkedList0 = new LinkedList<SpiderListener>();
      Spider spider4 = spider0.setSpiderListeners(linkedList0);
      spider4.start();
      SpiderMonitor spiderMonitor0 = SpiderMonitor.instance();
      SpiderMonitor.MonitorSpiderListener spiderMonitor_MonitorSpiderListener0 = spiderMonitor0.new MonitorSpiderListener();
      List<String> list0 = spiderMonitor_MonitorSpiderListener0.getErrorUrls();
      // Undeclared exception!
      try { 
        spider2.getAll((Collection<String>) list0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Spider is already running!
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("Stopped");
      Spider spider0 = new Spider(simplePageProcessor0);
      Scheduler scheduler0 = spider0.getScheduler();
      Spider spider1 = spider0.setScheduler(scheduler0);
      long long0 = spider1.getPageCount();
      assertEquals(0L, long0);
      assertTrue(spider1.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("\"bUFR;H5(Hk<;E");
      Spider spider0 = Spider.create(simplePageProcessor0);
      Request[] requestArray0 = new Request[0];
      Spider spider1 = spider0.addRequest(requestArray0);
      FileCacheQueueScheduler fileCacheQueueScheduler0 = new FileCacheQueueScheduler("&aF,I'GTCa&`a+S&");
      Spider spider2 = spider1.setScheduler(fileCacheQueueScheduler0);
      spider2.setExitWhenComplete(true);
      int int0 = (-880);
      ThreadPoolExecutor.AbortPolicy threadPoolExecutor_AbortPolicy0 = new ThreadPoolExecutor.AbortPolicy();
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = null;
      try {
        scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor((-880), threadPoolExecutor_AbortPolicy0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ThreadPoolExecutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("6?5kj!$x");
      Spider spider0 = Spider.create(simplePageProcessor0);
      QueueScheduler queueScheduler0 = new QueueScheduler();
      Spider spider1 = spider0.setScheduler(queueScheduler0);
      Spider spider2 = spider1.setExitWhenComplete(false);
      Spider spider3 = spider2.clearPipeline();
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("6?5kj!$x", "6?5kj!$x");
      Spider spider4 = spider3.setDownloader(phantomJSDownloader0);
      spider4.setScheduler(queueScheduler0);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "6?5kj!$x";
      stringArray0[1] = "6?5kj!$x";
      stringArray0[2] = "6?5kj!$x";
      stringArray0[3] = "6?5kj!$x";
      stringArray0[4] = "6?5kj!$x";
      stringArray0[5] = "6?5kj!$x";
      // Undeclared exception!
      try { 
        spider0.test(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.downloader.PhantomJSDownloader", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("jRKUU&>OE");
      Spider spider0 = Spider.create(simplePageProcessor0);
      FilePipeline filePipeline0 = new FilePipeline();
      FilePersistentBase.PATH_SEPERATOR = "jRKUU&>OE";
      Spider spider1 = spider0.pipeline(filePipeline0);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      spider1.sleep(31);
      spider1.getStartTime();
      spider1.sleep(0);
      //  // Unstable assertion: assertEquals("/data/webmagic/RyS:e0[`]", filePipeline0.getPath());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = "Igj?5ne[j1 `VB2.t{";
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("Igj?5ne[j1 `VB2.t{");
      Spider spider0 = new Spider(simplePageProcessor0);
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      LinkedList<Spider> linkedList0 = new LinkedList<Spider>();
      LinkedBlockingDeque<Runnable> linkedBlockingDeque0 = new LinkedBlockingDeque<Runnable>(linkedList0);
      ThreadPoolExecutor.CallerRunsPolicy threadPoolExecutor_CallerRunsPolicy0 = new ThreadPoolExecutor.CallerRunsPolicy();
      ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(7, 7, 7, timeUnit0, linkedBlockingDeque0, threadPoolExecutor_CallerRunsPolicy0);
      Spider spider1 = spider0.thread((ExecutorService) threadPoolExecutor0, 7);
      ResultItemsCollectorPipeline resultItemsCollectorPipeline0 = new ResultItemsCollectorPipeline();
      int int0 = 1935;
      threadPoolExecutor0.setCorePoolSize(1935);
      Spider spider2 = spider0.pipeline(resultItemsCollectorPipeline0);
      spider0.clearPipeline();
      spider2.runAsync();
      Spider spider3 = spider2.thread(672);
      spider3.getCollectorPipeline();
      spider1.stop();
      PhantomJSDownloader phantomJSDownloader0 = null;
      try {
        phantomJSDownloader0 = new PhantomJSDownloader();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = "";
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = new Spider(simplePageProcessor0);
      String string1 = "//title";
      Spider spider1 = spider0.setUUID("//title");
      spider1.setExitWhenComplete(true);
      spider1.getStatus();
      // Undeclared exception!
      try { 
        spider1.sleep((-2253));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // timeout value is negative
         //
         verifyException("java.lang.Thread", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = "9A,+3t";
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("9A,+3t");
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider spider1 = spider0.thread(1334);
      FileCacheQueueScheduler fileCacheQueueScheduler0 = new FileCacheQueueScheduler("9A,+3t");
      Spider spider2 = spider1.setScheduler(fileCacheQueueScheduler0);
      CollectorPipeline collectorPipeline0 = spider2.getCollectorPipeline();
      Spider spider3 = spider2.addPipeline(collectorPipeline0);
      // Undeclared exception!
      try { 
        spider3.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.scheduler.FileCacheQueueScheduler", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("aQE5ghzr'x>bH^77r");
      Spider spider0 = Spider.create(simplePageProcessor0);
      PriorityScheduler priorityScheduler0 = new PriorityScheduler();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)31;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      Spider spider1 = spider0.setScheduler(priorityScheduler0);
      spider0.getSpiderListeners();
      Spider spider2 = spider1.setSpiderListeners((List<SpiderListener>) null);
      List<Request> list0 = null;
      Spider spider3 = spider2.startRequest((List<Request>) null);
      Spider spider4 = spider3.clearPipeline();
      spider4.getCollectorPipeline();
      Spider spider5 = spider4.startRequest((List<Request>) null);
      spider5.setExitWhenComplete(true);
      Spider.create(simplePageProcessor0);
      ForkJoinPool forkJoinPool0 = new ForkJoinPool(39);
      // Undeclared exception!
      try { 
        spider2.thread((ExecutorService) forkJoinPool0, (-1424));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // threadNum should be more than one!
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("uj@[wD'~_2.Om>");
      Spider spider0 = Spider.create(simplePageProcessor0);
      Spider spider1 = spider0.setSpawnUrl(true);
      Spider spider2 = spider1.setUUID("uj@[wD'~_2.Om>");
      spider2.getSite();
      spider2.getUUID();
      spider2.getScheduler();
      String string0 = null;
      // Undeclared exception!
      try { 
        spider2.get((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ConcurrentHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      System.setCurrentTimeMillis((-1L));
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = new Spider(simplePageProcessor0);
      QueueScheduler queueScheduler0 = new QueueScheduler();
      Spider spider1 = spider0.setScheduler(queueScheduler0);
      LinkedList<Pipeline> linkedList0 = new LinkedList<Pipeline>();
      Spider spider2 = spider1.setPipelines(linkedList0);
      Spider spider3 = spider2.setExitWhenComplete(true);
      ExecutorService executorService0 = null;
      // Undeclared exception!
      try { 
        spider3.thread((ExecutorService) null, (-426));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // threadNum should be more than one!
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider spider1 = spider0.clearPipeline();
      JsonFilePipeline jsonFilePipeline0 = new JsonFilePipeline("");
      Spider spider2 = spider1.pipeline((Pipeline) null);
      QueueScheduler queueScheduler0 = new QueueScheduler();
      spider2.scheduler(queueScheduler0);
      LinkedBlockingDeque<String> linkedBlockingDeque0 = new LinkedBlockingDeque<String>();
      // Undeclared exception!
      try { 
        spider0.getAll((Collection<String>) linkedBlockingDeque0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/http/protocol/HttpContext
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Spider.Status.fromValue(0);
      System.setCurrentTimeMillis(0);
      String string0 = "";
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider.create(simplePageProcessor0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Json json0 = new Json(linkedList0);
      // Undeclared exception!
      try { 
        json0.removePadding("");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // us/codecraft/xsoup/XTokenQueue
         //
         verifyException("us.codecraft.webmagic.selector.Json", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = " stop success!";
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(" stop success!");
      Spider spider0 = Spider.create(simplePageProcessor0);
      FileCacheQueueScheduler fileCacheQueueScheduler0 = new FileCacheQueueScheduler(" stop success!");
      HashSetDuplicateRemover hashSetDuplicateRemover0 = new HashSetDuplicateRemover();
      DuplicateRemovedScheduler duplicateRemovedScheduler0 = fileCacheQueueScheduler0.setDuplicateRemover(hashSetDuplicateRemover0);
      Spider spider1 = spider0.setScheduler(duplicateRemovedScheduler0);
      int int0 = 1300;
      Spider spider2 = spider1.thread(1300);
      spider2.start();
      Json json0 = new Json(" stop success!");
      Class<Selector> class0 = Selector.class;
      spider1.uuid = "";
      // Undeclared exception!
      try { 
        json0.toList(class0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/alibaba/fastjson/JSON
         //
         verifyException("us.codecraft.webmagic.selector.Json", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Spider.Status.fromValue((-1056));
      String string0 = "";
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider spider1 = spider0.setExitWhenComplete(true);
      spider1.setUUID("");
      ThreadPoolExecutor.CallerRunsPolicy threadPoolExecutor_CallerRunsPolicy0 = new ThreadPoolExecutor.CallerRunsPolicy();
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = null;
      try {
        scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor((-1056), (ThreadFactory) null, threadPoolExecutor_CallerRunsPolicy0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ThreadPoolExecutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = "tv";
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("tv");
      Spider spider0 = Spider.create(simplePageProcessor0);
      String[] stringArray0 = new String[0];
      Spider spider1 = spider0.addUrl(stringArray0);
      LinkedList<Request> linkedList0 = new LinkedList<Request>();
      Spider spider2 = spider1.startRequest(linkedList0);
      Json json0 = new Json((List<String>) null);
      Class<SpiderListener> class0 = SpiderListener.class;
      json0.toList(class0);
      Spider spider3 = spider2.setSpiderListeners((List<SpiderListener>) null);
      FileSystemHandling.shouldAllThrowIOExceptions();
      ConsolePipeline consolePipeline0 = new ConsolePipeline();
      Spider spider4 = spider3.addPipeline(consolePipeline0);
      LinkedList<Pipeline> linkedList1 = new LinkedList<Pipeline>();
      Spider spider5 = spider4.setPipelines(linkedList1);
      spider5.isExitWhenComplete();
      // Undeclared exception!
      try { 
        spider5.getAll((Collection<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.utils.UrlUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("EQ+a{");
      Spider spider0 = Spider.create(simplePageProcessor0);
      MultiPagePipeline multiPagePipeline0 = new MultiPagePipeline();
      Spider spider1 = spider0.pipeline(multiPagePipeline0);
      Spider spider2 = spider1.setExitWhenComplete(false);
      String[] stringArray0 = new String[0];
      Spider spider3 = spider2.addUrl(stringArray0);
      Spider spider4 = spider3.setUUID("EQ+a{");
      Spider spider5 = spider4.addPipeline(multiPagePipeline0);
      Page page0 = Page.fail();
      Page page1 = page0.setRawText("EQ+a{");
      spider5.extractAndAddRequests(page1, false);
      assertFalse(spider0.isExitWhenComplete());
      assertEquals(0L, spider0.getPageCount());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = "";
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = new Spider(simplePageProcessor0);
      List<Pipeline> list0 = null;
      Spider spider1 = spider0.setPipelines((List<Pipeline>) null);
      Spider spider2 = spider1.setUUID("us.codecraft.webmagic.downloader.HttpClientDownloader");
      spider1.runAsync();
      Page page0 = new Page();
      page0.putField("2jH5+Q", spider1);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      List<Request> list1 = page0.getTargetRequests();
      spider2.startRequest(list1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(" (x<C");
      Spider spider0 = Spider.create(simplePageProcessor0);
      int int0 = (-1205);
      // Undeclared exception!
      try { 
        spider0.thread((-1205));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // threadNum should be more than one!
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("(?is)<!DOCTYPE.*?>");
      Spider spider0 = Spider.create(simplePageProcessor0);
      Spider spider1 = spider0.setSpawnUrl(false);
      ForkJoinPool.ForkJoinWorkerThreadFactory forkJoinPool_ForkJoinWorkerThreadFactory0 = ForkJoinPool.defaultForkJoinWorkerThreadFactory;
      MockThread.getDefaultUncaughtExceptionHandler();
      ForkJoinPool forkJoinPool0 = new ForkJoinPool(395, forkJoinPool_ForkJoinWorkerThreadFactory0, (Thread.UncaughtExceptionHandler) null, false);
      Spider spider2 = spider1.setExecutorService(forkJoinPool0);
      Request[] requestArray0 = new Request[5];
      Request request0 = new Request();
      Request request1 = request0.putExtra("", (Object) null);
      Map<String, Object> map0 = request0.getExtras();
      Request request2 = request1.setExtras(map0);
      Request request3 = request2.setCharset("");
      Request request4 = request3.addHeader("Ta,RRKx!.", "");
      Request request5 = request4.setBinaryContent(false);
      requestArray0[0] = request5;
      Request request6 = new Request("R");
      requestArray0[1] = request6;
      Request request7 = request4.setBinaryContent(false);
      requestArray0[2] = request7;
      Request request8 = new Request();
      requestArray0[3] = request8;
      Request request9 = request3.setUrl("a4R.z$vk_@k<SS)%");
      requestArray0[4] = request9;
      // Undeclared exception!
      try { 
        spider2.addRequest(requestArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("us.codecraft.webmagic.utils.UrlUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("XC;jc");
      Spider spider0 = Spider.create(simplePageProcessor0);
      MultiPagePipeline multiPagePipeline0 = new MultiPagePipeline();
      Spider spider1 = spider0.addPipeline(multiPagePipeline0);
      LinkedList<Pipeline> linkedList0 = new LinkedList<Pipeline>();
      Spider spider2 = spider1.setPipelines(linkedList0);
      FileCacheQueueScheduler fileCacheQueueScheduler0 = new FileCacheQueueScheduler("");
      Spider spider3 = spider2.setScheduler(fileCacheQueueScheduler0);
      Spider spider4 = spider3.pipeline(multiPagePipeline0);
      Request[] requestArray0 = new Request[7];
      Request request0 = new Request();
      requestArray0[0] = request0;
      Request request1 = request0.setMethod("Spider {} started!");
      requestArray0[1] = request1;
      Request request2 = request1.setBinaryContent(true);
      requestArray0[2] = request2;
      Request request3 = request1.setCharset("");
      requestArray0[3] = request3;
      Request request4 = request0.setBinaryContent(false);
      requestArray0[4] = request4;
      Request request5 = request4.setCharset("");
      requestArray0[5] = request5;
      fileCacheQueueScheduler0.poll(spider4);
      requestArray0[6] = null;
      // Undeclared exception!
      try { 
        spider4.addRequest(requestArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.scheduler.DuplicateRemovedScheduler", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = "X2Jo8*_gZ.[";
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("X2Jo8*_gZ.[");
      Spider spider0 = new Spider(simplePageProcessor0);
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      LinkedBlockingQueue<Runnable> linkedBlockingQueue0 = new LinkedBlockingQueue<Runnable>();
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      ThreadPoolExecutor.CallerRunsPolicy threadPoolExecutor_CallerRunsPolicy0 = new ThreadPoolExecutor.CallerRunsPolicy();
      ThreadPoolExecutor threadPoolExecutor0 = null;
      try {
        threadPoolExecutor0 = new ThreadPoolExecutor((-3766), 1283, 1283, timeUnit0, linkedBlockingQueue0, threadFactory0, threadPoolExecutor_CallerRunsPolicy0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ThreadPoolExecutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        Spider.create((PageProcessor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = Spider.create(simplePageProcessor0);
      // Undeclared exception!
      try { 
        spider0.get("");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("us.codecraft.webmagic.utils.UrlUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String string0 = "Et";
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("Et");
      Spider spider0 = new Spider(simplePageProcessor0);
      // Undeclared exception!
      try { 
        spider0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("us.codecraft.webmagic.utils.FilePersistentBase");
      Spider spider0 = new Spider(simplePageProcessor0);
      String string0 = "";
      PhantomJSDownloader phantomJSDownloader0 = null;
      try {
        phantomJSDownloader0 = new PhantomJSDownloader("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String string0 = "EQ+a{";
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("EQ+a{");
      Spider spider0 = Spider.create(simplePageProcessor0);
      MultiPagePipeline multiPagePipeline0 = new MultiPagePipeline();
      Spider spider1 = spider0.pipeline(multiPagePipeline0);
      boolean boolean0 = false;
      Spider spider2 = spider1.setExitWhenComplete(false);
      String[] stringArray0 = new String[0];
      spider2.addUrl(stringArray0);
      PhantomJSDownloader phantomJSDownloader0 = null;
      try {
        phantomJSDownloader0 = new PhantomJSDownloader("EQ+a{");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = Spider.create(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("", "");
      Spider spider1 = spider0.downloader(phantomJSDownloader0);
      Spider spider2 = spider1.clearPipeline();
      QueueScheduler queueScheduler0 = new QueueScheduler();
      Spider spider3 = spider2.scheduler(queueScheduler0);
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      LinkedBlockingQueue<Runnable> linkedBlockingQueue0 = new LinkedBlockingQueue<Runnable>();
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      ThreadPoolExecutor.DiscardOldestPolicy threadPoolExecutor_DiscardOldestPolicy0 = new ThreadPoolExecutor.DiscardOldestPolicy();
      ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(449, 449, 449, timeUnit0, linkedBlockingQueue0, threadFactory0, threadPoolExecutor_DiscardOldestPolicy0);
      Spider spider4 = spider3.thread((ExecutorService) threadPoolExecutor0, 148);
      String string0 = ":#,YbAw5|7%q";
      Spider spider5 = spider4.setUUID(":#,YbAw5|7%q");
      EvoSuiteFile evoSuiteFile0 = null;
      spider5.stop();
      spider4.run();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = ":#,YbAw5|7%q";
      // Undeclared exception!
      try { 
        spider5.addUrl(stringArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("us.codecraft.webmagic.utils.UrlUtils", e);
      }
  }
}