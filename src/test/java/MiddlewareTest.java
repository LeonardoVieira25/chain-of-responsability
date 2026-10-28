import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

public class MiddlewareTest {

    @Test
    void testProcessar() {
        Request request = new Request("usuario", "senha");
        Autenticacao autenticacao = new Autenticacao();
        autenticacao.processar(request);
        assertEquals("12345", request.userId);
    }

    @Test
    void testProcessarRequest() {
        Request request = new Request("usuario", "senha");
        Autenticacao autenticacao = new Autenticacao();
        autenticacao.setProximo(new Controller());
        autenticacao.processarRequest(request);
        assertEquals("12345", request.userId);
    }

    @Test
    void testSetProximo() {
        Autenticacao autenticacao = new Autenticacao();
        Controller controller = new Controller();
        assertSame(autenticacao, autenticacao.setProximo(controller));
        assertSame(controller, autenticacao.proximo);
    }
}
