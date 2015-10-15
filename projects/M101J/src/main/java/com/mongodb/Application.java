package com.mongodb;

import static spark.Spark.*;

/**
 * Created by julianr on 10/15/2015.
 */
public class Application {

  // public static void main(String[] args) {
  //
  // System.out.println("Hello");
  // }
  public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }
}
