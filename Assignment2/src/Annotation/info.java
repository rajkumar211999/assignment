package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface info {

	String name();
	String supervisor()default "ONKAR";
	int version();
	int AuthorID();
	String Author() default "KIRTIK";
	String Date();
	String Time();
	String desp() default "hello its annotation program";
	
}