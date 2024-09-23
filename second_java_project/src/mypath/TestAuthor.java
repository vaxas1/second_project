package mypath;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Pavel","pavel2004@gmail.com", 'M');
        System.out.println("Name: " + a1.getName());
        System.out.println("Email: " + a1.getEmail());
        System.out.println("Gender: " + a1.getGender());
        a1.setEmail("pavlik2004@gmail.com");
        System.out.println(a1.toString());
    }
}
