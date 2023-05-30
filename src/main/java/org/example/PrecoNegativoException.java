package org.example;

public class PrecoNegativoException extends Exception{
    public PrecoNegativoException(){
        System.out.println("O valor digitado não é valido!");
    }
}
