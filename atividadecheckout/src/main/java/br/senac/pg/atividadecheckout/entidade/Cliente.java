package br.senac.pg.atividadecheckout.entidade;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author victor
 */
@Entity(name = "tb_cliente")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //@Column(nullable = false)
    private String nome;
    //@Column(nullable = false)
    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
     private List<Venda> vendas;

    public Cliente() {
    }

    public Cliente(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
