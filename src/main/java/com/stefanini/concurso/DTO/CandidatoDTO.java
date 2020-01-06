package com.stefanini.concurso.DTO;

import com.stefanini.concurso.model.Candidato;

public class CandidatoDTO {
	private Long idCandidato;
	private String nome;
	private String cpf;
	private String cidade;

	public Candidato tansformarParaCandidatoDTO() {

		return new Candidato(idCandidato, nome, cpf, cidade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Long getIdCandidato() {
		return idCandidato;
	}

	public void setIdCandidato(Long idCandidato) {
		this.idCandidato = idCandidato;
	}

}
