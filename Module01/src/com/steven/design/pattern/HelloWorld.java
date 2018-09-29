package com.steven.design.pattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * 执行(run) 	 	                                   alt+r
 * 提示补全 (Class Name Completion)  	 	 	       alt+/
 * 单行注释 	 	 	 	 	 	 	                   ctrl + /
 * 多行注释 	                                           ctrl + shift + /
 * 向下复制一行 (Duplicate Lines)  	 	 	           ctrl+alt+down
 * 删除一行或选中行 (delete line)  	 	 	           ctrl+d
 * 向下移动行(move statement down)  	 	 	           alt+down
 * 向上移动行(move statement up)  	 	 	 	       alt+up
 * 向下开始新的一行(start new line) 	 	 	 	       shift+enter
 * 向上开始新的一行 (Start New Line before current)      	ctrl+shift+enter
 * 如何查看源码 (class) 	 	 	 	 	ctrl + 选中指定的结构 或
 * ctrl + shift + t
 * 万能解错/生成返回值变量  	 	 	 	alt + enter
 * 退回到前一个编辑的页面 (back) 	 	 	 	alt + left
 * 进入到下一个编辑的页面(针对于上条) (forward)    	alt + right
 * 查看继承关系(type hierarchy) 	 	 	 	F4
 */
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("这是我的第二个Idea工程！");

        List<String> lists = new ArrayList<>();

        lists.add(0,"Jordan");
        System.out.println(lists);


//        test();






    }

    public static void test() {
        System.out.println("我是本类的第二个方法！");

        try {
            FileInputStream fos = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
