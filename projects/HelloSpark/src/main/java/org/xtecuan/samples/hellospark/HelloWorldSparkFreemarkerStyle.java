/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package org.xtecuan.samples.hellospark;

import freemarker.template.Template;
import java.util.HashMap;
import java.util.Map;
import org.xtecuan.samples.hellospark.util.TemplateUtil;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

/**
 *
 * @author xtecuan
 */
public class HelloWorldSparkFreemarkerStyle {

  public static void main(String[] args) {
    Spark.get(new Route("/") {
      private static final String TEMPLATE_NAME = "hello";

      @Override
      public Object handle(Request rqst, Response rspns) {
        Template hello = null;
        String result = null;
        try {
          hello = TemplateUtil.getTemplate(TEMPLATE_NAME);
          Map<String, Object> params = new HashMap<>();
          params.put("name", "Xtecuan");
          result = TemplateUtil.fillAndGetTemplateResult(hello, params);
        } catch (Exception ex) {
          halt(500);
          ex.printStackTrace();
        } finally {
          return result;
        }
      }
    });

    Spark.get(new Route("/hello/:user") {
      private static final String TEMPLATE_NAME = "greeting";

      @Override
      public Object handle(Request rqst, Response rspns) {
        Template greeting = null;
        String result = null;
        try {
          greeting = TemplateUtil.getTemplate(TEMPLATE_NAME);
          Map<String, Object> params = new HashMap<>();
          params.put("name", rqst.params(":user"));
          result = TemplateUtil.fillAndGetTemplateResult(greeting, params);
        } catch (Exception ex) {
          halt(500);
          ex.printStackTrace();
        } finally {
          return result;
        }
      }
    });
  }
}
