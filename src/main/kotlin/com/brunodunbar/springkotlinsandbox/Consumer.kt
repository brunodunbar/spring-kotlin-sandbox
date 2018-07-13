package com.brunodunbar.springkotlinsandbox

import org.springframework.jms.annotation.JmsListener
import org.springframework.stereotype.Component

@Component
class Consumer {

    @JmsListener(destination = "sample.queue")
    fun receiveQueue(text: String) {
        println(text)
    }

    @JmsListener(destination = "Consumer.A.VirtualTopic.sample.topic")
    fun receiveTopic(text: String) {
        println("A: $text")
    }

    @JmsListener(destination = "Consumer.B.VirtualTopic.sample.topic")
    fun receiveTopic2(text: String) {
        println("B: $text")
    }

    @JmsListener(destination = "Consumer.C.VirtualTopic.sample.topic")
    fun receiveTopic3(text: String) {
        println("C: $text")
    }

    @JmsListener(destination = "Consumer.D.VirtualTopic.sample.topic")
    fun receiveTopic4(text: String) {
        println("D: $text")
    }

}