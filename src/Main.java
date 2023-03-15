import  javax.swing.JOptionPane;

public class Main {
    public Double Ivalor;
    public  static void  main(String[] args){

        String tipo = JOptionPane.showInputDialog("Informe a opção : " +
                "/n 1. Pizza" +
                "/n 2. Hamburguer" +
                "/n 3. Sair");

        if(tipo == "Sair" || tipo == "3")
        {
            JOptionPane.showMessageDialog(null, "Obrigado "
                    + "volte Sempre", "Informações",JOptionPane.INFORMATION_MESSAGE );
        }
        else {
            String nome = JOptionPane.showInputDialog("Digite o Nome do Pedido: " +
                    "1) Simples 10reais"
                    +"2) Completo 20reais ");


            Double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor"));

            Boolean borda = Boolean.parseBoolean(JOptionPane.showInputDialog("Tem borda digite true ou false"));


            Pizza p = new Pizza();

            Double valor = p.CalculaPreco(preco, borda);

            JOptionPane.showMessageDialog(null, "O preço foi  : "
                    + valor, "Informações",JOptionPane.INFORMATION_MESSAGE );

        }





    }
}
