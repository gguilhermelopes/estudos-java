package classesAbstratas;

public class Horista extends Empregado{
    private Double precoHora;
    private Double horasTrabalhadas;
    @Override
    public Double vencimento() {
        return precoHora * horasTrabalhadas;
    }
}
