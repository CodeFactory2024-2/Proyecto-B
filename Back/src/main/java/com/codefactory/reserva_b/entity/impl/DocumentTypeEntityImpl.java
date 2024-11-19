package com.codefactory.reserva_b.entity.impl;

import com.codefactory.reserva_b.entity.interfaces.IDocumentTypeEntity;
import com.codefactory.reserva_b.entity.interfaces.IEntity;
import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Table(name = "document_type")
public class DocumentTypeEntityImpl implements IDocumentTypeEntity, IEntity, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_document_type", nullable = false)
    private BigInteger idDocumentType;

    @Column(name = "name", nullable = false)
    private String name;

    public DocumentTypeEntityImpl() {}

    public DocumentTypeEntityImpl(String name) {
        this.name = name;
    }

    @Override
    public BigInteger getIdDocumentType() {
        return idDocumentType;
    }

    @Override
    public void setIdDocumentType(BigInteger idDocumentType) {
        this.idDocumentType = idDocumentType;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocumentTypeEntityImpl that = (DocumentTypeEntityImpl) o;
        return Objects.equals(idDocumentType, that.idDocumentType);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idDocumentType);
    }

    @Override
    public String toString() {
        return "DocumentTypeEntityImpl{" +
                "idDocumentType=" + idDocumentType +
                ", name='" + name + '\'' +
                '}';
    }
}
