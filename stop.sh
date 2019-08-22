#!/bin/bash
#!/usr/bin/env bash
# 将应用停止
#stop.sh
NAME=$1
echo "正在停止SpringBoot项目: $NAME"
pid=`ps -ef | grep "$NAME" | grep -v grep | awk '{print $2}'`
if [ -n "$pid" ]
then
   echo "SpringBoot项目进程PID: $pid"
   kill -9 $pid
fi
echo 'SpringBoot项目进程已杀死！'
