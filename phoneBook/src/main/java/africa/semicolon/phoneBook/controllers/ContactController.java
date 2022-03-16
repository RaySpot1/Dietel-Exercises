package africa.semicolon.phoneBook.controllers;

import africa.semicolon.phoneBook.dtos.requests.AddContactRequest;
import africa.semicolon.phoneBook.dtos.response.ContactResponse;
import africa.semicolon.phoneBook.dtos.response.FindContactResponse;
import africa.semicolon.phoneBook.services.ContactsService;
import africa.semicolon.phoneBook.services.ContactsServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Contacts")
public class ContactController {
    private ContactsService theContactService = new ContactsServiceImpl();

    @PostMapping("/save")
    public ContactResponse saveContact(@RequestBody AddContactRequest request){
        return theContactService.saveContact(request);
    }

    @GetMapping("/(search)")
    public FindContactResponse findContactByName(@PathVariable String name){
        return theContactService.searchByFirstName(name);
    }

    @DeleteMapping("/delete")
    public ContactResponse deleteContact(@PathVariable String name, String mobile){
        return theContactService.deleteContact(name, mobile);
    }


}
