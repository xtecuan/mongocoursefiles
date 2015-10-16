/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package org.xtecuan.samples.hellospark;

import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

/**
 *
 * @author xtecuan
 */
public class HelloWorldSparkStyle {

  public static void main(String[] args) {
    Spark.get(new Route("/") {

      @Override
      public Object handle(Request rqst, Response rspns) {
        return "Hello World from Spark";
      }
    });
  }
}
