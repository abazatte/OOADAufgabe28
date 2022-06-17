package entity;

public class Person {
    private String name;
    private PolitischEnum politischEnum;
    private ProtegiertEnum protegiertEnum;

    private boolean ruhestand;
    public Person() {}

    public Person(String name) {
        this.name = name;
    }

    public boolean aktiv() {
        return false;
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
    }

    public void erwischt() {
        switch(politischEnum)
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
