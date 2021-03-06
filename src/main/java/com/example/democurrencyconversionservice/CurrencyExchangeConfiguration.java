/**
 * 
 */
package com.example.democurrencyconversionservice;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.support.SpringEncoder;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import feign.codec.Encoder;

/**
 * @author Administrator
 *
 */
public class CurrencyExchangeConfiguration {


public Encoder feignEncoder() {
    HttpMessageConverter jacksonConverter = new MappingJackson2HttpMessageConverter();
    ObjectFactory<HttpMessageConverters> objectFactory = () -> new HttpMessageConverters(jacksonConverter);
    return new SpringEncoder(objectFactory);
}

}
