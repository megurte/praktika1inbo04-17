public class Author {

    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return getName()+ " (" + getGender() + ") at " + getEmail();
    }
}





import java.util.Scanner;

public class AuthorTest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter email: ");
        String email=s.nextLine();
        Author a = new Author("Edgar", "default", 'm');
        a.setEmail(email);
        System.out.println(a.toString());
    }
}
