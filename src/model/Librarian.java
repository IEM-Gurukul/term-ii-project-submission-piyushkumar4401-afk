package model;

public class Librarian extends User {

    public Librarian(int id, String name) {
        super(id, name);
    }

    @Override
    public void displayRole() {
        System.out.println("Librarian User");
    }
}
