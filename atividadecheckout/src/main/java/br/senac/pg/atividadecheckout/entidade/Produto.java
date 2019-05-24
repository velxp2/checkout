package br.senac.pg.atividadecheckout.entidade;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author victor
 */
@Entity(name = "tb_produto")
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //@Column(nullable = false)
    private String nome;
    //@Column(precision = 6, scale = 2, nullable = false)
    private int preco;
    //@Column(nullable = false)
    private String descricao;
    //@Column(nullable = false)
    //@Column(nullable = false)
    private int quantidadeEstoque;
    private int quantidadeVendido;
    @ManyToMany(mappedBy = "produtos", fetch = FetchType.LAZY)
    private Set<Venda> venda;

    public Produto() {
    }

    public Produto(Long id, String nome, int precoCompra, String descricao, int quantidade, int quantidadeVenda, Set<Venda> venda) {
        this.id = id;
        this.nome = nome;
        this.preco = precoCompra;
        this.descricao = descricao;
        this.quantidadeEstoque = quantidade;
        this.quantidadeVendido = quantidadeVenda;
        this.venda = venda;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidadeEstoque;
    }

    public void setQuantidade(int quantidade) {
        this.quantidadeEstoque = quantidade;
    }

    public int getQuantidadeVenda() {
        return quantidadeVendido;
    }

    public void setQuantidadeVenda(int quantidadeVenda) {
        this.quantidadeVendido = quantidadeVenda;
    }

    public Set<Venda> getVenda() {
        return venda;
    }

    public void setVenda(Set<Venda> venda) {
        this.venda = venda;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", nome=" + nome + ", precoCompra=" + preco + ", descricao=" + descricao + ", quantidade=" + quantidadeEstoque + ", quantidadeVenda=" + quantidadeVendido + ", venda=" + venda + '}';
    }

    
    
}
