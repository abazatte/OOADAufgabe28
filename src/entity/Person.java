package entity;

public class Person {
    private String name;
    private PolitischEnum politischEnum;
    private ProtegiertEnum protegiertEnum;

    private boolean ruhestand;
    public Person() {
        ruhestand = false;
    }

    public Person(String name) {
        this.name = name;
        this.protegiertEnum = ProtegiertEnum.ergeben;
        this.politischEnum = PolitischEnum.loyal;
    }

    public boolean aktiv() {
        return !ruhestand;
    }

    public void parteilob() {
        switch (politischEnum){
            case loyal -> politischEnum = PolitischEnum.kriechend;
            case rebellisch -> politischEnum = PolitischEnum.loyal;
        }
    }

    public void parteitadel() {
        switch(politischEnum){
            case loyal, kriechend -> politischEnum = PolitischEnum.rebellisch;
        }
    }

    public void wirtschaftslob() {
        switch (protegiertEnum){
            case hoerig:
                this.protegiertEnum = ProtegiertEnum.Aufsichtsrat;
                break;
            case ergeben:
                this.protegiertEnum = ProtegiertEnum.hoerig;
                break;
            case neutral:
                this.protegiertEnum = ProtegiertEnum.rehabilitiert;
                break;
            case rehabilitiert:
                this.protegiertEnum = ProtegiertEnum.ergeben;
                break;
        }
    }

    public void erwischt() {
        setRuhestand(true);
    }

    public void wirtschaftskritik(){
        //politisch enum wird rausgelassen, da es nichts macht
        switch (protegiertEnum){
            case hoerig, ergeben, rehabilitiert -> protegiertEnum = ProtegiertEnum.neutral;
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public boolean isRuhestand() {
        return ruhestand;
    }

    public void setRuhestand(boolean ruhestand) {
        this.ruhestand = ruhestand;
    }
}
