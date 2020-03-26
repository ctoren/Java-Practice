public class AdressBook {                      //creating address book elements, including name, company, phone, email
    private String name;
    private String companyName;
    private String phoneNum;
    private String email;

    AdressBook(String n, String c, String p, String e){
        name = n;
        companyName = c;
        phoneNum = p;
        email = e;
    }
    public String toString() {
        return name + "\n" + companyName + "\n" + phoneNum + "\n" + email;
    }
}
