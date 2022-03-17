package africa.semicolon.phoneBook.controllers;

import africa.semicolon.phoneBook.dtos.requests.RegisterContactRequest;
import africa.semicolon.phoneBook.dtos.response.ApiResponse;
import africa.semicolon.phoneBook.dtos.response.RegisterContactResponse;
import africa.semicolon.phoneBook.services.ContactService;
import africa.semicolon.phoneBook.services.ContactServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Contacts")
public class ContactController {
    private ContactService theContactService = new ContactServiceImpl();

    @Autowired
    @PostMapping("/save")
    public RegisterContactResponse save(@RequestBody RegisterContactRequest request){
//        CaseUtil.filter(toSentenceCase(request));
        return theContactService.saveContact(request);
    }

    @GetMapping("/{keyword}")
    public ResponseEntity<?> findContactByfirstName(@PathVariable String name){
        try {
            return new ResponseEntity<>(theContactService.findContactByName(name), HttpStatus.OK);
        } catch(Exception ex){
            return new ResponseEntity<>(new ApiResponse(false, ex.getMessage()), HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete")
    public RegisterContactResponse deleteContact(@PathVariable String name, String mobile){
        return theContactService.deleteContact(name, mobile);
    }


}
