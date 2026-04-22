import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorUsuarioTest {

    private ValidadorUsuario validador;

    @BeforeEach
    void setUp() {
        validador = new ValidadorUsuario();
    }

    // =========================
    // TESTES NOME DE USUÁRIO
    // =========================

    @Test
    void testNomeUsuarioValido() {
        assertTrue(validador.validarNomeUsuario("Brito123"));
        assertTrue(validador.validarNomeUsuario("Raphael"));
    }

    @Test
    void testNomeUsuarioMuitoCurto() {
        assertFalse(validador.validarNomeUsuario("ab"));
    }

    @Test
    void testNomeUsuarioMuitoLongo() {
        assertFalse(validador.validarNomeUsuario("abcdefghijklmnopqrstu")); // 21 chars
    }

    @Test
    void testNomeUsuarioNulo() {
        assertFalse(validador.validarNomeUsuario(null));
    }

    // =========================
    // TESTES EMAIL
    // =========================

    @Test
    void testEmailValido() {
        assertTrue(validador.validarEmail("teste@email.com"));
        assertTrue(validador.validarEmail("user.name@dominio.com"));
    }

    @Test
    void testEmailSemArroba() {
        assertFalse(validador.validarEmail("testeemail.com"));
    }

    @Test
    void testEmailSemDominio() {
        assertFalse(validador.validarEmail("teste@"));
        assertFalse(validador.validarEmail("teste@email"));
    }

    @Test
    void testEmailNulo() {
        assertFalse(validador.validarEmail(null));
    }

    // =========================
    // TESTES SENHA
    // =========================

    @Test
    void testSenhaValida() {
        assertTrue(validador.validarSenha("Senha123"));
        assertTrue(validador.validarSenha("abc12345"));
    }

    @Test
    void testSenhaMuitoCurta() {
        assertFalse(validador.validarSenha("Ab1"));
    }

    @Test
    void testSenhaSemNumero() {
        assertFalse(validador.validarSenha("Senhaaaaa"));
    }

    @Test
    void testSenhaSemLetra() {
        assertFalse(validador.validarSenha("12345678"));
    }

    @Test
    void testSenhaNula() {
        assertFalse(validador.validarSenha(null));
    }
}