## Daniel Sort
I made it in my IT Class out of fun.
I turned out to be faster than I thought.
 
- It's working on all Programming Languages
- It has two Types (the first one is not very effizient)
- I made it in two Languages so far

Code Example:
```java
ArrayList<Integer> integers = ArrayUtils.randomList2(0, 10);
System.out.println(integers);

long start = System.currentTimeMillis();

final ArrayList<Integer> output = ArrayUtils.danielsort(integers);

System.out.println(output);
System.out.println("It took " + (System.currentTimeMillis() - start) + "ms!");
```
