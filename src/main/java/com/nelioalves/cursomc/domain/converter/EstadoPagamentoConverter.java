package com.nelioalves.cursomc.domain.converter;

import javax.persistence.AttributeConverter;

import com.nelioalves.cursomc.domain.enums.EstadoPagamento;

public class EstadoPagamentoConverter implements AttributeConverter<EstadoPagamento, Integer> {

	@Override
	public Integer convertToDatabaseColumn(EstadoPagamento attribute) {
		return attribute.getCod();
	}

	@Override
	public EstadoPagamento convertToEntityAttribute(Integer dbData) {
		return EstadoPagamento.toEnum(dbData);
	}
}
