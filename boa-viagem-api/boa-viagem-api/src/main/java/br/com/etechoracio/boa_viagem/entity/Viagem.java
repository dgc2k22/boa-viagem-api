package br.com.etechoracio.boa_viagem.entity;

public class Viagem {
	private Long id;
	 private String destino;
	 private String tipo;
	 private LocalDate chegada;
	 private LocalDate saida;
	 private Double orcamento;
	 private Integer pessoas; 
}

@Getter
@Setter
public class Viagem {
} 

@Getter
@Setter
public class Gasto {
 private Long id;
 private String descricao;
 private String local;
 private String categoria;
 private LocalDate gasto;

 private Double valor;
 private Viagem viagem;
}
