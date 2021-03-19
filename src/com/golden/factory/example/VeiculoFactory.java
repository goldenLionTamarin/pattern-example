package com.golden.factory.example;

public class VeiculoFactory {
	
	public Veiculo getVeiculo(String tipo) {
		if(tipo.equalsIgnoreCase("carro")) {
			return new Carro();
		} else if(tipo.equalsIgnoreCase("onibus")) {
			return new Onibus();
		}else if(tipo.equalsIgnoreCase("moto")) {
			return new Moto();
		}
		
		return null;
	}
}
