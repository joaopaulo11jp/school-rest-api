package io.github.joaopaulo11jp.school.resources.students.handlers;

import java.util.UUID;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

public interface RetrieveStudentHandler {
	
	DTO handler(UUID id);
	
	@Schema(name = "Student's data", description = "student's data")
	static class DTO {
		
		@Schema(required = true, example="Daniel Combs")
		private String id;		
		
		@Schema(description = "student's name", required = true, example="Daniel Combs")
		private String name;
		
		@Schema(description = "student's birth date", required = true, example="31/01/1995")
		private String birthDate;
		
		@Schema(description = "student's national id", required = true, example="11122233344")
		private String nationalId;
		
		@Schema(description = "student's phone number", example = "83996159668")
		private String phoneNumber;
		
		@Schema(description = "student's e-mail", example="johnsparrow@hisemailprovider.com")
		private String email;
		
		public DTO() {}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getBirthDate() {
			return birthDate;
		}

		public void setBirthDate(String birthDate) {
			this.birthDate = birthDate;
		}

		public String getNationalId() {
			return nationalId;
		}

		public void setNationalId(String nationalId) {
			this.nationalId = nationalId;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

	}

}
