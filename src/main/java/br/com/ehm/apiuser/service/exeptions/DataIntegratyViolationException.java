package br.com.ehm.apiuser.service.exeptions;

public class DataIntegratyViolationException extends RuntimeException{
    public DataIntegratyViolationException(String message) {
        super(message);
    }
}
