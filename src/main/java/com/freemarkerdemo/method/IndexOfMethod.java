package com.freemarkerdemo.method;

import java.util.List;

import freemarker.template.SimpleNumber;
import freemarker.template.SimpleScalar;
import freemarker.template.TemplateMethodModelEx;
import freemarker.template.TemplateModelException;

public class IndexOfMethod implements TemplateMethodModelEx {
	/*
	 * ${indexOf("met", "something")}  --  2
	 * 注意：list里获取的都是freemarker的数据类型，要先转换为java中的类型
	 */
	@Override
	public Object exec(@SuppressWarnings("rawtypes") List args) throws TemplateModelException {
		if (args.size() != 2) {
            throw new TemplateModelException("参数个数错误！");
        }
		int index = (((SimpleScalar)args.get(1)).toString()).indexOf(((SimpleScalar)args.get(0)).toString());
        return new SimpleNumber(index);
	}
}
