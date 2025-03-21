/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 09 00:42:20 GMT 2025
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.CharArrayWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Entities;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Entities_ESTest extends Entities_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Charset charset0 = Charset.defaultCharset();
      document_OutputSettings0.charset(charset0);
      String string0 = Entities.escape("title", document_OutputSettings0);
      assertEquals("title", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.charset("ascii");
      // Undeclared exception!
      try { 
        Entities.escape((Appendable) null, ",", document_OutputSettings1, true, true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Entities", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = Entities.escape("~8|s%qX_\"");
      assertEquals("~8|s%qX_\"", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Entities.escape((Appendable) stringWriter0, "Qy-=hlosvu>B6-s", document_OutputSettings0, true, false, true);
      assertEquals("Qy-=hlosvu>B6-s", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.xhtml;
      document_OutputSettings0.escapeMode(entities_EscapeMode0);
      Entities.escape((Appendable) stringWriter0, "</", document_OutputSettings0, true, false, false);
      assertEquals("&lt;/", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = Entities.escape("</");
      assertEquals("&lt;/", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = Entities.escape("Qy-=hlosv1u>B6-s");
      assertEquals("Qy-=hlosv1u&gt;B6-s", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Entities.escape((Appendable) stringWriter0, "&lt;/", document_OutputSettings0, true, true, true);
      assertEquals("&amp;lt;/", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(66);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(charArrayWriter0);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Entities.escape((Appendable) mockPrintWriter0, "TW@KyS\"rs{e4b-3,", document_OutputSettings0, true, true, true);
      assertEquals("TW@KyS&quot;rs{e4b-3,", charArrayWriter0.toString());
      assertEquals(21, charArrayWriter0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockFileWriter mockFileWriter0 = new MockFileWriter("kvxSuvJdhU;9>");
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Entities.escape((Appendable) mockFileWriter0, "Patte  syntax $rro4:8", document_OutputSettings0, false, true, true);
      assertTrue(document_OutputSettings0.prettyPrint());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockFileWriter mockFileWriter0 = new MockFileWriter("`c(BwT1z]3(gVXiYT", true);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Entities.escape((Appendable) mockFileWriter0, " <*-mD68LQc", document_OutputSettings0, true, true, true);
      assertEquals(1, document_OutputSettings0.indentAmount());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockFileWriter mockFileWriter0 = new MockFileWriter("`c(BwT1z]3(gVXiYT", false);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Entities.escape((Appendable) mockFileWriter0, "PatterL syntax $rror: ", document_OutputSettings0, false, true, false);
      assertEquals(Entities.EscapeMode.base, document_OutputSettings0.escapeMode());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = Entities.escape((String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[5];
      int int0 = Entities.codepointsForName("", intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = Entities.getByName("gt");
      assertNotNull(string0);
      assertEquals(">", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = Entities.getByName("`c(BwT1z]3(gVXiYT");
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = Entities.isBaseNamedEntity("NyG}OjQgTiy u");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      boolean boolean0 = Entities.isNamedEntity("apos");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      boolean boolean0 = Entities.isNamedEntity("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.extended;
      String string0 = entities_EscapeMode0.nameForCodepoint(39);
      assertEquals("apos", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.base;
      String string0 = entities_EscapeMode0.nameForCodepoint(62);
      assertEquals("gt", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.xhtml;
      String string0 = entities_EscapeMode0.nameForCodepoint(62);
      assertEquals("gt", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.base;
      String string0 = entities_EscapeMode0.nameForCodepoint((-12));
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = Entities.unescape("Qy-=hlosv1u&gt;B6-s", false);
      assertEquals("Qy-=hlosv1u>B6-s", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = Entities.unescape("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Character character0 = Entities.getCharacterByName("");
      assertEquals('\uFFFF', (char)character0);
  }
}
