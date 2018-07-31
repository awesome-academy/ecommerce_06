package app.model;

import java.io.Serializable;
import java.util.Objects;

public class RoleEntity implements Serializable {
    private byte Id;
    private String Name;

    public byte getId() {
        return Id;
    }

    public void setId(byte id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoleEntity that = (RoleEntity) o;
        return Id == that.Id &&
                Objects.equals(Name, that.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, Name);
    }
}
