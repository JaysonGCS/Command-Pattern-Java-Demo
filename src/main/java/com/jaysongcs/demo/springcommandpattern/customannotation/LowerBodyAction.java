package com.jaysongcs.demo.springcommandpattern.customannotation;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Qualifier  // Qualifier is required for @Autowire of @LowerBodyAction to work
@Target({ElementType.TYPE, ElementType.FIELD})  // FIELD type is required to use @LowerBodyAction when autowiring
@Retention(RetentionPolicy.RUNTIME)
public @interface LowerBodyAction {
}
