package org.sriram.rest.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.sriram.rest.messenger.database.DatabaseClass;
import org.sriram.rest.messenger.model.Comment;
import org.sriram.rest.messenger.model.Message;

public class CommentService {
	private Map<Long, Message> messages = DatabaseClass.getMessages();

	public List<Comment> getAllComments(long messageId) {
		Map<Long, Comment> comments = messages.get(messageId).getComments();
		return new ArrayList<Comment>(comments.values());

	}

	public Comment getComment(long messageId, long commentId) {
		//return messages.get(messageId).getComments().get(commentId);
	
 /*  WebApplication  Exception Demo (instead of separate datanotfoundexception mapper)*/
 	org.sriram.rest.messenger.model.ErrorMessage errorMessage = new org.sriram.rest.messenger.model.ErrorMessage(
				"Not Found", 404, "http://localhost:8080/messenger/webapi/messages");
		Response response = Response.status(Status.NOT_FOUND).entity(errorMessage).build();
		Message message = messages.get(messageId);
		if (message == null) {
			throw new WebApplicationException(response);
		}
		Map<Long, Comment> comments = messages.get(messageId).getComments();
		Comment comment = comments.get(commentId);
		if (comment == null) {
			throw new WebApplicationException(response);
		}
		return comment;

	}

	public Comment addComment(long messageId, Comment comment) {
		Map<Long, Comment> comments = messages.get(messageId).getComments();
		comment.setId(comments.size() + 1);
		comments.put(comment.getId(), comment);
		return comment;
	}

	public Comment updateComment(long messageId, Comment comment) {
		Map<Long, Comment> comments = messages.get(messageId).getComments();
		if (comment.getId() < 0)
			return null;
		else {
			comments.put(comment.getId(), comment);
			return comment;
		}
	}

	public Comment removeComment(long messageId,long CommentId) {
		Map<Long, Comment> comments = messages.get(messageId).getComments();
		return comments.remove(CommentId);
	}
}
