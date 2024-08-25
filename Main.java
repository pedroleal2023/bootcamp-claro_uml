import com.example.device.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        // Exemplos de uso dos métodos implementados
        iphone.exibirPagina("www.example.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Minha música favorita");
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();
    }
}