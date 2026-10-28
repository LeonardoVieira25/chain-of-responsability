import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;


public class ControllerTest {

    @Test
    void deveProcessarRequisicaoComSucesso() {
        Request request = new Request("userId");
        Controller controller = new Controller();
        controller.processar(request);
        assertEquals("userId", request.userId);
    }


    @Test
    void deveFalharNaProcessamentoComUsuarioNaoAutenticado() {
        Request request = new Request("usuario", "senha");
        Controller controller = new Controller();
        assertThrows(RuntimeException.class, () -> controller.processar(request)); 
    }
}
