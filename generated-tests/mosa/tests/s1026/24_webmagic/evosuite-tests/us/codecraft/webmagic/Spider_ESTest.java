/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 17:09:24 GMT 2018
 */

package us.codecraft.webmagic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ObjectStreamConstants;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.LinkedBlockingDeque;
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
import us.codecraft.webmagic.downloader.Downloader;
import us.codecraft.webmagic.downloader.PhantomJSDownloader;
import us.codecraft.webmagic.pipeline.CollectorPipeline;
import us.codecraft.webmagic.pipeline.ConsolePipeline;
import us.codecraft.webmagic.pipeline.FilePipeline;
import us.codecraft.webmagic.pipeline.Pipeline;
import us.codecraft.webmagic.processor.SimplePageProcessor;
import us.codecraft.webmagic.scheduler.DuplicateRemovedScheduler;
import us.codecraft.webmagic.scheduler.FileCacheQueueScheduler;
import us.codecraft.webmagic.scheduler.PriorityScheduler;
import us.codecraft.webmagic.scheduler.component.HashSetDuplicateRemover;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Spider_ESTest extends Spider_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(" stop fail!");
      Spider spider0 = new Spider(simplePageProcessor0);
      spider0.getScheduler();
      assertTrue(spider0.isExitWhenComplete());
      assertEquals(0L, spider0.getPageCount());
      assertTrue(spider0.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(" stop fail!");
      Spider.create(simplePageProcessor0);
      String[] stringArray0 = new String[4];
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider spider1 = spider0.setExitWhenComplete(false);
      // Undeclared exception!
      try { 
        spider1.addUrl(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ConcurrentHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(" stop fail!");
      Spider spider0 = Spider.create(simplePageProcessor0);
      CollectorPipeline collectorPipeline0 = spider0.getCollectorPipeline();
      Spider spider1 = spider0.addPipeline(collectorPipeline0);
      assertTrue(spider1.isExitWhenComplete());
      assertEquals(0L, spider1.getPageCount());
      assertTrue(spider1.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = new Spider(simplePageProcessor0);
      spider0.getSite();
      Spider spider1 = spider0.setSpawnUrl(true);
      assertTrue(spider1.isExitWhenComplete());
      assertTrue(spider0.isSpawnUrl());
      assertEquals(0L, spider1.getPageCount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(" stop fail!");
      Spider spider0 = Spider.create(simplePageProcessor0);
      FileCacheQueueScheduler fileCacheQueueScheduler0 = new FileCacheQueueScheduler(" stop fail!");
      FilePipeline filePipeline0 = new FilePipeline();
      Spider spider1 = spider0.pipeline(filePipeline0);
      // Undeclared exception!
      try { 
        spider1.get("/");
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
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("//title");
      Spider spider0 = new Spider(simplePageProcessor0);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      PriorityScheduler priorityScheduler0 = new PriorityScheduler();
      Spider spider1 = spider0.scheduler(priorityScheduler0);
      assertTrue(spider1.isSpawnUrl());
      assertEquals(0L, spider1.getPageCount());
      assertTrue(spider1.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("[|7`w0|C_F=N`Cix-.");
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider spider1 = spider0.thread(40);
      assertEquals(0L, spider1.getPageCount());
      assertTrue(spider1.isSpawnUrl());
      assertTrue(spider1.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(" stop fail!");
      Spider spider0 = new Spider(simplePageProcessor0);
      assertTrue(spider0.isExitWhenComplete());
      
      spider0.setExitWhenComplete(false);
      int int0 = spider0.getThreadAlive();
      assertFalse(spider0.isExitWhenComplete());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider spider1 = new Spider(simplePageProcessor0);
      // Undeclared exception!
      try { 
        spider1.thread((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // threadNum should be more than one!
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("]stop faiQ!");
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider spider1 = new Spider(simplePageProcessor0);
      int int0 = spider0.getThreadAlive();
      assertEquals(0, int0);
      
      Spider spider2 = spider0.setPipelines((List<Pipeline>) null);
      spider2.runAsync();
      assertEquals(0L, spider2.getPageCount());
      assertTrue(spider2.isExitWhenComplete());
      assertTrue(spider2.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = "zu},]9'f}z^tLG:7?!f";
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("zu},]9'f}z^tLG:7?!f");
      Spider spider0 = new Spider(simplePageProcessor0);
      String[] stringArray0 = new String[0];
      spider0.startRequest((List<Request>) null);
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
  public void test11()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(" stop fail!");
      Spider spider0 = new Spider(simplePageProcessor0);
      int int0 = spider0.getThreadAlive();
      assertEquals(0, int0);
      
      Spider spider1 = spider0.setSpiderListeners((List<SpiderListener>) null);
      assertEquals(0L, spider1.getPageCount());
      assertTrue(spider1.isExitWhenComplete());
      assertTrue(spider1.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("3");
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider spider1 = spider0.clearPipeline();
      spider1.stop();
      assertEquals(0L, spider1.getPageCount());
      assertTrue(spider1.isExitWhenComplete());
      assertTrue(spider1.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = "]stop faiQ!";
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("]stop faiQ!");
      Spider spider0 = new Spider(simplePageProcessor0);
      ForkJoinTask.getPool();
      spider0.thread((ExecutorService) null, 17);
      // Undeclared exception!
      try { 
        spider0.test((String[]) null);
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
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(" stop fail!");
      Spider spider0 = new Spider(simplePageProcessor0);
      spider0.getStatus();
      assertTrue(spider0.isExitWhenComplete());
      assertEquals(0L, spider0.getPageCount());
      assertTrue(spider0.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(" sop fal");
      Spider spider0 = new Spider(simplePageProcessor0);
      Request request0 = new Request();
      Request[] requestArray0 = new Request[6];
      requestArray0[0] = request0;
      requestArray0[1] = request0;
      requestArray0[2] = request0;
      requestArray0[3] = request0;
      requestArray0[4] = request0;
      requestArray0[5] = request0;
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
  public void test16()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(" stop fail!");
      Spider spider0 = Spider.create(simplePageProcessor0);
      Spider spider1 = new Spider(simplePageProcessor0);
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
  public void test17()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(" stop fail!");
      Spider spider0 = new Spider(simplePageProcessor0);
      // Undeclared exception!
      try { 
        spider0.sleep((-4718));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // timeout value is negative
         //
         verifyException("java.lang.Thread", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Spider.Status.fromValue(0);
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("us.codecraft.webmagic.scheduler.RedisPriorityScheduler");
      Spider spider0 = new Spider(simplePageProcessor0);
      spider0.setExitWhenComplete(true);
      String[] stringArray0 = new String[0];
      Spider spider1 = spider0.addUrl(stringArray0);
      assertTrue(spider1.isSpawnUrl());
      assertTrue(spider0.isExitWhenComplete());
      assertEquals(0L, spider1.getPageCount());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(" stop fail!");
      Spider spider0 = Spider.create(simplePageProcessor0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = " stop fail!";
      ThreadGroup threadGroup0 = new ThreadGroup(" stop fail!");
      ThreadGroup threadGroup1 = new ThreadGroup(threadGroup0, " stop fail!");
      ForkJoinPool.ForkJoinWorkerThreadFactory forkJoinPool_ForkJoinWorkerThreadFactory0 = mock(ForkJoinPool.ForkJoinWorkerThreadFactory.class, new ViolatedAssumptionAnswer());
      ForkJoinPool forkJoinPool0 = new ForkJoinPool(1, forkJoinPool_ForkJoinWorkerThreadFactory0, threadGroup1, true);
      Spider spider1 = spider0.thread((ExecutorService) forkJoinPool0, 5216);
      Request[] requestArray0 = new Request[0];
      Spider spider2 = spider1.addRequest(requestArray0);
      assertEquals(0L, spider2.getPageCount());
      assertTrue(spider2.isExitWhenComplete());
      assertTrue(spider2.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(" stop fail!");
      Spider spider0 = new Spider(simplePageProcessor0);
      spider0.stop();
      List<SpiderListener> list0 = spider0.getSpiderListeners();
      assertEquals(0L, spider0.getPageCount());
      assertTrue(spider0.isSpawnUrl());
      assertTrue(spider0.isExitWhenComplete());
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(" stop fail!");
      Spider spider0 = new Spider(simplePageProcessor0);
      spider0.getThreadAlive();
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
  public void test22()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = new Spider(simplePageProcessor0);
      Request request0 = new Request();
      Spider.Status spider_Status0 = Spider.Status.fromValue(5);
      assertEquals(Spider.Status.Init, spider_Status0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(" s=dp fail!");
      Spider spider0 = new Spider(simplePageProcessor0);
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
  public void test24()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("z%!LYIn33I");
      Spider spider0 = new Spider(simplePageProcessor0);
      spider0.getThreadAlive();
      Spider spider1 = Spider.create(simplePageProcessor0);
      spider1.isSpawnUrl();
      Downloader downloader0 = null;
      Spider spider2 = spider0.downloader((Downloader) null);
      spider2.start();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "z%!LYIn33I";
      Locale locale0 = Locale.forLanguageTag("threadNum should be more than one!");
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      // Undeclared exception!
      try { 
        spider2.getAll((Collection<String>) set0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Spider is already running!
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(" stop fail!");
      Spider.create(simplePageProcessor0);
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider spider1 = spider0.setExitWhenComplete(false);
      LinkedList<Request> linkedList0 = new LinkedList<Request>();
      FileCacheQueueScheduler fileCacheQueueScheduler0 = new FileCacheQueueScheduler("0w&`m");
      spider1.startRequests = (List<Request>) linkedList0;
      // Undeclared exception!
      try { 
        spider1.get(" stop fail!");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("us.codecraft.webmagic.utils.UrlUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("U6\"");
      Spider spider0 = Spider.create(simplePageProcessor0);
      Spider spider1 = spider0.setSpawnUrl(true);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Spider spider2 = spider1.startUrls(linkedList0);
      assertEquals(0L, spider2.getPageCount());
      assertTrue(spider2.isExitWhenComplete());
      assertTrue(spider0.isSpawnUrl());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("");
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider spider1 = spider0.setExecutorService((ExecutorService) null);
      int int0 = spider1.getThreadAlive();
      assertEquals(0L, spider1.getPageCount());
      assertEquals(0, int0);
      assertTrue(spider1.isSpawnUrl());
      assertTrue(spider1.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(" stop fail!");
      Spider spider0 = new Spider(simplePageProcessor0);
      spider0.setEmptySleepTime(4948);
      spider0.stop();
      long long0 = spider0.getPageCount();
      assertEquals(0L, long0);
      assertTrue(spider0.isSpawnUrl());
      assertTrue(spider0.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(" stop fail!");
      String[] stringArray0 = new String[4];
      Spider spider0 = new Spider(simplePageProcessor0);
      LinkedList<Request> linkedList0 = new LinkedList<Request>();
      FileCacheQueueScheduler fileCacheQueueScheduler0 = new FileCacheQueueScheduler("0w&`m");
      Spider spider1 = spider0.setScheduler(fileCacheQueueScheduler0);
      spider0.addUrl(stringArray0);
      Spider spider2 = spider1.setScheduler(fileCacheQueueScheduler0);
      assertEquals(0L, spider2.getPageCount());
      assertTrue(spider2.isExitWhenComplete());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("8 stop fail!");
      Spider spider0 = new Spider(simplePageProcessor0);
      spider0.getThreadAlive();
      spider0.isExitWhenComplete();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(" stop fail!");
      Spider spider0 = Spider.create(simplePageProcessor0);
      spider0.stop();
      spider0.extractAndAddRequests((Page) null, false);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("zu},]9'f}z^tLG:7?!f");
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
  public void test33()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(".html");
      Spider spider0 = Spider.create(simplePageProcessor0);
      spider0.getCollectorPipeline();
      spider0.getStartTime();
      FileCacheQueueScheduler fileCacheQueueScheduler0 = new FileCacheQueueScheduler("9%_(u`");
      spider0.setScheduler(fileCacheQueueScheduler0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(" stop fail!");
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      Spider spider0 = Spider.create(simplePageProcessor0);
      ConsolePipeline consolePipeline0 = new ConsolePipeline();
      spider0.pipeline(consolePipeline0);
      Spider spider1 = new Spider(simplePageProcessor0);
      Spider spider2 = spider0.setUUID(" stop fail!");
      LinkedBlockingDeque<String> linkedBlockingDeque0 = new LinkedBlockingDeque<String>();
      // Undeclared exception!
      try { 
        spider2.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.Spider", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(" sop fal");
      Spider spider0 = new Spider(simplePageProcessor0);
      Request request0 = new Request();
      Request[] requestArray0 = new Request[6];
      requestArray0[1] = request0;
      requestArray0[2] = request0;
      requestArray0[3] = request0;
      requestArray0[4] = request0;
      requestArray0[5] = request0;
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
  public void test36()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(" stop fail!");
      Spider spider0 = new Spider(simplePageProcessor0);
      spider0.stop();
      spider0.runAsync();
      Request request0 = new Request();
      FileCacheQueueScheduler fileCacheQueueScheduler0 = new FileCacheQueueScheduler(" stop fail!");
      spider0.setScheduler(fileCacheQueueScheduler0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("]stop faiQ!");
      Spider spider0 = new Spider(simplePageProcessor0);
      Spider spider1 = spider0.setExecutorService((ExecutorService) null);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("task or site can not be null", "");
      Spider spider2 = spider0.setDownloader(phantomJSDownloader0);
      Spider spider3 = spider1.downloader(phantomJSDownloader0);
      PriorityBlockingQueue<String> priorityBlockingQueue0 = new PriorityBlockingQueue<String>();
      LinkedList<Request> linkedList0 = new LinkedList<Request>();
      Spider spider4 = spider0.startRequest(linkedList0);
      FileCacheQueueScheduler fileCacheQueueScheduler0 = new FileCacheQueueScheduler("task or site can not be null");
      HashSetDuplicateRemover hashSetDuplicateRemover0 = new HashSetDuplicateRemover();
      DuplicateRemovedScheduler duplicateRemovedScheduler0 = fileCacheQueueScheduler0.setDuplicateRemover(hashSetDuplicateRemover0);
      PriorityScheduler priorityScheduler0 = new PriorityScheduler();
      spider3.setScheduler(duplicateRemovedScheduler0);
      ForkJoinPool forkJoinPool0 = ForkJoinPool.commonPool();
      spider2.setExecutorService(forkJoinPool0);
      spider4.run();
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor(" stop fail!");
      FileCacheQueueScheduler fileCacheQueueScheduler0 = new FileCacheQueueScheduler(" stop fail!");
      Spider spider0 = Spider.create(simplePageProcessor0);
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(39, threadFactory0);
      Spider spider1 = spider0.setExecutorService(scheduledThreadPoolExecutor0);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader((String) null, (String) null);
      spider0.setDownloader(phantomJSDownloader0);
      Spider spider2 = spider1.downloader(phantomJSDownloader0);
      PriorityBlockingQueue<String> priorityBlockingQueue0 = new PriorityBlockingQueue<String>();
      List<Pipeline> list0 = spider2.getAll((Collection<String>) priorityBlockingQueue0);
      Spider spider3 = spider0.setPipelines(list0);
      Spider spider4 = spider3.setUUID(" stop fail!");
      FileCacheQueueScheduler fileCacheQueueScheduler1 = new FileCacheQueueScheduler("");
      HashSetDuplicateRemover hashSetDuplicateRemover0 = new HashSetDuplicateRemover();
      fileCacheQueueScheduler0.setDuplicateRemover(hashSetDuplicateRemover0);
      Spider spider5 = spider4.setScheduler(fileCacheQueueScheduler1);
      spider5.setScheduler(fileCacheQueueScheduler0);
      Spider spider6 = spider5.setExecutorService(scheduledThreadPoolExecutor0);
      spider6.run();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("\">T0$u9");
      Spider spider0 = new Spider(simplePageProcessor0);
      spider0.stop();
      Request request0 = new Request("");
      request0.addHeader("t-", ", url=");
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader("P|", "t-");
      Spider spider1 = spider0.setUUID("_cycle_tried_times");
      Spider spider2 = spider0.downloader(phantomJSDownloader0);
      PriorityBlockingQueue<String> priorityBlockingQueue0 = new PriorityBlockingQueue<String>();
      List<Pipeline> list0 = spider0.getAll((Collection<String>) priorityBlockingQueue0);
      spider2.setPipelines(list0);
      spider1.setUUID("_cycle_tried_times");
      FileCacheQueueScheduler fileCacheQueueScheduler0 = new FileCacheQueueScheduler(", url=");
      HashSetDuplicateRemover hashSetDuplicateRemover0 = new HashSetDuplicateRemover();
      DuplicateRemovedScheduler duplicateRemovedScheduler0 = fileCacheQueueScheduler0.setDuplicateRemover(hashSetDuplicateRemover0);
      Spider spider3 = spider0.setScheduler(duplicateRemovedScheduler0);
      ForkJoinTask.getPool();
      Spider spider4 = spider3.setExecutorService((ExecutorService) null);
      spider4.setDownloader(phantomJSDownloader0);
      spider2.run();
      spider2.getThreadAlive();
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SimplePageProcessor simplePageProcessor0 = new SimplePageProcessor("]sto faiQ!");
      Spider spider0 = Spider.create(simplePageProcessor0);
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(39, threadFactory0);
      spider0.setExecutorService(scheduledThreadPoolExecutor0);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      PhantomJSDownloader phantomJSDownloader0 = new PhantomJSDownloader(".eEr:ha%dC5", "]sto faiQ!");
      spider0.downloader(phantomJSDownloader0);
      PriorityBlockingQueue<String> priorityBlockingQueue0 = new PriorityBlockingQueue<String>();
      String[] stringArray0 = new String[8];
      stringArray0[0] = ".eEr:ha%dC5";
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
}