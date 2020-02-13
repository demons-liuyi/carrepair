package com.accp.controller;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

public class checkObjectIsNullUtils {
	
	public  boolean objCheckIsNull(Object object){
        Class clazz = (Class)object.getClass(); 
        Field fields[] = clazz.getDeclaredFields(); 
        boolean flag = true; 
        for(Field field : fields){
            field.setAccessible(true);
            Object fieldValue = null;
            try {
                fieldValue = field.get(object); 
                Type fieldType =field.getGenericType();
                String fieldName = field.getName(); 
                System.out.println("属性类型："+fieldType+",属性名："+fieldName+",属性值："+fieldValue);
                if(fieldName=="check") {
                	System.out.println("跳过");
                	continue;
                }
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            
            if(fieldValue != null&&fieldValue.toString().length()>0){  
                flag = false;
                System.out.println("结束判断");
                break;
            }
        }
        return flag;
    }

}
