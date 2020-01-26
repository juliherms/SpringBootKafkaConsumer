package com.teste.kafka.springbootkafka.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * this class responsible to consumer message in the kafka
 * @author j.a.vasconcelos
 *
 */
@Service
public class KafkaConsumer {

	@KafkaListener(topics="kafka_example", group = "group_id")
	public void consume(String message) {
		System.out.println("Consumed message:" + message);
	}
}
