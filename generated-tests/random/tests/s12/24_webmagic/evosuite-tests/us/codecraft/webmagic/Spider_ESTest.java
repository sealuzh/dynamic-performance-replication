/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 20:49:58 GMT 2019
 */

package us.codecraft.webmagic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.SpiderListener;
import us.codecraft.webmagic.downloader.PhantomJSDownloader;
import us.codecraft.webmagic.pipeline.MultiPagePipeline;
import us.codecraft.webmagic.pipeline.Pipeline;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.processor.SimplePageProcessor;
import us.codecraft.webmagic.scheduler.FileCacheQueueScheduler;
import us.codecraft.webmagic.scheduler.QueueScheduler;
import us.codecraft.webmagic.scheduler.Scheduler;
import us.codecraft.webmagic.thread.CountableThreadPool;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Spider_ESTest extends Spider_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("n,!wB]SMbBqPA,::@1");
      Spider spider0 = new Spider(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("n,!wB]SMbBqPA,::@1", "n,!wB]SMbBqPA,::@1");
      Spider spider1 = spider0.setDownloader(phantomJSDownloader0);
      spider0.thread(2);
      spider1.run();
      assertEquals(Spider.Status.Stopped, spider1.getStatus());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = Spider.create(simplePageProcessor0);
      spider0.checkIfRunning();
      assertTrue(spider0.isSpawnUrl());
      assertEquals(0L, spider0.getPageCount());
      assertTrue(spider0.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("4nRz$FgXQg)(};]'[v");
      Spider spider0 = new Spider(simplePageProcessor0);
      assertTrue(spider0.isExitWhenComplete());
      
      spider0.setExitWhenComplete(false);
      spider0.thread((ExecutorService) null, 1414);
      assertFalse(spider0.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("4nRz$FgXQg)(};]'[v");
      Spider spider0 = new Spider(simplePageProcessor0);
      assertTrue(spider0.isExitWhenComplete());
      
      spider0.setExitWhenComplete(false);
      spider0.thread(3500);
      assertFalse(spider0.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = new Spider(simplePageProcessor0);
      assertTrue(spider0.isSpawnUrl());
      
      Spider spider1 = spider0.setSpawnUrl(false);
      spider1.setUUID("");
      assertFalse(spider0.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("z15)O/yGNi&kZdcs ?");
      Spider spider0 = Spider.create(simplePageProcessor0);
      assertTrue(spider0.isSpawnUrl());
      
      spider0.setSpawnUrl(false);
      spider0.setSpiderListeners((List<SpiderListener>) null);
      assertFalse(spider0.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("OrO[>I\"8<L?$w\"");
      Spider spider0 = new Spider(simplePageProcessor0);
      assertTrue(spider0.isExitWhenComplete());
      
      spider0.setExitWhenComplete(false);
      spider0.setSpiderListeners((List<SpiderListener>) null);
      assertFalse(spider0.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("v'op\"J*&7s");
      Spider spider0 = new Spider(simplePageProcessor0);
      assertTrue(spider0.isExitWhenComplete());
      
      Spider spider1 = spider0.setExitWhenComplete(false);
      spider1.setSpawnUrl(true);
      assertFalse(spider0.isExitWhenComplete());
      assertTrue(spider0.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("9~CQ");
      Spider spider0 = Spider.create(simplePageProcessor0);
      assertTrue(spider0.isSpawnUrl());
      
      Spider spider1 = spider0.setSpawnUrl(false);
      FileCacheQueueScheduler fileCacheQueueScheduler0 = new FileCacheQueueScheduler("WR,.VL`'kgWWpM$v");
      spider1.setScheduler(fileCacheQueueScheduler0);
      assertFalse(spider0.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("4nRz$FgXQg)(};]'[v");
      Spider spider0 = new Spider(simplePageProcessor0);
      assertTrue(spider0.isExitWhenComplete());
      
      QueueScheduler queueScheduler0 = new QueueScheduler();
      Spider spider1 = spider0.setExitWhenComplete(false);
      spider1.setScheduler(queueScheduler0);
      assertFalse(spider0.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("9~CQ");
      Spider spider0 = Spider.create(simplePageProcessor0);
      assertTrue(spider0.isSpawnUrl());
      
      spider0.setSpawnUrl(false);
      LinkedList<Pipeline> linkedList0 = new LinkedList<Pipeline>();
      spider0.setPipelines(linkedList0);
      assertFalse(spider0.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("OrO[>I\"8<L?$w\"");
      Spider spider0 = new Spider(simplePageProcessor0);
      assertTrue(spider0.isExitWhenComplete());
      
      Spider spider1 = spider0.setExitWhenComplete(false);
      LinkedList<Pipeline> linkedList0 = new LinkedList<Pipeline>();
      spider1.setPipelines(linkedList0);
      assertFalse(spider0.isExitWhenComplete());
      assertTrue(spider0.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("@");
      Spider spider0 = new Spider(simplePageProcessor0);
      spider0.setSpawnUrl(false);
      spider0.setExitWhenComplete(false);
      assertFalse(spider0.isSpawnUrl());
      assertFalse(spider0.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("4nRz$FgXQg)(};]'[v");
      Spider spider0 = new Spider(simplePageProcessor0);
      assertTrue(spider0.isExitWhenComplete());
      
      Spider spider1 = spider0.setExitWhenComplete(false);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader((String) null, "@C_?-V_=Iv@a ]eR");
      spider1.setDownloader(phantomJSDownloader0);
      assertFalse(spider0.isExitWhenComplete());
      assertEquals(0L, spider0.getPageCount());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("OrO[>I\"8<L?$w\"");
      Spider spider0 = new Spider(simplePageProcessor0);
      assertTrue(spider0.isExitWhenComplete());
      
      spider0.setExitWhenComplete(false);
      spider0.scheduler((Scheduler) null);
      assertFalse(spider0.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("z15)O/yGNi&kZdcs ?");
      Spider spider0 = Spider.create(simplePageProcessor0);
      assertTrue(spider0.isSpawnUrl());
      
      spider0.setSpawnUrl(false);
      boolean boolean0 = spider0.isSpawnUrl();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("4nRz$FgXQg)(};]'[v");
      Spider spider0 = new Spider(simplePageProcessor0);
      assertTrue(spider0.isExitWhenComplete());
      
      spider0.setExitWhenComplete(false);
      boolean boolean0 = spider0.isExitWhenComplete();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("Stopped");
      Spider spider0 = Spider.create(simplePageProcessor0);
      LinkedList<SpiderListener> linkedList0 = new LinkedList<SpiderListener>();
      Spider spider1 = spider0.setSpiderListeners(linkedList0);
      List<SpiderListener> list0 = spider1.getSpiderListeners();
      assertEquals(0L, spider1.getPageCount());
      assertTrue(spider1.isExitWhenComplete());
      assertNotNull(list0);
      assertTrue(spider1.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("@");
      Spider spider0 = new Spider(simplePageProcessor0);
      assertTrue(spider0.isSpawnUrl());
      
      Spider spider1 = spider0.setSpawnUrl(false);
      spider1.clearPipeline();
      assertFalse(spider0.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider spider1 = spider0.startRequest((List<Request>) null);
      assertEquals(0L, spider1.getPageCount());
      assertTrue(spider1.isExitWhenComplete());
      assertTrue(spider1.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("@");
      Spider spider0 = new Spider(simplePageProcessor0);
      assertTrue(spider0.isSpawnUrl());
      
      Spider spider1 = spider0.setSpawnUrl(false);
      String[] stringArray0 = new String[0];
      spider1.addUrl(stringArray0);
      assertFalse(spider0.isSpawnUrl());
      assertTrue(spider0.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("4nRz$FgXQg)(};]'[v");
      Spider spider0 = new Spider(simplePageProcessor0);
      assertTrue(spider0.isExitWhenComplete());
      
      spider0.setExitWhenComplete(false);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader((String) null, "@C_?-V_=Iv@a ]eR");
      spider0.downloader(phantomJSDownloader0);
      assertFalse(spider0.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("Stopped");
      Spider spider0 = Spider.create(simplePageProcessor0);
      ForkJoinPool.ForkJoinWorkerThreadFactory forkJoinPool_ForkJoinWorkerThreadFactory0 = ForkJoinPool.defaultForkJoinWorkerThreadFactory;
      ForkJoinPool forkJoinPool0 = new ForkJoinPool(2, forkJoinPool_ForkJoinWorkerThreadFactory0, (Thread.UncaughtExceptionHandler) null, true);
      Spider spider1 = spider0.setExecutorService(forkJoinPool0);
      assertTrue(spider1.isExitWhenComplete());
      assertTrue(spider1.isSpawnUrl());
      assertEquals(0L, spider1.getPageCount());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = new Spider(simplePageProcessor0);
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
  public void test24()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("us.codecraft.webmagic.samples.scheduler.DelayQueueScheduler$RequestWrapper");
      Spider spider0 = Spider.create(simplePageProcessor0);
      // Undeclared exception!
      try { 
        spider0.addUrl((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("]X?~");
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
  public void test26()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("Spider is already running!");
      Spider spider0 = Spider.create(simplePageProcessor0);
      // Undeclared exception!
      try { 
        spider0.getAll((Collection<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.utils.UrlUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
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
  public void test28()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("qPo;P)+yHj#=6D6OX");
      Spider spider0 = new Spider(simplePageProcessor0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "qPo;P)+yHj#=6D6OX";
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
  public void test29()  throws Throwable  {
      Spider spider0 = null;
      try {
        spider0 = new Spider((PageProcessor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("4nRz$FgXQg)(};]'[v");
      Spider spider0 = new Spider(simplePageProcessor0);
      String string0 = spider0.getUUID();
      assertTrue(spider0.isExitWhenComplete());
      assertTrue(spider0.isSpawnUrl());
      assertNull(string0);
      assertEquals(0L, spider0.getPageCount());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Spider.Status spider_Status0 = Spider.Status.fromValue(2);
      assertEquals(Spider.Status.Stopped, spider_Status0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = new Spider(simplePageProcessor0);
      spider0.setUUID("");
      String string0 = spider0.getUUID();
      assertTrue(spider0.isExitWhenComplete());
      assertEquals(0L, spider0.getPageCount());
      assertNotNull(string0);
      assertTrue(spider0.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("WV$&!Rko_OgZ!PAC");
      Spider spider0 = new Spider(simplePageProcessor0);
      int int0 = spider0.getThreadAlive();
      assertEquals(0, int0);
      assertTrue(spider0.isExitWhenComplete());
      assertEquals(0L, spider0.getPageCount());
      assertTrue(spider0.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("S%h_:nSaz=]MSWj:u+w");
      Spider spider0 = Spider.create(simplePageProcessor0);
      // Undeclared exception!
      try { 
        spider0.thread((ExecutorService) null, (-1987));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // threadNum should be more than one!
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("9~CQ");
      Spider spider0 = Spider.create(simplePageProcessor0);
      // Undeclared exception!
      try { 
        spider0.thread((-2413));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // threadNum should be more than one!
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("WV$&!Rko_OgZ!PAC");
      Spider spider0 = new Spider(simplePageProcessor0);
      spider0.stop();
      assertEquals(0L, spider0.getPageCount());
      assertTrue(spider0.isExitWhenComplete());
      assertEquals(Spider.Status.Init, spider0.getStatus());
      assertTrue(spider0.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("Stopped");
      Spider spider0 = Spider.create(simplePageProcessor0);
      Request[] requestArray0 = new Request[0];
      Spider spider1 = spider0.addRequest(requestArray0);
      assertTrue(spider1.isSpawnUrl());
      assertEquals(0L, spider1.getPageCount());
      assertTrue(spider1.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("qPo;P)+yHj#=6D6OX");
      Spider spider0 = new Spider(simplePageProcessor0);
      String[] stringArray0 = new String[2];
      // Undeclared exception!
      try { 
        spider0.addUrl(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ConcurrentHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("v'op\"J*&7s");
      Spider spider0 = new Spider(simplePageProcessor0);
      Request[] requestArray0 = new Request[9];
      Request request0 = new Request();
      requestArray0[0] = request0;
      // Undeclared exception!
      try { 
        spider0.addRequest(requestArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ConcurrentHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("zDNzR))4`");
      Spider spider0 = new Spider(simplePageProcessor0);
      Request[] requestArray0 = new Request[3];
      Request request0 = new Request("zDNzR))4`");
      requestArray0[0] = request0;
      // Undeclared exception!
      try { 
        spider0.addRequest(requestArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("us.codecraft.webmagic.utils.UrlUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("zDNzR))4`");
      Spider spider0 = new Spider(simplePageProcessor0);
      Request[] requestArray0 = new Request[3];
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
  public void test42()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
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
  public void test43()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("Thread interrupted when sleep");
      Spider spider0 = Spider.create(simplePageProcessor0);
      Page page0 = Page.fail();
      spider0.extractAndAddRequests(page0, false);
      assertTrue(spider0.isSpawnUrl());
      assertTrue(spider0.isExitWhenComplete());
      assertEquals(0L, spider0.getPageCount());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = new Spider(simplePageProcessor0);
      FileCacheQueueScheduler fileCacheQueueScheduler0 = new FileCacheQueueScheduler("Thread interrupted when sleep");
      Spider spider1 = spider0.scheduler(fileCacheQueueScheduler0);
      // Undeclared exception!
      try { 
        spider1.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.scheduler.FileCacheQueueScheduler", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("page status code error, page {} , code: {}");
      Spider spider0 = Spider.create(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("page status code error, page {} , code: {}", ":name=");
      spider0.setDownloader(phantomJSDownloader0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      spider0.getAll((Collection<String>) linkedList0);
      assertEquals(Spider.Status.Stopped, spider0.getStatus());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = new Spider(simplePageProcessor0);
      ForkJoinPool forkJoinPool0 = ForkJoinPool.commonPool();
      spider0.thread((ExecutorService) forkJoinPool0, 3);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("", "");
      Spider spider1 = spider0.downloader(phantomJSDownloader0);
      spider1.initComponent();
      assertTrue(spider1.isSpawnUrl());
      assertEquals(0L, spider1.getPageCount());
      assertTrue(spider1.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = new Spider(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("TnF", "]D@)");
      spider0.downloader(phantomJSDownloader0);
      Spider spider1 = spider0.thread((ExecutorService) null, 604);
      CountableThreadPool countableThreadPool0 = new CountableThreadPool(604, (ExecutorService) null);
      spider1.threadPool = countableThreadPool0;
      // Undeclared exception!
      try { 
        spider1.run();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.thread.CountableThreadPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = new Spider(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("TnF", "]D@)");
      spider0.downloader(phantomJSDownloader0);
      MultiPagePipeline multiPagePipeline0 = new MultiPagePipeline();
      spider0.addPipeline(multiPagePipeline0);
      spider0.run();
      assertEquals(Spider.Status.Stopped, spider0.getStatus());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("Init");
      Spider spider0 = new Spider(simplePageProcessor0);
      Locale locale0 = Locale.CHINA;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      // Undeclared exception!
      try { 
        spider0.getAll((Collection<String>) set0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/http/protocol/HttpContext
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("fwBr");
      Spider spider0 = Spider.create(simplePageProcessor0);
      QueueScheduler queueScheduler0 = new QueueScheduler();
      spider0.scheduler(queueScheduler0);
      Request request0 = new Request();
      queueScheduler0.pushWhenNoDuplicate(request0, spider0);
      // Undeclared exception!
      try { 
        spider0.setScheduler(queueScheduler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ConcurrentHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("OrO[>I\"8<L?$w\"");
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider spider1 = spider0.setScheduler((Scheduler) null);
      Spider spider2 = spider1.scheduler((Scheduler) null);
      assertTrue(spider2.isSpawnUrl());
      assertEquals(0L, spider2.getPageCount());
      assertTrue(spider2.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("page status code error, page {} , code: {}");
      Spider spider0 = Spider.create(simplePageProcessor0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Spider spider1 = spider0.startUrls(linkedList0);
      assertEquals(0L, spider1.getPageCount());
      assertTrue(spider1.isSpawnUrl());
      assertTrue(spider1.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("4RY<?xUK.W>a]07");
      Spider spider0 = new Spider(simplePageProcessor0);
      spider0.getSite();
      assertEquals(0L, spider0.getPageCount());
      assertTrue(spider0.isExitWhenComplete());
      assertTrue(spider0.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("OrO[>I\"8<L?$w\"");
      Spider spider0 = new Spider(simplePageProcessor0);
      List<SpiderListener> list0 = spider0.getSpiderListeners();
      assertTrue(spider0.isExitWhenComplete());
      assertEquals(0L, spider0.getPageCount());
      assertTrue(spider0.isSpawnUrl());
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("@");
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider spider1 = spider0.clearPipeline();
      assertTrue(spider1.isExitWhenComplete());
      assertEquals(0L, spider1.getPageCount());
      assertTrue(spider1.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("WV$&!Rko_OgZ!PAC");
      Spider spider0 = new Spider(simplePageProcessor0);
      boolean boolean0 = spider0.isExitWhenComplete();
      assertTrue(boolean0);
      assertTrue(spider0.isSpawnUrl());
      assertEquals(0L, spider0.getPageCount());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("OrO[>I\"8<L?$w\"");
      Spider spider0 = new Spider(simplePageProcessor0);
      spider0.sleep(3905);
      assertEquals(0L, spider0.getPageCount());
      assertTrue(spider0.isExitWhenComplete());
      assertTrue(spider0.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("@");
      Spider spider0 = new Spider(simplePageProcessor0);
      Page page0 = new Page();
      List<Request> list0 = page0.getTargetRequests();
      Spider spider1 = spider0.startRequest(list0);
      // Undeclared exception!
      try { 
        spider1.get("2yG");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("us.codecraft.webmagic.utils.UrlUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider spider1 = spider0.setExecutorService((ExecutorService) null);
      assertTrue(spider1.isSpawnUrl());
      assertTrue(spider1.isExitWhenComplete());
      assertEquals(0L, spider1.getPageCount());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("WV$&!Rko_OgZ!PAC");
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider spider1 = spider0.setExitWhenComplete(true);
      assertTrue(spider1.isSpawnUrl());
      assertTrue(spider0.isExitWhenComplete());
      assertEquals(0L, spider1.getPageCount());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("WV$&!Rko_OgZ!PAC");
      Spider spider0 = new Spider(simplePageProcessor0);
      long long0 = spider0.getPageCount();
      assertEquals(0L, long0);
      assertTrue(spider0.isExitWhenComplete());
      assertTrue(spider0.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("$VALUES");
      Spider spider0 = Spider.create(simplePageProcessor0);
      spider0.setEmptySleepTime(1);
      assertTrue(spider0.isSpawnUrl());
      assertTrue(spider0.isExitWhenComplete());
      assertEquals(0L, spider0.getPageCount());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("z15)O/yGNi&kZdcs ?");
      Spider spider0 = Spider.create(simplePageProcessor0);
      boolean boolean0 = spider0.isSpawnUrl();
      assertTrue(spider0.isExitWhenComplete());
      assertEquals(0L, spider0.getPageCount());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("WebMagic");
      Spider spider0 = new Spider(simplePageProcessor0);
      spider0.getCollectorPipeline();
      assertEquals(0L, spider0.getPageCount());
      assertTrue(spider0.isSpawnUrl());
      assertTrue(spider0.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("iE");
      Spider spider0 = new Spider(simplePageProcessor0);
      spider0.getStartTime();
      assertEquals(0L, spider0.getPageCount());
      assertTrue(spider0.isExitWhenComplete());
      assertTrue(spider0.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("@");
      Spider spider0 = new Spider(simplePageProcessor0);
      spider0.start();
      assertTrue(spider0.isExitWhenComplete());
      assertTrue(spider0.isSpawnUrl());
      assertEquals(Spider.Status.Init, spider0.getStatus());
      assertEquals(0L, spider0.getPageCount());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("WebMagic");
      Spider spider0 = new Spider(simplePageProcessor0);
      assertEquals(Spider.Status.Init, spider0.getStatus());
      
      Spider spider1 = spider0.setPipelines((List<Pipeline>) null);
      assertEquals(0L, spider1.getPageCount());
      assertTrue(spider1.isExitWhenComplete());
      assertTrue(spider1.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("WebMagic");
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider.Status spider_Status0 = spider0.getStatus();
      assertEquals(Spider.Status.Init, spider_Status0);
      assertEquals(0L, spider0.getPageCount());
      assertTrue(spider0.isExitWhenComplete());
      assertTrue(spider0.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("@");
      Spider spider0 = new Spider(simplePageProcessor0);
      String[] stringArray0 = new String[0];
      Spider spider1 = spider0.addUrl(stringArray0);
      assertEquals(Spider.Status.Init, spider1.getStatus());
      assertTrue(spider1.isSpawnUrl());
      assertTrue(spider1.isExitWhenComplete());
      assertEquals(0L, spider1.getPageCount());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider spider1 = spider0.setUUID("Thread interrupted when sleep");
      assertEquals(Spider.Status.Init, spider1.getStatus());
      assertTrue(spider1.isSpawnUrl());
      assertTrue(spider1.isExitWhenComplete());
      assertEquals(0L, spider1.getPageCount());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Spider.Status spider_Status0 = Spider.Status.fromValue(1887);
      assertEquals(Spider.Status.Init, spider_Status0);
  }
}
