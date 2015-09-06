package demo;

import java.io.File;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class ConsoleDemo {
	
	public static void main(String[] args) throws Exception{
		//创建Freemarker配置实例
		Configuration cfg = new Configuration();
		
		cfg.setDirectoryForTemplateLoading(new File("templates")); 
		
		//创建数据模型
		Map<String, String> root = new HashMap<String, String>();
		root.put("user", "老高");
		
		//加载模板文件
		Template t1 = cfg.getTemplate("a.ftl");
		
		//显示生成的数据,//将合并后的数据打印到控制台
		Writer out = new OutputStreamWriter(System.out);
		//可以用于生成java文件
//		Writer out = new OutputStreamWriter(new FileOutputStream(new File("templates/demo.java"))); 
		t1.process(root, out);
		out.flush();

		
	}

}
