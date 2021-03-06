/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 17:12:45 GMT 2019
 */

package us.codecraft.webmagic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.PriorityBlockingQueue;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.junit.runner.RunWith;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.SpiderListener;
import us.codecraft.webmagic.downloader.PhantomJSDownloader;
import us.codecraft.webmagic.pipeline.FilePipeline;
import us.codecraft.webmagic.pipeline.JsonFilePipeline;
import us.codecraft.webmagic.pipeline.MultiPagePipeline;
import us.codecraft.webmagic.pipeline.Pipeline;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.processor.SimplePageProcessor;
import us.codecraft.webmagic.scheduler.FileCacheQueueScheduler;
import us.codecraft.webmagic.scheduler.PriorityScheduler;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Spider_ESTest extends Spider_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("#+");
      Spider spider0 = Spider.create(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("", "");
      spider0.setDownloader(phantomJSDownloader0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
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
  public void test01()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("u:F;mS4(U");
      Spider spider0 = Spider.create(simplePageProcessor0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Spider spider1 = spider0.startUrls(linkedList0);
      Spider spider2 = spider1.startRequest((List<Request>) null);
      assertTrue(spider2.isSpawnUrl());
      assertEquals(0L, spider2.getPageCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = Spider.create(simplePageProcessor0);
      spider0.checkIfRunning();
      assertTrue(spider0.isSpawnUrl());
      assertEquals(0L, spider0.getPageCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("gc_)g6@dO2skGo");
      Spider spider0 = Spider.create(simplePageProcessor0);
      Request[] requestArray0 = new Request[7];
      Request request0 = new Request("l.Zo_>:93)]\"z@}");
      JsonFilePipeline jsonFilePipeline0 = new JsonFilePipeline("");
      request0.putExtra("_cycle_tried_times", jsonFilePipeline0);
      Request request1 = request0.setUrl((String) null);
      requestArray0[0] = request1;
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
  public void test04()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("uM,");
      Spider spider0 = Spider.create(simplePageProcessor0);
      spider0.setExitWhenComplete(false);
      spider0.setUUID("uM,");
      assertFalse(spider0.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("uM,");
      Spider spider0 = Spider.create(simplePageProcessor0);
      Spider spider1 = spider0.setExitWhenComplete(false);
      LinkedList<SpiderListener> linkedList0 = new LinkedList<SpiderListener>();
      spider1.setSpiderListeners(linkedList0);
      assertFalse(spider0.isExitWhenComplete());
      assertTrue(spider0.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("us.codecraft.webmagic.downloader.AbstractDownloader");
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider spider1 = spider0.setExitWhenComplete(false);
      spider1.setSpawnUrl(false);
      assertFalse(spider0.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("uM,");
      Spider spider0 = Spider.create(simplePageProcessor0);
      Spider spider1 = spider0.setExitWhenComplete(false);
      LinkedList<Pipeline> linkedList0 = new LinkedList<Pipeline>();
      spider1.setPipelines(linkedList0);
      assertFalse(spider0.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("us.codecraft.webmagic.downloader.AbstractDownloader");
      Spider spider0 = new Spider(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("", "us.codecraft.webmagic.downloader.AbstractDownloader");
      Spider spider1 = spider0.setDownloader(phantomJSDownloader0);
      assertTrue(spider1.isSpawnUrl());
      
      spider1.spawnUrl = false;
      spider0.setExecutorService((ExecutorService) null);
      assertEquals(0L, spider0.getPageCount());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(":");
      Spider spider0 = Spider.create(simplePageProcessor0);
      Spider spider1 = spider0.setExitWhenComplete(false);
      FileCacheQueueScheduler fileCacheQueueScheduler0 = new FileCacheQueueScheduler(":");
      spider1.scheduler(fileCacheQueueScheduler0);
      assertFalse(spider0.isExitWhenComplete());
      assertEquals(0L, spider0.getPageCount());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("us.codecraft.webmagic.downloader.AbstractDownloader");
      Spider spider0 = new Spider(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("", "us.codecraft.webmagic.downloader.AbstractDownloader");
      spider0.setDownloader(phantomJSDownloader0);
      PriorityBlockingQueue<String> priorityBlockingQueue0 = new PriorityBlockingQueue<String>();
      spider0.getAll((Collection<String>) priorityBlockingQueue0);
      spider0.getStartTime();
      assertEquals(Spider.Status.Stopped, spider0.getStatus());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("#+");
      Spider spider0 = Spider.create(simplePageProcessor0);
      spider0.getCollectorPipeline();
      assertEquals(0L, spider0.getPageCount());
      assertTrue(spider0.isExitWhenComplete());
      assertTrue(spider0.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("(");
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider spider1 = spider0.setUUID("");
      assertTrue(spider1.isSpawnUrl());
      assertTrue(spider1.isExitWhenComplete());
      assertEquals(0L, spider1.getPageCount());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(", cycleRetryTimes=");
      Spider spider0 = Spider.create(simplePageProcessor0);
      LinkedList<SpiderListener> linkedList0 = new LinkedList<SpiderListener>();
      Spider spider1 = spider0.setSpiderListeners(linkedList0);
      assertTrue(spider1.isSpawnUrl());
      assertEquals(0L, spider1.getPageCount());
      assertTrue(spider1.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(" error");
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider spider1 = spider0.setSpawnUrl(true);
      assertTrue(spider1.isExitWhenComplete());
      assertEquals(0L, spider1.getPageCount());
      assertTrue(spider0.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("LUmwIS!`,K9-bTHi8");
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider spider1 = spider0.setExitWhenComplete(true);
      assertEquals(0L, spider1.getPageCount());
      assertTrue(spider1.isSpawnUrl());
      assertTrue(spider0.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(", cycleRetryTimes=");
      Spider spider0 = Spider.create(simplePageProcessor0);
      spider0.setEmptySleepTime(0);
      assertEquals(0L, spider0.getPageCount());
      assertTrue(spider0.isExitWhenComplete());
      assertTrue(spider0.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("<}1/L;]_q}|<.)");
      Spider spider0 = new Spider(simplePageProcessor0);
      MultiPagePipeline multiPagePipeline0 = new MultiPagePipeline();
      Spider spider1 = spider0.pipeline(multiPagePipeline0);
      assertTrue(spider1.isSpawnUrl());
      assertEquals(0L, spider1.getPageCount());
      assertTrue(spider1.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("us.codecraft.webmagic.ResultItems");
      Spider spider0 = Spider.create(simplePageProcessor0);
      // Undeclared exception!
      try { 
        spider0.startUrls((List<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.utils.UrlUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("z`p]$23%EWl");
      Spider spider0 = new Spider(simplePageProcessor0);
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
  public void test20()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("(");
      Spider spider0 = new Spider(simplePageProcessor0);
      // Undeclared exception!
      try { 
        spider0.initComponent();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/http/protocol/HttpContext
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("Spider {} started!");
      Spider spider0 = Spider.create(simplePageProcessor0);
      spider0.setUUID("Spider ");
      FileCacheQueueScheduler fileCacheQueueScheduler0 = new FileCacheQueueScheduler("Spider {} started!");
      fileCacheQueueScheduler0.poll(spider0);
      assertTrue(spider0.isSpawnUrl());
      assertTrue(spider0.isExitWhenComplete());
      assertEquals(0L, spider0.getPageCount());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("allText");
      Spider spider0 = new Spider(simplePageProcessor0);
      String string0 = spider0.getUUID();
      assertTrue(spider0.isSpawnUrl());
      assertTrue(spider0.isExitWhenComplete());
      assertEquals(0L, spider0.getPageCount());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(":zVT.1P3F1@h");
      Spider spider0 = Spider.create(simplePageProcessor0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add(":zVT.1P3F1@h");
      // Undeclared exception!
      try { 
        spider0.getAll((Collection<String>) linkedList0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("us.codecraft.webmagic.utils.UrlUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("#+");
      Spider spider0 = Spider.create(simplePageProcessor0);
      FileCacheQueueScheduler fileCacheQueueScheduler0 = new FileCacheQueueScheduler("*");
      Spider spider1 = spider0.setScheduler(fileCacheQueueScheduler0);
      assertTrue(spider1.isSpawnUrl());
      assertTrue(spider1.isExitWhenComplete());
      assertEquals(0L, spider1.getPageCount());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("LUmwIS!`,K9-bTHi8");
      Spider spider0 = new Spider(simplePageProcessor0);
      int int0 = spider0.getThreadAlive();
      assertTrue(spider0.isExitWhenComplete());
      assertEquals(0, int0);
      assertEquals(0L, spider0.getPageCount());
      assertTrue(spider0.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("us.codecraft.webmagic.downloader.AbstractDownloader");
      Spider spider0 = new Spider(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("", "us.codecraft.webmagic.downloader.AbstractDownloader");
      Spider spider1 = spider0.setDownloader(phantomJSDownloader0);
      PriorityBlockingQueue<String> priorityBlockingQueue0 = new PriorityBlockingQueue<String>();
      spider0.getAll((Collection<String>) priorityBlockingQueue0);
      spider1.getThreadAlive();
      assertEquals(Spider.Status.Stopped, spider1.getStatus());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Spider.Status spider_Status0 = Spider.Status.fromValue(98);
      assertEquals(Spider.Status.Init, spider_Status0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("'WmG+?");
      Spider spider0 = new Spider(simplePageProcessor0);
      ForkJoinPool forkJoinPool0 = new ForkJoinPool(1573);
      // Undeclared exception!
      try { 
        spider0.thread((ExecutorService) forkJoinPool0, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // threadNum should be more than one!
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("6_1W}t;68");
      Spider spider0 = new Spider(simplePageProcessor0);
      ForkJoinPool.ForkJoinWorkerThreadFactory forkJoinPool_ForkJoinWorkerThreadFactory0 = ForkJoinPool.defaultForkJoinWorkerThreadFactory;
      ForkJoinPool forkJoinPool0 = new ForkJoinPool(429, forkJoinPool_ForkJoinWorkerThreadFactory0, (Thread.UncaughtExceptionHandler) null, true);
      Spider spider1 = spider0.thread((ExecutorService) forkJoinPool0, 200);
      assertEquals(0L, spider1.getPageCount());
      assertTrue(spider1.isExitWhenComplete());
      assertTrue(spider1.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("u:F;mS4(U");
      Spider spider0 = Spider.create(simplePageProcessor0);
      // Undeclared exception!
      try { 
        spider0.thread(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // threadNum should be more than one!
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("us.codecraft.webmagic.downloader.AbstractDownloader");
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider spider1 = spider0.thread(200);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("", "us.codecraft.webmagic.downloader.AbstractDownloader");
      spider1.setDownloader(phantomJSDownloader0);
      PriorityBlockingQueue<String> priorityBlockingQueue0 = new PriorityBlockingQueue<String>();
      spider0.getAll((Collection<String>) priorityBlockingQueue0);
      assertEquals(Spider.Status.Stopped, spider0.getStatus());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(", cycleRetryTimes=");
      Spider spider0 = Spider.create(simplePageProcessor0);
      spider0.stop();
      assertTrue(spider0.isExitWhenComplete());
      assertEquals(0L, spider0.getPageCount());
      assertEquals(Spider.Status.Init, spider0.getStatus());
      assertTrue(spider0.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("<}1/L;]_q}|<.)");
      Spider spider0 = new Spider(simplePageProcessor0);
      Request[] requestArray0 = new Request[0];
      Spider spider1 = spider0.addRequest(requestArray0);
      assertTrue(spider1.isSpawnUrl());
      assertEquals(0L, spider1.getPageCount());
      assertTrue(spider1.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("LUmwIS!`,K9-bTHi8");
      Spider spider0 = new Spider(simplePageProcessor0);
      // Undeclared exception!
      try { 
        spider0.get("LUmwIS!`,K9-bTHi8");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("us.codecraft.webmagic.utils.UrlUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(":zVT.1P3F1@h");
      Spider spider0 = Spider.create(simplePageProcessor0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Spider spider1 = spider0.startUrls(linkedList0);
      // Undeclared exception!
      try { 
        spider1.getAll((Collection<String>) linkedList0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/http/protocol/HttpContext
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("gc_)g6@dO2skGo");
      Spider spider0 = Spider.create(simplePageProcessor0);
      ForkJoinPool.ForkJoinWorkerThreadFactory forkJoinPool_ForkJoinWorkerThreadFactory0 = ForkJoinPool.defaultForkJoinWorkerThreadFactory;
      MockThread.getDefaultUncaughtExceptionHandler();
      ForkJoinPool forkJoinPool0 = new ForkJoinPool(1, forkJoinPool_ForkJoinWorkerThreadFactory0, (Thread.UncaughtExceptionHandler) null, false);
      Spider spider1 = spider0.setExecutorService(forkJoinPool0);
      spider1.runAsync();
      spider0.isExitWhenComplete();
      FilePipeline filePipeline0 = new FilePipeline("3jYQPL9O`");
      spider0.pipeline(filePipeline0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("<}1/L;]_q}|<.)");
      Spider spider0 = new Spider(simplePageProcessor0);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "<}1/L;]_q}|<.)";
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
  public void test39()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(" error");
      Spider spider0 = new Spider(simplePageProcessor0);
      Page page0 = Page.fail();
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
  public void test40()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("(");
      Spider spider0 = new Spider(simplePageProcessor0);
      Page page0 = new Page();
      spider0.extractAndAddRequests(page0, false);
      assertTrue(spider0.isSpawnUrl());
      assertEquals(0L, spider0.getPageCount());
      assertTrue(spider0.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("M4");
      Spider spider0 = new Spider(simplePageProcessor0);
      JsonFilePipeline jsonFilePipeline0 = new JsonFilePipeline("");
      Spider spider1 = spider0.pipeline(jsonFilePipeline0);
      // Undeclared exception!
      try { 
        spider1.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("#+");
      Spider spider0 = Spider.create(simplePageProcessor0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Spider spider1 = spider0.startUrls(linkedList0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("", "");
      spider1.setDownloader(phantomJSDownloader0);
      String[] stringArray0 = new String[2];
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
  public void test43()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("(");
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider spider1 = spider0.setSpiderListeners((List<SpiderListener>) null);
      assertEquals(0L, spider1.getPageCount());
      assertTrue(spider1.isExitWhenComplete());
      assertTrue(spider1.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(" error");
      Spider spider0 = new Spider(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader(" error", "Stopped");
      Spider spider1 = spider0.downloader(phantomJSDownloader0);
      assertTrue(spider1.isExitWhenComplete());
      assertEquals(0L, spider1.getPageCount());
      assertTrue(spider1.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("#+");
      Spider spider0 = Spider.create(simplePageProcessor0);
      spider0.getSite();
      assertEquals(0L, spider0.getPageCount());
      assertTrue(spider0.isExitWhenComplete());
      assertTrue(spider0.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("(");
      Spider spider0 = new Spider(simplePageProcessor0);
      PriorityScheduler priorityScheduler0 = new PriorityScheduler();
      Spider spider1 = spider0.scheduler(priorityScheduler0);
      assertEquals(0L, spider1.getPageCount());
      assertTrue(spider1.isExitWhenComplete());
      assertTrue(spider1.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("z`p]$23%EWl");
      Spider spider0 = new Spider(simplePageProcessor0);
      List<SpiderListener> list0 = spider0.getSpiderListeners();
      assertTrue(spider0.isSpawnUrl());
      assertNull(list0);
      assertEquals(0L, spider0.getPageCount());
      assertTrue(spider0.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("#+");
      Spider spider0 = Spider.create(simplePageProcessor0);
      Spider spider1 = spider0.clearPipeline();
      assertEquals(0L, spider1.getPageCount());
      assertTrue(spider1.isExitWhenComplete());
      assertTrue(spider1.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("us.codecraft.webmagic.selector.ReplaceSelector");
      Spider spider0 = Spider.create(simplePageProcessor0);
      // Undeclared exception!
      try { 
        spider0.sleep((-1250));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // timeout value is negative
         //
         verifyException("java.lang.Thread", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(" error");
      Spider spider0 = new Spider(simplePageProcessor0);
      spider0.getScheduler();
      assertTrue(spider0.isSpawnUrl());
      assertEquals(0L, spider0.getPageCount());
      assertTrue(spider0.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(", cycleRetryTimes=");
      Spider spider0 = Spider.create(simplePageProcessor0);
      spider0.start();
      assertTrue(spider0.isSpawnUrl());
      assertEquals(Spider.Status.Init, spider0.getStatus());
      assertTrue(spider0.isExitWhenComplete());
      assertEquals(0L, spider0.getPageCount());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("us.codecraft.webmagic.downloader.AbstractDownloader");
      Spider spider0 = new Spider(simplePageProcessor0);
      assertTrue(spider0.isExitWhenComplete());
      
      spider0.setExitWhenComplete(false);
      spider0.setExecutorService((ExecutorService) null);
      assertFalse(spider0.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("us.codecraft.webmagic.downloader.AbstractDownloader");
      Spider spider0 = new Spider(simplePageProcessor0);
      assertTrue(spider0.isSpawnUrl());
      
      spider0.setSpawnUrl(false);
      assertFalse(spider0.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("us.codecraft.webmagic.downloader.AbstractDownloader");
      Spider spider0 = new Spider(simplePageProcessor0);
      long long0 = spider0.getPageCount();
      assertTrue(spider0.isExitWhenComplete());
      assertTrue(spider0.isSpawnUrl());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("us.codecraft.webmagic.downloader.AbstractDownloader");
      Spider spider0 = new Spider(simplePageProcessor0);
      spider0.setEmptySleepTime(5);
      assertEquals(0L, spider0.getPageCount());
      assertTrue(spider0.isExitWhenComplete());
      assertTrue(spider0.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("#+");
      Spider spider0 = Spider.create(simplePageProcessor0);
      boolean boolean0 = spider0.isSpawnUrl();
      assertTrue(boolean0);
      assertTrue(spider0.isExitWhenComplete());
      assertEquals(0L, spider0.getPageCount());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(" error");
      Spider spider0 = new Spider(simplePageProcessor0);
      MultiPagePipeline multiPagePipeline0 = new MultiPagePipeline();
      Spider spider1 = spider0.addPipeline(multiPagePipeline0);
      assertEquals(0L, spider1.getPageCount());
      assertTrue(spider1.isSpawnUrl());
      assertTrue(spider1.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("us.codecraft.webmagic.downloader.AbstractDownloader");
      Spider spider0 = new Spider(simplePageProcessor0);
      spider0.getStartTime();
      assertTrue(spider0.isSpawnUrl());
      assertTrue(spider0.isExitWhenComplete());
      assertEquals(0L, spider0.getPageCount());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(", cycleRetryTimes=");
      Spider spider0 = Spider.create(simplePageProcessor0);
      spider0.runAsync();
      spider0.start();
      spider0.stop();
      //  // Unstable assertion: assertEquals(Spider.Status.Stopped, spider0.getStatus());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("uM,");
      Spider spider0 = Spider.create(simplePageProcessor0);
      assertEquals(Spider.Status.Init, spider0.getStatus());
      
      LinkedList<Pipeline> linkedList0 = new LinkedList<Pipeline>();
      Spider spider1 = spider0.setPipelines(linkedList0);
      assertEquals(0L, spider1.getPageCount());
      assertTrue(spider1.isExitWhenComplete());
      assertTrue(spider1.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("a.");
      Spider spider0 = new Spider(simplePageProcessor0);
      String[] stringArray0 = new String[0];
      Spider spider1 = spider0.addUrl(stringArray0);
      assertTrue(spider1.isSpawnUrl());
      assertTrue(spider1.isExitWhenComplete());
      assertEquals(0L, spider1.getPageCount());
      assertEquals(Spider.Status.Init, spider1.getStatus());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("a.");
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider spider1 = spider0.setUUID((String) null);
      assertTrue(spider1.isSpawnUrl());
      assertTrue(spider1.isExitWhenComplete());
      assertEquals(Spider.Status.Init, spider1.getStatus());
      assertEquals(0L, spider1.getPageCount());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("a.");
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider.Status spider_Status0 = spider0.getStatus();
      assertEquals(Spider.Status.Init, spider_Status0);
      assertTrue(spider0.isExitWhenComplete());
      assertTrue(spider0.isSpawnUrl());
      assertEquals(0L, spider0.getPageCount());
  }
}
