/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 10:57:16 GMT 2018
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
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
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
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.downloader.PhantomJSDownloader;
import us.codecraft.webmagic.pipeline.CollectorPipeline;
import us.codecraft.webmagic.pipeline.FilePipeline;
import us.codecraft.webmagic.pipeline.JsonFilePipeline;
import us.codecraft.webmagic.pipeline.Pipeline;
import us.codecraft.webmagic.processor.SimplePageProcessor;
import us.codecraft.webmagic.scheduler.DuplicateRemovedScheduler;
import us.codecraft.webmagic.scheduler.FileCacheQueueScheduler;
import us.codecraft.webmagic.scheduler.PriorityScheduler;
import us.codecraft.webmagic.scheduler.QueueScheduler;
import us.codecraft.webmagic.scheduler.Scheduler;
import us.codecraft.webmagic.scheduler.component.HashSetDuplicateRemover;
import us.codecraft.webmagic.selector.OrSelector;
import us.codecraft.webmagic.selector.Selector;
import us.codecraft.webmagic.thread.CountableThreadPool;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Spider_ESTest extends Spider_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(", i$4l5&T~uRHy{");
      Spider spider0 = new Spider(simplePageProcessor0);
      spider0.clearPipeline();
      String string0 = spider0.getUUID();
      assertTrue(spider0.isExitWhenComplete());
      assertEquals(0L, spider0.getPageCount());
      assertNull(string0);
      assertTrue(spider0.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("Stopped");
      Spider spider0 = Spider.create(simplePageProcessor0);
      ForkJoinPool forkJoinPool0 = ForkJoinPool.commonPool();
      Spider spider1 = spider0.thread((ExecutorService) forkJoinPool0, 618);
      // Undeclared exception!
      try { 
        spider1.initComponent();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/http/protocol/HttpContext
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("4");
      Spider spider0 = new Spider(simplePageProcessor0);
      spider0.setSpawnUrl(false);
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
  public void test03()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("#+");
      Spider spider0 = Spider.create(simplePageProcessor0);
      // Undeclared exception!
      try { 
        spider0.get("#+");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("us.codecraft.webmagic.utils.UrlUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(", i$4l5&T~uRHy{");
      Spider spider0 = new Spider(simplePageProcessor0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = ", i$4l5&T~uRHy{";
      stringArray0[1] = ", i$4l5&T~uRHy{";
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
  public void test05()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(", i$4l5&T~uRHy{");
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider spider1 = spider0.setUUID(", i$4l5&T~uRHy{");
      // Undeclared exception!
      try { 
        spider1.initComponent();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/http/protocol/HttpContext
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("4");
      Spider spider0 = new Spider(simplePageProcessor0);
      int int0 = 618;
      ForkJoinPool forkJoinPool0 = new ForkJoinPool();
      Spider spider1 = spider0.setExecutorService(forkJoinPool0);
      // Undeclared exception!
      try { 
        spider1.thread((ExecutorService) forkJoinPool0, (-1494));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // threadNum should be more than one!
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = Spider.create(simplePageProcessor0);
      Request request0 = new Request();
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader(" stop fail!", "_cycle_tried_times");
      Spider spider1 = spider0.downloader(phantomJSDownloader0);
      Request[] requestArray0 = new Request[2];
      requestArray0[0] = request0;
      requestArray0[1] = request0;
      // Undeclared exception!
      try { 
        spider1.addRequest(requestArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ConcurrentHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("f M50OyA\"y`bc$f!7");
      Spider spider0 = Spider.create(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("f M50OyA\"y`bc$f!7", "w#*=N5rQx6A");
      Spider spider1 = spider0.downloader(phantomJSDownloader0);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, true);
      Locale locale0 = new Locale("w#*=N5rQx6A", "f M50OyA\"y`bc$f!7", "w#*=N5rQx6A");
      LinkedList<Request> linkedList0 = new LinkedList<Request>();
      Spider spider2 = spider1.startRequest(linkedList0);
      PriorityScheduler priorityScheduler0 = new PriorityScheduler();
      priorityScheduler0.poll(spider2);
      linkedList0.add((Request) null);
      // Undeclared exception!
      try { 
        spider0.initComponent();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.scheduler.DuplicateRemovedScheduler", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("4");
      Spider spider0 = Spider.create(simplePageProcessor0);
      ForkJoinPool forkJoinPool0 = ForkJoinPool.commonPool();
      // Undeclared exception!
      try { 
        spider0.thread((ExecutorService) forkJoinPool0, (-1042));
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
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(", i$4l5&T~uRHy{");
      Spider spider0 = new Spider(simplePageProcessor0);
      spider0.stop();
      boolean boolean0 = spider0.isExitWhenComplete();
      assertTrue(boolean0);
      assertEquals(0L, spider0.getPageCount());
      assertTrue(spider0.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(", i$4l5&T~uRHy{");
      Spider spider0 = new Spider(simplePageProcessor0);
      Locale locale0 = Locale.KOREAN;
      Request[] requestArray0 = new Request[0];
      Spider spider1 = spider0.addRequest(requestArray0);
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
  public void test12()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("N}[");
      Spider spider0 = new Spider(simplePageProcessor0);
      spider0.clearPipeline();
      // Undeclared exception!
      try { 
        spider0.thread((-2067));
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
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("JJi");
      Spider spider0 = new Spider(simplePageProcessor0);
      QueueScheduler queueScheduler0 = new QueueScheduler();
      Spider spider1 = spider0.setScheduler(queueScheduler0);
      CollectorPipeline collectorPipeline0 = spider1.getCollectorPipeline();
      Spider spider2 = spider0.pipeline(collectorPipeline0);
      assertTrue(spider2.isSpawnUrl());
      assertEquals(0L, spider2.getPageCount());
      assertTrue(spider2.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("application/json");
      Spider spider0 = new Spider(simplePageProcessor0);
      LinkedList<Request> linkedList0 = new LinkedList<Request>();
      Spider spider1 = spider0.startRequest(linkedList0);
      long long0 = spider1.getPageCount();
      assertEquals(0L, long0);
      assertTrue(spider1.isSpawnUrl());
      assertTrue(spider1.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("4");
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider spider1 = new Spider(simplePageProcessor0);
      assertTrue(spider1.isExitWhenComplete());
      
      Spider spider2 = spider1.setExitWhenComplete(false);
      JsonFilePipeline jsonFilePipeline0 = new JsonFilePipeline();
      Spider spider3 = spider2.pipeline(jsonFilePipeline0);
      spider3.stop();
      assertFalse(spider1.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Spider.Status spider_Status0 = Spider.Status.fromValue(3390);
      assertEquals(Spider.Status.Init, spider_Status0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("f M50OyA\"y`bc$f!7");
      Spider spider0 = Spider.create(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("f M50OyA\"y`bc$f!7", "f M50OyA\"y`bc$f!7");
      Spider spider1 = spider0.downloader(phantomJSDownloader0);
      Locale locale0 = new Locale("f M50OyA\"y`bc$f!7", "f M50OyA\"y`bc$f!7", "uNnyrR*u");
      LinkedList<Request> linkedList0 = new LinkedList<Request>();
      Spider spider2 = spider1.startRequest(linkedList0);
      spider2.initComponent();
      Spider.Status spider_Status0 = spider1.getStatus();
      int int0 = spider_Status0.getValue();
      assertEquals(0, int0);
      assertTrue(spider1.isSpawnUrl());
      assertEquals(0L, spider1.getPageCount());
      assertTrue(spider1.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = Spider.create(simplePageProcessor0);
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
  public void test19()  throws Throwable  {
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
  public void test20()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("Request{url='");
      Spider spider0 = Spider.create(simplePageProcessor0);
      LinkedList<SpiderListener> linkedList0 = new LinkedList<SpiderListener>();
      Spider spider1 = spider0.setSpiderListeners(linkedList0);
      spider1.stop();
      assertTrue(spider1.isSpawnUrl());
      assertEquals(0L, spider1.getPageCount());
      assertTrue(spider1.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("f M50OyA\"y`bc$f!7");
      Spider spider0 = Spider.create(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("f M50OyA\"y`bc$f!7", "f M50OyA\"y`bc$f!7");
      Spider spider1 = spider0.downloader(phantomJSDownloader0);
      Locale locale0 = new Locale("f M50OyA\"y`bc$f!7", "f M50OyA\"y`bc$f!7", "uNnyrR*u");
      LinkedList<Request> linkedList0 = new LinkedList<Request>();
      Spider spider2 = spider1.startRequest(linkedList0);
      spider2.initComponent();
      spider0.getStartTime();
      assertTrue(spider0.isSpawnUrl());
      assertTrue(spider0.isExitWhenComplete());
      assertEquals(0L, spider0.getPageCount());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("4");
      Spider spider0 = new Spider(simplePageProcessor0);
      spider0.stop();
      boolean boolean0 = spider0.isSpawnUrl();
      assertTrue(spider0.isExitWhenComplete());
      assertEquals(0L, spider0.getPageCount());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = "";
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = Spider.create(simplePageProcessor0);
      FilePipeline filePipeline0 = new FilePipeline("");
      Spider spider1 = spider0.addPipeline(filePipeline0);
      PriorityScheduler priorityScheduler0 = new PriorityScheduler();
      String[] stringArray0 = new String[0];
      Spider spider2 = spider0.addUrl(stringArray0);
      Spider spider3 = spider1.setScheduler(priorityScheduler0);
      Spider spider4 = spider3.scheduler(priorityScheduler0);
      priorityScheduler0.getLeftRequestsCount(spider2);
      Spider spider5 = spider4.pipeline(filePipeline0);
      spider5.setExitWhenComplete(false);
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
  public void test24()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("4");
      Spider spider0 = new Spider(simplePageProcessor0);
      spider0.stop();
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
  public void test25()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(", i$4l5&T~uRHy{");
      Spider spider0 = new Spider(simplePageProcessor0);
      spider0.stop();
      spider0.sleep(1132);
      assertTrue(spider0.isSpawnUrl());
      assertTrue(spider0.isExitWhenComplete());
      assertEquals(0L, spider0.getPageCount());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = new Spider(simplePageProcessor0);
      LinkedList<Pipeline> linkedList0 = new LinkedList<Pipeline>();
      spider0.setPipelines(linkedList0);
      spider0.start();
      assertTrue(spider0.isExitWhenComplete());
      assertEquals(0L, spider0.getPageCount());
      assertTrue(spider0.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("4");
      Spider spider0 = new Spider(simplePageProcessor0);
      QueueScheduler queueScheduler0 = new QueueScheduler();
      Spider spider1 = spider0.scheduler(queueScheduler0);
      spider1.setEmptySleepTime(30000);
      assertTrue(spider1.isSpawnUrl());
      assertTrue(spider1.isExitWhenComplete());
      assertEquals(0L, spider1.getPageCount());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)23;
      byteArray0[1] = (byte) (-19);
      byteArray0[2] = (byte)68;
      byteArray0[3] = (byte) (-44);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(" y:q3%X[?i'Qw:A");
      Spider spider0 = Spider.create(simplePageProcessor0);
      QueueScheduler queueScheduler0 = new QueueScheduler();
      Spider spider1 = spider0.setScheduler(queueScheduler0);
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(2158, threadFactory0);
      Spider spider2 = spider1.setExecutorService(scheduledThreadPoolExecutor0);
      Spider spider3 = spider2.thread((int) (byte)23);
      CountableThreadPool countableThreadPool0 = spider2.threadPool;
      spider2.threadPool = null;
      Spider spider4 = spider0.setUUID("2Lw>K9B3SnnD+");
      int int0 = spider4.getThreadAlive();
      assertEquals(0, int0);
      
      Spider spider5 = spider3.scheduler(queueScheduler0);
      spider5.getStatus();
      spider0.start();
      assertTrue(spider0.isExitWhenComplete());
      assertTrue(spider0.isSpawnUrl());
      
      String[] stringArray0 = new String[4];
      stringArray0[0] = " y:q3%X[?i'Qw:A";
      stringArray0[1] = " y:q3%X[?i'Qw:A";
      QueueScheduler queueScheduler1 = new QueueScheduler();
      spider1.scheduler(queueScheduler0);
      assertEquals(0L, spider1.getPageCount());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("f M50OyA\"y`bc$f!7");
      Spider spider0 = Spider.create(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("f M50OyA\"y`bc$f!7", "f M50OyA\"y`bc$f!7");
      Spider spider1 = spider0.setDownloader(phantomJSDownloader0);
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        spider1.test(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.downloader.PhantomJSDownloader", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("E");
      Spider spider0 = Spider.create(simplePageProcessor0);
      spider0.setUUID("E");
      Request request0 = new Request("E");
      spider0.stop();
      // Undeclared exception!
      try { 
        Spider.Status.valueOf("_cycle_tried_times");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant us.codecraft.webmagic.Spider.Status._cycle_tried_times
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(" stop fail!");
      Spider spider0 = Spider.create(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("d5m~pl2i0cZ?\"", " stop fail!");
      Spider spider1 = spider0.setDownloader(phantomJSDownloader0);
      QueueScheduler queueScheduler0 = new QueueScheduler();
      ForkJoinPool forkJoinPool0 = ForkJoinPool.commonPool();
      Spider spider2 = spider0.thread((ExecutorService) forkJoinPool0, 86);
      spider2.initComponent();
      spider1.getThreadAlive();
      assertEquals(0L, spider1.getPageCount());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(" stop fail!");
      Spider spider0 = Spider.create(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader(" stop fail!", " stop fail!");
      spider0.downloader(phantomJSDownloader0);
      PriorityBlockingQueue<String> priorityBlockingQueue0 = new PriorityBlockingQueue<String>();
      spider0.getAll((Collection<String>) priorityBlockingQueue0);
      assertTrue(spider0.isSpawnUrl());
      assertEquals(0L, spider0.getPageCount());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(", i$4l5&T~uRHy{");
      Spider spider0 = new Spider(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader(", i$4l5&T~uRHy{", ", i$4l5&T~uRHy{");
      phantomJSDownloader0.setThread(0);
      spider0.downloader(phantomJSDownloader0);
      spider0.initComponent();
      // Undeclared exception!
      try { 
        spider0.test((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = "4";
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("4");
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
  public void test35()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(", i$4l5&T~uRHy{");
      Spider spider0 = new Spider(simplePageProcessor0);
      Page page0 = Page.fail();
      spider0.extractAndAddRequests(page0, false);
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
  public void test36()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("7");
      Spider spider0 = new Spider(simplePageProcessor0);
      Page.fail();
      QueueScheduler queueScheduler0 = new QueueScheduler();
      spider0.scheduler(queueScheduler0);
      Scheduler scheduler0 = spider0.getScheduler();
      assertEquals(0L, spider0.getPageCount());
      assertSame(scheduler0, queueScheduler0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(", i$4l5&T~uRHy{");
      Spider spider0 = new Spider(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader(", i$4l5&T~uRHy{", ", i$4l5&T~uRHy{");
      phantomJSDownloader0.setThread(0);
      Spider spider1 = spider0.downloader(phantomJSDownloader0);
      spider0.initComponent();
      spider0.run();
      Spider spider2 = spider1.setUUID(", i$4l5&T~uRHy{");
      assertEquals(0L, spider2.getPageCount());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(", i$4l5&T~uRHy{");
      Spider spider0 = new Spider(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader(", i$4l5&T~uRHy{", ", i$4l5&T~uRHy{");
      Spider spider1 = spider0.downloader(phantomJSDownloader0);
      spider1.getCollectorPipeline();
      spider1.run();
      LinkedList<Selector> linkedList0 = new LinkedList<Selector>();
      OrSelector orSelector0 = new OrSelector(linkedList0);
      List<String> list0 = orSelector0.selectList(", i$4l5&T~uRHy{");
      spider0.getAll((Collection<String>) list0);
      assertTrue(spider0.isSpawnUrl());
      assertEquals(0L, spider0.getPageCount());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("f M50OyA\"y`bc$f!7");
      Spider spider0 = Spider.create(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("d5m~pliacZ?\"", "d5m~pliacZ?\"");
      Spider spider1 = spider0.downloader(phantomJSDownloader0);
      Locale locale0 = new Locale("d5m~pliacZ?\"", "f M50OyA\"y`bc$f!7", "uNnyrR*u");
      LinkedList<Request> linkedList0 = new LinkedList<Request>();
      spider1.startRequest(linkedList0);
      LinkedBlockingQueue<String> linkedBlockingQueue0 = new LinkedBlockingQueue<String>();
      spider1.getAll((Collection<String>) linkedBlockingQueue0);
      assertTrue(spider1.isSpawnUrl());
      assertEquals(0L, spider1.getPageCount());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("f M50OyA\"y`bc$f!7");
      Spider spider0 = Spider.create(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("f M50OyA\"y`bc$f!7", "f M50OyA\"y`bc$f!7");
      Spider spider1 = spider0.setDownloader(phantomJSDownloader0);
      ForkJoinPool forkJoinPool0 = ForkJoinPool.commonPool();
      Spider spider2 = spider1.thread((ExecutorService) forkJoinPool0, 618);
      spider1.initComponent();
      Spider spider3 = spider2.thread(618);
      assertEquals(0L, spider3.getPageCount());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      QueueScheduler queueScheduler0 = new QueueScheduler();
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(" stop fail!");
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider spider1 = spider0.thread((ExecutorService) null, 462);
      List<SpiderListener> list0 = spider1.getSpiderListeners();
      assertNull(list0);
      
      Spider spider2 = spider1.setSpiderListeners((List<SpiderListener>) null);
      Page page0 = new Page();
      List<Request> list1 = page0.getTargetRequests();
      Spider spider3 = spider2.startRequest(list1);
      Spider spider4 = spider3.setUUID("d5m~pl2i0cZ?\"");
      Spider spider5 = spider4.thread(462);
      FilePipeline filePipeline0 = new FilePipeline();
      spider5.pipeline(filePipeline0);
      spider5.getSite();
      assertEquals(0L, spider5.getPageCount());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("4");
      Spider spider0 = Spider.create(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("4", "");
      spider0.setDownloader(phantomJSDownloader0);
      String[] stringArray0 = new String[0];
      spider0.test(stringArray0);
      assertEquals(0L, spider0.getPageCount());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("f M50OyA\"y`bc$f!7");
      Spider spider0 = Spider.create(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("f M50OyA\"y`bc$f!7", "d5m~pliacZ?\"");
      Spider spider1 = spider0.downloader(phantomJSDownloader0);
      spider1.start();
      PriorityBlockingQueue<String> priorityBlockingQueue0 = new PriorityBlockingQueue<String>();
      // Undeclared exception!
      try { 
        spider0.getAll((Collection<String>) priorityBlockingQueue0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Spider is already running!
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(", i$4l5&~uRHy{");
      Spider spider0 = new Spider(simplePageProcessor0);
      FileCacheQueueScheduler fileCacheQueueScheduler0 = new FileCacheQueueScheduler(", i$4l5&~uRHy{");
      HashSetDuplicateRemover hashSetDuplicateRemover0 = new HashSetDuplicateRemover();
      DuplicateRemovedScheduler duplicateRemovedScheduler0 = fileCacheQueueScheduler0.setDuplicateRemover(hashSetDuplicateRemover0);
      spider0.scheduler(duplicateRemovedScheduler0);
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
}