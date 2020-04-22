package cn.test.stream.test1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/7/24
 */
public class Test {
    public static void main(String[] args) {
        //[1] map 生成的是个 1:1 映射，每个输入元素，都按照规则转换成为另外一个元素
        List<String> wordList = Arrays.asList("ab", "cd", "ys", "e", "AS");
        List<String> output = wordList.stream().
                map(String::toUpperCase).
                collect(Collectors.toList());
        System.out.println(output);

        System.out.println("------------------");

        List<Integer> nums = Arrays.asList(1, 2, 3, 4);
        List<Integer> squareNums = nums.stream().
                map(n -> n * n).
                collect(Collectors.toList());
        System.out.println(squareNums);
        System.out.println("------------------");

        //[2]  是一对多映射关系的，这时需要 flatMap
        Stream<List<Integer>> inputStream = Stream.of(
                Arrays.asList(1),
                Arrays.asList(2, 3),
                Arrays.asList(4, 5, 6)
        );
        Stream<Integer> outputStream = inputStream.
                flatMap((childList) -> childList.stream());
        System.out.println(outputStream);

        System.out.println("==============");
        // 清单 10. 留下偶数
        Integer[] sixNums = {1, 2, 3, 4, 5, 6};
        Integer[] evens =
                Stream.of(sixNums).filter(n -> n % 2 == 0).toArray(Integer[]::new);
        System.out.println(evens[0]);

        System.out.println("'''''''''''''''''''''''''''''''");
        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());

        System.out.println("[===================]");
        String strA = " abcd ", strB = null;
        // print(strA);
        // print("");
        print(strB);
        // getLength(strA);
        // getLength("");
        // getLength(strB);


    }

    public static void print(String text) {
        // Java 8
        Optional.ofNullable(text).ifPresent(System.out::println);
       /* // Pre-Java 8
        if (text != null) {
            System.out.println(text);
        }*/
    }

    public static int getLength(String text) {
        // Java 8
        return Optional.ofNullable(text).map(String::length).orElse(-1);
        // Pre-Java 8
        // return if (text != null) ? text.length() : -1;
    }


}
