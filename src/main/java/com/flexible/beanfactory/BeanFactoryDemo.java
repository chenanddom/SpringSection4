package com.flexible.beanfactory;

import com.flexible.ioc.iocstyle.Foreman;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartResolver;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-11-05
 * Time: 18:08
 */
public class BeanFactoryDemo {
//    MultipartHttpServletRequest
    public static void main(String[] args) throws IOException {
        ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
        Resource resource = resourcePatternResolver.getResource("classpath:iocdemo.xml");
        System.out.println(resource.getURL());
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(resource);
        Foreman foreman = factory.getBean("foreman",Foreman.class);
        foreman.setWorker(null);
        System.out.println("foreman is ready for use");
      /*  File file = new File("E:\\data.rar");
        FileInputStream input = new FileInputStream(file);
        MultipartFile multipartFile = new MockMultipartFile("file", file.getName(), "text/plain", IOUtils.toByteArray(input));

        MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest)multipartFile;
        System.out.println("foreman is ready for use");*/

    }
}
