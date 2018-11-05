package com.flexible.springresource;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.PathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.WritableResource;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-11-02
 * Time: 13:47
 */
public class FileSourceDemo {

    public static void main(String[] args) {

        String filePath = "E:\\BaiduNetdiskDownload\\wangpan\\SpringSection4\\src\\main\\resources\\conf\\file1.txt";
        try {
            //使用系统文件路径方式加载文件
            WritableResource res1 = new PathResource(filePath);
            //使用类路径方式加载文件
            Resource res2 = new ClassPathResource("conf/file1.txt");
            //使用WritableResource接口写资源文件
            OutputStream stream1 = res1.getOutputStream();
            stream1.write("这是使用spring Resource接口的例子".getBytes());
            stream1.close();
            //使用Resource接口读资源文件
            InputStream ins1 = res1.getInputStream();
            InputStream ins2 = res2.getInputStream();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            int i;
            while ((i = ins1.read()) != -1) {
                baos.write(i);
            }
            System.out.println(baos.toString());
            System.out.println("res1:" + res1.getFilename());
            System.out.println("res2:" + res2.getFilename());
            Resource relative = res1.createRelative("createFile.txt");

            System.out.println(relative.getFilename());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
