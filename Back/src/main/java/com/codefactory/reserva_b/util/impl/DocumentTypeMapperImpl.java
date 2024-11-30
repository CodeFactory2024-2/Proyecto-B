package com.codefactory.reserva_b.util.impl;

import com.codefactory.reserva_b.dto.impl.DocumentTypeResponseDTOImpl;
import com.codefactory.reserva_b.entity.interfaces.IDocumentTypeEntity;
import com.codefactory.reserva_b.util.interfaces.IDocumentTypeMapper;
import org.springframework.stereotype.Component;

@Component
public class DocumentTypeMapperImpl implements IDocumentTypeMapper {
    @Override
    public DocumentTypeResponseDTOImpl mapDocumentTypeEntityToDocumentTypeResponseDTO(IDocumentTypeEntity entity) {
        if (entity == null) {
            return null;
        }
        return new DocumentTypeResponseDTOImpl(
                entity.getIdDocumentType().longValue(),
                entity.getName()
        );
    }
}
