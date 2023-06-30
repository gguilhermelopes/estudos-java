package classesAbstratas;

import classesAbstratas.Empregado;

public class Comissionado extends Empregado {
    private Double totalVenda;

    public Double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(Double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public Double getTotalComissao() {
        return totalComissao;
    }

    public void setTotalComissao(Double totalComissao) {
        this.totalComissao = totalComissao;
    }

    private Double totalComissao;

    @Override
    public Double vencimento() {
        return totalVenda + totalComissao;
    }
}
