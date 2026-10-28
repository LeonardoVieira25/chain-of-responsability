public class Controller extends Middleware {
    @Override
    public void processar(Request request) {
        if (request.userId == null || request.userId.isEmpty()) {
            throw new RuntimeException("Usuário não autenticado. Acesso negado.");
        }
        System.out.println("Processando requisição para o usuário: " + request.userId);
    }
}
