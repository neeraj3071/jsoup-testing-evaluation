/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 09 00:43:47 GMT 2025
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.Connection;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.FormElement;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FormElement_ESTest extends FormElement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Tag tag0 = Tag.valueOf("select");
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "select", attributes0);
      formElement0.attr("disabled", "KC)U");
      FormElement formElement1 = formElement0.addElement(formElement0);
      List<Connection.KeyVal> list0 = formElement1.formData();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Tag tag0 = Tag.valueOf("xD;?.PSdb++nyYi)&");
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "", attributes0);
      Document document0 = new Document("I{");
      FormElement formElement1 = formElement0.addElement(document0);
      List<Connection.KeyVal> list0 = formElement1.formData();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      Tag tag0 = Tag.valueOf("method", parseSettings0);
      CDataNode cDataNode0 = new CDataNode("method");
      Attributes attributes0 = cDataNode0.attributes();
      Attributes attributes1 = attributes0.put("method", "POST");
      FormElement formElement0 = new FormElement(tag0, "POST", attributes1);
      // Undeclared exception!
      try { 
        formElement0.submit();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Malformed URL: POST
         //
         verifyException("org.jsoup.helper.HttpConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Tag tag0 = Tag.valueOf("POST");
      CDataNode cDataNode0 = new CDataNode("POST");
      Attributes attributes0 = cDataNode0.attributes();
      Attributes attributes1 = attributes0.put("action", "POST");
      FormElement formElement0 = new FormElement(tag0, "action", attributes1);
      // Undeclared exception!
      try { 
        formElement0.submit();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Could not determine a form action URL for submit. Ensure you set a base URI when parsing.
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      Tag tag0 = Tag.valueOf("method", parseSettings0);
      CDataNode cDataNode0 = new CDataNode("method");
      Attributes attributes0 = cDataNode0.attributes();
      FormElement formElement0 = new FormElement(tag0, "POST", attributes0);
      // Undeclared exception!
      try { 
        formElement0.submit();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Malformed URL: POST
         //
         verifyException("org.jsoup.helper.HttpConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Tag tag0 = Tag.valueOf("UPsQq'xro`");
      CDataNode cDataNode0 = new CDataNode("UPsQq'xro`");
      Attributes attributes0 = cDataNode0.attributes();
      FormElement formElement0 = new FormElement(tag0, "UPsQq'xro`", attributes0);
      Elements elements0 = formElement0.elements();
      assertTrue(elements0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Tag tag0 = Tag.valueOf("select");
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "select", attributes0);
      FormElement formElement1 = formElement0.addElement(formElement0);
      List<Connection.KeyVal> list0 = formElement1.formData();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Tag tag0 = Tag.valueOf("GV0EP's");
      CDataNode cDataNode0 = new CDataNode((String) null);
      Attributes attributes0 = cDataNode0.attributes();
      FormElement formElement0 = new FormElement(tag0, "GV0EP's", attributes0);
      // Undeclared exception!
      try { 
        formElement0.removeChild(cDataNode0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be true
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }
}
