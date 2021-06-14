package thedevconf.jaxrs.ui;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import thedevconf.jaxrs.Configuration;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import static javax.ws.rs.core.MediaType.TEXT_PLAIN;

@Path("")
public class IndexTemplate extends BaseResource {


    @Inject
    Template index;

    @Inject
    Template login;

    @Inject
    Template confirmation;

    @Inject
    Template userArea;

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get() {
        return instanceOf(index);
    }


    @GET
    @Path("login")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance getLogin() {
        return instanceOf(login);
    }

    @GET
    @Path("confirmation")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance getConfirmation() {
        return instanceOf(confirmation);
    }

    @GET
    @Path("user-area")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance getUserArea() {
        return instanceOf(userArea);
    }
}