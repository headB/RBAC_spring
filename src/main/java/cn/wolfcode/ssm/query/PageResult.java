package cn.wolfcode.ssm.query;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@ToString
public class PageResult<T> {

    //这里需要知道什么呢？

    //保存结果，但是具体的结果，不是每一次都是一样的，需要需要用到泛型

    private List<T> data;

    //这里应该还保存了，最真实分页信息！

    private Integer currentPage;
    private Integer pageSize;

    //然后还有上一页和下一页的信息。 然后杨龙说这些都是需要计算出来的。根据正确的current就可以计算得到了。！
    private Integer nextPage;
    private Integer prevPage;

    // 还有一个总页数。
    //这个应该是根据 totalCount和pageSize 来计算的。！
    private Integer totalPage;
    //还有一个总个数
    private Integer totalCount;

    public PageResult(Integer currentPage, Integer pageSize, List<T> data, Integer totalCount){

        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.data = data;
        this.totalCount = totalCount;
        //设置上下页面

        //假设查询得到的totalCount只有一个的话，上下页都是第一页了。！
        if (totalCount <= pageSize){
            this.prevPage = 1;
            this.nextPage = 1;
            this.totalPage = 1;
            //然后就可以结束了。！
            return;
            //直接完成构造器的运行了。
        }

        this.totalPage = totalCount % pageSize == 0 ? totalCount / pageSize : totalCount / pageSize +1 ;

        //如何 确定 上一页呢，还是有个判断的，上一页的上限肯定是不能小于1的
        this.prevPage = this.currentPage > 1 ? this.currentPage - 1 : 1;
        this.nextPage = this.currentPage < this.totalPage ? this.currentPage + 1: this.totalPage;



    }


}
