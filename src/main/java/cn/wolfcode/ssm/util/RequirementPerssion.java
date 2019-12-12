package cn.wolfcode.ssm.util;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RequirementPerssion {

    //这里name的存在意义是在于,给这个方法起一个中文的别名，方便管理。
    //然后方便每次编译起来的时候，收集名字
    String name();


}
