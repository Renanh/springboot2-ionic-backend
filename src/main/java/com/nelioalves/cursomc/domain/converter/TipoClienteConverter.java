package com.nelioalves.cursomc.domain.converter;

import javax.persistence.AttributeConverter;

import com.nelioalves.cursomc.domain.enums.TipoCliente;

public class TipoClienteConverter implements AttributeConverter<TipoCliente, Integer> {

	@Override
	public Integer convertToDatabaseColumn(TipoCliente attribute) {
		return attribute.getCod();
	}

	@Override
	public TipoCliente convertToEntityAttribute(Integer dbData) {
		return TipoCliente.toEnum(dbData);
	}
}
