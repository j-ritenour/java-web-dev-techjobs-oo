package org.launchcode.techjobs_oo;

public class Job {
    private int id;
    private static int nextId = 1;

    //FIRST CONSTRUCTOR THAT SETS UNIQUE ID
    public Job() {
        id = nextId;
        nextId++;
    }
   private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    //SECOND CONSTRUCTOR CALLS FIRST CONSTRUCTOR & INITIALIZES ID FIELD, INITIALIZES OTHER FIVE FIELDS

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;

    }

    //GETTERS AND SETTERS FOR EVERYTHING EXCEPT ID AND NEXTID
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    //GETTER FOR ID FIELD
    public int getId() {
        return id;
    }
   // EQUALS AND HASHCODE
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Job job = (Job) object;
        return id == job.id;
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), id);
    }

    @Override
    public String toString() {

        if (this.getEmployer().getValue().equals("")) {
           employer.value = "Data not available";
        } else {
            employer.value = this.getEmployer().getValue();
        }
        if(this.getName().equals("")){
            name = "Data not available";
        }
        else {
            name = this.getName();
        }
        if(this.getLocation().getValue().equals("")) {
            location.value = "Data not available";
        } else{
            location.value = this.getLocation().getValue();
        }
        if(this.getPositionType().getValue().equals("")){
            positionType.value = "Data not available";
        } else{
            positionType.value = this.getPositionType().getValue();
        }
        if(this.getCoreCompetency().getValue().equals("")){
            coreCompetency.value ="Data not available";
        } else{
            coreCompetency.value = this.getCoreCompetency().getValue();
        }
        if (name != null || employer != null || location != null || positionType != null || coreCompetency != null) {
            return "\n" +

                    "ID: " + id +
                    "\n" +
                    "Name: " + name +
                    "\n" +
                    "Employer: " + employer +
                    "\n" +
                    "Location: " + location +
                    "\n" +
                    "Position Type: " + positionType +
                    "\n" +
                    "Core Competency: " + coreCompetency +
                    "\n"
                    ;
        } else { return "OOPS! This job does not seem to exist.";}
    }


    // TODONE: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODONE: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODONE: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
