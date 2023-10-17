package com.apera.aperaserver.service;

import com.apera.aperaserver.model.Compra;
import com.apera.aperaserver.repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CompraService {

//Regra de negócio 2
/*Ao adicionar um novo lançamento na carteira, deverá ser adicionado
um registro detalhado do lançamento, para exclusão ou edição posteriormente.*/

    @Autowired
    private CompraRepository compraRepository;

    @Transactional
    public String salvarCompra(Compra compra) {
        try {
            validarCompra(compra); // Adicione a validação

            Compra compraSalva = compraRepository.save(compra);
			
			if (compra == null || compra.getValor() <= 0) {
                    throw new IllegalArgumentException("A compra é inválida");
            }
		
            logInfo("Compra salva com sucesso: ID " + compraSalva.getId());

            return "Compra bem sucedida");
        } catch (Exception e) {
            return "Erro ao salvar a compra";
        }
    }
}
