package br.com.casadocodigo.loja.models;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity(name = "livros")
public class Livro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank(message = "O título é obrigatório.")
	private String titulo;
	@NotBlank(message = "O descrição é obrigatória.")
	private String descricao;
	@NotNull(message = "O número de páginas é obrigatório.")
	private Integer numeroPaginas;
	@NotNull(message = "O preço é obrigatório.")
	private BigDecimal preco;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(Integer numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", descricao=" + descricao + ", numeroPaginas=" + numeroPaginas + ", preco="
				+ preco + "]";
	}

}
