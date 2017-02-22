package com.arpan.graph;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class test {
	public static enum MedicaidDenialReasonEnum {
		DEN_INCARCERATED("DENMED01", "Individual is incarcerated."), 
		DEN_DECEASED("DENMED02", "Our records indicate that this person is deceased."),
		DEN_SSA_DECEASED("DENMED10", "Deceased based on data match."),
		DEN_MASSHLTH("DENMED03", "Individual is enrolled in MassHealth."),
		DEN_NO_HOUSEHOLD("DENMED04", "Individual has no medicaid household"),
		DEN_NOT_A_RESIDENT("DENMED05", "Individual is not a resident"),
		DEN_INCOME("DENMED06", "Individual's medicaid household income is high"),
		DEN_TIME_CLOCK_EXPIRATION("DENMED07", "Individual's verification for information failed"),
		DEN_PA_TIME_CLOCK_EXPIRATION("DENMED73", "Failed to enroll in ESI"),
		DEN_POST_PARTUM_EXPIRATION("DENMED08", "Individual post partum duration is over"),
		DEN_ADMIN_CLOSURE("DENMED09", "Individual has been administrative closed"),
		DEN_NOT_LIVE_HOH("DENMED", "Individual is does not live with HOH."),
		DEN_NOT_RETURN_RNEWAL_FORM("DENMED13", "The person did not return the renewal form."),
		//Admin Closure Reasons
		TERMED11("TERMED11", "10 - Receiving benefits in another state"),
		TERMED04("TERMED04", "38 - Voluntary Withdrawal" ),
		TERMED07("TERMED07", "48 - Not a resident of Massachusetts"),
		TERMED08("TERMED08", "49 - Deceased"),
		TERMED14("TERMED14", "50 - Whereabouts Unknown"),
		TERMED14_1("TERMED14", "50 - Whereabouts Unknown"),
		TERMED15("TERMED15", "58 - Failed to cooperate with Quality Assurance"),
		TERMED10("TERMED10", "12 - No longer in household"),
		TERMED17("TERMED17", "33 - Already receiving MassHealth"),
		TERMED18("TERMED18", "46 - Entered penal institution"),
		TERMED19("TERMED19", "73 - Member did not enroll in employer sponsored health insurance"),
		TERMED16("TERMED16", "86 - Failure to pay MH premium"),
		TERMED20("TERMED20", "S1 - Member is age 65 or older"),
		TERMED21("TERMED21", "S2 - Receiving benefits in another state but eligible for QHP"),
		TERMED22("TERMED22", "S3 - Entered penal institution but eligible for QHP"),
		TERMED23("TERMED23", "S4 - Not a resident of Massachusetts but eligible for QHP"),
		TERMED24("TERMED24", "S6 - Entered penal institution based on data match"),
		TERMED25("TERMED25", "S7 - Deceased based on data match"),
		TERMED13("TERMED13", "The person did not return the renewal form."),
		TERMEDA1("TERMEDA1", "A1 - Failure to respond to data match"),
		TERMEDA2("TERMEDA2", "A2 - Failure to return a Job Update form"),
		TERMEDA3("TERMEDA3", "A3 - Failure to cooperate with a health insurance investigation"),
		TERMEDA5("TERMEDA5", "A5 - Duplicate case");
		
		private String reasonCode;

		private String reasonDescription;

		private MedicaidDenialReasonEnum(String reasonCode,
				String reasonDescriptions) {
			this.reasonCode = reasonCode;
			this.reasonDescription = reasonDescriptions;
		}

		public String getReasonDescription() {
			return this.reasonDescription;
		}

		public String getReasonCode() {
			return this.reasonCode;
		}
		
		public static MedicaidDenialReasonEnum getDenialReasonByDenialCode(String denialCode){
			 if(Arrays.asList(MedicaidDenialReasonEnum.values()).stream().filter(denialReason -> denialReason.getReasonCode().equals(denialCode)).count()>0){
				return null;
			}else{
				return Arrays.asList(MedicaidDenialReasonEnum.values()).stream().filter(denialReason -> denialReason.getReasonCode().equals(denialCode)).findFirst().get(); 
			}
		}
	


	private static MedicaidDenialReasonEnum getMedicaidDenialReason(){
		return MedicaidDenialReasonEnum.getDenialReasonByDenialCode("ARPAN");
	}


}
	public static void main(String[] args) {
		boolean s=false;
		s=Boolean.TRUE;
		System.out.println(s);
	}
}