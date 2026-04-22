public class ValidadorUsuario {

    public boolean validarNomeUsuario(String nome) {
        return nome != null && nome.length() >= 3 && nome.length() <= 20;
    }

    public boolean validarEmail(String email) {
        return email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");
    }

    public boolean validarSenha(String senha) {
        return senha != null && senha.length() >= 8 && senha.matches(".*[A-Za-z].*") && senha.matches(".*\\d.*");
    }
}