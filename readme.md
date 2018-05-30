# SPRINGBOOT-KAFKA-SCAFFOLD

## 简介
SPRINGBOOT-KAFKA-SCAFFOLD -- 一个Spring Boot整合Kafka的简易示例

## Producer
执行TestCase:
```
com.bluexiii.demo.KafkaProducerTest
```

## Consumer
运行：
```
com.bluexiii.demo.ConsumerApplication
```

## 附录：Kafka测试脚本
### 启动
直接启动：
```
zookeeper-server-start /usr/local/etc/kafka/zookeeper.properties &
kafka-server-start /usr/local/etc/kafka/server.properties &
```
或通过`brew services`插件启动
```
brew services start zookeeper
brew services start kafka
```

### 创建topic
```
kafka-topics --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic test
```
### 查看创建的topic
```
kafka-topics --list --zookeeper localhost:2181
```

### 发送一些消息
```
kafka-console-producer --broker-list localhost:9092 --topic test 
```

### 消费消息
```
kafka-console-consumer --bootstrap-server localhost:9092 --topic test --from-beginning
```
