chcp 65001
@echo off

:: 使用JAVA_HOME来获取java可执行文件的路径
if "%JAVA_HOME%"=="" (
    set javaExe=java
) else (
    set javaExe=%JAVA_HOME%\bin\java
)

:: 应用启动类
set appStarter=cn.jogjo.kami.KamiApplication

:: JVM参数（例如：内存大小）
set jvmOpts=-Xms256m -Xmx256m

:: 进入项目根目录
cd /d %~dp0
cd ..

:: 启动应用
start /b %javaExe% -server %jvmOpts% -Dfile.encoding=UTF-8 -cp ".\lib\*" %appStarter%

echo "Kami加载中，请稍候。。。"

pause