package br.com.ifpe.oxefoodtulio.util.entity;

import java.time.LocalDate;

import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass

public abstract class EntidadeAuditavel extends EntidadeNegocio {

	private static final long serialVersionUID = 1553982893948441530L;

	private long versao;

	private LocalDate dataCriacao;

	private LocalDate dataUltimaModificacao;

	private Long criadoPor; // Id do usuário que criou

	private Long ultimaModificacaoPor;

}
