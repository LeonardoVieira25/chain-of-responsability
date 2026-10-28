public class Autenticacao extends Middleware {
    @Override
    public void processar(Request request) {
        System.out.println("Autenticando usuário: " + request.userId);
        if (request.userName.equals("usuario") && request.password.equals("senha")) {
            request.userId = "12345";
        } else {
            throw new RuntimeException("Falha na autenticação do usuário.");
        }
    }
}
