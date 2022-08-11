import java.security.spec.ECField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class BancoDeDados {
    private Connection connection = null;
    private java.sql.Statement statement = null;
    private ResultSet resultSet = null;

    //passagem de parametro para conectar o banco de dados
    public void conectar(){
        //criação de variável para conectar banco de dados
        String servidor ="jdbc:mysql://localhost/ibm";
        //usuario do banco de dados
        String usuario = "root";
        //senha do banco de dados
        String senha = "RODGERricher26$";
        //vinculando o driver de conexao
        String driver ="com.mysql.cj.jdbc.Driver";

        try {
            Class.forName(driver);
            this.connection=DriverManager.getConnection(servidor,usuario,senha);
            this.statement=this.connection.createStatement();
        } catch (Exception e){
            System.out.println("Erro!" + e.getMessage());
        }
   }
   public boolean estaConectado(){
        if (this.connection !=null){
            return true;
        }else {
            return false;
        }
   }

   //metodo pra fazer a consulta de registros de dados no sql
    public void ListaContatos(){
        try {
        //tratando exceção do nosso retorno do select
        String query = "Select * from contatos";
        this.resultSet = this.statement.executeQuery(query);
        this.statement = this.connection.createStatement();
        //criando um laço de repeticao para retornar os registros da tabela
        while (this.resultSet.next()) {
            String meuId = resultSet.getString("id");
            String meuNome = resultSet.getString("contatos");

            System.out.println("id: " + meuId);
            System.out.println("nome: " + meuNome);
        }
        }catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
    //criando metodo para inserçao de registros
    public void inserirContatos(String contatos){
        try {
            //linha de execução da sintaxe insert no sql
            String query = "insert into contatos (contatos) values ('"+contatos+"');";
            System.out.println(query);
            this.statement.executeUpdate(query);
        }catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }

    }
    //criando metodo para atualizar registros
    public void atualizarContatos(int id, String contatos){
        try {
            //linha de execução da sintaxe update no sql
            String query = "update contatos set contatos='" + contatos + "' where id='" +  id + "';";
            System.out.println(query);
            this.statement.executeUpdate(query);
        }catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
    //criando metodo para excluir registros
    public void excluirContatos(int id){
        try {
            //linha de execução da sintaxe drop no sql
            String query = "delete from contatos where id='" + id + "';";
            System.out.println(query);
            this.statement.execute(query);
        }catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
    }


}
