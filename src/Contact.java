
public class Contact {
    private Integer cid;
    private String fname;
    private String lname;
    private String group;
    private String phone;
    private String email;
    private String address;
    private byte[] pic;
    private int uid;

    public Contact() {
    }

    public Contact(Integer cid, String fname, String lname, String group, String phone, String email, String address, byte[] pic, int uid) {
        this.cid = cid;
        this.fname = fname;
        this.lname = lname;
        this.group = group;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.pic = pic;
        this.uid = uid;
    }

    public int getCid() {
        return cid;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getGroup() {
        return group;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public byte[] getPic() {
        return pic;
    }

    public int getUid() {
        return uid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPic(byte[] pic) {
        this.pic = pic;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
    
    
}
