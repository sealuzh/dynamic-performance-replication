/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 13:08:58 GMT 2018
 */

package us.codecraft.webmagic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ObjectStreamConstants;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.SpiderListener;
import us.codecraft.webmagic.downloader.PhantomJSDownloader;
import us.codecraft.webmagic.pipeline.CollectorPipeline;
import us.codecraft.webmagic.pipeline.FilePipeline;
import us.codecraft.webmagic.pipeline.JsonFilePipeline;
import us.codecraft.webmagic.pipeline.Pipeline;
import us.codecraft.webmagic.pipeline.ResultItemsCollectorPipeline;
import us.codecraft.webmagic.processor.SimplePageProcessor;
import us.codecraft.webmagic.scheduler.FileCacheQueueScheduler;
import us.codecraft.webmagic.scheduler.QueueScheduler;
import us.codecraft.webmagic.scheduler.Scheduler;
import us.codecraft.webmagic.scheduler.component.DuplicateRemover;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Spider_ESTest extends Spider_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("]E(d->Vp]; ';pL");
      Spider spider0 = Spider.create(simplePageProcessor0);
      spider0.stop();
      spider0.getUUID();
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
  public void test01()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("queue_");
      Spider spider0 = new Spider(simplePageProcessor0);
      FilePipeline filePipeline0 = new FilePipeline();
      spider0.addPipeline(filePipeline0);
      boolean boolean0 = spider0.isExitWhenComplete();
      assertTrue(spider0.isSpawnUrl());
      assertEquals(0L, spider0.getPageCount());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = Spider.create(simplePageProcessor0);
      LinkedList<SpiderListener> linkedList0 = new LinkedList<SpiderListener>();
      Spider spider1 = spider0.setSpiderListeners(linkedList0);
      // Undeclared exception!
      try { 
        spider1.get("");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("us.codecraft.webmagic.utils.UrlUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("~.UU");
      Spider spider0 = Spider.create(simplePageProcessor0);
      spider0.getThreadAlive();
      String[] stringArray0 = new String[2];
      spider0.clearPipeline();
      stringArray0[0] = "~.UU";
      stringArray0[1] = "~.UU";
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
  public void test04()  throws Throwable  {
      Spider.Status.values();
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(".json");
      Spider spider0 = Spider.create(simplePageProcessor0);
      String[] stringArray0 = new String[0];
      spider0.addUrl(stringArray0);
      Spider spider1 = new Spider(simplePageProcessor0);
      // Undeclared exception!
      try { 
        spider1.get("");
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
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("pKmtFQ");
      Spider.create(simplePageProcessor0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      SimplePageProcessor simplePageProcessor1 = new SimplePageProcessor("pKmtFQ");
      Spider spider0 = Spider.create(simplePageProcessor1);
      Request[] requestArray0 = new Request[0];
      spider0.addRequest(requestArray0);
      // Undeclared exception!
      try { 
        spider0.get(", cookies=");
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
      String string0 = "j6(*-xc&zP,;@:QmW";
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("j6(*-xc&zP,;@:QmW");
      Spider spider0 = Spider.create(simplePageProcessor0);
      ForkJoinPool forkJoinPool0 = ForkJoinPool.commonPool();
      spider0.thread((ExecutorService) forkJoinPool0, 5000);
      // Undeclared exception!
      try { 
        spider0.get("j6(*-xc&zP,;@:QmW");
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
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("init cache scheduler success");
      Spider spider0 = new Spider(simplePageProcessor0);
      SynchronousQueue<String> synchronousQueue0 = new SynchronousQueue<String>();
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
  public void test08()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("IKFQ");
      Spider spider0 = Spider.create(simplePageProcessor0);
      int int0 = spider0.getThreadAlive();
      assertEquals(0, int0);
      
      spider0.getStatus();
      assertTrue(spider0.isExitWhenComplete());
      assertTrue(spider0.isSpawnUrl());
      assertEquals(0L, spider0.getPageCount());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("j(o-xc&zPZ;@:QmW");
      Spider spider0 = Spider.create(simplePageProcessor0);
      CollectorPipeline collectorPipeline0 = spider0.getCollectorPipeline();
      spider0.pipeline(collectorPipeline0);
      // Undeclared exception!
      try { 
        spider0.get("j(o-xc&zPZ;@:QmW");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("us.codecraft.webmagic.utils.UrlUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("pKmtFQ");
      Spider spider0 = Spider.create(simplePageProcessor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("pKmtFQ", "L~3!qDsavVv,<7m");
      spider0.downloader(phantomJSDownloader0);
      spider0.stop();
      Spider spider1 = spider0.setUUID("pKmtFQ");
      assertEquals(0L, spider1.getPageCount());
      assertTrue(spider1.isSpawnUrl());
      assertTrue(spider1.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("~.UU");
      Spider spider0 = Spider.create(simplePageProcessor0);
      spider0.setExitWhenComplete(true);
      int int0 = spider0.getThreadAlive();
      assertEquals(0L, spider0.getPageCount());
      assertTrue(spider0.isExitWhenComplete());
      assertTrue(spider0.isSpawnUrl());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(".html");
      Spider spider0 = Spider.create(simplePageProcessor0);
      long long0 = spider0.getPageCount();
      assertTrue(spider0.isExitWhenComplete());
      assertTrue(spider0.isSpawnUrl());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("]E(d->Vp]; ';pL");
      Spider spider0 = Spider.create(simplePageProcessor0);
      spider0.stop();
      // Undeclared exception!
      try { 
        spider0.thread((-4017));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // threadNum should be more than one!
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("j(o-xc&zPZ;@:QmW");
      Spider spider0 = Spider.create(simplePageProcessor0);
      spider0.setUUID("j(o-xc&zPZ;@:QmW");
      spider0.stop();
      assertEquals(0L, spider0.getPageCount());
      assertTrue(spider0.isSpawnUrl());
      assertTrue(spider0.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("pKmtFQ");
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider.create(simplePageProcessor0);
      spider0.getThreadAlive();
      ForkJoinPool forkJoinPool0 = new ForkJoinPool();
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
  public void test16()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("j(o-xc&zPZ;@:QmW");
      Spider spider0 = Spider.create(simplePageProcessor0);
      Page page0 = new Page();
      spider0.extractAndAddRequests((Page) null, false);
      Spider.Status.fromValue(1393);
      spider0.start();
      assertTrue(spider0.isExitWhenComplete());
      assertEquals(0L, spider0.getPageCount());
      assertTrue(spider0.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("%+7");
      Spider spider0 = Spider.create(simplePageProcessor0);
      LinkedList<Pipeline> linkedList0 = new LinkedList<Pipeline>();
      Spider spider1 = spider0.setPipelines(linkedList0);
      assertEquals(0L, spider1.getPageCount());
      assertTrue(spider1.isExitWhenComplete());
      assertTrue(spider1.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = Spider.create(simplePageProcessor0);
      int int0 = spider0.getThreadAlive();
      assertEquals(0, int0);
      
      ThreadPoolExecutor.DiscardOldestPolicy threadPoolExecutor_DiscardOldestPolicy0 = new ThreadPoolExecutor.DiscardOldestPolicy();
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(0, threadPoolExecutor_DiscardOldestPolicy0);
      Spider spider1 = spider0.setExecutorService(scheduledThreadPoolExecutor0);
      spider1.runAsync();
      assertTrue(spider1.isExitWhenComplete());
      assertEquals(0L, spider1.getPageCount());
      assertTrue(spider1.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("|l6VA'$XQ6dj#Wc}{b");
      Spider spider0 = Spider.create(simplePageProcessor0);
      Spider spider1 = spider0.thread(3);
      spider1.runAsync();
      assertEquals(0L, spider1.getPageCount());
      assertTrue(spider1.isSpawnUrl());
      assertTrue(spider1.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QueueScheduler queueScheduler0 = new QueueScheduler();
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("^Ms");
      Spider spider0 = Spider.create(simplePageProcessor0);
      List<SpiderListener> list0 = spider0.getSpiderListeners();
      assertEquals(0L, spider0.getPageCount());
      assertNull(list0);
      assertTrue(spider0.isExitWhenComplete());
      assertTrue(spider0.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("IKFQ");
      Spider spider0 = Spider.create(simplePageProcessor0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      spider0.startUrls(linkedList0);
      FileCacheQueueScheduler fileCacheQueueScheduler0 = new FileCacheQueueScheduler("IKFQ");
      Spider spider1 = spider0.scheduler(fileCacheQueueScheduler0);
      assertEquals(0L, spider1.getPageCount());
      assertTrue(spider1.isExitWhenComplete());
      assertTrue(spider1.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("P#pKmtFQ");
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
  public void test23()  throws Throwable  {
      String string0 = "]E(d->Vp]; ';pL";
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("]E(d->Vp]; ';pL");
      Spider spider0 = Spider.create(simplePageProcessor0);
      Request[] requestArray0 = new Request[6];
      requestArray0[0] = null;
      requestArray0[1] = null;
      requestArray0[2] = null;
      requestArray0[3] = null;
      requestArray0[4] = null;
      requestArray0[5] = null;
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
  public void test24()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = Spider.create(simplePageProcessor0);
      spider0.setEmptySleepTime(1);
      int int0 = ObjectStreamConstants.baseWireHandle;
      assertEquals(8257536, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("|4RaSAko*bRrD1");
      Spider spider0 = Spider.create(simplePageProcessor0);
      ResultItemsCollectorPipeline resultItemsCollectorPipeline0 = new ResultItemsCollectorPipeline();
      Spider spider1 = spider0.addPipeline(resultItemsCollectorPipeline0);
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
  public void test26()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("Spider is already running!");
      Spider spider0 = Spider.create(simplePageProcessor0);
      spider0.stop();
      SynchronousQueue<String> synchronousQueue0 = new SynchronousQueue<String>();
      Page page0 = new Page();
      List<Request> list0 = page0.getTargetRequests();
      Spider spider1 = spider0.startRequest(list0);
      // Undeclared exception!
      try { 
        spider1.getAll((Collection<String>) synchronousQueue0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/http/protocol/HttpContext
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("~.UU");
      Spider spider0 = Spider.create(simplePageProcessor0);
      FileCacheQueueScheduler fileCacheQueueScheduler0 = new FileCacheQueueScheduler("~.UU");
      spider0.scheduler(fileCacheQueueScheduler0);
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
  public void test28()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("j(o-xc&zPZ;@:QmW");
      Spider spider0 = Spider.create(simplePageProcessor0);
      spider0.getThreadAlive();
      spider0.runAsync();
      spider0.getScheduler();
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
  public void test29()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("a3@{m.7wG$");
      Spider spider0 = Spider.create(simplePageProcessor0);
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
  public void test30()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("a3@{m.7wG$");
      Spider spider0 = Spider.create(simplePageProcessor0);
      FileCacheQueueScheduler fileCacheQueueScheduler0 = new FileCacheQueueScheduler("a3@{m.7wG$");
      Request request0 = new Request("a3@{m.7wG$");
      fileCacheQueueScheduler0.push(request0, spider0);
      boolean boolean0 = spider0.isSpawnUrl();
      assertTrue(boolean0);
      
      Spider spider1 = spider0.scheduler(fileCacheQueueScheduler0);
      assertTrue(spider1.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("E-dVjp];C;pL");
      Spider spider0 = Spider.create(simplePageProcessor0);
      spider0.stop();
      spider0.getSite();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("IKFQ");
      Spider spider0 = Spider.create(simplePageProcessor0);
      spider0.stop();
      spider0.getStartTime();
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("j(o-xc&zPZ;@:QmW");
      Spider spider0 = Spider.create(simplePageProcessor0);
      Page page0 = new Page();
      Spider.Status.fromValue(1393);
      spider0.start();
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
  public void test34()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("o5{");
      Spider spider0 = Spider.create(simplePageProcessor0);
      spider0.sleep(2633);
      spider0.getThreadAlive();
      spider0.runAsync();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FileCacheQueueScheduler fileCacheQueueScheduler0 = new FileCacheQueueScheduler("");
      DuplicateRemover duplicateRemover0 = fileCacheQueueScheduler0.getDuplicateRemover();
      fileCacheQueueScheduler0.setDuplicateRemover(duplicateRemover0);
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("Thread interrupted when sleep");
      Spider spider0 = Spider.create(simplePageProcessor0);
      JsonFilePipeline jsonFilePipeline0 = new JsonFilePipeline();
      Spider spider1 = spider0.addPipeline(jsonFilePipeline0);
      Spider spider2 = spider1.setScheduler((Scheduler) null);
      Spider spider3 = spider2.setSpawnUrl(false);
      Spider spider4 = spider3.thread(108);
      Spider spider5 = spider4.setExitWhenComplete(false);
      ForkJoinPool forkJoinPool0 = ForkJoinPool.commonPool();
      spider5.executorService = (ExecutorService) forkJoinPool0;
      spider5.scheduler((Scheduler) null);
      // Undeclared exception!
      try { 
        spider4.test((String[]) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/http/protocol/HttpContext
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("%+7");
      Spider spider0 = Spider.create(simplePageProcessor0);
      spider0.getThreadAlive();
      spider0.runAsync();
      LinkedList<Pipeline> linkedList0 = new LinkedList<Pipeline>();
      spider0.setPipelines(linkedList0);
  }
}