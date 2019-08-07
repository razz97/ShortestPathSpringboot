package net.ddns.alexraspberry.trains.beans.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.ddns.alexraspberry.trains.model.Result;
import net.ddns.alexraspberry.trains.model.Town;
import net.ddns.alexraspberry.trains.persistance.IDao;

@Service
@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
public class RESTController {

	@Autowired
	private IDao dao;
	
	@GET
	@Path("/towns")
	public List<Town> getAll() {
		return dao.getTowns();
	}
	
	@GET
	@Path("/route/{query}")
	public Result getResult() {
		
		
		return null;
	}
	
}