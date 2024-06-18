import java.sql.Date;

public class Player {
    private final int id;
    private final String name;
    private final String nationality;
    private final Date birthDate;
    private final int titles;

    public Player(int id, String name, String nationality, Date birthDate, int titles) {
        super();
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        this.birthDate = birthDate;
        this.titles = titles;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getNationality() {
        return nationality;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    public int getTitles() {
        return titles;
    }

}
