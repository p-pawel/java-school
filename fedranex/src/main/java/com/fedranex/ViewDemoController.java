//package com.fedranex;
//
//import org.springframework.beans.BeansException;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContextAware;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Set;
//
//@RestController
//@RequestMapping
//public class ViewDemoController implements ApplicationContextAware {
//
//    private ApplicationContext applicationContext;
//
//    @GetMapping
//    public Set<String> get() {
//        return applicationContext.getBeansOfType(Object.class).keySet();
////        return "index";
//    }
//
//    @Override
//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        this.applicationContext = applicationContext;
//    }
//}
