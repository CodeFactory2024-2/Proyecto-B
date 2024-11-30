package com.codefactory.reserva_b.dto.impl;

import com.codefactory.reserva_b.dto.interfaces.IDocumentTypeResponseDTO;

public class DocumentTypeResponseDTOImpl implements IDocumentTypeResponseDTO {
    private final Long idDocumentType;
    private final String name;

    public DocumentTypeResponseDTOImpl(Long idDocumentType, String name) {
        this.idDocumentType = idDocumentType;
        this.name = name;
    }

    @Override
    public Long getIdDocumentType() {
        return idDocumentType;
    }

    @Override
    public String getName() {
        return name;
    }
}
