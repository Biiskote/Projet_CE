package fr.isen.projet.adressesetcontacts.interfaces.services;

import java.util.List;
import fr.isen.projet.adressesetcontacts.interfaces.models.ContactModel;

//begin of modifiable zone(Javadoc).......C/c6b8fe40-c7fd-4854-8d65-13ced3ee4714

//end of modifiable zone(Javadoc).........E/c6b8fe40-c7fd-4854-8d65-13ced3ee4714
public interface ContactService {
//begin of modifiable zone(Javadoc).......C/b9f80e43-9657-4cf9-8ca2-1378adf01544

//end of modifiable zone(Javadoc).........E/b9f80e43-9657-4cf9-8ca2-1378adf01544
    String createContact(final ContactModel contact);

//begin of modifiable zone(Javadoc).......C/94a000f7-adc6-42e6-8bc3-b92696f407dd

//end of modifiable zone(Javadoc).........E/94a000f7-adc6-42e6-8bc3-b92696f407dd
    ContactModel getContactById(final String uuid);

//begin of modifiable zone(Javadoc).......C/5d66ee0e-740c-49b8-895d-541e7a2361e7

//end of modifiable zone(Javadoc).........E/5d66ee0e-740c-49b8-895d-541e7a2361e7
    List<ContactModel> getAllContacts();

//begin of modifiable zone(Javadoc).......C/77b62e6f-3948-4315-a6e3-060b98559f55

//end of modifiable zone(Javadoc).........E/77b62e6f-3948-4315-a6e3-060b98559f55
    ContactModel updateContact(final String uuid, ContactModel updatedContact);

//begin of modifiable zone(Javadoc).......C/9f37b3e7-870a-4010-98d6-1bb724a5bf07

//end of modifiable zone(Javadoc).........E/9f37b3e7-870a-4010-98d6-1bb724a5bf07
    void deleteContact(final String uuid);

//begin of modifiable zone(Javadoc).......C/379576c5-3aa9-4646-ad56-75e6870301fa

//end of modifiable zone(Javadoc).........E/379576c5-3aa9-4646-ad56-75e6870301fa
    List<ContactModel> searchThreeDigitsCriteria(final String search);

}
