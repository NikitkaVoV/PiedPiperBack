package ru.piedpipers.backend.general.message.model.responsemessage;


import ru.piedpipers.backend.general.message.intefaces.IResponseMessage;

public record FieldResponseMessage(String fieldName, String localizedFieldName, String message) implements IResponseMessage {
}
