package fr.isen.projet.adressesetcontacts.interfaces.services;

import java.util.List;
import fr.isen.projet.adressesetcontacts.interfaces.models.AddressModel;

//begin of modifiable zone(Javadoc).......C/0d5c7dfd-1295-4cb2-813b-68debcd02a35

//end of modifiable zone(Javadoc).........E/0d5c7dfd-1295-4cb2-813b-68debcd02a35
public interface AddressService {
//begin of modifiable zone(Javadoc).......C/4d794fcc-45fb-4dfb-b569-0776ec18e920

//end of modifiable zone(Javadoc).........E/4d794fcc-45fb-4dfb-b569-0776ec18e920
    AddressModel createAddress(final AddressModel adresse);

//begin of modifiable zone(Javadoc).......C/f5c46c96-557a-49d1-bb79-e026bb976c6e

//end of modifiable zone(Javadoc).........E/f5c46c96-557a-49d1-bb79-e026bb976c6e
    AddressModel getAddressById(final String uuid);

//begin of modifiable zone(Javadoc).......C/b2182c63-7ab3-4f7f-af30-02b6fca7276f

//end of modifiable zone(Javadoc).........E/b2182c63-7ab3-4f7f-af30-02b6fca7276f
    List<AddressModel> getAllAddresses();

//begin of modifiable zone(Javadoc).......C/8eaaa4a0-1f8e-4198-92e4-c13aa0ce029a

//end of modifiable zone(Javadoc).........E/8eaaa4a0-1f8e-4198-92e4-c13aa0ce029a
    AddressModel updateAddress(final String uuid, final AddressModel adresse);

//begin of modifiable zone(Javadoc).......C/fde758ac-6dcf-43cc-9c4e-61ffef804a7e

//end of modifiable zone(Javadoc).........E/fde758ac-6dcf-43cc-9c4e-61ffef804a7e
    void deleteAddress(final String uuid);

}
