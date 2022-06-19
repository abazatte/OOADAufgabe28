package entity;

public class Person {
    private String name;
    private PolitischEnum politischEnum;
    private ProtegiertEnum protegiertEnum;
    private boolean ruhestand;

    public Person() {
        this.name = "ROIDS - rudo";
        this.ruhestand = false;
        this.protegiertEnum = ProtegiertEnum.ergeben;
        this.politischEnum = PolitischEnum.loyal;
    }

    public Person(String name) {
        this.name = name;
        this.ruhestand = false;
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
        this.ruhestand = true;

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

    public void ausgabe(){
        System.out.println(toString());
    }

    @Override
    public String toString(){
        if (ruhestand){
            return "RUHESTAND";
        }
        StringBuilder bob = new StringBuilder();
        bob.append("POLISTISCH_AKTIV ");
        switch (politischEnum){
            case kriechend -> bob.append("KRIECHEND ");
            case loyal -> bob.append("LOYAL ");
            case rebellisch -> bob.append("REBELLISCH ");
        }
        bob.append("PROTEGIERT ");
        switch (protegiertEnum){
            case rehabilitiert -> bob.append("REHABILITIERT ");
            case ergeben -> bob.append("ERGEBEN ");
            case hoerig -> bob.append("HOERIG ");
            case Aufsichtsrat -> bob.append("AUFSICHTSRAT ");
            case neutral -> bob.append("NEUTRAL ");
        }

        return bob.toString();
    }
}
