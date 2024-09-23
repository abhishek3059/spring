package com.irctc.trainBookingApp.advice;

import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.irctc.trainBookingApp.customExceptions.BookingNotFoundException;
import com.irctc.trainBookingApp.customExceptions.PassengerNotFoundException;
import com.irctc.trainBookingApp.customExceptions.TrainNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<String> throwNullPointerException(NullPointerException nullPointerException) {
        return new ResponseEntity<>(nullPointerException.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(TrainNotFoundException.class)
    public ResponseEntity<String> throwTrainNotFoundException(TrainNotFoundException trainNotFoundException) {
        return new ResponseEntity<>(trainNotFoundException.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(BookingNotFoundException.class)
    public ResponseEntity<String> throwBookingNotFoundException(BookingNotFoundException bookingNotFoundException) {
        return new ResponseEntity<>(bookingNotFoundException.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(PassengerNotFoundException.class)
    public ResponseEntity<String> throwPassengerNotFoundException(PassengerNotFoundException passengerNotFoundException) {
        return new ResponseEntity<>(passengerNotFoundException.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> throwMethodArgumentNotValidException(MethodArgumentNotValidException methodArgumentNotValidException) {
        String errorMessage = methodArgumentNotValidException.getBindingResult().getFieldErrors()
            .stream()
            .map(e -> e.getField() + ": " + e.getDefaultMessage())
            .collect(Collectors.joining(", "));
        return new ResponseEntity<>(errorMessage, HttpStatus.NOT_ACCEPTABLE);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGeneralException(Exception ex) {
        return new ResponseEntity<>("An unexpected error occurred: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
