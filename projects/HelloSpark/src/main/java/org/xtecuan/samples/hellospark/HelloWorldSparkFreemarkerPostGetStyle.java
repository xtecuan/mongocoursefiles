/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package org.xtecuan.samples.hellospark;

import freemarker.template.Template;
import java.util.Arrays;
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
public class HelloWorldSparkFreemarkerPostGetStyle {

  public static void main(String[] args) {
    Spark.get(new Route("/") {
      private static final String TEMPLATE_NAME = "fruitForm";

      @Override
      public Object handle(Request rqst, Response rspns) {
        Template fruitForm = null;
        String result = null;
        try {
          fruitForm = TemplateUtil.getTemplate(TEMPLATE_NAME);
          Map<String, Object> params = new HashMap<>();
          params.put("fruits", Arrays.asList("apple", "orange", "banana", "peach"));
          result = TemplateUtil.fillAndGetTemplateResult(fruitForm, params);
        } catch (Exception ex) {
          halt(500);
          ex.printStackTrace();
        } finally {
          return result;
        }
      }
    });

    Spark.post(new Route("/favorite_fruit") {

      @Override
      public Object handle(Request rqst, Response rspns) {
        String result = "Why don't you pick one?";
        final String fruit = rqst.queryParams("fruit");

        if (fruit == null) {
        } else {
          result = "Your favorite fruit is " + fruit;
        }

        return result;
      }
    });
  }
}
