package org.sriram.rest.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.sriram.rest.messenger.model.Comment;
import org.sriram.rest.messenger.service.CommentService;

@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CommentResource {

	CommentService commentService = new CommentService();

	@GET
	public List<Comment> getAllcomments(@PathParam("commentId") long id) {
		return commentService.getAllComments(id);
	}
	
	@GET
	@Path("/{commentId}")
	public Comment getComment(@PathParam("messageId") long id,
			@PathParam("commentId")  long commentId)
	{
		return commentService.getComment(id, commentId);
				
	}
	
	@POST
	public Comment addComment(@PathParam("messageId") long id,Comment comment) {

		// return "sriram_add_comment";
		return commentService.addComment(id, comment);
	}

	@PUT
	@Path("/{commentId}")
	public Comment updateComment(@PathParam("messageId") long messageId,@PathParam("commentId") long commentId, Comment comment) {

		// return "sriram_add_comment";
		comment.setId(commentId);
		return commentService.updateComment(messageId,comment);
	}

	@DELETE
	@Path("/{commentId}")
	public Comment removeComment(@PathParam("messageId") long messageId,@PathParam("commentId") long id) {
		return commentService.removeComment(messageId, id);
	}
}
