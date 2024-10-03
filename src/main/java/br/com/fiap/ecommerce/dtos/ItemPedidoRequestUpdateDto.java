package br.com.fiap.ecommerce.dtos;

import java.math.BigDecimal;

import org.modelmapper.ModelMapper;

import br.com.fiap.ecommerce.model.ItemPedido;
import br.com.fiap.ecommerce.model.Pedido;
import br.com.fiap.ecommerce.model.Produto;

public class ItemPedidoRequestUpdateDto {

    private Long idPedido;
    private Long idProduto;
    private BigDecimal quantidade;
    private BigDecimal valorTotal;

    private static final ModelMapper modelMapper = new ModelMapper();

    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public ItemPedido toModel(Long id, Pedido pedido, Produto produto) {
        ItemPedido itemPedido = modelMapper.map(this, ItemPedido.class);
        itemPedido.setId(id);
        itemPedido.setPedido(pedido);
        itemPedido.setProduto(produto);
        return itemPedido;
    }
}
