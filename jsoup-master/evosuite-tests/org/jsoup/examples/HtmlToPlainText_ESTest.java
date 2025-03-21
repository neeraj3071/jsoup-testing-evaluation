/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 09 00:20:06 GMT 2025
 */

package org.jsoup.examples;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.examples.HtmlToPlainText;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HtmlToPlainText_ESTest extends HtmlToPlainText_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HtmlToPlainText htmlToPlainText0 = new HtmlToPlainText();
      Document document0 = new Document("\n <>");
      document0.prepend("\n <>");
      document0.appendTo(document0);
      // Undeclared exception!
      htmlToPlainText0.getPlainText(document0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HtmlToPlainText htmlToPlainText0 = new HtmlToPlainText();
      Document document0 = new Document("\n <>");
      Document document1 = (Document)document0.prepend("\n <>");
      Document document2 = document1.normalise();
      String string0 = htmlToPlainText0.getPlainText(document2);
      assertEquals(" <> ", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HtmlToPlainText htmlToPlainText0 = new HtmlToPlainText();
      Document document0 = new Document("  ");
      document0.prependElement("br");
      document0.prepend("  ");
      document0.appendTo(document0);
      // Undeclared exception!
      htmlToPlainText0.getPlainText(document0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HtmlToPlainText htmlToPlainText0 = new HtmlToPlainText();
      Tag tag0 = Tag.valueOf("a");
      Element element0 = new Element(tag0, "a");
      String string0 = htmlToPlainText0.getPlainText(element0);
      assertEquals(" <>", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HtmlToPlainText htmlToPlainText0 = new HtmlToPlainText();
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      Tag tag0 = Tag.valueOf("p", parseSettings0);
      Attributes attributes0 = new Attributes();
      Element element0 = new Element(tag0, "p", attributes0);
      String string0 = htmlToPlainText0.getPlainText(element0);
      assertEquals("\n\n", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HtmlToPlainText htmlToPlainText0 = new HtmlToPlainText();
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      Tag tag0 = Tag.valueOf("dt", parseSettings0);
      Attributes attributes0 = new Attributes();
      Element element0 = new Element(tag0, "dt", attributes0);
      String string0 = htmlToPlainText0.getPlainText(element0);
      assertEquals("  \n", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      HtmlToPlainText htmlToPlainText0 = new HtmlToPlainText();
      Element element0 = new Element("li");
      element0.appendText("li");
      String string0 = htmlToPlainText0.getPlainText(element0);
      assertEquals("\n * li", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      String[] stringArray0 = new String[2];
      // Undeclared exception!
      try { 
        HtmlToPlainText.main(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must supply a valid URL
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      String[] stringArray0 = new String[9];
      // Undeclared exception!
      try { 
        HtmlToPlainText.main(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // usage: java -cp jsoup.jar org.jsoup.examples.HtmlToPlainText url [selector]
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        HtmlToPlainText.main(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must supply a valid URL
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }
}
