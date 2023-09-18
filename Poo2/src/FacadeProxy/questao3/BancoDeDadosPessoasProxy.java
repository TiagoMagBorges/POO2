package FacadeProxy.questao3;

import java.util.HashMap;

public class BancoDeDadosPessoasProxy {
    private BancoDeDadosPessoas bancoDeDadosPessoas;
    private HashMap<String, Pessoa> pessoas;

    public BancoDeDadosPessoasProxy(BancoDeDadosPessoas bancoDeDadosPessoas){
        this.bancoDeDadosPessoas = bancoDeDadosPessoas;
        this.pessoas = new HashMap<>();
    }

    public Pessoa buscarPessoa(String cpf){
        Pessoa pessoa = pessoas.get(cpf);
        if(pessoa == null)
            return bancoDeDadosPessoas.buscarPessoa(cpf);
        System.out.println("Achou no Proxy");
        return pessoa;
    }
    public void adicionarPessoa(Pessoa pessoa){
        pessoas.put(pessoa.getCpf(), pessoa);
        bancoDeDadosPessoas.adicionarPessoa(pessoa);
    }
}
