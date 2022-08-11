public class Agenda {
    public static void main(String[] args) {
        BancoDeDados sintaxeBanco = new BancoDeDados();
        sintaxeBanco.conectar();

        if (sintaxeBanco.estaConectado()){
            //permite chamar a opção read do nosso crud
            sintaxeBanco.ListaContatos();
            //permite chamar a opção insert do nosso crud
            //sintaxeBanco.inserirContatos("Ramon de Lima");
            //permite chamar a opção update do nosso crud
            //sintaxeBanco.atualizarContatos(8, "Rodger Richer");
            //permite chamar a opção delete do nosso crud
            sintaxeBanco.excluirContatos(7);
            System.out.println("Conexão com o banco de dados realizada com êxito!");
        }else {
            System.out.println("Não foi possível conectar ao banco de dados.");
        }
    }
}
