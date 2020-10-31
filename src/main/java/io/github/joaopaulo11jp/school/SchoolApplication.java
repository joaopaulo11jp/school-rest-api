package io.github.joaopaulo11jp.school;

import javax.ws.rs.core.Application;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.info.License;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@OpenAPIDefinition(
	    tags = {
	            @Tag(name="Teachers"),
	            @Tag(name="Students")
	    },
	    info = @Info(
	        title="School API",
	        version = "1.0.0-SNAPSHOT",
	        contact = @Contact(
	            name = "João Paulo",
	            url = "http://joaopaulo.github.io",
	            email = "joaopaulo11jp@gmail.com"),
	        license = @License(
	            name = "Apache 2.0",
	            url = "http://www.apache.org/licenses/LICENSE-2.0.html"))
	)
public class SchoolApplication extends Application {
//There's no functional need to use the JAX-RS Application class here on quarkus
//but for documenting reasons to follow the openapi microprofile's specification
}
