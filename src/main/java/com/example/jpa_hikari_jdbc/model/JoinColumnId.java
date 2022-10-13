package com.example.jpa_hikari_jdbc.model;

import org.springframework.data.annotation.Id;

import javax.persistence.JoinColumn;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD})
public @interface JoinColumnId {
}
