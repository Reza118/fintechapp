package reza.job.assess.capgemini.fintechapp.enums;

public enum EndPointsEnum {

    OpenAccount_EndPoint("/openaccount/"), UserInformation_EndPoint("/userinformation/");

    private String val;

    EndPointsEnum(String value) {
        this.val = value;
    }

    public String toString(){
        return this.val;
    }
}
