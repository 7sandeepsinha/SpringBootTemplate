package dev.sandeep.IBClone.dto;

import org.springframework.http.HttpStatus;

public class ResponseDto<T> {
    private HttpStatus statusCode;
    private T data;

    public ResponseDto(HttpStatus statusCode, T data){
        this.statusCode = statusCode;
        this.data = data;
    }


}
