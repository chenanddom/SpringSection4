package com.flexible.resources;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertNotNull;

public class PatternResolverDemo {

    public static void main(String[] args) throws IOException {
        ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
        //加载所有类包com.flexible.resources下的，以.xml为后缀的资源文件
        Resource[] resources = resourcePatternResolver.getResources("classpath:com/flexible/resources/**/*.xml");
        assertNotNull(resources);
        List<Resource> resourceList = Arrays.asList(resources);
        resourceList.forEach(e->{
            System.out.println(e.getFilename());
        });
    }
}
