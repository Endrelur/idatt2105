package ntnu.idatt2105.endretorstein.springtjener.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String name;
    LocalDate birthDate;

    public Author() {
    }

    public Author(Integer id, String name, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthdate() {
        return birthDate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthDate = birthDate;
    }

    @Override
    public int hashCode() {
        int hash = 2;
        hash = 33 * hash + Objects.hashCode(this.id);
        hash = 33 * hash + Objects.hashCode(this.name);
        hash = (int) (33 * hash + this.birthDate.toEpochDay());
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Author other = (Author) obj;
        if (!this.birthDate.equals(other.getBirthdate())) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Author{");
        sb.append("id=").append(this.id);
        sb.append(", name='").append(this.name);
        sb.append(", birthdate=").append(this.birthDate.toString());
        sb.append('}');
        return sb.toString();
    }
}
