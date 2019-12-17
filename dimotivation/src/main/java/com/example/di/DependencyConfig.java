package com.example.di;

public class DependencyConfig {

	private static DependenciesContainer dependenciesContainer;  // przechowuje kontener zależności jako statyczny, aby móz zmieniać zależność z dowolnego miejsca programu

	public static DependenciesContainer getDependenciesContainer() {
		return dependenciesContainer;
	}

	public static void setDependenciesContainer(DependenciesContainer dependenciesContainer) {
		DependencyConfig.dependenciesContainer = dependenciesContainer;
	}
}
