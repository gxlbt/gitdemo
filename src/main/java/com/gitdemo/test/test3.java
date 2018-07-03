package com.gitdemo.test;


import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 使用freemarker生成静态html
 */
public class test3 {

    //创建一个Freemarker的Configuration对象
    public static void main(String[] args) {
        try{
            Configuration configuration = new Configuration();
            configuration.setDirectoryForTemplateLoading(new File("E:\\IdeaProjects\\GitDemo01\\src\\main\\webapp\\WEB-INF\\template"));
            configuration.setObjectWrapper(new DefaultObjectWrapper());
            configuration.setDefaultEncoding("UTF-8");//设置默认编码

            //获取创建一个模板
            Template template = configuration.getTemplate("static.ftl");
            Map<String,Object> paramMap = new HashMap<String,Object>();
            paramMap.put("description","我正在学习使用Freemarker生成静态文件！");
            List<String> nameList = new ArrayList<String>();
            nameList.add("陈靖仇");
            nameList.add("玉儿");
            nameList.add("宇文拓");
            paramMap.put("nameList",nameList);

            Map<String,Object> weaponMap = new HashMap<String,Object>();
            weaponMap.put("first","轩辕剑");
            weaponMap.put("second","崆峒印");
            weaponMap.put("third","女娲石");
            weaponMap.put("fourth","神农鼎");
            weaponMap.put("fifth","伏羲琴");
            weaponMap.put("sixth","昆仑镜");
            weaponMap.put("seventh",null);
            paramMap.put("weaponMap",weaponMap);

            Writer writer = new OutputStreamWriter(new FileOutputStream("success.html"));
            template.process(paramMap,writer);
            System.out.println("恭喜，生成成功！");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
