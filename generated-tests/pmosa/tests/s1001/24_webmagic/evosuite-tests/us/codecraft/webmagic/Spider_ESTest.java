/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 16 17:32:44 GMT 2018
 */

package us.codecraft.webmagic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.SpiderListener;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.downloader.Downloader;
import us.codecraft.webmagic.downloader.PhantomJSDownloader;
import us.codecraft.webmagic.monitor.SpiderMonitor;
import us.codecraft.webmagic.pipeline.CollectorPipeline;
import us.codecraft.webmagic.pipeline.FilePipeline;
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
import us.codecraft.webmagic.scheduler.component.DuplicateRemover;
import us.codecraft.webmagic.scheduler.component.HashSetDuplicateRemover;
import us.codecraft.webmagic.selector.AndSelector;
import us.codecraft.webmagic.selector.Json;
import us.codecraft.webmagic.selector.JsonPathSelector;
import us.codecraft.webmagic.selector.OrSelector;
import us.codecraft.webmagic.selector.RegexSelector;
import us.codecraft.webmagic.selector.Selector;
import us.codecraft.webmagic.selector.SmartContentSelector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Spider_ESTest extends Spider_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(" stop fail!");
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
  public void test01()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("omit-xml-declaration");
      Spider spider0 = Spider.create(simplePageProcessor0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "omit-xml-declaration";
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
  public void test02()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("8,=9IAzQ%mGUz");
      ResultItemsCollectorPipeline resultItemsCollectorPipeline0 = new ResultItemsCollectorPipeline();
      Spider spider0 = Spider.create(simplePageProcessor0);
      Spider spider1 = spider0.pipeline(resultItemsCollectorPipeline0);
      assertTrue(spider1.isSpawnUrl());
      assertTrue(spider1.isExitWhenComplete());
      assertEquals(0L, spider1.getPageCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = Spider.create(simplePageProcessor0);
      Spider spider1 = spider0.startRequest((List<Request>) null);
      String string0 = "";
      Spider spider2 = spider1.setUUID("");
      int int0 = 2;
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      PriorityBlockingQueue<Runnable> priorityBlockingQueue0 = new PriorityBlockingQueue<Runnable>();
      LinkedBlockingQueue<Runnable> linkedBlockingQueue0 = new LinkedBlockingQueue<Runnable>(priorityBlockingQueue0);
      ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(2, 2, 2, timeUnit0, linkedBlockingQueue0);
      spider2.setExecutorService(threadPoolExecutor0);
      Selector[] selectorArray0 = new Selector[4];
      OrSelector orSelector0 = new OrSelector(selectorArray0);
      selectorArray0[0] = (Selector) orSelector0;
      SmartContentSelector smartContentSelector0 = new SmartContentSelector();
      selectorArray0[1] = (Selector) smartContentSelector0;
      RegexSelector regexSelector0 = null;
      try {
        regexSelector0 = new RegexSelector("", (-1));
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("us.codecraft.webmagic.selector.RegexSelector", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Spider.Status.fromValue((-565));
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("~JTm~VKB_)FLWNiDxj/");
      Spider spider0 = new Spider(simplePageProcessor0);
      spider0.checkIfRunning();
      spider0.getScheduler();
      spider0.runAsync();
      assertTrue(spider0.isSpawnUrl());
      assertTrue(spider0.isExitWhenComplete());
      assertEquals(0L, spider0.getPageCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("@`7b*MY53tZ|l$FeY");
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider spider1 = spider0.setSpawnUrl(true);
      QueueScheduler queueScheduler0 = new QueueScheduler();
      Spider spider2 = spider1.scheduler(queueScheduler0);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "@`7b*MY53tZ|l$FeY";
      stringArray0[1] = "@`7b*MY53tZ|l$FeY";
      stringArray0[2] = "/V0'C\"dN(iV+";
      stringArray0[3] = "@`7b*MY53tZ|l$FeY";
      stringArray0[4] = "@`7b*MY53tZ|l$FeY";
      // Undeclared exception!
      try { 
        spider2.addUrl(stringArray0);
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
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = Spider.create(simplePageProcessor0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "";
      // Undeclared exception!
      try { 
        spider0.test(stringArray0);
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
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("1");
      Spider spider0 = Spider.create(simplePageProcessor0);
      Spider spider1 = spider0.clearPipeline();
      Spider spider2 = spider1.setPipelines((List<Pipeline>) null);
      Json json0 = new Json((String) null);
      Class<SpiderListener> class0 = SpiderListener.class;
      json0.toList(class0);
      Spider spider3 = spider2.setSpiderListeners((List<SpiderListener>) null);
      ForkJoinPool.ForkJoinWorkerThreadFactory forkJoinPool_ForkJoinWorkerThreadFactory0 = mock(ForkJoinPool.ForkJoinWorkerThreadFactory.class, new ViolatedAssumptionAnswer());
      ThreadGroup threadGroup0 = new ThreadGroup("1");
      ForkJoinPool forkJoinPool0 = new ForkJoinPool(30000, forkJoinPool_ForkJoinWorkerThreadFactory0, threadGroup0, true);
      Spider spider4 = spider3.setExecutorService(forkJoinPool0);
      assertTrue(spider4.isSpawnUrl());
      assertTrue(spider4.isExitWhenComplete());
      assertEquals(0L, spider4.getPageCount());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("omi-xm-declaration");
      Spider spider0 = Spider.create(simplePageProcessor0);
      spider0.thread(1925);
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
  public void test09()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider spider1 = spider0.setExitWhenComplete(false);
      PriorityScheduler priorityScheduler0 = new PriorityScheduler();
      spider1.scheduler = (Scheduler) priorityScheduler0;
      // Undeclared exception!
      try { 
        spider1.thread(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // threadNum should be more than one!
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = Spider.create(simplePageProcessor0);
      spider0.stop();
      assertEquals(0L, spider0.getPageCount());
      assertTrue(spider0.isExitWhenComplete());
      assertTrue(spider0.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("Mi~yASP");
      Spider spider0 = new Spider(simplePageProcessor0);
      SpiderMonitor spiderMonitor0 = SpiderMonitor.instance();
      SpiderMonitor.MonitorSpiderListener spiderMonitor_MonitorSpiderListener0 = spiderMonitor0.new MonitorSpiderListener();
      List<String> list0 = spiderMonitor_MonitorSpiderListener0.getErrorUrls();
      spider0.startUrls(list0);
      Spider spider1 = spider0.scheduler((Scheduler) null);
      SimplePageProcessor simplePageProcessor1 = new SimplePageProcessor("ePTe>|4`<E8U`?Q^]5");
      Spider.create(simplePageProcessor1);
      spider1.getThreadAlive();
      PhantomJSDownloader phantomJSDownloader0 = null;
      try {
        phantomJSDownloader0 = new PhantomJSDownloader("ePTe>|4`<E8U`?Q^]5");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("h|GA\";z8%<sFB#R.");
      Spider spider0 = Spider.create(simplePageProcessor0);
      spider0.getThreadAlive();
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
  public void test13()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("Init");
      Spider spider0 = Spider.create(simplePageProcessor0);
      Request[] requestArray0 = new Request[1];
      requestArray0[0] = null;
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
  public void test14()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("n)'.An*ii7pX}");
      Spider spider0 = Spider.create(simplePageProcessor0);
      Spider spider1 = spider0.clearPipeline();
      Spider spider2 = spider1.setExitWhenComplete(true);
      String[] stringArray0 = new String[0];
      Spider spider3 = spider2.addUrl(stringArray0);
      ForkJoinPool forkJoinPool0 = new ForkJoinPool();
      Spider spider4 = spider3.thread((ExecutorService) forkJoinPool0, 30000);
      FileCacheQueueScheduler fileCacheQueueScheduler0 = new FileCacheQueueScheduler("y>");
      Spider spider5 = spider4.scheduler(fileCacheQueueScheduler0);
      spider5.runAsync();
      assertTrue(spider5.isSpawnUrl());
      assertTrue(spider1.isExitWhenComplete());
      assertEquals(0L, spider5.getPageCount());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("Get leftPageCount fail, try to use a Scheduler implement MonitorableScheduler for monitor count!");
      Spider spider0 = new Spider(simplePageProcessor0);
      ForkJoinTask.getPool();
      // Undeclared exception!
      try { 
        spider0.thread((ExecutorService) null, (-1120));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // threadNum should be more than one!
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("-");
      Spider spider0 = Spider.create(simplePageProcessor0);
      Spider spider1 = spider0.setExitWhenComplete(false);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("xs[U*OJm`Xh-5s", "");
      Spider spider2 = spider1.downloader(phantomJSDownloader0);
      LinkedList<Request> linkedList0 = new LinkedList<Request>();
      Spider spider3 = spider2.startRequest(linkedList0);
      FileCacheQueueScheduler fileCacheQueueScheduler0 = new FileCacheQueueScheduler("xs[U*OJm`Xh-5s");
      spider3.scheduler(fileCacheQueueScheduler0);
      AndSelector andSelector0 = new AndSelector((List<Selector>) null);
      // Undeclared exception!
      try { 
        andSelector0.selectList("xs[U*OJm`Xh-5s");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.selector.AndSelector", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = "";
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider spider1 = spider0.thread(1359);
      QueueScheduler queueScheduler0 = new QueueScheduler();
      Spider spider2 = spider1.scheduler(queueScheduler0);
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      LinkedBlockingQueue<Runnable> linkedBlockingQueue0 = new LinkedBlockingQueue<Runnable>();
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(0, 30000, 1358L, timeUnit0, linkedBlockingQueue0, threadFactory0);
      spider2.setExecutorService(threadPoolExecutor0);
      String string1 = "q";
      JsonPathSelector jsonPathSelector0 = null;
      try {
        jsonPathSelector0 = new JsonPathSelector("q");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/jayway/jsonpath/Predicate
         //
         verifyException("us.codecraft.webmagic.selector.JsonPathSelector", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = " stop fail!";
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(" stop fail!");
      Spider spider0 = Spider.create(simplePageProcessor0);
      FileCacheQueueScheduler fileCacheQueueScheduler0 = new FileCacheQueueScheduler(" stop fail!");
      HashSetDuplicateRemover hashSetDuplicateRemover0 = new HashSetDuplicateRemover();
      DuplicateRemovedScheduler duplicateRemovedScheduler0 = fileCacheQueueScheduler0.setDuplicateRemover(hashSetDuplicateRemover0);
      spider0.setScheduler(duplicateRemovedScheduler0);
      // Undeclared exception!
      try { 
        spider0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.scheduler.FileCacheQueueScheduler", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("s+");
      Spider spider0 = new Spider(simplePageProcessor0);
      ResultItemsCollectorPipeline resultItemsCollectorPipeline0 = new ResultItemsCollectorPipeline();
      Spider spider1 = spider0.addPipeline(resultItemsCollectorPipeline0);
      Site site0 = simplePageProcessor0.getSite();
      Site site1 = site0.setTimeOut(0);
      Site site2 = site1.setDisableCookieManagement(true);
      Site site3 = site2.addCookie("I8l6>nry", (String) null, "I8l6>nry");
      spider1.site = site3;
      Request request0 = new Request();
      Spider spider2 = Spider.create(simplePageProcessor0);
      spider1.sleep(5);
      spider2.getStartTime();
      assertEquals(0L, spider2.getPageCount());
      assertTrue(spider2.isExitWhenComplete());
      assertTrue(spider2.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = new Spider(simplePageProcessor0);
      spider0.getSpiderListeners();
      Spider spider1 = spider0.setSpiderListeners((List<SpiderListener>) null);
      Spider spider2 = spider1.setUUID("FF%/P_tZ@UZt4jc+");
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(1359, threadFactory0);
      Spider spider3 = spider2.setExecutorService(scheduledThreadPoolExecutor0);
      Spider spider4 = spider3.setExitWhenComplete(false);
      Request[] requestArray0 = new Request[3];
      Request request0 = new Request();
      Request request1 = request0.setPriority(1359);
      Request request2 = request1.setMethod("");
      ResultItems resultItems0 = new ResultItems();
      Map<String, Object> map0 = resultItems0.getAll();
      Request request3 = request2.setExtras(map0);
      requestArray0[0] = request3;
      Request request4 = request3.putExtra("_cycle_tried_times", "");
      requestArray0[1] = request4;
      Request request5 = request3.putExtra("_cycle_tried_times", request2);
      requestArray0[2] = request5;
      Spider spider5 = spider4.addRequest(requestArray0);
      // Undeclared exception!
      try { 
        spider5.onError(request4);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/collections/CollectionUtils
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("9V%*U");
      Spider spider0 = Spider.create(simplePageProcessor0);
      Page page0 = Page.fail();
      spider0.extractAndAddRequests(page0, false);
      assertEquals(0L, spider0.getPageCount());
      assertTrue(spider0.isExitWhenComplete());
      assertTrue(spider0.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("Wrb=-8#gr)8Nw&");
      Spider spider0 = new Spider(simplePageProcessor0);
      LinkedList<Pipeline> linkedList0 = new LinkedList<Pipeline>();
      String string0 = "I6>nry";
      Site site0 = spider0.getSite();
      Site site1 = site0.addCookie("mg(KjU_|o?", (String) null, "Init");
      Set<Integer> set0 = site1.getAcceptStatCode();
      Site site2 = site1.setAcceptStatCode(set0);
      Site site3 = site2.setCharset("Wrb=-8#gr)8Nw&");
      Site site4 = site3.setCycleRetryTimes(3837);
      site4.setRetrySleepTime(3837);
      FileCacheQueueScheduler fileCacheQueueScheduler0 = new FileCacheQueueScheduler("1");
      DuplicateRemover duplicateRemover0 = fileCacheQueueScheduler0.getDuplicateRemover();
      DuplicateRemovedScheduler duplicateRemovedScheduler0 = fileCacheQueueScheduler0.setDuplicateRemover(duplicateRemover0);
      spider0.scheduler(duplicateRemovedScheduler0);
      Request request0 = new Request();
      // Undeclared exception!
      try { 
        spider0.onSuccess(request0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/collections/CollectionUtils
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("Mi~yASP");
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider spider1 = spider0.scheduler((Scheduler) null);
      FileCacheQueueScheduler fileCacheQueueScheduler0 = new FileCacheQueueScheduler("Mi~yASP");
      DuplicateRemover duplicateRemover0 = fileCacheQueueScheduler0.getDuplicateRemover();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      fileCacheQueueScheduler0.setDuplicateRemover(duplicateRemover0);
      Spider spider2 = spider1.setScheduler((Scheduler) null);
      assertTrue(spider2.isSpawnUrl());
      assertEquals(0L, spider2.getPageCount());
      assertTrue(spider2.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(" stop fail!");
      Spider spider0 = Spider.create(simplePageProcessor0);
      FileCacheQueueScheduler fileCacheQueueScheduler0 = new FileCacheQueueScheduler(" stop fail!");
      HashSetDuplicateRemover hashSetDuplicateRemover0 = new HashSetDuplicateRemover();
      DuplicateRemovedScheduler duplicateRemovedScheduler0 = fileCacheQueueScheduler0.setDuplicateRemover(hashSetDuplicateRemover0);
      Spider spider1 = spider0.setScheduler(duplicateRemovedScheduler0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "$VALUES";
      spider1.getStatus();
      assertTrue(spider1.isSpawnUrl());
      assertEquals(0L, spider1.getPageCount());
      assertTrue(spider1.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      String string0 = "U";
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("U");
      Spider spider0 = Spider.create(simplePageProcessor0);
      spider0.getScheduler();
      spider0.start();
      OrSelector orSelector0 = new OrSelector((List<Selector>) null);
      // Undeclared exception!
      try { 
        orSelector0.selectList("threadNum should be more than one!");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.selector.OrSelector", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("8,=9IAzQBmGUz");
      Spider spider0 = Spider.create(simplePageProcessor0);
      boolean boolean0 = spider0.isSpawnUrl();
      assertTrue(boolean0);
      assertEquals(0L, spider0.getPageCount());
      assertTrue(spider0.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("PPK$XkfB77B5.pZmB&");
      Spider spider0 = Spider.create(simplePageProcessor0);
      Spider spider1 = spider0.setExitWhenComplete(true);
      boolean boolean0 = spider1.isExitWhenComplete();
      assertTrue(spider1.isSpawnUrl());
      assertEquals(0L, spider1.getPageCount());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(" stop fail!");
      Spider spider0 = Spider.create(simplePageProcessor0);
      Page page0 = Page.fail();
      spider0.setEmptySleepTime(807);
      Page page1 = page0.setRawText("t");
      Page page2 = page1.setSkip(true);
      // Undeclared exception!
      try { 
        simplePageProcessor0.process(page2);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/jsoup/nodes/Node
         //
         verifyException("us.codecraft.webmagic.Page", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("K$");
      Spider spider0 = Spider.create(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("K$", " stop fail!");
      spider0.setDownloader(phantomJSDownloader0);
      LinkedBlockingDeque<String> linkedBlockingDeque0 = new LinkedBlockingDeque<String>();
      spider0.getAll((Collection<String>) linkedBlockingDeque0);
      MultiPagePipeline multiPagePipeline0 = new MultiPagePipeline();
      spider0.clearPipeline();
      String[] stringArray0 = new String[3];
      stringArray0[0] = " stop fail!";
      stringArray0[1] = "K$";
      stringArray0[2] = "K$";
      // Undeclared exception!
      try { 
        spider0.test(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("K$");
      Spider spider0 = Spider.create(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("K$", " stop fail!");
      Spider spider1 = spider0.setDownloader(phantomJSDownloader0);
      LinkedBlockingDeque<String> linkedBlockingDeque0 = new LinkedBlockingDeque<String>();
      List<SpiderListener> list0 = spider0.getAll((Collection<String>) linkedBlockingDeque0);
      Spider spider2 = spider1.setSpiderListeners(list0);
      FileCacheQueueScheduler fileCacheQueueScheduler0 = new FileCacheQueueScheduler("us.codecraft.webmagic.Spider$Status");
      FileSystemHandling.shouldAllThrowIOExceptions();
      HashSetDuplicateRemover hashSetDuplicateRemover0 = new HashSetDuplicateRemover();
      DuplicateRemovedScheduler duplicateRemovedScheduler0 = fileCacheQueueScheduler0.setDuplicateRemover(hashSetDuplicateRemover0);
      spider0.setScheduler(duplicateRemovedScheduler0);
      FilePipeline filePipeline0 = new FilePipeline("");
      filePipeline0.getFile("M:");
      Spider spider3 = spider2.addPipeline(filePipeline0);
      spider3.getPageCount();
      String[] stringArray0 = new String[3];
      stringArray0[0] = " stop fail!";
      stringArray0[1] = "";
      stringArray0[2] = "K$";
      // Undeclared exception!
      try { 
        spider2.test(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("K$");
      Spider spider0 = Spider.create(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("K$", " dtop fail$");
      Spider spider1 = spider0.setDownloader(phantomJSDownloader0);
      assertTrue(spider1.isExitWhenComplete());
      
      LinkedBlockingDeque<String> linkedBlockingDeque0 = new LinkedBlockingDeque<String>();
      linkedBlockingDeque0.clear();
      List<SpiderListener> list0 = spider0.getAll((Collection<String>) linkedBlockingDeque0);
      spider1.setSpiderListeners(list0);
      spider0.getThreadAlive();
      spider0.run();
      spider1.getStartTime();
      spider0.run();
      assertEquals(0L, spider0.getPageCount());
      assertTrue(spider0.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("K$");
      String string0 = "";
      String string1 = "";
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("", "");
      Spider spider0 = Spider.create(simplePageProcessor0);
      SpiderMonitor spiderMonitor0 = SpiderMonitor.instance();
      SpiderMonitor.MonitorSpiderListener spiderMonitor_MonitorSpiderListener0 = spiderMonitor0.new MonitorSpiderListener();
      List<String> list0 = spiderMonitor_MonitorSpiderListener0.getErrorUrls();
      Spider spider1 = spider0.startUrls(list0);
      FileCacheQueueScheduler fileCacheQueueScheduler0 = new FileCacheQueueScheduler(" stop fail!");
      HashSetDuplicateRemover hashSetDuplicateRemover0 = new HashSetDuplicateRemover();
      DuplicateRemovedScheduler duplicateRemovedScheduler0 = fileCacheQueueScheduler0.setDuplicateRemover(hashSetDuplicateRemover0);
      Spider spider2 = spider1.scheduler(duplicateRemovedScheduler0);
      spider2.setDownloader(phantomJSDownloader0);
      LinkedBlockingDeque<String> linkedBlockingDeque0 = new LinkedBlockingDeque<String>();
      List<SpiderListener> list1 = spider0.getAll((Collection<String>) list0);
      Spider spider3 = spider2.setSpiderListeners(list1);
      Spider.create(simplePageProcessor0);
      // Undeclared exception!
      try { 
        spider3.extractAndAddRequests((Page) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("K$");
      Spider spider0 = Spider.create(simplePageProcessor0);
      SimplePageProcessor simplePageProcessor1 = new SimplePageProcessor("K$");
      Spider spider1 = Spider.create(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("K$", "K$");
      Spider spider2 = spider1.setDownloader(phantomJSDownloader0);
      LinkedBlockingDeque<String> linkedBlockingDeque0 = new LinkedBlockingDeque<String>();
      spider2.getAll((Collection<String>) linkedBlockingDeque0);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      MultiPagePipeline multiPagePipeline0 = new MultiPagePipeline();
      Spider spider3 = spider2.addPipeline(multiPagePipeline0);
      String[] stringArray0 = new String[0];
      spider3.test(stringArray0);
      spider0.setUUID("K$");
      Spider spider4 = spider3.setDownloader(phantomJSDownloader0);
      assertTrue(spider2.isSpawnUrl());
      assertEquals(0L, spider4.getPageCount());
  }
}