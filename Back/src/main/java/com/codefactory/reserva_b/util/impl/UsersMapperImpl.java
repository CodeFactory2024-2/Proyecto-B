package com.codefactory.reserva_b.util.impl;

import com.codefactory.reserva_b.dto.impl.DocumentTypeResponseDTOImpl;
import com.codefactory.reserva_b.dto.impl.RoleResponseDTOImpl;
import com.codefactory.reserva_b.dto.impl.UsersResponseDTOImpl;
import com.codefactory.reserva_b.dto.impl.UsersTypeResponseDTOImpl;
import com.codefactory.reserva_b.entity.impl.RoleEntityImpl;
import com.codefactory.reserva_b.entity.interfaces.IUsersEntity;
import com.codefactory.reserva_b.util.interfaces.IDocumentTypeMapper;
import com.codefactory.reserva_b.util.interfaces.IRoleMapper;
import com.codefactory.reserva_b.util.interfaces.IUsersMapper;
import com.codefactory.reserva_b.util.interfaces.IUsersTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UsersMapperImpl implements IUsersMapper {
    @Autowired
    private IUsersTypeMapper usersTypeMapper;
    @Autowired
    private IDocumentTypeMapper documentTypeMapper;
    @Autowired
    private IRoleMapper roleMapper;
    @Override
    public UsersResponseDTOImpl mapUsersEntityToUsersResponseDTO(IUsersEntity usersEntity) {
        if (usersEntity == null) {
            return null;
        }
        Long idUser = usersEntity.getIdUsers().longValue();
        String firstName = usersEntity.getFirstName();
        String lastName = usersEntity.getLastName();
        String phoneNumber = usersEntity.getPhoneNumber();
        String email = usersEntity.getEmail();
        String nationality = usersEntity.getNationality();
        String dateOfBirth = usersEntity.getDateOfBirth().toString();
        String documentId = usersEntity.getDocumentId();
        String passportNumber = usersEntity.getPassportNumber();
        String registrationDate = usersEntity.getRegistrationDate().toString();
        Integer flyerNumber = usersEntity.getFlyerNumber().intValue();
        String address = usersEntity.getAddress();
        Long idUsersType = usersEntity.getIdUsersType().longValue();
        Long idDocumentType = usersEntity.getIdDocumentType().longValue();
        UsersTypeResponseDTOImpl usersType = usersEntity.getUsersType() != null ?
                usersTypeMapper.mapUsersTypeEntityToUsersTypeResponseDTO(usersEntity.getUsersType()) : null;
        DocumentTypeResponseDTOImpl documentType = usersEntity.getDocumentType() != null ?
                documentTypeMapper.mapDocumentTypeEntityToDocumentTypeResponseDTO(usersEntity.getDocumentType()) : null;
        List<RoleResponseDTOImpl> roles = usersEntity.getRoles() != null ?
                roleMapper.mapRoleEntitiesToRoleResponseDTOs(usersEntity.getRoles()) : null;
        return new UsersResponseDTOImpl(
                idUser,
                firstName,
                lastName,
                phoneNumber,
                email,
                nationality,
                dateOfBirth,
                documentId,
                passportNumber,
                registrationDate,
                flyerNumber,
                address,
                idUsersType,
                usersType,
                idDocumentType,
                documentType,
                roles
        );
    }

}
