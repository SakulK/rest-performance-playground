package sakulk;
	
import javax.ws.rs.*;

@Path("/")
public class PowerResource {

	@GET
	@Path("/power/{base}/{exp}")
	@Produces("application/json; charset=UTF-8")
	public Result power(@PathParam("base") int base, @PathParam("exp") int exp) {
		return new Result((int)Math.pow(base, exp));
	}
}