package br.senac.pg.atividadecheckout.entidade;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author victo
 */
@Entity(name = "tb_venda")
public class Venda implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(precision = 6, scale = 2, nullable = false)
    private BigDecimal valor;

    @Column(insertable = true, updatable = false)
    private boolean vendaFinalizada;
    @Column(nullable = false)
    private int quantidadeProduto;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "venda_produto",
            joinColumns = @JoinColumn(name = "venda_id"),
            inverseJoinColumns = @JoinColumn(name = "produto_id"))
    private Set<Produto> produtos;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    public Venda() {
    }

    public Venda(Long id, BigDecimal valor, LocalDateTime dataVenda, boolean vendaFinalizada,
            int quantidadeProduto, Set<Produto> produtos, Cliente cliente) {
        this.id = id;
        this.valor = valor;
        this.vendaFinalizada = vendaFinalizada;
        this.quantidadeProduto = quantidadeProduto;
        this.produtos = produtos;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public boolean isVendaFinalizada() {
        return vendaFinalizada;
    }

    public void setVendaFinalizada(boolean vendaFinalizada) {
        this.vendaFinalizada = vendaFinalizada;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public Set<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(Set<Produto> produtos) {
        this.produtos = produtos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Venda{" + "id=" + id + ", valor=" + valor + ", vendaFinalizada=" + vendaFinalizada + ", quantidadeProduto=" + quantidadeProduto + ", produtos=" + produtos + ", cliente=" + cliente + '}';
    }

    

}
