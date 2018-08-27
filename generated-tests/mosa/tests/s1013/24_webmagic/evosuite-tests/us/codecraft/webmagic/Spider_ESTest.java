/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 04:00:22 GMT 2018
 */

package us.codecraft.webmagic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.SpiderListener;
import us.codecraft.webmagic.downloader.PhantomJSDownloader;
import us.codecraft.webmagic.pipeline.FilePipeline;
import us.codecraft.webmagic.pipeline.JsonFilePipeline;
import us.codecraft.webmagic.pipeline.Pipeline;
import us.codecraft.webmagic.processor.SimplePageProcessor;
import us.codecraft.webmagic.scheduler.DuplicateRemovedScheduler;
import us.codecraft.webmagic.scheduler.FileCacheQueueScheduler;
import us.codecraft.webmagic.scheduler.PriorityScheduler;
import us.codecraft.webmagic.scheduler.QueueScheduler;
import us.codecraft.webmagic.scheduler.Scheduler;
import us.codecraft.webmagic.scheduler.component.DuplicateRemover;
import us.codecraft.webmagic.scheduler.component.HashSetDuplicateRemover;
import us.codecraft.webmagic.selector.Json;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Spider_ESTest extends Spider_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Spider.Status spider_Status0 = Spider.Status.fromValue(3);
      assertEquals(Spider.Status.Init, spider_Status0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("p>5b|<BJ'L1LQ");
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider spider1 = spider0.setUUID("p>5b|<BJ'L1LQ");
      QueueScheduler queueScheduler0 = new QueueScheduler();
      Spider spider2 = spider1.setScheduler(queueScheduler0);
      assertTrue(spider2.isExitWhenComplete());
      
      spider2.exitWhenComplete = true;
      spider2.getStatus();
      assertEquals(0L, spider2.getPageCount());
      assertTrue(spider2.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(":");
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider spider1 = new Spider(simplePageProcessor0);
      FilePipeline filePipeline0 = new FilePipeline(":");
      PriorityScheduler priorityScheduler0 = new PriorityScheduler();
      Spider spider2 = spider1.setPipelines((List<Pipeline>) null);
      spider2.scheduler(priorityScheduler0);
      Locale locale0 = Locale.JAPAN;
      assertEquals("ja_JP", locale0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(":");
      Spider spider0 = Spider.create(simplePageProcessor0);
      PriorityScheduler priorityScheduler0 = new PriorityScheduler();
      LinkedList<Pipeline> linkedList0 = new LinkedList<Pipeline>();
      spider0.thread(5);
      spider0.thread(5);
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
  public void test04()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("6=@GN(");
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
  public void test05()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("6=@GN(");
      Spider spider0 = Spider.create(simplePageProcessor0);
      spider0.stop();
      spider0.checkIfRunning();
      // Undeclared exception!
      try { 
        spider0.get("6=@GN(");
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
      Spider spider1 = spider0.setSpawnUrl(false);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      // Undeclared exception!
      try { 
        spider1.addUrl(stringArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("us.codecraft.webmagic.utils.UrlUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = "p>5b|<BJ'L1LQ";
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("p>5b|<BJ'L1LQ");
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
  public void test08()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("6=@GN(");
      Spider spider0 = Spider.create(simplePageProcessor0);
      Request request0 = new Request("6=@GN(");
      JsonFilePipeline jsonFilePipeline0 = new JsonFilePipeline();
      spider0.pipeline(jsonFilePipeline0);
      spider0.getSpiderListeners();
      ResultItems resultItems0 = new ResultItems();
      // Undeclared exception!
      try { 
        jsonFilePipeline0.process(resultItems0, spider0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.pipeline.JsonFilePipeline", e);
      }
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
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("6=@GN(");
      Spider spider0 = Spider.create(simplePageProcessor0);
      spider0.getSite();
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("$VALUES", "6=@GN(");
      QueueScheduler queueScheduler0 = new QueueScheduler();
      Locale locale0 = Locale.JAPAN;
      // Undeclared exception!
      try { 
        spider0.get("$VALUES");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("us.codecraft.webmagic.utils.UrlUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("6=@GN(");
      Spider spider0 = Spider.create(simplePageProcessor0);
      spider0.stop();
      Locale locale0 = Locale.CHINESE;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
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
  public void test12()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(":");
      Spider spider0 = new Spider(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader((String) null, ":");
      Spider spider1 = spider0.downloader(phantomJSDownloader0);
      Spider spider2 = spider1.thread(880);
      Locale locale0 = Locale.ROOT;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      spider1.getAll((Collection<String>) set0);
      FileCacheQueueScheduler fileCacheQueueScheduler0 = new FileCacheQueueScheduler(":");
      DuplicateRemover duplicateRemover0 = fileCacheQueueScheduler0.getDuplicateRemover();
      DuplicateRemovedScheduler duplicateRemovedScheduler0 = fileCacheQueueScheduler0.setDuplicateRemover(duplicateRemover0);
      Spider spider3 = spider2.scheduler(duplicateRemovedScheduler0);
      Locale locale1 = Locale.JAPAN;
      spider1.getStartTime();
      spider3.isExitWhenComplete();
      assertTrue(spider2.isSpawnUrl());
      assertEquals(0L, spider3.getPageCount());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = new Spider(simplePageProcessor0);
      LinkedList<Request> linkedList0 = new LinkedList<Request>();
      Spider spider1 = spider0.startRequest(linkedList0);
      // Undeclared exception!
      try { 
        spider1.test((String[]) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/http/protocol/HttpContext
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("ResultItems{fields=");
      Spider spider0 = new Spider(simplePageProcessor0);
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      ThreadPoolExecutor.DiscardPolicy threadPoolExecutor_DiscardPolicy0 = new ThreadPoolExecutor.DiscardPolicy();
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(0, threadFactory0, threadPoolExecutor_DiscardPolicy0);
      spider0.setExecutorService(scheduledThreadPoolExecutor0);
      // Undeclared exception!
      try { 
        Charset.forName("ResultItems{fields=");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // ResultItems{fields=
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(":");
      Spider spider0 = Spider.create(simplePageProcessor0);
      spider0.setSpawnUrl(true);
      // Undeclared exception!
      try { 
        spider0.extractAndAddRequests((Page) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("6=@GN(");
      Spider spider0 = Spider.create(simplePageProcessor0);
      // Undeclared exception!
      try { 
        spider0.thread((-645));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // threadNum should be more than one!
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(":");
      Spider spider0 = new Spider(simplePageProcessor0);
      Request request0 = new Request((String) null);
      request0.addHeader((String) null, ":");
      Request[] requestArray0 = new Request[0];
      spider0.addRequest(requestArray0);
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
  public void test18()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = Spider.create(simplePageProcessor0);
      String[] stringArray0 = new String[0];
      spider0.addUrl(stringArray0);
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
  public void test19()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("process reques ");
      Spider spider0 = new Spider(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("process reques ", "process reques ");
      Spider spider1 = spider0.downloader(phantomJSDownloader0);
      String[] stringArray0 = new String[0];
      spider1.test(stringArray0);
      Json json0 = new Json((String) null);
      Spider spider2 = spider0.scheduler((Scheduler) null);
      spider0.getThreadAlive();
      spider2.initComponent();
      ForkJoinPool forkJoinPool0 = ForkJoinPool.commonPool();
      // Undeclared exception!
      try { 
        spider0.thread((ExecutorService) forkJoinPool0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // threadNum should be more than one!
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("6L,xS$?-Y3V/r");
      Spider spider0 = new Spider(simplePageProcessor0);
      ForkJoinPool forkJoinPool0 = new ForkJoinPool(3356);
      spider0.thread((ExecutorService) forkJoinPool0, 1);
      spider0.clearPipeline();
      spider0.getScheduler();
      assertTrue(spider0.isExitWhenComplete());
      assertEquals(0L, spider0.getPageCount());
      assertTrue(spider0.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("`BPCK");
      Spider spider0 = Spider.create(simplePageProcessor0);
      Spider.create(simplePageProcessor0);
      PriorityScheduler priorityScheduler0 = new PriorityScheduler();
      spider0.scheduler(priorityScheduler0);
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
  public void test22()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("sPq%+HOg@ v>K");
      Spider spider0 = Spider.create(simplePageProcessor0);
      Spider spider1 = spider0.thread((ExecutorService) null, 1);
      Spider spider2 = spider1.setSpawnUrl(true);
      LinkedList<SpiderListener> linkedList0 = new LinkedList<SpiderListener>();
      spider2.setSpiderListeners(linkedList0);
      Spider.Status spider_Status0 = Spider.Status.fromValue(2);
      assertEquals(Spider.Status.Stopped, spider_Status0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("6=@GN(");
      Spider spider0 = Spider.create(simplePageProcessor0);
      Spider.Status.fromValue(30000);
      String string0 = "+3N";
      FileCacheQueueScheduler fileCacheQueueScheduler0 = new FileCacheQueueScheduler("+3N");
      Spider spider1 = spider0.setUUID("6=@GN(");
      fileCacheQueueScheduler0.poll(spider1);
      // Undeclared exception!
      try { 
        spider0.onSuccess((Request) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/collections/CollectionUtils
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider spider1 = spider0.setSpawnUrl(false);
      spider1.setSpawnUrl(false);
      spider0.runAsync();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(":");
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider.create(simplePageProcessor0);
      PriorityScheduler priorityScheduler0 = new PriorityScheduler();
      Spider spider1 = spider0.scheduler(priorityScheduler0);
      spider0.start();
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
  public void test26()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(" stop fail!");
      Spider spider0 = new Spider(simplePageProcessor0);
      JsonFilePipeline jsonFilePipeline0 = new JsonFilePipeline(" stop fail!");
      spider0.sleep(393);
      Spider spider1 = spider0.addPipeline(jsonFilePipeline0);
      Spider spider2 = spider1.pipeline(jsonFilePipeline0);
      PriorityScheduler priorityScheduler0 = new PriorityScheduler();
      Spider spider3 = spider2.setScheduler(priorityScheduler0);
      spider3.setEmptySleepTime(1);
      spider0.start();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("6=@GN(");
      Spider spider0 = Spider.create(simplePageProcessor0);
      FileCacheQueueScheduler fileCacheQueueScheduler0 = new FileCacheQueueScheduler("6=@GN(");
      HashSetDuplicateRemover hashSetDuplicateRemover0 = new HashSetDuplicateRemover();
      hashSetDuplicateRemover0.resetDuplicateCheck(spider0);
      fileCacheQueueScheduler0.setDuplicateRemover(hashSetDuplicateRemover0);
      Locale locale0 = Locale.JAPAN;
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
  public void test28()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("process reques ");
      Spider spider0 = new Spider(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("process reques ", "process reques ");
      Spider spider1 = spider0.downloader(phantomJSDownloader0);
      String[] stringArray0 = new String[0];
      spider1.test(stringArray0);
      Spider spider2 = spider1.thread(108);
      Locale locale0 = Locale.ROOT;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      spider2.getAll((Collection<String>) set0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = ":\\";
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(":");
      Spider spider0 = new Spider(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader((String) null, ":");
      spider0.downloader(phantomJSDownloader0);
      Locale locale0 = Locale.CHINA;
      String[] stringArray0 = new String[1];
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
  public void test30()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("6=@GN(");
      Spider spider0 = Spider.create(simplePageProcessor0);
      spider0.stop();
      spider0.checkIfRunning();
      spider0.extractAndAddRequests((Page) null, false);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("process request ");
      Spider spider0 = new Spider(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("process request ", "process request ");
      Spider spider1 = spider0.downloader(phantomJSDownloader0);
      String[] stringArray0 = new String[0];
      spider1.test(stringArray0);
      Json json0 = new Json((String) null);
      Spider.Status.fromValue(1006);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(":");
      Spider spider0 = new Spider(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader((String) null, ":");
      Spider spider1 = spider0.downloader(phantomJSDownloader0);
      spider1.thread(880);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "90F*i1$(O");
      PriorityScheduler priorityScheduler0 = new PriorityScheduler();
      Spider spider2 = spider1.scheduler(priorityScheduler0);
      spider2.getThreadAlive();
      spider0.initComponent();
      spider0.getPageCount();
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(":");
      Spider spider0 = Spider.create(simplePageProcessor0);
      spider0.stop();
      // Undeclared exception!
      try { 
        spider0.extractAndAddRequests((Page) null, true);
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
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(":");
      Spider spider0 = new Spider(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader((String) null, ":");
      Spider spider1 = spider0.downloader(phantomJSDownloader0);
      Spider spider2 = spider1.thread(880);
      Locale locale0 = Locale.ROOT;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      spider1.getAll((Collection<String>) set0);
      FileCacheQueueScheduler fileCacheQueueScheduler0 = new FileCacheQueueScheduler(":");
      fileCacheQueueScheduler0.getDuplicateRemover();
      int int0 = MockThread.NORM_PRIORITY;
      spider2.initComponent();
      spider2.getStartTime();
      Spider.Status.fromValue(880);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = new Spider(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("", ":");
      spider0.downloader(phantomJSDownloader0);
      LinkedList<Request> linkedList0 = new LinkedList<Request>();
      Spider spider1 = spider0.startRequest(linkedList0);
      // Undeclared exception!
      try { 
        spider1.test((String[]) null);
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
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("process request ");
      Spider spider0 = new Spider(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("process request ", "process request ");
      Spider spider1 = spider0.downloader(phantomJSDownloader0);
      Spider spider2 = spider1.thread(847);
      LinkedList<Request> linkedList0 = new LinkedList<Request>();
      spider2.startRequest(linkedList0);
      Locale locale0 = Locale.ROOT;
      spider1.checkIfRunning();
      Locale locale1 = Locale.JAPAN;
      // Undeclared exception!
      try { 
        spider0.get("process request ");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("us.codecraft.webmagic.utils.UrlUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(":");
      Spider spider0 = new Spider(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader((String) null, ":");
      Spider spider1 = spider0.downloader(phantomJSDownloader0);
      Spider spider2 = spider1.thread(880);
      Locale locale0 = Locale.ROOT;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      spider1.getAll((Collection<String>) set0);
      FileCacheQueueScheduler fileCacheQueueScheduler0 = new FileCacheQueueScheduler(":");
      fileCacheQueueScheduler0.getDuplicateRemover();
      int int0 = MockThread.NORM_PRIORITY;
      spider2.initComponent();
      spider2.getStartTime();
      spider2.isSpawnUrl();
      spider2.close();
  }
}