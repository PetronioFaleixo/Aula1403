public class Pizza {
    public String _nome;
    public Double _valor;
    public Boolean _borda;

    public String Pizza(String nome, Double valor, Boolean borda){
        nome = _nome;
        valor = _valor;
        borda = _borda;
    return "vai ";
    }

    public Double CalculaPreco(Double valor,Boolean borda)
    {
        if(borda == true)
        {
            return valor + 5;
        }
        return valor;
    }
}
