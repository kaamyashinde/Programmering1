public class Arrangement {
    private int arrNum = 0;
    private String arrName;
    private String arrPlace;
    private String arrRes;
    private String arrType;
    private double arrTime; //200210301800 er 2002 30. oktober kl 1800


    public Arrangement(int arrNum, String arrName, String arrPlace, String arrRes, String arrType, double arrTime) {
        this.arrNum = arrNum;
        this.arrName = arrName;
        this.arrPlace = arrPlace;
        this.arrRes = arrRes;
        this.arrType = arrType;
        this.arrTime = arrTime;
    }

    //get-methods:
    public int getArrNum() {
        return arrNum;
    }

    public String getArrName() {
        return arrName;
    }

    public String getArrPlace() {
        return arrPlace;
    }

    public String getArrRes() {
        return arrRes;
    }

    public String getArrType() {
        return arrType;
    }

    public double getArrTime() {
        return arrTime;
    }
    public String getArrDate(){
        String tid = String.format("%.1f", this.getArrTime());
        return tid.substring(0, 4) + "." + tid.substring(4, 6) + "." + tid.substring(6, 8);
    }

    @Override
    public String toString() {
        String tid = String.format("%.1f", this.getArrTime());
        String datoTid = tid.substring(6, 8) + "." + tid.substring(4, 6) + "." + tid.substring(0, 4) + " kl. " + tid.substring(8, 10) + ":" + tid.substring(10, 12);
        return "Arrangement Id: " + this.getArrNum() + ", Name of the Arrangement: " + this.getArrName() + "\n" + "Place: " + this.getArrPlace() + ", Host: " + this.getArrRes() + "Type: " + this.getArrType() + "\n" + "Date and Time: " + datoTid + "\n" + "-----------------------------------------------";
    }
}


