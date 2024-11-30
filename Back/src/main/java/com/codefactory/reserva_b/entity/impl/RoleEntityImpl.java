package com.codefactory.reserva_b.entity.impl;

import com.codefactory.reserva_b.entity.interfaces.IEntity;
import com.codefactory.reserva_b.entity.interfaces.IRoleEntity;
import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "role")
public class RoleEntityImpl implements IRoleEntity, IEntity, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_role", nullable = false)
    private BigInteger idRole;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinTable(name = "role_permission", joinColumns = @JoinColumn(name = "id_role"), inverseJoinColumns = @JoinColumn(name = "id_permission"))
    private List<PermissionEntityImpl> permissions;

    public RoleEntityImpl() {}

    public RoleEntityImpl(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public BigInteger getIdRole() {
        return idRole;
    }

    @Override
    public void setIdRole(BigInteger idRole) {
        this.idRole = idRole;
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
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    public List<PermissionEntityImpl> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<PermissionEntityImpl> permissions) {
        this.permissions = permissions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoleEntityImpl that = (RoleEntityImpl) o;
        return Objects.equals(idRole, that.idRole);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idRole);
    }

    @Override
    public String toString() {
        return "RoleEntityImpl{" +
                "idRole=" + idRole +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
