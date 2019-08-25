#!/bin/bash

# 将应用停止 参数：JAR_NAME
#stop.sh

if [ ! -n "$1" ]; then
    echo "[ERROR] >>> 未检测到参数[JAR_NAME]，请重试！"
else
    JAR_NAME=$1
    echo "正在停止SpringBoot项目: $JAR_NAME"
    pid=`ps -ef | grep "$JAR_NAME" | grep -v grep | awk '{print $2}'`
    if [ -n "$pid" ]; then
       echo "SpringBoot项目进程PID: $pid"
       kill -9 $pid
       echo "[kill -9 $pid] >>> 执行完毕！"
    fi
    echo 'SpringBoot项目进程已杀死！'
fi