package edu.psu.swe.scim.spec.protocol;

import io.swagger.annotations.Api;

import javax.ws.rs.Path;

import edu.psu.swe.scim.spec.resources.ScimGroup;

//@formatter:off
/**
* From SCIM Protocol Specification, section 3, page 9
* 
* @see <a href="https://tools.ietf.org/html/rfc7644#section-3.2">Scim spec section 3.2</a>
* 
* Resource Endpoint         Operations             Description
 -------- ---------------- ---------------------- --------------------
 Group    /Groups          GET (Section 3.4.1),   Retrieve, add,
                           POST (Section 3.3),    modify Groups.
                           PUT (Section 3.5.1),
                           PATCH (Section 3.5.2),
                           DELETE (Section 3.6)

* @author chrisharm
*
*/
//@formatter:on

@Path("Groups")
@Api("SCIM")
public interface GroupResource extends BaseResourceTypeResource<ScimGroup> {

}
