package com.gxf.slf4j;

/**
 * @Author: <guanxiangfei@meituan.com>
 * @Description:
 * @Date: Created in : 2018/11/19 9:24 PM
 **/
public class TestClassLoader {

  public static void main(String[] args) {
    ClassLoader classLoader = TestClassLoader.class.getClassLoader();
    while(classLoader != null){
      System.out.println(classLoader);
      classLoader = classLoader.getParent();
    }
  }

}
