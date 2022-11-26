package com.vodafone.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldController extends AbstractController {
  @Override
  protected ModelAndView handleRequestInternal(
      HttpServletRequest request, HttpServletResponse response) throws Exception {
    ModelAndView modelAndView = new ModelAndView("helloWorld");
    modelAndView.addObject("message", "hello world from spring mvc");
    return modelAndView;
  }
}
