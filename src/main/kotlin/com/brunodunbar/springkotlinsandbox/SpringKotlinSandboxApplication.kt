package com.brunodunbar.springkotlinsandbox

import org.apache.activemq.command.ActiveMQQueue
import org.apache.activemq.command.ActiveMQTopic
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.jms.annotation.EnableJms
import org.springframework.scheduling.annotation.EnableScheduling
import javax.jms.Queue
import javax.jms.Topic


@EnableJms
@Configuration
@EnableScheduling
@SpringBootApplication
class SpringKotlinSandboxApplication {

    @Bean
    fun queue(): Queue {
        return ActiveMQQueue("sample.queue")
    }

    @Bean
    fun topic(): Topic {
        return ActiveMQTopic("VirtualTopic.sample.topic")
    }

//    @Bean
//    fun queueContainerFactory(connectionFactory: ConnectionFactory): DefaultJmsListenerContainerFactory {
//        val factory = DefaultJmsListenerContainerFactory()
//        factory.setConnectionFactory(connectionFactory)
//        factory.setConcurrency("3-10")
//        return factory
//    }

//    @Bean
//    fun topicContainerFactory(connectionFactory: ConnectionFactory): DefaultJmsListenerContainerFactory {
//        val factory = DefaultJmsListenerContainerFactory()
//        factory.setConnectionFactory(connectionFactory)
//        factory.setConcurrency("3-10")
//        factory.setClientId("brokerClientId")
//        factory.setSubscriptionShared(true)
//        factory.setSubscriptionDurable(true)
//        return factory
//    }
}

fun main(args: Array<String>) {
    runApplication<SpringKotlinSandboxApplication>(*args)
}



