/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.pg.atividadecheckout.repository;

import br.senac.pg.atividadecheckout.entidade.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author rafael.cdini1
 */
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
}
