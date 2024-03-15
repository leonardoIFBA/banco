public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("##################################################");
        System.out.println("#                                                #");
        System.out.println("# Feliz dia das mulheres!!! Vocês são especiais. #");
        System.out.println("#                                                #");
        System.out.println("##################################################");
        
        Conta c1 = new Conta();
        ClienteFisica p = new ClienteFisica();
        p.setNome("Leo");
        p.setCpf("11111111111");
        c1.setNumero("123-4");
        c1.setCliente(p);
        c1.setSaldo(0.0);

        c1.deposita(1000.0);
        if (c1.saca(100)){
            System.out.println("Saque realizado com suceso.");
            System.out.println("O saldo de " + c1.getCliente().getNome() + " é: " + c1.getSaldo());
        }else{
            System.out.println("Saldo insuficiente!");
        }

        // criando uma segunda conta
        Conta c2 = new Conta();
        ClienteJuridica j = new ClienteJuridica();
        j.setNome("Americanas");
        j.setCnpj("009999900099900099");
        c2.setNumero("222-2");
        c2.setCliente(j);
        c2.setSaldo(0);

        if (c1.transfere(c2, 500)){
            System.out.println("Transferencia efetuada com sucesso.");
        }else{
            System.out.println("Saldo insuficiente");
        }
        System.out.println("O saldo de " + c1.getCliente().getNome() + " é: " + c1.getSaldo());
        System.out.println("O saldo de " + c2.getCliente().getNome() + " é: " + c2.getSaldo());

        // testando herança e polimorfismo
        Conta cc = new Corrente();
        cc.setNumero("4444-5");
        cc.setSaldo(1000);
        cc.setCliente(j);        
        System.out.println("O rendimento da conta corrente foi: " + cc.rendimento());

        Conta cp = new Poupanca();
        cp.setNumero("4444-5");
        cp.setSaldo(1000);
        cp.setCliente(j); 
        System.out.println("O rendimento da conta Poupança foi: " + cp.rendimento());

    }
}
