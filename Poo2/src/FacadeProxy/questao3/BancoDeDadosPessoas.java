package FacadeProxy.questao3;

import java.util.ArrayList;
import java.util.HashMap;

public class BancoDeDadosPessoas {
    HashMap<String, Pessoa> pessoas;

    public BancoDeDadosPessoas(HashMap<String, Pessoa> pessoas){
        this.pessoas = pessoas;
    }

    public BancoDeDadosPessoas(){
        this.pessoas = new HashMap<>();
    }

    public Pessoa buscarPessoa(String cpf){
        return pessoas.get(cpf);
    }

    public void adicionarPessoa(Pessoa pessoa){
        pessoas.put(pessoa.getCpf(), pessoa);
    }
}
