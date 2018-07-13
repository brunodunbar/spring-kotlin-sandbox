package com.brunodunbar.springkotlinsandbox

import org.springframework.jms.core.JmsMessagingTemplate
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import javax.jms.Queue
import javax.jms.Topic

@Component
class Producer(private val jmsMessagingTemplate: JmsMessagingTemplate, private val queue: Queue, private val topic: Topic) {

    @Scheduled(fixedDelay = 100)
    fun send() {
        this.jmsMessagingTemplate.convertAndSend(this.queue, "QUEUE")
    }

    @Scheduled(fixedDelay = 100)
    fun sendTopic() {
        this.jmsMessagingTemplate.convertAndSend(this.topic, "TOPIC")
    }

}