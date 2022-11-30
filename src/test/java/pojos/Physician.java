package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Physician {
    /*
    {
    "createdBy": "murattanc",
    "createdDate": "2022-08-02T11:18:35.673674Z",
    "id": 147333,
    "firstName": "Doktor",
    "lastName": "Yusuf",
    "birthDate": "1999-12-31T22:00:00Z",
    "phone": "555-555-5555",
    "gender": "MALE",
    "bloodGroup": "Apositive",
    "adress": "",
    "description": "",
    "user": {
        "createdBy": "anonymousUser",
        "createdDate": "2022-08-02T10:59:46.854360Z",
        "id": 153280,
        "login": "doktoryusuf",
        "firstName": "Doktor",
        "lastName": "Yusuf",
        "email": "doktoryusuf@gmail.com",
        "activated": true,
        "langKey": "en",
        "imageUrl": null,
        "resetDate": null,
        "ssn": "751-01-0103"
    },
    "speciality": "NUCLEAR_MEDICINE",
    "appointments": null,
    "country": null,
    "cstate": null,
    "examFee": 250.00,
    "image": "",
    "imageContentType": null
}
     */


    private String createdBy;
    private String createdDate;
    private int id;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String phone;
    private String gender;
    private String bloodGroup;
    private String adress;
    private String description;
    private pojos.User user;
    private String speciality;
    private String country;
    private String cstate;
    private double examFee;
    private String image;
    private String imageContentType;

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public pojos.User getUser() {
        return user;
    }

    public void setUser(pojos.User user) {
        this.user = user;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCstate() {
        return cstate;
    }

    public void setCstate(String cstate) {
        this.cstate = cstate;
    }

    public double getExamFee() {
        return examFee;
    }

    public void setExamFee(double examFee) {
        this.examFee = examFee;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImageContentType() {
        return imageContentType;
    }

    public void setImageContentType(String imageContentType) {
        this.imageContentType = imageContentType;
    }

    public Physician() {
    }

    public Physician(String createdBy, String createdDate, int id, String firstName, String lastName, String birthDate, String phone, String gender, String bloodGroup, String adress, String description, pojos.User user, String speciality, String country, String cstate, double examFee, String image, String imageContentType) {
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.phone = phone;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.adress = adress;
        this.description = description;
        this.user = user;
        this.speciality = speciality;
        this.country = country;
        this.cstate = cstate;
        this.examFee = examFee;
        this.image = image;
        this.imageContentType = imageContentType;
    }

    @Override
    public String toString() {
        return "Physician{" +
                "createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", adress='" + adress + '\'' +
                ", description='" + description + '\'' +
                ", user=" + user +
                ", speciality='" + speciality + '\'' +
                ", country='" + country + '\'' +
                ", cstate='" + cstate + '\'' +
                ", examFee=" + examFee +
                ", image='" + image + '\'' +
                ", imageContentType='" + imageContentType + '\'' +
                '}';
    }
}