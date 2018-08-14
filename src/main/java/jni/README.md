# 编译命令
```shell
gcc -c -I"%JAVA_HOME%\include" -I"%JAVA_HOME%\include\win32" Sample1.c
gcc -Wl,--add-stdcall-alias -shared -o Sample1.dll Sample1.o
```