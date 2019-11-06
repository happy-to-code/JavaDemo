package cn.test.cn.test.stream;

import com.sun.deploy.util.StringUtils;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/5/9
 */
public class StreamTest {
    public static void main(String[] args) {
        Random random = new Random();
//        random.ints().limit(10).forEach(i->System.out.println(i));
        random.ints().limit(10).forEach(System.out::println);
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
// 获取空字符串的数量
        long count = strings.parallelStream().filter(string -> string.isEmpty()).count();
        System.out.println(count);
        System.out.println("===========================================================");
        List<Integer> numbers = Arrays.asList(3, 2, 12, 3, 7, 3, 5);

        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();

//        if(StringUtils.e){}

        System.out.println("列表中最大的数 : " + stats.getMax());
        System.out.println("列表中最小的数 : " + stats.getMin());
        System.out.println("所有数之和 : " + stats.getSum());
        System.out.println("平均数 : " + stats.getAverage());
    }
}
