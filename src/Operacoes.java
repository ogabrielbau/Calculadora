class Operacoes {
    private double valor1;
    private double valor2;

    public Operacoes(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public double adicao() {
        return valor1 + valor2;
    }

    public double subtracao() {
        return valor1 - valor2;
    }

    public double multiplicacao() {
        return valor1 * valor2;
    }

    public double divisao() {
        if (valor2 != 0) {
            return valor1 / valor2;
        } else {
            System.out.println("Erro: Divisão por zero!");
            return 0;
        }
    }
}