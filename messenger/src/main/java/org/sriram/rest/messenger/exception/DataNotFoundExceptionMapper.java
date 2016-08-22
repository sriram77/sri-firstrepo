package org.sriram.rest.messenger.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;


@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException> {

	@Override
	public Response toResponse(DataNotFoundException ex) {
		org.sriram.rest.messenger.model.ErrorMessage errorMessage= new org.sriram.rest.messenger.model.ErrorMessage(ex.getMessage(), 404,"http://localhost:8080/messenger/webapi/messages");
		return Response.status(Status.NOT_FOUND)
				.entity(errorMessage).build();
	}

}
