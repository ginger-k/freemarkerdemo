package com.freemarkerdemo.method;

import java.io.File;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;

public class MethodConsole {

	public static void main(String[] args) throws Exception{
		//创建Freemarker配置实例
		Configuration cfg = new Configuration(Configuration.VERSION_2_3_23);
		cfg.setDirectoryForTemplateLoading(new File("templates"));
		cfg.setDefaultEncoding("UTF-8");
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
		
		//创建数据模型
		Map<String, Object> root = new HashMap<String, Object>();
		root.put("indexOf", new IndexOfMethod());
		
		//加载模板文件
		Template t1 = cfg.getTemplate("method.ftl");
		
		//显示生成的数据,将合并后的数据打印到控制台
		Writer out = new OutputStreamWriter(System.out);
		t1.process(root, out);
		out.flush();

		
	}
	
}
