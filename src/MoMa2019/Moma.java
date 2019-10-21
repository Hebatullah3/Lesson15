package MoMa2019;

public class Moma {

    String pieceName;
    String artType;
    int year;
    String artistName;
    String description;
    int id ;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Moma(int id) {
    }



    public Moma(int id , String pieceName, String artType, int year, String artistName, String description) {
        this.pieceName = pieceName;
        this.artType = artType;
        this.year = year;
        this.artistName = artistName;
        this.description = description;
        this.id =id;

    }


    public String getPieceName() {
        return pieceName;
    }

    public void setPieceName(String pieceName) {
        this.pieceName = pieceName;
    }

    public String getArtType() {
        return artType;
    }

    public void setArtType(String artType) {
        this.artType = artType;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String printArtPieces() {
        return this.id + " - " +this.pieceName + "  " + this.year + "\n";
    }

    public String printFullInfo(){
        return  this.id+ "\n"
                +"Title: "+this.pieceName + "\n"
                +"Type: "+this.artType +"\n"
                +"Artist: "+this.artistName+"\n"
                +"Year: "+this.year +"\n"
                +"Description: "+ this.description ;
    }
}

