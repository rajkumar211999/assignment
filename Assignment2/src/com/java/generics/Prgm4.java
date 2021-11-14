package com.java.generics;
import java.util.Date;

public class Prgm4 {

	public static void main(String[] args) {
		Pair<String,String> obj1=new Pair();
		obj1.setKey("1");
		obj1.setValue("Hello");
		System.out.println("Key:"+obj1.getKey()+" || Value:"+obj1.getValue());
		System.out.println("-----------------------------------------------");
		Pair<String,Date> obj2=new Pair();
		obj2.setKey("Today is");
		obj2.setValue(new Date());
		System.out.println("Key:"+obj2.getKey()+" || Value:"+obj2.getValue());		
	}

}
class Pair<T1,T2>{
	T1 key;
	T2 value;
	public T1 getKey() {
		return key;
	}
	public void setKey(T1 key) {
		this.key = key;
	}
	public T2 getValue() {
		return value;
	}
	public void setValue(T2 value) {
		this.value = value;
	}	
}
