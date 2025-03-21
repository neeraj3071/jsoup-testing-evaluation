/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 09 01:10:41 GMT 2025
 */

package org.jsoup.safety;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.safety.Whitelist;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Whitelist_ESTest extends Whitelist_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Whitelist.Protocol whitelist_Protocol0 = new Whitelist.Protocol("I]!;1dB)IJ$NH'");
      boolean boolean0 = whitelist_Protocol0.equals(" il:U2n:._(9[sD+Q");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Whitelist.Protocol whitelist_Protocol0 = new Whitelist.Protocol("Ejf[");
      boolean boolean0 = whitelist_Protocol0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Whitelist whitelist0 = Whitelist.basic();
      Attributes attributes0 = whitelist0.getEnforcedAttributes("~gIH8_Eu`]v5a");
      assertEquals(0, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Whitelist whitelist0 = Whitelist.simpleText();
      String[] stringArray0 = new String[2];
      stringArray0[0] = " il:U2n:._(9[sD+Q";
      stringArray0[1] = "uz<yK767cE\"k\"M^@e";
      Whitelist whitelist1 = whitelist0.addAttributes(" il:U2n:._(9[sD+Q", stringArray0);
      Whitelist whitelist2 = whitelist1.preserveRelativeLinks(true);
      Document document0 = Document.createShell(" il:U2n:._(9[sD+Q");
      Attributes attributes0 = new Attributes();
      whitelist0.addProtocols(" il:U2n:._(9[sD+Q", "uz<yK767cE\"k\"M^@e", stringArray0);
      Attribute attribute0 = new Attribute("uz<yK767cE\"k\"M^@e", " il:U2n:._(9[sD+Q", attributes0);
      boolean boolean0 = whitelist2.isSafeAttribute(" il:U2n:._(9[sD+Q", document0, attribute0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Whitelist whitelist0 = Whitelist.simpleText();
      whitelist0.addEnforcedAttribute("em", "uz<yK767cE\"k\"M^@e", "uz<yK767cE\"k\"M^@e");
      Document document0 = Document.createShell("em");
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = new Attribute("uz<yK767cE\"k\"M^@e", "em", attributes0);
      boolean boolean0 = whitelist0.isSafeAttribute("em", document0, attribute0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Whitelist whitelist0 = Whitelist.simpleText();
      String[] stringArray0 = new String[2];
      stringArray0[0] = " il:U2n:._(9[sD+Q";
      stringArray0[1] = "uz<yK767cE\"k\"M^@e";
      Document document0 = Document.createShell(" il:U2n:._(9[sD+Q");
      whitelist0.addAttributes("uz<yK767cE\"k\"M^@e", stringArray0);
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = new Attribute("uz<yK767cE\"k\"M^@e", " il:U2n:._(9[sD+Q", attributes0);
      Whitelist whitelist1 = whitelist0.addProtocols("uz<yK767cE\"k\"M^@e", "height", stringArray0);
      boolean boolean0 = whitelist1.isSafeAttribute("uz<yK767cE\"k\"M^@e", document0, attribute0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Whitelist whitelist0 = Whitelist.simpleText();
      String[] stringArray0 = new String[2];
      stringArray0[0] = " il:U2n:._(9[sD+Q";
      stringArray0[1] = "uz<yK767cE\"k\"M^@e";
      Whitelist whitelist1 = whitelist0.addAttributes(" il:U2n:._(9[sD+Q", stringArray0);
      Document document0 = Document.createShell(" il:U2n:._(9[sD+Q");
      Attributes attributes0 = new Attributes();
      whitelist1.addProtocols(" il:U2n:._(9[sD+Q", "uz<yK767cE\"k\"M^@e", stringArray0);
      Attribute attribute0 = new Attribute("uz<yK767cE\"k\"M^@e", " il:U2n:._(9[sD+Q", attributes0);
      boolean boolean0 = whitelist0.isSafeAttribute(" il:U2n:._(9[sD+Q", document0, attribute0);
      assertEquals(" il:U2n:._(9[sD+Q", attribute0.getValue());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Whitelist whitelist0 = Whitelist.simpleText();
      String[] stringArray0 = new String[2];
      stringArray0[0] = " il:U2n:._(9[sD+Q";
      stringArray0[1] = "uz<yK767cE\"k\"M^@e";
      whitelist0.addAttributes(" il:U2n:._(9[sD+Q", stringArray0);
      Document document0 = Document.createShell(" il:U2n:._(9[sD+Q");
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = new Attribute("uz<yK767cE\"k\"M^@e", " il:U2n:._(9[sD+Q", attributes0);
      boolean boolean0 = whitelist0.isSafeAttribute(" il:U2n:._(9[sD+Q", document0, attribute0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Whitelist whitelist0 = Whitelist.simpleText();
      String[] stringArray0 = new String[2];
      stringArray0[0] = " il:U2n:._(9[sD";
      stringArray0[1] = "uz<yK767cE\"k\"M^@e";
      Whitelist whitelist1 = whitelist0.addAttributes(" il:U2n:._(9[sD", stringArray0);
      Document document0 = Document.createShell(" il:U2n:._(9[sD");
      Attribute attribute0 = Attribute.createFromEncoded("I]!;1dB)IJ$NH'", "uz<yK767cE\"k\"M^@e");
      boolean boolean0 = whitelist1.isSafeAttribute(" il:U2n:._(9[sD", document0, attribute0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Whitelist whitelist0 = Whitelist.simpleText();
      String[] stringArray0 = new String[2];
      stringArray0[0] = " il:U2n:._(9[sD";
      stringArray0[1] = "uz<yK767cE\"k\"M^@e";
      whitelist0.addAttributes(" il:U2n:._(9[sD", stringArray0);
      boolean boolean0 = whitelist0.isSafeTag(" il:U2n:._(9[sD");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Whitelist whitelist0 = Whitelist.relaxed();
      boolean boolean0 = whitelist0.isSafeTag("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Whitelist whitelist0 = Whitelist.basic();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "cite";
      stringArray0[1] = "cite";
      stringArray0[2] = "cite";
      stringArray0[3] = "cite";
      stringArray0[4] = "org.jsoup.parser.TokeniserState$38";
      stringArray0[5] = "cite";
      stringArray0[6] = "cite";
      stringArray0[7] = "cite";
      Whitelist whitelist1 = whitelist0.removeProtocols("cite", "cite", stringArray0);
      assertSame(whitelist0, whitelist1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Whitelist whitelist0 = Whitelist.simpleText();
      String[] stringArray0 = new String[2];
      stringArray0[0] = " il:U2n:._(9[sD";
      stringArray0[1] = "uz<yK767cE\"k\"M^@e";
      whitelist0.addProtocols(" il:U2n:._(9[sD", " il:U2n:._(9[sD", stringArray0);
      Whitelist whitelist1 = whitelist0.removeProtocols(" il:U2n:._(9[sD", " il:U2n:._(9[sD", stringArray0);
      assertSame(whitelist0, whitelist1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Whitelist whitelist0 = Whitelist.simpleText();
      String[] stringArray0 = new String[2];
      stringArray0[0] = " il:U2n:._(9[sD";
      stringArray0[1] = "uz<yK767cE\"k\"M^@e";
      whitelist0.addProtocols(" il:U2n:._(9[sD", "uz<yK767cE\"k\"M^@e", stringArray0);
      // Undeclared exception!
      try { 
        whitelist0.removeProtocols(" il:U2n:._(9[sD", " il:U2n:._(9[sD", stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot remove a protocol that is not set.
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Whitelist whitelist0 = Whitelist.simpleText();
      String[] stringArray0 = new String[2];
      // Undeclared exception!
      try { 
        whitelist0.removeProtocols(":all", "caption", stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot remove a protocol that is not set.
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Whitelist whitelist0 = Whitelist.simpleText();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "VZ8&!";
      Whitelist whitelist1 = whitelist0.addProtocols("VZ8&!", "VZ8&!", stringArray0);
      Whitelist whitelist2 = whitelist1.addProtocols("VZ8&!", "VZ8&!", stringArray0);
      assertSame(whitelist0, whitelist2);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Whitelist whitelist0 = Whitelist.simpleText();
      String[] stringArray0 = new String[2];
      stringArray0[0] = " il:U2n:._(9[sD";
      stringArray0[1] = "uz<yK767cE\"k\"M^@e";
      whitelist0.addProtocols(" il:U2n:._(9[sD", "uz<yK767cE\"k\"M^@e", stringArray0);
      whitelist0.addProtocols(" il:U2n:._(9[sD", " il:U2n:._(9[sD", stringArray0);
      Whitelist whitelist1 = whitelist0.removeProtocols(" il:U2n:._(9[sD", " il:U2n:._(9[sD", stringArray0);
      assertSame(whitelist1, whitelist0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Whitelist whitelist0 = Whitelist.simpleText();
      whitelist0.addEnforcedAttribute("t&", "<3gF@Ea@f>", "t&");
      Whitelist whitelist1 = whitelist0.removeEnforcedAttribute("t&", "<3gF@Ea@f>");
      assertSame(whitelist0, whitelist1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Whitelist whitelist0 = Whitelist.basic();
      Whitelist whitelist1 = whitelist0.removeEnforcedAttribute("cite", "cite");
      assertSame(whitelist0, whitelist1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Whitelist whitelist0 = Whitelist.simpleText();
      Whitelist whitelist1 = whitelist0.removeEnforcedAttribute("height", "height");
      assertSame(whitelist0, whitelist1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Whitelist whitelist0 = new Whitelist();
      whitelist0.addEnforcedAttribute("W:~U|$kT [{%^6/*", "W:~U|$kT [{%^6/*", "W:~U|$kT [{%^6/*");
      Whitelist whitelist1 = whitelist0.addEnforcedAttribute("W:~U|$kT [{%^6/*", "W:~U|$kT [{%^6/*", "W:~U|$kT [{%^6/*");
      assertSame(whitelist0, whitelist1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Whitelist whitelist0 = Whitelist.basic();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "ol";
      stringArray0[1] = "ol";
      stringArray0[2] = "ol";
      stringArray0[3] = "ol";
      stringArray0[4] = "ol";
      stringArray0[5] = "Ejf[";
      stringArray0[6] = "ol";
      stringArray0[7] = "ol";
      stringArray0[8] = "ol";
      Whitelist whitelist1 = whitelist0.addAttributes("ol", stringArray0);
      Whitelist whitelist2 = whitelist0.removeAttributes(":all", stringArray0);
      assertSame(whitelist2, whitelist1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Whitelist whitelist0 = Whitelist.relaxed();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "ol";
      stringArray0[1] = "ol";
      stringArray0[2] = "ol";
      stringArray0[3] = "ol";
      stringArray0[4] = "ol";
      stringArray0[5] = "Ejf[";
      stringArray0[6] = "ol";
      stringArray0[7] = "ol";
      stringArray0[8] = "ol";
      Whitelist whitelist1 = whitelist0.removeAttributes("ol", stringArray0);
      assertSame(whitelist1, whitelist0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Whitelist whitelist0 = Whitelist.basic();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "ol";
      stringArray0[1] = "ol";
      stringArray0[2] = "ol";
      stringArray0[3] = "ol";
      stringArray0[4] = "ol";
      stringArray0[5] = "Ejf[";
      stringArray0[6] = "ol";
      stringArray0[7] = "ol";
      stringArray0[8] = "ol";
      Whitelist whitelist1 = whitelist0.removeAttributes("ol", stringArray0);
      assertSame(whitelist1, whitelist0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Whitelist whitelist0 = Whitelist.simpleText();
      String[] stringArray0 = new String[2];
      stringArray0[0] = " il:U2n:._(9[sD";
      stringArray0[1] = "uz<yK767cE\"k\"M^@e";
      whitelist0.addAttributes("uz<yK767cE\"k\"M^@e", stringArray0);
      Whitelist whitelist1 = whitelist0.removeAttributes("uz<yK767cE\"k\"M^@e", stringArray0);
      assertSame(whitelist0, whitelist1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Whitelist whitelist0 = Whitelist.simpleText();
      String[] stringArray0 = new String[2];
      stringArray0[0] = " il:U2n:._(9[sD";
      stringArray0[1] = "uz<yK767cE\"k\"M^@e";
      whitelist0.addAttributes("uz<yK767cE\"k\"M^@e", stringArray0);
      Whitelist whitelist1 = whitelist0.addAttributes("uz<yK767cE\"k\"M^@e", stringArray0);
      assertSame(whitelist0, whitelist1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Whitelist whitelist0 = new Whitelist();
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        whitelist0.addAttributes("s2sjc2]R", stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No attribute names supplied.
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Whitelist whitelist0 = Whitelist.simpleText();
      Document document0 = Document.createShell(" il:U2n:._(9[sD");
      Attribute attribute0 = Attribute.createFromEncoded("I]!;1dB)IJ$NH'", "uz<yK767cE\"k\"M^@e");
      whitelist0.addEnforcedAttribute(" il:U2n:._(9[sD", " il:U2n:._(9[sD", "I]!;1dB)IJ$NH'");
      whitelist0.isSafeAttribute(" il:U2n:._(9[sD", document0, attribute0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Whitelist whitelist0 = Whitelist.relaxed();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "ol";
      stringArray0[1] = "ol";
      stringArray0[2] = "ol";
      stringArray0[3] = "ol";
      stringArray0[4] = "ol";
      stringArray0[5] = "Ejf[";
      stringArray0[6] = "ol";
      stringArray0[7] = "ol";
      stringArray0[8] = "ol";
      Whitelist whitelist1 = whitelist0.removeTags(stringArray0);
      assertSame(whitelist1, whitelist0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Whitelist whitelist0 = Whitelist.basicWithImages();
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        whitelist0.removeAttributes(":first-of-type", stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No attribute names supplied.
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Whitelist whitelist0 = Whitelist.none();
      Whitelist whitelist1 = whitelist0.addEnforcedAttribute("x7[w;@Wy$", "Uw@T.FRB#Cj(qD2jH[", "x7[w;@Wy$");
      Whitelist whitelist2 = whitelist1.removeEnforcedAttribute("x7[w;@Wy$", "x7[w;@Wy$");
      assertSame(whitelist2, whitelist1);
  }
}
