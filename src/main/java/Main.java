
public class Main {
    public static void main(String[] args) {
        Request request = new Request("usuario", "senha");

        new Autenticacao()
                .setProximo(new Controller())
                .processarRequest(request);

        System.out.println("Requisição processada com sucesso para o usuário: " + request.userId);
    }
}
