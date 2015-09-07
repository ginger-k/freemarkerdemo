package com.freemarkerdemo.directive;

import java.io.IOException;
import java.io.Writer;
import java.util.Map;

import freemarker.core.Environment;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateDirectiveModel;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;
import freemarker.template.TemplateModelException;

public class UpperDirective implements TemplateDirectiveModel{

	@SuppressWarnings("rawtypes")
	@Override
	public void execute(Environment env, Map params, TemplateModel[] loopVars, TemplateDirectiveBody body)
			throws TemplateException, IOException {
		if (!params.isEmpty()) {
            throw new TemplateModelException("该指令不需要参数！");
        }
        if (loopVars.length != 0) {
                throw new TemplateModelException("该指令不需要循环变量！");
        }
        if (body != null) {
            //处理内嵌的数据，就像<#nested>，需要定义自己的Writer
            body.render(new UpperCaseFilterWriter(env.getOut()));
        } else {
            throw new RuntimeException("<@upper></upper>之间必须有数据！");
        }
	}
	
	private static class UpperCaseFilterWriter extends Writer {
	       
        private final Writer out;
           
        UpperCaseFilterWriter (Writer out) {
            this.out = out;
        }

        public void write(char[] cbuf, int off, int len) throws IOException {
            char[] transformedCbuf = new char[len];
            for (int i = 0; i < len; i++) {
                transformedCbuf[i] = Character.toUpperCase(cbuf[i + off]);
            }
            out.write(transformedCbuf);
        }

        public void flush() throws IOException {
            out.flush();
        }

        public void close() throws IOException {
            out.close();
        }
    }

}
