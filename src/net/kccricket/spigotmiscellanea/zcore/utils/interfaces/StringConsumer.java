package net.kccricket.spigotmiscellanea.zcore.utils.interfaces;

@FunctionalInterface
public interface StringConsumer<T> {

	String accept(T t);
	
}
