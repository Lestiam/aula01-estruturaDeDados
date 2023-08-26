package exercicio2;

public class PesquisaBinaria {
    public static void main(String[] args) {
        PesquisaBinaria bin = new PesquisaBinaria(); //nome da classe/variavel. é o main já com o método
        int[] numeros = {1, 3, 4, 7, 9, 10, 13, 18, 20, 21, 22};
        bin.pesquisarNumero(22, numeros); //valor do numero que busco e o nome do vetor (nome da função para achar o numero no vetor)
        //bin.pesquisarNumero(3, numeros);
    }

    /**
     * Método que pesquisa um número dentro de um vetor de números.
     * Este método utiliza o algoritmo de pesquisa binaria.
     *
     * @param numeroQueQueroBuscar       - Número que será pesquisado.
     * @param numeros - Vetor de números.
     */
    public void pesquisarNumero(int numeroQueQueroBuscar, int[] numeros) {
        int inicio = 0; //Posição inicial do vetor.
        int meio = 0; //Posição do meio do vetor.
        int fim = numeros.length - 1; //Posição final do vetor. No caso, o fim vale 10
        /* Enquanto a posição do inicio for menor ou igual a posição do fim,
        procura o valor de x dentro do vetor. */
        while (inicio <= fim) {
            meio = (fim + inicio) / 2; //Encontra o meio do vetor.
            System.out.println("Inicio: " + numeros[inicio] + " - Meio: " + numeros[meio] + " - Fim: " +
                    numeros[fim]);
        /* Se o valor que está no meio do vetor é igual ao valor procurado,
        imprime que encontrou o valor e para de pesquisar. */
            if (numeros[meio] == numeroQueQueroBuscar) {
                System.out.println("Encontrou o número " + numeroQueQueroBuscar);
                break;
            }
            /* Este if serve para diminuir o tamanho do vetor pela métade. */
            /* Se o valor que está no meio do vetor for menor que o valor de x,
            então o inicio do vetor será igual a posição do meio + 1. */
            if (numeros[meio] < numeroQueQueroBuscar) {
                inicio = meio + 1;
            } else {
            /* Se o valor que está no meio do vetor for maior que o valor de x,
            então o fim do vetor será igual a posição do meio - 1. */
                fim = meio - 1;
            }
        }
    }
}

