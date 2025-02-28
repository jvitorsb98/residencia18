package com.biblioteca.biblioteca.model;

import java.time.LocalDateTime;

import org.antlr.v4.runtime.misc.NotNull;

import io.micrometer.common.lang.Nullable;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="EMPRESTIMO")
public class Emprestimo {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CLIENTE_ID", nullable = false)
    private Cliente cliente;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "LIVRO_ID", nullable = false)
    private Livro livro;
	
	@Column(name="DATA_EMPRESTIMO")
    @NotNull
    private LocalDateTime data_emprestimo;

	@Column(name="DATA_DEVOLUCAO")
    @Nullable
    private LocalDateTime data_devolucao;

	public Emprestimo() {
		super();
	}

	public Emprestimo(Cliente cliente, Livro livro, LocalDateTime data_emprestimo) {
		super();
		this.cliente = cliente;
		this.livro = livro;
		this.data_emprestimo = data_emprestimo;
	}

	public Emprestimo(Cliente cliente, Livro livro, LocalDateTime data_emprestimo, LocalDateTime data_devolucao) {
		super();
		this.cliente = cliente;
		this.livro = livro;
		this.data_emprestimo = data_emprestimo;
		this.data_devolucao = data_devolucao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public LocalDateTime getData_emprestimo() {
		return data_emprestimo;
	}

	public void setData_emprestimo(LocalDateTime data_emprestimo) {
		this.data_emprestimo = data_emprestimo;
	}

	public LocalDateTime getData_devolucao() {
		return data_devolucao;
	}

	public void setData_devolucao(LocalDateTime data_devolucao) {
		this.data_devolucao = data_devolucao;
	}
	
	

}
