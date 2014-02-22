/**
 * Created by Admin on 02.02.14.
 */
public class Train {
    private String name;
    private String type;
    private Vagon[] vagons;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Vagon[] getVagons() {
        return vagons;
    }

    public void setVagons(Vagon[] vagons) {
        this.vagons = vagons;
    }
    public void delEmptyVagons(){
        for (int i = 0; i < getVagons().length; i++) {
            if(getVagons()[i].getPassengers().length == 0){
                vagons[i] = null;

            }

        }

    }
    public Vagon[] overfilledVagons(){
        Vagon[] ofv = new Vagon[5];

            for (int i = 0; i < getVagons().length ; i++) {
                if(getVagons()[i] != null){
                     if(getVagons()[i].getPassengers().length > getVagons()[i].getMaxPass()){
                     ofv[i] = getVagons()[i];
                    }
                }

        }
        return ofv;
    }

//    public void balancePassangers(){
//        for (int i = 0; i < getVagons().length ; i++) {
//            if(getVagons()[i] != null){
//                if(getVagons()[i].getPassengers().length > getVagons()[i].getMaxPass()){
//                    setVagons()[i];
//                }
//
//                }
//            }
//
//    }
}
