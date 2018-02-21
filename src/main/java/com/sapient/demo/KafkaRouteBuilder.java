package com.sapient.demo;

import org.apache.camel.builder.RouteBuilder;

public class KafkaRouteBuilder extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("kafka:test1?brokers=localhost:9092&groupId=test-consumer-group")
                .to("file:target/messages/kafka")
                    .log("Saved file from kafka to file");
    }
}
