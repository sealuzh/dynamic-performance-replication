/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 14:55:13 GMT 2019
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Reader;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.CompilerEnvirons;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.Decompiler;
import org.mozilla.javascript.DefaultErrorReporter;
import org.mozilla.javascript.ErrorReporter;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.ScriptOrFnNode;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Parser_ESTest extends Parser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      // Undeclared exception!
      try { 
        parser0.popScope();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      StringReader stringReader0 = new StringReader("");
      ScriptOrFnNode scriptOrFnNode0 = parser0.parse((Reader) stringReader0, "", 21);
      assertEquals("\u0087", parser0.getEncodedSource());
      assertEquals(21, scriptOrFnNode0.getEndLineno());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      boolean boolean0 = parser0.insideFunction();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      // Undeclared exception!
      try { 
        parser0.reportError("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property 
         //
         verifyException("org.mozilla.javascript.ScriptRuntime$DefaultMessageProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      ErrorReporter errorReporter0 = context0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      ScriptOrFnNode scriptOrFnNode0 = parser0.parse("", "language version", 6);
      assertEquals("\u0087", parser0.getEncodedSource());
      assertEquals("language version", scriptOrFnNode0.getSourceName());
      assertEquals(6, scriptOrFnNode0.getLineno());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Context context0 = Context.enter();
      ErrorReporter errorReporter0 = context0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      // Undeclared exception!
      try { 
        parser0.parse((Reader) null, "msg.let.redecl", (-599));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Parser parser0 = new Parser((CompilerEnvirons) null, (ErrorReporter) null);
      Decompiler decompiler0 = parser0.createDecompiler((CompilerEnvirons) null);
      assertEquals(2, Decompiler.INDENT_GAP_PROP);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      compilerEnvirons0.setGeneratingSource(false);
      Decompiler decompiler0 = parser0.createDecompiler(compilerEnvirons0);
      assertEquals(1, Decompiler.INITIAL_INDENT_PROP);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
      Decompiler decompiler0 = parser0.createDecompiler(compilerEnvirons0);
      assertEquals(1, Decompiler.INITIAL_INDENT_PROP);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      // Undeclared exception!
      try { 
        parser0.addError("", "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property 
         //
         verifyException("org.mozilla.javascript.ScriptRuntime$DefaultMessageProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Context context0 = Context.enter();
      ErrorReporter errorReporter0 = context0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      // Undeclared exception!
      try { 
        parser0.reportError("|E58[^x");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property |E58[^x
         //
         verifyException("org.mozilla.javascript.ScriptRuntime$DefaultMessageProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      Parser parser0 = new Parser(compilerEnvirons0, defaultErrorReporter0);
      Node.Scope node_Scope0 = new Node.Scope((-3680), (-3680));
      // Undeclared exception!
      try { 
        parser0.pushScope(node_Scope0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.mozilla.javascript.Node$Scope cannot be cast to org.mozilla.javascript.ScriptOrFnNode
         //
         verifyException("org.mozilla.javascript.Node$Scope", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      // Undeclared exception!
      try { 
        parser0.defineSymbol(0, false, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorReporter errorReporter0 = DefaultErrorReporter.forEval((ErrorReporter) null);
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      // Undeclared exception!
      try { 
        parser0.parse("MY7nZ91zHn3HsU:\"czO", (String) null, 3614);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // SyntaxError: unterminated string literal
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0, (ErrorReporter) null);
      StringReader stringReader0 = new StringReader("L1tW&{");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "msg.no.side.effects", (-6439));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      // Undeclared exception!
      try { 
        parser0.parse("bL5rO}{xuyZ`wGiB}j", "1c `Tz0>(vmld", 85);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error (1c `Tz0>(vmld#85)
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      Parser parser0 = new Parser(compilerEnvirons0, defaultErrorReporter0);
      // Undeclared exception!
      try { 
        parser0.parse("byte", "byte", 43);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // identifier is a reserved word (byte#43)
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      Parser parser0 = new Parser(compilerEnvirons0, defaultErrorReporter0);
      // Undeclared exception!
      try { 
        parser0.parse("/=7Kgn", "/=7Kgn", 449);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unterminated regular expression literal (/=7Kgn#449)
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      Parser parser0 = new Parser(compilerEnvirons0, defaultErrorReporter0);
      ScriptOrFnNode scriptOrFnNode0 = parser0.parse("false", "", 4108);
      assertEquals("\u0087,Q\u0001", parser0.getEncodedSource());
      assertEquals(4108, scriptOrFnNode0.getEndLineno());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      Parser parser0 = new Parser(compilerEnvirons0, defaultErrorReporter0);
      StringReader stringReader0 = new StringReader("/X_3<4");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "/X_3<4", 24);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unterminated regular expression literal (/X_3<4#24)
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      Parser parser0 = new Parser(compilerEnvirons0, defaultErrorReporter0);
      // Undeclared exception!
      try { 
        parser0.parse("@", "@", (-2020));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2020
         //
         verifyException("org.mozilla.javascript.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0, (ErrorReporter) null);
      StringReader stringReader0 = new StringReader("@[B3'0Wjmt74:|~R.");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "@[B3'0Wjmt74:|~R.", 3534);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      Parser parser0 = new Parser(compilerEnvirons0, defaultErrorReporter0);
      StringReader stringReader0 = new StringReader("@oy$L");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "@oy$L", (-6));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0, (ErrorReporter) null);
      // Undeclared exception!
      try { 
        parser0.parse("msg.no.brace.switch", "msg.destruct.assign.no.init", 46);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      Parser parser0 = new Parser(compilerEnvirons0, defaultErrorReporter0);
      StringReader stringReader0 = new StringReader("(new Boolean(true))");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "k\" O5_`z9OT", (-1996));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Context context0 = new Context();
      ErrorReporter errorReporter0 = context0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      StringReader stringReader0 = new StringReader("delete ");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "language version", (-1));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unexpected end of file
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0, (ErrorReporter) null);
      StringReader stringReader0 = new StringReader("~5/");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "", 113);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0, (ErrorReporter) null);
      StringReader stringReader0 = new StringReader("7=!v(u`+.'\"MG");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "", 47);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      // Undeclared exception!
      try { 
        parser0.parse("-\"w:lj%d>s<", "-\"w:lj%d>s<", 0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // illegal character
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      Parser parser0 = new Parser(compilerEnvirons0, defaultErrorReporter0);
      // Undeclared exception!
      try { 
        parser0.parse("+a)[b/Tl~p3oYsP", (String) null, 108);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // missing ; before statement
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      StringReader stringReader0 = new StringReader("f|< 1WA");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "XMLList", 153);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // illegally formed XML syntax (XMLList#153)
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      Parser parser0 = new Parser(compilerEnvirons0, defaultErrorReporter0);
      // Undeclared exception!
      try { 
        parser0.parse("NGY-LmN&XH", (String) null, (-3291));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      // Undeclared exception!
      try { 
        parser0.parse("WE[TfUu+[oi", "..", (-414));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -414
         //
         verifyException("org.mozilla.javascript.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      parser0.parse("C2FwP&_", "C2FwP&_", 6032);
      String string0 = parser0.getEncodedSource();
      assertEquals("\u0087'\u0005C2FwP\u000B'\u0001_Q\u0001", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      Parser parser0 = new Parser(compilerEnvirons0, defaultErrorReporter0);
      // Undeclared exception!
      try { 
        parser0.parse("mRL?", "xC9_Jlxph[>FC", 7);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unexpected end of file (xC9_Jlxph[>FC#7)
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      parser0.parse("Dc!=DuUNmjAA", "Dc!=DuUNmjAA", 3);
      // Undeclared exception!
      try { 
        parser0.defineSymbol(2, true, (String) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      // Undeclared exception!
      try { 
        parser0.parse("Ljava/lang/Integer;", "Ljava/lang/Integer;", (-511));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      ScriptOrFnNode scriptOrFnNode0 = parser0.parse("q:p", "q:p", 142);
      assertEquals("\u0087'\u0001qf\u0001'\u0001pQ\u0001", parser0.getEncodedSource());
      assertEquals(142, scriptOrFnNode0.getBaseLineno());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      // Undeclared exception!
      try { 
        parser0.parse("default", "default", 65535);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // not a valid default namespace statement. Syntax is: default xml namespace = EXPRESSION; (default#65535)
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      // Undeclared exception!
      try { 
        parser0.parse("var ", "var ", (-16));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -16
         //
         verifyException("org.mozilla.javascript.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0, (ErrorReporter) null);
      // Undeclared exception!
      try { 
        parser0.parse("while", "while", 669);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorReporter errorReporter0 = DefaultErrorReporter.forEval((ErrorReporter) null);
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      StringReader stringReader0 = new StringReader("if.P<{i ");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "-X9/Z\"", (-3401));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -3401
         //
         verifyException("org.mozilla.javascript.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      // Undeclared exception!
      try { 
        parser0.parse(";vYDR", ";vYDR", (-2687));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0, (ErrorReporter) null);
      // Undeclared exception!
      try { 
        parser0.parse("throw", "log", 4494);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      Parser parser0 = new Parser(compilerEnvirons0, defaultErrorReporter0);
      // Undeclared exception!
      try { 
        parser0.parse("continue", "language version", (-891));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -891
         //
         verifyException("org.mozilla.javascript.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      Parser parser0 = new Parser(compilerEnvirons0, defaultErrorReporter0);
      StringReader stringReader0 = new StringReader(") {");
      stringReader0.read();
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "resources", 53);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // missing } in compound statement (resources#53)
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      compilerEnvirons0.initFromContext(context0);
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      ScriptOrFnNode scriptOrFnNode0 = parser0.parse("msg.caught.nfe", "msg.caught.nfe", 1449);
      assertEquals(23, scriptOrFnNode0.getEncodedSourceEnd());
      assertEquals(1449, scriptOrFnNode0.getLineno());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      ErrorReporter errorReporter0 = context0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      // Undeclared exception!
      try { 
        parser0.parse("for ", "error reporter", 700);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // missing ( after for (error reporter#700)
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      StringReader stringReader0 = new StringReader("zCoQ=$Roc");
      ScriptOrFnNode scriptOrFnNode0 = parser0.parse((Reader) stringReader0, "zCoQ=$Roc", 42);
      parser0.pushScope(scriptOrFnNode0);
      // Undeclared exception!
      try { 
        parser0.pushScope(scriptOrFnNode0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      compilerEnvirons0.setXmlAvailable(false);
      // Undeclared exception!
      try { 
        parser0.parse("default", "default", 65535);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // XML runtime not available (default#65535)
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      Parser parser0 = new Parser(compilerEnvirons0, defaultErrorReporter0);
      // Undeclared exception!
      try { 
        parser0.addWarning("msg.no.paren.for", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      Parser parser0 = new Parser(compilerEnvirons0, defaultErrorReporter0);
      StringReader stringReader0 = new StringReader("L,B<{SV");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "L,B<{SV", (-6));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -6
         //
         verifyException("org.mozilla.javascript.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      // Undeclared exception!
      try { 
        parser0.parse("{Z7}45CrP", "T,", 146);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // missing ; before statement (T,#146)
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      // Undeclared exception!
      try { 
        parser0.eof();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      String string0 = parser0.getEncodedSource();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      // Undeclared exception!
      try { 
        parser0.addError("O/\"Vaa&0_>$z", (String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property O/\"Vaa&0_>$z
         //
         verifyException("org.mozilla.javascript.ScriptRuntime$DefaultMessageProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0, (ErrorReporter) null);
      StringReader stringReader0 = new StringReader("@*).410@0gmi");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "@*).410@0gmi", 106);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      // Undeclared exception!
      try { 
        parser0.parse("msg.bad.throw.eol", "$'", (-4465));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      StringReader stringReader0 = new StringReader("SQ2i()*@#miUB>'");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "SQ2i()*@#miUB>'", 118);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // illegal character (SQ2i()*@#miUB>'#118)
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Context context0 = Context.enter();
      ErrorReporter errorReporter0 = context0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      ScriptOrFnNode scriptOrFnNode0 = parser0.parse("factory == null", "language version", 120);
      assertEquals("\u0087'\u0007factory\f*Q\u0001", parser0.getEncodedSource());
      assertEquals(120, scriptOrFnNode0.getLineno());
  }
}