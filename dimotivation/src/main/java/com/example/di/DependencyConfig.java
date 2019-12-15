package com.example.di;

public class DependencyConfig {

	private static DependenciesContainer dependenciesContainer;

	public static DependenciesContainer getDependenciesContainer() {
		return dependenciesContainer;
	}

	public static void setDependenciesContainer(DependenciesContainer dependenciesContainer) {
		DependencyConfig.dependenciesContainer = dependenciesContainer;
	}
}
