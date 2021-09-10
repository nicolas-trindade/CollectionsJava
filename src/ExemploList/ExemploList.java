/*
* Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3 5, 7, 0, 3.6], faça:
*/

package ExemploList;

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {

        String linha = "--------------------------------";
//        Formas de criar uma list

        List<Double> notas = new ArrayList<>(); //criação da List notas
//        List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); // outra forma de criar list
//        mas deste jeito acima não posso adicionar mais valores nesta lista

//        ArrayList<Double> nota = new ArrayList<>(); //criação de uma ArrayList

//      Crie uma lista e adicione as sete notas:
        System.out.println("Crie uma lista e adicione as sete notas: ");
//        para adicionar valores, use o .add()
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);
//         dois jeitos de fazer: ou só colocando a list, ou colocando a list.toString
        System.out.println(notas);
//        System.out.println(notas.toString());
        System.out.println(linha);

//      Exibia a posição da nota 5.0

//      Para pegar a posição, passar o valor (5.0) em notas.indexOf que pega a posição certa na lista
        System.out.println("Exibia a posição da nota 5.0: "+notas.indexOf(5d));
        System.out.println(linha);

//      Adicione na lista a nota 8.0 na posição 4

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
//        para usar, passe a posição desejada, e o elemento // .add(int index, Double element)
        notas.add(3, 8d);

        System.out.println(notas);
        System.out.println(linha);

//      Substitua a nota 5.0 pela nota 6.0
        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
//        usar o .set onde passar o indice primeiro e o elemento em seguida // .set(int index, Double element)
//        pode ser usado o indexOf aqui, que pega a posição certa e faz a troca
        notas.set(notas.indexOf(5d), 6d);
        System.out.println(notas);
        System.out.println(linha);

//      Confira se a nota 5.0 está na lista
//        da para usar o método .contains para verficiar se tem algum elemento na lista, retorna um boolean
        System.out.println("Confira se a nota 5.0 está na lista: "+notas.contains(5d));
        System.out.println(linha);

//      Exiba todas as notas na ordem em que foram informados
//        como estamos usando o List, eles são obrigatoriamente armazenados na ordem de inserção, 1,2,3...
//        aqui foi usado o modo diferente de impressão das notas, mas poderia simplesmente imprimir normal as notas
        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota: notas ) {
            System.out.println(nota);
        }
        System.out.println(linha);

//      Exiba a terceira nota adicionada
//        usamos a função .get(), onde passa a posição e recebemos o elemento:.get(index i)

        System.out.println("Exiba a terceira nota adicionada: "+notas.get(2));
        System.out.println(notas);
        System.out.println(linha);

//      Exiba a menor nota
//        podemos usar a função Collections.min() e passar uma colections que no caso aqui
//        uma list é uma collection.

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println(linha);

//      Exiba a maior nota
//        mesmo caso da função a cima, porém é utilizado a Collections.max()

        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        System.out.println(linha);

//      Exiba a soma dos valores
//        podemos usar o método iterator que pega os valores e soma

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){ //enquanto tiver próximo elemento, entra no while
            Double next = iterator.next(); //o next receber iterator.next onde pega o próximo elemento
            soma += next; // e salva na variável soma
        }
        System.out.println("Exiba a soma dos valores: " + soma);
        System.out.println(linha);

//      Exiba a média das notas
//        podemos pegar o valor da soma anterior e usar junto com o método .size() onde retorna um inteiro
//        e assim podemos pegar para poder dividir junto a soma e descobrir a média

        System.out.println("Exiba a média das notas: " + soma/notas.size());
        System.out.println(linha);

//      Remova a nota 0
//        para remover existe o método remove, que podemos passar tanto a posição quanto o objeto
//        remove(int index) ou remove(Object o)

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);
        System.out.println(linha);

//      Remova as notas menores que 7 e exiba a lista
//        caso de usar novamente o iterator. Reutilizarei a variável iterator ja declarada a cima.

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        iterator = notas.iterator();
        while(iterator.hasNext()){
            Double next = iterator.next();
            if(next < 7){
                iterator.remove(); // aqui ele remove o último elemento verificado pelo iterator
            }
        }
        System.out.println(notas);
        System.out.println(linha);

//      Remova toda a lista
//        pode ser usado o método .clear() que remove tudo de dentro da lista

        System.out.println("Apague toda a lista: ");
        notas.clear();
        System.out.println(notas);
        System.out.println(linha);

//      Confira se a lista está vazia
//        usamos aqui o método.isEmpty() que retorna um boolean
        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
    }
}
