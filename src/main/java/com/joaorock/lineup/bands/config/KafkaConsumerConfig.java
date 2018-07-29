package com.joaorock.lineup.bands.config;

import com.joaorock.lineup.bands.serializer.AvroDeserializer;
import example.avro.Band;
import example.avro.City;
import example.avro.Country;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;


import java.util.HashMap;
import java.util.Map;

@EnableKafka
@Configuration
public class KafkaConsumerConfig {

    @Bean
    public Map<String, Object> consumerConfig() {
        Map<String, Object> config = new HashMap<>();

        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "192.168.0.106:9092");
        config.put(ConsumerConfig.GROUP_ID_CONFIG, "group_id");
        config.put(ConsumerConfig.MAX_POLL_RECORDS_CONFIG,"100");
        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, AvroDeserializer.class);
        return  config;
    }

    @Bean
    public ConsumerFactory<String, Band> consumerFactoryBand() {
        return new DefaultKafkaConsumerFactory<>(consumerConfig(), new StringDeserializer(),
                new AvroDeserializer<>(Band.class));
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, Band> kafkaListenerContainerFactoryBand() {
        ConcurrentKafkaListenerContainerFactory<String, Band> factory = new ConcurrentKafkaListenerContainerFactory();
        factory.setConsumerFactory(consumerFactoryBand());
        return factory;
    }

    @Bean
    public ConsumerFactory<String, Country> consumerFactory() {
        return new DefaultKafkaConsumerFactory<>(consumerConfig(), new StringDeserializer(),
                new AvroDeserializer<>(Country.class));
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, Country> kafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, Country> factory = new ConcurrentKafkaListenerContainerFactory();
        factory.setConsumerFactory(consumerFactory());
        return factory;
    }

}
