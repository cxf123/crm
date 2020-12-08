package com.itsource.query;

/**
 * 分页条件
 *
 * @author Administrator
 */
public class BaseQuery {
    //当前页
    public int page = 1;
    //每页显示条数
    public int rows = 10;
    //高级查询传入参数
    public String q;

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    //从那一页开始显示数据
    public int getStart() {
        return (this.page - 1) * rows;
    }

    @Override
    public String toString() {
        return "BaseQuery{" +
                "page=" + page +
                ", rows=" + rows +
                ", q='" + q + '\'' +
                '}';
    }

    /*@Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();


        stringBuilder.append("页数：" + page + ";");


        stringBuilder.append("每页条数：" + rows + ";");

        if (q != null) {
            stringBuilder.append("查询关键字：" + q + ";");
        }

        return stringBuilder.toString();
    }*/
}
