package com.projetomobile.compras.utils.handler;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ResponseStatusException;

@RestControllerAdvice
public class ControllerAdvice {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ApiErrors validationErrors(MethodArgumentNotValidException exception) {
		BindingResult binding = exception.getBindingResult();
		List<String> messages = binding.getAllErrors().stream().map(error -> error.getDefaultMessage())
				.collect(Collectors.toList());
		return new ApiErrors(messages);
	}
	
	@ExceptionHandler(ResponseStatusException.class)
	public ResponseEntity<ApiErrors> responseStatusException( ResponseStatusException exception) {
		String messageError = exception.getMessage();
		HttpStatus statusError = exception.getStatus();
		ApiErrors apiErrors = new ApiErrors(messageError);
		
		return new ResponseEntity<ApiErrors>(apiErrors, statusError);
	}
}
