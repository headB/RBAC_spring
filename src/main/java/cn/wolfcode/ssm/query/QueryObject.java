package cn.wolfcode.ssm.query;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//分页查询单位
//真真实实客户传递过来就是者两个参数了，具体的第几页，还有就是每一页的pageSize是有多大！。
@Getter
@Setter
@ToString
public class QueryObject {

    private int currentPage = 1;
    private int pageSize = 3;


    public Integer getStart(){

        return (currentPage-1)*pageSize;
    }

}
