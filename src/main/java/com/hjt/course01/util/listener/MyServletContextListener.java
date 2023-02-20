package com.hjt.course01.util.listener;

import com.hjt.course01.entity.Product;
import com.hjt.course01.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContext;
import java.util.List;
@Component
public class MyServletContextListener implements ApplicationListener<ContextRefreshedEvent> {

    private static final Logger logger= LoggerFactory.getLogger(MyServletContextListener.class);

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

        logger.info("获取products监听器启动");
        // 先获取到application上下文
        ApplicationContext applicationContext = contextRefreshedEvent.getApplicationContext();
        // 获取对应的service
        ProductService productService = applicationContext.getBean(ProductService.class);
        List<Product> list = productService.getList();
        // 获取application域对象，将查到的信息放到application域中
        ServletContext application = applicationContext.getBean(ServletContext.class);
        application.setAttribute("products", list);
        logger.info("获取products监听器结束");
    }
}
