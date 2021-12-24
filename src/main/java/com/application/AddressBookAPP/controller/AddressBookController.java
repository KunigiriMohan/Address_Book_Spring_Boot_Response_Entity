package com.application.AddressBookAPP.controller;

import java.util.List;

import com.application.AddressBookAPP.dto.ContactDTO;
import com.application.AddressBookAPP.dto.ResponseDTO;
import com.application.AddressBookAPP.model.ContactData;
import com.application.AddressBookAPP.service.AddressBookInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController : Defining Class as a RestController
 * @RequestMapping : Defining path of URL
 * @PostMapping : Defining URL path of API and to perform POST operation
 * @GetMapping : Defining URL Path of API
 * @PutMapping : Defining URL Path of API which perform PUT operation
 * @DeleteMapping : Defining URL Path of API which perform DELETE opertion
 * @Autowired : Dependency Injection
 */

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @Autowired
    AddressBookInterface addressBookInterface;
    
    /**
     * API for getting all Contacts
     * @return : ResponseEntity of Contact
     */
    @GetMapping("/get")
    public ResponseEntity<ResponseDTO> getContactDetails(){
        List<ContactData> contactData = addressBookInterface.getContactData();
        ResponseDTO responseDTO = new ResponseDTO("Get Call Success : ", contactData);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }

    /**
     * API for Getting get Contact Details by Contact ID
     * @param contactID
     * @return ResponseEntity of Contact Details of given ID
     */
    @GetMapping("/get/{contactID}")
    public ResponseEntity<ResponseDTO> getContactByID(@PathVariable("contactID") int contactID){
        ContactData contactData = addressBookInterface.getContactDataById(contactID);
        ResponseDTO responseDTO = new ResponseDTO("Get Call Success : ", contactData);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
        
    }

    /**
     * API for updating Contact using Response Entity
     * @param contactDTO
     * @return : ResponseEntity of Contact data
     */
    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addingContact(@RequestBody ContactDTO contactDTO){
        ContactData contactData = addressBookInterface.createContactData(contactDTO);
        ResponseDTO responseDTO = new ResponseDTO("Create Call Success : ", contactData);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }

    /**
     * API for Updating Details of Contact
     * @param contactDTO
     * @return : ResponseEntity of Updated Contact
     */
    @PutMapping("/update/{contactID}")
    public ResponseEntity<ResponseDTO> updateContact(@RequestBody ContactDTO contactDTO,@PathVariable("contactID") int contactID){
        ContactData contactData = addressBookInterface.updateContactData(contactID,contactDTO);
        ResponseDTO responseDTO = new ResponseDTO("Update Call Success : ", contactData);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }

    /**
     * API for Deleteing Contact by ID
     * @param contactID
     * @return :message showing delete ID
     */
    @DeleteMapping("/delete/{contactID}")
    public ResponseEntity<ResponseDTO> deleteContactByID(@PathVariable("contactID") int contactID){
        addressBookInterface.deleteContactData(contactID);
        ResponseDTO responseDTO = new ResponseDTO("Deleted Successfull : ", contactID);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }
}
