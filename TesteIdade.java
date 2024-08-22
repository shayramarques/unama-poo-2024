class TesteIdade{
    public static void main(String[] args) {
    int idade;
    idade = 29;
    System.out.println(idade);//imprime idade

    int idadeAnoQueVem = idade + 1;
    System.out.println(idadeAnoQueVem);

    double pi = 3.14;
    int raio = 5;
    double result = 2 * raio * pi;

    System.out.println(result == 31.4);

    boolean menorDeIdade = idade < 18;

    System.out.println(menorDeIdade);

    char letra = 'a';
    System.out.println(letra);

    int i = 5;
    int j = i;
    i = i + 1;
    System.out.println(i, j);
    }
}