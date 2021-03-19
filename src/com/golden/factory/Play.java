package com.golden.factory;

import com.golden.factory.example.Veiculo;
import com.golden.factory.example.VeiculoFactory;

public class Play {

	public static void main(String[] args) {
		VeiculoFactory factory = new VeiculoFactory();

		Veiculo carro = factory.getVeiculo("carro");
		carro.anda();
		
		Veiculo onibus = factory.getVeiculo("onibus");
		onibus.anda();
		
		Veiculo moto = factory.getVeiculo("moto");
		moto.anda();
	}

}
