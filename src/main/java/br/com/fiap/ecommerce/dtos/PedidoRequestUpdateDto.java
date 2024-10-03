package br.com.fiap.ecommerce.dtos;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.modelmapper.ModelMapper;

import br.com.fiap.ecommerce.model.Cliente;
import br.com.fiap.ecommerce.model.Pedido;
import br.com.fiap.ecommerce.model.ItemPedido;

public class PedidoRequestUpdateDto {
    private LocalDate dataPedido;
    private String formaPagamento;
    private Long idCliente; 
    private String status;
    private BigDecimal valorTotal;
    private List<ItemPedido> itensPedido;

    private static final ModelMapper modelMapper = new ModelMapper();

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<ItemPedido> getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(List<ItemPedido> itensPedido) {
        this.itensPedido = itensPedido;
    }

    public Pedido toModel(Long id, Cliente cliente) {
        Pedido pedido = modelMapper.map(this, Pedido.class);
        pedido.setId(id);
        pedido.setIdCliente(cliente);
        return pedido;
    }
}
