package com.application.AddressBookAPP.controller;

import com.application.AddressBookAPP.model.Contact;

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
     * @return : ResonseEntity of Contact
     */
    @GetMapping("/get")
    public ResponseEntity<String> getContactDetails(){
        return new ResponseEntity<String>("Get Call Success ",HttpStatus.OK);
    }

    /**
     * API for Getting get Contact Details by Contact ID
     * @param contactID
     * @return ResponseEntity of Contact Details of given ID
     */
    @GetMapping("/get/{contactID}")
    public ResponseEntity<String> getContactByID(@PathVariable("contactID") int contactID){
        return new ResponseEntity<String>("Get Call Success for Id : " +contactID,HttpStatus.OK);
        
    }

    /**
     * API for updating Contact using Response Entity
     * @param contact
     * @return : ResponseEntity of Contact data
     */
    @PostMapping("/create")
    public ResponseEntity<String> addingContact(@RequestBody Contact contact){
        return new ResponseEntity<String>("Created Created data for " +contact,HttpStatus.OK);
    }

    /**
     * API for Updating Details of Contact
     * @param contact
     * @return : ResponseEntity of Updated Contact
     */
    @PutMapping("/update")
    public ResponseEntity<String> updateContact(@RequestBody Contact contact){
        return new ResponseEntity<String>("Updated Contact Data for : "+contact,HttpStatus.OK);
    }

    /**
     * API for Deleteing Contact by ID
     * @param contact
     * @return :message showing delete ID
     */
    @DeleteMapping("/delete/{contactID}")
    public ResponseEntity<String> deleteContactByID(@PathVariable("contactID") int contactID){
        return new ResponseEntity<String>("Delete Call Success for ID : "+contactID,HttpStatus.OK);
    }
}
