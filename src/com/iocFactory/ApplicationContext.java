package com.iocFactory;

import com.service.StudentService;

public interface ApplicationContext {

	Object getBean(String name);

}
