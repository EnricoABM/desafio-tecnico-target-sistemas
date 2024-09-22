package desafios;

/**
 * 4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por
 * estado:
 * • SP – R$67.836,43
 * • RJ – R$36.678,66
 * • MG – R$29.229,88
 * • ES – R$27.165,48
 * • Outros – R$19.849,53
 * 
 * Escreva um programa na linguagem que desejar onde calcule o percentual de
 * representação que cada estado teve dentro do valor total mensal da
 * distribuidora.
 */

public class Desafio4 {
    public static void main(String[] args) {
        Estado[] estados = {
            new Estado("SP", 67836.43),
            new Estado("RJ", 36678.66),
            new Estado("MG", 29229.88),
            new Estado("ES", 27165.48),
            new Estado("Outros", 19849.53)
        };

        calcularPorcentagens(estados);

        for (Estado e : estados) {
            System.out.printf("%s - Porcentagem: %.2f\n", e.getSingla(), e.getPorcentagem() * 100);
        }
    }

    private static double calcularTotal(Estado[] estados) {
        double total = 0;
        for (Estado e : estados) {
            total += e.getValor();
        }
        return total;
    }

    private static void calcularPorcentagens(Estado[] estados) {
        double total = calcularTotal(estados);
        for (Estado e : estados) {
            e.setPorcentagem(e.getValor() / total);
        }
    }
}

class Estado {
    private String singla;
    private double valor;
    private double porcentagem;

    public Estado(String singla, double valor) {
        this.singla = singla;
        this.valor = valor;
    }

    public String getSingla() {
        return singla;
    }
    
    public void setSingla(String singla) {
        this.singla = singla;
    }
    
    public double getValor() {
        return valor;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(double porcentagem) {
        this.porcentagem = porcentagem;
    }
}
