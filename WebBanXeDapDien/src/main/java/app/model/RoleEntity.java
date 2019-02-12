package app.model;
import java.io.Serializable;
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



}
