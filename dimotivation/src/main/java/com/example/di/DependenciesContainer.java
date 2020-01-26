package com.example.di;

public interface DependenciesContainer {
	<T> T get(Class<T> clazz);
}
