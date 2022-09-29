package br.com.ifpe.oxefoodtulio.modelo.produto;

import br.com.ifpe.oxefoodtulio.util.entity.EntidadeAuditavel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CategoriaProduto extends EntidadeAuditavel {

	private static final long serialVersionUID = -8634561866607657556L;

	private String chaveEmpresa;

	private String descricao;

}
