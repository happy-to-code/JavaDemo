# 解释
在Java中，我们经常要进行遍历数据，对数据进行处理，
在数据处理中我们经常会用到两个关键字，一个是continue，一个是break。
continue关键字的意思是：结束本次循环继续下次循环
break关键字的意思是：结束循环。

---
## 话不多说直接上代码
### continue
```aidl
public class Demo2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                System.out.println("此处i==3:--->跳过此次循环，继续下次循环！");
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
```
> 上面代码很简单，一个从0-5的for循环，
>当i==3时我们就跳出循环，即下面的代码不执行了，继续下次循环。
### 运行结果：
```aidl
i = 0
i = 1
i = 2
此处i==3:--->跳过此次循环，继续下次循环！
i = 4

```
```aidl

我们可以看到i = 3没有打印 

```
---
### break
```aidl
public class Demo3 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                System.out.println("此处i==3:--->结束循环！");
                break;
            }
            System.out.println("i = " + i);
        }
    }
}

```
> 上面的结果同样是0-5的for循环，当i == 3时，我们用break来修饰，结束循环！
### 运行结果
```aidl
i = 0
i = 1
i = 2
此处i==3:--->结束循环！

```
```aidl
很明显，程序进行到i == 3 时就停止了。
```
-----

#### 以上就是continue和break最基本的使用，小伙伴们在项目中要根据具体情况使用。
> 在项目中我们还有一种情况:遍历是需要嵌套的，即for循环里面还有一个for循环，下面我们就一起研究下这种情况：
```aidl
public class Demo4 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    continue;
                }
                System.out.println("i = " + i + ":j = " + j);
            }
        }
    }
}
```
> 两个for循环，外层for循环从0-3，内层for循环从0-5，当i == j时，
>我们就结束本次循环，继续下次循环，可是此时到底结束的是内层循环还是外层循环呢？？?
>小伙伴们可以先思考一下再看运行结果:
```aidl
i = 0:j = 1
i = 0:j = 2
i = 0:j = 3
i = 1:j = 0
i = 1:j = 2
i = 1:j = 3
i = 2:j = 0
i = 2:j = 1
i = 2:j = 3
```
---
```aidl
从运行结果中我们可以清楚的看出，结束的是内层循环，就近原则嘛！
但是如果实际情况需要，当i == j时我们就想让外层询还结束怎么办？



此时我们可以给外层循环起一个名字，然后使用continue的时候在他后面跟上这个名字,代码如下：
```
```aidl
public class Demo4 {
    public static void main(String[] args) {
        outF:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    continue outF;
                }
                System.out.println("i = " + i + ":j = " + j);
            }
        }
    }
}
```
> 此处的意思是告诉计算机：当 i == j 时，我要结束外层循环，继续下次循环
> 运行结果：
```aidl
i = 1:j = 0
i = 2:j = 0
i = 2:j = 1

```
-----
> break的操作和continue类似，也支持别名的方法，小伙伴们可以自己动手试试！
