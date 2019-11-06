package cn.test2.page;

import java.util.Arrays;
import java.util.List;

public class ListSub {
    /**
     * 当前页面
     */
    private int page = 2;

    /**
     * 显示多少行
     */
    private int rows = 3;

    /**
     * 总记录条数
     */
    private int total;

    /**
     * @return the page
     */
    public int getPage() {
        return page;
    }

    /**
     * @param page the page to set
     */
    public void setPage(int page) {
        this.page = page;
    }

    /**
     * @return the rows
     */
    public int getRows() {
        return rows;
    }

    /**
     * @param rows the rows to set
     */
    public void setRows(int rows) {
        this.rows = rows;
    }

    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * 对list集合进行分页处理
     *
     * @return
     */
    private  List<?> ListSplit(List<?> list) {
        List<?> newList = null;
        total = list.size();
        newList = list.subList(rows * (page - 1), ((rows * page) > total ? total : (rows * page)));
        return newList;
    }


    public static void main(String[] args) {
        List<Long> datas = Arrays.asList(new Long[]{1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L});
        ListSub listSub = new ListSub();
        List<?> objects = listSub.ListSplit(datas);
        System.out.println(objects);
    }

}