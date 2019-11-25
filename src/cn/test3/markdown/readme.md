# 一级标题
## 二级标题
### 三级标题
#### 四级标题

---
> 直线用 三个“---” 或者 三个“***”
***

> 列表的使用：
- 无序列表1
- 无序列表2
- 无序列表3

---
- 1.有序列表1
- 2.有序列表2
- 3.有序列表3
---

- [ ] 不勾选
- [x] 勾选

---
> 链接
[简书](http://www.jianshu.com)
[百度](http://www.baidu.com)
---
> 图片
![](shuaib.jpg "focus显示的东东")
---
![](http://img.52z.com/upload/news/image/20180621/20180621055734_59936.jpg)

---
### 引用
> 一盏灯， 一片昏黄； 一简书， 一杯淡茶。 守着那一份淡定， 品读属于自己的寂寞。 保持淡定， 才能欣赏到最美丽的风景！ 保持淡定， 人生从此不再寂寞。

> 这是第一级引用。
>
> > 这是第二级引用。
> > > 这是第三级引用。
>
> 现在回到第一级引用。
### 粗体和斜体(这边不支持)
Markdown 的粗体和斜体也非常简单，
用两个 * 包含一段文本就是粗体的语法，
用一个 * 包含一段文本就是斜体的语法

eg:**举世**誉之而不加*劝*，举世非之而不加*沮*

### 代码引用
>- 需要引用代码时，如果引用的语句只有一段，不分行，可以用 ` 将语句包起来。
>- 如果引用的语句为多行，可以将```置于这段代码的首行和末行

`System.out.print("hello world")`

```
public class Demo {
       public static void main(String[] args) {
           List list = new ArrayList<String>(10);
           System.out.println(list);
           System.out.println(list.size());
           list.add("1");
           list.add(1,"1");
   
           System.out.println(list);
   
           List list2 = new LinkedList();
           list2.add("121");
       }
   }

```

### 表格 ":"加到哪边就对奇到哪边
dog | bird11111 | cat2222
----|:------|----:
foo | foo  | foo
bar | bar  | bar
baz | baz  | baz

