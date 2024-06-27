public abstract class Persona {

    private String name;
    private String lastName;

    public Persona (String name, String lastName) {

        setName(name);
        setLastName(lastName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
