package com.example.di;

import com.example.payment.PaymentProviderService;
import com.example.payment.PaymentService;

import java.util.HashMap;
import java.util.Map;

public class DependenciesContainerReal implements DependenciesContainer {

	Map<Class, Object> beans = new HashMap<>();

	public DependenciesContainerReal() {
		beans.put(PaymentService.class, new PaymentProviderService());
		beans.put(String.class, "p@assword");  // Przykład zależności, którż możemy tu trzymać - nieuzywana w tej aplikacji
	}


	/*
	* MG: Poniższa metoda get() wygląda przerażająco, ale to dlatego, że obiekty, które zwraca, mogą być różnych klas.
	* Każda zależność przechowywana w kontenerze może być innej klasu - u nas PaymentService.
	* Silne typowanie w Javie wymusza użycie funkcji generycznej, akceptującej obiekty dowolnyhch klas.
	 */
	@Override
	public <T> T get(Class<T> clazz) {
		return (T) beans.get(clazz);
	}
}
