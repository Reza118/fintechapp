package reza.job.assess.capgemini.fintechapp.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum EndPointsEnum {

    OpenAccount_EndPoint(EndpointConstants.ep_openAccount),
    UserInformation_EndPoint(EndpointConstants.ep_userInfo);

    @Getter
    private final String value;

    public static class EndpointConstants {
        public static final String ep_openAccount = "/openaccount";
        public static final String ep_userInfo = "/userinformation";
        public static final String ep_txns = "/accounttxn";
        public static final String pathvar_account = "account";
        public static final String pathvar_custID = "customerID";
        public static final String pathvar_initcredit = "initialCredit";
    }
}
