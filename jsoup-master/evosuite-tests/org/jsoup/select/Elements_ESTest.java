/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 09 01:13:55 GMT 2025
 */

package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.regex.Pattern;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.PseudoTextElement;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.NodeFilter;
import org.jsoup.select.NodeVisitor;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Elements_ESTest extends Elements_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Element[] elementArray0 = new Element[6];
      Tag tag0 = Tag.valueOf("~bC)");
      CDataNode cDataNode0 = new CDataNode("");
      Attributes attributes0 = cDataNode0.attributes();
      FormElement formElement0 = new FormElement(tag0, " ", attributes0);
      elementArray0[5] = (Element) formElement0;
      Elements elements0 = new Elements(elementArray0);
      List<FormElement> list0 = elements0.forms();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Document document0 = new Document("");
      Pattern pattern0 = Pattern.compile("XtMcV<c!Q~I.cMC");
      Elements elements0 = document0.getElementsMatchingOwnText(pattern0);
      Element element0 = elements0.last();
      assertNull(element0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Element[] elementArray0 = new Element[4];
      Elements elements0 = new Elements(elementArray0);
      Element element0 = elements0.last();
      assertNull(element0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Document document0 = Document.createShell("`|aC$OY");
      Elements elements0 = document0.getElementsByClass("`|aC$OY");
      Element element0 = elements0.first();
      assertNull(element0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Document document0 = Document.createShell("noaldate");
      Elements elements0 = document0.getElementsByIndexEquals(0);
      Elements elements1 = elements0.next();
      assertEquals(1, elements1.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Document document0 = Document.createShell("novalidate");
      Elements elements0 = document0.getElementsByIndexEquals(1);
      Elements elements1 = elements0.prevAll("novalidate");
      assertEquals(0, elements1.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Element element0 = new Element("NpJ");
      Elements elements0 = element0.getElementsByAttributeValueNot("NpJ", "NpJ");
      boolean boolean0 = elements0.is("NpJ");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Document document0 = new Document("org.jsoup.parser.ParseSettings");
      Elements elements0 = document0.getElementsByAttributeValueNot("org.jsoup.parser.ParseSettings", "h4");
      boolean boolean0 = elements0.is("org.jsoup.parser.ParseSettings");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Document document0 = Document.createShell("`|aC$OY");
      Elements elements0 = document0.getElementsByClass("`|aC$OY");
      // Undeclared exception!
      try { 
        elements0.eq((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Elements elements0 = new Elements();
      Elements elements1 = elements0.eq(1061);
      assertNotSame(elements0, elements1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Document document0 = Document.createShell("");
      Pattern pattern0 = Pattern.compile("", 65535);
      Elements elements0 = document0.getElementsMatchingText(pattern0);
      // Undeclared exception!
      try { 
        elements0.remove();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedHashSet<Element> linkedHashSet0 = new LinkedHashSet<Element>();
      Elements elements0 = new Elements(linkedHashSet0);
      Elements elements1 = elements0.remove();
      assertTrue(elements1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Document document0 = Document.createShell("");
      Elements elements0 = document0.parents();
      elements0.add((Element) document0);
      elements0.empty();
      assertEquals(0, document0.childNodeSize());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Document document0 = new Document("");
      document0.normalise();
      Elements elements0 = document0.children();
      elements0.unwrap();
      assertEquals(2, document0.childNodeSize());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Document document0 = Document.createShell("InCaption");
      Elements elements0 = document0.children();
      Elements elements1 = elements0.wrap("^hP/4mL&8!,");
      assertSame(elements0, elements1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Document document0 = new Document("");
      document0.normalise();
      Elements elements0 = document0.children();
      // Undeclared exception!
      try { 
        elements0.after((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Elements elements0 = new Elements(2528);
      Elements elements1 = elements0.after("J");
      assertTrue(elements1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Tag tag0 = Tag.valueOf("(");
      Element element0 = new Element(tag0, "");
      Elements elements0 = element0.getAllElements();
      // Undeclared exception!
      try { 
        elements0.before("(");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedHashSet<Element> linkedHashSet0 = new LinkedHashSet<Element>();
      Elements elements0 = new Elements(linkedHashSet0);
      Elements elements1 = elements0.before("\"E2}%?&");
      assertSame(elements1, elements0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Element element0 = new Element("NpJ");
      Elements elements0 = element0.getElementsByAttributeValueNot("NpJ", "NpJ");
      elements0.prepend("NpJ");
      assertEquals(1, element0.childNodeSize());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Document document0 = Document.createShell("noaldate");
      Elements elements0 = document0.getElementsByIndexEquals(0);
      Elements elements1 = elements0.tagName("noaldate");
      Elements elements2 = elements1.next();
      elements2.prevAll("noaldate");
      assertEquals("noaldate", document0.tagName());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Document document0 = Document.createShell("D93:0I|4RT;(e3jZ");
      Elements elements0 = document0.getElementsContainingOwnText("");
      String string0 = elements0.outerHtml();
      assertEquals("<html>\n <head></head>\n <body></body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>\n<head></head>\n<body></body>", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Document document0 = Document.createShell("");
      Elements elements0 = document0.getElementsContainingOwnText("");
      String string0 = elements0.html();
      assertEquals("<html>\n <head></head>\n <body></body>\n</html>\n<head></head>\n<body></body>\n\n", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Document document0 = new Document("org.jsoup.parser.ParseSettings");
      document0.prepend("{/ @>0%");
      Elements elements0 = document0.getElementsByAttributeValueNot("^x1'unzm34@S}C", "h4");
      List<String> list0 = elements0.eachText();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Document document0 = Document.createShell("novalidate");
      Elements elements0 = document0.getElementsByIndexEquals(1);
      List<String> list0 = elements0.eachText();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Element[] elementArray0 = new Element[4];
      Document document0 = Document.createShell("GJ}p|oc]'");
      elementArray0[0] = (Element) document0;
      elementArray0[1] = (Element) document0;
      elementArray0[2] = (Element) document0;
      elementArray0[3] = (Element) document0;
      Elements elements0 = new Elements(elementArray0);
      Elements elements1 = elements0.append("5AK");
      boolean boolean0 = elements1.hasText();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Document document0 = new Document("org.jsoup.parser.ParseSettings");
      Elements elements0 = document0.getElementsByAttributeValueNot("org.jsoup.parser.ParseSettings", "h4");
      boolean boolean0 = elements0.hasText();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Document document0 = Document.createShell("1zfDCwgaq");
      Elements elements0 = document0.getElementsByAttributeValueNot("1zfDCwgaq", "1zfDCwgaq");
      Elements elements1 = elements0.html("1zfDCwgaq");
      String string0 = elements1.text();
      assertEquals("1zfDCwgaq 1zfDCwgaq 1zfDCwgaq 1zfDCwgaq", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Document document0 = Document.createShell("1zfDCwgaq");
      Elements elements0 = document0.getElementsByAttributeValueNot("1zfDCwgaq", "1zfDCwgaq");
      Elements elements1 = elements0.val("1zfDCwgaq");
      assertSame(elements1, elements0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Element[] elementArray0 = new Element[4];
      Elements elements0 = new Elements(elementArray0);
      // Undeclared exception!
      try { 
        elements0.val();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.select.Elements", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedHashSet<Element> linkedHashSet0 = new LinkedHashSet<Element>();
      Elements elements0 = new Elements(linkedHashSet0);
      String string0 = elements0.val();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Document document0 = Document.createShell("novalidate");
      Elements elements0 = document0.getElementsByIndexEquals(1);
      boolean boolean0 = elements0.hasClass("tDV:j5X&yz~vWc! PDu");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Document document0 = new Document("");
      Elements elements0 = document0.getElementsMatchingOwnText("");
      Elements elements1 = elements0.toggleClass("");
      assertEquals(1, elements1.size());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Document document0 = Document.createShell("novalidate");
      Elements elements0 = document0.getElementsByIndexEquals(1);
      Elements elements1 = elements0.removeClass("novalidate");
      assertFalse(elements1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Document document0 = Document.createShell("");
      Elements elements0 = document0.children();
      Elements elements1 = elements0.addClass("");
      assertSame(elements1, elements0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Tag tag0 = Tag.valueOf("}H>ogY$o`ou'G#");
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "}H>ogY$o`ou'G#", attributes0);
      PseudoTextElement pseudoTextElement0 = new PseudoTextElement(tag0, "4i0/%}", attributes0);
      FormElement formElement1 = formElement0.addElement(pseudoTextElement0);
      Elements elements0 = formElement1.elements();
      Elements elements1 = elements0.removeAttr("");
      assertFalse(elements1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Document document0 = new Document("org.jsoup.parser.ParseSettings");
      Elements elements0 = document0.getElementsByAttributeValueNot("org.jsoup.parser.ParseSettings", "h4");
      elements0.attr("org.jsoup.parser.ParseSettings", "h4");
      List<String> list0 = elements0.eachAttr("org.jsoup.parser.ParseSettings");
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Document document0 = new Document("org.jsoup.parser.ParseSettings");
      Elements elements0 = document0.getElementsByAttributeValueNot("org.jsoup.parser.ParseSettings", "h4");
      List<String> list0 = elements0.eachAttr("org.jsoup.parser.ParseSettings");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Document document0 = Document.createShell("P");
      Elements elements0 = document0.children();
      Elements elements1 = elements0.attr("P", "");
      boolean boolean0 = elements1.hasAttr("P");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Document document0 = new Document("org.jsoup.parser.ParseSettings");
      Elements elements0 = document0.getElementsByAttributeValueNot("org.jsoup.parser.ParseSettings", "h4");
      boolean boolean0 = elements0.hasAttr("h4");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Document document0 = new Document("org.jsoup.parser.ParseSettings");
      Elements elements0 = document0.getElementsByAttributeValueNot("org.jsoup.parser.ParseSettings", "h4");
      Elements elements1 = elements0.attr("org.jsoup.parser.ParseSettings", "h4");
      String string0 = elements1.attr("org.jsoup.parser.ParseSettings");
      assertEquals("h4", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Document document0 = Document.createShell("novalidate");
      Elements elements0 = document0.getElementsByIndexEquals(1);
      String string0 = elements0.attr("org.jsoup.nodes.Comment");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      Tag tag0 = Tag.valueOf(":/yLq;w#1]s[re", parseSettings0);
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "type", attributes0);
      Elements elements0 = formElement0.getElementsContainingOwnText("");
      Elements elements1 = elements0.clone();
      assertNotSame(elements1, elements0);
      assertEquals(1, elements1.size());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Document document0 = Document.createShell(" ");
      Elements elements0 = document0.getElementsByAttributeValue(" ", " ");
      String string0 = elements0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Document document0 = Document.createShell("D93:0I|4RT;(e3jZ");
      Elements elements0 = document0.getElementsContainingOwnText("");
      // Undeclared exception!
      try { 
        elements0.prev("");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Could not parse query '': unexpected token at ''
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Element[] elementArray0 = new Element[4];
      Elements elements0 = new Elements(elementArray0);
      // Undeclared exception!
      try { 
        elements0.not("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // String must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Document document0 = Document.createShell("D93:0I|4RT;(e3jZ");
      Elements elements0 = document0.getElementsContainingOwnText("");
      NodeVisitor nodeVisitor0 = mock(NodeVisitor.class, new ViolatedAssumptionAnswer());
      Elements elements1 = elements0.traverse(nodeVisitor0);
      assertSame(elements0, elements1);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Elements elements0 = new Elements(4187);
      // Undeclared exception!
      try { 
        elements0.select("<![CDATA[");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Could not parse query '<![CDATA[': unexpected token at '<![CDATA['
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Document document0 = Document.createShell("P");
      Elements elements0 = document0.children();
      Elements elements1 = elements0.parents();
      assertFalse(elements1.equals((Object)elements0));
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Document document0 = new Document("org.jsoup.parser.ParseSettings");
      Elements elements0 = document0.getElementsByAttributeValueNot("^x1'unzm34@S}C", "h4");
      Elements elements1 = elements0.nextAll();
      assertEquals(0, elements1.size());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Document document0 = Document.createShell("novalidate");
      Elements elements0 = document0.getElementsByIndexEquals(0);
      NodeFilter nodeFilter0 = mock(NodeFilter.class, new ViolatedAssumptionAnswer());
      doReturn((NodeFilter.FilterResult) null, (NodeFilter.FilterResult) null, (NodeFilter.FilterResult) null).when(nodeFilter0).head(any(org.jsoup.nodes.Node.class) , anyInt());
      Elements elements1 = elements0.filter(nodeFilter0);
      assertSame(elements1, elements0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Elements elements0 = new Elements(0);
      Elements elements1 = elements0.prev();
      assertNotSame(elements1, elements0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      Tag tag0 = Tag.valueOf(":/yLq;w#1]s[re", parseSettings0);
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "type", attributes0);
      Elements elements0 = formElement0.getElementsContainingOwnText("");
      // Undeclared exception!
      try { 
        elements0.next(":/yLq;w#1]s[re");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Could not parse query ':/yLq;w#1]s[re': unexpected token at ':/yLq;w#1]s[re'
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Document document0 = Document.createShell("P");
      Elements elements0 = document0.children();
      Elements elements1 = elements0.prevAll();
      assertEquals(0, elements1.size());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Document document0 = Document.createShell(" ");
      Elements elements0 = document0.getElementsByAttributeValue(" ", " ");
      Elements elements1 = elements0.nextAll("org.jsoup.select.Elements");
      assertNotSame(elements1, elements0);
  }
}
