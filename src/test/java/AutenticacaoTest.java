import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AutenticacaoTest {
    @Test
    void deveAutenticarUsuarioComSucesso() {
        Request request = new Request("usuario", "senha");
        Autenticacao autenticacao = new Autenticacao();
        autenticacao.processar(request);
        assertEquals("12345", request.userId);

    }

    @Test
    void deveFalharNaAutenticacaoComUsuarioInvalido() {
        Request request = new Request("usuarioInvalido", "senha");
        Autenticacao autenticacao = new Autenticacao();
        assertThrows(RuntimeException.class, () -> autenticacao.processar(request));
    }

    @Test
    void deveFalharNaAutenticacaoSemCredenciais() {
        Request request = new Request("userId");
        Autenticacao autenticacao = new Autenticacao();
        assertThrows(RuntimeException.class, () -> autenticacao.processar(request));
    }
}
