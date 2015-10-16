/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package org.xtecuan.samples.hellospark.util;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Map;
import org.xtecuan.samples.hellospark.HelloWorldFreemarkerStyle;

/**
 *
 * @author xtecuan
 */
public class TemplateUtil {

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
}
