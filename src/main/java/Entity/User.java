package Entity;

public class User {
    private int user_id;
    private String first_name;
    private String last_name;
    private String email;
    private String password;
    private int access_level;
    private String creation_date;
    private int account_status;
    private String user_name;
    private int otp;

    private String security_question;
    private String security_answer;

    //Constructor
    public User(String first_name,String last_name, String email, String password, int access_level,int account_status, String user_name ){
    this.first_name = first_name;
    this.last_name = last_name;
    this.email = email;
    this.password = password;
    this.access_level = access_level;
    this.account_status = account_status;
    this.user_name = user_name;

    }

    //Getters and Setters
    public int getUser_id(){return user_id;}
    public String getFirst_name(){return first_name;}
    public String getLast_name(){return last_name;}
    public String getEmail(){return email;}
    public String getPassword(){return password;}
    public int getAccess_level(){return access_level;}
    public String getCreation_date(){return creation_date;}
    public int getAccount_status(){return account_status;}
    public String getUser_name(){return user_name;}
    public int getOtp(){return otp;}

    public String getSecurity_question() {
        return security_question;
    }

    public String getSecurity_answer() {
        return security_answer;
    }
}
