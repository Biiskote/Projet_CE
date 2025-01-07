package fr.isen.projet.adressesetcontacts.interfaces.models;

import java.util.Date;

//begin of modifiable zone(Javadoc).......C/d68136aa-c448-4053-b345-564deebf5f52

//end of modifiable zone(Javadoc).........E/d68136aa-c448-4053-b345-564deebf5f52
public class ContactModel {
//begin of modifiable zone(Javadoc).......C/b4890d1a-f285-4427-aa24-1f084532f7ec

//end of modifiable zone(Javadoc).........E/b4890d1a-f285-4427-aa24-1f084532f7ec
    private String uuid;

//Ajout de la colonne avec l'id de l'addresse du contact en question -----------
    private String id_address;

//begin of modifiable zone(Javadoc).......C/36bd4a31-367d-4538-8888-9527cd4012f6

//end of modifiable zone(Javadoc).........E/36bd4a31-367d-4538-8888-9527cd4012f6
    private String name;

//begin of modifiable zone(Javadoc).......C/082c42a9-7595-47da-b601-fcd2d3dc75b8

//end of modifiable zone(Javadoc).........E/082c42a9-7595-47da-b601-fcd2d3dc75b8
    private String first_name;

//begin of modifiable zone(Javadoc).......C/7a3bafda-9a60-4f5a-881d-8f4bf91d3b16

//end of modifiable zone(Javadoc).........E/7a3bafda-9a60-4f5a-881d-8f4bf91d3b16
    private String email;

//begin of modifiable zone(Javadoc).......C/f369b659-74a7-4953-ab33-95a4c1871249

//end of modifiable zone(Javadoc).........E/f369b659-74a7-4953-ab33-95a4c1871249
    private String personal_phone;

//begin of modifiable zone(Javadoc).......C/737e296c-bf68-4e1e-8140-66086d4026be

//end of modifiable zone(Javadoc).........E/737e296c-bf68-4e1e-8140-66086d4026be
    private String job;

//begin of modifiable zone(Javadoc).......C/e2aa7506-0cbf-4b3f-8821-bb48fec2ef60

//end of modifiable zone(Javadoc).........E/e2aa7506-0cbf-4b3f-8821-bb48fec2ef60
    private String work_phone;

//begin of modifiable zone(Javadoc).......C/e7be11f0-f6c5-4530-8610-a2650a4eca84

//end of modifiable zone(Javadoc).........E/e7be11f0-f6c5-4530-8610-a2650a4eca84
    private Date creation_date;

//begin of modifiable zone(Javadoc).......C/9cb71f05-7c89-4d66-88eb-5c27087abfb8

//end of modifiable zone(Javadoc).........E/9cb71f05-7c89-4d66-88eb-5c27087abfb8
    private Date update_date;

//begin of modifiable zone(Javadoc).......C/2e83f12f-29fa-4e53-a4c5-b24ab3072cd2

//end of modifiable zone(Javadoc).........E/2e83f12f-29fa-4e53-a4c5-b24ab3072cd2
    private boolean deleted;

    // Getters and Setters

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getIdAddress() {
        return id_address;
    }

    public void setIdAddress(String id_address) {
        this.id_address = id_address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return first_name;
    }

    public void setFirstname(String first_name) {
        this.first_name = first_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPersonalPhone() {
        return personal_phone;
    }

    public void setPersonalPhone(String personal_phone) {
        this.personal_phone = personal_phone;
    }

    public String getFunction() {
        return job;
    }

    public void setFunction(String job) {
        this.job = job;
    }

    public String getBuisnessPhone() {
        return work_phone;
    }

    public void setBuisnessPhone(String work_phone) {
        this.work_phone = work_phone;
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
