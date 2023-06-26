import Navegador.Navegador;
import ReprodutorMusical.ReprodutorMusical;
import Telefone.AparelhoTelefonico;

public class Iphone {
    public static void main(String[] args) throws Exception {
           System.out.println("Ligar iPhone");

           Navegador  navegador = new Navegador();
           navegador.ExibirPagina() ;
           navegador.AdicionarNovaAba() ;
           navegador.AtualizarPagina() ;

                     
           ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
           reprodutorMusical.Tocar();
           reprodutorMusical.Pausa();
           reprodutorMusical.SelecionarMusica();

           AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
           
           aparelhoTelefonico.Atender();
           aparelhoTelefonico.Ligar();
           aparelhoTelefonico.IniciarCorreioDeVoz();
    



    }
 
}

 