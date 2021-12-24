package com.application.AddressBookAPP.service;

import java.util.List;

import com.application.AddressBookAPP.dto.ContactDTO;
import com.application.AddressBookAPP.model.ContactData;

public interface AddressBookInterface {
    List<ContactData> getContactData();
    ContactData getContactDataById(int contactID);
    ContactData createContactData(ContactDTO contactDTO);
    ContactData updateContactData(int contactID, ContactDTO contactDTO);
    void deleteContactData(int contactID);
}
