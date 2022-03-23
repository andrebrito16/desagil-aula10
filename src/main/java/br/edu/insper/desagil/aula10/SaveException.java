package br.edu.insper.desagil.aula10;

public class SaveException extends Exception {
    private static final Long serialVersionUID = 1L;

    public SaveException(String message) {
        super(message);
    }
}
