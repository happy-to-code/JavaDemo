package cn.test2.page;

import java.util.Arrays;
import java.util.List;

public class TestArrayList {

    private static final Integer PAGE_SIZE = 6;

    public static void main(String[] args) {
        List<Long> datas = Arrays.asList(new Long[]{1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L});

        //总记录数
        Integer totalCount = datas.size();

        //分多少次处理
        Integer requestCount = totalCount / PAGE_SIZE;

        for (int i = 0; i <= requestCount; i++) {
            Integer fromIndex = i * PAGE_SIZE;
            //如果总数少于PAGE_SIZE,为了防止数组越界,toIndex直接使用totalCount即可
            int toIndex = Math.min(totalCount, (i + 1) * PAGE_SIZE);
            List<Long> subList = datas.subList(fromIndex, toIndex);
            System.out.println(subList);
            //总数不到一页或者刚好等于一页的时候,只需要处理一次就可以退出for循环了
            if (toIndex == totalCount) {
                break;
            }
        }
    }
}
