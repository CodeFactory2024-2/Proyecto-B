package com.codefactory.reserva_b.util.interfaces;

import com.codefactory.reserva_b.dto.impl.DocumentTypeResponseDTOImpl;
import com.codefactory.reserva_b.entity.interfaces.IDocumentTypeEntity;

public interface IDocumentTypeMapper {
    DocumentTypeResponseDTOImpl mapDocumentTypeEntityToDocumentTypeResponseDTO(IDocumentTypeEntity entity);
}
