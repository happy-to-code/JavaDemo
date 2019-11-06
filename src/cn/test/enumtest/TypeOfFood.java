package cn.test.enumtest;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2019/3/17
 */
public class TypeOfFood {
    public static void main(String[] args) {
        Food food = Food.Appetizer.SALAD;
        // food = Food.MainCourse.LASAGNE;
        // food = Food.Dessert.GELATO;
        // food = Food.Coffee.CAPPUCCINO;
        System.out.println(food);
    }
}
