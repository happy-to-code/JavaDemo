## **优化**
> 因为如果 low 和 high 比较大的话，两者之和就有可能会溢出
```
mid=(low + high)/2
mid=low + (high - low)/2
mid=low + ((high - low)>>1)
``` 