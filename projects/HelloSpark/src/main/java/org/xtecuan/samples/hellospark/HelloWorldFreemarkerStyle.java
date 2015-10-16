/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package org.xtecuan.samples.hellospark;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author xtecuan
 */
public class HelloWorldFreemarkerStyle {

  private static final Configuration configuration = new Configuration();

  private static void initConfig() {
    configuration.setClassForTemplateLoading(HelloWorldFreemarkerStyle.class, "/templates");
  }

  static {
    initConfig();
  }

  public static Template getTemplate(String name) throws IOException {

    return configuration.getTemplate(name + ".ftl");

  }

  public static String fillAndGetTemplateResult(Template current, Map<String, Object> params)
      throws TemplateException, IOException {
    StringWriter writer = new StringWriter();
    current.process(params, writer);
    return writer.toString();
  }

  public static void main(String[] args) {

    try {
      Template hello = getTemplate("hello");
      Map<String, Object> params = new HashMap<>();
      params.put("name", "Freemarker , Julian");
      String out = fillAndGetTemplateResult(hello, params);

      System.out.println(out);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
