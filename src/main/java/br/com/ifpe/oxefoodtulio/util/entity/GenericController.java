package br.com.ifpe.oxefoodtulio.util.entity;

import br.com.ifpe.oxefoodtulio.util.exception.PreenchimentoException;

public class GenericController {
	
	protected void validarPreenchimentoChave(String chave) {

	    if (chave == null || chave.equals("")) {
	        throw new PreenchimentoException(PreenchimentoException.MSG_CHAVE_NAO_INFORMADA);
	    }
	    }


}
