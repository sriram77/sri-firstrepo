package org.sriram.rest.messenger.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("/injectdemo")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class InjectDemoResource {
	
	@GET
	@Path("annotation")
	public String getParamsUsingAnnotations(@MatrixParam("param") String matrixParam,
			@HeaderParam("AuthenticateSessionId") String headerParam,
			@CookieParam("name") String cookieParam)
	{
		return "matrix param is : " + matrixParam + " header param is " + headerParam+ " cookie is " + cookieParam;	
	}
	
	@GET
	@Path("context")
	public String getParamUsingContext(@Context UriInfo uriInfo, @Context HttpHeaders headers)
	{
		String path= uriInfo.getAbsolutePath().toString();
		String cookies= headers.getCookies().toString();
		return "Path is : " + path
				 + "cookies are " + cookies
				 ;
	}

}
