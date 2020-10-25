package io.github.joaopaulo11jp.school.resources.teachers.handlers;

import java.time.LocalDate;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

@ApplicationScoped
public class UpdateTeacherHandler {
	
	public void handle(DTO dto) {
		//TODO Implement it!
		//transform
		//validate
		//persist
	}
	
	@Schema(name = "Teacher Update", description = "Teacher's data to update")
	public static class DTO {
		
		@Schema(description = "teacher's name", required = true, example="John Sparrow")
		private String name;
		
		@Schema(description = "teacher's birth date in dd/MM/yyyy", required = true, example="31/01/1995")
		private String birthDate;
		
		@Schema(description = "teacher's phone number", example = "83996159668")
		private String phoneNumber;
		
		@Schema(description = "teacher's e-mail", example="johnsparrow@hisemailprovider.com")
		private String email;
		
		public DTO() {}
		
		public String getName() {
			return name;
		}

		public String getBirthDate() {
			return birthDate;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public String getEmail() {
			return email;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setBirthDate(String birthDate) {
			this.birthDate = birthDate;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		
		
	}
}
