package spring.mvc.entity;

/**
 * Created by Денис on 28.02.2015.
 */

import com.google.common.base.Objects;

import javax.persistence.*;

@Entity
@Table(name = "CLIENT_TABLE")
public class ClientEntity {

    @Id
    @GeneratedValue
    @Column(name = "id", length = 6, nullable = false)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "address")
    private String address;

    @Column(name = "email")
    private String email;

//    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
//    @JoinColumn(name = "bank_id", nullable = false)
//    private Bank bank;

    public ClientEntity(){

    }

    public ClientEntity(String firstName, String lastName, String phoneNumber,
                        String address, String email, BankEntity bankEntity) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
//        this.bank = bank;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
//
//    public Bank getBank() {
//        return bank;
//    }
//
//    public void setBank(Bank bank) {
//        this.bank = bank;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientEntity that = (ClientEntity) o;
        return com.google.common.base.Objects.equal(id, that.id) &&
                com.google.common.base.Objects.equal(firstName, that.firstName) &&
                com.google.common.base.Objects.equal(lastName, that.lastName) &&
                com.google.common.base.Objects.equal(phoneNumber, that.phoneNumber) &&
                com.google.common.base.Objects.equal(address, that.address) &&
                com.google.common.base.Objects.equal(email, that.email);
    }

    @Override
    public int hashCode() {
        return com.google.common.base.Objects.hashCode(id, firstName, lastName, phoneNumber, address, email);
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("id", id)
                .add("firstName", firstName)
                .add("lastName", lastName)
                .add("phoneNumber", phoneNumber)
                .add("address", address)
                .add("email", email)
                .toString();
    }
}
