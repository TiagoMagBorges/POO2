package FacadeProxy.questao3;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Pessoa> hash = new HashMap<>();
        hash.put("111", new Pessoa("Joao", "111", 18));
        hash.put("222", new Pessoa("Maria", "222", 20));
        hash.put("333", new Pessoa("Carlos", "333", 22));
        BancoDeDadosPessoas bdp = new BancoDeDadosPessoas(hash);
        BancoDeDadosPessoasProxy bdpProxy = new BancoDeDadosPessoasProxy(bdp);
        bdpProxy.adicionarPessoa(new Pessoa("Eduardo", "444", 24));
        bdpProxy.adicionarPessoa(new Pessoa("Monica", "555", 26));

        for(int i = 0; i < 5; i++){
            System.out.println("==================");
            Pessoa p = bdpProxy.buscarPessoa(String.format("%d%d%d", i+1, i+1, i+1));
            System.out.printf("Nome: %s\n", p.getNome());
            System.out.printf("CPF: %s\n", p.getCpf());
            System.out.printf("Idade: %d\n", p.getIdade());
            System.out.println("==================");
        }
    }
}
