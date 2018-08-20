# 自定义类加载器

## 1 使用javac编译器
- 在/src/main/java目录下，执行命令`javac -encoding  UTF-8 classload/People.java
- 这样会在./classloader目录下生成People.class字节码文件

## 2. 测试编译结果
- 执行命令
```shell
java classloader.People
# 则执行该类中的主函数
```

## 3. 自定义类加载器
- 自定义类加载器，需要继承`ClassLoader`类，并实现`findClass()`方法，其中`defineClass`方法可以把二进制字节组成的文件转换成一个java.lang.Class
