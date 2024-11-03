package Model;

public class FL {
    private String ern_fl;
    private String snils;
    private String fl_id;

    public FL(String ern_fl, String snils) {
        this.ern_fl = ern_fl;
        this.snils = snils;
        this.fl_id = fl_id;
    }

    public String getErn_fl() {
        return ern_fl;
    }

    public void setErn_fl(String ern_fl) {
        this.ern_fl = ern_fl;
    }

    public String getSnils() {
        return snils;
    }

    public void setSnils(String snils) {
        this.snils = snils;
    }

    public void setFl_id(String fl_id) {
        this.fl_id = fl_id;
    }

    public String getFl_id() {
        return fl_id;
    }
}
