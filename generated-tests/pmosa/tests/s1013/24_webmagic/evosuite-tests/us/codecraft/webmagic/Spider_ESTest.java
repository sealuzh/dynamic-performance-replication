/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 01:39:10 GMT 2018
 */

package us.codecraft.webmagic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.ObjectStreamConstants;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.junit.runner.RunWith;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.SpiderListener;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.downloader.PhantomJSDownloader;
import us.codecraft.webmagic.pipeline.JsonFilePipeline;
import us.codecraft.webmagic.pipeline.MultiPagePipeline;
import us.codecraft.webmagic.pipeline.Pipeline;
import us.codecraft.webmagic.pipeline.ResultItemsCollectorPipeline;
import us.codecraft.webmagic.processor.SimplePageProcessor;
import us.codecraft.webmagic.scheduler.DuplicateRemovedScheduler;
import us.codecraft.webmagic.scheduler.FileCacheQueueScheduler;
import us.codecraft.webmagic.scheduler.PriorityScheduler;
import us.codecraft.webmagic.scheduler.QueueScheduler;
import us.codecraft.webmagic.scheduler.Scheduler;
import us.codecraft.webmagic.scheduler.component.DuplicateRemover;
import us.codecraft.webmagic.scheduler.component.HashSetDuplicateRemover;
import us.codecraft.webmagic.selector.Json;
import us.codecraft.webmagic.thread.CountableThreadPool;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Spider_ESTest extends Spider_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("t");
      Spider spider0 = new Spider(simplePageProcessor0);
      QueueScheduler queueScheduler0 = new QueueScheduler();
      Spider spider1 = spider0.setScheduler(queueScheduler0);
      String string0 = spider0.getUUID();
      assertNull(string0);
      
      spider1.getStatus();
      assertTrue(spider1.isExitWhenComplete());
      assertEquals(0L, spider1.getPageCount());
      assertTrue(spider1.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Spider.Status spider_Status0 = Spider.Status.Running;
      spider_Status0.getValue();
      Spider.Status.fromValue(1);
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("Spider {} started!");
      Spider spider0 = new Spider(simplePageProcessor0);
      LinkedList<Pipeline> linkedList0 = new LinkedList<Pipeline>();
      spider0.setPipelines(linkedList0);
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
  public void test02()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("waitNewUrl - interrupted, error {}");
      Spider spider0 = new Spider(simplePageProcessor0);
      // Undeclared exception!
      try { 
        spider0.thread((-505));
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
      String string0 = "cGW";
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("cGW");
      Spider spider0 = new Spider(simplePageProcessor0);
      spider0.thread(516);
      String string1 = "";
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
  public void test04()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      SimplePageProcessor simplePageProcessor1 = new SimplePageProcessor("");
      Spider spider0 = new Spider(simplePageProcessor1);
      // Undeclared exception!
      try { 
        spider0.get("RD;!grVJ}XF{|m");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("us.codecraft.webmagic.utils.UrlUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("?)n~~cp0!Cqq!6i");
      Spider spider0 = new Spider(simplePageProcessor0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "?)n~~cp0!Cqq!6i";
      stringArray0[1] = "?)n~~cp0!Cqq!6i";
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
  public void test06()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("t");
      Spider spider0 = Spider.create(simplePageProcessor0);
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
  public void test07()  throws Throwable  {
      String string0 = "";
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = Spider.create(simplePageProcessor0);
      JsonFilePipeline jsonFilePipeline0 = new JsonFilePipeline("");
      Spider spider1 = spider0.pipeline(jsonFilePipeline0);
      PriorityScheduler priorityScheduler0 = new PriorityScheduler();
      Spider spider2 = spider1.scheduler(priorityScheduler0);
      Spider spider3 = spider2.setScheduler(priorityScheduler0);
      Spider spider4 = spider3.setPipelines((List<Pipeline>) null);
      boolean boolean0 = true;
      ResultItems resultItems0 = new ResultItems();
      ResultItems resultItems1 = resultItems0.setSkip(true);
      Request request0 = new Request();
      Request request1 = request0.setCharset("/");
      Request request2 = request1.setUrl("/");
      ResultItems resultItems2 = resultItems1.setRequest(request2);
      // Undeclared exception!
      try { 
        jsonFilePipeline0.process(resultItems2, spider4);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/codec/digest/DigestUtils
         //
         verifyException("us.codecraft.webmagic.pipeline.JsonFilePipeline", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("6L,xS$?-Y3V/r");
      Spider spider0 = new Spider(simplePageProcessor0);
      String string0 = spider0.getUUID();
      assertNull(string0);
      
      spider0.setEmptySleepTime(6);
      assertEquals(0L, spider0.getPageCount());
      assertTrue(spider0.isSpawnUrl());
      assertTrue(spider0.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("init cache scheduler success");
      Spider spider0 = Spider.create(simplePageProcessor0);
      assertTrue(spider0.isExitWhenComplete());
      
      Spider spider1 = spider0.setExitWhenComplete(false);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("init cache scheduler success", "");
      PhantomJSDownloader phantomJSDownloader1 = phantomJSDownloader0.setRetryNum(972);
      Spider spider2 = spider1.downloader(phantomJSDownloader1);
      spider2.getSite();
      assertFalse(spider0.isExitWhenComplete());
      assertEquals(0L, spider0.getPageCount());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = "P}Q_u";
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("P}Q_u");
      Spider spider0 = new Spider(simplePageProcessor0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      // Undeclared exception!
      try { 
        spider0.getAll((Collection<String>) linkedList0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/http/protocol/HttpContext
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("6=@GN(");
      Spider spider0 = Spider.create(simplePageProcessor0);
      Request[] requestArray0 = new Request[1];
      Request request0 = new Request();
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
  public void test12()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("k|bN\"!~lqJX,o");
      Spider spider0 = new Spider(simplePageProcessor0);
      String string0 = "d8Bg>XJ";
      Spider spider1 = spider0.setUUID("d8Bg>XJ");
      QueueScheduler queueScheduler0 = new QueueScheduler();
      Spider spider2 = spider1.setScheduler(queueScheduler0);
      spider2.isExitWhenComplete();
      Page page0 = Page.fail();
      boolean boolean0 = true;
      page0.setSkip(true);
      Json json0 = new Json("k|bN\"!~lqJX,o");
      page0.getJson();
      Class<Pipeline> class0 = Pipeline.class;
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
  public void test13()  throws Throwable  {
      Spider.Status.fromValue(2357);
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = new Spider(simplePageProcessor0);
      MultiPagePipeline multiPagePipeline0 = new MultiPagePipeline();
      Spider spider1 = spider0.addPipeline(multiPagePipeline0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("3", "/");
      Spider spider2 = spider1.setDownloader(phantomJSDownloader0);
      Spider spider3 = spider2.setSpawnUrl(true);
      Spider spider4 = spider3.setExitWhenComplete(true);
      spider4.setUUID("L5gHOR;muOM");
      Request request0 = new Request();
      Request request1 = request0.setPriority(2357);
      // Undeclared exception!
      try { 
        phantomJSDownloader0.download(request1, (Task) spider4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.downloader.PhantomJSDownloader", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = Spider.create(simplePageProcessor0);
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(39);
      Spider spider1 = spider0.setExecutorService(scheduledThreadPoolExecutor0);
      Spider spider2 = spider1.setExitWhenComplete(true);
      Spider spider3 = spider2.setSpawnUrl(true);
      List<SpiderListener> list0 = spider3.getSpiderListeners();
      assertNull(list0);
      
      Spider spider4 = spider3.setSpiderListeners((List<SpiderListener>) null);
      Spider spider5 = spider4.thread((ExecutorService) scheduledThreadPoolExecutor0, 39);
      assertEquals(0L, spider5.getPageCount());
      assertTrue(spider1.isExitWhenComplete());
      assertTrue(spider2.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = Spider.create(simplePageProcessor0);
      JsonFilePipeline jsonFilePipeline0 = new JsonFilePipeline("");
      spider0.sleep(393);
      Spider spider1 = spider0.addPipeline(jsonFilePipeline0);
      spider1.pipeline(jsonFilePipeline0);
      spider1.getThreadAlive();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "/";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "/";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "/";
      stringArray0[7] = "";
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
  public void test16()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("\"PaY)(U?oyG coBU`H&");
      Spider spider0 = new Spider(simplePageProcessor0);
      int int0 = spider0.getThreadAlive();
      assertEquals(0L, spider0.getPageCount());
      assertTrue(spider0.isExitWhenComplete());
      assertTrue(spider0.isSpawnUrl());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("6=@GN(");
      Spider spider0 = Spider.create(simplePageProcessor0);
      Request[] requestArray0 = new Request[1];
      Request request0 = new Request("6=@GN(");
      request0.setPriority((-3522L));
      request0.addHeader("t9yP29v#pmZ", "_cycle_tried_times");
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
  public void test18()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("6=@GN(");
      Spider spider0 = Spider.create(simplePageProcessor0);
      Request[] requestArray0 = new Request[1];
      Request request0 = new Request("6=@GN(");
      request0.setPriority((-3522L));
      Request request1 = new Request();
      requestArray0[0] = request1;
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
  public void test19()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("6L,xS$?-Y3V/r");
      Spider spider0 = new Spider(simplePageProcessor0);
      spider0.clearPipeline();
      String string0 = spider0.getUUID();
      assertNull(string0);
      
      spider0.setEmptySleepTime(6);
      assertTrue(spider0.isSpawnUrl());
      assertTrue(spider0.isExitWhenComplete());
      assertEquals(0L, spider0.getPageCount());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = "FA2$";
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("FA2$");
      Spider spider0 = Spider.create(simplePageProcessor0);
      QueueScheduler queueScheduler0 = new QueueScheduler();
      Spider spider1 = spider0.scheduler(queueScheduler0);
      Spider spider2 = spider1.setExitWhenComplete(false);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Spider spider3 = spider2.startUrls(linkedList0);
      ResultItemsCollectorPipeline resultItemsCollectorPipeline0 = new ResultItemsCollectorPipeline();
      spider3.addPipeline(resultItemsCollectorPipeline0);
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
  public void test21()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("abs:href");
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider spider1 = spider0.clearPipeline();
      String string0 = spider0.getUUID();
      assertNull(string0);
      
      spider1.start();
      assertEquals(0L, spider1.getPageCount());
      assertTrue(spider1.isExitWhenComplete());
      assertTrue(spider1.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("t");
      Spider spider0 = Spider.create(simplePageProcessor0);
      JsonFilePipeline jsonFilePipeline0 = new JsonFilePipeline("t");
      Spider spider1 = spider0.pipeline(jsonFilePipeline0);
      PriorityScheduler priorityScheduler0 = new PriorityScheduler();
      Spider spider2 = spider1.setScheduler(priorityScheduler0);
      Spider spider3 = spider2.setExitWhenComplete(true);
      String[] stringArray0 = new String[0];
      Spider spider4 = spider3.addUrl(stringArray0);
      Spider spider5 = spider4.clearPipeline();
      String[] stringArray1 = new String[7];
      stringArray1[0] = "t";
      stringArray1[1] = "t";
      stringArray1[2] = "t";
      Request[] requestArray0 = new Request[0];
      spider3.addRequest(requestArray0);
      stringArray1[3] = "t";
      stringArray1[4] = "/";
      stringArray1[5] = "t";
      stringArray1[6] = "/";
      // Undeclared exception!
      try { 
        spider5.test(stringArray1);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/http/protocol/HttpContext
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = Spider.create(simplePageProcessor0);
      JsonFilePipeline jsonFilePipeline0 = new JsonFilePipeline("");
      Spider spider1 = spider0.pipeline(jsonFilePipeline0);
      PriorityScheduler priorityScheduler0 = new PriorityScheduler();
      Spider spider2 = spider1.scheduler(priorityScheduler0);
      Spider spider3 = spider2.setScheduler(priorityScheduler0);
      Spider spider4 = spider3.setPipelines((List<Pipeline>) null);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("/", "");
      PhantomJSDownloader phantomJSDownloader1 = phantomJSDownloader0.setRetryNum(5);
      Spider spider5 = spider4.downloader(phantomJSDownloader1);
      spider5.runAsync();
      ResultItems resultItems0 = new ResultItems();
      resultItems0.setSkip(true);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "/";
      // Undeclared exception!
      try { 
        spider3.test(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("t");
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider spider1 = new Spider(simplePageProcessor0);
      LinkedList<Request> linkedList0 = new LinkedList<Request>();
      List<SpiderListener> list0 = spider0.getSpiderListeners();
      assertNull(list0);
      
      spider0.setSpiderListeners((List<SpiderListener>) null);
      int int0 = MockThread.MIN_PRIORITY;
      long long0 = spider0.getPageCount();
      assertEquals(0L, long0);
      assertTrue(spider0.isSpawnUrl());
      assertTrue(spider0.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = new Spider(simplePageProcessor0);
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
  public void test26()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("Reques{url=");
      Spider spider0 = new Spider(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("", "r,FTu&xk{q");
      Spider spider1 = spider0.setDownloader(phantomJSDownloader0);
      assertTrue(spider1.isExitWhenComplete());
      
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      spider1.getAll((Collection<String>) linkedHashSet0);
      String[] stringArray0 = new String[0];
      spider1.test(stringArray0);
      assertEquals(0L, spider1.getPageCount());
      assertTrue(spider1.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = Spider.create(simplePageProcessor0);
      JsonFilePipeline jsonFilePipeline0 = new JsonFilePipeline("");
      Spider spider1 = spider0.pipeline(jsonFilePipeline0);
      PriorityScheduler priorityScheduler0 = new PriorityScheduler();
      Spider spider2 = spider1.scheduler(priorityScheduler0);
      Spider spider3 = spider2.setScheduler(priorityScheduler0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("/", "");
      PhantomJSDownloader phantomJSDownloader1 = phantomJSDownloader0.setRetryNum(5);
      Spider spider4 = spider3.downloader(phantomJSDownloader1);
      spider4.runAsync();
      ResultItems resultItems0 = new ResultItems();
      resultItems0.setSkip(true);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "/";
      // Undeclared exception!
      try { 
        spider3.test(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("Reques{url=");
      Spider spider0 = new Spider(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("Reques{url=", "");
      Spider spider1 = spider0.setSpawnUrl(true);
      PhantomJSDownloader phantomJSDownloader1 = new PhantomJSDownloader("Reques{url=", "");
      spider1.downloader(phantomJSDownloader1);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      // Undeclared exception!
      try { 
        spider1.test(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = Spider.create(simplePageProcessor0);
      JsonFilePipeline jsonFilePipeline0 = new JsonFilePipeline("");
      Spider spider1 = spider0.pipeline(jsonFilePipeline0);
      PriorityScheduler priorityScheduler0 = new PriorityScheduler();
      Spider spider2 = spider1.scheduler(priorityScheduler0);
      Spider spider3 = spider2.setScheduler(priorityScheduler0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("/", "");
      PhantomJSDownloader phantomJSDownloader1 = phantomJSDownloader0.setRetryNum(5);
      Spider spider4 = spider3.downloader(phantomJSDownloader1);
      spider2.runAsync();
      ResultItems resultItems0 = new ResultItems();
      resultItems0.setSkip(false);
      String[] stringArray0 = new String[0];
      spider4.test(stringArray0);
      spider0.test(stringArray0);
      assertTrue(spider0.isExitWhenComplete());
      assertEquals(0L, spider0.getPageCount());
      assertTrue(spider0.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = Spider.create(simplePageProcessor0);
      JsonFilePipeline jsonFilePipeline0 = new JsonFilePipeline("");
      Spider spider1 = spider0.setUUID("");
      PriorityScheduler priorityScheduler0 = new PriorityScheduler();
      Spider spider2 = spider1.scheduler(priorityScheduler0);
      Spider spider3 = spider2.setScheduler(priorityScheduler0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("/", "");
      PhantomJSDownloader phantomJSDownloader1 = phantomJSDownloader0.setRetryNum(5);
      Spider spider4 = spider3.downloader(phantomJSDownloader1);
      spider4.runAsync();
      ResultItems resultItems0 = new ResultItems();
      resultItems0.setSkip(true);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "/";
      // Undeclared exception!
      try { 
        spider3.test(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("FA2$");
      Spider spider0 = Spider.create(simplePageProcessor0);
      Spider.create(simplePageProcessor0);
      Page page0 = Page.fail();
      List<Request> list0 = page0.getTargetRequests();
      Spider spider1 = spider0.startRequest(list0);
      ForkJoinTask.getPool();
      Spider spider2 = spider1.setExecutorService((ExecutorService) null);
      assertTrue(spider2.isSpawnUrl());
      
      spider1.setSpawnUrl(false);
      Spider spider3 = spider2.setExecutorService((ExecutorService) null);
      spider3.extractAndAddRequests(page0, false);
      assertFalse(spider2.isSpawnUrl());
      assertFalse(spider0.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("task or site can not be null");
      Spider spider0 = Spider.create(simplePageProcessor0);
      Spider spider1 = spider0.setSpiderListeners((List<SpiderListener>) null);
      spider1.isSpawnUrl();
      spider1.clearPipeline();
      Spider.Status spider_Status0 = Spider.Status.fromValue(41);
      assertEquals(Spider.Status.Init, spider_Status0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("t");
      Spider spider0 = Spider.create(simplePageProcessor0);
      FileCacheQueueScheduler fileCacheQueueScheduler0 = new FileCacheQueueScheduler("");
      DuplicateRemover duplicateRemover0 = fileCacheQueueScheduler0.getDuplicateRemover();
      DuplicateRemovedScheduler duplicateRemovedScheduler0 = fileCacheQueueScheduler0.setDuplicateRemover(duplicateRemover0);
      Spider spider1 = spider0.scheduler(duplicateRemovedScheduler0);
      DuplicateRemovedScheduler duplicateRemovedScheduler1 = fileCacheQueueScheduler0.setDuplicateRemover(duplicateRemover0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("Jv)f4k", "");
      Spider spider2 = spider1.setDownloader(phantomJSDownloader0);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      List<SpiderListener> list0 = spider2.getAll((Collection<String>) linkedHashSet0);
      Spider spider3 = spider1.setSpiderListeners(list0);
      Spider spider4 = spider3.setScheduler(duplicateRemovedScheduler1);
      String[] stringArray0 = new String[1];
      Spider spider5 = spider4.addUrl(stringArray0);
      List<Pipeline> list1 = spider5.getAll((Collection<String>) linkedHashSet0);
      spider0.setPipelines(list1);
      assertEquals(1L, spider2.getPageCount());
      assertEquals(1L, spider0.getPageCount());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("#");
      Spider spider0 = Spider.create(simplePageProcessor0);
      LinkedList<SpiderListener> linkedList0 = new LinkedList<SpiderListener>();
      Spider spider1 = spider0.setSpiderListeners(linkedList0);
      FileCacheQueueScheduler fileCacheQueueScheduler0 = new FileCacheQueueScheduler("DV5xT_sBKgT");
      HashSetDuplicateRemover hashSetDuplicateRemover0 = new HashSetDuplicateRemover();
      DuplicateRemovedScheduler duplicateRemovedScheduler0 = fileCacheQueueScheduler0.setDuplicateRemover(hashSetDuplicateRemover0);
      spider1.scheduler = (Scheduler) duplicateRemovedScheduler0;
      hashSetDuplicateRemover0.resetDuplicateCheck(spider0);
      spider0.destroyWhenExit = false;
      Request[] requestArray0 = new Request[0];
      Spider spider2 = spider0.addRequest(requestArray0);
      int int0 = 2299;
      spider1.sleep(2299);
      Spider spider3 = spider2.setSpiderListeners(linkedList0);
      spider3.clearPipeline();
      spider3.stop();
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
  public void test35()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = Spider.create(simplePageProcessor0);
      FileCacheQueueScheduler fileCacheQueueScheduler0 = new FileCacheQueueScheduler("init file error");
      DuplicateRemover duplicateRemover0 = fileCacheQueueScheduler0.getDuplicateRemover();
      fileCacheQueueScheduler0.setDuplicateRemover(duplicateRemover0);
      Spider spider1 = spider0.scheduler(fileCacheQueueScheduler0);
      DuplicateRemovedScheduler duplicateRemovedScheduler0 = fileCacheQueueScheduler0.setDuplicateRemover(duplicateRemover0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("", "");
      Spider spider2 = spider1.setDownloader(phantomJSDownloader0);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      List<SpiderListener> list0 = spider0.getAll((Collection<String>) linkedHashSet0);
      LinkedList<SpiderListener> linkedList0 = new LinkedList<SpiderListener>();
      Spider spider3 = spider0.setSpiderListeners(linkedList0);
      Spider spider4 = spider2.setScheduler(duplicateRemovedScheduler0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[0] = "Jv)f4k";
      List<Pipeline> list1 = spider3.getAll((Collection<String>) linkedHashSet0);
      spider1.setPipelines(list1);
      spider4.getThreadAlive();
      spider3.setSpiderListeners(list0);
      Spider.Status spider_Status0 = Spider.Status.fromValue(0);
      assertEquals(Spider.Status.Init, spider_Status0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = Spider.create(simplePageProcessor0);
      JsonFilePipeline jsonFilePipeline0 = new JsonFilePipeline("");
      PriorityScheduler priorityScheduler0 = new PriorityScheduler();
      Spider spider1 = spider0.scheduler(priorityScheduler0);
      Spider spider2 = spider1.setScheduler(priorityScheduler0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("/", "");
      PhantomJSDownloader phantomJSDownloader1 = phantomJSDownloader0.setRetryNum(5);
      Spider spider3 = spider2.downloader(phantomJSDownloader1);
      spider3.runAsync();
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      spider0.getScheduler();
      assertTrue(spider0.isExitWhenComplete());
      
      spider2.downloader(phantomJSDownloader1);
      Spider spider4 = spider1.setUUID("");
      assertTrue(spider4.isSpawnUrl());
      assertEquals(0L, spider4.getPageCount());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("t");
      Spider spider0 = Spider.create(simplePageProcessor0);
      FileCacheQueueScheduler fileCacheQueueScheduler0 = new FileCacheQueueScheduler("");
      fileCacheQueueScheduler0.getDuplicateRemover();
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("phantomjs", "");
      LinkedList<Request> linkedList0 = new LinkedList<Request>();
      Spider spider1 = spider0.startRequest(linkedList0);
      spider1.setSpawnUrl(false);
      PhantomJSDownloader phantomJSDownloader1 = new PhantomJSDownloader("", "'v0ME,I=65Wr5e");
      spider0.downloader(phantomJSDownloader1);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      stringArray0[1] = "cve";
      stringArray0[2] = "";
      stringArray0[3] = "'v0ME,I=65Wr5e";
      stringArray0[4] = "'v0ME,I=65Wr5e";
      // Undeclared exception!
      try { 
        spider1.test(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}