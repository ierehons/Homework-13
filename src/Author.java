import java.util.Objects;

public class Author {
    private String name;
    private String lastname;

    public Author(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;

    }

    @Override
    public String toString() {
        return  name + " " +lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return name.equals(author.name) && lastname.equals(author.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname);
    }
}
