package model.interfaces;

public interface ILoginable {

    boolean changeUserName(String username, String newUserName);

    boolean changePassword(String oldPasswort, String newPassword);

    void deleteAccount();

}
