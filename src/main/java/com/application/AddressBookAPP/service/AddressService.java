package com.application.AddressBookAPP.service;

import java.util.ArrayList;
import java.util.List;
import com.application.AddressBookAPP.dto.ContactDTO;
import com.application.AddressBookAPP.model.ContactData;
import org.springframework.stereotype.Service;

/**
* @Service : creating service layer
* @Override : Overriding implemented methods from interface
*/
@Service
public class AddressService implements AddressBookInterface{

    /**
     * method to Show all Contact Details in AddressBook
     * @return : Entered Contact Data
     */
    @Override
    public List<ContactData> getContactData() {
        List<ContactData> contactDatas = new ArrayList<>();
        contactDatas.add(new ContactData(1,new ContactDTO("mohan","5/223","Hyderabad","Andhra Pradesh","518301","85550585852","kmohanr5@gmail.com")));
        return contactDatas;
    }

    /**
     * method to return Contact Details by ID
     * @param : contactID
     * @return : Contact details of particular ID
     */
    @Override
    public ContactData getContactDataById(int contactID) {
        List<ContactData> contactDatas = new ArrayList<>();
        contactDatas.add(new ContactData(contactID,new ContactDTO("mohan","5/223","Hyderabad","Andhra Pradesh","518301","85550585852","kmohanr5@gmail.com")));
        return contactDatas.get(contactID);
    }

    /**
     * method to create a Contact in Address Book
     * @param : contactDTO
     * @return : Entered Contact Data
     */
    @Override
    public ContactData createContactData(ContactDTO contactDTO) {
        ContactData contactData = new ContactData(1, contactDTO);
        return contactData;
    }

    /**
     * method to Update Contact Data
     * @param : contactDTO
     * @return : Updated Contact Data
     */
    @Override
    public ContactData updateContactData(int contactID,ContactDTO contactDTO) {
        ContactData contactData = new ContactData(contactID, contactDTO);
        return contactData;
    }

    /**
     * method to delete contact
     * @param : contactID
     */
    @Override
    public void deleteContactData(int contactID) {
    }
    
}
