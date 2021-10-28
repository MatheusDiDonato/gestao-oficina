package com.oficinagenericagestao.oficinagenericagestao.Config;


import io.micrometer.core.instrument.util.StringUtils;
import net.minidev.json.JSONObject;
import org.modelmapper.AbstractConverter;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Base64;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Configuration
public class ApplicationConfig {
    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.getConfiguration().setAmbiguityIgnored(true);
        Converter<String, byte[]> convertStringToArrayByte = new AbstractConverter<String, byte[]>() {
            @Override
            protected byte[] convert(String source) {
                return (source == null) ? null : Base64.getMimeDecoder().decode(source.split(",")[1]);
            }
        };

        Converter<byte[], String> convertArrayByteToString = new AbstractConverter<byte[], String>() {
            @Override
            protected String convert(byte[] source) {
                return (source == null) ? null : Base64.getMimeEncoder().encodeToString(source);
            }
        };

        Converter<Map<String, Object>, String> convertMapToJson = new AbstractConverter<Map<String, Object>, String>() {
            @Override
            protected String convert(Map<String, Object> source) {
                return (source == null || source.isEmpty()) ? null : new JSONObject(source).toString();
            }
        };

        Converter<List<String>, String> convertListToString = new AbstractConverter<List<String>, String>() {
            @Override
            protected String convert(List<String> source) {
                return (source == null) ? null
                        : String.join(",", source.stream().filter(e -> StringUtils.isNotEmpty(e))
                        .filter(e -> StringUtils.isNotBlank(e)).collect(Collectors.toList()));
            }
        };

        modelMapper.addConverter(convertStringToArrayByte);
        modelMapper.addConverter(convertArrayByteToString);
        modelMapper.addConverter(convertMapToJson);
        modelMapper.addConverter(convertListToString);

        return modelMapper;
    }


}
