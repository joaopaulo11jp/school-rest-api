package io.github.joaopaulo11jp.school.resources.students.handlers;

import java.util.UUID;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

public interface UpdateStudentHandler {
	
	void handler(UUID id, DTO dto);
	
	@Schema(name = "Student update data", description = "student's data to update")
	static class DTO {
		
		@Schema(description = "student's name", required = true, example="Daniel Combs")
		private String name;
		
		@Schema(description = "student's birth date", required = true, example="31/01/1995")
		private String birthDate;
		
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
