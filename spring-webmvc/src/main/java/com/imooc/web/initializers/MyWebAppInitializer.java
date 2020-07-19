//package com.imooc.web.initializers;
//
//import org.springframework.web.WebApplicationInitializer;
//import org.springframework.web.context.support.XmlWebApplicationContext;
//import org.springframework.web.servlet.DispatcherServlet;
//
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRegistration;
//
///**
// * {@link WebApplicationInitializer} 实现
// * 配置化方式替代 web.xml
// *
// * @Author: guangp
// * @Date: 2020-07-18
// */
//public class MyWebAppInitializer implements WebApplicationInitializer {
//    @Override
//    public void onStartup(ServletContext servletContext) throws ServletException {
//        XmlWebApplicationContext xmlContext = new XmlWebApplicationContext();
//        xmlContext.setConfigLocation("/WEB-INF/app-context.xml");
//
//        ServletRegistration.Dynamic dispatcherServlet = servletContext.addServlet("dispatcherServlet", DispatcherServlet.class);
//        dispatcherServlet.setLoadOnStartup(1);
//        dispatcherServlet.addMapping("/");
//        dispatcherServlet.setInitParameter("contextConfigLocation", "/WEB-INF/app-context.xml");
//    }
//}
