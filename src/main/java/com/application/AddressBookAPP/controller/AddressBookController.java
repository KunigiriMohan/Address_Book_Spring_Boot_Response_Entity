package com.application.AddressBookAPP.controller;

import com.application.AddressBookAPP.dto.ContactDTO;
import com.application.AddressBookAPP.dto.ResponseDTO;
import com.application.AddressBookAPP.model.ContactData;

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
    
    /**
     * API for getting all Contacts
     * @return : ResponseEntity of Contact
     */
    @GetMapping("/get")
    public ResponseEntity<ResponseDTO> getContactDetails(){
        ContactData contactData = new ContactData(1,new ContactDTO("mohan","5/223","Hyderabad","Andhra Pradesh","518301","85550585852","kmohanr5@gmail.com"));
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
        ContactData contactData = new ContactData(contactID,new ContactDTO("mohan","5/223","Hyderabad","Andhra Pradesh","518301","85550585852","kmohanr5@gmail.com"));
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
        ContactData contactData = new ContactData(1, contactDTO);
        ResponseDTO responseDTO = new ResponseDTO("Create Call Success : ", contactData);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }

    /**
     * API for Updating Details of Contact
     * @param contactDTO
     * @return : ResponseEntity of Updated Contact
     */
    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateContact(@RequestBody ContactDTO contactDTO){
        ContactData contactData = new ContactData(1, contactDTO);
        ResponseDTO responseDTO = new ResponseDTO("Create Call Success : ", contactData);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }

    /**
     * API for Deleteing Contact by ID
     * @param contactID
     * @return :message showing delete ID
     */
    @DeleteMapping("/delete/{contactID}")
    public ResponseEntity<ResponseDTO> deleteContactByID(@PathVariable("contactID") int contactID){
        ResponseDTO responseDTO = new ResponseDTO("Deleted Successfully :  ","Deleted Id"+contactID);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }
}
