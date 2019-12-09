package cn.wolfcode.ssm.util;


import com.alibaba.fastjson.JSON;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class JsonResult {


    //封装一些字段.
    private String msg;
    private boolean success = true;

    //默认的无参构造器，就是成功的意思
    //所以有参构造器大概率是失败了。！
    public JsonResult(String msg,boolean status){

        this.msg = msg;
        this.success = status;

    }

    public void mark(String msg){

        this.success = false;
        this.msg = msg;

    }

    public void test1(){



    }



}
