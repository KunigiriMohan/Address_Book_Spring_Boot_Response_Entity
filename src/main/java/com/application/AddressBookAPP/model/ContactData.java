package com.application.AddressBookAPP.model;

import com.application.AddressBookAPP.dto.ContactDTO;

public class ContactData {
    private int iD;
    private ContactDTO contactDTO;
    
    /**
     * Defining Constructer
     * @param iD
     * @param contactDTO
     */
    public ContactData(int iD, ContactDTO contactDTO) {
        this.iD = iD;
        this.contactDTO = contactDTO;
    }
    /**
    * Getters and Setters
    */
    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public ContactDTO getContactDTO() {
        return contactDTO;
    }

    public void setContactDTO(ContactDTO contactDTO) {
        this.contactDTO = contactDTO;
    }  
}
