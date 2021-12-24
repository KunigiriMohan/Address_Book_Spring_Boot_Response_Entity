package com.application.AddressBookAPP.dto;

public class ResponseDTO {
    private String message;
    private Object contactDTO;
    
    /**
     * Defining Constructer 
     * @param message
     * @param contactDTO
     */
    public ResponseDTO(String message, Object contactDTO) {
        this.message = message;
        this.contactDTO = contactDTO;
    }

    /**
     * Getters and Setters
     */
    public String getMessage() {
        return message;
    }


    public void setMessage(String message) {
        this.message = message;
    }


    public Object getContactDTO() {
        return contactDTO;
    }


    public void setContactDTO(Object contactDTO) {
        this.contactDTO = contactDTO;
    }
}
