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
        //�����������com.flexible.resources�µģ���.xmlΪ��׺����Դ�ļ�
        Resource[] resources = resourcePatternResolver.getResources("classpath:com/flexible/resources/**/*.xml");
        assertNotNull(resources);
        List<Resource> resourceList = Arrays.asList(resources);
        resourceList.forEach(e->{
            System.out.println(e.getFilename());
        });
    }
}
