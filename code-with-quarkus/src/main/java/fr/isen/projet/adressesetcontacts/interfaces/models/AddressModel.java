package fr.isen.projet.adressesetcontacts.interfaces.models;

import java.util.Date;

//begin of modifiable zone(Javadoc).......C/39088076-175d-4ce7-b102-44aba4490abb

//end of modifiable zone(Javadoc).........E/39088076-175d-4ce7-b102-44aba4490abb
public class AddressModel {
//begin of modifiable zone(Javadoc).......C/2dbcd949-cf81-457f-90fe-d5385c9bedca

//end of modifiable zone(Javadoc).........E/2dbcd949-cf81-457f-90fe-d5385c9bedca
    private String uuid;

//begin of modifiable zone(Javadoc).......C/77688b5a-b834-47cf-abde-3ba4fc251b5a

//end of modifiable zone(Javadoc).........E/77688b5a-b834-47cf-abde-3ba4fc251b5a
    private int number;

//begin of modifiable zone(Javadoc).......C/a462cf0f-91b2-42dd-aaa3-2505346269fc

//end of modifiable zone(Javadoc).........E/a462cf0f-91b2-42dd-aaa3-2505346269fc
    private String street;

//begin of modifiable zone(Javadoc).......C/f44db4f9-f140-4e10-aa7f-a01fb1107700

//end of modifiable zone(Javadoc).........E/f44db4f9-f140-4e10-aa7f-a01fb1107700
    private String postal_code;

//begin of modifiable zone(Javadoc).......C/53e3e393-46ef-4dff-ab1d-1e76d5f0b469

//end of modifiable zone(Javadoc).........E/53e3e393-46ef-4dff-ab1d-1e76d5f0b469
    private String city;

//begin of modifiable zone(Javadoc).......C/df848f89-36f2-4e4c-909c-01a18ca4d530

//end of modifiable zone(Javadoc).........E/df848f89-36f2-4e4c-909c-01a18ca4d530
    private String country;

//begin of modifiable zone(Javadoc).......C/a9e0f5d3-5ec4-4b57-8390-dd669899582f

//end of modifiable zone(Javadoc).........E/a9e0f5d3-5ec4-4b57-8390-dd669899582f
    private String additional_information;

//begin of modifiable zone(Javadoc).......C/baf17ec3-9f9f-4102-b6ed-53cbc0d209c8

//end of modifiable zone(Javadoc).........E/baf17ec3-9f9f-4102-b6ed-53cbc0d209c8
    private Date creation_date;

//begin of modifiable zone(Javadoc).......C/99a37571-db85-4067-bba8-9af7ea9b1d5e

//end of modifiable zone(Javadoc).........E/99a37571-db85-4067-bba8-9af7ea9b1d5e
    private Date update_date;

//begin of modifiable zone(Javadoc).......C/e06d6d1c-d840-46e1-b27e-1e3d0d42f319

//end of modifiable zone(Javadoc).........E/e06d6d1c-d840-46e1-b27e-1e3d0d42f319
    private boolean deleted;

    // Getters and Setters

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public int getUnitNumber() {
        return number;
    }

    public void setUnitNumber(int number) {
        this.number = number;
    }

    public String getStreetName() {
        return street;
    }

    public void setStreetName(String street) {
        this.street = street;
    }

    public String getPostalCode() {
        return postal_code;
    }

    public void setPostalCode(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAdditionalInformation() {
        return additional_information;
    }

    public void setAdditionalInformation(String additional_information) {
        this.additional_information = additional_information;
    }

    public Date getCreationDate() {
        return creation_date;
    }

    public void setCreationDate(Date creation_date) {
        this.creation_date = creation_date;
    }

    public Date getUpdateDate() {
        return update_date;
    }

    public void setUpdateDate(Date update_date) {
        this.update_date = update_date;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
