package com;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import org.springframework.data.convert.Jsr310Converters;

@Converter(autoApply = true)
public class LocalDateAttributeConverter implements AttributeConverter<LocalDate, Date> {
 
	
	@Override
   public Date convertToDatabaseColumn(LocalDate date) {
       return Jsr310Converters.LocalDateToDateConverter.INSTANCE.convert(date);
   }

   @Override
   public LocalDate convertToEntityAttribute(Date date) {
       return Jsr310Converters.DateToLocalDateConverter.INSTANCE.convert(date);
   }
}
