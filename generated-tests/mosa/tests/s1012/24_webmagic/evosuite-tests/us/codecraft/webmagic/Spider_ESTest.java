/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 03:52:49 GMT 2018
 */

package us.codecraft.webmagic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.SpiderListener;
import us.codecraft.webmagic.downloader.Downloader;
import us.codecraft.webmagic.downloader.PhantomJSDownloader;
import us.codecraft.webmagic.pipeline.CollectorPipeline;
import us.codecraft.webmagic.pipeline.ConsolePipeline;
import us.codecraft.webmagic.pipeline.FilePipeline;
import us.codecraft.webmagic.pipeline.JsonFilePipeline;
import us.codecraft.webmagic.pipeline.Pipeline;
import us.codecraft.webmagic.pipeline.ResultItemsCollectorPipeline;
import us.codecraft.webmagic.processor.SimplePageProcessor;
import us.codecraft.webmagic.scheduler.FileCacheQueueScheduler;
import us.codecraft.webmagic.scheduler.PriorityScheduler;
import us.codecraft.webmagic.scheduler.QueueScheduler;
import us.codecraft.webmagic.scheduler.Scheduler;
import us.codecraft.webmagic.thread.CountableThreadPool;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Spider_ESTest extends Spider_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("#jYTE");
      Spider spider0 = Spider.create(simplePageProcessor0);
      CollectorPipeline collectorPipeline0 = spider0.getCollectorPipeline();
      Spider spider1 = spider0.addPipeline(collectorPipeline0);
      assertTrue(spider1.isSpawnUrl());
      assertTrue(spider1.isExitWhenComplete());
      assertEquals(0L, spider1.getPageCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("\n");
      Spider spider0 = Spider.create(simplePageProcessor0);
      Spider spider1 = spider0.setExitWhenComplete(true);
      // Undeclared exception!
      try { 
        spider1.get("\n");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("us.codecraft.webmagic.utils.UrlUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("cY%}]}|/kfY2@");
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider spider1 = spider0.clearPipeline();
      // Undeclared exception!
      try { 
        spider1.thread((-3141));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // threadNum should be more than one!
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = Spider.create(simplePageProcessor0);
      ForkJoinPool forkJoinPool0 = new ForkJoinPool();
      int int0 = (-135);
      // Undeclared exception!
      try { 
        spider0.thread((ExecutorService) forkJoinPool0, (-135));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // threadNum should be more than one!
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("\"J-*VkN-~0O1&6!");
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider spider1 = spider0.scheduler((Scheduler) null);
      LinkedList<Pipeline> linkedList0 = new LinkedList<Pipeline>();
      spider1.setPipelines(linkedList0);
      ConsolePipeline consolePipeline0 = new ConsolePipeline();
      QueueScheduler queueScheduler0 = new QueueScheduler();
      Spider spider2 = spider0.setScheduler(queueScheduler0);
      assertTrue(spider2.isSpawnUrl());
      assertEquals(0L, spider2.getPageCount());
      assertTrue(spider2.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("z");
      Spider spider0 = Spider.create(simplePageProcessor0);
      Object object0 = new Object();
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(2, threadFactory0);
      Spider spider1 = spider0.setExecutorService(scheduledThreadPoolExecutor0);
      assertTrue(spider1.isSpawnUrl());
      
      spider0.setSpawnUrl(false);
      assertFalse(spider0.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Spider.Status.values();
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("&RPpm3YLmw_");
      Spider spider0 = Spider.create(simplePageProcessor0);
      Spider spider1 = spider0.clearPipeline();
      spider1.stop();
      spider1.startRequest((List<Request>) null);
      ConsolePipeline consolePipeline0 = new ConsolePipeline();
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        spider1.test(stringArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/http/protocol/HttpContext
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = Spider.create(simplePageProcessor0);
      spider0.clearPipeline();
      // Undeclared exception!
      try { 
        spider0.get("");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("us.codecraft.webmagic.utils.UrlUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("z");
      Spider spider0 = Spider.create(simplePageProcessor0);
      String string0 = spider0.getUUID();
      assertNull(string0);
      
      FileCacheQueueScheduler fileCacheQueueScheduler0 = new FileCacheQueueScheduler("z");
      spider0.getStartTime();
      int int0 = spider0.getThreadAlive();
      assertTrue(spider0.isSpawnUrl());
      assertTrue(spider0.isExitWhenComplete());
      assertEquals(0L, spider0.getPageCount());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = (-3227);
      Spider.Status.fromValue((-3227));
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("l{vyixSWlX");
      Page page0 = Page.fail();
      // Undeclared exception!
      try { 
        simplePageProcessor0.process(page0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/jsoup/nodes/Node
         //
         verifyException("us.codecraft.webmagic.Page", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = Spider.create(simplePageProcessor0);
      spider0.stop();
      List<SpiderListener> list0 = spider0.getSpiderListeners();
      assertEquals(0L, spider0.getPageCount());
      assertTrue(spider0.isExitWhenComplete());
      assertNull(list0);
      assertTrue(spider0.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = Spider.create(simplePageProcessor0);
      LinkedList<SpiderListener> linkedList0 = new LinkedList<SpiderListener>();
      Spider spider1 = spider0.setSpiderListeners(linkedList0);
      // Undeclared exception!
      try { 
        spider1.get("{UM/.x~]5");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("us.codecraft.webmagic.utils.UrlUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = Spider.create(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("", "");
      Spider spider1 = spider0.downloader(phantomJSDownloader0);
      spider0.setUUID("$VALUES");
      PriorityScheduler priorityScheduler0 = new PriorityScheduler();
      spider0.thread(5);
      Spider.create(simplePageProcessor0);
      spider1.stop();
      assertTrue(spider1.isExitWhenComplete());
      assertEquals(0L, spider1.getPageCount());
      assertTrue(spider1.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = Spider.create(simplePageProcessor0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "";
      // Undeclared exception!
      try { 
        spider0.addUrl(stringArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("us.codecraft.webmagic.utils.UrlUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = Spider.create(simplePageProcessor0);
      spider0.thread((ExecutorService) null, 1539);
      // Undeclared exception!
      try { 
        spider0.run();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/http/protocol/HttpContext
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = "";
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = Spider.create(simplePageProcessor0);
      LinkedTransferQueue<String> linkedTransferQueue0 = new LinkedTransferQueue<String>();
      // Undeclared exception!
      try { 
        spider0.getAll((Collection<String>) linkedTransferQueue0);
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
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = Spider.create(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("", "");
      PhantomJSDownloader phantomJSDownloader1 = new PhantomJSDownloader("", "");
      Spider spider1 = spider0.downloader(phantomJSDownloader1);
      PriorityScheduler priorityScheduler0 = new PriorityScheduler();
      Spider spider2 = spider1.setUUID("");
      Spider spider3 = spider2.downloader(phantomJSDownloader1);
      assertTrue(spider3.isExitWhenComplete());
      
      spider3.run();
      spider1.getScheduler();
      assertTrue(spider1.isSpawnUrl());
      assertEquals(0L, spider1.getPageCount());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = Spider.create(simplePageProcessor0);
      spider0.extractAndAddRequests((Page) null, false);
      String string0 = spider0.getUUID();
      assertNull(string0);
      
      spider0.getScheduler();
      Spider spider1 = spider0.setSpawnUrl(true);
      assertTrue(spider0.isSpawnUrl());
      assertTrue(spider1.isExitWhenComplete());
      assertEquals(0L, spider1.getPageCount());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = Spider.create(simplePageProcessor0);
      Request[] requestArray0 = new Request[1];
      // Undeclared exception!
      try { 
        spider0.addRequest(requestArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.scheduler.DuplicateRemovedScheduler", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Spider.Status.values();
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("&RPpm3YLmw_");
      Spider spider0 = Spider.create(simplePageProcessor0);
      spider0.stop();
      JsonFilePipeline jsonFilePipeline0 = new JsonFilePipeline("us.codecraft.webmagic.Spider");
      FilePipeline filePipeline0 = new FilePipeline();
      Spider spider1 = spider0.pipeline(filePipeline0);
      assertTrue(spider1.isExitWhenComplete());
      assertEquals(0L, spider1.getPageCount());
      assertTrue(spider1.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = Spider.create(simplePageProcessor0);
      // Undeclared exception!
      try { 
        spider0.get((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ConcurrentHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("z");
      Spider spider0 = Spider.create(simplePageProcessor0);
      spider0.stop();
      spider0.start();
      assertEquals(0L, spider0.getPageCount());
      assertTrue(spider0.isExitWhenComplete());
      assertTrue(spider0.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("a");
      Spider spider0 = Spider.create(simplePageProcessor0);
      ConsolePipeline consolePipeline0 = new ConsolePipeline();
      Spider spider1 = spider0.pipeline(consolePipeline0);
      Spider spider2 = spider1.setUUID("a");
      QueueScheduler queueScheduler0 = new QueueScheduler();
      Spider spider3 = spider2.setScheduler(queueScheduler0);
      LinkedList<Pipeline> linkedList0 = new LinkedList<Pipeline>();
      spider1.setPipelines(linkedList0);
      LinkedList<SpiderListener> linkedList1 = new LinkedList<SpiderListener>();
      spider3.setSpiderListeners(linkedList1);
      spider3.runAsync();
      boolean boolean0 = spider2.isExitWhenComplete();
      assertTrue(boolean0);
      assertTrue(spider2.isSpawnUrl());
      assertEquals(0L, spider2.getPageCount());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(", charset='");
      Spider spider0 = new Spider(simplePageProcessor0);
      QueueScheduler queueScheduler0 = new QueueScheduler();
      Spider spider1 = spider0.setScheduler(queueScheduler0);
      Spider spider2 = spider1.setUUID(",mK3Vn<J");
      SynchronousQueue<String> synchronousQueue0 = new SynchronousQueue<String>();
      List<Request> list0 = new LinkedList<Request>();
      spider2.startRequest(list0);
      spider1.isExitWhenComplete();
      // Undeclared exception!
      try { 
        spider0.getAll((Collection<String>) synchronousQueue0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/http/protocol/HttpContext
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("=SN7IV");
      Spider spider0 = new Spider(simplePageProcessor0);
      Page page0 = Page.fail();
      page0.getTargetRequests();
      spider0.setUUID("=SN7IV");
      String[] stringArray0 = new String[0];
      spider0.addUrl(stringArray0);
      PhantomJSDownloader phantomJSDownloader0 = null;
      try {
        phantomJSDownloader0 = new PhantomJSDownloader(":a9x+D$=TLvG@UH");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Spider.Status.values();
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("&RPpm3YLmw_");
      Spider spider0 = Spider.create(simplePageProcessor0);
      Spider spider1 = spider0.clearPipeline();
      int int0 = spider1.getThreadAlive();
      assertEquals(0, int0);
      
      spider1.startRequest((List<Request>) null);
      FileCacheQueueScheduler fileCacheQueueScheduler0 = new FileCacheQueueScheduler("&RPpm3YLmw_");
      Spider spider2 = spider0.scheduler(fileCacheQueueScheduler0);
      spider2.setScheduler(fileCacheQueueScheduler0);
      spider2.getStatus();
      assertEquals(0L, spider2.getPageCount());
      assertTrue(spider2.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("iVlZ;\"!qy_S$_f");
      LinkedList<Pipeline> linkedList0 = new LinkedList<Pipeline>();
      QueueScheduler queueScheduler0 = new QueueScheduler();
      Spider spider0 = Spider.create(simplePageProcessor0);
      spider0.isSpawnUrl();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ConsolePipeline consolePipeline0 = new ConsolePipeline();
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("Thread interrupted when sleep");
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider spider1 = spider0.setDownloader((Downloader) null);
      spider1.sleep(0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("z");
      Spider spider0 = Spider.create(simplePageProcessor0);
      Page page0 = new Page();
      // Undeclared exception!
      try { 
        spider0.extractAndAddRequests(page0, true);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/collections/CollectionUtils
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("<");
      Spider spider0 = Spider.create(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("<", "<");
      Spider spider1 = spider0.downloader(phantomJSDownloader0);
      Spider spider2 = spider1.setUUID("<C),|p8>d");
      PriorityScheduler priorityScheduler0 = new PriorityScheduler();
      Spider spider3 = spider1.thread(5);
      PriorityScheduler priorityScheduler1 = new PriorityScheduler();
      Spider spider4 = spider2.setScheduler(priorityScheduler1);
      spider2.run();
      spider2.getSite();
      String[] stringArray0 = new String[0];
      spider3.test(stringArray0);
      spider0.start();
      spider2.start();
      // Undeclared exception!
      try { 
        spider4.thread(5);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Spider is already running!
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = Spider.create(simplePageProcessor0);
      Request request0 = new Request();
      Request request1 = request0.addCookie("", "");
      request1.addCookie("_cycle_tried_times", "");
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("&", "");
      Spider spider1 = spider0.downloader(phantomJSDownloader0);
      PriorityScheduler priorityScheduler0 = new PriorityScheduler();
      spider0.run();
      spider1.scheduler(priorityScheduler0);
      spider0.setScheduler(priorityScheduler0);
      spider0.run();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("ie");
      Spider spider0 = Spider.create(simplePageProcessor0);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "");
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("", "");
      Spider spider1 = spider0.downloader(phantomJSDownloader0);
      LinkedList<SpiderListener> linkedList0 = new LinkedList<SpiderListener>();
      spider0.setSpawnUrl(false);
      spider1.stop();
      ConsolePipeline consolePipeline0 = new ConsolePipeline();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "ie";
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
  public void test32()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = Spider.create(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("", "");
      PhantomJSDownloader phantomJSDownloader1 = new PhantomJSDownloader("", "");
      Spider spider1 = spider0.downloader(phantomJSDownloader1);
      PriorityScheduler priorityScheduler0 = new PriorityScheduler();
      spider1.setUUID("");
      ForkJoinPool forkJoinPool0 = new ForkJoinPool();
      Spider spider2 = spider0.thread((ExecutorService) forkJoinPool0, 1539);
      spider2.run();
      spider2.getScheduler();
      spider2.getThreadAlive();
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = Spider.create(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("", "");
      PhantomJSDownloader phantomJSDownloader1 = new PhantomJSDownloader("", "");
      phantomJSDownloader1.setThread(4675);
      Spider spider1 = spider0.downloader(phantomJSDownloader1);
      PriorityScheduler priorityScheduler0 = new PriorityScheduler();
      spider1.setUUID("");
      ForkJoinPool forkJoinPool0 = new ForkJoinPool();
      Spider spider2 = spider0.thread((ExecutorService) forkJoinPool0, 1539);
      spider2.run();
      spider2.getScheduler();
      spider1.setEmptySleepTime(4675);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("<");
      Spider spider0 = Spider.create(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("<", "<");
      Spider spider1 = spider0.downloader(phantomJSDownloader0);
      Spider spider2 = spider1.setUUID("<C),|p8>d");
      PriorityScheduler priorityScheduler0 = new PriorityScheduler();
      spider1.thread(5);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      List<String> list0 = spider1.getAll((Collection<String>) linkedList0);
      spider1.startUrls(list0);
      spider2.run();
      spider1.getUUID();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = Spider.create(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("", "");
      PhantomJSDownloader phantomJSDownloader1 = new PhantomJSDownloader("", "");
      Spider spider1 = spider0.downloader(phantomJSDownloader1);
      PriorityScheduler priorityScheduler0 = new PriorityScheduler();
      Spider spider2 = spider0.setUUID("");
      ForkJoinPool forkJoinPool0 = new ForkJoinPool();
      spider2.thread((ExecutorService) forkJoinPool0, 5);
      spider1.run();
      spider0.getScheduler();
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("cY%}]}|/kfY2@");
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider spider1 = spider0.clearPipeline();
      // Undeclared exception!
      try { 
        spider1.startUrls((List<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.utils.UrlUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("<");
      Spider spider0 = Spider.create(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("<", "<");
      Spider spider1 = spider0.downloader(phantomJSDownloader0);
      Spider spider2 = spider1.setUUID("<C),|p8>d");
      PriorityScheduler priorityScheduler0 = new PriorityScheduler();
      spider1.thread(5);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      spider1.startUrls(linkedList0);
      spider2.run();
      spider1.getUUID();
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = Spider.create(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("", "z");
      Spider spider1 = spider0.downloader(phantomJSDownloader0);
      spider1.setSpawnUrl(true);
      FileCacheQueueScheduler fileCacheQueueScheduler0 = new FileCacheQueueScheduler("");
      Spider spider2 = spider1.scheduler(fileCacheQueueScheduler0);
      Spider spider3 = spider2.setScheduler(fileCacheQueueScheduler0);
      spider3.run();
      spider2.getSite();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("d");
      Spider spider0 = Spider.create(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("d", "z");
      Spider spider1 = spider0.downloader(phantomJSDownloader0);
      PriorityScheduler priorityScheduler0 = new PriorityScheduler();
      Request request0 = new Request("select text error! ");
      priorityScheduler0.pushWhenNoDuplicate(request0, spider1);
      spider1.setScheduler(priorityScheduler0);
      spider0.run();
      Page page0 = new Page();
      // Undeclared exception!
      try { 
        spider0.onError(request0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/collections/CollectionUtils
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = Spider.create(simplePageProcessor0);
      Request request0 = new Request();
      Request request1 = request0.addCookie("", "");
      request1.addCookie("_cycle_tried_times", "");
      Spider spider1 = spider0.setPipelines((List<Pipeline>) null);
      Request[] requestArray0 = new Request[0];
      Spider spider2 = spider1.addRequest(requestArray0);
      LinkedList<SpiderListener> linkedList0 = new LinkedList<SpiderListener>();
      request1.setMethod("|$m+%+*'kcj5b}");
      Spider.create(simplePageProcessor0);
      spider2.stop();
      ConsolePipeline consolePipeline0 = new ConsolePipeline();
      spider2.setUUID("_cycle_tried_times");
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = Spider.create(simplePageProcessor0);
      spider0.stop();
      ConsolePipeline consolePipeline0 = new ConsolePipeline();
      spider0.getPageCount();
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("HA7r}8j/dIjFu4DH.&");
      Spider spider0 = Spider.create(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("HA7r}8j/dIjFu4DH.&", "HA7r}8j/dIjFu4DH.&");
      PhantomJSDownloader phantomJSDownloader1 = new PhantomJSDownloader("HA7r}8j/dIjFu4DH.&", "HA7r}8j/dIjFu4DH.&");
      Spider spider1 = spider0.downloader(phantomJSDownloader1);
      PriorityScheduler priorityScheduler0 = new PriorityScheduler();
      Spider spider2 = spider0.thread(5);
      ForkJoinPool forkJoinPool0 = new ForkJoinPool();
      spider2.thread((ExecutorService) forkJoinPool0, 5);
      spider1.run();
      Spider spider3 = spider2.thread(5);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "HA7r}8j/dIjFu4DH.&";
      stringArray0[2] = "HA7r}8j/dIjFu4DH.&";
      stringArray0[3] = "HA7r}8j/dIjFu4DH.&";
      stringArray0[4] = "HA7r}8j/dIjFu4DH.&";
      stringArray0[5] = "HA7r}8j/dIjFu4DH.&";
      stringArray0[6] = "HA7r}8j/dIjFu4DH.&";
      // Undeclared exception!
      try { 
        spider3.test(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.downloader.PhantomJSDownloader", e);
      }
  }
}